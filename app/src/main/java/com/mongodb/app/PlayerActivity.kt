package com.mongodb.app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import io.realm.Realm
import io.realm.RealmList
import io.realm.kotlin.where
import io.realm.mongodb.functions.Functions
import io.realm.mongodb.sync.SyncConfiguration
import org.bson.Document
import java.util.*


class PlayerActivity : AppCompatActivity() {
    private var user = realmApp.currentUser()
    private var partition = "123"
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PlayerAdapter
    private lateinit var fab: FloatingActionButton
    private lateinit var backButton: Button
    override fun onStart() {
        super.onStart()
        user = realmApp.currentUser()

        if (user == null) {
            // if no user is currently logged in, start the login activity so the user can authenticate
            startActivity(Intent(this, LoginActivity::class.java))
        } else {

            title = "Follow Players"
            setUpRecyclerView()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        //Below 2 lines - Back button for this page supported by the toolbar in xml file
        setSupportActionBar(findViewById(R.id.tournament_menu))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.project_users_list)
        var bundle: Bundle? = intent.extras
        var userEmail= bundle!!.getString("EMAIL")
        backButton = findViewById(R.id.backbutton)
        backButton.setOnClickListener{
            val intent = Intent(Intent(this, NewProfile::class.java))
            intent.putExtra("EMAIL", userEmail.toString())
            startActivity(intent)
        }
        fab = findViewById(R.id.floating_action_button)
        // create a dialog to add a user by email when an item is clicked
        fab.setOnClickListener {
            val input = EditText(this)
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Enter user to follow:")
                .setCancelable(true)
                .setPositiveButton("Add User") { dialog, _ ->
                    dialog.dismiss()
                    // add follower
                    val functionsManager: Functions = realmApp.getFunctions(user)
                    functionsManager.callFunctionAsync(
                        "followPlayer",
                        listOf(input.text.toString()), // game name
                        Document::class.java

                    )
                    { result ->
                        if (result.isSuccess) {
                            Log.v(TAG(), "Attempted to add participant. Result: ${result.get()}")
                            setUpRecyclerView()
                        } else {
                            Log.e(TAG(), "failed to add participant with: " + result.error)
                            Toast.makeText(this, result.error.errorMessage, Toast.LENGTH_LONG).show()
                            setUpRecyclerView()
                        }
                    }
                }
                .setNegativeButton("Cancel") { dialog, _ ->
                    dialog.cancel()
                }
            val dialog = dialogBuilder.create()
            dialog.setView(input)
            dialog.setTitle("Follow player")
            dialog.show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        recyclerView.adapter = null
    }

    private fun setUpRecyclerView() {
        var config = SyncConfiguration.Builder(user, partition).build()
        // open the realm
        var realm = Realm.getInstance(config)
        //this.members = ArrayList(result.get().map { item -> Player(item as Document) })
        var bundle: Bundle? = intent.extras
        var userEmail= bundle!!.getString("EMAIL")
        var userQuery = realm.where<User>().equalTo("name",userEmail).findAll()
        val currentUser: User? = userQuery[0]
        var followingList = RealmList<String>()
        if (currentUser != null) {
            // get user's list of following
            followingList = currentUser.following
        }
        adapter = PlayerAdapter(followingList, user!!,config)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }
}

package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.GamesListActivity
import com.mongodb.app.games.NAME_GAME
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmResults
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration


class TournamentActivity : AppCompatActivity() {
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tournament)
        val toolbar = findViewById<View>(R.id.tournament_menu) as Toolbar
        setSupportActionBar(toolbar)


        recyclerView = findViewById(R.id.tournament_list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
    override fun onStart() {
        super.onStart()
        var currentGameName: String? = null
        var currentGameId: Long? = null
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentGameName = bundle.getString(NAME_GAME)
            currentGameId = bundle.getLong(GAME_ID)
        }

        val user = realmApp.currentUser()
        val partition = "123"
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@TournamentActivity.userRealm = realm
                recyclerView.adapter = TournamentAdapter(realm.where<Tournament>().equalTo("game", currentGameName).findAllAsync(), config, this@TournamentActivity, currentGameId)
            }
        })

    }

    /**
     * Destroys the User Realm when exiting the activity
     */
    override fun onDestroy() {
        super.onDestroy()
        userRealm.close()
        recyclerView.adapter = null
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.task_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {
            R.id.action_home -> {
                startActivity(Intent(this, GamesListActivity::class.java))
                true
            }
            else -> {
                super.onOptionsItemSelected(menuItem)
            }
        }
    }
}
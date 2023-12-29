package com.mongodb.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.NAME_GAME
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration

class MyRatingsActivity : AppCompatActivity() {
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rating_view)
        val toolbar = findViewById<View>(R.id.rating_menu) as Toolbar
        setSupportActionBar(toolbar)
        recyclerView = findViewById(R.id.rating_list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
    override fun onStart() {
        super.onStart()
        var currentEmail: String? = null
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentEmail = bundle.getString("EMAIL")
        }
        val user = realmApp.currentUser()
        val partition = "123"
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@MyRatingsActivity.userRealm = realm
                recyclerView.adapter = MyRatingsAdapter(realm.where<Rating>().equalTo("organizer", currentEmail).findAllAsync())
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
}

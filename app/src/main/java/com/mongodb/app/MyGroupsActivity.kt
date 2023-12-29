package com.mongodb.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration

class MyGroupsActivity : AppCompatActivity() {
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.group_page)

        recyclerView = findViewById(R.id.recycler_view)
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
                this@MyGroupsActivity.userRealm = realm
                recyclerView.adapter = MyGroupsAdapter(realm.where<Group>().findAllAsync())
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

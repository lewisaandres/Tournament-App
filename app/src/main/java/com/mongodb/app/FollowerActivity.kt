package com.mongodb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.RealmList
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration

class FollowerActivity : AppCompatActivity() {
    private var user = realmApp.currentUser()
    private var partition = "123"
    var config = SyncConfiguration.Builder(user, partition).build()

    // open the realm
    private var realm = Realm.getInstance(config)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower)

        var bundle: Bundle? = intent.extras
        var userEmail = bundle!!.getString("EMAIL")
        var userQuery = realm.where<User>().equalTo("name", userEmail).findAll()
        var tourneyQuery = RealmList<Tournament>()
        var tourneyListSize = userQuery[0]?.tournamentIn?.size?.minus(1)
        for (i in 0..tourneyListSize!!) {
            var oneTournamentQuery = realm.where<Tournament>().equalTo(
                "_id",
                userQuery[0]?.tournamentIn?.get(i)
            ).findFirst()
            tourneyQuery.add(oneTournamentQuery)
        }
    }
}
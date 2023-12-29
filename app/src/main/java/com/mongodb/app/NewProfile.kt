package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmList
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_new_profile.*

class NewProfile : AppCompatActivity() {
    private lateinit var profileName: TextView
    private lateinit var profileEmail: TextView
    private lateinit var follow: TextView
    private lateinit var tIn: Button
    private lateinit var tOwn: Button
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var rating: Button
    private lateinit var userLevel: TextView
    //temporary experience bar
    private var currentExperience = 35.0
    private var maxLevelExp = 100.0
    private var level = 1
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_profile)

        profileName = findViewById(R.id.tv_name)
        profileEmail = findViewById(R.id.profileEmail)
        tIn = findViewById(R.id.tournamentsIn)
        tOwn = findViewById(R.id.tournamentsOwn)
        follow = findViewById(R.id.following)
        rating = findViewById(R.id.viewRatings)

        val user = realmApp.currentUser()
        val partition = "123"

        rating.setOnClickListener{ toRatingsPage() }

        var bundle: Bundle? = intent.extras
        var userEmail= bundle!!.getString("EMAIL")
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@NewProfile.userRealm = realm
                //val realmResults = realm.where<User>().findAll()
//                var userEmail= bundle!!.getString("EMAIL")
                var userQuery = realm.where<User>().equalTo("name",userEmail).findAll()
                val currentUser: User? = userQuery[0]
                var followingList = RealmList<String>()
                if (currentUser != null) {
                    // get user's list of following
                    followingList = currentUser.following
                }
                follow.text = (followingList.size).toString()
            }
        })
        userLevel = findViewById(R.id.level)
        progressBar = findViewById(R.id.experienceBar)
        progressBar?.setProgress(currentExperience.toInt())
        progressBar?.setMax(maxLevelExp.toInt())


//        var bundle: Bundle? = intent.extras
//        var userEmail= bundle!!.getString("EMAIL")


        profileEmail.text = userEmail
        profileName.text = userEmail

        tOwn.setOnClickListener{
            showTournamentsOwn()
        }
        tIn.setOnClickListener{
            showTournamentsIn()
        }
        following.setOnClickListener{
            toFollowingPage()
        }
    }

    private fun toRatingsPage() {
        val intent = Intent(Intent(this, MyRatingsActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text)
        startActivity(intent)
    }
    private fun showTournamentsOwn() {
        val intent = Intent(Intent(this, TournamentsOwnActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text.toString())
        startActivity(intent)
    }
    private fun showTournamentsIn() {
        val intent = Intent(Intent(this, TournamentsInActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text.toString())
        startActivity(intent)
    }
    private fun toFollowingPage() {
        val intent = Intent(Intent(this, PlayerActivity::class.java))
        intent.putExtra("EMAIL", profileEmail.text.toString())
        startActivity(intent)
    }
}

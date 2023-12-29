package com.mongodb.app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_rating.*
import kotlinx.android.synthetic.main.suggestion_page.*

class RateOrganizerActivity : AppCompatActivity() {
    private lateinit var starRating: RatingBar
    private lateinit var organizer: TextView
    private lateinit var description: EditText
    private lateinit var submitButton: Button
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private var user: io.realm.mongodb.User? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
        starRating = findViewById(R.id.ratingBar)
        organizer = findViewById(R.id.organizer)
        organizer.text = "Chino"
        description = findViewById(R.id.description)
        submitButton = findViewById(R.id.submit)
        submitButton.setOnClickListener { (rateOrganizer()) }


    }
    /**
     * Creates Realm instance to able to read and write
     */
    override fun onStart() {
        super.onStart()

        val user = realmApp.currentUser()
        val partition = "123" //user.id
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@RateOrganizerActivity.userRealm = realm
            }
        })
    }

    /**
     * Destroys the User Realm when exiting the activity
     */
    override fun onDestroy() {
        super.onDestroy()
        userRealm.close()
    }

    private fun rateOrganizer() {
        val rate = Rating()

        rate.rating = starRating.rating
        rate.organizer = organizer.text.toString()
        rate.description = description.text.toString()

        userRealm.executeTransactionAsync { realm ->
            realm.insert(rate)
        }
        Toast.makeText(baseContext, "Submitted rating", Toast.LENGTH_LONG).show()
        startActivity(Intent(this,HomeActivity::class.java))
    }


}

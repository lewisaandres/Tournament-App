package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_new_profile.*

class EditProfileActivity : AppCompatActivity() {
    private lateinit var profileName: EditText
    private lateinit var profileEmail: EditText
    private lateinit var twitter: EditText
    private lateinit var fb: EditText
    private lateinit var save: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile_view)

        profileName = findViewById(R.id.tv_name)
        profileEmail = findViewById(R.id.profileEmail)
        twitter = findViewById(R.id.twit)
        fb = findViewById(R.id.fb)
        save = findViewById(R.id.save_button)
        save.setOnClickListener{
            startActivity(Intent(this, SettingsActivity::class.java))
        }


//        var bundle: Bundle? = intent.extras
//        var userEmail= bundle!!.getString("EMAIL")
//
//
//        profileEmail.text = userEmail
//        profileName.text = userEmail
    }

}

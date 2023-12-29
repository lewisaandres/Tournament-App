package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity: AppCompatActivity() {
    private lateinit var editProfileButton: Button
    private lateinit var changePasswordButton: Button
    private lateinit var helpButton: Button
    private lateinit var logoutButton: Button
    private lateinit var homeButton: Button
    private lateinit var settings: ImageView
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        editProfileButton = findViewById(R.id.button_edit_profile)
        editProfileButton.setOnClickListener {onEditProfileButtonClicked()}

        changePasswordButton = findViewById(R.id.button_change_pass)
        changePasswordButton.setOnClickListener { onChangePassButtonClicked() }

        helpButton = findViewById((R.id.button_help))
        helpButton.setOnClickListener { onHelpButtonClicked()}
        logoutButton = findViewById(R.id.button_logout)
        logoutButton.setOnClickListener {onLogoutClicked()}

//        homeButton = findViewById(R.id.home_button)
//        homeButton.setOnClickListener{
//            startActivity(Intent(this, HomeActivity::class.java))
//        }

        //Below 2 lines - Back button for this page supported by the toolbar in xml file
//        setSupportActionBar(findViewById(R.id.toolBar_Settings))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun onEditProfileButtonClicked() {
        startActivity(Intent(this, EditProfileActivity::class.java))

    }

    private fun onChangePassButtonClicked() {
        val intent = Intent(Intent(this, ChangePassActivity::class.java))
        val email = getIntent().getStringExtra("EMAIL")
        intent.putExtra("EMAIL", email)
        startActivity(intent)
    }

    private fun onHelpButtonClicked() {
        startActivity(Intent(this, ReportActivity::class.java))
    }

    private fun onBackButtonClicked() {
        startActivity(Intent(this, HomeActivity::class.java))
    }
    private fun onLogoutClicked() {
        realmApp.currentUser()?.logOutAsync {
            if (it.isSuccess) {
                Log.v(TAG(), "user logged out")
                startActivity(Intent(this, LoginActivity::class.java))

            } else {
                Log.e(TAG(), "log out failed! Error: ${it.error}")
            }
        }
    }
}

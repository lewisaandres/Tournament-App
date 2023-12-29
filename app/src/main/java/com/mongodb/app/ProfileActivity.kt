package com.mongodb.app


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

// TODO: Make level property for user to count level status
class ProfileActivity : AppCompatActivity() {
    private lateinit var profileView: ImageView
    private lateinit var playerName: TextView
    private lateinit var followingButton: Button
    private lateinit var giveXPButton: Button

    //temporary experience bar
    private var currentExperience = 0.0
    private var maxLevelExp = 100.0
    private var level = 1
    private var progressBar: ProgressBar? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.profile_view)

        //Below 2 lines - Back button for this page supported by the toolbar in xml file
        setSupportActionBar(findViewById(R.id.toolBar_ProfileActivity))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        profileView = findViewById((R.id.user_avatar_profile))
        playerName = findViewById((R.id.user_name))
        val email = getIntent().getStringExtra("EMAIL")
        //playerName.setText(email.toString())
        followingButton = findViewById((R.id.following))
        followingButton.setOnClickListener {
            // go to home page after back button is clicked
            startActivity(Intent(this, PlayerActivity::class.java))
        }

//        progressBar = findViewById(R.id.ExperienceBar)
//
//        giveXPButton = findViewById((R.id.GiveXP))
//        giveXPButton.setOnClickListener {onGiveXPButtonClicked()}



    }

    private fun onGiveXPButtonClicked(){
        currentExperience += 5;
        if(currentExperience > maxLevelExp || currentExperience == maxLevelExp){
            level ++
            currentExperience -= maxLevelExp
            var temp = maxLevelExp * 0.1
            maxLevelExp += temp
        }
        progressBar?.setProgress(currentExperience.toInt())
        progressBar?.setMax(maxLevelExp.toInt())
    }



}



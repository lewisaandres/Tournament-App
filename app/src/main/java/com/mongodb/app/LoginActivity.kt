package com.mongodb.app

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import io.realm.mongodb.Credentials
import android.widget.RemoteViews
/*
* LoginActivity: launched whenever a user isn't already logged in. Allows a user to enter email
* and password credentials to log in to an existing account or create a new account.
*/
class LoginActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    private lateinit var notifyButton: Button
    //notification
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"
    //notification


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_view)
        username = findViewById(R.id.input_username)
        password = findViewById(R.id.input_password)
        loginButton = findViewById(R.id.loginButton)
        registerButton = findViewById(R.id.registerButton)

        loginButton.setOnClickListener { logIn(false) }

        //to go to Register Activity page
        registerButton.setOnClickListener { toRegisterActivity() }

        //FOR TESTING PURPOSES(DELETE LATER) to go to Create Tournament Page
//
//        notifyButton = findViewById(R.id.buttonNotify)
        // it is a class to notify the user of events that happen.
        // This is how you tell the user that something has happened in the
        // background.
//        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // onClick listener for the button
//        notifyButton.setOnClickListener {
//
//            // pendingIntent is an intent for future use i.e after
//            // the notification is clicked, this intent will come into action
//            val intent = Intent(this, afterNotification::class.java)
//
//            // FLAG_UPDATE_CURRENT specifies that if a previous
//            // PendingIntent already exists, then the current one
//            // will update it with the latest intent
//            // 0 is the request code, using it later with the
//            // same method again will get back the same pending
//            // intent for future reference
//            // intent passed here is to our afterNotification class
//            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
//
//            // RemoteViews are used to use the content of
//            // some different layout apart from the current activity layout
//            val contentView = RemoteViews(packageName, R.layout.activity_after_notification)
//
//            // checking if android version is greater than oreo(API 26) or not
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                notificationChannel = NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
//                notificationChannel.enableLights(true)
//                notificationChannel.lightColor = Color.GREEN
//                notificationChannel.enableVibration(false)
//                notificationManager.createNotificationChannel(notificationChannel)
//
//                builder = Notification.Builder(this, channelId)
//                    .setContent(contentView)
//                    .setSmallIcon(R.drawable.ic_launcher_background)
//                    .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.drawable.ic_launcher_background))
//                    .setContentIntent(pendingIntent)
//            } else {
//
//                builder = Notification.Builder(this)
//                    .setContent(contentView)
//                    .setSmallIcon(R.drawable.ic_launcher_background)
//                    .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.drawable.ic_launcher_background))
//                    .setContentIntent(pendingIntent)
//            }
//            notificationManager.notify(1234, builder.build())
//        }//notifications






    }

    override fun onBackPressed() {
        // Disable going back to the MainActivity
        moveTaskToBack(true)
    }


    //Syntax for going to one activity to another activity
    private fun toRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }


    private fun onLoginSuccess() {
        // successful login ends this activity, bringing the user back to the project activity
        val intent = Intent(Intent(this, HomeActivity::class.java))
        val email = this.username.text.toString()
        intent.putExtra("EMAIL", email)
        startActivity(intent)

    }

    private fun onLoginFailed(errorMsg: String) {
        Log.e(TAG(), errorMsg)
        Toast.makeText(baseContext, errorMsg, Toast.LENGTH_LONG).show()
    }

    private fun validateCredentials(): Boolean = when {
        // zero-length usernames and passwords are not valid (or secure), so prevent users from creating accounts with those client-side.
        username.text.toString().isEmpty() -> false
        password.text.toString().isEmpty() -> false
        else -> true
    }

    // handle user authentication (login) and account creation
    private fun logIn(createUser: Boolean) {
        if (!validateCredentials()) {
            onLoginFailed("Invalid username or password")
            return
        }



        // while this operation completes, disable the buttons to login or create a new account

        loginButton.isEnabled = false

        val username = this.username.text.toString()
        val password = this.password.text.toString()


        if (createUser) {
            // register a user using the Realm App we created in the TaskTracker class
            // TODO: Register a new user with the supplied username and password when the "Create" button is pressed.
            realmApp.emailPassword.registerUserAsync(username, password) {
                // re-enable the buttons after user registration returns a result

                loginButton.isEnabled = true
                if (!it.isSuccess) {
                    onLoginFailed("Could not register user.")
                    Log.e(TAG(), "Error: ${it.error}")
                } else {
                    Log.i(TAG(), "Successfully registered user.")
                    // when the account has been created successfully, log in to the account
                    logIn(false)
                }
            }
        } else {
            // TODO: Log in with the supplied username and password when the "Log in" button is pressed.
            val creds = Credentials.emailPassword(username, password)
            realmApp.loginAsync(creds) {
                // re-enable the buttons after user login returns a result
                loginButton.isEnabled = true

                if (!it.isSuccess) {
                    onLoginFailed(it.error.message ?: "An error occurred.")
                } else {
                    onLoginSuccess()
                }
            }

        }

        // If user taps on the create user button, it will transition to the Create Account Register Page


    }


}
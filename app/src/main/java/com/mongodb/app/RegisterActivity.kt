package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


// : means extends just like in Java
class RegisterActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var confirmEmail: EditText
    private lateinit var email: EditText
    private lateinit var regButton: Button
    private lateinit var alreadyHaveAccountButton: Button

    /**
     * onCreate function responsible for creating this activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        username = findViewById(R.id.inputUsername)
        email = findViewById(R.id.inputEmail)
        confirmEmail = findViewById(R.id.inputConfirmEmail)
        password = findViewById(R.id.inputPassword)
        confirmPassword = findViewById(R.id.inputConfirmPassword)
        regButton = findViewById(R.id.buttonRegister)
        alreadyHaveAccountButton = findViewById(R.id.alreadyAccountButton)

        //Goes to Register page upon tapping on register button
        regButton.setOnClickListener { toRegister(true) }
        //Goes back to login page upon tapping on already have account button
        alreadyHaveAccountButton.setOnClickListener { toLoginActivity() }

        //Creating the back button for this page supported by the toolbar in xml file
        setSupportActionBar(findViewById(R.id.toolBar_registerActivity))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    /**
     * Goes to login activity page
     */
    private fun toLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    /**
     * Displays string whenever an event happens such as tapping on a button
     */
    private fun onDisplayMessage(message: String) {
        Log.e(TAG(), message)
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    /**
     * Checks in the input text area from user if it's empty or not
     */
    private fun validateNonEmptyInputs(): Boolean = when {
        // zero-length usernames and passwords are not valid (or secure), so prevent users from creating accounts with those client-side.
        username.text.toString().isEmpty() -> false
        email.text.toString().isEmpty() -> false
        confirmEmail.text.toString().isEmpty() -> false
        password.text.toString().isEmpty() -> false
        confirmPassword.text.toString().isEmpty() -> false
        else -> true
    }

    /**
     * To register new users using username, email, and password.
     * Checks if user is creating new user and then registers the user in the mongodb database
     */
    private fun toRegister(createUser: Boolean) {
        if (!validateNonEmptyInputs()) {
            onDisplayMessage("Cannot have zero characters.")
            return
        }

        //Checks if email and passwords are the same and if the input area is NOT empty
        val password = this.password.text.toString()
        val confirmPassword = this.confirmPassword.text.toString()
        val email = this.email.text.toString()
        val confirmEmail = this.confirmEmail.text.toString()

        regButton.isEnabled = false

        //Checks if both email and password match
        if (email != confirmEmail || password != confirmPassword || !validateNonEmptyInputs()) {
            onDisplayMessage("Email/Password does not match.")
        } else {
            realmApp.emailPassword.registerUserAsync(confirmEmail, confirmPassword) {
                // re-enable the buttons after user registration returns a result
                regButton.isEnabled = true
                if (it.isSuccess) {
                    onDisplayMessage("Could not register user.")
                    Log.e(TAG(), "Error: ${it.error}")
                } else {
                    onDisplayMessage("Successfully registered user.")
                    toLoginActivity()
                    Log.e(TAG(), "Success: ${it.isSuccess}")
                }
            }
        }
    }
}
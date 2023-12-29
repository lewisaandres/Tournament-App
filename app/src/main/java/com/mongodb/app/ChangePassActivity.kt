package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChangePassActivity: AppCompatActivity() {
    private lateinit var oldPassTextView: TextView
    private lateinit var newPassTextView: TextView
    private lateinit var confirmNewPassTextView: TextView
    private lateinit var confirmPasswordButton: Button
    private lateinit var cancelPasswordButton: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.change_password_view)
        oldPassTextView = findViewById(R.id.oldPassword)
        newPassTextView = findViewById(R.id.newPassword)
        confirmNewPassTextView = findViewById(R.id.confirmNewPassword)
        confirmPasswordButton = findViewById(R.id.button_confirm_change_pass)
        cancelPasswordButton = findViewById(R.id.button_cancel_change_pass)
        cancelPasswordButton.setOnClickListener {onCancelButtonClicked()}

        confirmPasswordButton.setOnClickListener {confirmPass()}

    }
    private fun onCancelButtonClicked() {
        startActivity(Intent(this, SettingsActivity::class.java))
    }
    private fun confirmPass() {
        val oldPass = this.oldPassTextView.toString()
        val newPass = this.newPassTextView.toString()
        val confirmNewPass = this.confirmNewPassTextView.toString()
        val email = getIntent().getStringExtra("EMAIL")
        val args = arrayOf("security answer 1", "security answer 2")
        realmApp.emailPassword.callResetPasswordFunctionAsync(email, newPass, args) {
            if (it.isSuccess) {
                Log.i("EXAMPLE", "Successfully reset the password for $email")
            } else {
                Log.e("EXAMPLE", "Failed to reset the password for $email: $it.error")
            }
        }
        Toast.makeText(baseContext, "Successfully changed password", Toast.LENGTH_LONG).show()
        startActivity(Intent(this, SettingsActivity::class.java))


    }
}
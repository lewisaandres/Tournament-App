package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class ReportActivity : AppCompatActivity() {
    lateinit var editTextMail: EditText
    lateinit var editTextSubject: EditText
    lateinit var editTextMessage: EditText
    lateinit var buttonSend: Button
    lateinit var buttonback: Button
    lateinit var email: String
    lateinit var subject: String
    lateinit var message: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        title = "Report User"

        editTextSubject = findViewById(R.id.subjectText)
        editTextMessage = findViewById(R.id.reportReason)
        buttonSend = findViewById(R.id.sendReport)
        buttonSend.setOnClickListener {
            getData()
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL, email)
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "message/rfc822"
            startActivity(Intent.createChooser(intent, "Select email"))

        }
        buttonback = findViewById(R.id.backButtonReport)
    }
    private fun getData() {
        email = "TeamRocketProject@protonmail.com"
        subject = editTextSubject.text.toString()
        message = editTextMessage.text.toString()
    }

}
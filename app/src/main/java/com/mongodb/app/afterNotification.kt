package com.mongodb.app

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ventura.bracketslib.model.CompetitorData


class afterNotification : AppCompatActivity() {
    private lateinit var notification: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_notification)
        notification = findViewById(R.id.notificationView)


    }
}
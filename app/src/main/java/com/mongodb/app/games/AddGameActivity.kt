package com.mongodb.app.games

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.mongodb.app.R
import io.realm.Realm
import io.realm.RealmConfiguration

const val GAME_NAME = "name"
const val GAME_DESCRIPTION = "description"

class AddGameActivity : AppCompatActivity() {
    private lateinit var addGameName: TextInputEditText
    private lateinit var addGameDescription: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_game_layout)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addGame()
        }
        addGameName = findViewById(R.id.add_game_name)
        addGameDescription = findViewById(R.id.add_game_description)
    }

    /* The onClick action for the done button. Closes the activity and returns the new game name
    and description as part of the intent. If the name or description are missing, the result is set
    to cancelled. */

    private fun addGame() {
        val resultIntent = Intent()

        if (addGameName.text.isNullOrEmpty() || addGameDescription.text.isNullOrEmpty()) {
            setResult(Activity.RESULT_CANCELED, resultIntent)
        } else {
            val name = addGameName.text.toString()
            val description = addGameDescription.text.toString()
            resultIntent.putExtra(GAME_NAME, name)
            resultIntent.putExtra(GAME_DESCRIPTION, description)
            setResult(Activity.RESULT_OK, resultIntent)
            startActivity(Intent(this,GamesListActivity::class.java))
        }
        finish()
    }
}

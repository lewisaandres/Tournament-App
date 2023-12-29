package com.mongodb.app.games

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

import com.mongodb.app.GameDetailViewModel
import com.mongodb.app.GameDetailViewModelFactory
import com.mongodb.app.R
import com.mongodb.app.TournamentActivity

class GameDetailActivity : AppCompatActivity() {

    private val gameDetailViewModel by viewModels<GameDetailViewModel> {
        GameDetailViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_detail_activity)

        var currentGameId: Long? = null
        var currentGameName: String? = null

        /* Connect variables to UI elements. */
        val gameName: TextView = findViewById(R.id.game_detail_name)
        val gameImage: ImageView = findViewById(R.id.game_detail_image)
        val gameDescription: TextView = findViewById(R.id.game_detail_description)
        val removeGameButton: Button = findViewById(R.id.remove_button)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentGameId = bundle.getLong(GAME_ID)
            currentGameName = bundle.getString(NAME_GAME)

        }

        /* If currentGameId is not null, get corresponding game and set name, image and
        description */
        currentGameId?.let {
            val currentGame = gameDetailViewModel.getGameForId(it)
            gameName.text = currentGame?.name
            if (currentGame?.image == null) {
                gameImage.setImageResource(R.mipmap.valorant_foreground)
            } else {
                gameImage.setImageResource(currentGame.image)
            }
            gameDescription.text = currentGame?.description

            removeGameButton.setOnClickListener {
                val intent = Intent(this, TournamentActivity()::class.java)
                intent.putExtra(NAME_GAME, currentGameName)
                intent.putExtra(GAME_ID, currentGameId)
                startActivity(intent)
                finish()
            }
        }

    }
}
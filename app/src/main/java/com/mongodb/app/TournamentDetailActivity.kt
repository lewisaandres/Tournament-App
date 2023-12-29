package com.mongodb.app

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.NAME_GAME

class TournamentDetailActivity : AppCompatActivity() {
    private lateinit var tournamentName: TextView
    private lateinit var tournamentDate: TextView
    private lateinit var prizePool: TextView
    private lateinit var joinButton: Button
    private lateinit var gameImage: ImageView

    private val gameDetailViewModel by viewModels<GameDetailViewModel> {
        GameDetailViewModelFactory(this)
    }

    @SuppressLint("SetTextI18n")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tournament_detail_view)
        tournamentName = findViewById(R.id.tournament_name)
        tournamentDate = findViewById(R.id.tournament_date)
        prizePool = findViewById(R.id.prize_pool)
        joinButton = findViewById(R.id.join_button)
        gameImage = findViewById(R.id.game_image)

        var currentGameId: Long? = null
        var tDate: String? = null
        var tName: String? = null
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentGameId = bundle.getLong(GAME_ID)
            tDate = bundle.getString("DATE")
            tName = bundle.getString("NAME")
            tournamentDate.text = "When:$tDate"
            tournamentName.text = tName

        }

        /* If currentGameId is not null, get corresponding game and set name, image and
        description */
        currentGameId?.let {
            val currentGame = gameDetailViewModel.getGameForId(it)
            if (currentGame?.image == null) {
                gameImage.setImageResource(R.mipmap.valorant_foreground)
            } else {
                gameImage.setImageResource(currentGame.image)
            }
        }
    }
}
package com.mongodb.app.games

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.R

const val GAME_ID = "game id"
const val NAME_GAME = "game name"

class GamesListActivity : AppCompatActivity() {
    private val newGameActivityRequestCode = 1
    private val gamesListViewModel by viewModels<GamesListViewModel> {
        GamesListViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        /* Instantiates headerAdapter and gamersAdapter. Both adapters are added to concatAdapter.
        which displays the contents sequentially */
        val headerAdapter = GamesHeaderAdapter()
        val gamesAdapter = GamesAdapter { game -> adapterOnClick(game) }
        val concatAdapter = ConcatAdapter(headerAdapter, gamesAdapter)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = concatAdapter

        gamesListViewModel.gameLiveData.observe(this, {
            it?.let {
                gamesAdapter.submitList(it as MutableList<Game>)
                headerAdapter.updateGameCount(it.size)
            }
        })

//        val fab: View = findViewById(R.id.fab)
//        fab.setOnClickListener {
//            fabOnClick()
//        }
    }

    /* Opens GameDetailActivity when RecyclerView item is clicked. */
    private fun adapterOnClick(game: Game) {
        val intent = Intent(this, GameDetailActivity()::class.java)
        intent.putExtra(GAME_ID, game.id)
        intent.putExtra(NAME_GAME, game.name)
        startActivity(intent)
    }

//    /* Adds game to gameList when FAB is clicked. */
//    private fun fabOnClick() {
//        val intent = Intent(this, AddGameActivity::class.java)
//        startActivityForResult(intent, newGameActivityRequestCode)
//    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

        /* Inserts game into viewModel. */
        if (requestCode == newGameActivityRequestCode && resultCode == Activity.RESULT_OK) {
            intentData?.let { data ->
                val gameName = data.getStringExtra(GAME_NAME)
                val gameDescription = data.getStringExtra(GAME_DESCRIPTION)

                gamesListViewModel.insertGame(gameName, gameDescription)
            }
        }
    }
}
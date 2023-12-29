package com.mongodb.app

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mongodb.app.games.Game
import com.mongodb.app.games.GameDataSource

class GameDetailViewModel(private val datasource: GameDataSource) : ViewModel() {

    /* Queries datasource to returns a game that corresponds to an id. */
    fun getGameForId(id: Long) : Game? {
        return datasource.getGameForId(id)
    }

    /* Queries datasource to remove a game. */
    fun removeGame(game: Game) {
        datasource.removeGame(game)
    }
}

class GameDetailViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return GameDetailViewModel(
                datasource = GameDataSource.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
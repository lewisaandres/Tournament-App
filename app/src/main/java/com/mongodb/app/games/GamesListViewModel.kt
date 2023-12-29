package com.mongodb.app.games

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.random.Random

class GamesListViewModel(val dataSource: GameDataSource) : ViewModel() {

    val gameLiveData = dataSource.getGameList()

    /* If the name and description are present, create new game and add it to the datasource */
    fun insertGame(gameName: String?, gameDescription: String?) {
        if (gameName == null || gameDescription == null) {
            return
        }

        val image = dataSource.getRandomGameImageAsset()
        val newGame = Game(
            Random.nextLong(),
            gameName,
            image,
            gameDescription
        )

        dataSource.addGame(newGame)
    }
}

class GamesListViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GamesListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return GamesListViewModel(
                dataSource = GameDataSource.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
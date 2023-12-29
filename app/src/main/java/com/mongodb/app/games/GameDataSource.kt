package com.mongodb.app.games

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


/* Handles operations on gameLiveData and holds details about it. */
class GameDataSource(resources: Resources) {
    private val initialGameList = gameList(resources)
    private val gamesLiveData = MutableLiveData(initialGameList)

    /* Adds game to liveData and posts value. */
    fun addGame(game: Game) {
        val currentList = gamesLiveData.value
        if (currentList == null) {
            gamesLiveData.postValue(listOf(game))
        } else {
            val updatedList = currentList.toMutableList()
            updatedList.add(0, game)
            gamesLiveData.postValue(updatedList)
        }
    }

    /* Removes game from liveData and posts value. */
    fun removeGame(game: Game) {
        val currentList = gamesLiveData.value
        if (currentList != null) {
            val updatedList = currentList.toMutableList()
            updatedList.remove(game)
            gamesLiveData.postValue(updatedList)
        }
    }

    /* Returns game given an ID. */
    fun getGameForId(id: Long): Game? {
        gamesLiveData.value?.let { games ->
            return games.firstOrNull{ it.id == id}
        }
        return null
    }

    fun getGameList(): LiveData<List<Game>> {
        return gamesLiveData
    }

    /* Returns a random game asset for games that are added. */
    fun getRandomGameImageAsset(): Int? {
        val randomNumber = (initialGameList.indices).random()
        return initialGameList[randomNumber].image
    }

    companion object {
        private var INSTANCE: GameDataSource? = null

        fun getDataSource(resources: Resources): GameDataSource {
            return synchronized(GameDataSource::class) {
                val newInstance = INSTANCE ?: GameDataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }
}
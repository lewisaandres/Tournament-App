package com.mongodb.app.games

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.R

class GamesHeaderAdapter: RecyclerView.Adapter<GamesHeaderAdapter.HeaderViewHolder>() {
    private var gameCount: Int = 0

    /* ViewHolder for displaying header. */
    class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }

    /* Inflates view and returns HeaderViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_header, parent, false)
        return HeaderViewHolder(view)
    }

    /* Binds number of games to the header. */
    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {

    }

    /* Returns number of items, since there is only one item in the header return one  */
    override fun getItemCount(): Int {
        return 1
    }

    /* Updates header to display number of flowers when a game is added or subtracted. */
    fun updateGameCount(updatedFlowerCount: Int) {
        gameCount = updatedFlowerCount
        notifyDataSetChanged()
    }
}
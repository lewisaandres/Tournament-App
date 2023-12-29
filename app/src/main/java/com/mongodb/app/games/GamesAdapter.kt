package com.mongodb.app.games

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.R

class GamesAdapter(private val onClick: (Game) -> Unit) :
    ListAdapter<Game, GamesAdapter.GameViewHolder>(GameDiffCallback) {

    /* ViewHolder for Game, takes in the inflated view and the onClick behavior. */
    class GameViewHolder(itemView: View, val onClick: (Game) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val gameTextView: TextView = itemView.findViewById(R.id.game_text)
        private val gameImageView: ImageView = itemView.findViewById(R.id.game_image)
        private var currentGame: Game? = null

        init {
            itemView.setOnClickListener {
                currentGame?.let {
                    onClick(it)
                }
            }
        }

        /* Bind game name and image. */
        fun bind(game: Game) {
            currentGame = game

            gameTextView.text = game.name
            if (game.image != null) {
                gameImageView.setImageResource(game.image)
            } else {
                gameImageView.setImageResource(R.mipmap.valorant_foreground)
            }
        }
    }

    /* Creates and inflates view and return GameViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_item, parent, false)
        return GameViewHolder(view, onClick)
    }

    /* Gets current game and uses it to bind view. */
    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = getItem(position)
        holder.bind(game)

    }
}

object GameDiffCallback : DiffUtil.ItemCallback<Game>() {
    override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem.id == newItem.id
    }
}
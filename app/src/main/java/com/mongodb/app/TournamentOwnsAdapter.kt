package com.mongodb.app

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import org.w3c.dom.Text
import com.mongodb.app.games.GAME_ID
import com.mongodb.app.games.GamesListActivity
import com.mongodb.app.games.NAME_GAME
import io.realm.*
import java.util.*

class TournamentOwnsAdapter(private var tourneyQuery: RealmList<Tournament>, private var images: IntArray): RecyclerView.Adapter<TournamentOwnsAdapter.ViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) : ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(v, mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        val rnd = Random()
//        val currentColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
//        holder.
        var moneySign = "$"
        var prizeMoneyText = tourneyQuery[position]?.prizeAmount

        holder.itemTitle.text = tourneyQuery[position]?.name
        holder.itemDetail.text = tourneyQuery[position]?.tournamentType
        holder.itemHost.text = tourneyQuery[position]?.location
        holder.itemStartTime.text = tourneyQuery[position]?.startTime
        holder.itemGameName.text = tourneyQuery[position]?.game
        holder.itemPerson.text = tourneyQuery[position]?.participant
        holder.itemMoney.text = moneySign + prizeMoneyText
//        holder.itemImage.setImageResource(images[position])

        if (holder.itemGameName.text == "Valorant") {
            holder.itemImage.setImageResource(R.mipmap.valorant_foreground)
        } else if (holder.itemGameName.text == "Fortnite") {
            holder.itemImage.setImageResource(R.mipmap.fortnite_foreground)
        } else if (holder.itemGameName.text == "Apex Legends") {
            holder.itemImage.setImageResource(R.mipmap.apex_foreground)
        } else if (holder.itemGameName.text == "Dragon Ball FighterZ") {
            holder.itemImage.setImageResource(R.mipmap.dbz_foreground)
        } else if (holder.itemGameName.text == "Super Smash Bros.") {
            holder.itemImage.setImageResource(R.mipmap.smash_foreground)
        } else if (holder.itemGameName.text == "League of Legends") {
            holder.itemImage.setImageResource(R.mipmap.lol_foreground)
        } else if (holder.itemGameName.text == "Dota") {
            holder.itemImage.setImageResource(R.mipmap.dota_foreground)
        } else if (holder.itemGameName.text == "Counter-Strike: Global Offensive") {
            holder.itemImage.setImageResource(R.mipmap.csgo_foreground)
        } else if (holder.itemGameName.text == "Tom Clancy's Rainbow Six Siege") {
            holder.itemImage.setImageResource(R.mipmap.r6_foreground)
        } else if (holder.itemGameName.text == "Rocket League") {
            holder.itemImage.setImageResource(R.mipmap.rocket_foreground)
        } else {
            holder.itemImage.setImageResource(R.mipmap.dbz_foreground)
        }


    }

    override fun getItemCount(): Int {
        //return images.size
        return tourneyQuery.size
    }

    inner class ViewHolder(itemView: View, listener: onItemClickListener): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemHost: TextView
        var itemStartTime: TextView
        var itemGameName: TextView
        var itemPerson: TextView
        var itemMoney: TextView
        var cardview: CardView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)
            itemHost = itemView.findViewById(R.id.itemHost)
            itemStartTime = itemView.findViewById(R.id.itemStartTime)
            itemGameName= itemView.findViewById(R.id.itemGameName)
            itemPerson = itemView.findViewById(R.id.itemPerson)
            itemMoney = itemView.findViewById(R.id.itemMoney)
            cardview = itemView.findViewById(R.id.card_view)

            itemView.setOnClickListener {
                listener.onItemClick(absoluteAdapterPosition)
            }


        }
    }


}

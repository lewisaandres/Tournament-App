package com.mongodb.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TournamentPageAdapter(private var title: Array<String>, private var details: Array<String?>, private var images: IntArray): RecyclerView.Adapter<TournamentPageAdapter.ViewHolder>() {

    private lateinit var mListener: onItemClickListener
//
//    private var title = arrayOf("Location", "Start Time", "Rules", "Contact TO", "Chat Room")
//    private var details = arrayOf("long beach", "2:30", "Tap for details", "TO Name", "Text with other participants")
//    private var images = intArrayOf(R.drawable.ic_location, R.drawable.ic_time, R.drawable.ic_rules, R.drawable.ic_send, R.drawable.ic_chat)


    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TournamentPageAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tournament_page_card_view, parent, false)
        return ViewHolder(v, mListener)
    }

    override fun onBindViewHolder(holder: TournamentPageAdapter.ViewHolder, position: Int) {
        holder.headerTitle.text = title[position]
        holder.description.text = details[position]
        holder.icon.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View, listener: onItemClickListener): RecyclerView.ViewHolder(itemView) {
        var headerTitle: TextView
        var description: TextView
        var icon: ImageView

        init {
            headerTitle = itemView.findViewById(R.id.headerTitle)
            description = itemView.findViewById(R.id.bodyDetail)
            icon = itemView.findViewById(R.id.listIcon)

            itemView.setOnClickListener {
                listener.onItemClick(absoluteAdapterPosition)
            }
        }
    }
}
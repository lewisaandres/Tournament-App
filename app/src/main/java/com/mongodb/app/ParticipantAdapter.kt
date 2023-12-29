package com.mongodb.app

import android.app.AlertDialog
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import io.realm.RealmResults
import io.realm.mongodb.functions.Functions
import org.bson.Document

internal class ParticipantAdapter(private val data: ArrayList<Participant>) :
    RecyclerView.Adapter<ParticipantAdapter.MemberViewHolder>() {
    lateinit var parent : ViewGroup

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ParticipantAdapter.MemberViewHolder {
        // save a reference to the parent view so we can create dialogs later
        this.parent = parent
        Log.i(TAG(), "Displaying a list of project members. Size: ${data.size}")
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.participant_view, parent, false)
        return MemberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val obj: Participant = data[position]
        holder.data = obj
        holder.name.text = obj.name

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = data.size

    internal inner class MemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.name)
        var data: Participant? = null

    }
}

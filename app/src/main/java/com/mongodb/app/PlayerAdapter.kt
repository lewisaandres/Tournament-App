package com.mongodb.app
import android.app.AlertDialog
import android.util.Log
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmList
import io.realm.kotlin.where
import io.realm.mongodb.User

import io.realm.mongodb.functions.Functions
import org.bson.Document

/*
* MemberAdapter: extends the Android RecyclerView Adapter to display a collection of Member objects
* in a RecyclerView.
*/

internal class PlayerAdapter(private val data: RealmList<String>, private val user: User, private val config: RealmConfiguration) :
    RecyclerView.Adapter<PlayerAdapter.MemberViewHolder>() {
    lateinit var parent: ViewGroup

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlayerAdapter.MemberViewHolder {
        // save a reference to the parent view so we can create dialogs later
        this.parent = parent
        Log.i(TAG(), "Displaying a list of project members. Size: ${data.size}")
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.player_view, parent, false)
        return MemberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {

        holder.name.text = data[position].toString()

        holder.delete.setOnClickListener {
            val functionsManager: Functions = realmApp.getFunctions(user)
            functionsManager.callFunctionAsync(
                "unfollow",
                listOf(holder.name.text), // game name
                Document::class.java
            ) { result ->
                if (result.isSuccess) {
                    Log.v(TAG(), "Attempted to remove participant. Result: ${result.get()}")
                    notifyItemRemoved(position)

                } else {
                    Log.e(TAG(), "failed to remove participant with: " + result.error)

                }
            }
            notifyItemRemoved(position)
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = data.size

    internal inner class MemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.findViewById(R.id.name)
        var delete: TextView = view.findViewById(R.id.delete)

    }
}
package com.mongodb.app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.kotlin.where
import io.realm.mongodb.functions.Functions
import io.realm.mongodb.sync.SyncConfiguration
import org.bson.Document
import java.util.ArrayList

class ParticipantActivity: AppCompatActivity() {
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var recyclerView: RecyclerView
    private var user: io.realm.mongodb.User? = null
    private lateinit var participants: ArrayList<Participant>
    private lateinit var adapter: ParticipantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_participants)
        recyclerView = findViewById(R.id.participant_list)
        user = realmApp.currentUser()
        var bundle: Bundle? = intent.extras
        var tourneyNameCall = bundle!!.getString("tourneyName")
        val functionsManager: Functions = realmApp.getFunctions(user)
        functionsManager.callFunctionAsync("getParticipants", listOf(tourneyNameCall), ArrayList::class.java) { result ->
            if (result.isSuccess) {
                Log.v(TAG(), "successfully fetched team members. Number of team members: ${result.get().size}")
                // The getMyTeamMembers function returns team members as Document objects. Convert them into Member objects so the MemberAdapter can display them.
                this.participants= ArrayList(result.get().map { item -> Participant(item as Document) })
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = ParticipantAdapter(participants)
                recyclerView.setHasFixedSize(true)
                recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            } else {
                Log.e(TAG(), "failed to get team members with: " + result.error)
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        recyclerView.adapter = null
    }
}

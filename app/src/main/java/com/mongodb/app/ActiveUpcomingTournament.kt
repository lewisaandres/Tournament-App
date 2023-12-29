package com.mongodb.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_active_upcoming_tournament.*
import java.text.FieldPosition


class ActiveUpcomingTournament:AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ActiveUpcomingAdapter.ViewHolder>? = null

    private var user = realmApp.currentUser()
    private var partition = "123"
    var config = SyncConfiguration.Builder(user, partition).build()
    // open the realm
    private var realm = Realm.getInstance(config)
    private var tourneyQuery = realm!!.where<Tournament>().findAll()


    private var images = intArrayOf(
        R.drawable.dbz_background
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active_upcoming_tournament)

        layoutManager = LinearLayoutManager(this)
        cardRecyclerView.layoutManager = layoutManager

        adapter = ActiveUpcomingAdapter(tourneyQuery)
        cardRecyclerView.adapter = adapter

        (adapter as ActiveUpcomingAdapter).setOnItemClickListener(object : ActiveUpcomingAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@ActiveUpcomingTournament, TournamentPageActivity::class.java)
                intent.putExtra("participant", tourneyQuery[position]!!.participant)
                intent.putExtra("tourneyGame", tourneyQuery[position]!!.game)
                intent.putExtra("location", tourneyQuery[position]!!.location)
                intent.putExtra("startTime", tourneyQuery[position]!!.startTime)
                intent.putExtra("tourneyName", tourneyQuery[position]!!.name)
                intent.putExtra("tournamentType", tourneyQuery[position]!!.tournamentType)
                intent.putExtra("prizeAmount", tourneyQuery[position]!!.prizeAmount)
                intent.putExtra("rules", tourneyQuery[position]!!.rules)
                //intent.putExtra("tourneyPicture", images[position])

                if (tourneyQuery[position]!!.game == "Valorant") {
                    intent.putExtra("tourneyPicture", R.mipmap.valorant_foreground)
                } else if (tourneyQuery[position]!!.game == "Fortnite") {
                    intent.putExtra("tourneyPicture", R.mipmap.fortnite_foreground)
                } else if (tourneyQuery[position]!!.game == "Apex Legends") {
                    intent.putExtra("tourneyPicture", R.mipmap.apex_foreground)
                } else if (tourneyQuery[position]!!.game == "Dragon Ball FighterZ") {
                    intent.putExtra("tourneyPicture", R.mipmap.dbz_foreground)
                } else if (tourneyQuery[position]!!.game == "Super Smash Bros.") {
                    intent.putExtra("tourneyPicture", R.mipmap.smash_foreground)
                } else if (tourneyQuery[position]!!.game == "League of Legends") {
                    intent.putExtra("tourneyPicture", R.mipmap.lol_foreground)
                } else if (tourneyQuery[position]!!.game == "Dota") {
                    intent.putExtra("tourneyPicture", R.mipmap.dota_foreground)
                } else if (tourneyQuery[position]!!.game == "Counter-Strike: Global Offensive") {
                    intent.putExtra("tourneyPicture", R.mipmap.csgo_foreground)
                } else if (tourneyQuery[position]!!.game == "Tom Clancy's Rainbow Six Siege") {
                    intent.putExtra("tourneyPicture", R.mipmap.r6_foreground)
                } else if (tourneyQuery[position]!!.game == "Rocket League") {
                    intent.putExtra("tourneyPicture", R.mipmap.rocket_foreground)
                } else {
                    intent.putExtra("tourneyPicture", R.mipmap.dbz_foreground)
                }

                startActivity(intent)
            }
        })


    }


}


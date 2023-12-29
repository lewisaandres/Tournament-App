package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmList
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_active_upcoming_tournament.*

class TournamentsInActivity: AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<TournamentInAdapter.ViewHolder>? = null

    private var user = realmApp.currentUser()
    private var partition = "123"
    var config = SyncConfiguration.Builder(user, partition).build()
    // open the realm
    private var realm = Realm.getInstance(config)


    //  ObjectId("62708b895c4ba218c94cd1f3"))
    private var images = intArrayOf(
        R.drawable.dbz_background
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active_upcoming_tournament)
        var bundle: Bundle? = intent.extras
        var userEmail= bundle!!.getString("EMAIL")
        var userQuery = realm.where<User>().equalTo("name",userEmail).findAll()
        var tourneyQuery = RealmList<Tournament>()
        var tourneyListSize = userQuery[0]?.tournamentIn?.size?.minus(1)
        for (i in 0..tourneyListSize!!) {
            var oneTournamentQuery = realm.where<Tournament>().equalTo("_id",
                userQuery[0]?.tournamentIn?.get(i)).findFirst()
            tourneyQuery.add(oneTournamentQuery)
        }

        /*
        var tourneyQuery = realm.where<Tournament>().equalTo("_id",
            userQuery[0]?.tournamentOwn?.get(0)).findAll()

         */
        layoutManager = LinearLayoutManager(this)
        cardRecyclerView.layoutManager = layoutManager
        adapter = TournamentInAdapter(tourneyQuery, images)
        cardRecyclerView.adapter = adapter

        (adapter as TournamentInAdapter).setOnItemClickListener(object : TournamentInAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@TournamentsInActivity, TournamentPageActivity::class.java)
                intent.putExtra("participant", tourneyQuery[position]!!.participant)
                intent.putExtra("tourneyGame", tourneyQuery[position]!!.game)
                intent.putExtra("location", tourneyQuery[position]!!.location)
                intent.putExtra("startTime", tourneyQuery[position]!!.startTime)
                intent.putExtra("tourneyName", tourneyQuery[position]!!.name)
                intent.putExtra("tournamentType", tourneyQuery[position]!!.tournamentType)
                intent.putExtra("prizeAmount", tourneyQuery[position]!!.prizeAmount)
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

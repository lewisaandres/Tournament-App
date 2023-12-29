package com.mongodb.app


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mongodb.app.activty.CheckoutActivity
import com.mongodb.app.games.GamesListActivity
import io.realm.Realm
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration
import kotlinx.android.synthetic.main.activity_active_upcoming_tournament.*
import kotlinx.android.synthetic.main.home_view.*
import java.util.*


class HomeActivity : AppCompatActivity() {
    private lateinit var searchTournamentButton: Button
    private lateinit var createTournamentButton: Button
    private lateinit var settingsButton: Button
    private lateinit var profileButton: Button
    private lateinit var activeButton: Button
    private lateinit var suggestionButton: Button
    private lateinit var rankingButton: Button
    private lateinit var payButton: Button
    private lateinit var brackets: Button
    private lateinit var tourneyPageButton: Button
    private lateinit var group: Button
    private lateinit var message: Button
    private lateinit var userEmail: TextView
    private lateinit var rateButton: Button
    private lateinit var gPay: Button
    private lateinit var homeLogo: ImageView
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ActiveUpcomingAdapter.ViewHolder>? = null
    private var user = realmApp.currentUser()
    private var partition = "123"
    var config = SyncConfiguration.Builder(user, partition).build()
    private var realm = Realm.getInstance(config)
    private var tourneyQuery = realm!!.where<Tournament>().findAll()


    // lateinit var timerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_view)

        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        homeTourneyView.layoutManager = layoutManager

        adapter = ActiveUpcomingAdapter(tourneyQuery)
        homeTourneyView.adapter = adapter

        (adapter as ActiveUpcomingAdapter).setOnItemClickListener(object : ActiveUpcomingAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@HomeActivity, TournamentPageActivity::class.java)
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


        val bundle: Bundle? = intent.extras
        var currentEmail: String? = null
        if (bundle != null) {
            currentEmail = bundle.getString("EMAIL")
        }
        userEmail = findViewById(R.id.email)
        userEmail.text = currentEmail
//        val bottomNavigationBar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val navController = findNavController(R.id.fragmentContainerView)
//        val appBarConfiguration = AppBarConfiguration(setOf(R.id.searchFragment, R.id.createTourneyFragment, R.id.profileFragment, R.id.settingsFragment))
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        bottomNavigationBar.setupWithNavController(navController)

        homeLogo = findViewById(R.id.appLogo)
        homeLogo.setOnClickListener{onCreateTournamentButtonClicked()}

        searchTournamentButton = findViewById(R.id.Search_Tournament)
        searchTournamentButton.setOnClickListener {onSearchTournamentButtonClicked()}

//        createTournamentButton = findViewById(R.id.Create_Tournament)
//        createTournamentButton.setOnClickListener {onCreateTournamentButtonClicked()}

        settingsButton = findViewById(R.id.Settings)
        settingsButton.setOnClickListener {onSettingsButtonClicked()}

        profileButton = findViewById(R.id.Profile)
        profileButton.setOnClickListener {onProfileButtonClicked()}

        activeButton = findViewById(R.id.activeTournament)
        activeButton.setOnClickListener { toActiveTourney() }

        suggestionButton = findViewById(R.id.suggestionPageButton)
        suggestionButton.setOnClickListener { toSuggetionPage() }
//
//        rankingButton = findViewById(R.id.memberButton)
//        rankingButton.setOnClickListener { toMemberRank() }

//        payButton = findViewById(R.id.payPalButton)
//        payButton.setOnClickListener { toPaypalPage() }
//
//        payButton = findViewById(R.id.payPalButton)
//        payButton.setOnClickListener { toPaypalPage() }

//        group = findViewById(R.id.groupButton)
//        group.setOnClickListener { toGroupPage() }
//
//        message = findViewById(R.id.messageButton)
//        message.setOnClickListener { toChatRoom() }
//
//        rateButton = findViewById(R.id.ratingsPage)
//        rateButton.setOnClickListener { toMyRatingsPage() }
//        timerButton = findViewById(R.id.timerButton)
//        timerButton.setOnClickListener { toTimerPage() }

//
//        brackets = findViewById(R.id.brackets)
//        brackets.setOnClickListener { toBracketActivity() }

//        tourneyPageButton = findViewById(R.id.tourneyPage)
//        tourneyPageButton.setOnClickListener { toTourneyPage() }
//
//        gPay = findViewById(R.id.googlePayButton)
//        gPay.setOnClickListener { toPaypalPage() }

    }


    private fun toMyRatingsPage() {
        val intent = Intent(Intent(this, MyRatingsActivity::class.java))
        intent.putExtra("EMAIL", userEmail.text)
        startActivity(intent)
    }


    private fun toChatRoom (){
        startActivity(Intent(this, ChatRoom::class.java))
    }

    private fun toGroupPage (){
        startActivity(Intent(this, CreateGroupActivity::class.java))
    }

    private fun toTimerPage (){
        startActivity(Intent(this, TimerActivity::class.java))
    }


    private fun toTourneyPage (){
        startActivity(Intent(this, TournamentPageActivity::class.java))
    }


    private fun toActiveTourney (){
        startActivity(Intent(this, ActiveUpcomingTournament::class.java))
    }


    private fun toPaypalPage(){
        startActivity(Intent(this,CheckoutActivity::class.java))
    }

    private fun toMemberRank(){
        startActivity(Intent(this,RankingActivity::class.java))
    }

    private fun toSuggetionPage(){
        startActivity(Intent(this,SuggestionPageActivity::class.java))
    }

    private fun onSearchTournamentButtonClicked(){
        startActivity(Intent(this, GamesListActivity::class.java))
    }

    private fun onCreateTournamentButtonClicked(){
        startActivity(Intent(this, CreateTournamentActivity::class.java))
    }

    private fun toBracketActivity(){
        startActivity(Intent(this, BracketActivity::class.java))
    }

    private fun onSettingsButtonClicked(){
        val intent = Intent(Intent(this, SettingsActivity::class.java))
        val email = getIntent().getStringExtra("EMAIL")
        intent.putExtra("EMAIL", email)
        startActivity(intent)
    }

    private fun onProfileButtonClicked(){
        val intent = Intent(Intent(this, NewProfile::class.java))
        intent.putExtra("EMAIL", userEmail.text.toString())
        startActivity(intent)
    }

}
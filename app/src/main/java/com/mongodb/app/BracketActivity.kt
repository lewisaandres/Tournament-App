package com.mongodb.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mongodb.app.R
import com.ventura.bracketslib.BracketsView
import com.ventura.bracketslib.model.CompetitorData
import com.ventura.bracketslib.model.MatchData
import com.ventura.bracketslib.model.ColomnData
import java.util.*

class BracketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bracket)

        //Init competitorData and matchData
        val bracketsView = findViewById<BracketsView>(R.id.bracket_view)
        val argentinaSemiFinal = CompetitorData("Sephires", "3")
        val russiaSemiFinal = CompetitorData("Bomb-ombs", "2")
        val mayfairSemiFinal = CompetitorData("Mayfairs", "3")
        val bandaiSemiFinal = CompetitorData("Bandai Family", "1")
        val tsmSemiFinal = CompetitorData("TSM", "3")
        val cloudSemiFinal = CompetitorData("Cloud 9 ", "2")
        val pokemonSemiFinal = CompetitorData("Pokemon Stars", "3")
        val lakersSemiFinal = CompetitorData("Lakers", "1")
        val goichiFinal = CompetitorData("Goichi", "3")
        val sonicfoxFinal = CompetitorData("SonicFox", "2")
        val match2SemiFinal = MatchData(argentinaSemiFinal, russiaSemiFinal)
        val match3SemiFinal = MatchData(mayfairSemiFinal, bandaiSemiFinal)
        val match4SemiFinal = MatchData(tsmSemiFinal, cloudSemiFinal)
        val match5SemiFinal = MatchData(pokemonSemiFinal, lakersSemiFinal)



        val match3Final = MatchData(goichiFinal, sonicfoxFinal)
        val secondColomn = ColomnData(Arrays.asList(match3Final, match2SemiFinal, match3SemiFinal, match4SemiFinal, match5SemiFinal))
        val thirdColomn = ColomnData(Arrays.asList(match3Final, match2SemiFinal, match3SemiFinal, match4SemiFinal))
        val fifthColomn = ColomnData(Arrays.asList(match3Final, match2SemiFinal))
        val sixthColomn = ColomnData(Arrays.asList(match3Final))





        //set data on brackets
        bracketsView.setBracketsData(Arrays.asList( secondColomn, thirdColomn, fifthColomn, sixthColomn))

//        //Below 2 lines - Back button for this page supported by the toolbar in xml file
        setSupportActionBar(findViewById(R.id.toolbar_CurrentTournament))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
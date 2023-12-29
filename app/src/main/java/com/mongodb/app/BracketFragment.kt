package com.mongodb.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ventura.bracketslib.BracketsView
import com.ventura.bracketslib.model.ColomnData
import com.ventura.bracketslib.model.CompetitorData
import com.ventura.bracketslib.model.MatchData
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BracketFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BracketFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View
        view = inflater.inflate(R.layout.fragment_bracket, container, false)
        //Init competitorData and matchData
        val bracketsView = view.findViewById<BracketsView>(R.id.bracket_view)
        val brazilSemiFinal = CompetitorData("Brazil", "3")
        val englandSemiFinal = CompetitorData("England", "1")
        val argentinaSemiFinal = CompetitorData("Argentina", "3")
        val russiaSemiFinal = CompetitorData("Russia", "2")
        val brazilFinal = CompetitorData("Brazil", "4")
        val argentinaFinal = CompetitorData("Argentina", "2")
        val match1SemiFinal = MatchData(brazilSemiFinal, englandSemiFinal)
        val match2SemiFinal = MatchData(argentinaSemiFinal, russiaSemiFinal)
        val match3Final = MatchData(brazilFinal, argentinaFinal)
        val semiFinalColomn = ColomnData(Arrays.asList(match1SemiFinal, match2SemiFinal))
        val finalColomn = ColomnData(Arrays.asList(match3Final))

        //set data on brackets
        bracketsView.setBracketsData(Arrays.asList(semiFinalColomn, finalColomn))


        // Inflate the layout for this fragment
        return view
    }
}
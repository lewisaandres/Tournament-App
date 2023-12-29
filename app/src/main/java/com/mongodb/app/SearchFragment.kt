package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.SearchView
import com.mongodb.app.databinding.ActivitySearchTournamentBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SearchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: ActivitySearchTournamentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View
        view = inflater.inflate(R.layout.fragment_search, container, false)
        startActivity(Intent(this@SearchFragment.context, ProfileActivity::class.java))
//        val binding = ActivitySearchTournamentBinding.inflate(layoutInflater)
//        //setContentView(binding.root)
//        //setContentView(com.mongodb.app.R.layout.activity_search_tournament)
//
////        //Below 2 lines - Back button for this page supported by the toolbar in xml file
////        setSupportActionBar(findViewById(com.mongodb.app.R.id.toolBar_SearchTournament))
////        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        val user = arrayOf<String>("League of Legends Tournament",
//            "Fortnite Tournament",
//            "Valorant Tournament",
//            "Apex Legends Tournament")
//
//
//        val userAdapter : ArrayAdapter<String> = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1,
//            user
//        )
//
//        binding.userList.adapter = userAdapter;
//
//        binding.searchView.setOnQueryTextListener(object  : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                binding.searchView.clearFocus()
//                if (user.contains(query)){
//
//                    userAdapter.filter.filter(query)
//
//                }
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//                userAdapter.filter.filter(newText)
//                return false
//            }
//
//
//        })
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SearchFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SearchFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
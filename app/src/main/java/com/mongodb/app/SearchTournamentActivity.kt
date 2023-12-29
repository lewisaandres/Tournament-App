package com.mongodb.app

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.mongodb.app.databinding.ActivitySearchTournamentBinding

class SearchTournamentActivity : AppCompatActivity()  {
    private lateinit var binding: ActivitySearchTournamentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchTournamentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(com.mongodb.app.R.layout.activity_search_tournament)

//        //Below 2 lines - Back button for this page supported by the toolbar in xml file
//        setSupportActionBar(findViewById(com.mongodb.app.R.id.toolBar_SearchTournament))
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val user = arrayOf("League of Legends Tournament",
            "Fortnite Tournament",
            "Valorant Tournament",
            "Apex Legends Tournament")

        val userAdapter : ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.simple_list_item_1,
            user
        )

        binding.userList.adapter = userAdapter;

        binding.searchView.setOnQueryTextListener(object  : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.searchView.clearFocus()
                if (user.contains(query)){

                    userAdapter.filter.filter(query)

                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                userAdapter.filter.filter(newText)
                return false
            }


        })

    }
}
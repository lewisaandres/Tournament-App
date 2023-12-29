package com.mongodb.app

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mongodb.app.R
import com.mongodb.app.User
import com.mongodb.app.realmApp
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmResults
import io.realm.kotlin.where
import io.realm.mongodb.sync.SyncConfiguration

class RankingActivity : AppCompatActivity()
{
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)
        val listView  = findViewById<ListView>(R.id.user_listview)

        //listView.adapter = MyCustomAdapter(this)//
        val user = realmApp.currentUser()
        val partition = "123"
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@RankingActivity.userRealm = realm
                listView.adapter = MyCustomAdapter(this@RankingActivity,realm.where<User>().findAll())
            }
        })
    }

    /**
     * Destroys the User Realm when exiting the activity
     */
    override fun onDestroy() {
        super.onDestroy()
        userRealm.close()
//        listView.adapter = null

    }
    private class MyCustomAdapter(context: Context, private var users: RealmResults<User>): BaseAdapter()
    {
        private val mContext: Context = context

        //member name

        private val names = arrayListOf<String>("name1","name2","name3","name4")

        //how many rows in my list
        override fun getCount(): Int {
            return users.size
        }

        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        //rendering out each row
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            //val textView = TextView(mContext)
            //textView.text = "here is my row for testView"
            //return textView
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.activity_row_ranking,viewGroup,false)


            //name
            val nameTextView = rowMain.findViewById<TextView>(R.id.textView)
            //nameTextView.text = names.get(position)
            nameTextView.text = users[position]!!.name
            if(position == 0) {
                nameTextView.setTextColor(Color.RED)
            }
            else if (position == 1) {
                nameTextView.setTextColor(Color.GREEN)
            }
            else if (position == 2) {
                nameTextView.setTextColor(Color.BLUE)
            }


            val positionTextView = rowMain.findViewById<TextView>(R.id.position_textview)
            positionTextView.text = "Ranking:$position"
            if(position == 0)
                positionTextView.text = "Champion"
            return rowMain

        }

    }
}

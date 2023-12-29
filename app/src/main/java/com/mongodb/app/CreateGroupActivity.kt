package com.mongodb.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.mongodb.sync.SyncConfiguration

class CreateGroupActivity  : AppCompatActivity() {
    private lateinit var gName: EditText
    private lateinit var member1: EditText
    private lateinit var member2: EditText
    private lateinit var member3: EditText
    private lateinit var member4: EditText
    private lateinit var createGroupButton: Button
    private lateinit var userRealm: Realm
    private lateinit var config: RealmConfiguration
    private var user: io.realm.mongodb.User? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)
        user = realmApp.currentUser()
        gName = findViewById(R.id.groupName)
        member1 = findViewById(R.id.mem1)
        member2 = findViewById(R.id.mem2)
        member3 = findViewById(R.id.mem3)
        member4 = findViewById(R.id.mem4)
        createGroupButton = findViewById((R.id.createTournamentButton_Button))

        createGroupButton.setOnClickListener { (createGroup()) }
    }
    override fun onStart() {
        super.onStart()

        val user = realmApp.currentUser()
        val partition = "123" //user.id
        config = SyncConfiguration.Builder(user, partition).build()
        Realm.getInstanceAsync(config, object : Realm.Callback() {
            override fun onSuccess(realm: Realm) {
                this@CreateGroupActivity.userRealm = realm
            }
        })
    }

    /**
     * Destroys the User Realm when exiting the activity
     */
    override fun onDestroy() {
        super.onDestroy()
        userRealm.close()
    }
    private fun createGroup() {
        val group = Group()

        group.name = gName.text.toString()
        group.member1 = member1.text.toString()
        group.member2 = member2.text.toString()
        group.member3 = member3.text.toString()
        group.member4 = member4.text.toString()


        userRealm.executeTransactionAsync { realm ->
            realm.insert(group)
        }
        startActivity(Intent(this,HomeActivity::class.java))
    }
}

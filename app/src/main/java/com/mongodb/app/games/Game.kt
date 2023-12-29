package com.mongodb.app.games

import androidx.annotation.DrawableRes
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField
import io.realm.annotations.Required
import org.bson.types.ObjectId

data class Game(
    val id: Long,
    val name: String,
    @DrawableRes
    val image: Int?,
    val description: String
)
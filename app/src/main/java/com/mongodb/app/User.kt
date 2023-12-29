package com.mongodb.app

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField
import io.realm.annotations.Required
import org.bson.types.ObjectId

open class User(
    @PrimaryKey @RealmField("_id") var id: String = "",
    var _partition: String = "123",
    var name: String = "",
    @Required
    var tournamentIn: RealmList<ObjectId> = RealmList(),
    @Required
    var tournamentOwn: RealmList<ObjectId> = RealmList(),
    @Required
    var followers: RealmList<String> = RealmList(),

    @Required
    var following: RealmList<String> = RealmList(),
): RealmObject()


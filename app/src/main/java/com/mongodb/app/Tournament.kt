package com.mongodb.app

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField
import org.bson.types.ObjectId;

open class Tournament(
    @RealmField("_id") @PrimaryKey var _id: ObjectId = ObjectId(),

    //var _partition: String = "",

    var game: String = "",

    var location: String = "",

    var name: String = "",

    var participant: String = "",

    var startTime: String = "",

    var tournamentType: String = "",

    var prizeAmount: String = "",

    var rules: String = ""
): RealmObject() {}

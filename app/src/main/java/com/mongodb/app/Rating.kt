package com.mongodb.app

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField
import org.bson.types.ObjectId;

open class Rating(
    @RealmField("_id") @PrimaryKey var _id: ObjectId = ObjectId(),

    //var _partition: String = "",

    var organizer: String = "",

    var rating: Float = 0.0f,

    var description: String = ""

): RealmObject() {}
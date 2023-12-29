package com.mongodb.app

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField
import org.bson.types.ObjectId;

open class Group(
    @RealmField("_id") @PrimaryKey var _id: ObjectId = ObjectId(),

    //var _partition: String = "",

    var name: String = "",

    var member1: String = "",

    var member2: String = "",

    var member3: String = "",

    var member4: String = "",

    ): RealmObject() {}

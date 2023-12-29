package com.mongodb.app

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField

open class Games(
    @RealmField("_id") @PrimaryKey var id: String = "",

    var genre: String = "",

    var title: String = ""
): RealmObject() {}

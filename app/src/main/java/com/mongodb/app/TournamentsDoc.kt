package com.mongodb.app

import org.bson.Document
import org.bson.types.ObjectId

class TournamentsDoc (document: Document) {
    val id : ObjectId = document["_id"] as ObjectId
    val name : String = document["name"] as String
}

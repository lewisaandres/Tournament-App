package com.mongodb.app

import org.bson.Document

class Player (document: Document) {
    val id : String = document["_id"] as String
    val name : String = document["name"] as String
}
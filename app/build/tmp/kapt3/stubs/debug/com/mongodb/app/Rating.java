package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/mongodb/app/Rating;", "Lio/realm/RealmObject;", "_id", "Lorg/bson/types/ObjectId;", "organizer", "", "rating", "", "description", "(Lorg/bson/types/ObjectId;Ljava/lang/String;FLjava/lang/String;)V", "get_id", "()Lorg/bson/types/ObjectId;", "set_id", "(Lorg/bson/types/ObjectId;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getOrganizer", "setOrganizer", "getRating", "()F", "setRating", "(F)V", "app_debug"})
public class Rating extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    @io.realm.annotations.RealmField(value = "_id")
    private org.bson.types.ObjectId _id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String organizer;
    private float rating;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    
    public Rating() {
        super();
    }
    
    public Rating(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId _id, @org.jetbrains.annotations.NotNull()
    java.lang.String organizer, float rating, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bson.types.ObjectId get_id() {
        return null;
    }
    
    public final void set_id(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrganizer() {
        return null;
    }
    
    public final void setOrganizer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final float getRating() {
        return 0.0F;
    }
    
    public final void setRating(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}
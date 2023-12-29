package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/mongodb/app/User;", "Lio/realm/RealmObject;", "id", "", "_partition", "name", "tournamentIn", "Lio/realm/RealmList;", "Lorg/bson/types/ObjectId;", "tournamentOwn", "followers", "following", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Lio/realm/RealmList;Lio/realm/RealmList;)V", "get_partition", "()Ljava/lang/String;", "set_partition", "(Ljava/lang/String;)V", "getFollowers", "()Lio/realm/RealmList;", "setFollowers", "(Lio/realm/RealmList;)V", "getFollowing", "setFollowing", "getId", "setId", "getName", "setName", "getTournamentIn", "setTournamentIn", "getTournamentOwn", "setTournamentOwn", "app_debug"})
public class User extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.RealmField(value = "_id")
    @io.realm.annotations.PrimaryKey()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String _partition;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    private io.realm.RealmList<org.bson.types.ObjectId> tournamentIn;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    private io.realm.RealmList<org.bson.types.ObjectId> tournamentOwn;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    private io.realm.RealmList<java.lang.String> followers;
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    private io.realm.RealmList<java.lang.String> following;
    
    public User() {
        super();
    }
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String _partition, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<org.bson.types.ObjectId> tournamentIn, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<org.bson.types.ObjectId> tournamentOwn, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> followers, @org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> following) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_partition() {
        return null;
    }
    
    public final void set_partition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<org.bson.types.ObjectId> getTournamentIn() {
        return null;
    }
    
    public final void setTournamentIn(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<org.bson.types.ObjectId> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<org.bson.types.ObjectId> getTournamentOwn() {
        return null;
    }
    
    public final void setTournamentOwn(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<org.bson.types.ObjectId> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<java.lang.String> getFollowers() {
        return null;
    }
    
    public final void setFollowers(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<java.lang.String> getFollowing() {
        return null;
    }
    
    public final void setFollowing(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> p0) {
    }
}
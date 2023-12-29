package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0016\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/mongodb/app/Tournament;", "Lio/realm/RealmObject;", "_id", "Lorg/bson/types/ObjectId;", "game", "", "location", "name", "participant", "startTime", "tournamentType", "prizeAmount", "rules", "(Lorg/bson/types/ObjectId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Lorg/bson/types/ObjectId;", "set_id", "(Lorg/bson/types/ObjectId;)V", "getGame", "()Ljava/lang/String;", "setGame", "(Ljava/lang/String;)V", "getLocation", "setLocation", "getName", "setName", "getParticipant", "setParticipant", "getPrizeAmount", "setPrizeAmount", "getRules", "setRules", "getStartTime", "setStartTime", "getTournamentType", "setTournamentType", "app_debug"})
public class Tournament extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    @io.realm.annotations.RealmField(value = "_id")
    private org.bson.types.ObjectId _id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String game;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String participant;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tournamentType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String prizeAmount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String rules;
    
    public Tournament() {
        super();
    }
    
    public Tournament(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId _id, @org.jetbrains.annotations.NotNull()
    java.lang.String game, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String participant, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String tournamentType, @org.jetbrains.annotations.NotNull()
    java.lang.String prizeAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String rules) {
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
    public final java.lang.String getGame() {
        return null;
    }
    
    public final void setGame(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getParticipant() {
        return null;
    }
    
    public final void setParticipant(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    public final void setStartTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTournamentType() {
        return null;
    }
    
    public final void setTournamentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrizeAmount() {
        return null;
    }
    
    public final void setPrizeAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRules() {
        return null;
    }
    
    public final void setRules(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}
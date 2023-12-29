package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/app/Task;", "Lio/realm/RealmObject;", "id", "Lorg/bson/types/ObjectId;", "_partition", "", "isComplete", "", "summary", "(Lorg/bson/types/ObjectId;Ljava/lang/String;ZLjava/lang/String;)V", "get_partition", "()Ljava/lang/String;", "set_partition", "(Ljava/lang/String;)V", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "()Z", "setComplete", "(Z)V", "getSummary", "setSummary", "app_debug"})
public class Task extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.PrimaryKey()
    @io.realm.annotations.RealmField(value = "_id")
    private org.bson.types.ObjectId id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String _partition;
    private boolean isComplete;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String summary;
    
    public Task() {
        super();
    }
    
    public Task(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId id, @org.jetbrains.annotations.NotNull()
    java.lang.String _partition, boolean isComplete, @org.jetbrains.annotations.NotNull()
    java.lang.String summary) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_partition() {
        return null;
    }
    
    public final void set_partition(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isComplete() {
        return false;
    }
    
    public final void setComplete(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}
package com.mongodb.app;

import java.lang.System;

/**
 * Extends the Realm-provided RealmRecyclerViewAdapter to provide data
 * for a RecyclerView to display Realm objects on screen to a user.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001\u0014B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u0014\u0010\u000e\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u0000H\u0002J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0014\u0010\u0013\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u0000H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/mongodb/app/TaskAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/mongodb/app/Task;", "Lcom/mongodb/app/TaskAdapter$TaskViewHolder;", "data", "Lio/realm/OrderedRealmCollection;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/OrderedRealmCollection;Lio/realm/RealmConfiguration;)V", "onBindViewHolder", "", "holder", "position", "", "onCheckboxClicked", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onMenuClicked", "TaskViewHolder", "app_debug"})
public final class TaskAdapter extends io.realm.RealmRecyclerViewAdapter<com.mongodb.app.Task, com.mongodb.app.TaskAdapter.TaskViewHolder> {
    private final io.realm.RealmConfiguration config = null;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.OrderedRealmCollection<com.mongodb.app.Task> data, @org.jetbrains.annotations.NotNull()
    io.realm.RealmConfiguration config) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.TaskAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.TaskAdapter.TaskViewHolder holder, int position) {
    }
    
    /**
     * Allows a user to check and uncheck a task and updates its status in the realm.
     */
    private final void onCheckboxClicked(com.mongodb.app.TaskAdapter.TaskViewHolder holder) {
    }
    
    /**
     * Creates a popup menu that allows the user to delete a task from the realm.
     */
    private final void onMenuClicked(com.mongodb.app.TaskAdapter.TaskViewHolder holder) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/mongodb/app/TaskAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/mongodb/app/TaskAdapter;Landroid/view/View;)V", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "setCheckbox", "(Landroid/widget/CheckBox;)V", "id", "Lorg/bson/types/ObjectId;", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "menu", "Landroid/widget/TextView;", "getMenu", "()Landroid/widget/TextView;", "setMenu", "(Landroid/widget/TextView;)V", "name", "getName", "setName", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private org.bson.types.ObjectId id;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView menu;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox checkbox;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.bson.types.ObjectId getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        org.bson.types.ObjectId p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMenu() {
            return null;
        }
        
        public final void setMenu(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCheckbox() {
            return null;
        }
        
        public final void setCheckbox(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
    }
}
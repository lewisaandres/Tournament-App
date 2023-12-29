package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001\u0010B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/mongodb/app/MyGroupsAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/mongodb/app/Group;", "Lcom/mongodb/app/MyGroupsAdapter$GroupViewHolder;", "data", "Lio/realm/RealmResults;", "(Lio/realm/RealmResults;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GroupViewHolder", "app_debug"})
public final class MyGroupsAdapter extends io.realm.RealmRecyclerViewAdapter<com.mongodb.app.Group, com.mongodb.app.MyGroupsAdapter.GroupViewHolder> {
    
    public MyGroupsAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.RealmResults<com.mongodb.app.Group> data) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.MyGroupsAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.MyGroupsAdapter.GroupViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/mongodb/app/MyGroupsAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/mongodb/app/MyGroupsAdapter;Landroid/view/View;)V", "glogo", "Landroid/widget/ImageView;", "getGlogo", "()Landroid/widget/ImageView;", "setGlogo", "(Landroid/widget/ImageView;)V", "gname", "Landroid/widget/TextView;", "getGname", "()Landroid/widget/TextView;", "setGname", "(Landroid/widget/TextView;)V", "id", "Lorg/bson/types/ObjectId;", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "members", "getMembers", "setMembers", "app_debug"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private org.bson.types.ObjectId id;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView gname;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView members;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView glogo;
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
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
        public final android.widget.TextView getGname() {
            return null;
        }
        
        public final void setGname(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMembers() {
            return null;
        }
        
        public final void setMembers(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getGlogo() {
            return null;
        }
        
        public final void setGlogo(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
}
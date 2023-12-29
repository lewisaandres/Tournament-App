package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/mongodb/app/PlayerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/PlayerAdapter$MemberViewHolder;", "data", "Lio/realm/RealmList;", "", "user", "Lio/realm/mongodb/User;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmList;Lio/realm/mongodb/User;Lio/realm/RealmConfiguration;)V", "parent", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "setParent", "(Landroid/view/ViewGroup;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewType", "MemberViewHolder", "app_debug"})
public final class PlayerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.PlayerAdapter.MemberViewHolder> {
    private final io.realm.RealmList<java.lang.String> data = null;
    private final io.realm.mongodb.User user = null;
    private final io.realm.RealmConfiguration config = null;
    public android.view.ViewGroup parent;
    
    public PlayerAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> data, @org.jetbrains.annotations.NotNull()
    io.realm.mongodb.User user, @org.jetbrains.annotations.NotNull()
    io.realm.RealmConfiguration config) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getParent() {
        return null;
    }
    
    public final void setParent(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.PlayerAdapter.MemberViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.PlayerAdapter.MemberViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/mongodb/app/PlayerAdapter$MemberViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/mongodb/app/PlayerAdapter;Landroid/view/View;)V", "delete", "Landroid/widget/TextView;", "getDelete", "()Landroid/widget/TextView;", "setDelete", "(Landroid/widget/TextView;)V", "name", "getName", "setName", "app_debug"})
    public final class MemberViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView delete;
        
        public MemberViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDelete() {
            return null;
        }
        
        public final void setDelete(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}
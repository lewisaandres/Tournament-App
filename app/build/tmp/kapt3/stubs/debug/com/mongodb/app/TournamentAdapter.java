package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001 B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u001c\u0010\u001f\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/mongodb/app/TournamentAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/mongodb/app/Tournament;", "Lcom/mongodb/app/TournamentAdapter$TournamentViewHolder;", "data", "Lio/realm/OrderedRealmCollection;", "config", "Lio/realm/RealmConfiguration;", "mContext", "Landroid/content/Context;", "currentGameId", "", "(Lio/realm/OrderedRealmCollection;Lio/realm/RealmConfiguration;Landroid/content/Context;Ljava/lang/Long;)V", "getCurrentGameId", "()Ljava/lang/Long;", "setCurrentGameId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onMenuClicked", "TournamentViewHolder", "app_debug"})
public final class TournamentAdapter extends io.realm.RealmRecyclerViewAdapter<com.mongodb.app.Tournament, com.mongodb.app.TournamentAdapter.TournamentViewHolder> {
    private final io.realm.RealmConfiguration config = null;
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long currentGameId;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent intent = null;
    
    public TournamentAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.OrderedRealmCollection<com.mongodb.app.Tournament> data, @org.jetbrains.annotations.NotNull()
    io.realm.RealmConfiguration config, @org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.lang.Long currentGameId) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCurrentGameId() {
        return null;
    }
    
    public final void setCurrentGameId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.TournamentAdapter.TournamentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.TournamentAdapter.TournamentViewHolder holder, int position) {
    }
    
    private final void onMenuClicked(com.mongodb.app.TournamentAdapter.TournamentViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/app/TournamentAdapter$TournamentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/mongodb/app/TournamentAdapter;Landroid/view/View;)V", "id", "Lorg/bson/types/ObjectId;", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "menu", "Landroid/widget/RelativeLayout;", "getMenu", "()Landroid/widget/RelativeLayout;", "setMenu", "(Landroid/widget/RelativeLayout;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class TournamentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private org.bson.types.ObjectId id;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout menu;
        
        public TournamentViewHolder(@org.jetbrains.annotations.NotNull()
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
        public final android.widget.RelativeLayout getMenu() {
            return null;
        }
        
        public final void setMenu(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
    }
}
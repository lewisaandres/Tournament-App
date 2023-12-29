package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/mongodb/app/TournamentOwnsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/TournamentOwnsAdapter$ViewHolder;", "tourneyQuery", "Lio/realm/RealmList;", "Lcom/mongodb/app/Tournament;", "images", "", "(Lio/realm/RealmList;[I)V", "mListener", "Lcom/mongodb/app/TournamentOwnsAdapter$onItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "ViewHolder", "onItemClickListener", "app_debug"})
public final class TournamentOwnsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.TournamentOwnsAdapter.ViewHolder> {
    private io.realm.RealmList<com.mongodb.app.Tournament> tourneyQuery;
    private int[] images;
    private com.mongodb.app.TournamentOwnsAdapter.onItemClickListener mListener;
    
    public TournamentOwnsAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<com.mongodb.app.Tournament> tourneyQuery, @org.jetbrains.annotations.NotNull()
    int[] images) {
        super();
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.TournamentOwnsAdapter.onItemClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.TournamentOwnsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.TournamentOwnsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mongodb/app/TournamentOwnsAdapter$onItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface onItemClickListener {
        
        public abstract void onItemClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012R\u001a\u0010(\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/mongodb/app/TournamentOwnsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/mongodb/app/TournamentOwnsAdapter$onItemClickListener;", "(Lcom/mongodb/app/TournamentOwnsAdapter;Landroid/view/View;Lcom/mongodb/app/TournamentOwnsAdapter$onItemClickListener;)V", "cardview", "Landroidx/cardview/widget/CardView;", "getCardview", "()Landroidx/cardview/widget/CardView;", "setCardview", "(Landroidx/cardview/widget/CardView;)V", "itemDetail", "Landroid/widget/TextView;", "getItemDetail", "()Landroid/widget/TextView;", "setItemDetail", "(Landroid/widget/TextView;)V", "itemGameName", "getItemGameName", "setItemGameName", "itemHost", "getItemHost", "setItemHost", "itemImage", "Landroid/widget/ImageView;", "getItemImage", "()Landroid/widget/ImageView;", "setItemImage", "(Landroid/widget/ImageView;)V", "itemMoney", "getItemMoney", "setItemMoney", "itemPerson", "getItemPerson", "setItemPerson", "itemStartTime", "getItemStartTime", "setItemStartTime", "itemTitle", "getItemTitle", "setItemTitle", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView itemImage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemDetail;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemHost;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemStartTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemGameName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemPerson;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemMoney;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView cardview;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.mongodb.app.TournamentOwnsAdapter.onItemClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getItemImage() {
            return null;
        }
        
        public final void setItemImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemTitle() {
            return null;
        }
        
        public final void setItemTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemDetail() {
            return null;
        }
        
        public final void setItemDetail(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemHost() {
            return null;
        }
        
        public final void setItemHost(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemStartTime() {
            return null;
        }
        
        public final void setItemStartTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemGameName() {
            return null;
        }
        
        public final void setItemGameName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemPerson() {
            return null;
        }
        
        public final void setItemPerson(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemMoney() {
            return null;
        }
        
        public final void setItemMoney(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCardview() {
            return null;
        }
        
        public final void setCardview(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
    }
}
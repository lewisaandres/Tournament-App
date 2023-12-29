package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\fR\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/mongodb/app/TournamentPageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/TournamentPageAdapter$ViewHolder;", "title", "", "", "details", "images", "", "([Ljava/lang/String;[Ljava/lang/String;[I)V", "[Ljava/lang/String;", "mListener", "Lcom/mongodb/app/TournamentPageAdapter$onItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "ViewHolder", "onItemClickListener", "app_debug"})
public final class TournamentPageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.TournamentPageAdapter.ViewHolder> {
    private java.lang.String[] title;
    private java.lang.String[] details;
    private int[] images;
    private com.mongodb.app.TournamentPageAdapter.onItemClickListener mListener;
    
    public TournamentPageAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String[] title, @org.jetbrains.annotations.NotNull()
    java.lang.String[] details, @org.jetbrains.annotations.NotNull()
    int[] images) {
        super();
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.TournamentPageAdapter.onItemClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.TournamentPageAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.TournamentPageAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mongodb/app/TournamentPageAdapter$onItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface onItemClickListener {
        
        public abstract void onItemClick(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/mongodb/app/TournamentPageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/mongodb/app/TournamentPageAdapter$onItemClickListener;", "(Lcom/mongodb/app/TournamentPageAdapter;Landroid/view/View;Lcom/mongodb/app/TournamentPageAdapter$onItemClickListener;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "setDescription", "(Landroid/widget/TextView;)V", "headerTitle", "getHeaderTitle", "setHeaderTitle", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView headerTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView icon;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.mongodb.app.TournamentPageAdapter.onItemClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getHeaderTitle() {
            return null;
        }
        
        public final void setHeaderTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
    }
}
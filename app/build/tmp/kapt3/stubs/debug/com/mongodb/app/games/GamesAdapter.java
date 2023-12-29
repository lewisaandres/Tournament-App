package com.mongodb.app.games;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/mongodb/app/games/GamesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/mongodb/app/games/Game;", "Lcom/mongodb/app/games/GamesAdapter$GameViewHolder;", "onClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GameViewHolder", "app_debug"})
public final class GamesAdapter extends androidx.recyclerview.widget.ListAdapter<com.mongodb.app.games.Game, com.mongodb.app.games.GamesAdapter.GameViewHolder> {
    private final kotlin.jvm.functions.Function1<com.mongodb.app.games.Game, kotlin.Unit> onClick = null;
    
    public GamesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.mongodb.app.games.Game, kotlin.Unit> onClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.games.GamesAdapter.GameViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.games.GamesAdapter.GameViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/mongodb/app/games/GamesAdapter$GameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClick", "Lkotlin/Function1;", "Lcom/mongodb/app/games/Game;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "currentGame", "gameImageView", "Landroid/widget/ImageView;", "gameTextView", "Landroid/widget/TextView;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "bind", "game", "app_debug"})
    public static final class GameViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.mongodb.app.games.Game, kotlin.Unit> onClick = null;
        private final android.widget.TextView gameTextView = null;
        private final android.widget.ImageView gameImageView = null;
        private com.mongodb.app.games.Game currentGame;
        
        public GameViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.mongodb.app.games.Game, kotlin.Unit> onClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.mongodb.app.games.Game, kotlin.Unit> getOnClick() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.mongodb.app.games.Game game) {
        }
    }
}
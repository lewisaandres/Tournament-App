package com.mongodb.app.games;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0012J\r\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/mongodb/app/games/GameDataSource;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "gamesLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/mongodb/app/games/Game;", "kotlin.jvm.PlatformType", "initialGameList", "addGame", "", "game", "getGameForId", "id", "", "getGameList", "Landroidx/lifecycle/LiveData;", "getRandomGameImageAsset", "", "()Ljava/lang/Integer;", "removeGame", "Companion", "app_debug"})
public final class GameDataSource {
    private final java.util.List<com.mongodb.app.games.Game> initialGameList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.mongodb.app.games.Game>> gamesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.mongodb.app.games.GameDataSource.Companion Companion = null;
    private static com.mongodb.app.games.GameDataSource INSTANCE;
    
    public GameDataSource(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        super();
    }
    
    public final void addGame(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.games.Game game) {
    }
    
    public final void removeGame(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.games.Game game) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mongodb.app.games.Game getGameForId(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.mongodb.app.games.Game>> getGameList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRandomGameImageAsset() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/mongodb/app/games/GameDataSource$Companion;", "", "()V", "INSTANCE", "Lcom/mongodb/app/games/GameDataSource;", "getDataSource", "resources", "Landroid/content/res/Resources;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mongodb.app.games.GameDataSource getDataSource(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources resources) {
            return null;
        }
    }
}
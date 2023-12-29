package com.mongodb.app.games;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/mongodb/app/games/GamesListViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/mongodb/app/games/GameDataSource;", "(Lcom/mongodb/app/games/GameDataSource;)V", "getDataSource", "()Lcom/mongodb/app/games/GameDataSource;", "gameLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/mongodb/app/games/Game;", "getGameLiveData", "()Landroidx/lifecycle/LiveData;", "insertGame", "", "gameName", "", "gameDescription", "app_debug"})
public final class GamesListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.mongodb.app.games.GameDataSource dataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.mongodb.app.games.Game>> gameLiveData = null;
    
    public GamesListViewModel(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.games.GameDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.app.games.GameDataSource getDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.mongodb.app.games.Game>> getGameLiveData() {
        return null;
    }
    
    public final void insertGame(@org.jetbrains.annotations.Nullable()
    java.lang.String gameName, @org.jetbrains.annotations.Nullable()
    java.lang.String gameDescription) {
    }
}
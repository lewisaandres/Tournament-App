package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/mongodb/app/GameDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "datasource", "Lcom/mongodb/app/games/GameDataSource;", "(Lcom/mongodb/app/games/GameDataSource;)V", "getGameForId", "Lcom/mongodb/app/games/Game;", "id", "", "removeGame", "", "game", "app_debug"})
public final class GameDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.mongodb.app.games.GameDataSource datasource = null;
    
    public GameDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.games.GameDataSource datasource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mongodb.app.games.Game getGameForId(long id) {
        return null;
    }
    
    public final void removeGame(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.games.Game game) {
    }
}
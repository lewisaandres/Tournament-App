package com.mongodb.app.games;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/app/games/GamesListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "gamesListViewModel", "Lcom/mongodb/app/games/GamesListViewModel;", "getGamesListViewModel", "()Lcom/mongodb/app/games/GamesListViewModel;", "gamesListViewModel$delegate", "Lkotlin/Lazy;", "newGameActivityRequestCode", "", "adapterOnClick", "", "game", "Lcom/mongodb/app/games/Game;", "onActivityResult", "requestCode", "resultCode", "intentData", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class GamesListActivity extends androidx.appcompat.app.AppCompatActivity {
    private final int newGameActivityRequestCode = 1;
    private final kotlin.Lazy gamesListViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public GamesListActivity() {
        super();
    }
    
    private final com.mongodb.app.games.GamesListViewModel getGamesListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void adapterOnClick(com.mongodb.app.games.Game game) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intentData) {
    }
}
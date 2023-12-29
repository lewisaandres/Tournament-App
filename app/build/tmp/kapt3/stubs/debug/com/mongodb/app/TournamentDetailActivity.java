package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/mongodb/app/TournamentDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "gameDetailViewModel", "Lcom/mongodb/app/GameDetailViewModel;", "getGameDetailViewModel", "()Lcom/mongodb/app/GameDetailViewModel;", "gameDetailViewModel$delegate", "Lkotlin/Lazy;", "gameImage", "Landroid/widget/ImageView;", "joinButton", "Landroid/widget/Button;", "prizePool", "Landroid/widget/TextView;", "tournamentDate", "tournamentName", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class TournamentDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.TextView tournamentName;
    private android.widget.TextView tournamentDate;
    private android.widget.TextView prizePool;
    private android.widget.Button joinButton;
    private android.widget.ImageView gameImage;
    private final kotlin.Lazy gameDetailViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public TournamentDetailActivity() {
        super();
    }
    
    private final com.mongodb.app.GameDetailViewModel getGameDetailViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}
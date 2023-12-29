package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\fH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/mongodb/app/TournamentPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/TournamentPageAdapter$ViewHolder;", "Lcom/mongodb/app/TournamentPageAdapter;", "join", "Landroid/widget/Button;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "moneySign", "", "participants", "Landroid/widget/TextView;", "prize", "tourneyGame", "tourneyImage", "Landroid/widget/ImageView;", "tourneyName", "user", "Lio/realm/mongodb/User;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setTourneyImage", "tourneyGameName", "app_debug"})
public final class TournamentPageActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.TournamentPageAdapter.ViewHolder> adapter;
    private android.widget.TextView participants;
    private android.widget.TextView tourneyName;
    private android.widget.TextView prize;
    private android.widget.TextView tourneyGame;
    private android.widget.ImageView tourneyImage;
    private java.lang.String moneySign = "$";
    private android.widget.Button join;
    private io.realm.mongodb.User user;
    private java.util.HashMap _$_findViewCache;
    
    public TournamentPageActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setTourneyImage(java.lang.String tourneyGameName) {
    }
}
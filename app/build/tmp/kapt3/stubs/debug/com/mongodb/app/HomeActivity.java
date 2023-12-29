package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\b\u00102\u001a\u00020-H\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J\b\u00105\u001a\u00020-H\u0002J\b\u00106\u001a\u00020-H\u0002J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0002J\b\u00109\u001a\u00020-H\u0002J\b\u0010:\u001a\u00020-H\u0002J\b\u0010;\u001a\u00020-H\u0002J\b\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007R\u00020\b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \f*\u0004\u0018\u00010 0 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R2\u0010%\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\'0\' \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\'0\'\u0018\u00010&0&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/mongodb/app/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activeButton", "Landroid/widget/Button;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/ActiveUpcomingAdapter$ViewHolder;", "Lcom/mongodb/app/ActiveUpcomingAdapter;", "brackets", "config", "Lio/realm/mongodb/sync/SyncConfiguration;", "kotlin.jvm.PlatformType", "getConfig", "()Lio/realm/mongodb/sync/SyncConfiguration;", "setConfig", "(Lio/realm/mongodb/sync/SyncConfiguration;)V", "createTournamentButton", "gPay", "group", "homeLogo", "Landroid/widget/ImageView;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "message", "partition", "", "payButton", "profileButton", "rankingButton", "rateButton", "realm", "Lio/realm/Realm;", "searchTournamentButton", "settingsButton", "suggestionButton", "tourneyPageButton", "tourneyQuery", "Lio/realm/RealmResults;", "Lcom/mongodb/app/Tournament;", "user", "Lio/realm/mongodb/User;", "userEmail", "Landroid/widget/TextView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTournamentButtonClicked", "onProfileButtonClicked", "onSearchTournamentButtonClicked", "onSettingsButtonClicked", "toActiveTourney", "toBracketActivity", "toChatRoom", "toGroupPage", "toMemberRank", "toMyRatingsPage", "toPaypalPage", "toSuggetionPage", "toTimerPage", "toTourneyPage", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.Button searchTournamentButton;
    private android.widget.Button createTournamentButton;
    private android.widget.Button settingsButton;
    private android.widget.Button profileButton;
    private android.widget.Button activeButton;
    private android.widget.Button suggestionButton;
    private android.widget.Button rankingButton;
    private android.widget.Button payButton;
    private android.widget.Button brackets;
    private android.widget.Button tourneyPageButton;
    private android.widget.Button group;
    private android.widget.Button message;
    private android.widget.TextView userEmail;
    private android.widget.Button rateButton;
    private android.widget.Button gPay;
    private android.widget.ImageView homeLogo;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.ActiveUpcomingAdapter.ViewHolder> adapter;
    private io.realm.mongodb.User user;
    private java.lang.String partition = "123";
    private io.realm.mongodb.sync.SyncConfiguration config;
    private io.realm.Realm realm;
    private io.realm.RealmResults<com.mongodb.app.Tournament> tourneyQuery;
    private java.util.HashMap _$_findViewCache;
    
    public HomeActivity() {
        super();
    }
    
    public final io.realm.mongodb.sync.SyncConfiguration getConfig() {
        return null;
    }
    
    public final void setConfig(io.realm.mongodb.sync.SyncConfiguration p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toMyRatingsPage() {
    }
    
    private final void toChatRoom() {
    }
    
    private final void toGroupPage() {
    }
    
    private final void toTimerPage() {
    }
    
    private final void toTourneyPage() {
    }
    
    private final void toActiveTourney() {
    }
    
    private final void toPaypalPage() {
    }
    
    private final void toMemberRank() {
    }
    
    private final void toSuggetionPage() {
    }
    
    private final void onSearchTournamentButtonClicked() {
    }
    
    private final void onCreateTournamentButtonClicked() {
    }
    
    private final void toBracketActivity() {
    }
    
    private final void onSettingsButtonClicked() {
    }
    
    private final void onProfileButtonClicked() {
    }
}
package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/mongodb/app/NewProfile;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "config", "Lio/realm/RealmConfiguration;", "currentExperience", "", "follow", "Landroid/widget/TextView;", "level", "", "maxLevelExp", "profileEmail", "profileName", "progressBar", "Landroid/widget/ProgressBar;", "rating", "Landroid/widget/Button;", "tIn", "tOwn", "userLevel", "userRealm", "Lio/realm/Realm;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showTournamentsIn", "showTournamentsOwn", "toFollowingPage", "toRatingsPage", "app_debug"})
public final class NewProfile extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.TextView profileName;
    private android.widget.TextView profileEmail;
    private android.widget.TextView follow;
    private android.widget.Button tIn;
    private android.widget.Button tOwn;
    private io.realm.Realm userRealm;
    private io.realm.RealmConfiguration config;
    private android.widget.Button rating;
    private android.widget.TextView userLevel;
    private double currentExperience = 35.0;
    private double maxLevelExp = 100.0;
    private int level = 1;
    private android.widget.ProgressBar progressBar;
    private java.util.HashMap _$_findViewCache;
    
    public NewProfile() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toRatingsPage() {
    }
    
    private final void showTournamentsOwn() {
    }
    
    private final void showTournamentsIn() {
    }
    
    private final void toFollowingPage() {
    }
}
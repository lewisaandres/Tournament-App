package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020 H\u0016J\u0012\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020\nH\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020\"H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/mongodb/app/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "builder", "Landroid/app/Notification$Builder;", "getBuilder", "()Landroid/app/Notification$Builder;", "setBuilder", "(Landroid/app/Notification$Builder;)V", "channelId", "", "description", "loginButton", "Landroid/widget/Button;", "notificationChannel", "Landroid/app/NotificationChannel;", "getNotificationChannel", "()Landroid/app/NotificationChannel;", "setNotificationChannel", "(Landroid/app/NotificationChannel;)V", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V", "notifyButton", "password", "Landroid/widget/EditText;", "registerButton", "username", "logIn", "", "createUser", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginFailed", "errorMsg", "onLoginSuccess", "toRegisterActivity", "validateCredentials", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText username;
    private android.widget.EditText password;
    private android.widget.Button loginButton;
    private android.widget.Button registerButton;
    private android.widget.Button notifyButton;
    public android.app.NotificationManager notificationManager;
    public android.app.NotificationChannel notificationChannel;
    public android.app.Notification.Builder builder;
    private final java.lang.String channelId = "i.apps.notifications";
    private final java.lang.String description = "Test notification";
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    public final void setNotificationManager(@org.jetbrains.annotations.NotNull()
    android.app.NotificationManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.NotificationChannel getNotificationChannel() {
        return null;
    }
    
    public final void setNotificationChannel(@org.jetbrains.annotations.NotNull()
    android.app.NotificationChannel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification.Builder getBuilder() {
        return null;
    }
    
    public final void setBuilder(@org.jetbrains.annotations.NotNull()
    android.app.Notification.Builder p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void toRegisterActivity() {
    }
    
    private final void onLoginSuccess() {
    }
    
    private final void onLoginFailed(java.lang.String errorMsg) {
    }
    
    private final boolean validateCredentials() {
        return false;
    }
    
    private final void logIn(boolean createUser) {
    }
}
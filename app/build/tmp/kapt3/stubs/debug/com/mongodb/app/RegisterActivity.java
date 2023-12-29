package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/mongodb/app/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "alreadyHaveAccountButton", "Landroid/widget/Button;", "confirmEmail", "Landroid/widget/EditText;", "confirmPassword", "email", "password", "regButton", "username", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDisplayMessage", "message", "", "toLoginActivity", "toRegister", "createUser", "", "validateNonEmptyInputs", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText username;
    private android.widget.EditText password;
    private android.widget.EditText confirmPassword;
    private android.widget.EditText confirmEmail;
    private android.widget.EditText email;
    private android.widget.Button regButton;
    private android.widget.Button alreadyHaveAccountButton;
    private java.util.HashMap _$_findViewCache;
    
    public RegisterActivity() {
        super();
    }
    
    /**
     * onCreate function responsible for creating this activity
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Goes to login activity page
     */
    private final void toLoginActivity() {
    }
    
    /**
     * Displays string whenever an event happens such as tapping on a button
     */
    private final void onDisplayMessage(java.lang.String message) {
    }
    
    /**
     * Checks in the input text area from user if it's empty or not
     */
    private final boolean validateNonEmptyInputs() {
        return false;
    }
    
    /**
     * To register new users using username, email, and password.
     * Checks if user is creating new user and then registers the user in the mongodb database
     */
    private final void toRegister(boolean createUser) {
    }
}
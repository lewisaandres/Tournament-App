package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/mongodb/app/RankingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "config", "Lio/realm/RealmConfiguration;", "listView", "Landroid/widget/ListView;", "userRealm", "Lio/realm/Realm;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "MyCustomAdapter", "app_debug"})
public final class RankingActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.realm.Realm userRealm;
    private io.realm.RealmConfiguration config;
    private android.widget.ListView listView;
    private java.util.HashMap _$_findViewCache;
    
    public RankingActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Destroys the User Realm when exiting the activity
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\rH\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/mongodb/app/RankingActivity$MyCustomAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "users", "Lio/realm/RealmResults;", "Lcom/mongodb/app/User;", "(Landroid/content/Context;Lio/realm/RealmResults;)V", "mContext", "names", "Ljava/util/ArrayList;", "", "getCount", "", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "viewGroup", "Landroid/view/ViewGroup;", "app_debug"})
    static final class MyCustomAdapter extends android.widget.BaseAdapter {
        private io.realm.RealmResults<com.mongodb.app.User> users;
        private final android.content.Context mContext = null;
        private final java.util.ArrayList<java.lang.String> names = null;
        
        public MyCustomAdapter(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        io.realm.RealmResults<com.mongodb.app.User> users) {
            super();
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Object getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public long getItemId(int position) {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
        android.view.View convertView, @org.jetbrains.annotations.Nullable()
        android.view.ViewGroup viewGroup) {
            return null;
        }
    }
}
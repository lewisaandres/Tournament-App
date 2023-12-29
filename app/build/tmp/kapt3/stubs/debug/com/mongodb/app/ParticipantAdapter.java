package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/app/ParticipantAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mongodb/app/ParticipantAdapter$MemberViewHolder;", "data", "Ljava/util/ArrayList;", "Lcom/mongodb/app/Participant;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "parent", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "setParent", "(Landroid/view/ViewGroup;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "viewType", "MemberViewHolder", "app_debug"})
public final class ParticipantAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mongodb.app.ParticipantAdapter.MemberViewHolder> {
    private final java.util.ArrayList<com.mongodb.app.Participant> data = null;
    public android.view.ViewGroup parent;
    
    public ParticipantAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.mongodb.app.Participant> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getParent() {
        return null;
    }
    
    public final void setParent(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mongodb.app.ParticipantAdapter.MemberViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mongodb.app.ParticipantAdapter.MemberViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/mongodb/app/ParticipantAdapter$MemberViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/mongodb/app/ParticipantAdapter;Landroid/view/View;)V", "data", "Lcom/mongodb/app/Participant;", "getData", "()Lcom/mongodb/app/Participant;", "setData", "(Lcom/mongodb/app/Participant;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class MemberViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.Nullable()
        private com.mongodb.app.Participant data;
        
        public MemberViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mongodb.app.Participant getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        com.mongodb.app.Participant p0) {
        }
    }
}
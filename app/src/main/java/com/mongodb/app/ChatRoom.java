package com.mongodb.app;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cometchat.pro.core.AppSettings;
import com.cometchat.pro.core.CometChat;
import com.cometchat.pro.exceptions.CometChatException;
import com.mongodb.app.ChatConstants.ChatConstants;
import com.cometchat.pro.models.User;

public class ChatRoom extends AppCompatActivity {

    private static final String TAG = "Error loggin in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
        initCometChat();
        initViews();
    }

    private void initViews() {
        EditText userIdEditText = findViewById(R.id.userIdEditText);
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(view -> { CometChat.login(userIdEditText.getText().toString(), ChatConstants.API_KEY, new CometChat.CallbackListener<User>() {

                    @Override
                    public void onSuccess(User user) {
                        redirectToGroupListScreen();

                    }

                    @Override
                    public void onError(CometChatException e) {

                    }
                });
        });
    }

    private void redirectToGroupListScreen() {
        GroupListActivity.start(this);
    }

    private void initCometChat() {
        String appID = ChatConstants.APP_ID; // Replace with your App ID
        String region = ChatConstants.REGION; // Replace with your App Region ("eu" or "us")

        AppSettings appSettings=new AppSettings.AppSettingsBuilder()
                .subscribePresenceForAllUsers()
                .setRegion(region)
                .autoEstablishSocketConnection(true)
                .build();

        CometChat.init(this, appID,appSettings, new CometChat.CallbackListener<String>() {
            @Override
            public void onSuccess(String successMessage) {

            }
            @Override
            public void onError(CometChatException e) {

            }
        });
    }
}
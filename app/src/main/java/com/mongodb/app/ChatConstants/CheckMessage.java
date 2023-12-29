package com.mongodb.app.ChatConstants;

import java.util.Locale;

public class CheckMessage {
    private String badWords[] = {"fuck", "bitch", "asshole", "cunt",
                                "shit", "piss", "dick", "bastard", "cock",
                                "slut", "whore", "nigga", "nigger", "cracker", "wetback",
                                "chink"};
    private String replaceWord = "****";

    public CheckMessage() {
    }

    public String getReplaceWord(String message) {
        for(int i = 0; i < badWords.length; i++) {
            message = message.toLowerCase();
            if (message.contains(badWords[i])) {
                message = message.replace(badWords[i], replaceWord);
            }
        }
        return  message;
    }

}

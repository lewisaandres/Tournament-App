// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatRoomBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText userIdEditText;

  private ActivityChatRoomBinding(@NonNull ConstraintLayout rootView, @NonNull Button loginButton,
      @NonNull EditText userIdEditText) {
    this.rootView = rootView;
    this.loginButton = loginButton;
    this.userIdEditText = userIdEditText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat_room, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatRoomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loginButton;
      Button loginButton = rootView.findViewById(id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.userIdEditText;
      EditText userIdEditText = rootView.findViewById(id);
      if (userIdEditText == null) {
        break missingId;
      }

      return new ActivityChatRoomBinding((ConstraintLayout) rootView, loginButton, userIdEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

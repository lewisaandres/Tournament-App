// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView AppName;

  @NonNull
  public final TextView builtWithSync;

  @NonNull
  public final Button buttonCreateLogin;

  @NonNull
  public final Button buttonExistingAccount;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final EditText inputUsername;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView AppName,
      @NonNull TextView builtWithSync, @NonNull Button buttonCreateLogin,
      @NonNull Button buttonExistingAccount, @NonNull ConstraintLayout container,
      @NonNull EditText inputPassword, @NonNull EditText inputUsername) {
    this.rootView = rootView;
    this.AppName = AppName;
    this.builtWithSync = builtWithSync;
    this.buttonCreateLogin = buttonCreateLogin;
    this.buttonExistingAccount = buttonExistingAccount;
    this.container = container;
    this.inputPassword = inputPassword;
    this.inputUsername = inputUsername;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AppName;
      TextView AppName = rootView.findViewById(id);
      if (AppName == null) {
        break missingId;
      }

      id = R.id.builtWithSync;
      TextView builtWithSync = rootView.findViewById(id);
      if (builtWithSync == null) {
        break missingId;
      }

      id = R.id.button_create_login;
      Button buttonCreateLogin = rootView.findViewById(id);
      if (buttonCreateLogin == null) {
        break missingId;
      }

      id = R.id.button_existing_account;
      Button buttonExistingAccount = rootView.findViewById(id);
      if (buttonExistingAccount == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.input_password;
      EditText inputPassword = rootView.findViewById(id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.input_username;
      EditText inputUsername = rootView.findViewById(id);
      if (inputUsername == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, AppName, builtWithSync,
          buttonCreateLogin, buttonExistingAccount, container, inputPassword, inputUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
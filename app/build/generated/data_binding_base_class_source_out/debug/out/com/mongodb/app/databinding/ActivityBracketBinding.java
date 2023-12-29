// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import com.ventura.bracketslib.BracketsView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBracketBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BracketsView bracketView;

  @NonNull
  public final Toolbar toolbarCurrentTournament;

  private ActivityBracketBinding(@NonNull ConstraintLayout rootView,
      @NonNull BracketsView bracketView, @NonNull Toolbar toolbarCurrentTournament) {
    this.rootView = rootView;
    this.bracketView = bracketView;
    this.toolbarCurrentTournament = toolbarCurrentTournament;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBracketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBracketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bracket, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBracketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bracket_view;
      BracketsView bracketView = rootView.findViewById(id);
      if (bracketView == null) {
        break missingId;
      }

      id = R.id.toolbar_CurrentTournament;
      Toolbar toolbarCurrentTournament = rootView.findViewById(id);
      if (toolbarCurrentTournament == null) {
        break missingId;
      }

      return new ActivityBracketBinding((ConstraintLayout) rootView, bracketView,
          toolbarCurrentTournament);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
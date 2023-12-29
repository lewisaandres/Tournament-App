// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTournamentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView tournamentList;

  @NonNull
  public final Toolbar tournamentMenu;

  private ActivityTournamentBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView tournamentList, @NonNull Toolbar tournamentMenu) {
    this.rootView = rootView;
    this.tournamentList = tournamentList;
    this.tournamentMenu = tournamentMenu;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTournamentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTournamentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tournament, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTournamentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tournament_list;
      RecyclerView tournamentList = rootView.findViewById(id);
      if (tournamentList == null) {
        break missingId;
      }

      id = R.id.tournament_menu;
      Toolbar tournamentMenu = rootView.findViewById(id);
      if (tournamentMenu == null) {
        break missingId;
      }

      return new ActivityTournamentBinding((ConstraintLayout) rootView, tournamentList,
          tournamentMenu);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

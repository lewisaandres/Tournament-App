// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RatingItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView ratingDescription;

  private RatingItemBinding(@NonNull ConstraintLayout rootView, @NonNull RatingBar ratingBar,
      @NonNull TextView ratingDescription) {
    this.rootView = rootView;
    this.ratingBar = ratingBar;
    this.ratingDescription = ratingDescription;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RatingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RatingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rating_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RatingItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ratingBar;
      RatingBar ratingBar = rootView.findViewById(id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.ratingDescription;
      TextView ratingDescription = rootView.findViewById(id);
      if (ratingDescription == null) {
        break missingId;
      }

      return new RatingItemBinding((ConstraintLayout) rootView, ratingBar, ratingDescription);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
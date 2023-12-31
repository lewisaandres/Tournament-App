// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityRatingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText description;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView organizer;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final Button submit;

  private ActivityRatingBinding(@NonNull ConstraintLayout rootView, @NonNull EditText description,
      @NonNull ImageView imageView, @NonNull TextView organizer, @NonNull RatingBar ratingBar,
      @NonNull Button submit) {
    this.rootView = rootView;
    this.description = description;
    this.imageView = imageView;
    this.organizer = organizer;
    this.ratingBar = ratingBar;
    this.submit = submit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRatingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_rating, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRatingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.description;
      EditText description = rootView.findViewById(id);
      if (description == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.organizer;
      TextView organizer = rootView.findViewById(id);
      if (organizer == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = rootView.findViewById(id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.submit;
      Button submit = rootView.findViewById(id);
      if (submit == null) {
        break missingId;
      }

      return new ActivityRatingBinding((ConstraintLayout) rootView, description, imageView,
          organizer, ratingBar, submit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

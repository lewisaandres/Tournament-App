// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckoutPayBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView detailDescription;

  @NonNull
  public final TextView detailPrice;

  @NonNull
  public final TextView detailTitle;

  @NonNull
  public final BuyWithGooglepayButtonBinding googlePayButton;

  private ActivityCheckoutPayBinding(@NonNull ScrollView rootView,
      @NonNull TextView detailDescription, @NonNull TextView detailPrice,
      @NonNull TextView detailTitle, @NonNull BuyWithGooglepayButtonBinding googlePayButton) {
    this.rootView = rootView;
    this.detailDescription = detailDescription;
    this.detailPrice = detailPrice;
    this.detailTitle = detailTitle;
    this.googlePayButton = googlePayButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckoutPayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckoutPayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_checkout_pay, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckoutPayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.detailDescription;
      TextView detailDescription = rootView.findViewById(id);
      if (detailDescription == null) {
        break missingId;
      }

      id = R.id.detailPrice;
      TextView detailPrice = rootView.findViewById(id);
      if (detailPrice == null) {
        break missingId;
      }

      id = R.id.detailTitle;
      TextView detailTitle = rootView.findViewById(id);
      if (detailTitle == null) {
        break missingId;
      }

      id = R.id.googlePayButton;
      View googlePayButton = rootView.findViewById(id);
      if (googlePayButton == null) {
        break missingId;
      }
      BuyWithGooglepayButtonBinding binding_googlePayButton = BuyWithGooglepayButtonBinding.bind(googlePayButton);

      return new ActivityCheckoutPayBinding((ScrollView) rootView, detailDescription, detailPrice,
          detailTitle, binding_googlePayButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

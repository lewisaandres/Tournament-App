// Generated by view binder compiler. Do not edit!
package com.mongodb.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.mongodb.app.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class BuyWithGooglepayButtonBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  private BuyWithGooglepayButtonBinding(@NonNull RelativeLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BuyWithGooglepayButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BuyWithGooglepayButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.buy_with_googlepay_button, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BuyWithGooglepayButtonBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new BuyWithGooglepayButtonBinding((RelativeLayout) rootView);
  }
}

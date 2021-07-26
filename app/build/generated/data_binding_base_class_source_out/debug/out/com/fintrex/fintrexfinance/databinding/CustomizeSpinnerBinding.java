// Generated by view binder compiler. Do not edit!
package com.fintrex.fintrexfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.fintrex.fintrexfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class CustomizeSpinnerBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView spinnertext;

  private CustomizeSpinnerBinding(@NonNull TextView rootView, @NonNull TextView spinnertext) {
    this.rootView = rootView;
    this.spinnertext = spinnertext;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomizeSpinnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomizeSpinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.customize_spinner, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomizeSpinnerBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView spinnertext = (TextView) rootView;

    return new CustomizeSpinnerBinding((TextView) rootView, spinnertext);
  }
}

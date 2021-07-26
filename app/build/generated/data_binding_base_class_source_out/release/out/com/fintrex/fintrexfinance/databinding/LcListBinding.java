// Generated by view binder compiler. Do not edit!
package com.fintrex.fintrexfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.fintrex.fintrexfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LcListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear2;

  @NonNull
  public final LinearLayout linear3;

  @NonNull
  public final TextView textLcAmount;

  @NonNull
  public final TextView textLcMaturity;

  @NonNull
  public final TextView textLcNo;

  @NonNull
  public final TextView topicLcAmount;

  @NonNull
  public final TextView topicLcMaturity;

  @NonNull
  public final TextView topicLcNo;

  private LcListBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout linear1,
      @NonNull LinearLayout linear2, @NonNull LinearLayout linear3, @NonNull TextView textLcAmount,
      @NonNull TextView textLcMaturity, @NonNull TextView textLcNo, @NonNull TextView topicLcAmount,
      @NonNull TextView topicLcMaturity, @NonNull TextView topicLcNo) {
    this.rootView = rootView;
    this.linear1 = linear1;
    this.linear2 = linear2;
    this.linear3 = linear3;
    this.textLcAmount = textLcAmount;
    this.textLcMaturity = textLcMaturity;
    this.textLcNo = textLcNo;
    this.topicLcAmount = topicLcAmount;
    this.topicLcMaturity = topicLcMaturity;
    this.topicLcNo = topicLcNo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LcListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LcListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.lc_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LcListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linear1;
      LinearLayout linear1 = rootView.findViewById(id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.linear2;
      LinearLayout linear2 = rootView.findViewById(id);
      if (linear2 == null) {
        break missingId;
      }

      id = R.id.linear3;
      LinearLayout linear3 = rootView.findViewById(id);
      if (linear3 == null) {
        break missingId;
      }

      id = R.id.textLcAmount;
      TextView textLcAmount = rootView.findViewById(id);
      if (textLcAmount == null) {
        break missingId;
      }

      id = R.id.textLcMaturity;
      TextView textLcMaturity = rootView.findViewById(id);
      if (textLcMaturity == null) {
        break missingId;
      }

      id = R.id.textLcNo;
      TextView textLcNo = rootView.findViewById(id);
      if (textLcNo == null) {
        break missingId;
      }

      id = R.id.topicLcAmount;
      TextView topicLcAmount = rootView.findViewById(id);
      if (topicLcAmount == null) {
        break missingId;
      }

      id = R.id.topicLcMaturity;
      TextView topicLcMaturity = rootView.findViewById(id);
      if (topicLcMaturity == null) {
        break missingId;
      }

      id = R.id.topicLcNo;
      TextView topicLcNo = rootView.findViewById(id);
      if (topicLcNo == null) {
        break missingId;
      }

      return new LcListBinding((LinearLayout) rootView, linear1, linear2, linear3, textLcAmount,
          textLcMaturity, textLcNo, topicLcAmount, topicLcMaturity, topicLcNo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

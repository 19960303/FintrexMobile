// Generated by view binder compiler. Do not edit!
package com.fintrex.fintrexfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.fintrex.fintrexfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ConstraintLayout expandableLayout;

  @NonNull
  public final LinearLayout leaseLinear;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear10;

  @NonNull
  public final LinearLayout linear11;

  @NonNull
  public final LinearLayout linear2;

  @NonNull
  public final LinearLayout linear3;

  @NonNull
  public final LinearLayout linear4;

  @NonNull
  public final LinearLayout linear5;

  @NonNull
  public final LinearLayout linear6;

  @NonNull
  public final LinearLayout linear7;

  @NonNull
  public final LinearLayout linear8;

  @NonNull
  public final LinearLayout linear9;

  @NonNull
  public final TextView textAssest;

  @NonNull
  public final TextView textCharges;

  @NonNull
  public final TextView textLeaseAmount;

  @NonNull
  public final TextView textLeaseNo;

  @NonNull
  public final TextView textMaturity;

  @NonNull
  public final TextView textOdi;

  @NonNull
  public final TextView textPeriod;

  @NonNull
  public final TextView textRentalAmount;

  @NonNull
  public final TextView textTotOut;

  @NonNull
  public final TextView textdueDate;

  @NonNull
  public final TextView textrentOut;

  @NonNull
  public final TextView topicDueDate;

  @NonNull
  public final TextView topicLeaseAmount;

  @NonNull
  public final TextView topicLeaseAssest;

  @NonNull
  public final TextView topicLeaseCharges;

  @NonNull
  public final TextView topicLeaseMaturity;

  @NonNull
  public final TextView topicLeaseNo;

  @NonNull
  public final TextView topicLeaseOdi;

  @NonNull
  public final TextView topicLeasePeriod;

  @NonNull
  public final TextView topicLeaseRental;

  @NonNull
  public final TextView topicLeaserentOut;

  @NonNull
  public final TextView topicTotOut;

  private ListViewBinding(@NonNull LinearLayout rootView,
      @NonNull ConstraintLayout expandableLayout, @NonNull LinearLayout leaseLinear,
      @NonNull LinearLayout linear1, @NonNull LinearLayout linear10, @NonNull LinearLayout linear11,
      @NonNull LinearLayout linear2, @NonNull LinearLayout linear3, @NonNull LinearLayout linear4,
      @NonNull LinearLayout linear5, @NonNull LinearLayout linear6, @NonNull LinearLayout linear7,
      @NonNull LinearLayout linear8, @NonNull LinearLayout linear9, @NonNull TextView textAssest,
      @NonNull TextView textCharges, @NonNull TextView textLeaseAmount,
      @NonNull TextView textLeaseNo, @NonNull TextView textMaturity, @NonNull TextView textOdi,
      @NonNull TextView textPeriod, @NonNull TextView textRentalAmount,
      @NonNull TextView textTotOut, @NonNull TextView textdueDate, @NonNull TextView textrentOut,
      @NonNull TextView topicDueDate, @NonNull TextView topicLeaseAmount,
      @NonNull TextView topicLeaseAssest, @NonNull TextView topicLeaseCharges,
      @NonNull TextView topicLeaseMaturity, @NonNull TextView topicLeaseNo,
      @NonNull TextView topicLeaseOdi, @NonNull TextView topicLeasePeriod,
      @NonNull TextView topicLeaseRental, @NonNull TextView topicLeaserentOut,
      @NonNull TextView topicTotOut) {
    this.rootView = rootView;
    this.expandableLayout = expandableLayout;
    this.leaseLinear = leaseLinear;
    this.linear1 = linear1;
    this.linear10 = linear10;
    this.linear11 = linear11;
    this.linear2 = linear2;
    this.linear3 = linear3;
    this.linear4 = linear4;
    this.linear5 = linear5;
    this.linear6 = linear6;
    this.linear7 = linear7;
    this.linear8 = linear8;
    this.linear9 = linear9;
    this.textAssest = textAssest;
    this.textCharges = textCharges;
    this.textLeaseAmount = textLeaseAmount;
    this.textLeaseNo = textLeaseNo;
    this.textMaturity = textMaturity;
    this.textOdi = textOdi;
    this.textPeriod = textPeriod;
    this.textRentalAmount = textRentalAmount;
    this.textTotOut = textTotOut;
    this.textdueDate = textdueDate;
    this.textrentOut = textrentOut;
    this.topicDueDate = topicDueDate;
    this.topicLeaseAmount = topicLeaseAmount;
    this.topicLeaseAssest = topicLeaseAssest;
    this.topicLeaseCharges = topicLeaseCharges;
    this.topicLeaseMaturity = topicLeaseMaturity;
    this.topicLeaseNo = topicLeaseNo;
    this.topicLeaseOdi = topicLeaseOdi;
    this.topicLeasePeriod = topicLeasePeriod;
    this.topicLeaseRental = topicLeaseRental;
    this.topicLeaserentOut = topicLeaserentOut;
    this.topicTotOut = topicTotOut;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expandableLayout;
      ConstraintLayout expandableLayout = rootView.findViewById(id);
      if (expandableLayout == null) {
        break missingId;
      }

      id = R.id.leaseLinear;
      LinearLayout leaseLinear = rootView.findViewById(id);
      if (leaseLinear == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = rootView.findViewById(id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.linear10;
      LinearLayout linear10 = rootView.findViewById(id);
      if (linear10 == null) {
        break missingId;
      }

      id = R.id.linear11;
      LinearLayout linear11 = rootView.findViewById(id);
      if (linear11 == null) {
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

      id = R.id.linear4;
      LinearLayout linear4 = rootView.findViewById(id);
      if (linear4 == null) {
        break missingId;
      }

      id = R.id.linear5;
      LinearLayout linear5 = rootView.findViewById(id);
      if (linear5 == null) {
        break missingId;
      }

      id = R.id.linear6;
      LinearLayout linear6 = rootView.findViewById(id);
      if (linear6 == null) {
        break missingId;
      }

      id = R.id.linear7;
      LinearLayout linear7 = rootView.findViewById(id);
      if (linear7 == null) {
        break missingId;
      }

      id = R.id.linear8;
      LinearLayout linear8 = rootView.findViewById(id);
      if (linear8 == null) {
        break missingId;
      }

      id = R.id.linear9;
      LinearLayout linear9 = rootView.findViewById(id);
      if (linear9 == null) {
        break missingId;
      }

      id = R.id.textAssest;
      TextView textAssest = rootView.findViewById(id);
      if (textAssest == null) {
        break missingId;
      }

      id = R.id.textCharges;
      TextView textCharges = rootView.findViewById(id);
      if (textCharges == null) {
        break missingId;
      }

      id = R.id.textLeaseAmount;
      TextView textLeaseAmount = rootView.findViewById(id);
      if (textLeaseAmount == null) {
        break missingId;
      }

      id = R.id.textLeaseNo;
      TextView textLeaseNo = rootView.findViewById(id);
      if (textLeaseNo == null) {
        break missingId;
      }

      id = R.id.textMaturity;
      TextView textMaturity = rootView.findViewById(id);
      if (textMaturity == null) {
        break missingId;
      }

      id = R.id.textOdi;
      TextView textOdi = rootView.findViewById(id);
      if (textOdi == null) {
        break missingId;
      }

      id = R.id.textPeriod;
      TextView textPeriod = rootView.findViewById(id);
      if (textPeriod == null) {
        break missingId;
      }

      id = R.id.textRentalAmount;
      TextView textRentalAmount = rootView.findViewById(id);
      if (textRentalAmount == null) {
        break missingId;
      }

      id = R.id.textTotOut;
      TextView textTotOut = rootView.findViewById(id);
      if (textTotOut == null) {
        break missingId;
      }

      id = R.id.textdueDate;
      TextView textdueDate = rootView.findViewById(id);
      if (textdueDate == null) {
        break missingId;
      }

      id = R.id.textrentOut;
      TextView textrentOut = rootView.findViewById(id);
      if (textrentOut == null) {
        break missingId;
      }

      id = R.id.topicDueDate;
      TextView topicDueDate = rootView.findViewById(id);
      if (topicDueDate == null) {
        break missingId;
      }

      id = R.id.topicLeaseAmount;
      TextView topicLeaseAmount = rootView.findViewById(id);
      if (topicLeaseAmount == null) {
        break missingId;
      }

      id = R.id.topicLeaseAssest;
      TextView topicLeaseAssest = rootView.findViewById(id);
      if (topicLeaseAssest == null) {
        break missingId;
      }

      id = R.id.topicLeaseCharges;
      TextView topicLeaseCharges = rootView.findViewById(id);
      if (topicLeaseCharges == null) {
        break missingId;
      }

      id = R.id.topicLeaseMaturity;
      TextView topicLeaseMaturity = rootView.findViewById(id);
      if (topicLeaseMaturity == null) {
        break missingId;
      }

      id = R.id.topicLeaseNo;
      TextView topicLeaseNo = rootView.findViewById(id);
      if (topicLeaseNo == null) {
        break missingId;
      }

      id = R.id.topicLeaseOdi;
      TextView topicLeaseOdi = rootView.findViewById(id);
      if (topicLeaseOdi == null) {
        break missingId;
      }

      id = R.id.topicLeasePeriod;
      TextView topicLeasePeriod = rootView.findViewById(id);
      if (topicLeasePeriod == null) {
        break missingId;
      }

      id = R.id.topicLeaseRental;
      TextView topicLeaseRental = rootView.findViewById(id);
      if (topicLeaseRental == null) {
        break missingId;
      }

      id = R.id.topicLeaserentOut;
      TextView topicLeaserentOut = rootView.findViewById(id);
      if (topicLeaserentOut == null) {
        break missingId;
      }

      id = R.id.topicTotOut;
      TextView topicTotOut = rootView.findViewById(id);
      if (topicTotOut == null) {
        break missingId;
      }

      return new ListViewBinding((LinearLayout) rootView, expandableLayout, leaseLinear, linear1,
          linear10, linear11, linear2, linear3, linear4, linear5, linear6, linear7, linear8,
          linear9, textAssest, textCharges, textLeaseAmount, textLeaseNo, textMaturity, textOdi,
          textPeriod, textRentalAmount, textTotOut, textdueDate, textrentOut, topicDueDate,
          topicLeaseAmount, topicLeaseAssest, topicLeaseCharges, topicLeaseMaturity, topicLeaseNo,
          topicLeaseOdi, topicLeasePeriod, topicLeaseRental, topicLeaserentOut, topicTotOut);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

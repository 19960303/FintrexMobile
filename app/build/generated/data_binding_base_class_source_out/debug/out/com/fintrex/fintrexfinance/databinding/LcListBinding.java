// Generated by view binder compiler. Do not edit!
package com.fintrex.fintrexfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.fintrex.fintrexfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LcListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Spinner savAccountTypeSpinner;

  @NonNull
  public final AppCompatButton savSubmit;

  @NonNull
  public final AppCompatEditText savingFullname;

  @NonNull
  public final AppCompatEditText savingNic;

  @NonNull
  public final AppCompatEditText savingaddress;

  @NonNull
  public final AppCompatEditText savingmobile;

  private LcListBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout linearLayout,
      @NonNull Spinner savAccountTypeSpinner, @NonNull AppCompatButton savSubmit,
      @NonNull AppCompatEditText savingFullname, @NonNull AppCompatEditText savingNic,
      @NonNull AppCompatEditText savingaddress, @NonNull AppCompatEditText savingmobile) {
    this.rootView = rootView;
    this.linearLayout = linearLayout;
    this.savAccountTypeSpinner = savAccountTypeSpinner;
    this.savSubmit = savSubmit;
    this.savingFullname = savingFullname;
    this.savingNic = savingNic;
    this.savingaddress = savingaddress;
    this.savingmobile = savingmobile;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
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
      id = R.id.linearLayout;
      LinearLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.savAccountTypeSpinner;
      Spinner savAccountTypeSpinner = rootView.findViewById(id);
      if (savAccountTypeSpinner == null) {
        break missingId;
      }

      id = R.id.savSubmit;
      AppCompatButton savSubmit = rootView.findViewById(id);
      if (savSubmit == null) {
        break missingId;
      }

      id = R.id.savingFullname;
      AppCompatEditText savingFullname = rootView.findViewById(id);
      if (savingFullname == null) {
        break missingId;
      }

      id = R.id.savingNic;
      AppCompatEditText savingNic = rootView.findViewById(id);
      if (savingNic == null) {
        break missingId;
      }

      id = R.id.savingaddress;
      AppCompatEditText savingaddress = rootView.findViewById(id);
      if (savingaddress == null) {
        break missingId;
      }

      id = R.id.savingmobile;
      AppCompatEditText savingmobile = rootView.findViewById(id);
      if (savingmobile == null) {
        break missingId;
      }

      return new LcListBinding((ConstraintLayout) rootView, linearLayout, savAccountTypeSpinner,
          savSubmit, savingFullname, savingNic, savingaddress, savingmobile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

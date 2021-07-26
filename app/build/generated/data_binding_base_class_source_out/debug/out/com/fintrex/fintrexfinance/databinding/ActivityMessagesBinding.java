// Generated by view binder compiler. Do not edit!
package com.fintrex.fintrexfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.fintrex.fintrexfinance.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMessagesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear2;

  @NonNull
  public final LinearLayout linear3;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final ImageView messageback;

  @NonNull
  public final AppCompatEditText msg;

  @NonNull
  public final AppCompatButton sendButton;

  @NonNull
  public final AppCompatEditText senderMobile;

  @NonNull
  public final AppCompatEditText senderName;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivityMessagesBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView2,
      @NonNull LinearLayout linear1, @NonNull LinearLayout linear2, @NonNull LinearLayout linear3,
      @NonNull ConstraintLayout linearLayout, @NonNull ImageView menu,
      @NonNull ImageView messageback, @NonNull AppCompatEditText msg,
      @NonNull AppCompatButton sendButton, @NonNull AppCompatEditText senderMobile,
      @NonNull AppCompatEditText senderName, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.imageView2 = imageView2;
    this.linear1 = linear1;
    this.linear2 = linear2;
    this.linear3 = linear3;
    this.linearLayout = linearLayout;
    this.menu = menu;
    this.messageback = messageback;
    this.msg = msg;
    this.sendButton = sendButton;
    this.senderMobile = senderMobile;
    this.senderName = senderName;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMessagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMessagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_messages, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMessagesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

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

      id = R.id.linearLayout;
      ConstraintLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageView menu = rootView.findViewById(id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.messageback;
      ImageView messageback = rootView.findViewById(id);
      if (messageback == null) {
        break missingId;
      }

      id = R.id.msg;
      AppCompatEditText msg = rootView.findViewById(id);
      if (msg == null) {
        break missingId;
      }

      id = R.id.sendButton;
      AppCompatButton sendButton = rootView.findViewById(id);
      if (sendButton == null) {
        break missingId;
      }

      id = R.id.senderMobile;
      AppCompatEditText senderMobile = rootView.findViewById(id);
      if (senderMobile == null) {
        break missingId;
      }

      id = R.id.senderName;
      AppCompatEditText senderName = rootView.findViewById(id);
      if (senderName == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMessagesBinding((ConstraintLayout) rootView, imageView2, linear1, linear2,
          linear3, linearLayout, menu, messageback, msg, sendButton, senderMobile, senderName,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

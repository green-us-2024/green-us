// Generated by view binder compiler. Do not edit!
package kr.ac.kpu.green_us.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kpu.green_us.R;

public final class ActivityPointWithdrawBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText accountHolder;

  @NonNull
  public final EditText bank;

  @NonNull
  public final ImageView btnEsc;

  @NonNull
  public final Button complete;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final EditText withdrawPoint;

  private ActivityPointWithdrawBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText accountHolder, @NonNull EditText bank, @NonNull ImageView btnEsc,
      @NonNull Button complete, @NonNull ConstraintLayout constraintLayout,
      @NonNull EditText withdrawPoint) {
    this.rootView = rootView;
    this.accountHolder = accountHolder;
    this.bank = bank;
    this.btnEsc = btnEsc;
    this.complete = complete;
    this.constraintLayout = constraintLayout;
    this.withdrawPoint = withdrawPoint;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPointWithdrawBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPointWithdrawBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_point_withdraw, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPointWithdrawBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.account_holder;
      EditText accountHolder = ViewBindings.findChildViewById(rootView, id);
      if (accountHolder == null) {
        break missingId;
      }

      id = R.id.bank;
      EditText bank = ViewBindings.findChildViewById(rootView, id);
      if (bank == null) {
        break missingId;
      }

      id = R.id.btn_esc;
      ImageView btnEsc = ViewBindings.findChildViewById(rootView, id);
      if (btnEsc == null) {
        break missingId;
      }

      id = R.id.complete;
      Button complete = ViewBindings.findChildViewById(rootView, id);
      if (complete == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.withdraw_point;
      EditText withdrawPoint = ViewBindings.findChildViewById(rootView, id);
      if (withdrawPoint == null) {
        break missingId;
      }

      return new ActivityPointWithdrawBinding((ConstraintLayout) rootView, accountHolder, bank,
          btnEsc, complete, constraintLayout, withdrawPoint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

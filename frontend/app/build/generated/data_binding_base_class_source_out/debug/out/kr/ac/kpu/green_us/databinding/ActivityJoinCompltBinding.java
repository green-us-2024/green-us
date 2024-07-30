// Generated by view binder compiler. Do not edit!
package kr.ac.kpu.green_us.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kpu.green_us.R;

public final class ActivityJoinCompltBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnGoLogin;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView tvJoinComplt;

  @NonNull
  public final TextView tvWelcome;

  private ActivityJoinCompltBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnGoLogin,
      @NonNull ConstraintLayout main, @NonNull TextView tvJoinComplt, @NonNull TextView tvWelcome) {
    this.rootView = rootView;
    this.btnGoLogin = btnGoLogin;
    this.main = main;
    this.tvJoinComplt = tvJoinComplt;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJoinCompltBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJoinCompltBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_join_complt, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJoinCompltBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_go_login;
      Button btnGoLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnGoLogin == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tv_join_complt;
      TextView tvJoinComplt = ViewBindings.findChildViewById(rootView, id);
      if (tvJoinComplt == null) {
        break missingId;
      }

      id = R.id.tv_welcome;
      TextView tvWelcome = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new ActivityJoinCompltBinding((ConstraintLayout) rootView, btnGoLogin, main,
          tvJoinComplt, tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

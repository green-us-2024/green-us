// Generated by view binder compiler. Do not edit!
package kr.ac.kpu.green_us.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kpu.green_us.R;

public final class ActivityGreeningDetailSubBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnEsc;

  @NonNull
  public final Button button;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final RecyclerView recyclerviewGreeningDetailSub;

  @NonNull
  public final ConstraintLayout topBar;

  private ActivityGreeningDetailSubBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton btnEsc, @NonNull Button button, @NonNull LinearLayout main,
      @NonNull RecyclerView recyclerviewGreeningDetailSub, @NonNull ConstraintLayout topBar) {
    this.rootView = rootView;
    this.btnEsc = btnEsc;
    this.button = button;
    this.main = main;
    this.recyclerviewGreeningDetailSub = recyclerviewGreeningDetailSub;
    this.topBar = topBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGreeningDetailSubBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGreeningDetailSubBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_greening_detail_sub, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGreeningDetailSubBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_esc;
      ImageButton btnEsc = ViewBindings.findChildViewById(rootView, id);
      if (btnEsc == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.recyclerview_greening_detail_sub;
      RecyclerView recyclerviewGreeningDetailSub = ViewBindings.findChildViewById(rootView, id);
      if (recyclerviewGreeningDetailSub == null) {
        break missingId;
      }

      id = R.id.topBar;
      ConstraintLayout topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      return new ActivityGreeningDetailSubBinding((LinearLayout) rootView, btnEsc, button, main,
          recyclerviewGreeningDetailSub, topBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

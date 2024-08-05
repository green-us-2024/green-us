// Generated by view binder compiler. Do not edit!
package kr.ac.kpu.green_us.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kpu.green_us.R;

public final class FragmentMyGreenOpenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout notExistOpen;

  @NonNull
  public final RecyclerView recyclerviewOpenGreening;

  private FragmentMyGreenOpenBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout notExistOpen, @NonNull RecyclerView recyclerviewOpenGreening) {
    this.rootView = rootView;
    this.notExistOpen = notExistOpen;
    this.recyclerviewOpenGreening = recyclerviewOpenGreening;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyGreenOpenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyGreenOpenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_green_open, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyGreenOpenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.not_exist_open;
      LinearLayout notExistOpen = ViewBindings.findChildViewById(rootView, id);
      if (notExistOpen == null) {
        break missingId;
      }

      id = R.id.recyclerview_open_greening;
      RecyclerView recyclerviewOpenGreening = ViewBindings.findChildViewById(rootView, id);
      if (recyclerviewOpenGreening == null) {
        break missingId;
      }

      return new FragmentMyGreenOpenBinding((LinearLayout) rootView, notExistOpen,
          recyclerviewOpenGreening);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

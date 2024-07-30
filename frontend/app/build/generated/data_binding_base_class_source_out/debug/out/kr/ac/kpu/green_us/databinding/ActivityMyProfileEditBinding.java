// Generated by view binder compiler. Do not edit!
package kr.ac.kpu.green_us.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kr.ac.kpu.green_us.R;

public final class ActivityMyProfileEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView address1;

  @NonNull
  public final TextView address2;

  @NonNull
  public final EditText addressDetail;

  @NonNull
  public final ImageView btnEsc;

  @NonNull
  public final Button btnSearchAddress;

  @NonNull
  public final Button camera;

  @NonNull
  public final Button complete;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextView email1;

  @NonNull
  public final TextView email2;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final TextView name1;

  @NonNull
  public final TextView name2;

  @NonNull
  public final TextView phone1;

  @NonNull
  public final TextView phone2;

  @NonNull
  public final ImageView userImg;

  private ActivityMyProfileEditBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView address1, @NonNull TextView address2, @NonNull EditText addressDetail,
      @NonNull ImageView btnEsc, @NonNull Button btnSearchAddress, @NonNull Button camera,
      @NonNull Button complete, @NonNull ConstraintLayout constraintLayout,
      @NonNull TextView email1, @NonNull TextView email2, @NonNull Guideline guideline1,
      @NonNull Guideline guideline2, @NonNull TextView name1, @NonNull TextView name2,
      @NonNull TextView phone1, @NonNull TextView phone2, @NonNull ImageView userImg) {
    this.rootView = rootView;
    this.address1 = address1;
    this.address2 = address2;
    this.addressDetail = addressDetail;
    this.btnEsc = btnEsc;
    this.btnSearchAddress = btnSearchAddress;
    this.camera = camera;
    this.complete = complete;
    this.constraintLayout = constraintLayout;
    this.email1 = email1;
    this.email2 = email2;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.name1 = name1;
    this.name2 = name2;
    this.phone1 = phone1;
    this.phone2 = phone2;
    this.userImg = userImg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyProfileEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_profile_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyProfileEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address1;
      TextView address1 = ViewBindings.findChildViewById(rootView, id);
      if (address1 == null) {
        break missingId;
      }

      id = R.id.address2;
      TextView address2 = ViewBindings.findChildViewById(rootView, id);
      if (address2 == null) {
        break missingId;
      }

      id = R.id.address_detail;
      EditText addressDetail = ViewBindings.findChildViewById(rootView, id);
      if (addressDetail == null) {
        break missingId;
      }

      id = R.id.btn_esc;
      ImageView btnEsc = ViewBindings.findChildViewById(rootView, id);
      if (btnEsc == null) {
        break missingId;
      }

      id = R.id.btn_search_address;
      Button btnSearchAddress = ViewBindings.findChildViewById(rootView, id);
      if (btnSearchAddress == null) {
        break missingId;
      }

      id = R.id.camera;
      Button camera = ViewBindings.findChildViewById(rootView, id);
      if (camera == null) {
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

      id = R.id.email1;
      TextView email1 = ViewBindings.findChildViewById(rootView, id);
      if (email1 == null) {
        break missingId;
      }

      id = R.id.email2;
      TextView email2 = ViewBindings.findChildViewById(rootView, id);
      if (email2 == null) {
        break missingId;
      }

      id = R.id.guideline1;
      Guideline guideline1 = ViewBindings.findChildViewById(rootView, id);
      if (guideline1 == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.name1;
      TextView name1 = ViewBindings.findChildViewById(rootView, id);
      if (name1 == null) {
        break missingId;
      }

      id = R.id.name2;
      TextView name2 = ViewBindings.findChildViewById(rootView, id);
      if (name2 == null) {
        break missingId;
      }

      id = R.id.phone1;
      TextView phone1 = ViewBindings.findChildViewById(rootView, id);
      if (phone1 == null) {
        break missingId;
      }

      id = R.id.phone2;
      TextView phone2 = ViewBindings.findChildViewById(rootView, id);
      if (phone2 == null) {
        break missingId;
      }

      id = R.id.user_img;
      ImageView userImg = ViewBindings.findChildViewById(rootView, id);
      if (userImg == null) {
        break missingId;
      }

      return new ActivityMyProfileEditBinding((ConstraintLayout) rootView, address1, address2,
          addressDetail, btnEsc, btnSearchAddress, camera, complete, constraintLayout, email1,
          email2, guideline1, guideline2, name1, name2, phone1, phone2, userImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

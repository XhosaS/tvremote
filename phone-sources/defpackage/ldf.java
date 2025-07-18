package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldf extends xcg implements View.OnClickListener {
    public ldv a;
    private kpz c;
    private lid d;
    private ApiActivity e;
    private TextView f;

    @Override // defpackage.xcg, defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ApiActivity) {
            this.e = (ApiActivity) context;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f) {
            Bundle arguments = getArguments();
            ksn ksnVarB = ksn.b(arguments.getString("authAccount"));
            String string = arguments.getString("video_id");
            this.a.p(ksnVarB);
            this.c.f(this.e, string, "purchase:api", this.d, false, true, false);
        }
        dismiss();
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().requestFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        this.c = ((kqc) this.e.getApplication()).b();
        View viewInflate = layoutInflater.inflate(R.layout.post_purchase_dialog, viewGroup);
        Resources resources = getResources();
        int dimension = (int) resources.getDimension(R.dimen.post_purchase_app_icon_size);
        TextView textView = (TextView) viewInflate.findViewById(R.id.watch_on_play);
        this.f = textView;
        textView.setText(getString(R.string.post_purchase_dialog_watch_on_play, getString(R.string.application_name)));
        Drawable drawable = resources.getDrawable(R.mipmap.ic_launcher_videos);
        drawable.setBounds(0, 0, dimension, dimension);
        this.f.setCompoundDrawablesRelative(drawable, null, null, null);
        this.f.setOnClickListener(this);
        Bundle arguments = getArguments();
        String string = arguments.getString("CALLING_PACKAGE");
        this.d = lid.c((lid) arguments.getParcelable("parent_event_id"));
        PackageManager packageManager = this.e.getPackageManager();
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.back_to_partner);
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(string, 0);
            textView2.setText(getString(R.string.post_purchase_dialog_back_to_partner, packageManager.getApplicationLabel(applicationInfo)));
            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
            applicationIcon.setBounds(0, 0, dimension, dimension);
            textView2.setCompoundDrawablesRelative(applicationIcon, null, null, null);
            textView2.setOnClickListener(this);
            textView2.setVisibility(0);
            return viewInflate;
        } catch (PackageManager.NameNotFoundException e) {
            krd.c("Failed to create Go back to app button ".concat(e.toString()));
            textView2.setVisibility(8);
            return viewInflate;
        }
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ApiActivity apiActivity = this.e;
        if (apiActivity != null) {
            apiActivity.b();
            this.e = null;
        }
    }
}

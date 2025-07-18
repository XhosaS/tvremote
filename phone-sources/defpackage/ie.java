package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ie extends bl {
    final Handler a = new Handler(Looper.getMainLooper());
    final Runnable b = new bf(this, 17, null);
    public ic c;
    public int d;
    public int e;
    public ImageView f;
    TextView g;

    private final int a(int i) throws Resources.NotFoundException {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.c.h(true);
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ic icVarE = hq.e(this, getArguments().getBoolean("host_activity", true));
        this.c = icVarE;
        if (icVarE.x == null) {
            icVarE.x = new dvv();
        }
        icVarE.x.d(this, new id(this, 0));
        ic icVar = this.c;
        if (icVar.y == null) {
            icVar.y = new dvv();
        }
        icVar.y.d(this, new id(this, 2));
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = a(R.attr.colorError);
        } else {
            Context context = getContext();
            this.d = context != null ? context.getColor(R.color.biometric_error_color) : 0;
        }
        this.e = a(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(this.c.c());
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence charSequenceB = this.c.b();
            if (TextUtils.isEmpty(charSequenceB)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceB);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.g = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        ic icVar = this.c;
        builder.setNegativeButton(hu.i(icVar.n) ? getString(R.string.confirm_device_credential_password) : icVar.a(), new gcu(this, 1));
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    @Override // defpackage.bv
    public final void onPause() {
        super.onPause();
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.bv
    public final void onResume() {
        super.onResume();
        ic icVar = this.c;
        icVar.w = 0;
        icVar.j(1);
        this.c.i(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}

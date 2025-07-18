package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gde extends bl implements DialogInterface.OnClickListener {
    private DialogPreference a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    public int e;
    private CharSequence f;
    private int g;
    private BitmapDrawable h;

    protected void a(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void b(boolean z);

    protected boolean e() {
        return false;
    }

    public final DialogPreference f() {
        if (this.a == null) {
            this.a = (DialogPreference) ((gcn) getTargetFragment()).a(requireArguments().getString("key"));
        }
        return this.a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.e = i;
    }

    @Override // defpackage.bl, defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dxd targetFragment = getTargetFragment();
        if (!(targetFragment instanceof gcn)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        gcn gcnVar = (gcn) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) gcnVar.a(string);
        this.a = dialogPreference;
        this.b = dialogPreference.a;
        this.c = dialogPreference.d;
        this.d = dialogPreference.e;
        this.f = dialogPreference.b;
        this.g = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.h = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.h = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        this.e = -2;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle(this.b);
        builder.setIcon(this.h);
        builder.setPositiveButton(this.c, this);
        builder.setNegativeButton(this.d, this);
        requireContext();
        int i = this.g;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            a(viewInflate);
            builder.setView(viewInflate);
        } else {
            builder.setMessage(this.f);
        }
        dH(builder);
        AlertDialog alertDialogCreate = builder.create();
        if (e()) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
                return alertDialogCreate;
            }
            c();
        }
        return alertDialogCreate;
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        b(this.e == -1);
    }

    @Override // defpackage.bl, defpackage.bv
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f);
        bundle.putInt("PreferenceDialogFragment.layout", this.g);
        BitmapDrawable bitmapDrawable = this.h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    protected void c() {
    }

    protected void dH(AlertDialog.Builder builder) {
    }
}

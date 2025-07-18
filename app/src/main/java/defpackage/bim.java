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
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bim extends bf implements DialogInterface.OnClickListener {
    private DialogPreference ah;
    private CharSequence ai;
    private CharSequence aj;
    private CharSequence ak;
    public int al;
    private CharSequence am;
    private int an;
    private BitmapDrawable ao;

    protected void aB(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.am;
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

    public abstract void aC(boolean z);

    protected boolean aF() {
        return false;
    }

    public final DialogPreference aG() {
        if (this.ah == null) {
            this.ah = (DialogPreference) ((bhr) super.ec(true)).cR(ea().getString("key"));
        }
        return this.ah;
    }

    @Override // defpackage.bf, defpackage.bq
    public void ey(Bundle bundle) {
        super.ey(bundle);
        bqs bqsVarEc = super.ec(true);
        if (!(bqsVarEc instanceof bhr)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        bhr bhrVar = (bhr) bqsVarEc;
        String string = ea().getString("key");
        if (bundle != null) {
            this.ai = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.aj = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.ak = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.am = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.an = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.ao = new BitmapDrawable(dZ().getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) bhrVar.cR(string);
        this.ah = dialogPreference;
        this.ai = dialogPreference.a;
        this.aj = dialogPreference.d;
        this.ak = dialogPreference.e;
        this.am = dialogPreference.b;
        this.an = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.ao = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.ao = new BitmapDrawable(dZ().getResources(), bitmapCreateBitmap);
    }

    @Override // defpackage.bf, defpackage.bq
    public void g(Bundle bundle) {
        super.g(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ai);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.aj);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ak);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.am);
        bundle.putInt("PreferenceDialogFragment.layout", this.an);
        BitmapDrawable bitmapDrawable = this.ao;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // defpackage.bf
    public final Dialog m() {
        this.al = -2;
        gb gbVar = new gb(dZ());
        gbVar.setTitle(this.ai);
        fx fxVar = gbVar.a;
        fxVar.c = this.ao;
        gbVar.a(this.aj, this);
        fxVar.i = this.ak;
        fxVar.j = this;
        dZ();
        int i = this.an;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterEi = this.W;
            if (layoutInflaterEi == null) {
                layoutInflaterEi = ei(null);
            }
            viewInflate = layoutInflaterEi.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            aB(viewInflate);
            gbVar.setView(viewInflate);
        } else {
            fxVar.f = this.am;
        }
        cx(gbVar);
        gc gcVarCreate = gbVar.create();
        if (aF()) {
            Window window = gcVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
                return gcVarCreate;
            }
            aD();
        }
        return gcVarCreate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.al = i;
    }

    @Override // defpackage.bf, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aC(this.al == -1);
    }

    protected void aD() {
    }

    protected void cx(gb gbVar) {
    }
}

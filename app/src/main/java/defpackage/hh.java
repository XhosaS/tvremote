package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hh extends tv implements gg {
    private gl a;
    private final aga b;

    public hh(Context context, int i) {
        super(context, a(context, i));
        this.b = new aga() { // from class: hg
            @Override // defpackage.aga
            public final boolean cL(KeyEvent keyEvent) {
                return this.a.c(keyEvent);
            }
        };
        gl glVarB = b();
        ((hf) glVarB).H = a(context, i);
        glVarB.n();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.tv, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        b().c(view, layoutParams);
    }

    public final gl b() {
        if (this.a == null) {
            int i = gl.b;
            this.a = new hf(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return agb.a(this.b, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().b(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().e();
    }

    @Override // defpackage.tv, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        b().d();
        super.onCreate(bundle);
        b().n();
    }

    @Override // defpackage.tv, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        b().g();
    }

    @Override // defpackage.tv, android.app.Dialog
    public final void setContentView(int i) {
        e();
        b().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().l(getContext().getString(i));
    }

    @Override // defpackage.tv, android.app.Dialog
    public final void setContentView(View view) {
        e();
        b().j(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().l(charSequence);
    }

    @Override // defpackage.tv, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        b().k(view, layoutParams);
    }

    @Override // defpackage.gg
    public final void cY() {
    }

    @Override // defpackage.gg
    public final void cU(ij ijVar) {
    }
}

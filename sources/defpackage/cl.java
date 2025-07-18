package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cl extends kl {
    private bv a;
    private final pp b;

    public cl(Context context, int i) {
        super(context, a(context, i));
        this.b = new pp() { // from class: ck
            @Override // defpackage.pp
            public final boolean d(KeyEvent keyEvent) {
                return this.a.c(keyEvent);
            }
        };
        bv bvVarB = b();
        ((cj) bvVarB).F = a(context, i);
        bvVarB.o();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.kl, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        b().d(view, layoutParams);
    }

    public final bv b() {
        if (this.a == null) {
            int i = bv.b;
            this.a = new cj(getContext(), getWindow(), this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return pq.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().f();
    }

    @Override // defpackage.kl, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        b().e();
        super.onCreate(bundle);
        b().o();
    }

    @Override // defpackage.kl, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        b().h();
    }

    @Override // defpackage.kl, android.app.Dialog
    public final void setContentView(int i) {
        d();
        b().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().m(getContext().getString(i));
    }

    @Override // defpackage.kl, android.app.Dialog
    public final void setContentView(View view) {
        d();
        b().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().m(charSequence);
    }

    @Override // defpackage.kl, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        b().l(view, layoutParams);
    }
}

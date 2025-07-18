package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bf extends bq implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean am;
    private boolean ao;
    public Dialog c;
    public boolean d;
    public boolean e;
    private final DialogInterface.OnCancelListener ah = new bb(this);
    public final DialogInterface.OnDismissListener a = new bc(this);
    private int ai = 0;
    private int aj = 0;
    private boolean ak = true;
    public boolean b = true;
    private int al = -1;
    private final bcy an = new bd(this);
    public boolean f = false;

    @Override // defpackage.bq
    public final ca cp() {
        return new be(this, new bj(this));
    }

    @Override // defpackage.bq
    public final void dH(Bundle bundle) {
        Bundle bundle2;
        this.P = true;
        if (this.c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.c.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.bq
    public final void dI(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.dI(layoutInflater, viewGroup, bundle);
        if (this.R != null || this.c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.c.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.bq
    public final void e() {
        this.P = true;
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ao = true;
            dialog.setOnDismissListener(null);
            this.c.dismiss();
            if (!this.d) {
                onDismiss(this.c);
            }
            this.c = null;
            this.f = false;
        }
    }

    @Override // defpackage.bq
    public final void er() {
        this.P = true;
        if (!this.e && !this.d) {
            this.d = true;
        }
        this.ac.f(this.an);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:10:0x0017, B:12:0x0023, B:22:0x003b, B:24:0x0043, B:25:0x004a, B:18:0x002d, B:20:0x0033, B:21:0x0038, B:26:0x0062), top: B:46:0x0017 }] */
    @Override // defpackage.bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater ev(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = r7.ar()
            boolean r0 = r7.b
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L8a
            boolean r0 = r7.am
            if (r0 == 0) goto L11
            goto L8a
        L11:
            boolean r0 = r7.f
            if (r0 != 0) goto L6c
            r0 = 0
            r3 = 1
            r7.am = r3     // Catch: java.lang.Throwable -> L68
            android.app.Dialog r4 = r7.m()     // Catch: java.lang.Throwable -> L68
            r7.c = r4     // Catch: java.lang.Throwable -> L68
            boolean r5 = r7.b     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L62
            int r5 = r7.ai     // Catch: java.lang.Throwable -> L68
            if (r5 == r3) goto L38
            if (r5 == r2) goto L38
            r6 = 3
            if (r5 == r6) goto L2d
            goto L3b
        L2d:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L38
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L68
        L38:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L68
        L3b:
            android.content.Context r4 = r7.s()     // Catch: java.lang.Throwable -> L68
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L4a
            android.app.Dialog r5 = r7.c     // Catch: java.lang.Throwable -> L68
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L68
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L68
        L4a:
            android.app.Dialog r4 = r7.c     // Catch: java.lang.Throwable -> L68
            boolean r5 = r7.ak     // Catch: java.lang.Throwable -> L68
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L68
            android.app.Dialog r4 = r7.c     // Catch: java.lang.Throwable -> L68
            android.content.DialogInterface$OnCancelListener r5 = r7.ah     // Catch: java.lang.Throwable -> L68
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L68
            android.app.Dialog r4 = r7.c     // Catch: java.lang.Throwable -> L68
            android.content.DialogInterface$OnDismissListener r5 = r7.a     // Catch: java.lang.Throwable -> L68
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L68
            r7.f = r3     // Catch: java.lang.Throwable -> L68
            goto L65
        L62:
            r3 = 0
            r7.c = r3     // Catch: java.lang.Throwable -> L68
        L65:
            r7.am = r0
            goto L6c
        L68:
            r8 = move-exception
            r7.am = r0
            throw r8
        L6c:
            boolean r0 = defpackage.de.S(r2)
            if (r0 == 0) goto L7d
            java.lang.String r0 = "get layout inflater for DialogFragment "
            java.lang.String r2 = " from dialog context"
            java.lang.String r0 = defpackage.a.c(r7, r0, r2)
            android.util.Log.d(r1, r0)
        L7d:
            android.app.Dialog r0 = r7.c
            if (r0 == 0) goto Lb4
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L8a:
            boolean r0 = defpackage.de.S(r2)
            if (r0 == 0) goto Lb4
            r7.toString()
            java.lang.String r0 = r7.toString()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            java.lang.String r0 = r2.concat(r0)
            boolean r2 = r7.b
            if (r2 != 0) goto Lab
            java.lang.String r2 = "mShowsDialog = false: "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.d(r1, r0)
            return r8
        Lab:
            java.lang.String r2 = "mCreatingDialog = true: "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.d(r1, r0)
        Lb4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf.ev(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.bq
    public final void ex(Context context) {
        super.ex(context);
        bcw.a("observeForever");
        bcx bcxVar = this.ac;
        bcy bcyVar = this.an;
        bct bctVar = new bct(bcxVar, bcyVar);
        bcv bcvVar = (bcv) bcxVar.c.e(bcyVar, bctVar);
        if (bcvVar instanceof bcu) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bcvVar == null) {
            bctVar.d(true);
        }
        if (this.e) {
            return;
        }
        this.d = false;
    }

    @Override // defpackage.bq
    public void ey(Bundle bundle) {
        super.ey(bundle);
        new Handler();
        this.b = this.H == 0;
        if (bundle != null) {
            this.ai = bundle.getInt("android:style", 0);
            this.aj = bundle.getInt("android:theme", 0);
            this.ak = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.al = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.bq
    public void g(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.ai;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.aj;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ak) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.al;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.bq
    public final void h() {
        this.P = true;
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ao = false;
            dialog.show();
            View decorView = this.c.getWindow().getDecorView();
            ben.a(decorView, this);
            beo.a(decorView, this);
            bqt.a(decorView, this);
        }
    }

    @Override // defpackage.bq
    public final void i() {
        this.P = true;
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void l(de deVar, String str) {
        this.d = false;
        this.e = true;
        ab abVar = new ab(deVar);
        abVar.s = true;
        abVar.m(this, str);
        abVar.i();
    }

    public Dialog m() {
        if (de.S(3)) {
            toString();
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new tv(dZ(), this.aj);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ao) {
            return;
        }
        if (de.S(3)) {
            toString();
            Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        if (this.d) {
            return;
        }
        this.d = true;
        this.e = false;
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.c.dismiss();
        }
        this.ao = true;
        if (this.al < 0) {
            ab abVar = new ab(eh());
            abVar.s = true;
            abVar.k(this);
            abVar.j(true, true);
            return;
        }
        de deVarEh = eh();
        int i = this.al;
        if (i < 0) {
            throw new IllegalArgumentException(a.b(i, "Bad id: "));
        }
        deVarEh.C(new dc(deVarEh, i, 1), true);
        this.al = -1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}

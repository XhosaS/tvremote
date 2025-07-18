package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bw extends tt implements aaw {
    boolean c;
    boolean d;
    public final cc a = new cc(new bv(this));
    final bco b = new bco(this);
    boolean e = true;

    public bw() {
        this.g.c.a("android:support:lifecycle", new bqn() { // from class: br
            @Override // defpackage.bqn
            public final Bundle a() {
                bw bwVar = this.a;
                bwVar.cZ();
                bwVar.b.e(bce.ON_STOP);
                return new Bundle();
            }
        });
        dg(new afe() { // from class: bs
            @Override // defpackage.afe
            public final void accept(Object obj) {
                this.a.a.h();
            }
        });
        this.i.add(new afe() { // from class: bt
            @Override // defpackage.afe
            public final void accept(Object obj) {
                this.a.a.h();
            }
        });
        this.f.a(new uo() { // from class: bu
            @Override // defpackage.uo
            public final void a() {
                this.a.a.i();
            }
        });
    }

    private static boolean f(de deVar, bcf bcfVar) {
        boolean zF = false;
        for (bq bqVar : deVar.b.i()) {
            if (bqVar != null) {
                if (bqVar.ep() != null) {
                    zF |= f(bqVar.eg(), bcfVar);
                }
                dz dzVar = bqVar.ab;
                if (dzVar != null) {
                    dzVar.a();
                    if (dzVar.a.c.a(bcf.d)) {
                        bqVar.ab.a.f(bcfVar);
                        zF = true;
                    }
                }
                if (bqVar.aa.c.a(bcf.d)) {
                    bqVar.aa.f(bcfVar);
                    zF = true;
                }
            }
        }
        return zF;
    }

    final void cZ() {
        while (f(this.a.a.e, bcf.c)) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003e  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L54
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L54
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L45;
                case 100470631: goto L35;
                case 472614934: goto L2c;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L54
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            goto L54
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L54
            goto L53
        L2c:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            goto L3e
        L35:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L54
        L3e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L54
            goto L53
        L45:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L54
        L53:
            return
        L54:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "  "
            java.lang.String r0 = r0.concat(r1)
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.c
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.d
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.e
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto La8
            bfc r1 = defpackage.bfc.a(r2)
            bfh r1 = (defpackage.bfh) r1
            bfg r1 = r1.b
            r1.a(r0, r5)
        La8:
            cc r0 = r2.a
            ce r0 = r0.a
            de r0 = r0.e
            r0.A(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.tt, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.a.h();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.e(bce.ON_CREATE);
        this.a.b();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewA = this.a.a(view, str, context, attributeSet);
        return viewA == null ? super.onCreateView(view, str, context, attributeSet) : viewA;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.a.c();
        this.b.e(bce.ON_DESTROY);
    }

    @Override // defpackage.tt, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.a.a.e.O(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.d = false;
        this.a.d();
        this.b.e(bce.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.b.e(bce.ON_RESUME);
        this.a.e();
    }

    @Override // defpackage.tt, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.h();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        cc ccVar = this.a;
        ccVar.h();
        super.onResume();
        this.d = true;
        ccVar.j();
    }

    @Override // android.app.Activity
    protected void onStart() {
        cc ccVar = this.a;
        ccVar.h();
        super.onStart();
        this.e = false;
        if (!this.c) {
            this.c = true;
            ccVar.a.e.m();
        }
        ccVar.j();
        this.b.e(bce.ON_START);
        ccVar.f();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.a.h();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.e = true;
        cZ();
        this.a.g();
        this.b.e(bce.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewA = this.a.a(null, str, context, attributeSet);
        return viewA == null ? super.onCreateView(str, context, attributeSet) : viewA;
    }

    @Deprecated
    public void da() {
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class t extends kk {
    boolean a;
    boolean b;
    public final asv e = new asv(new s(this), (byte[]) null);
    final xc d = new xc(this);
    boolean c = true;

    public t() {
        J().d("android:support:lifecycle", new ab(this, 1));
        g(new r(this, 1));
        this.k.add(new r(this, 0));
        h(new br(this, 1));
    }

    private static boolean e(am amVar, xb xbVar) {
        boolean zE = false;
        for (q qVar : amVar.b.g()) {
            if (qVar != null) {
                y yVar = qVar.x;
                if ((yVar == null ? null : ((s) yVar).a) != null) {
                    zE |= e(qVar.j(), xbVar);
                }
                ax axVar = qVar.U;
                if (axVar != null && axVar.m().a.a(xb.d)) {
                    qVar.U.a.d(xbVar);
                    zE = true;
                }
                if (qVar.X.a.a(xb.d)) {
                    qVar.X.d(xbVar);
                    zE = true;
                }
            }
        }
        return zE;
    }

    public final am a() {
        return this.e.X();
    }

    final View b(View view, String str, Context context, AttributeSet attributeSet) {
        return ((y) this.e.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    final void c() {
        while (e(a(), xb.c)) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0044  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L5a
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L5a
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4b;
                case 100470631: goto L3b;
                case 472614934: goto L32;
                case 1159329357: goto L23;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5a
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5a
            goto L59
        L23:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5a
            goto L59
        L32:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            goto L44
        L3b:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L5a
        L44:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5a
            goto L59
        L4b:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5a
        L59:
            return
        L5a:
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
            boolean r1 = r2.a
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.b
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.c
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto Laa
            yh r1 = defpackage.yh.a(r2)
            r1.c(r0, r5)
        Laa:
            asv r0 = r2.e
            am r0 = r0.X()
            r0.B(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.kk, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        this.e.Y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.kk, defpackage.bh, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.b(xa.ON_CREATE);
        ((y) this.e.a).e.o();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewB = b(view, str, context, attributeSet);
        return viewB == null ? super.onCreateView(view, str, context, attributeSet) : viewB;
    }

    @Override // android.app.Activity
    protected void onDestroy() throws Exception {
        super.onDestroy();
        ((y) this.e.a).e.p();
        this.d.b(xa.ON_DESTROY);
    }

    @Override // defpackage.kk, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((y) this.e.a).e.O(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.b = false;
        ((y) this.e.a).e.v();
        this.d.b(xa.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.d.b(xa.ON_RESUME);
        ((y) this.e.a).e.x();
    }

    @Override // defpackage.kk, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.Y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        asv asvVar = this.e;
        asvVar.Y();
        super.onResume();
        this.b = true;
        asvVar.Z();
    }

    @Override // android.app.Activity
    protected void onStart() {
        asv asvVar = this.e;
        asvVar.Y();
        super.onStart();
        this.c = false;
        if (!this.a) {
            this.a = true;
            ((y) asvVar.a).e.m();
        }
        asvVar.Z();
        this.d.b(xa.ON_START);
        ((y) asvVar.a).e.y();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.Y();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.c = true;
        c();
        ((y) this.e.a).e.A();
        this.d.b(xa.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewB = b(null, str, context, attributeSet);
        return viewB == null ? super.onCreateView(str, context, attributeSet) : viewB;
    }
}

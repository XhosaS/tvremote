package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyh {
    public static final cyh a;
    public final cye b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = cyd.e;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = cyb.d;
        } else {
            a = cye.f;
        }
    }

    private cyh(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new cyd(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new cyc(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new cyb(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new cya(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new cxz(this, windowInsets);
        } else {
            this.b = new cxy(this, windowInsets);
        }
    }

    public static csr i(csr csrVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, csrVar.b - i);
        int iMax2 = Math.max(0, csrVar.c - i2);
        int iMax3 = Math.max(0, csrVar.d - i3);
        int iMax4 = Math.max(0, csrVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? csrVar : csr.e(iMax, iMax2, iMax3, iMax4);
    }

    public static cyh o(WindowInsets windowInsets) {
        return p(windowInsets, null);
    }

    public static cyh p(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        cyh cyhVar = new cyh(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = cww.a;
            cyhVar.s(cwn.a(view));
            cyhVar.q(view.getRootView());
            cyhVar.t(view.getWindowSystemUiVisibility());
        }
        return cyhVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        cye cyeVar = this.b;
        if (cyeVar instanceof cxx) {
            return ((cxx) cyeVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cyh) {
            return Objects.equals(this.b, ((cyh) obj).b);
        }
        return false;
    }

    public final csr f(int i) {
        return this.b.a(i);
    }

    public final csr g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final csr h() {
        return this.b.p();
    }

    public final int hashCode() {
        cye cyeVar = this.b;
        if (cyeVar == null) {
            return 0;
        }
        return cyeVar.hashCode();
    }

    public final cvb j() {
        return this.b.u();
    }

    @Deprecated
    public final cyh k() {
        return this.b.v();
    }

    @Deprecated
    public final cyh l() {
        return this.b.q();
    }

    @Deprecated
    public final cyh m() {
        return this.b.r();
    }

    public final cyh n(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    final void q(View view) {
        this.b.f(view);
    }

    final void r(csr[] csrVarArr) {
        this.b.h(csrVarArr);
    }

    final void s(cyh cyhVar) {
        this.b.j(cyhVar);
    }

    final void t(int i) {
        this.b.k(i);
    }

    public final boolean u() {
        return this.b.t();
    }

    public final boolean v(int i) {
        return this.b.n(i);
    }

    public cyh(cyh cyhVar) {
        if (cyhVar != null) {
            cye cyeVar = cyhVar.b;
            if (Build.VERSION.SDK_INT >= 34 && (cyeVar instanceof cyd)) {
                this.b = new cyd(this, (cyd) cyeVar);
            } else if (Build.VERSION.SDK_INT >= 31 && (cyeVar instanceof cyc)) {
                this.b = new cyc(this, (cyc) cyeVar);
            } else if (Build.VERSION.SDK_INT >= 30 && (cyeVar instanceof cyb)) {
                this.b = new cyb(this, (cyb) cyeVar);
            } else if (Build.VERSION.SDK_INT >= 29 && (cyeVar instanceof cya)) {
                this.b = new cya(this, (cya) cyeVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (cyeVar instanceof cxz)) {
                this.b = new cxz(this, (cxz) cyeVar);
            } else if (cyeVar instanceof cxy) {
                this.b = new cxy(this, (cxy) cyeVar);
            } else if (cyeVar instanceof cxx) {
                this.b = new cxx(this, (cxx) cyeVar);
            } else {
                this.b = new cye(this);
            }
            cyeVar.g(this);
            return;
        }
        this.b = new cye(this);
    }
}

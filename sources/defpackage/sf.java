package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sf {
    public static final sf a;
    public final sc b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = sb.e;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = rz.d;
        } else {
            a = sc.f;
        }
    }

    private sf(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new sb(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new sa(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new rz(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new ry(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new rx(this, windowInsets);
        } else {
            this.b = new rw(this, windowInsets);
        }
    }

    static nt i(nt ntVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, ntVar.b - i);
        int iMax2 = Math.max(0, ntVar.c - i2);
        int iMax3 = Math.max(0, ntVar.d - i3);
        int iMax4 = Math.max(0, ntVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? ntVar : nt.d(iMax, iMax2, iMax3, iMax4);
    }

    public static sf n(WindowInsets windowInsets) {
        return o(windowInsets, null);
    }

    public static sf o(WindowInsets windowInsets, View view) {
        qk.s(windowInsets);
        sf sfVar = new sf(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = qv.a;
            sfVar.r(qn.a(view));
            sfVar.p(view.getRootView());
            sfVar.b.j(view.getWindowSystemUiVisibility());
        }
        return sfVar;
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
        sc scVar = this.b;
        if (scVar instanceof rv) {
            return ((rv) scVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sf) {
            return Objects.equals(this.b, ((sf) obj).b);
        }
        return false;
    }

    public final nt f(int i) {
        return this.b.a(i);
    }

    public final nt g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final nt h() {
        return this.b.m();
    }

    public final int hashCode() {
        sc scVar = this.b;
        if (scVar == null) {
            return 0;
        }
        return scVar.hashCode();
    }

    @Deprecated
    public final sf j() {
        return this.b.s();
    }

    @Deprecated
    public final sf k() {
        return this.b.n();
    }

    @Deprecated
    public final sf l() {
        return this.b.o();
    }

    public final sf m(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    final void p(View view) {
        this.b.f(view);
    }

    final void q(nt[] ntVarArr) {
        this.b.g(ntVarArr);
    }

    final void r(sf sfVar) {
        this.b.i(sfVar);
    }

    public final boolean s() {
        return this.b.q();
    }

    public sf() {
        this.b = new sc(this);
    }
}

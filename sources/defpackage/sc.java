package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sc {
    static final sf f;
    final sf g;

    static {
        f = (Build.VERSION.SDK_INT >= 34 ? new rt() : Build.VERSION.SDK_INT >= 31 ? new rs() : Build.VERSION.SDK_INT >= 30 ? new rr() : Build.VERSION.SDK_INT >= 29 ? new rq() : new rp()).a().j().k().l();
    }

    public sc(sf sfVar) {
        this.g = sfVar;
    }

    public nt a(int i) {
        return nt.a;
    }

    public nt c(int i) {
        if ((i & 8) == 0) {
            return nt.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public nt d() {
        return nt.a;
    }

    public sf e(int i, int i2, int i3, int i4) {
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return k() == scVar.k() && q() == scVar.q() && Objects.equals(d(), scVar.d()) && Objects.equals(m(), scVar.m()) && Objects.equals(r(), scVar.r());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(q()), d(), m(), r());
    }

    public boolean k() {
        return false;
    }

    public nt m() {
        return nt.a;
    }

    public sf n() {
        return this.g;
    }

    public sf o() {
        return this.g;
    }

    public boolean q() {
        return false;
    }

    public po r() {
        return null;
    }

    public sf s() {
        return this.g;
    }

    public nt t() {
        return d();
    }

    public nt u() {
        return d();
    }

    public nt v() {
        return d();
    }

    public void f(View view) {
    }

    public void g(nt[] ntVarArr) {
    }

    public void i(sf sfVar) {
    }

    public void j(int i) {
    }

    public void p(nt ntVar) {
    }
}

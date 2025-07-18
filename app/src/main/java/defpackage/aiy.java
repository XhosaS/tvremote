package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aiy {
    static final ajc f;
    final ajc g;

    static {
        f = (Build.VERSION.SDK_INT >= 34 ? new aip() : Build.VERSION.SDK_INT >= 31 ? new aio() : Build.VERSION.SDK_INT >= 30 ? new ain() : Build.VERSION.SDK_INT >= 29 ? new aim() : new ail()).a().b.s().b.n().b.o();
    }

    public aiy(ajc ajcVar) {
        this.g = ajcVar;
    }

    public acs a(int i) {
        return acs.a;
    }

    public acs c(int i) {
        if ((i & 8) == 0) {
            return acs.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public acs d() {
        return acs.a;
    }

    public ajc e(int i, int i2, int i3, int i4) {
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiy)) {
            return false;
        }
        aiy aiyVar = (aiy) obj;
        return k() == aiyVar.k() && q() == aiyVar.q() && Objects.equals(d(), aiyVar.d()) && Objects.equals(m(), aiyVar.m()) && Objects.equals(r(), aiyVar.r());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(q()), d(), m(), r());
    }

    public boolean k() {
        return false;
    }

    public acs m() {
        return acs.a;
    }

    public ajc n() {
        return this.g;
    }

    public ajc o() {
        return this.g;
    }

    public boolean q() {
        return false;
    }

    public afy r() {
        return null;
    }

    public ajc s() {
        return this.g;
    }

    public acs t() {
        return d();
    }

    public acs u() {
        return d();
    }

    public acs v() {
        return d();
    }

    public void f(View view) {
    }

    public void g(acs[] acsVarArr) {
    }

    public void i(ajc ajcVar) {
    }

    public void j(int i) {
    }

    public void p(acs acsVar) {
    }
}

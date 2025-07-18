package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cye {
    static final cyh f;
    final cyh g;

    static {
        f = (Build.VERSION.SDK_INT >= 34 ? new cxv() : Build.VERSION.SDK_INT >= 31 ? new cxu() : Build.VERSION.SDK_INT >= 30 ? new cxt() : Build.VERSION.SDK_INT >= 29 ? new cxs() : new cxr()).a().k().l().m();
    }

    public cye(cyh cyhVar) {
        this.g = cyhVar;
    }

    public csr a(int i) {
        return csr.a;
    }

    public csr c(int i) {
        if ((i & 8) == 0) {
            return csr.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public csr d() {
        return csr.a;
    }

    public cyh e(int i, int i2, int i3, int i4) {
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cye)) {
            return false;
        }
        cye cyeVar = (cye) obj;
        return l() == cyeVar.l() && t() == cyeVar.t() && Objects.equals(d(), cyeVar.d()) && Objects.equals(p(), cyeVar.p()) && Objects.equals(u(), cyeVar.u());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(t()), d(), p(), u());
    }

    public boolean l() {
        return false;
    }

    public boolean n(int i) {
        return true;
    }

    public csr p() {
        return csr.a;
    }

    public cyh q() {
        return this.g;
    }

    public cyh r() {
        return this.g;
    }

    public boolean t() {
        return false;
    }

    public cvb u() {
        return null;
    }

    public cyh v() {
        return this.g;
    }

    public csr w() {
        return d();
    }

    public csr x() {
        return d();
    }

    public csr y() {
        return d();
    }

    public void f(View view) {
    }

    public void g(cyh cyhVar) {
    }

    public void h(csr[] csrVarArr) {
    }

    public void i(csr csrVar) {
    }

    public void j(cyh cyhVar) {
    }

    public void k(int i) {
    }

    public void s(csr csrVar) {
    }
}

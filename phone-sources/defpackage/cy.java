package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cy {
    public int e;
    public int f;
    public int g;
    public int h;
    int i;
    boolean j;
    String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    ArrayList t;
    final ArrayList d = new ArrayList();
    boolean k = true;
    boolean s = false;

    public abstract int a();

    public abstract void e();

    public abstract void f();

    public void g(int i, bv bvVar, String str, int i2) {
        throw null;
    }

    public boolean k() {
        throw null;
    }

    public abstract void l();

    public void m(bv bvVar) {
        throw null;
    }

    public void n(bv bvVar, dvd dvdVar) {
        throw null;
    }

    final void o(cx cxVar) {
        this.d.add(cxVar);
        cxVar.d = this.e;
        cxVar.e = this.f;
        cxVar.f = this.g;
        cxVar.g = this.h;
    }

    public final void p(int i, bv bvVar) {
        g(i, bvVar, null, 1);
    }

    public final void q(int i, bv bvVar, String str) {
        g(i, bvVar, str, 1);
    }

    public final void r(bv bvVar, String str) {
        g(0, bvVar, str, 1);
    }

    public final void s(String str) {
        if (!this.k) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.j = true;
        this.l = str;
    }

    public final void t() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void u(int i, bv bvVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i, bvVar, str, 2);
    }

    public final void v() {
        this.s = true;
    }

    public final void w(int i, bv bvVar) {
        u(i, bvVar, null);
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dp {
    private final cd a;
    private final ClassLoader b;
    int e;
    int f;
    int g;
    int h;
    public int i;
    public boolean j;
    public String l;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    ArrayList t;
    public final ArrayList d = new ArrayList();
    boolean k = true;
    public boolean s = false;

    public dp(cd cdVar, ClassLoader classLoader) {
        this.a = cdVar;
        this.b = classLoader;
    }

    public abstract void e();

    public void f(int i, bq bqVar, String str, int i2) {
        throw null;
    }

    public abstract void i();

    public void k(bq bqVar) {
        throw null;
    }

    final void l(C0000do c0000do) {
        this.d.add(c0000do);
        c0000do.d = this.e;
        c0000do.e = this.f;
        c0000do.f = this.g;
        c0000do.g = this.h;
    }

    public final void m(bq bqVar, String str) {
        f(0, bqVar, str, 1);
    }

    public final void n(String str) {
        if (!this.k) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.j = true;
        this.l = str;
    }

    public final bq o(Class cls) {
        cd cdVar = this.a;
        if (cdVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        if (this.b != null) {
            return cdVar.b(cls.getName());
        }
        throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
    }

    public final void p() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void q(int i, bq bqVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, bqVar, str, 2);
    }

    public final void r(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }
}

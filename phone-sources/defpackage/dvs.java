package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvs<T> {
    public static final Object a = new Object();
    public final Object b;
    int c;
    public boolean d;
    public volatile Object e;
    public int f;
    private final hn g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public dvs() {
        this.b = new Object();
        this.g = new hn();
        this.c = 0;
        Object obj = a;
        this.e = obj;
        this.k = new caw(this, 14, null);
        this.h = obj;
        this.f = -1;
    }

    static void b(String str) {
        if (!hd.a().c()) {
            throw new IllegalStateException(a.cg(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void n(dvr dvrVar) {
        if (dvrVar.d) {
            if (!dvrVar.cG()) {
                dvrVar.d(false);
                return;
            }
            int i = dvrVar.e;
            int i2 = this.f;
            if (i < i2) {
                dvrVar.e = i2;
                dvrVar.c.dV(this.h);
            }
        }
    }

    public final Object a() {
        Object obj = this.h;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    final void c(dvr dvrVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (dvrVar != null) {
                n(dvrVar);
            } else {
                hk hkVarE = this.g.e();
                while (hkVarE.hasNext()) {
                    n((dvr) ((hj) hkVarE.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            dvrVar = null;
        }
    }

    public final void d(dvk dvkVar, dvw dvwVar) {
        b("observe");
        if (dvkVar.getLifecycle().a() == dvd.a) {
            return;
        }
        dvq dvqVar = new dvq(this, dvkVar, dvwVar);
        dvr dvrVar = (dvr) this.g.f(dvwVar, dvqVar);
        if (dvrVar != null && !dvrVar.c(dvkVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dvrVar != null) {
            return;
        }
        dvkVar.getLifecycle().c(dvqVar);
    }

    public final void e(dvw dvwVar) {
        b("observeForever");
        dvp dvpVar = new dvp(this, dvwVar);
        dvr dvrVar = (dvr) this.g.f(dvwVar, dvpVar);
        if (dvrVar instanceof dvq) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dvrVar != null) {
            return;
        }
        dvpVar.d(true);
    }

    protected void h(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.e;
            obj3 = a;
            this.e = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        hd.a().b(this.k);
    }

    public void i(dvw dvwVar) {
        b("removeObserver");
        dvr dvrVar = (dvr) this.g.b(dvwVar);
        if (dvrVar == null) {
            return;
        }
        dvrVar.b();
        dvrVar.d(false);
    }

    public final void j(dvk dvkVar) {
        b("removeObservers");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            hj hjVar = (hj) ((hl) it).next();
            if (((dvr) hjVar.b).c(dvkVar)) {
                i((dvw) hjVar.a);
            }
        }
    }

    public void k(Object obj) {
        b("setValue");
        this.f++;
        this.h = obj;
        c(null);
    }

    public final boolean l() {
        return this.c > 0;
    }

    public final boolean m() {
        return this.h != a;
    }

    public dvs(Object obj) {
        this.b = new Object();
        this.g = new hn();
        this.c = 0;
        this.e = a;
        this.k = new caw(this, 14, null);
        this.h = obj;
        this.f = 0;
    }

    protected void f() {
    }

    protected void g() {
    }
}

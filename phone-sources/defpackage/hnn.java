package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnn implements hwu {
    public hlg b;
    public boolean c;
    public hnv d;
    public boolean e;
    hnr f;
    public boolean g;
    hnp h;
    public volatile boolean i;
    int j;
    public final moz l;
    public final moz m;
    private final cuj n;
    private final hpd o;
    private final hpd p;
    private final hpd q;
    private boolean s;
    private hmz t;
    final hnm a = new hnm(new ArrayList(2));
    public final mfm k = new mfm();
    private final AtomicInteger r = new AtomicInteger();

    public hnn(hpd hpdVar, hpd hpdVar2, hpd hpdVar3, moz mozVar, moz mozVar2, cuj cujVar) {
        this.o = hpdVar;
        this.p = hpdVar2;
        this.q = hpdVar3;
        this.m = mozVar;
        this.l = mozVar2;
        this.n = cujVar;
    }

    private final boolean j() {
        return this.g || this.e || this.i;
    }

    public final hpd a() {
        return this.s ? this.q : this.p;
    }

    final void b() {
        hnp hnpVar;
        synchronized (this) {
            this.k.c();
            a.aD(j(), "Not yet complete!");
            int iDecrementAndGet = this.r.decrementAndGet();
            a.aD(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                hnpVar = this.h;
                d();
            } else {
                hnpVar = null;
            }
        }
        if (hnpVar != null) {
            hnpVar.f();
        }
    }

    final synchronized void c(int i) {
        hnp hnpVar;
        a.aD(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (hnpVar = this.h) == null) {
            return;
        }
        hnpVar.d();
    }

    public final synchronized void d() {
        if (this.b == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.b = null;
        this.h = null;
        this.d = null;
        this.g = false;
        this.i = false;
        this.e = false;
        hmz hmzVar = this.t;
        if (hmzVar.c.d()) {
            hmzVar.a();
        }
        this.t = null;
        this.f = null;
        this.j = 0;
        this.n.b(this);
    }

    public final synchronized void e(hmz hmzVar) {
        this.t = hmzVar;
        int iC = hmzVar.c(1);
        ((iC == 2 || iC == 3) ? this.o : a()).execute(hmzVar);
    }

    @Override // defpackage.hwu
    public final mfm f() {
        return this.k;
    }

    public final synchronized void g(hvd hvdVar, Executor executor) {
        this.k.c();
        this.a.a.add(new hnl(hvdVar, executor));
        if (this.e) {
            c(1);
            executor.execute(new hnk(this, hvdVar, 0));
        } else if (!this.g) {
            a.aD(!this.i, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            c(1);
            executor.execute(new hnk(this, hvdVar, 1));
        }
    }

    public final synchronized void h(hvd hvdVar) {
        this.k.c();
        hnl hnlVar = new hnl(hvdVar, hwh.b);
        hnm hnmVar = this.a;
        hnmVar.a.remove(hnlVar);
        if (hnmVar.c()) {
            if (!j()) {
                this.i = true;
                hmz hmzVar = this.t;
                hmzVar.o = true;
                hmw hmwVar = hmzVar.n;
                if (hmwVar != null) {
                    hmwVar.a();
                }
                this.m.e(this, this.b);
            }
            if ((this.e || this.g) && this.r.get() == 0) {
                d();
            }
        }
    }

    public final synchronized void i(hlg hlgVar, boolean z, boolean z2) {
        this.b = hlgVar;
        this.c = z;
        this.s = z2;
    }
}

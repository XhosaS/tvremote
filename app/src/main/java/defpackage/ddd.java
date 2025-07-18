package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ddd implements dcg, dqs {
    ddj b;
    ddh c;
    int d;
    private final ddg f;
    private final afh g;
    private final dde h;
    private final dfj i;
    private final dfj j;
    private final dfj k;
    private daj m;
    private boolean n;
    private boolean o;
    private ddp p;
    private boolean q;
    private boolean r;
    private dck s;
    private volatile boolean t;
    final ddc a = new ddc();
    private final dqw e = new dqv();
    private final AtomicInteger l = new AtomicInteger();

    public ddd(dfj dfjVar, dfj dfjVar2, dfj dfjVar3, dde ddeVar, ddg ddgVar, afh afhVar) {
        this.i = dfjVar;
        this.j = dfjVar2;
        this.k = dfjVar3;
        this.h = ddeVar;
        this.f = ddgVar;
        this.g = afhVar;
    }

    private final dfj j() {
        return this.o ? this.k : this.j;
    }

    private final synchronized void k() {
        if (this.m == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.m = null;
        this.c = null;
        this.p = null;
        this.r = false;
        this.t = false;
        this.q = false;
        dck dckVar = this.s;
        if (dckVar.d.d()) {
            dckVar.c();
        }
        this.s = null;
        this.b = null;
        this.d = 0;
        this.g.b(this);
    }

    private final boolean l() {
        return this.r || this.q || this.t;
    }

    @Override // defpackage.dcg
    public final void b(dck dckVar) {
        j().execute(dckVar);
    }

    @Override // defpackage.dcg
    public final void c(ddp ddpVar, int i) {
        synchronized (this) {
            this.p = ddpVar;
            this.d = i;
        }
        synchronized (this) {
            this.e.a();
            if (this.t) {
                this.p.e();
                k();
                return;
            }
            ddc ddcVar = this.a;
            if (ddcVar.d()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.q) {
                throw new IllegalStateException("Already have resource");
            }
            this.c = new ddh(this.p, this.n, this.m, this.f);
            this.q = true;
            ddc ddcVarB = ddcVar.b();
            f(ddcVarB.a() + 1);
            this.h.c(this, this.m, this.c);
            Iterator it = ddcVarB.iterator();
            while (it.hasNext()) {
                ddb ddbVar = (ddb) it.next();
                ddbVar.b.execute(new dda(this, ddbVar.a));
            }
            e();
        }
    }

    @Override // defpackage.dcg
    public final void cA(ddj ddjVar) {
        synchronized (this) {
            this.b = ddjVar;
        }
        synchronized (this) {
            this.e.a();
            if (this.t) {
                k();
                return;
            }
            ddc ddcVar = this.a;
            if (ddcVar.d()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.r) {
                throw new IllegalStateException("Already failed once");
            }
            this.r = true;
            daj dajVar = this.m;
            ddc ddcVarB = ddcVar.b();
            f(ddcVarB.a() + 1);
            this.h.c(this, dajVar, null);
            Iterator it = ddcVarB.iterator();
            while (it.hasNext()) {
                ddb ddbVar = (ddb) it.next();
                ddbVar.b.execute(new dcz(this, ddbVar.a));
            }
            e();
        }
    }

    @Override // defpackage.dqs
    public final dqw cB() {
        return this.e;
    }

    public final synchronized void d(dos dosVar, Executor executor) {
        this.e.a();
        this.a.a.add(new ddb(dosVar, executor));
        if (this.q) {
            f(1);
            dqm.d().post(new dda(this, dosVar));
        } else {
            if (!this.r) {
                dqk.a(!this.t, "Cannot add callbacks to a cancelled EngineJob");
                return;
            }
            f(1);
            dqm.d().post(new dcz(this, dosVar));
        }
    }

    final void e() {
        ddh ddhVar;
        synchronized (this) {
            this.e.a();
            dqk.a(l(), "Not yet complete!");
            int iDecrementAndGet = this.l.decrementAndGet();
            dqk.a(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                ddhVar = this.c;
                k();
            } else {
                ddhVar = null;
            }
        }
        if (ddhVar != null) {
            ddhVar.f();
        }
    }

    final synchronized void f(int i) {
        ddh ddhVar;
        dqk.a(l(), "Not yet complete!");
        if (this.l.getAndAdd(i) != 0 || (ddhVar = this.c) == null) {
            return;
        }
        ddhVar.d();
    }

    public final synchronized void g(dos dosVar) {
        this.e.a();
        ddb ddbVar = new ddb(dosVar, dqc.b);
        ddc ddcVar = this.a;
        ddcVar.a.remove(ddbVar);
        if (ddcVar.d()) {
            if (!l()) {
                this.t = true;
                dck dckVar = this.s;
                dckVar.s = true;
                dce dceVar = dckVar.r;
                if (dceVar != null) {
                    dceVar.a();
                }
                this.h.b(this, this.m);
            }
            if ((this.q || this.r) && this.l.get() == 0) {
                k();
            }
        }
    }

    public final synchronized void h(dck dckVar) {
        this.s = dckVar;
        int iF = dckVar.f(1);
        ((iF == 2 || iF == 3) ? this.i : j()).execute(dckVar);
    }

    public final synchronized void i(daj dajVar, boolean z, boolean z2) {
        this.m = dajVar;
        this.n = z;
        this.o = z2;
    }
}

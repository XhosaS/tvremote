package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xul implements xuo, xzf {
    private boolean a;
    private final int b;
    private boolean c;
    private boolean d;
    private Runnable e;
    private boolean f;
    public xvy j;
    public final Object k = new Object();
    public final ybx l;
    public final xzi m;
    public int n;
    public boolean o;
    public final ybs p;
    public xvm q;
    public xqs r;
    public volatile boolean s;
    public boolean t;

    protected xul(int i, ybs ybsVar, ybx ybxVar) {
        this.l = ybxVar;
        xzi xziVar = new xzi(this, xqf.a, i, ybsVar, ybxVar);
        this.m = xziVar;
        this.j = xziVar;
        this.b = 32768;
        this.r = xqs.b;
        this.d = false;
        this.p = ybsVar;
    }

    private final void c() {
        boolean zH;
        synchronized (this.k) {
            zH = h();
            if (!zH) {
                Logger logger = xum.t;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.n), Integer.valueOf(this.b), Boolean.valueOf(this.o)});
                }
            }
        }
        if (zH) {
            this.q.d();
        }
    }

    protected void d() {
        a.ab(this.q != null);
        synchronized (this.k) {
            sij.x(!this.a, "Already allocated");
            this.a = true;
        }
        c();
    }

    public final void g(int i) {
        boolean z;
        synchronized (this.k) {
            sij.x(this.a, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.n;
            int i3 = this.b;
            int i4 = i2 - i;
            this.n = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final boolean h() {
        boolean z;
        synchronized (this.k) {
            z = false;
            if (this.a && this.n < this.b && !this.o) {
                z = true;
            }
        }
        return z;
    }

    public final void i(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        ybs ybsVar = this.p;
        if (ybsVar.a.compareAndSet(false, true)) {
            for (ykn yknVar : ybsVar.b) {
            }
        }
        ybx ybxVar = this.l;
        if (xtkVar.g()) {
            ybxVar.c++;
        } else {
            ybxVar.d++;
        }
        this.q.a(xtkVar, xvlVar, xsmVar);
    }

    @Override // defpackage.xzf
    public void j(boolean z) throws Throwable {
        sij.x(this.t, "status should have been reported on deframer closed");
        this.d = true;
        if (this.f && z) {
            k(xtk.j.e("Encountered end-of-stream mid-frame"), true, new xsm());
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
            this.e = null;
        }
    }

    public final void k(xtk xtkVar, boolean z, xsm xsmVar) throws Throwable {
        l(xtkVar, xvl.PROCESSED, z, xsmVar);
    }

    public final void l(xtk xtkVar, xvl xvlVar, boolean z, xsm xsmVar) throws Throwable {
        xtkVar.getClass();
        xsmVar.getClass();
        if (this.t) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.t = true;
        this.f = xtkVar.g();
        synchronized (this.k) {
            try {
                this.o = true;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (this.d) {
            this.e = null;
            i(xtkVar, xvlVar, xsmVar);
            return;
        }
        this.e = new ejr(this, xtkVar, xvlVar, xsmVar, 16);
        if (z) {
            this.j.close();
            return;
        }
        xzi xziVar = (xzi) this.j;
        if (xziVar.b()) {
            return;
        }
        if (xziVar.c()) {
            xziVar.close();
        } else {
            xziVar.f = true;
        }
    }

    @Override // defpackage.xzf
    public final void m(xzg xzgVar) {
        this.q.e(xzgVar);
    }
}

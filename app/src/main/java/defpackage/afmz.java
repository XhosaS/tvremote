package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afmz implements afnc, afvd {
    private int C;
    private boolean D;
    private final int E;
    public afox o;
    public final Object p = new Object();
    public final agae q;
    public final afvg r;
    public boolean s;

    protected afmz(int i, afzw afzwVar, agae agaeVar) {
        this.q = agaeVar;
        afvg afvgVar = new afvg(this, afey.a, i, afzwVar, agaeVar);
        this.r = afvgVar;
        this.o = afvgVar;
        this.E = 32768;
    }

    private final void c() {
        boolean zO;
        synchronized (this.p) {
            zO = o();
            if (!zO) {
                Logger logger = afna.t;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.D), Integer.valueOf(this.C), Integer.valueOf(this.E), Boolean.valueOf(this.s)});
                }
            }
        }
        if (zO) {
            g().e();
        }
    }

    protected void d() {
        yqw.L(g() != null);
        synchronized (this.p) {
            yqw.M(!this.D, "Already allocated");
            this.D = true;
        }
        c();
    }

    protected abstract afzz g();

    @Override // defpackage.afvd
    public final void k(afzy afzyVar) {
        g().d(afzyVar);
    }

    public final void l(int i) {
        synchronized (this.p) {
            this.C += i;
        }
    }

    public final void m(int i) {
        boolean z;
        synchronized (this.p) {
            yqw.M(this.D, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.C;
            int i3 = this.E;
            int i4 = i2 - i;
            this.C = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final void n() {
        afvg afvgVar = this.r;
        afvgVar.a = this;
        this.o = afvgVar;
    }

    public final boolean o() {
        boolean z;
        synchronized (this.p) {
            z = false;
            if (this.D && this.C < this.E && !this.s) {
                z = true;
            }
        }
        return z;
    }
}

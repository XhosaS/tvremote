package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ypp extends yot {
    private long a;
    public ygx b;
    private boolean c;

    private static final long eK(boolean z) {
        return z ? 4294967296L : 1L;
    }

    protected abstract Thread e();

    @Override // defpackage.yot
    public final yot g(int i) {
        wae.S(1);
        return this;
    }

    protected void j(long j, yps ypsVar) {
        ypa.a.w(j, ypsVar);
    }

    public void k() {
        throw null;
    }

    public long l() {
        throw null;
    }

    public final void m(boolean z) {
        long jEK = this.a - eK(z);
        this.a = jEK;
        if (jEK > 0) {
            return;
        }
        boolean z2 = yoy.a;
        if (this.c) {
            k();
        }
    }

    public final void n(ypi ypiVar) {
        ygx ygxVar = this.b;
        if (ygxVar == null) {
            ygxVar = new ygx();
            this.b = ygxVar;
        }
        ygxVar.addLast(ypiVar);
    }

    public final void o(boolean z) {
        this.a += eK(z);
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean p() {
        return this.a >= eK(true);
    }

    public final boolean q() {
        ygx ygxVar = this.b;
        if (ygxVar != null) {
            return ygxVar.isEmpty();
        }
        return true;
    }

    public final boolean r() {
        ypi ypiVar;
        ygx ygxVar = this.b;
        if (ygxVar == null || (ypiVar = (ypi) ygxVar.g()) == null) {
            return false;
        }
        ypiVar.run();
        return true;
    }

    protected final void s() {
        Thread threadE = e();
        if (Thread.currentThread() != threadE) {
            LockSupport.unpark(threadE);
        }
    }
}

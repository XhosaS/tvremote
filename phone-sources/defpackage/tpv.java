package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpv {
    public final uic c;
    public final uhc d;
    private final Executor f;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public tpv(ufv ufvVar, Executor executor) {
        ugk ugkVar = ugk.a;
        this.f = new uib(ugkVar);
        uic uicVar = new uic();
        this.c = uicVar;
        uhc uhcVar = new uhc(ufvVar, executor, 1);
        this.d = uhcVar;
        uicVar.c(uhcVar, ugkVar);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final uhp c() {
        AtomicLong atomicLong;
        long j;
        final int iA;
        uic uicVar = this.c;
        if (uicVar.isDone()) {
            return uicVar;
        }
        do {
            atomicLong = this.a;
            j = atomicLong.get();
            iA = a(j);
        } while (!atomicLong.compareAndSet(j, b(iA, ((int) j) + 1)));
        final uic uicVar2 = new uic();
        uhp uhpVar = (uhp) this.e.getAndSet(uicVar2);
        uicVar2.ev(uhpVar == null ? sfy.G(trc.b(new ufv() { // from class: tpq
            @Override // defpackage.ufv
            public final uhp a() {
                return this.a.d(iA);
            }
        }), ugk.a) : ues.j(uhpVar, Throwable.class, trc.c(new ufw() { // from class: tpr
            @Override // defpackage.ufw
            public final uhp a(Object obj) {
                return this.a.d(iA);
            }
        }), this.f));
        final tpt tptVar = new tpt(this, iA);
        uicVar2.c(new Runnable() { // from class: tps
            @Override // java.lang.Runnable
            public final void run() {
                tpt tptVar2 = tptVar;
                uic uicVar3 = uicVar2;
                try {
                    Object objJ = sfy.J(uicVar3);
                    uic uicVar4 = this.a.c;
                    uicVar4.b(objJ);
                    tptVar2.ev(uicVar4);
                } catch (Throwable unused) {
                    tptVar2.ev(uicVar3);
                }
            }
        }, ugk.a);
        return tptVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ufv] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final uhp d(int i) {
        AtomicReference atomicReference;
        tpu tpuVar;
        AtomicLong atomicLong = this.a;
        if (a(atomicLong.get()) > i) {
            return sfy.A();
        }
        tpu tpuVar2 = new tpu(i);
        do {
            atomicReference = this.b;
            tpuVar = (tpu) atomicReference.get();
            if (tpuVar != null && tpuVar.a > i) {
                return sfy.A();
            }
        } while (!a.t(atomicReference, tpuVar, tpuVar2));
        if (a(atomicLong.get()) > i) {
            tpuVar2.cancel(true);
            a.t(atomicReference, tpuVar2, null);
            return tpuVar2;
        }
        uhc uhcVar = this.d;
        ?? r0 = uhcVar.a;
        ?? r6 = uhcVar.b;
        if (r0 == 0 || r6 == 0) {
            tpuVar2.ev(this.c);
            return tpuVar2;
        }
        tpuVar2.ev(sfy.G(trc.b(r0), r6));
        return tpuVar2;
    }
}

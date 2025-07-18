package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwk {
    public final cjl c;
    public final cio d;
    private final Executor f;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public bwk(chs chsVar, Executor executor) {
        chz chzVar = chz.a;
        this.f = new cjk(chzVar);
        cjl cjlVar = new cjl();
        this.c = cjlVar;
        cio cioVar = new cio(chsVar, executor, 1);
        this.d = cioVar;
        cjlVar.m(cioVar, chzVar);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final cja c() {
        AtomicLong atomicLong;
        long j;
        final int iA;
        cjl cjlVar = this.c;
        if (cjlVar.isDone()) {
            return cjlVar;
        }
        do {
            atomicLong = this.a;
            j = atomicLong.get();
            iA = a(j);
        } while (!atomicLong.compareAndSet(j, b(iA, ((int) j) + 1)));
        final cjl cjlVar2 = new cjl();
        cja cjaVar = (cja) this.e.getAndSet(cjlVar2);
        cjlVar2.e(cjaVar == null ? qm.O(bxr.a(new chs() { // from class: bwf
            @Override // defpackage.chs
            public final cja a() {
                return this.a.d(iA);
            }
        }), chz.a) : cgp.i(cjaVar, Throwable.class, bxr.b(new cht() { // from class: bwg
            @Override // defpackage.cht
            public final cja a(Object obj) {
                return this.a.d(iA);
            }
        }), this.f));
        final bwi bwiVar = new bwi(this, iA);
        cjlVar2.m(new Runnable() { // from class: bwh
            @Override // java.lang.Runnable
            public final void run() {
                bwi bwiVar2 = bwiVar;
                cjl cjlVar3 = cjlVar2;
                try {
                    Object objP = qm.P(cjlVar3);
                    cjl cjlVar4 = this.a.c;
                    cjlVar4.c(objP);
                    bwiVar2.e(cjlVar4);
                } catch (Throwable unused) {
                    bwiVar2.e(cjlVar3);
                }
            }
        }, chz.a);
        return bwiVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [chs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final cja d(int i) {
        AtomicReference atomicReference;
        bwj bwjVar;
        AtomicLong atomicLong = this.a;
        if (a(atomicLong.get()) > i) {
            return qm.J();
        }
        bwj bwjVar2 = new bwj(i);
        do {
            atomicReference = this.b;
            bwjVar = (bwj) atomicReference.get();
            if (bwjVar != null && bwjVar.a > i) {
                return qm.J();
            }
        } while (!sd.g(atomicReference, bwjVar, bwjVar2));
        if (a(atomicLong.get()) > i) {
            bwjVar2.cancel(true);
            sd.g(atomicReference, bwjVar2, null);
            return bwjVar2;
        }
        cio cioVar = this.d;
        ?? r0 = cioVar.a;
        ?? r6 = cioVar.b;
        if (r0 == 0 || r6 == 0) {
            bwjVar2.e(this.c);
            return bwjVar2;
        }
        bwjVar2.e(qm.O(bxr.a(r0), r6));
        return bwjVar2;
    }
}

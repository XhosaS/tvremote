package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrf {
    public final vrc a;
    public final zyu d;
    private final Executor f;
    public final AtomicLong b = new AtomicLong(a(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public vrf(zvh zvhVar, Executor executor) {
        zwk zwkVar = zwk.a;
        this.f = new zyt(zwkVar);
        zyu zyuVar = new zyu();
        this.d = zyuVar;
        vrc vrcVar = new vrc(zvhVar, executor);
        this.a = vrcVar;
        zyuVar.d(vrcVar, zwkVar);
    }

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final zyd b() {
        AtomicLong atomicLong;
        long j;
        final int i;
        zyu zyuVar = this.d;
        if (zyuVar.isDone()) {
            return zyuVar;
        }
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, a(i, ((int) j) + 1)));
        final zyu zyuVar2 = new zyu();
        zyd zydVar = (zyd) this.e.getAndSet(zyuVar2);
        zyuVar2.eZ(zydVar == null ? zxn.l(wyo.b(new zvh() { // from class: vqz
            @Override // defpackage.zvh
            public final zyd a() {
                return this.a.c(i);
            }
        }), zwk.a) : zud.h(zydVar, Throwable.class, wyo.c(new zvi() { // from class: vra
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.c(i);
            }
        }), this.f));
        final vrd vrdVar = new vrd(this, i);
        zyuVar2.d(new Runnable() { // from class: vrb
            @Override // java.lang.Runnable
            public final void run() {
                vrd vrdVar2 = vrdVar;
                zyu zyuVar3 = zyuVar2;
                try {
                    Object objO = zxn.o(zyuVar3);
                    zyu zyuVar4 = this.a.d;
                    zyuVar4.p(objO);
                    vrdVar2.eZ(zyuVar4);
                } catch (Throwable unused) {
                    vrdVar2.eZ(zyuVar3);
                }
            }
        }, zwk.a);
        return vrdVar;
    }

    public final zyd c(int i) {
        AtomicReference atomicReference;
        vre vreVar;
        AtomicLong atomicLong = this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            return zxn.f();
        }
        vre vreVar2 = new vre(i);
        do {
            atomicReference = this.c;
            vreVar = (vre) atomicReference.get();
            if (vreVar != null && vreVar.a > i) {
                return zxn.f();
            }
        } while (!vqy.a(atomicReference, vreVar, vreVar2));
        if (((int) (atomicLong.get() >>> 32)) > i) {
            vreVar2.cancel(true);
            vqy.a(atomicReference, vreVar2, null);
            return vreVar2;
        }
        vrc vrcVar = this.a;
        zvh zvhVar = vrcVar.a;
        Executor executor = vrcVar.b;
        if (zvhVar == null || executor == null) {
            vreVar2.eZ(this.d);
            return vreVar2;
        }
        vreVar2.eZ(zxn.l(wyo.b(zvhVar), executor));
        return vreVar2;
    }
}

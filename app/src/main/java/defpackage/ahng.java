package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahng {
    public final agzy a;
    public final agzw b;
    public final agzw c;
    public final agzw d;
    private final AtomicReferenceArray e = new AtomicReferenceArray(128);

    public ahng() {
        agzz agzzVar = agzz.a;
        this.a = new agzy(null, agzzVar);
        this.b = new agzw(0, agzzVar);
        this.c = new agzw(0, agzzVar);
        this.d = new agzw(0, agzzVar);
    }

    public final int a() {
        return this.b.c - this.c.c;
    }

    public final ahnc b(ahnc ahncVar) {
        if (a() == 127) {
            return ahncVar;
        }
        if (ahncVar.h) {
            agzw.a.incrementAndGet(this.d);
        }
        agzw agzwVar = this.b;
        int i = 127 & agzwVar.c;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ahncVar);
                agzw.a.incrementAndGet(agzwVar);
                return null;
            }
            Thread.yield();
        }
    }

    public final ahnc c() {
        ahnc ahncVar;
        while (true) {
            agzw agzwVar = this.c;
            agzw agzwVar2 = this.b;
            int i = agzwVar.c;
            if (i - agzwVar2.c == 0) {
                return null;
            }
            int i2 = i & 127;
            if (agzwVar.a(i, i + 1) && (ahncVar = (ahnc) this.e.getAndSet(i2, null)) != null) {
                if (ahncVar.h) {
                    agzw.a.decrementAndGet(this.d);
                    boolean z = ahbx.a;
                }
                return ahncVar;
            }
        }
    }

    public final ahnc d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        int i2 = i & 127;
        ahnc ahncVar = (ahnc) atomicReferenceArray.get(i2);
        if (ahncVar != null && ahncVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ahncVar, null)) {
                if (atomicReferenceArray.get(i2) != ahncVar) {
                }
            }
            if (z) {
                agzw.a.decrementAndGet(this.d);
            }
            return ahncVar;
        }
        return null;
    }
}

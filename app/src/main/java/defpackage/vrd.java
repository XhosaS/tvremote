package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vrd extends zum {
    private vrf a;
    private final int b;

    public vrd(vrf vrfVar, int i) {
        this.a = vrfVar;
        this.b = i;
    }

    @Override // defpackage.zum
    protected final String a() {
        zvh zvhVar;
        vrf vrfVar = this.a;
        if (vrfVar == null || (zvhVar = vrfVar.a.a) == null) {
            return null;
        }
        String strT = a.t(zvhVar, "callable=[", "]");
        vre vreVar = (vre) this.a.c.get();
        if (vreVar == null) {
            return strT;
        }
        return strT + ", trial=[" + vreVar.toString() + "]";
    }

    @Override // defpackage.zum
    protected final void b() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        vrf vrfVar = this.a;
        this.a = null;
        if (vrfVar == null) {
            return;
        }
        do {
            atomicLong = vrfVar.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(a.l(j, "Refcount is: "));
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, vrf.a(i2, i - 1)));
        if (z) {
            while (true) {
                AtomicReference atomicReference = vrfVar.c;
                vre vreVar = (vre) atomicReference.get();
                if (vreVar != null) {
                    if (vreVar.a <= this.b) {
                        vreVar.cancel(true);
                        while (!atomicReference.compareAndSet(vreVar, null)) {
                            if (atomicReference.get() != vreVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.zum
    protected final boolean eZ(zyd zydVar) {
        return super.eZ(zydVar);
    }
}

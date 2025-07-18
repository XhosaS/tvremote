package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tpt extends ufb {
    private tpv a;
    private final int b;

    public tpt(tpv tpvVar, int i) {
        this.a = tpvVar;
        this.b = i;
    }

    @Override // defpackage.ufb
    protected final void d() {
        AtomicLong atomicLong;
        long j;
        int i;
        int iA;
        boolean z;
        AtomicReference atomicReference;
        tpu tpuVar;
        tpv tpvVar = this.a;
        this.a = null;
        if (tpvVar == null) {
            return;
        }
        do {
            atomicLong = tpvVar.a;
            j = atomicLong.get();
            i = (int) j;
            iA = tpv.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(a.cs(j, "Refcount is: "));
            }
            z = i == -2147483647;
            if (z) {
                iA++;
            }
        } while (!atomicLong.compareAndSet(j, tpv.b(iA, i - 1)));
        if (z) {
            do {
                atomicReference = tpvVar.b;
                tpuVar = (tpu) atomicReference.get();
                if (tpuVar == null) {
                    return;
                }
                if (tpuVar.a > this.b) {
                    return;
                } else {
                    tpuVar.cancel(true);
                }
            } while (!a.u(atomicReference, tpuVar));
        }
    }

    @Override // defpackage.ufb
    protected final String dw() {
        Object obj;
        tpv tpvVar = this.a;
        if (tpvVar == null || (obj = tpvVar.d.a) == null) {
            return null;
        }
        String strCh = a.ch(obj, "callable=[", "]");
        tpu tpuVar = (tpu) this.a.b.get();
        if (tpuVar == null) {
            return strCh;
        }
        return strCh + ", trial=[" + tpuVar.toString() + "]";
    }

    @Override // defpackage.ufb
    protected final boolean ev(uhp uhpVar) {
        return super.ev(uhpVar);
    }
}

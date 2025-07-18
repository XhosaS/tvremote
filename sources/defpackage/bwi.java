package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwi extends cgx {
    private bwk a;
    private final int b;

    public bwi(bwk bwkVar, int i) {
        this.a = bwkVar;
        this.b = i;
    }

    @Override // defpackage.cgx
    protected final String a() {
        Object obj;
        bwk bwkVar = this.a;
        if (bwkVar == null || (obj = bwkVar.d.a) == null) {
            return null;
        }
        String strI = b.i(obj, "callable=[", "]");
        bwj bwjVar = (bwj) this.a.b.get();
        if (bwjVar == null) {
            return strI;
        }
        return strI + ", trial=[" + bwjVar.toString() + "]";
    }

    @Override // defpackage.cgx
    protected final void b() {
        AtomicLong atomicLong;
        long j;
        int i;
        int iA;
        boolean z;
        bwk bwkVar = this.a;
        this.a = null;
        if (bwkVar == null) {
            return;
        }
        do {
            atomicLong = bwkVar.a;
            j = atomicLong.get();
            i = (int) j;
            iA = bwk.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError("Refcount is: " + j);
            }
            z = i == -2147483647;
            if (z) {
                iA++;
            }
        } while (!atomicLong.compareAndSet(j, bwk.b(iA, i - 1)));
        if (z) {
            while (true) {
                AtomicReference atomicReference = bwkVar.b;
                bwj bwjVar = (bwj) atomicReference.get();
                if (bwjVar != null) {
                    if (bwjVar.a <= this.b) {
                        bwjVar.cancel(true);
                        while (!atomicReference.compareAndSet(bwjVar, null)) {
                            if (atomicReference.get() != bwjVar) {
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

    @Override // defpackage.cgx
    public final boolean e(cja cjaVar) {
        return super.e(cjaVar);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhk {
    private static final zhj a = new zhj(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final zhj a() {
        AtomicReference atomicReferenceC = c();
        zhj zhjVar = a;
        zhj zhjVar2 = (zhj) atomicReferenceC.getAndSet(zhjVar);
        if (zhjVar2 == zhjVar) {
            return new zhj();
        }
        if (zhjVar2 == null) {
            atomicReferenceC.set(null);
            return new zhj();
        }
        atomicReferenceC.set(zhjVar2.f);
        zhjVar2.f = null;
        zhjVar2.c = 0;
        return zhjVar2;
    }

    public static final void b(zhj zhjVar) {
        if (zhjVar.f != null || zhjVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (zhjVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        zhj zhjVar2 = a;
        zhj zhjVar3 = (zhj) atomicReferenceC.getAndSet(zhjVar2);
        if (zhjVar3 != zhjVar2) {
            int i = zhjVar3 != null ? zhjVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(zhjVar3);
                return;
            }
            zhjVar.f = zhjVar3;
            zhjVar.b = 0;
            zhjVar.c = i + 8192;
            atomicReferenceC.set(zhjVar);
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}

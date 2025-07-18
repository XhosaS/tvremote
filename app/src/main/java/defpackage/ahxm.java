package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxm {
    public static final ahxm a = new ahxm();
    private static final ahxl b = new ahxl(new byte[0], 0, 0, false);
    private static final int c;
    private static final AtomicReference[] d;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        c = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        d = atomicReferenceArr;
    }

    private ahxm() {
    }

    public static final ahxl a() {
        AtomicReference atomicReferenceC = a.c();
        ahxl ahxlVar = b;
        ahxl ahxlVar2 = (ahxl) atomicReferenceC.getAndSet(ahxlVar);
        if (ahxlVar2 == ahxlVar) {
            return new ahxl();
        }
        if (ahxlVar2 == null) {
            atomicReferenceC.set(null);
            return new ahxl();
        }
        atomicReferenceC.set(ahxlVar2.f);
        ahxlVar2.f = null;
        ahxlVar2.c = 0;
        return ahxlVar2;
    }

    public static final void b(ahxl ahxlVar) {
        if (ahxlVar.f != null || ahxlVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ahxlVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = a.c();
        ahxl ahxlVar2 = b;
        ahxl ahxlVar3 = (ahxl) atomicReferenceC.getAndSet(ahxlVar2);
        if (ahxlVar3 != ahxlVar2) {
            int i = ahxlVar3 != null ? ahxlVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(ahxlVar3);
                return;
            }
            ahxlVar.f = ahxlVar3;
            ahxlVar.b = 0;
            ahxlVar.c = i + 8192;
            atomicReferenceC.set(ahxlVar);
        }
    }

    private final AtomicReference c() {
        return d[(int) (Thread.currentThread().getId() & (c - 1))];
    }
}

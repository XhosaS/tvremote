package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ufs extends ufr {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ufu.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ufu.class, "remainingField");

    @Override // defpackage.ufr
    public final int a(ufu ufuVar) {
        return b.decrementAndGet(ufuVar);
    }

    @Override // defpackage.ufr
    public final void b(ufu ufuVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(ufuVar, null, set) && atomicReferenceFieldUpdater.get(ufuVar) == null) {
        }
    }
}

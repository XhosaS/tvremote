package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chp extends cho {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(chr.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(chr.class, "remainingField");

    @Override // defpackage.cho
    public final int a(chr chrVar) {
        return b.decrementAndGet(chrVar);
    }

    @Override // defpackage.cho
    public final void b(chr chrVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(chrVar, null, set) && atomicReferenceFieldUpdater.get(chrVar) == null) {
        }
    }
}

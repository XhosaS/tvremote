package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zve extends zvd {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zvg.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(zvg.class, "remainingField");

    @Override // defpackage.zvd
    public final int a(zvg zvgVar) {
        return b.decrementAndGet(zvgVar);
    }

    @Override // defpackage.zvd
    public final void b(zvg zvgVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(zvgVar, null, set) && atomicReferenceFieldUpdater.get(zvgVar) == null) {
        }
    }
}

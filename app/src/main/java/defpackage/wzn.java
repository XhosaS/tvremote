package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzn implements wzl {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(wzp.class, wzm.class, "currentMetadata");

    @Override // defpackage.wzl
    public final wzm a(wzp wzpVar) {
        return (wzm) this.a.get(wzpVar);
    }

    @Override // defpackage.wzl
    public final boolean b(wzp wzpVar, wzm wzmVar, wzm wzmVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(wzpVar, wzmVar, wzmVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(wzpVar) == wzmVar);
        return false;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hje extends hiz {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public hje(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.hiz
    public final void a(hjh hjhVar, hjh hjhVar2) {
        this.b.lazySet(hjhVar, hjhVar2);
    }

    @Override // defpackage.hiz
    public final void b(hjh hjhVar, Thread thread) {
        this.a.lazySet(hjhVar, thread);
    }

    @Override // defpackage.hiz
    public final boolean c(hji hjiVar, hjd hjdVar, hjd hjdVar2) {
        return a.F(this.d, hjiVar, hjdVar, hjdVar2);
    }

    @Override // defpackage.hiz
    public final boolean d(hji hjiVar, Object obj, Object obj2) {
        return a.F(this.e, hjiVar, obj, obj2);
    }

    @Override // defpackage.hiz
    public final boolean e(hji hjiVar, hjh hjhVar, hjh hjhVar2) {
        return a.F(this.c, hjiVar, hjhVar, hjhVar2);
    }
}

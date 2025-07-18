package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class coh extends coc {
    final AtomicReferenceFieldUpdater<cok, Thread> a;
    final AtomicReferenceFieldUpdater<cok, cok> b;
    final AtomicReferenceFieldUpdater<col, cok> c;
    final AtomicReferenceFieldUpdater<col, cog> d;
    final AtomicReferenceFieldUpdater<col, Object> e;

    public coh(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.coc
    public final void a(cok cokVar, cok cokVar2) {
        this.b.lazySet(cokVar, cokVar2);
    }

    @Override // defpackage.coc
    public final void b(cok cokVar, Thread thread) {
        this.a.lazySet(cokVar, thread);
    }

    @Override // defpackage.coc
    public final boolean c(col colVar, cog cogVar, cog cogVar2) {
        return a.F(this.d, colVar, cogVar, cogVar2);
    }

    @Override // defpackage.coc
    public final boolean d(col colVar, Object obj, Object obj2) {
        return a.F(this.e, colVar, obj, obj2);
    }

    @Override // defpackage.coc
    public final boolean e(col colVar, cok cokVar, cok cokVar2) {
        return a.F(this.c, colVar, cokVar, cokVar2);
    }
}

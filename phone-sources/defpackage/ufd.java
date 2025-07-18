package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ufd extends ufc {
    private static final AtomicReferenceFieldUpdater<ufi, Thread> a = AtomicReferenceFieldUpdater.newUpdater(ufi.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater<ufi, ufi> b = AtomicReferenceFieldUpdater.newUpdater(ufi.class, ufi.class, "next");
    private static final AtomicReferenceFieldUpdater<? super ufj<?>, ufi> c = AtomicReferenceFieldUpdater.newUpdater(ufj.class, ufi.class, "waitersField");
    private static final AtomicReferenceFieldUpdater<? super ufj<?>, uey> d = AtomicReferenceFieldUpdater.newUpdater(ufj.class, uey.class, "listenersField");
    private static final AtomicReferenceFieldUpdater<? super ufj<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(ufj.class, Object.class, "valueField");

    @Override // defpackage.ufc
    public final uey a(ufj ufjVar, uey ueyVar) {
        return d.getAndSet(ufjVar, ueyVar);
    }

    @Override // defpackage.ufc
    public final ufi b(ufj ufjVar, ufi ufiVar) {
        return c.getAndSet(ufjVar, ufiVar);
    }

    @Override // defpackage.ufc
    public final void c(ufi ufiVar, ufi ufiVar2) {
        b.lazySet(ufiVar, ufiVar2);
    }

    @Override // defpackage.ufc
    public final void d(ufi ufiVar, Thread thread) {
        a.lazySet(ufiVar, thread);
    }

    @Override // defpackage.ufc
    public final boolean e(ufj ufjVar, uey ueyVar, uey ueyVar2) {
        return a.F(d, ufjVar, ueyVar, ueyVar2);
    }

    @Override // defpackage.ufc
    public final boolean f(ufj ufjVar, Object obj, Object obj2) {
        return a.F(e, ufjVar, obj, obj2);
    }

    @Override // defpackage.ufc
    public final boolean g(ufj ufjVar, ufi ufiVar, ufi ufiVar2) {
        return a.F(c, ufjVar, ufiVar, ufiVar2);
    }
}

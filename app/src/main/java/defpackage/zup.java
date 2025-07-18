package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zup extends zun {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zuu.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(zuu.class, zuu.class, "next");
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(zuv.class, zuu.class, "waitersField");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(zuv.class, zuj.class, "listenersField");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(zuv.class, Object.class, "valueField");

    @Override // defpackage.zun
    public final zuj a(zuv zuvVar, zuj zujVar) {
        return (zuj) d.getAndSet(zuvVar, zujVar);
    }

    @Override // defpackage.zun
    public final zuu b(zuv zuvVar, zuu zuuVar) {
        return (zuu) c.getAndSet(zuvVar, zuuVar);
    }

    @Override // defpackage.zun
    public final void c(zuu zuuVar, zuu zuuVar2) {
        b.lazySet(zuuVar, zuuVar2);
    }

    @Override // defpackage.zun
    public final void d(zuu zuuVar, Thread thread) {
        a.lazySet(zuuVar, thread);
    }

    @Override // defpackage.zun
    public final boolean e(zuv zuvVar, zuj zujVar, zuj zujVar2) {
        return zuo.a(d, zuvVar, zujVar, zujVar2);
    }

    @Override // defpackage.zun
    public final boolean f(zuv zuvVar, Object obj, Object obj2) {
        return zuo.a(e, zuvVar, obj, obj2);
    }

    @Override // defpackage.zun
    public final boolean g(zuv zuvVar, zuu zuuVar, zuu zuuVar2) {
        return zuo.a(c, zuvVar, zuuVar, zuuVar2);
    }
}

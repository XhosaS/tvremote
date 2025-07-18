package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cha extends cgy {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(chf.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(chf.class, chf.class, "next");
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(chg.class, chf.class, "waitersField");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(chg.class, cgu.class, "listenersField");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(chg.class, Object.class, "valueField");

    @Override // defpackage.cgy
    public final cgu a(chg chgVar, cgu cguVar) {
        return (cgu) d.getAndSet(chgVar, cguVar);
    }

    @Override // defpackage.cgy
    public final chf b(chg chgVar, chf chfVar) {
        return (chf) c.getAndSet(chgVar, chfVar);
    }

    @Override // defpackage.cgy
    public final void c(chf chfVar, chf chfVar2) {
        b.lazySet(chfVar, chfVar2);
    }

    @Override // defpackage.cgy
    public final void d(chf chfVar, Thread thread) {
        a.lazySet(chfVar, thread);
    }

    @Override // defpackage.cgy
    public final boolean e(chg chgVar, cgu cguVar, cgu cguVar2) {
        return cgz.a(d, chgVar, cguVar, cguVar2);
    }

    @Override // defpackage.cgy
    public final boolean f(chg chgVar, Object obj, Object obj2) {
        return cgz.a(e, chgVar, obj, obj2);
    }

    @Override // defpackage.cgy
    public final boolean g(chg chgVar, chf chfVar, chf chfVar2) {
        return cgz.a(c, chgVar, chfVar, chfVar2);
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afux extends afrf {
    private final afuw e;
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    public static final Logger b = Logger.getLogger(afux.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afux(afhq afhqVar) {
        super(afhqVar);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new afuw(this, afhqVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.afrf, defpackage.afhq
    public final void f() {
        int i = afuw.b;
        afuw afuwVar = this.e;
        if (!afuwVar.a.getAndSet(true)) {
            afuwVar.clear();
        }
        afun afunVar = (afun) this.a;
        afunVar.J.a(1, "shutdown() called");
        if (afunVar.C.compareAndSet(false, true)) {
            afkc afkcVar = afunVar.m;
            afkcVar.c(new aftj(afunVar));
            afkcVar.b();
            afuh afuhVar = afunVar.L;
            afkc afkcVar2 = afuhVar.c.m;
            afkcVar2.c(new afua(afuhVar));
            afkcVar2.b();
            afkcVar.c(new afth(afunVar));
            afkcVar.b();
        }
    }
}

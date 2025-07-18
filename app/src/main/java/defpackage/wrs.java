package defpackage;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrs {
    private final zyh a;

    public wrs(zyh zyhVar) {
        this.a = zyhVar;
    }

    public final zyd a(zvh zvhVar, yzq yzqVar) {
        zyh zyhVar;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet<wrq> hashSet = new HashSet();
        Iterator it = yzqVar.iterator();
        while (true) {
            zyhVar = this.a;
            if (!it.hasNext()) {
                break;
            }
            final wrr wrrVar = (wrr) it.next();
            wrrVar.getClass();
            zyd zydVarL = zxn.l(wyo.b(wyo.b(new zvh() { // from class: wrn
                @Override // defpackage.zvh
                public final zyd a() {
                    return wrrVar.b();
                }
            })), zyhVar);
            vqi.d("com/google/apps/tiktok/sync/monitoring/FutureMonitor", "reportStarts", 130, zydVarL, "Future Monitor failed", new Object[0]);
            hashSet.add(new wrk(wrrVar, zydVarL));
        }
        zvh zvhVarB = wyo.b(zvhVar);
        zwk zwkVar = zwk.a;
        final zyd zydVarL2 = zxn.l(wyo.b(zvhVarB), zwkVar);
        final zyd zydVarA = vqv.a(zydVarL2, wyo.i(new Callable() { // from class: wrl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
        }), zwkVar);
        HashSet hashSet2 = new HashSet();
        for (final wrq wrqVar : hashSet) {
            zyd zydVarB = xab.b(wrqVar.b(), zydVarA, zydVarL2).b(new zvh() { // from class: wro
                @Override // defpackage.zvh
                public final zyd a() {
                    wrq wrqVar2 = wrqVar;
                    zxn.o(wrqVar2.b());
                    Long l = (Long) zxn.o(zydVarA);
                    return wrqVar2.a().a(zydVarL2, l.longValue());
                }
            }, zyhVar);
            vqi.d("com/google/apps/tiktok/sync/monitoring/FutureMonitor", "reportFinishes", 155, zydVarB, "Future Monitor failed", new Object[0]);
            hashSet2.add(zydVarB);
        }
        return xab.b(zydVarL2, zxn.n(zxn.i(zxn.a(hashSet2).a(wyo.i(new Callable() { // from class: wrp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }), zwkVar)), 10L, TimeUnit.SECONDS, zyhVar)).b(wyo.b(new zvh() { // from class: wrm
            @Override // defpackage.zvh
            public final zyd a() {
                return zydVarL2;
            }
        }), zwkVar);
    }
}

package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrc implements wqe {
    public static final zdy a = zdy.h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler");
    public final vtm b;
    private final wqg c;
    private final Executor d;
    private final Boolean e = false;
    private final Boolean f;

    public wrc(vtm vtmVar, wqg wqgVar, Executor executor, Boolean bool) {
        this.b = vtmVar;
        this.c = wqgVar;
        this.d = executor;
        this.f = bool;
    }

    @Override // defpackage.wqe
    public final zyd a(Set set, long j, Map map) {
        if (!this.f.booleanValue()) {
            return zxy.a;
        }
        ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 83, "SyncWorkManagerOneTimeScheduler.java")).u("Scheduling next onetime WorkManager workers");
        return zuz.h(this.c.a(set, j, map), wyo.c(new zvi() { // from class: wqz
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                Map map2 = (Map) obj;
                if (map2.isEmpty()) {
                    return zxy.a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    wrc wrcVar = this.a;
                    final wqd wqdVar = (wqd) ((Map.Entry) it.next()).getValue();
                    Iterator it2 = wqdVar.c().iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (true) {
                        boolean z4 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        wns wnsVar = (wns) it2.next();
                        z |= wnsVar == wns.ON_CHARGER;
                        z3 |= wnsVar == wns.ON_NETWORK_CONNECTED;
                        if (wnsVar != wns.ON_NETWORK_UNMETERED) {
                            z4 = false;
                        }
                        z2 |= z4;
                    }
                    cao caoVar = new cao();
                    caoVar.a = z;
                    if (z2) {
                        caoVar.b(3);
                    } else if (z3) {
                        caoVar.b(2);
                    }
                    caq caqVarA = caoVar.a();
                    Set setC = wqdVar.c();
                    StringBuilder sb = new StringBuilder(vth.a("SyncTask", wrcVar.b()));
                    Iterator it3 = new TreeSet(setC).iterator();
                    while (it3.hasNext()) {
                        sb.append(((wns) it3.next()).d);
                        sb.append('_');
                    }
                    String string = sb.toString();
                    vte vteVar = new vte(Math.max(0L, wqdVar.a() - Instant.now().toEpochMilli()), TimeUnit.MILLISECONDS);
                    wrcVar.b();
                    vto vtoVarN = vts.n(wqn.class);
                    vtb vtbVar = (vtb) vtoVarN;
                    vtbVar.c = vteVar;
                    vtbVar.g = yqt.i(new vtf(string, 1));
                    vtbVar.b = caqVarA;
                    vtbVar.h = yzq.o(new zdd("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"));
                    arrayList.add(zuz.g(wrcVar.b.c(vtoVarN.b()), wyo.a(new yqi() { // from class: wrb
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            wqd wqdVar2 = wqdVar;
                            wqdVar2.c();
                            wqdVar2.a();
                            return null;
                        }
                    }), zwk.a));
                }
                return zxn.c(arrayList).a(wyo.i(new Callable() { // from class: wra
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((zdv) ((zdv) wrc.a.b()).q("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 102, "SyncWorkManagerOneTimeScheduler.java")).u("Successfully scheduled next onetime workers");
                        return null;
                    }
                }), zwk.a);
            }
        }), this.d);
    }

    final yqt b() {
        this.e.booleanValue();
        return ypv.a;
    }
}

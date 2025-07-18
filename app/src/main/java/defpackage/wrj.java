package defpackage;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrj implements wqe {
    public static final zdy a = zdy.h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final vtm b;
    public final Executor c;
    private final wqg d;
    private final Boolean e = false;
    private final Boolean f;

    public wrj(vtm vtmVar, wqg wqgVar, Executor executor, Boolean bool) {
        this.b = vtmVar;
        this.d = wqgVar;
        this.c = executor;
        this.f = bool;
    }

    public static caq b(Set set) {
        cao caoVar = new cao();
        caoVar.a = set.contains(wns.ON_CHARGER);
        if (set.contains(wns.ON_NETWORK_UNMETERED)) {
            caoVar.b(3);
        } else if (set.contains(wns.ON_NETWORK_CONNECTED)) {
            caoVar.b(2);
        }
        return caoVar.a();
    }

    static String d(caq caqVar, yqt yqtVar) {
        StringBuilder sb = new StringBuilder(vth.a("SyncPeriodicTask", yqtVar));
        if (caqVar.c) {
            sb.append("_charging");
        }
        int i = caqVar.j;
        if (i == 3) {
            sb.append("_unmetered");
        } else if (i == 2) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    @Override // defpackage.wqe
    public final zyd a(Set set, long j, Map map) {
        if (!this.f.booleanValue()) {
            return zxy.a;
        }
        ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 84, "SyncWorkManagerPeriodicScheduler.java")).u("Scheduling next periodic WorkManager workers");
        return zuz.h(this.d.a(set, j, map), wyo.c(new zvi() { // from class: wre
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final wrj wrjVar;
                Map map2 = (Map) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    wrjVar = this.a;
                    if (!it.hasNext()) {
                        break;
                    }
                    final wqd wqdVar = (wqd) ((Map.Entry) it.next()).getValue();
                    vtm vtmVar = wrjVar.b;
                    caq caqVarB = wrj.b(wqdVar.c());
                    String strD = wrj.d(wrj.b(wqdVar.c()), wrjVar.c());
                    long jA = wqdVar.a();
                    yqt yqtVarC = wrjVar.c();
                    zdy zdyVar = wqx.a;
                    vto vtoVarN = vts.n(wqx.class);
                    vtb vtbVar = (vtb) vtoVarN;
                    vtbVar.d = yqt.i(Long.valueOf(jA));
                    vtbVar.f = yqt.i(new vtd(wqx.b, ypv.a));
                    vtbVar.g = yqt.i(new vtf(strD, 3));
                    vtbVar.b = caqVarB;
                    vtbVar.h = yzq.o(new zdd(wqx.e(yqtVarC)));
                    arrayList.add(zuz.g(vtmVar.c(vtoVarN.b()), wyo.a(new yqi() { // from class: wrd
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            wqd wqdVar2 = wqdVar;
                            wqdVar2.c();
                            wqdVar2.a();
                            return null;
                        }
                    }), zwk.a));
                }
                Set setKeySet = map2.keySet();
                final HashSet hashSetNewHashSet = Sets.newHashSet();
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    hashSetNewHashSet.add(wrj.b((Set) it2.next()));
                }
                arrayList.add(zuz.h(wrjVar.b.d(wqx.e(wrjVar.c())), wyo.c(new zvi() { // from class: wrg
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        for (ccr ccrVar : (List) obj2) {
                            if (ccrVar.b == ccq.a) {
                                hashSet.add(ccrVar.d);
                            }
                        }
                        zdl it3 = yzq.o(hashSet).iterator();
                        while (it3.hasNext()) {
                            Set set2 = hashSetNewHashSet;
                            caq caqVar = (caq) it3.next();
                            if (!set2.contains(caqVar)) {
                                wrj wrjVar2 = wrjVar;
                                arrayList2.add(zuz.g(wrjVar2.b.a(wrj.d(caqVar, wrjVar2.c())), new yqi() { // from class: wrf
                                    @Override // defpackage.yqi
                                    public final Object apply(Object obj3) {
                                        return null;
                                    }
                                }, zwk.a));
                            }
                        }
                        return zxn.a(arrayList2).a(wyo.i(new Callable() { // from class: wri
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }), zwk.a);
                    }
                }), wrjVar.c));
                return zxn.c(arrayList).a(wyo.i(new Callable() { // from class: wrh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((zdv) ((zdv) wrj.a.b()).q("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 103, "SyncWorkManagerPeriodicScheduler.java")).u("Successfully scheduled next periodic workers");
                        return null;
                    }
                }), zwk.a);
            }
        }), this.c);
    }

    final yqt c() {
        this.e.booleanValue();
        return ypv.a;
    }
}

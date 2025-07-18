package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.common.collect.Sets;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpy implements woh {
    public static final zdy a = zdy.h("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final zyh b;
    public final zyg c;
    public final rnw d;
    public final vqi e;
    public final wor f;
    public final Map g;
    public final zyd h;
    public final Object i = new Object();
    public final we j;
    public final Map k;
    public final Map l;
    private final Context m;
    private final yqt n;
    private final boolean o;
    private final wqe p;
    private final AtomicReference q;
    private final wry r;

    public wpy(Context context, zyh zyhVar, zyg zygVar, rnw rnwVar, vqi vqiVar, yqt yqtVar, yqt yqtVar2, wor worVar, Map map, Map map2, Map map3, wry wryVar, wqe wqeVar) {
        we weVar = new we();
        this.j = weVar;
        this.k = new we();
        this.l = new we();
        this.q = new AtomicReference();
        this.m = context;
        this.b = zyhVar;
        this.c = zygVar;
        this.d = rnwVar;
        this.e = vqiVar;
        this.n = yqtVar;
        Boolean bool = false;
        this.o = ((Boolean) ((yqz) yqtVar2).a).booleanValue();
        this.f = worVar;
        this.g = map3;
        this.r = wryVar;
        bool.getClass();
        yqw.M(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.h = worVar.c();
        HashMap map4 = new HashMap();
        for (Map.Entry entry : ((yyr) map).entrySet()) {
            wnt wntVarA = wnt.a((String) entry.getKey());
            wsm wsmVar = wsm.a;
            wsl wslVar = new wsl();
            wsk wskVar = wntVarA.a;
            if ((wslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                wslVar.y();
            }
            wsm wsmVar2 = (wsm) wslVar.b;
            wskVar.getClass();
            wsmVar2.c = wskVar;
            wsmVar2.b |= 1;
            o(new wqc((wsm) wslVar.v()), entry, map4);
        }
        weVar.putAll(map4);
        this.p = wqeVar;
        String strB = rnu.b();
        int iIndexOf = strB.indexOf(58);
        if (iIndexOf == -1) {
            return;
        }
        strB.substring(iIndexOf + 1);
    }

    static /* synthetic */ void j(zyd zydVar) {
        try {
            zxn.o(zydVar);
        } catch (CancellationException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 678, "SyncManagerImpl.java")).u("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e2)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 676, "SyncManagerImpl.java")).u("Error scheduling next sync wakeup");
        }
    }

    static /* synthetic */ void k(zyd zydVar) {
        try {
            zxn.o(zydVar);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 779, "SyncManagerImpl.java")).u("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 783, "SyncManagerImpl.java")).u("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final zyd m() {
        return zuz.g(((vhq) ((yqz) this.n).a).f(), wyo.a(new yqi() { // from class: wpl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                HashSet hashSet = new HashSet();
                for (vha vhaVar : (List) obj) {
                    if (!vhaVar.b().j.equals("incognito")) {
                        hashSet.add(vhaVar.a());
                    }
                }
                return hashSet;
            }
        }), this.b);
    }

    private final zyd n() {
        AtomicReference atomicReference;
        zyu zyuVar = new zyu();
        while (true) {
            atomicReference = this.q;
            if (atomicReference.compareAndSet(null, zyuVar)) {
                zyd zydVarM = m();
                yqi yqiVar = new yqi() { // from class: wpu
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        this.a.i((Set) obj);
                        return null;
                    }
                };
                zyuVar.eZ(zuz.g(zydVarM, wyo.a(yqiVar), this.b));
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        return zxn.i((zyd) atomicReference.get());
    }

    private final void o(wqc wqcVar, Map.Entry entry, Map map) {
        try {
            wnw wnwVar = (wnw) ((agow) entry.getValue()).a();
            if (wnwVar.c()) {
                map.put(wqcVar, wnwVar);
            }
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 894, "SyncManagerImpl.java")).x("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new aawt(aaws.NO_USER_DATA, entry.getKey()));
        }
    }

    @Override // defpackage.woh
    public final zyd a() {
        ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 580, "SyncManagerImpl.java")).u("#poke(). Scheduling workers.");
        return this.r.a(f(zxn.h(zcp.b)), new zvi() { // from class: wrt
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return ((wsa) obj).a();
            }
        });
    }

    @Override // defpackage.woh
    public final zyd b() {
        ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 196, "SyncManagerImpl.java")).u("#sync(). Running Synclets and scheduling next sync.");
        final long epochMilli = Instant.now().toEpochMilli();
        final wor worVar = this.f;
        zyd zydVarA = this.r.a(vqv.b(worVar.d.submit(wyo.i(new Callable() { // from class: wop
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wsi wsiVar = wsi.a;
                wor worVar2 = worVar;
                worVar2.b.writeLock().lock();
                long j = epochMilli;
                try {
                    try {
                        wsi wsiVarA = worVar2.a();
                        wsh wshVar = new wsh();
                        wshVar.B(wsiVarA);
                        if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            wshVar.y();
                        }
                        wsi wsiVar2 = (wsi) wshVar.b;
                        wsiVar2.b |= 2;
                        wsiVar2.e = j;
                        try {
                            worVar2.g((wsi) wshVar.v());
                        } catch (IOException e) {
                            ((zdv) ((zdv) ((zdv) wor.a.d()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", 539, "SyncManagerDataStore.java")).u("Error writing sync data file. Cannot update last wakeup.");
                        }
                        worVar2.b.writeLock().unlock();
                        int i = wsiVarA.b;
                        if ((i & 2) != 0) {
                            return Long.valueOf(wsiVarA.e);
                        }
                        if ((i & 1) != 0) {
                            return Long.valueOf(wsiVarA.c);
                        }
                        return -1L;
                    } catch (IOException e2) {
                        yrv.b(e2);
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th) {
                    worVar2.b.writeLock().unlock();
                    throw th;
                }
            }
        })), wyo.b(new zvh() { // from class: wpc
            @Override // defpackage.zvh
            public final zyd a() {
                final wpy wpyVar = this.a;
                return wpyVar.f(zuz.h(wpyVar.h, wyo.c(new zvi() { // from class: wph
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        final long jLongValue = ((Long) obj).longValue();
                        final we weVar = new we();
                        final we weVar2 = new we();
                        final long epochMilli2 = Instant.now().toEpochMilli();
                        final wpy wpyVar2 = wpyVar;
                        zyd zydVarH = wpyVar2.h(wpyVar2.f.b());
                        yqi yqiVarA = wyo.a(new yqi() { // from class: wpb
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                Map map;
                                long j;
                                wpb wpbVar = this;
                                long j2 = jLongValue;
                                Map map2 = weVar2;
                                Map map3 = (Map) obj2;
                                wpy wpyVar3 = wpyVar2;
                                synchronized (wpyVar3.i) {
                                    Iterator it = wpyVar3.j.entrySet().iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        map = weVar;
                                        if (zHasNext) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            wqc wqcVar = (wqc) entry.getKey();
                                            Map map4 = wpyVar3.k;
                                            if (map4.containsKey(wqcVar) || !wpyVar3.d.a()) {
                                                wpbVar = this;
                                            } else {
                                                Map map5 = wpyVar3.l;
                                                Long lValueOf = Long.valueOf(j2);
                                                long jMax = Math.max(((Long) Map.EL.getOrDefault(map5, wqcVar, lValueOf)).longValue(), ((Long) Map.EL.getOrDefault(map3, wqcVar, lValueOf)).longValue());
                                                wnt wntVar = ((wqc) entry.getKey()).b;
                                                wnp wnpVarD = ((wnw) entry.getValue()).d();
                                                long j3 = ((wnk) wnpVarD).a;
                                                long j4 = j2;
                                                long j5 = epochMilli2;
                                                if (jMax + j3 <= j5) {
                                                    Iterator it2 = ((yyr) ((wnk) wnpVarD).c).entrySet().iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            zyu zyuVar = new zyu();
                                                            map4.put(wqcVar, zyuVar);
                                                            map.put(wqcVar, zyuVar);
                                                            break;
                                                        }
                                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                                        wnr wnrVar = (wnr) entry2.getValue();
                                                        long jA = wnrVar.a();
                                                        long j6 = j5 - jMax;
                                                        long jA2 = wnrVar.a() + j3;
                                                        if (jA == -1 || j6 <= jA2) {
                                                            wns wnsVar = (wns) entry2.getKey();
                                                            if (map2.containsKey(wnsVar)) {
                                                                j = j5;
                                                            } else {
                                                                j = j5;
                                                                map2.put(wnsVar, Boolean.valueOf(((wnz) ((agow) wpyVar3.g.get(wnsVar)).a()).a()));
                                                            }
                                                            if (!((Boolean) map2.get(wnsVar)).booleanValue()) {
                                                                break;
                                                            }
                                                            j5 = j;
                                                        }
                                                    }
                                                }
                                                wpbVar = this;
                                                j2 = j4;
                                            }
                                        }
                                    }
                                }
                                return map;
                            }
                        });
                        zyh zyhVar = wpyVar2.b;
                        return zuz.h(zuz.g(zydVarH, yqiVarA, zyhVar), wyo.c(new zvi() { // from class: wpg
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                final java.util.Map map = (java.util.Map) obj2;
                                ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 303, "SyncManagerImpl.java")).x("Running synclets: %s", Collection.EL.stream(map.keySet()).map(new Function() { // from class: wos
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo116andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((wqc) obj3).b.a.c;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray());
                                if (map.isEmpty()) {
                                    return zxn.h(zcp.b);
                                }
                                final wpy wpyVar3 = wpyVar2;
                                final Set setKeySet = map.keySet();
                                final wor worVar2 = wpyVar3.f;
                                Callable callable = new Callable() { // from class: woj
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        boolean zValueOf;
                                        java.util.Collection<wqc> collection;
                                        wor worVar3 = worVar2;
                                        worVar3.b.writeLock().lock();
                                        try {
                                            wsi wsiVarA = wsi.a;
                                            boolean z = false;
                                            try {
                                                wsiVarA = worVar3.a();
                                            } catch (IOException e) {
                                                if (!worVar3.h(e)) {
                                                    ((zdv) ((zdv) ((zdv) wor.a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", 276, "SyncManagerDataStore.java")).u("Error, could not read or clear store. Aborting sync attempt.");
                                                    zValueOf = false;
                                                }
                                            }
                                            wsh wshVar = new wsh();
                                            wshVar.B(wsiVarA);
                                            if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                wshVar.y();
                                            }
                                            ((wsi) wshVar.b).d = abzb.b;
                                            long epochMilli3 = Instant.now().toEpochMilli();
                                            HashSet hashSet = new HashSet();
                                            Iterator it = wsiVarA.d.iterator();
                                            while (true) {
                                                boolean zHasNext = it.hasNext();
                                                collection = setKeySet;
                                                if (!zHasNext) {
                                                    break;
                                                }
                                                wsg wsgVar = (wsg) it.next();
                                                wsm wsmVar = wsgVar.c;
                                                if (wsmVar == null) {
                                                    wsmVar = wsm.a;
                                                }
                                                if (collection.contains(new wqc(wsmVar))) {
                                                    wsm wsmVar2 = wsgVar.c;
                                                    if (wsmVar2 == null) {
                                                        wsmVar2 = wsm.a;
                                                    }
                                                    hashSet.add(new wqc(wsmVar2));
                                                    wsf wsfVar = new wsf();
                                                    wsfVar.B(wsgVar);
                                                    if ((wsfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        wsfVar.y();
                                                    }
                                                    wsg wsgVar2 = (wsg) wsfVar.b;
                                                    wsgVar2.b |= 4;
                                                    wsgVar2.e = epochMilli3;
                                                    wshVar.a((wsg) wsfVar.v());
                                                } else {
                                                    wshVar.a(wsgVar);
                                                }
                                            }
                                            for (wqc wqcVar : collection) {
                                                if (!hashSet.contains(wqcVar)) {
                                                    wsg wsgVar3 = wsg.a;
                                                    wsf wsfVar2 = new wsf();
                                                    wsm wsmVar3 = wqcVar.a;
                                                    if ((wsfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        wsfVar2.y();
                                                    }
                                                    wsg wsgVar4 = (wsg) wsfVar2.b;
                                                    wsmVar3.getClass();
                                                    wsgVar4.c = wsmVar3;
                                                    wsgVar4.b |= 1;
                                                    long j = worVar3.f;
                                                    if ((wsfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        wsfVar2.y();
                                                    }
                                                    wsg wsgVar5 = (wsg) wsfVar2.b;
                                                    wsgVar5.b |= 2;
                                                    wsgVar5.d = j;
                                                    if ((wsfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        wsfVar2.y();
                                                    }
                                                    wsg wsgVar6 = (wsg) wsfVar2.b;
                                                    wsgVar6.b |= 4;
                                                    wsgVar6.e = epochMilli3;
                                                    if ((wsfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        wsfVar2.y();
                                                    }
                                                    wsg wsgVar7 = (wsg) wsfVar2.b;
                                                    wsgVar7.b |= 8;
                                                    wsgVar7.f = 0;
                                                    wshVar.a((wsg) wsfVar2.v());
                                                }
                                            }
                                            if (wsiVarA.c < 0) {
                                                long epochMilli4 = worVar3.f;
                                                if (epochMilli4 < 0) {
                                                    epochMilli4 = Instant.now().toEpochMilli();
                                                    worVar3.f = epochMilli4;
                                                }
                                                if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                    wshVar.y();
                                                }
                                                wsi wsiVar = (wsi) wshVar.b;
                                                wsiVar.b |= 1;
                                                wsiVar.c = epochMilli4;
                                            }
                                            try {
                                                worVar3.g((wsi) wshVar.v());
                                                worVar3.e.set(true);
                                                z = true;
                                            } catch (IOException unused) {
                                            } catch (Throwable th) {
                                                worVar3.e.set(true);
                                                throw th;
                                            }
                                            zValueOf = Boolean.valueOf(z);
                                            return zValueOf;
                                        } finally {
                                            worVar3.b.writeLock().unlock();
                                        }
                                    }
                                };
                                final zyd zydVarK = zxn.k(wyo.i(callable), worVar2.d);
                                zyd zydVarH2 = wpyVar3.h(zydVarK);
                                zvh zvhVarB = wyo.b(new zvh() { // from class: wot
                                    @Override // defpackage.zvh
                                    public final zyd a() {
                                        return wpyVar3.c(zydVarK, map);
                                    }
                                });
                                zyh zyhVar2 = wpyVar3.b;
                                zyd zydVarB = vqv.b(zydVarH2, zvhVarB, zyhVar2);
                                map.getClass();
                                zyd zydVarA2 = vqv.a(zydVarB, wyo.i(new Callable() { // from class: wou
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return map.keySet();
                                    }
                                }), zyhVar2);
                                wpyVar3.e.e(zydVarA2, wzg.b());
                                return zydVarA2;
                            }
                        }), zyhVar);
                    }
                }), wpyVar.b));
            }
        }), this.b), new zvi() { // from class: wrv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return ((wsa) obj).b();
            }
        });
        zydVarA.d(new Runnable() { // from class: wpd
            @Override // java.lang.Runnable
            public final void run() {
                ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 207, "SyncManagerImpl.java")).u("#sync() complete");
            }
        }, zwk.a);
        return zydVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zyd c(zyd zydVar, final java.util.Map map) {
        Throwable th;
        boolean zBooleanValue;
        final wnw wnwVar;
        try {
            zBooleanValue = ((Boolean) zxn.o(zydVar)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            zBooleanValue = false;
        }
        Throwable th2 = th;
        if (!zBooleanValue) {
            ((zdv) ((zdv) ((zdv) a.d()).p(th2)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", (char) 332, "SyncManagerImpl.java")).u("Failed preparing sync datastore for sync. Aborting sync attempt.");
            long epochMilli = Instant.now().toEpochMilli();
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f.d((wqc) it.next(), epochMilli, false));
            }
            return vqv.a(zxn.e(arrayList), wyo.i(new Callable() { // from class: woy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    java.util.Map map2 = map;
                    wpy wpyVar = this.a;
                    synchronized (wpyVar.i) {
                        Iterator it2 = map2.keySet().iterator();
                        while (it2.hasNext()) {
                        }
                    }
                    return null;
                }
            }), this.b);
        }
        yqw.L(n().isDone());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            final wqc wqcVar = (wqc) entry.getKey();
            final zyu zyuVar = (zyu) entry.getValue();
            StringBuilder sb = new StringBuilder("Synclet: ");
            wnt wntVar = wqcVar.b;
            sb.append(wntVar.a.c);
            if (wqcVar.a()) {
                sb.append(" ");
                sb.append(((AutoValue_AccountId) wqcVar.c).a);
            }
            wwc wwcVarE = wwb.a;
            if (wqcVar.a()) {
                wwa wwaVarB = wwcVarE.b();
                vfh.a(wwaVarB, wqcVar.c);
                wwcVarE = ((wwc) wwaVarB).e();
            }
            wvx wvxVarF = wzg.f(sb.toString(), wwcVarE, true);
            try {
                synchronized (this.i) {
                    wnwVar = (wnw) this.j.get(wqcVar);
                }
                if (wnwVar == null) {
                    zyuVar.cancel(false);
                } else {
                    zvh zvhVar = new zvh() { // from class: wpe
                        @Override // defpackage.zvh
                        public final zyd a() {
                            final wqc wqcVar2 = wqcVar;
                            final wnw wnwVar2 = wnwVar;
                            zvh zvhVarB = wyo.b(new zvh() { // from class: wpn
                                @Override // defpackage.zvh
                                public final zyd a() {
                                    ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 412, "SyncManagerImpl.java")).x("Starting synclet: %s", new aawt(aaws.NO_USER_DATA, wqcVar2.b.a.c));
                                    wnw wnwVar3 = wnwVar2;
                                    yqw.M(wnwVar3.c(), "Synclet binding must be enabled to have a Synclet");
                                    yqw.M(wnwVar3.c(), "Synclet binding must be enabled to have a SyncletProvider");
                                    agow agowVarB = wnwVar3.b();
                                    agowVarB.getClass();
                                    wnu wnuVar = (wnu) agowVarB.a();
                                    wnuVar.getClass();
                                    return wnuVar.a();
                                }
                            });
                            wpy wpyVar = this.a;
                            return zxn.n(zuz.g(zxn.l(zvhVarB, wpyVar.c), new yqi() { // from class: wpo
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    return null;
                                }
                            }, zwk.a), ((wnk) wnwVar2.d()).b, TimeUnit.MILLISECONDS, wpyVar.b);
                        }
                    };
                    wry wryVarU = wqcVar.a() ? ((wpx) wgv.a(this.m, wpx.class, wqcVar.c)).u() : this.r;
                    Set set = (Set) wryVarU.b.a();
                    yzo yzoVarI = yzq.i(set.size());
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        yzoVarI.c(new wrx((wsb) it2.next(), wntVar));
                    }
                    zyd zydVarA = wryVarU.a.a(zvhVar, yzoVarI.f());
                    vqi.d("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl", "startSyncletAndMonitorExecution", 99, zydVarA, "Synclet sync() failed for synckey: %s", new aawt(aaws.NO_USER_DATA, wntVar));
                    zyuVar.eZ(zydVarA);
                }
                zvh zvhVar2 = new zvh() { // from class: wpm
                    @Override // defpackage.zvh
                    public final zyd a() {
                        return this.a.d(zyuVar, wqcVar);
                    }
                };
                zyh zyhVar = this.b;
                final zyd zydVarB = vqv.b(zyuVar, wyo.b(zvhVar2), zyhVar);
                zydVarB.d(new Runnable() { // from class: wow
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(wqcVar, zydVarB);
                    }
                }, zyhVar);
                wvxVarF.a(zydVarB);
                wvxVarF.close();
                arrayList2.add(zydVarB);
            } finally {
            }
        }
        return zuz.g(zxn.m(arrayList2), new yqi() { // from class: wox
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return null;
            }
        }, zwk.a);
    }

    public final /* synthetic */ zyd d(zyd zydVar, wqc wqcVar) {
        boolean z = false;
        try {
            zxn.o(zydVar);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 464, "SyncManagerImpl.java")).x("Sync cancelled from timeout and will be retried later: %s", wqcVar.b.a.c);
            }
        }
        final long epochMilli = Instant.now().toEpochMilli();
        zyd zydVarD = this.f.d(wqcVar, epochMilli, z);
        Callable callable = new Callable() { // from class: wpp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(epochMilli);
            }
        };
        return vqv.a(zydVarD, wyo.i(callable), this.b);
    }

    public final zyd e() {
        ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 719, "SyncManagerImpl.java")).u("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
        yqw.M(true, "onAccountsChanged called without an AccountManager bound");
        final zyd zydVarH = h(m());
        final wor worVar = this.f;
        final zyd zydVarEN = worVar.d.submit(wyo.i(new Callable() { // from class: wol
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yzo yzoVar = new yzo();
                wor worVar2 = worVar;
                try {
                    Iterator it = worVar2.a().f.iterator();
                    while (it.hasNext()) {
                        yzoVar.c(AccountId.b(((Integer) it.next()).intValue()));
                    }
                    return yzoVar.f();
                } catch (IOException e) {
                    worVar2.h(e);
                    return yzoVar.f();
                }
            }
        }));
        xaa xaaVarD = xab.d(zydVarH, zydVarEN);
        zvh zvhVar = new zvh() { // from class: wpq
            @Override // defpackage.zvh
            public final zyd a() {
                Set set = (Set) zxn.o(zydVarH);
                Set set2 = (Set) zxn.o(zydVarEN);
                zdc zdcVarC = Sets.c(set, set2);
                zdc zdcVarC2 = Sets.c(set2, set);
                wpy wpyVar = this.a;
                wpyVar.i(zdcVarC);
                final HashSet hashSet = new HashSet();
                Object obj = wpyVar.i;
                synchronized (obj) {
                    for (wqc wqcVar : wpyVar.j.keySet()) {
                        if (zdcVarC2.contains(wqcVar.c)) {
                            hashSet.add(wqcVar);
                        }
                    }
                    synchronized (obj) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            zyd zydVar = (zyd) wpyVar.k.get((wqc) it.next());
                            if (zydVar != null) {
                                zydVar.cancel(false);
                            }
                        }
                    }
                    if (!zdcVarC.isEmpty() && zdcVarC2.isEmpty()) {
                        return zxy.a;
                    }
                    ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 744, "SyncManagerImpl.java")).u("Accounts did change. Rescheduling synclets.");
                    return zuz.g(wpyVar.f(zxn.h(zcp.b)), wyo.a(new yqi() { // from class: wpf
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }), zwk.a);
                }
                wpyVar.j.keySet().removeAll(hashSet);
                vqi vqiVar = wpyVar.e;
                final wor worVar2 = wpyVar.f;
                zyd zydVarSubmit = worVar2.d.submit(new Callable() { // from class: won
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        wor worVar3 = worVar2;
                        worVar3.b.writeLock().lock();
                        Set set3 = hashSet;
                        try {
                            wsi wsiVarA = wsi.a;
                            try {
                                wsiVarA = worVar3.a();
                            } catch (IOException e) {
                                if (!worVar3.h(e)) {
                                    ((zdv) ((zdv) ((zdv) wor.a.c()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 485, "SyncManagerDataStore.java")).u("Unable to read or clear store. Cannot remove account.");
                                }
                            }
                            wsh wshVar = new wsh();
                            wshVar.B(wsiVarA);
                            if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                wshVar.y();
                            }
                            ((wsi) wshVar.b).d = abzb.b;
                            for (wsg wsgVar : wsiVarA.d) {
                                wsm wsmVar = wsgVar.c;
                                if (wsmVar == null) {
                                    wsmVar = wsm.a;
                                }
                                if (!set3.contains(new wqc(wsmVar))) {
                                    wshVar.a(wsgVar);
                                }
                            }
                            try {
                                worVar3.g((wsi) wshVar.v());
                            } catch (IOException e2) {
                                ((zdv) ((zdv) ((zdv) wor.a.c()).p(e2)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 505, "SyncManagerDataStore.java")).u("Error writing sync data file. Cannot remove account.");
                            }
                            worVar3.b.writeLock().unlock();
                            return null;
                        } catch (Throwable th) {
                            worVar3.b.writeLock().unlock();
                            throw th;
                        }
                    }
                });
                vqiVar.e(zydVarSubmit, wzg.b());
                vqi.d("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "removeAccounts", 814, zydVarSubmit, "Error removing accounts from sync. IDs: %s", zdcVarC2);
                if (!zdcVarC.isEmpty()) {
                }
                ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 744, "SyncManagerImpl.java")).u("Accounts did change. Rescheduling synclets.");
                return zuz.g(wpyVar.f(zxn.h(zcp.b)), wyo.a(new yqi() { // from class: wpf
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }), zwk.a);
            }
        };
        zyh zyhVar = this.b;
        zyd zydVarB = xaaVarD.b(zvhVar, zyhVar);
        if (!this.o) {
            this.q.set(zydVarB);
        }
        final zyd zydVarN = zxn.n(zydVarB, 10L, TimeUnit.SECONDS, zyhVar);
        zye zyeVar = new zye(wyo.h(new Runnable() { // from class: wpr
            @Override // java.lang.Runnable
            public final void run() {
                wpy.k(zydVarN);
            }
        }));
        zydVarN.d(zyeVar, zwk.a);
        return zyeVar;
    }

    public final zyd f(final zyd zydVar) {
        if (this.o) {
            return zxn.b(zydVar, zxn.i(zxn.b(zydVar, this.h, n()).b(wyo.b(new zvh() { // from class: woz
                @Override // defpackage.zvh
                public final zyd a() {
                    ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInline", 605, "SyncManagerImpl.java")).u("Scheduling next wakeup");
                    wpy wpyVar = this.a;
                    zyd zydVarG = wpyVar.g(zydVar, ((Long) zxn.o(wpyVar.h)).longValue());
                    wpyVar.e.e(zydVarG, wzg.b());
                    zydVarG.d(new wpv(zydVarG), wpyVar.b);
                    return zydVarG;
                }
            }), this.c))).a(wyo.i(new Callable() { // from class: wpa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return null;
                }
            }), zwk.a);
        }
        zyd zydVar2 = this.h;
        zvi zviVar = new zvi() { // from class: wps
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final wpy wpyVar = this.a;
                final zyd zydVar3 = zydVar;
                final Long l = (Long) obj;
                return vqv.b(wpyVar.h(zydVar3), wyo.b(new zvh() { // from class: wov
                    @Override // defpackage.zvh
                    public final zyd a() {
                        ((zdv) ((zdv) wpy.a.b()).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInParallel", 638, "SyncManagerImpl.java")).u("Completed sync. Scheduling next wakeup");
                        return wpyVar.g(zydVar3, l.longValue());
                    }
                }), wpyVar.b);
            }
        };
        zyh zyhVar = this.b;
        zyd zydVarI = zxn.i(zuz.h(zydVar2, wyo.c(zviVar), zyhVar));
        this.e.e(zydVarI, wzg.b());
        zydVarI.d(new wpv(zydVarI), zyhVar);
        return zuz.g(zydVar, wyo.a(new yqi() { // from class: wpt
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return null;
            }
        }), zwk.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Set] */
    public final zyd g(zyd zydVar, long j) {
        final HashMap map;
        zcp zcpVar = zcp.b;
        try {
            zcpVar = (Set) zxn.o(zydVar);
        } catch (CancellationException | ExecutionException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 661, "SyncManagerImpl.java")).u("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
        }
        synchronized (this.i) {
            map = new HashMap(this.j);
        }
        Collection.EL.removeIf(map.entrySet(), new Predicate() { // from class: wpi
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !this.a.d.a();
            }
        });
        zyd zydVarA = this.p.a(zcpVar, j, map);
        zvi zviVar = new zvi() { // from class: wpj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                wpy wpyVar = this.a;
                final Set setKeySet = map.keySet();
                final wor worVar = wpyVar.f;
                return worVar.d.submit(new Callable() { // from class: wom
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        wor worVar2 = worVar;
                        worVar2.b.writeLock().lock();
                        Set<wqc> set = setKeySet;
                        try {
                            wsi wsiVarA = wsi.a;
                            try {
                                wsiVarA = worVar2.a();
                            } catch (IOException e2) {
                                if (!worVar2.h(e2)) {
                                    ((zdv) ((zdv) ((zdv) wor.a.c()).p(e2)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 444, "SyncManagerDataStore.java")).u("Unable to read or clear store, will not update scheduled account ids. ");
                                }
                            }
                            wsh wshVar = new wsh();
                            wshVar.B(wsiVarA);
                            if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                wshVar.y();
                            }
                            ((wsi) wshVar.b).f = abxe.a;
                            TreeSet treeSet = new TreeSet();
                            for (wqc wqcVar : set) {
                                if (wqcVar.a()) {
                                    treeSet.add(Integer.valueOf(((AutoValue_AccountId) wqcVar.c).a));
                                }
                            }
                            if ((wshVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                wshVar.y();
                            }
                            wsi wsiVar = (wsi) wshVar.b;
                            abxj abxjVar = wsiVar.f;
                            if (!abxjVar.c()) {
                                int size = abxjVar.size();
                                wsiVar.f = abxjVar.d(size + size);
                            }
                            abus.m(treeSet, wsiVar.f);
                            try {
                                worVar2.g((wsi) wshVar.v());
                            } catch (IOException e3) {
                                ((zdv) ((zdv) ((zdv) wor.a.c()).p(e3)).q("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 465, "SyncManagerDataStore.java")).u("Error writing scheduled account ids");
                            }
                            worVar2.b.writeLock().unlock();
                            return null;
                        } catch (Throwable th) {
                            worVar2.b.writeLock().unlock();
                            throw th;
                        }
                    }
                });
            }
        };
        return zuz.h(zydVarA, wyo.c(zviVar), zwk.a);
    }

    public final zyd h(final zyd zydVar) {
        zyd zydVarN = n();
        zvi zviVar = new zvi() { // from class: wpk
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return zydVar;
            }
        };
        return zuz.h(zydVarN, wyo.c(zviVar), zwk.a);
    }

    public final void i(Set set) {
        synchronized (this.i) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AccountId accountId = (AccountId) it.next();
                we weVar = this.j;
                HashMap map = new HashMap();
                for (Map.Entry entry : ((yyr) ((wpw) wgv.a(this.m, wpw.class, accountId)).o()).entrySet()) {
                    wnt wntVarA = wnt.a((String) entry.getKey());
                    int iA = accountId.a();
                    wsm wsmVar = wsm.a;
                    wsl wslVar = new wsl();
                    wsk wskVar = wntVarA.a;
                    if ((wslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        wslVar.y();
                    }
                    wsm wsmVar2 = (wsm) wslVar.b;
                    wskVar.getClass();
                    wsmVar2.c = wskVar;
                    wsmVar2.b |= 1;
                    if ((wslVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        wslVar.y();
                    }
                    wsm wsmVar3 = (wsm) wslVar.b;
                    wsmVar3.b |= 2;
                    wsmVar3.d = iA;
                    o(new wqc((wsm) wslVar.v()), entry, map);
                }
                weVar.putAll(map);
            }
        }
    }

    public final /* synthetic */ void l(wqc wqcVar, zyd zydVar) {
        synchronized (this.i) {
            try {
                this.l.put(wqcVar, (Long) zxn.o(zydVar));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }
}

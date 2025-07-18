package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omh implements olt {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl");
    public static final yzq b = yzq.q(acgd.GELLER_CONFIG, acgd.PRIVACY_SETTINGS);
    public final yqt c;
    public final Geller d;
    public final acdh e;
    public final yqt f;
    public final yqi g;
    public final olk h;
    public final ont i;
    public final boolean j;
    public final oln k;
    public final ExecutorService m;
    public final ExecutorService n;
    private final yrx t;
    public final Object o = new Object();
    public boolean l = false;
    final Map p = new HashMap();
    final Map q = new HashMap();
    final Map r = new HashMap();
    final Map s = new HashMap();

    public omh(yqt yqtVar, Geller geller, ont ontVar, yqt yqtVar2, yqi yqiVar, Set set, yqi yqiVar2, abwf abwfVar, Boolean bool, okc okcVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, oln olnVar, yrx yrxVar, yqt yqtVar3, yqt yqtVar4) {
        this.c = yqtVar;
        this.d = geller;
        this.e = geller.h;
        this.g = yqiVar2;
        this.f = yqtVar2;
        this.i = ontVar;
        this.t = yrxVar;
        this.m = executorService;
        this.n = executorService2;
        this.k = olnVar;
        this.j = ((oje) olnVar).a;
        this.h = new olk(yqtVar, geller, ontVar, yqiVar, set, yqiVar2, abwfVar, bool, okcVar, executorService, executorService2, executorService3, map, yrxVar);
    }

    public static yzq c(yzq yzqVar, oir oirVar) {
        yzo yzoVar = new yzo();
        zdl it = yzqVar.iterator();
        while (it.hasNext()) {
            acgd acgdVar = (acgd) it.next();
            if (oirVar.a(acgdVar)) {
                yzoVar.c(acgdVar);
            } else {
                ((zdv) ((zdv) a.d()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "filterEnabled", 811, "GellerSyncSchedulerImpl.java")).x("Corpus: %s is disabled", acgdVar.name());
            }
        }
        return yzoVar.f();
    }

    private final zyd e(final acgd acgdVar, Map map) {
        final zyd zydVar = (zyd) map.get(acgdVar);
        return zydVar == null ? zxn.h(new ojf().a()) : zxn.b(zydVar).a(wyo.i(new Callable() { // from class: olu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zdy zdyVar = omh.a;
                return (oml) ((Map) zxn.o(zydVar)).get(acgdVar);
            }
        }), this.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: all -> 0x00e7, TryCatch #0 {, blocks: (B:16:0x005e, B:18:0x0066, B:20:0x006e, B:22:0x0076, B:23:0x0078, B:25:0x007a, B:27:0x0082, B:28:0x008f, B:30:0x0091, B:32:0x0097, B:34:0x009f, B:35:0x00a5, B:37:0x00a7, B:39:0x00ad, B:41:0x00b5, B:42:0x00c2, B:44:0x00c4, B:45:0x00e1), top: B:57:0x005e, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, olo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.zyd f(final defpackage.acfr r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omh.f(acfr):zyd");
    }

    private final synchronized zyd g(final String str, yqt yqtVar) {
        if (this.l) {
            return zxn.h(true);
        }
        yyn yynVar = new yyn(4);
        zdl it = b.iterator();
        while (it.hasNext()) {
            acgd acgdVar = (acgd) it.next();
            Geller geller = this.d;
            String strB = oms.b(this.c);
            acpe acpeVar = acpe.a;
            acoi acoiVarA = ois.a();
            acdt acdtVar = acdt.a;
            acdo acdoVar = new acdo();
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar2 = (acdt) acdoVar.b;
            acdtVar2.b |= 1;
            acdtVar2.e = 1;
            yynVar.c(acgdVar, zuz.h(geller.h(strB, acgdVar, (acdt) acdoVar.v(), acpeVar, acoiVarA), wyo.c(new zvi() { // from class: olz
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    zdy zdyVar = omh.a;
                    return zxn.h(Boolean.valueOf(((acdv) obj).c.size() > 0));
                }
            }), this.m));
        }
        zyd zydVarA = omo.a(yynVar.a(true), this.n);
        zvi zviVar = new zvi() { // from class: olw
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                zdy zdyVar = omh.a;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        ((zdv) ((zdv) omh.a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "checkRequiredCorporaExist", 449, "GellerSyncSchedulerImpl.java")).x("Required corpus %s missing", ((acgd) entry.getKey()).name());
                        return zxn.h(false);
                    }
                }
                return zxn.h(true);
            }
        };
        ExecutorService executorService = this.m;
        return zuz.h(zuz.h(zydVarA, wyo.c(zviVar), executorService), wyo.c(new zvi() { // from class: oly
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final omh omhVar = this.a;
                if (zBooleanValue) {
                    omhVar.l = true;
                    return zxn.h(true);
                }
                zyd zydVarD = omhVar.d(str, "geller_internal", omh.b, achm.DOWNLOAD_REQUIRED_CORPORA, 4, 2);
                zvi zviVar2 = new zvi() { // from class: olx
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        zdl it2 = ((yyr) obj2).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            oml omlVar = (oml) entry.getValue();
                            if (!omlVar.b().isEmpty()) {
                                ((zdv) ((zdv) omh.a.d()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "checkAndSyncRequiredCorpora", 409, "GellerSyncSchedulerImpl.java")).F("Failed to download required corpus: %s with failures %s", ((acgd) entry.getKey()).name(), omlVar.b());
                                return zxn.h(false);
                            }
                        }
                        omhVar.l = true;
                        return zxn.h(true);
                    }
                };
                return zuz.h(zydVarD, wyo.c(zviVar2), omhVar.m);
            }
        }), executorService);
    }

    @Override // defpackage.olt
    public final zyd a(acfr acfrVar) {
        if (!this.c.g()) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "runRetrySync", 658, "GellerSyncSchedulerImpl.java")).u("Account required for retry");
            return zxn.g(new IllegalArgumentException("Account required for retry"));
        }
        zdv zdvVar = (zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "runRetrySync", 661, "GellerSyncSchedulerImpl.java");
        abxj abxjVar = acfrVar.e;
        abxk abxkVar = acfr.a;
        zdvVar.x("Scheduling a retry sync for corpora: %s", new abxl(abxjVar, abxkVar));
        final HashMap map = new HashMap();
        yyf yyfVar = new yyf(4);
        for (acgd acgdVar : new abxl(acfrVar.e, abxkVar)) {
            synchronized (this.o) {
                Map map2 = this.p;
                if (map2.containsKey(acgdVar)) {
                    map.put(acgdVar, e(acgdVar, map2));
                } else {
                    Map map3 = this.q;
                    if (map3.containsKey(acgdVar)) {
                        map.put(acgdVar, e(acgdVar, map3));
                    } else {
                        yyfVar.g(acgdVar);
                    }
                }
            }
        }
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "runRetrySync", 679, "GellerSyncSchedulerImpl.java")).x("Running retry sync for: %s", yyfVar.f());
        olk olkVar = this.h;
        acfq acfqVar = new acfq();
        acfqVar.B(acfrVar);
        if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acfqVar.y();
        }
        ((acfr) acfqVar.b).e = abxe.a;
        acfqVar.a(yyfVar.f());
        final zyd zydVarB = olkVar.b((acfr) acfqVar.v());
        return zxn.b(zydVarB).b(wyo.b(new zvh() { // from class: oma
            @Override // defpackage.zvh
            public final zyd a() {
                Map map4;
                zyd zydVar = zydVarB;
                omh omhVar = this.a;
                synchronized (omhVar.o) {
                    Map map5 = (Map) zxn.o(zydVar);
                    Iterator it = map5.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        map4 = map;
                        if (zHasNext) {
                            acgd acgdVar2 = (acgd) it.next();
                            map4.put(acgdVar2, zxn.h((oml) map5.get(acgdVar2)));
                        }
                    }
                }
                return omo.a(map4, omhVar.n);
            }
        }), this.m);
    }

    @Override // defpackage.olt
    public final zyd b(final String str, final String str2, final yzq yzqVar, final achm achmVar, yqt yqtVar) {
        acdh acdhVar = this.e;
        if (acdhVar.u.size() != 0 && yzqVar.equals(yzq.q(acgd.GELLER_CONFIG, acgd.PRIVACY_SETTINGS))) {
            zyd zydVarD = d(str, str2, yzqVar, achmVar, 2, 4);
            zvi zviVar = new zvi() { // from class: omg
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0290 A[Catch: abxv -> 0x029a, ExecutionException -> 0x029c, TryCatch #3 {abxv -> 0x029a, blocks: (B:36:0x00e2, B:38:0x0102, B:40:0x010e, B:41:0x0110, B:44:0x0138, B:97:0x0256, B:99:0x0258, B:101:0x0260, B:102:0x0266, B:103:0x0267, B:105:0x0269, B:107:0x0271, B:108:0x0277, B:109:0x0278, B:110:0x027d, B:112:0x027f, B:113:0x0283, B:115:0x0285, B:117:0x0289, B:118:0x028f, B:119:0x0290, B:120:0x0299), top: B:126:0x00e2 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[LOOP:0: B:32:0x00c5->B:34:0x00cb, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0102 A[Catch: abxv -> 0x029a, ExecutionException -> 0x029c, TryCatch #3 {abxv -> 0x029a, blocks: (B:36:0x00e2, B:38:0x0102, B:40:0x010e, B:41:0x0110, B:44:0x0138, B:97:0x0256, B:99:0x0258, B:101:0x0260, B:102:0x0266, B:103:0x0267, B:105:0x0269, B:107:0x0271, B:108:0x0277, B:109:0x0278, B:110:0x027d, B:112:0x027f, B:113:0x0283, B:115:0x0285, B:117:0x0289, B:118:0x028f, B:119:0x0290, B:120:0x0299), top: B:126:0x00e2 }] */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean, byte] */
                /* JADX WARN: Type inference failed for: r4v21 */
                /* JADX WARN: Type inference failed for: r4v28 */
                @Override // defpackage.zvi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final defpackage.zyd a(java.lang.Object r25) throws defpackage.abxv, com.google.android.libraries.geller.portable.GellerException {
                    /*
                        Method dump skipped, instructions count: 679
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.omg.a(java.lang.Object):zyd");
                }
            };
            return zuz.h(zydVarD, wyo.c(zviVar), this.m);
        }
        if (!acdhVar.l) {
            return d(str, str2, c(yzqVar, oms.a(this.g, str2)), achmVar, 2, 4);
        }
        zyd zydVarG = g(str, yqtVar);
        zvi zviVar2 = new zvi() { // from class: olv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return zxn.g(new GellerException(abqb.FAILED_PRECONDITION, "Unable to download Geller required corpora."));
                }
                achm achmVar2 = achmVar;
                yzq yzqVar2 = yzqVar;
                String str3 = str2;
                String str4 = str;
                omh omhVar = this.a;
                return omhVar.d(str4, str3, omh.c(yzqVar2, oms.a(omhVar.g, str3)), achmVar2, 2, 4);
            }
        };
        return zuz.h(zydVarG, wyo.c(zviVar2), this.m);
    }

    public final zyd d(String str, String str2, final yzq yzqVar, achm achmVar, int i, int i2) {
        zyd zydVarG;
        final HashMap map = new HashMap();
        zdl it = yzqVar.iterator();
        while (it.hasNext()) {
            map.put((acgd) it.next(), yrn.c(this.t));
        }
        yqt yqtVar = this.c;
        if (yqtVar.g() && yqv.c(str)) {
            return zxn.g(new IllegalArgumentException("Empty auth token"));
        }
        if (!yqtVar.g() && yqv.c(null)) {
            return zxn.g(new IllegalArgumentException("Empty api key"));
        }
        if (yzqVar.isEmpty()) {
            return zxn.h(zcl.a);
        }
        HashSet hashSet = new HashSet();
        synchronized (this.o) {
            TreeSet treeSet = new TreeSet();
            zdl it2 = yzqVar.iterator();
            while (it2.hasNext()) {
                acgd acgdVar = (acgd) it2.next();
                Map map2 = this.q;
                if (map2.containsKey(acgdVar)) {
                    ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "scheduleSyncInternal", 500, "GellerSyncSchedulerImpl.java")).x("Returning existing pending sync for corpus: %s", acgdVar.name());
                    this.i.b(acgdVar, "alreadyScheduledPendingBatchSync");
                    hashSet.add((zyd) map2.get(acgdVar));
                } else if (this.p.containsKey(acgdVar)) {
                    ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "scheduleSyncInternal", 506, "GellerSyncSchedulerImpl.java")).x("Scheduling a pending batch sync for corpus: %s", acgdVar.name());
                    this.i.b(acgdVar, "waitingOnRunningBatchSync");
                    abxk abxkVar = acfr.a;
                    acfq acfqVar = new acfq();
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar = (acfr) acfqVar.b;
                    acgdVar.getClass();
                    abxj abxjVar = acfrVar.e;
                    if (!abxjVar.c()) {
                        int size = abxjVar.size();
                        acfrVar.e = abxjVar.d(size + size);
                    }
                    acfrVar.e.h(acgdVar.dE);
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar2 = (acfr) acfqVar.b;
                    acfrVar2.g = achmVar.h;
                    acfrVar2.d |= 2;
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar3 = (acfr) acfqVar.b;
                    acfrVar3.h = i - 1;
                    acfrVar3.d |= 4;
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar4 = (acfr) acfqVar.b;
                    acfrVar4.i = i2 - 1;
                    acfrVar4.d |= 8;
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar5 = (acfr) acfqVar.b;
                    acfrVar5.d |= 16;
                    acfrVar5.j = false;
                    String strB = yqv.b(str);
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar6 = (acfr) acfqVar.b;
                    acfrVar6.d |= 32;
                    acfrVar6.k = strB;
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar7 = (acfr) acfqVar.b;
                    acfrVar7.d |= 64;
                    acfrVar7.l = "";
                    if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar.y();
                    }
                    acfr acfrVar8 = (acfr) acfqVar.b;
                    acfrVar8.d |= 128;
                    acfrVar8.m = "";
                    if (str2 != null) {
                        if ((acfqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acfqVar.y();
                        }
                        acfr acfrVar9 = (acfr) acfqVar.b;
                        acfrVar9.d |= 1;
                        acfrVar9.f = str2;
                    }
                    zyd zydVarF = f((acfr) acfqVar.v());
                    map2.put(acgdVar, zydVarF);
                    hashSet.add(zydVarF);
                } else {
                    treeSet.add(acgdVar);
                    this.i.b(acgdVar, "immediateSyncScheduled");
                }
            }
            if (!treeSet.isEmpty()) {
                abxk abxkVar2 = acfr.a;
                acfq acfqVar2 = new acfq();
                acfqVar2.a(treeSet);
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar10 = (acfr) acfqVar2.b;
                acfrVar10.g = achmVar.h;
                acfrVar10.d |= 2;
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar11 = (acfr) acfqVar2.b;
                acfrVar11.h = i - 1;
                acfrVar11.d |= 4;
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar12 = (acfr) acfqVar2.b;
                acfrVar12.i = i2 - 1;
                acfrVar12.d |= 8;
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar13 = (acfr) acfqVar2.b;
                acfrVar13.d |= 16;
                acfrVar13.j = false;
                String strB2 = yqv.b(str);
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar14 = (acfr) acfqVar2.b;
                acfrVar14.d |= 32;
                acfrVar14.k = strB2;
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar15 = (acfr) acfqVar2.b;
                acfrVar15.d |= 64;
                acfrVar15.l = "";
                if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acfqVar2.y();
                }
                acfr acfrVar16 = (acfr) acfqVar2.b;
                acfrVar16.d |= 128;
                acfrVar16.m = "";
                if (str2 != null) {
                    if ((acfqVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acfqVar2.y();
                    }
                    acfr acfrVar17 = (acfr) acfqVar2.b;
                    acfrVar17.d |= 1;
                    acfrVar17.f = str2;
                }
                hashSet.add(f((acfr) acfqVar2.v()));
            }
            zydVarG = zuz.g(zxn.e(hashSet), wyo.a(new yqi() { // from class: omc
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    yyn yynVar = new yyn(4);
                    for (Map map3 : (List) obj) {
                        for (acgd acgdVar2 : map3.keySet()) {
                            yzq yzqVar2 = yzqVar;
                            if (yzqVar2.contains(acgdVar2)) {
                                Map map4 = map;
                                yynVar.c(acgdVar2, (oml) map3.get(acgdVar2));
                                yrn yrnVar = (yrn) map4.get(acgdVar2);
                                if (yrnVar != null) {
                                    omh omhVar = this.a;
                                    long jA = yrnVar.a(TimeUnit.MILLISECONDS);
                                    String strName = acgdVar2.name();
                                    oth othVar = (oth) ((ono) omhVar.i).a;
                                    ((uqq) othVar.a.ah.eV()).b(jA, othVar.b, othVar.c, strName);
                                }
                            }
                        }
                    }
                    return yynVar.a(true);
                }
            }), this.m);
        }
        return zydVarG;
    }
}

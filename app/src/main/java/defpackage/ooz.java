package defpackage;

import com.google.android.libraries.geller.portable.GellerException;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.assistant.portable.geller.GellerDeleteParams;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooz implements ooe {
    private final Map d;
    private static final zdy b = zdy.h("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage");
    public static final yzq a = new zdd(acgd.ACTION_HISTORY.name());
    private static final Comparator c = new Comparator() { // from class: oow
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            yzq yzqVar = ooz.a;
            long j = ((acgt) obj2).g;
            long j2 = ((acgt) obj).g;
            if (j == j2) {
                return 0;
            }
            return j - j2 <= 0 ? -1 : 1;
        }
    };

    public ooz(Map map) {
        this.d = map;
    }

    public static long k(Map map, String str) {
        long size;
        if (((zdd) a).b.equals(str)) {
            size = 0;
            while (map.entrySet().iterator().hasNext()) {
                size += ((acgw) ((Map.Entry) r5.next()).getValue()).b.size();
            }
        } else {
            size = map.size();
        }
        map.clear();
        return size;
    }

    public static long l(Map map, String str, long j) {
        ArrayList arrayList = new ArrayList(((acgw) map.get(str)).b);
        acgt acgtVar = acgt.a;
        acgs acgsVar = new acgs();
        if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acgsVar.y();
        }
        acgt acgtVar2 = (acgt) acgsVar.b;
        acgtVar2.b |= 16;
        acgtVar2.g = j;
        int iBinarySearch = Collections.binarySearch(arrayList, (acgt) acgsVar.v(), c);
        if (iBinarySearch < 0) {
            return 0L;
        }
        arrayList.remove(iBinarySearch);
        acgv acgvVar = new acgv();
        acgvVar.a(arrayList);
        map.put(str, (acgw) acgvVar.v());
        return 1L;
    }

    public static long m(Map map, List list) {
        long j = 0;
        if (list.isEmpty()) {
            return 0L;
        }
        for (Map.Entry entry : u(map, list).entrySet()) {
            String str = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            abxs abxsVar = ((acgw) map.get(str)).b;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < abxsVar.size(); i++) {
                if (set.contains(Integer.valueOf(i))) {
                    j++;
                } else {
                    arrayList.add((acgt) abxsVar.get(i));
                }
            }
            acgv acgvVar = new acgv();
            acgvVar.a(arrayList);
            map.put(str, (acgw) acgvVar.v());
        }
        return j;
    }

    public static long n(Map map, String str, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        if (!map.containsKey(str)) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(((acgw) map.get(str)).b);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, t((acgt) arrayList.get(i), yqtVar, yqtVar2, yqtVar3));
        }
        new acgv().a(arrayList);
        return ((acgw) map.put(str, (acgw) r5.v())).b.size();
    }

    public static long o(Map map, String str, long j, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        ArrayList arrayList = new ArrayList(((acgw) map.get(str)).b);
        acgt acgtVar = acgt.a;
        acgs acgsVar = new acgs();
        if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acgsVar.y();
        }
        acgt acgtVar2 = (acgt) acgsVar.b;
        acgtVar2.b |= 16;
        acgtVar2.g = j;
        int iBinarySearch = Collections.binarySearch(arrayList, (acgt) acgsVar.v(), c);
        if (iBinarySearch < 0) {
            return 0L;
        }
        arrayList.set(iBinarySearch, t((acgt) arrayList.get(iBinarySearch), yqtVar, yqtVar2, yqtVar3));
        acgv acgvVar = new acgv();
        acgvVar.a(arrayList);
        map.put(str, (acgw) acgvVar.v());
        return 1L;
    }

    public static long p(Map map, List list, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        long size = 0;
        if (list.isEmpty()) {
            return 0L;
        }
        for (Map.Entry entry : u(map, list).entrySet()) {
            String str = (String) entry.getKey();
            Set<Integer> set = (Set) entry.getValue();
            ArrayList arrayList = new ArrayList(((acgw) map.get(str)).b);
            for (Integer num : set) {
                arrayList.set(num.intValue(), t((acgt) arrayList.get(num.intValue()), yqtVar, yqtVar2, yqtVar3));
            }
            size += set.size();
            acgv acgvVar = new acgv();
            acgvVar.a(arrayList);
            map.put(str, (acgw) acgvVar.v());
        }
        return size;
    }

    public static zyd q(ujk ujkVar, final Map map, final Long l) {
        yqi yqiVar = new yqi() { // from class: ooo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yzq yzqVar = ooz.a;
                acgz acgzVar = acgz.a;
                acgp acgpVar = new acgp();
                if ((acgpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acgpVar.y();
                }
                acgz acgzVar2 = (acgz) acgpVar.b;
                abyl abylVar = acgzVar2.b;
                if (!abylVar.b) {
                    acgzVar2.b = abylVar.a();
                }
                acgzVar2.b.putAll(map);
                return (acgz) acgpVar.v();
            }
        };
        zwk zwkVar = zwk.a;
        return zuz.g(zwx.u(ujkVar.a(yqiVar, zwkVar)), new yqi() { // from class: oop
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yzq yzqVar = ooz.a;
                return l;
            }
        }, zwkVar);
    }

    public static void r(List list, List list2, acdt acdtVar) {
        acgi acgiVar;
        int iA;
        int iA2;
        if ((acdtVar.b & 2) != 0) {
            if (((zdd) a).b.equals(acdtVar.g)) {
                acds acdsVar = acdtVar.f;
                if (acdsVar == null) {
                    acdsVar = acds.a;
                }
                list2 = new ArrayList(list2).subList(s(list2, acdsVar.c, true), s(list2, acdsVar.b, false) + 1);
            }
        }
        for (acgt acgtVar : list2) {
            int i = acdtVar.b;
            try {
                if ((i & 8) != 0) {
                    int i2 = true != acdtVar.h ? 1 : 2;
                    int iA3 = acgy.a(acgtVar.d);
                    if (iA3 == 0) {
                        iA3 = 1;
                    }
                    if (iA3 != i2) {
                        continue;
                    }
                }
                if ((i & 16) != 0) {
                    int iA4 = acgr.a(acgtVar.e);
                    if (iA4 == 0) {
                        iA4 = 1;
                    }
                    if (acdtVar.i) {
                        if (iA4 == 1) {
                            continue;
                        }
                    } else if (iA4 == 2 || iA4 == 3) {
                    }
                }
                if ((i & 64) != 0) {
                    int iA5 = acgr.a(acgtVar.e);
                    if (iA5 == 0) {
                        iA5 = 1;
                    }
                    if (iA5 != 1 || ((iA2 = acdq.a(acdtVar.k)) != 0 && iA2 == 5)) {
                        int iA6 = acdq.a(acdtVar.k);
                        if (iA6 == 0) {
                            iA6 = 1;
                        }
                        int i3 = iA6 - 1;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4 && iA5 != 1) {
                                    }
                                } else if (iA5 == 2) {
                                    continue;
                                }
                            } else if (iA5 == 3) {
                                continue;
                            }
                        } else if (iA5 == 1) {
                            continue;
                        }
                    }
                }
                if ((i & 32) != 0) {
                    int i4 = true != acdtVar.j ? 1 : 3;
                    int iA7 = acgy.a(acgtVar.f);
                    if (iA7 == 0) {
                        iA7 = 1;
                    }
                    if (iA7 != i4) {
                        continue;
                    }
                }
                int i5 = acgiVar.memoizedSerializedSize;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i5 & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        acgiVar.memoizedSerializedSize = (Integer.MIN_VALUE & acgiVar.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(acgiVar.getClass()).m(acgiVar, abwa.a(abvwVar));
                abvwVar.K();
                list.add(bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.u(acgiVar, " to a byte array threw an IOException (should never happen)."), e);
            }
            acgiVar = acgtVar.c;
            if (acgiVar == null) {
                acgiVar = acgi.a;
            }
        }
    }

    private static int s(List list, long j, boolean z) {
        acgt acgtVar = acgt.a;
        acgs acgsVar = new acgs();
        if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acgsVar.y();
        }
        acgt acgtVar2 = (acgt) acgsVar.b;
        acgtVar2.b |= 16;
        acgtVar2.g = j;
        int iBinarySearch = Collections.binarySearch(list, (acgt) acgsVar.v(), c);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + (true != z ? 2 : 1));
        }
        return iBinarySearch;
    }

    private static acgt t(acgt acgtVar, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        acgs acgsVar = new acgs();
        acgsVar.B(acgtVar);
        if (yqtVar.g()) {
            ((Boolean) yqtVar.c()).booleanValue();
            if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acgsVar.y();
            }
            acgt acgtVar2 = (acgt) acgsVar.b;
            acgt acgtVar3 = acgt.a;
            acgtVar2.d = 1;
            acgtVar2.b |= 2;
        }
        if (yqtVar2.g()) {
            ((Boolean) yqtVar2.c()).booleanValue();
            if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acgsVar.y();
            }
            acgt acgtVar4 = (acgt) acgsVar.b;
            acgt acgtVar5 = acgt.a;
            acgtVar4.f = 2;
            acgtVar4.b |= 8;
        }
        if (yqtVar3.g()) {
            yqtVar3.c();
            yqtVar3.c();
            v(acgsVar, "PENDING_DELETE");
        }
        return (acgt) acgsVar.v();
    }

    private static Map u(Map map, List list) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(((acgw) entry.getValue()).b);
            String str = (String) entry.getKey();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Long) it.next()).longValue();
                acgt acgtVar = acgt.a;
                acgs acgsVar = new acgs();
                if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acgsVar.y();
                }
                acgt acgtVar2 = (acgt) acgsVar.b;
                acgtVar2.b |= 16;
                acgtVar2.g = jLongValue;
                int iBinarySearch = Collections.binarySearch(arrayList, (acgt) acgsVar.v(), c);
                if (iBinarySearch >= 0) {
                    if (map2.containsKey(entry.getKey())) {
                        ((Set) map2.get(str)).add(Integer.valueOf(iBinarySearch));
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Integer.valueOf(iBinarySearch));
                        map2.put(str, hashSet);
                    }
                }
            }
        }
        return map2;
    }

    private static void v(acgs acgsVar, String str) {
        if (str.equals("DELETION_PROCESSED")) {
            if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acgsVar.y();
            }
            acgt acgtVar = (acgt) acgsVar.b;
            acgt acgtVar2 = acgt.a;
            acgtVar.e = 2;
            acgtVar.b |= 4;
            return;
        }
        if (str.equals("PENDING_DELETE")) {
            if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acgsVar.y();
            }
            acgt acgtVar3 = (acgt) acgsVar.b;
            acgt acgtVar4 = acgt.a;
            acgtVar3.e = 1;
            acgtVar3.b |= 4;
            return;
        }
        if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acgsVar.y();
        }
        acgt acgtVar5 = (acgt) acgsVar.b;
        acgt acgtVar6 = acgt.a;
        acgtVar5.e = 0;
        acgtVar5.b |= 4;
    }

    @Override // defpackage.ooe
    public final /* synthetic */ accg a(yqt yqtVar, Set set) {
        return accg.a;
    }

    @Override // defpackage.ooe
    public final acge b() {
        return acge.CUSTOM_STORAGE_TYPE_PROTODATASTORE;
    }

    @Override // defpackage.ooe
    public final long c(yqt yqtVar, final GellerDeleteParams gellerDeleteParams) {
        if ((gellerDeleteParams.b & 1) == 0) {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
        final String str = gellerDeleteParams.e;
        final ujk ujkVar = (ujk) this.d.get(str);
        try {
            return ((Long) men.b(zuz.h(zwx.u(ujkVar.c()), wyo.c(new zvi() { // from class: oos
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    yzq yzqVar = ooz.a;
                    HashMap map = new HashMap(DesugarCollections.unmodifiableMap(((acgz) obj).b));
                    GellerDeleteParams gellerDeleteParams2 = gellerDeleteParams;
                    int i = gellerDeleteParams2.c;
                    long jK = 0;
                    if (i == 1) {
                        abxs<acby> abxsVar = ((accj) gellerDeleteParams2.d).b;
                        int i2 = yyk.e;
                        yyf yyfVar = new yyf(4);
                        yyf yyfVar2 = new yyf(4);
                        for (acby acbyVar : abxsVar) {
                            int i3 = acbyVar.b;
                            if ((i3 & 2) != 0) {
                                yyfVar.g(acbyVar);
                            } else if ((i3 & 1) != 0) {
                                yyfVar2.g(Long.valueOf(acbyVar.c));
                            }
                        }
                        yyk yykVarF = yyfVar.f();
                        int i4 = ((zcg) yykVarF).d;
                        for (int i5 = 0; i5 < i4; i5++) {
                            acby acbyVar2 = (acby) yykVarF.get(i5);
                            jK += (acbyVar2.b & 1) != 0 ? ooz.l(map, acbyVar2.d, acbyVar2.c) : ((acgw) map.remove(acbyVar2.d)).b.size();
                        }
                        jK += ooz.m(map, yyfVar2.f());
                    } else {
                        String str2 = str;
                        if (i == 2) {
                            accn accnVar = (accn) gellerDeleteParams2.d;
                            abxm abxmVar = accnVar.b;
                            abxs<String> abxsVar2 = accnVar.c;
                            if (abxmVar.isEmpty() && abxsVar2.isEmpty()) {
                                jK = ooz.k(map, str2);
                            } else if (abxmVar.isEmpty()) {
                                while (abxsVar2.iterator().hasNext()) {
                                    jK += ((acgw) map.remove((String) r12.next())).b.size();
                                }
                            } else if (abxsVar2.isEmpty()) {
                                jK = ooz.m(map, abxmVar);
                            } else if (!abxsVar2.isEmpty() && !abxmVar.isEmpty()) {
                                for (String str3 : abxsVar2) {
                                    Iterator it = abxmVar.iterator();
                                    while (it.hasNext()) {
                                        jK += ooz.l(map, str3, ((Long) it.next()).longValue());
                                    }
                                }
                            }
                        } else if (i == 4 && ((Boolean) gellerDeleteParams2.d).booleanValue()) {
                            jK = ooz.k(map, str2);
                        }
                    }
                    return zuz.g(zwx.u(ooz.q(ujkVar, map, Long.valueOf(jK))), wyo.a(new yqi() { // from class: oom
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            Long l = (Long) obj2;
                            yzq yzqVar2 = ooz.a;
                            return l;
                        }
                    }), zwk.a);
                }
            }), zwk.a), TimeUnit.MILLISECONDS)).longValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "delete", 226, "GellerProtoDataStoreStorage.java")).x("Failed to delete data from the protoDataStore: %s", str);
            return 0L;
        } catch (ExecutionException e2) {
            e = e2;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "delete", 221, "GellerProtoDataStoreStorage.java")).x("Failed to delete data from the protoDataStore: %s", str);
            return 0L;
        } catch (TimeoutException e3) {
            e = e3;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "delete", 221, "GellerProtoDataStoreStorage.java")).x("Failed to delete data from the protoDataStore: %s", str);
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List] */
    @Override // defpackage.ooe
    public final byte[][] d(yqt yqtVar, final acdt acdtVar) {
        ArrayList arrayList = new ArrayList();
        String str = acdtVar.g;
        try {
            arrayList = (List) men.b(zuz.g(((ujk) this.d.get(str)).c(), wyo.a(new yqi() { // from class: ooq
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    acgz acgzVar = (acgz) obj;
                    yzq yzqVar = ooz.a;
                    ArrayList arrayList2 = new ArrayList();
                    acdt acdtVar2 = acdtVar;
                    if (acdtVar2.c == 1) {
                        if (DesugarCollections.unmodifiableMap(acgzVar.b).containsKey(acdtVar2.c == 1 ? (String) acdtVar2.d : "")) {
                            ooz.r(arrayList2, ((acgw) DesugarCollections.unmodifiableMap(acgzVar.b).get(acdtVar2.c == 1 ? (String) acdtVar2.d : "")).b, acdtVar2);
                            return arrayList2;
                        }
                    } else {
                        Iterator it = DesugarCollections.unmodifiableMap(acgzVar.b).entrySet().iterator();
                        while (it.hasNext()) {
                            ooz.r(arrayList2, ((acgw) ((Map.Entry) it.next()).getValue()).b, acdtVar2);
                        }
                    }
                    return arrayList2;
                }
            }), zwk.a), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "read", 168, "GellerProtoDataStoreStorage.java")).x("Failed to read data from the protoDataStore: %s", str);
        } catch (ExecutionException e2) {
            e = e2;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "read", 163, "GellerProtoDataStoreStorage.java")).x("Failed to read data from the protoDataStore: %s", str);
        } catch (TimeoutException e3) {
            e = e3;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "read", 163, "GellerProtoDataStoreStorage.java")).x("Failed to read data from the protoDataStore: %s", str);
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    @Override // defpackage.ooe
    public final String[] e(yqt yqtVar, String str) {
        String[] strArr = new String[0];
        try {
            return (String[]) ((ArrayList) men.b(zuz.g(((ujk) this.d.get(str)).c(), wyo.a(new yqi() { // from class: ooy
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    yzq yzqVar = ooz.a;
                    return new ArrayList(DesugarCollections.unmodifiableMap(((acgz) obj).b).keySet());
                }
            }), zwk.a), TimeUnit.MILLISECONDS)).toArray(new String[0]);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "readKeys", 141, "GellerProtoDataStoreStorage.java")).x("Failed to read keys from the protoDataStore: %s", str);
            return strArr;
        } catch (ExecutionException e2) {
            e = e2;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "readKeys", 136, "GellerProtoDataStoreStorage.java")).x("Failed to read keys from the protoDataStore: %s", str);
            return strArr;
        } catch (TimeoutException e3) {
            e = e3;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "readKeys", 136, "GellerProtoDataStoreStorage.java")).x("Failed to read keys from the protoDataStore: %s", str);
            return strArr;
        }
    }

    @Override // defpackage.ooe
    public final long f(yqt yqtVar, String str, final acde acdeVar, final yqt yqtVar2, final yqt yqtVar3, final yqt yqtVar4) {
        final ujk ujkVar = (ujk) this.d.get(str);
        try {
            return ((Long) men.b(zuz.h(zwx.u(ujkVar.c()), wyo.c(new zvi() { // from class: oor
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    yzq yzqVar = ooz.a;
                    HashMap map = new HashMap(DesugarCollections.unmodifiableMap(((acgz) obj).b));
                    yqt yqtVar5 = yqtVar2;
                    yqt yqtVar6 = yqtVar3;
                    acde acdeVar2 = acdeVar;
                    int i = acdeVar2.b;
                    yqt yqtVar7 = yqtVar4;
                    long jP = 0;
                    if (i == 1) {
                        abxs<acby> abxsVar = ((acdb) acdeVar2.c).b;
                        int i2 = yyk.e;
                        yyf yyfVar = new yyf(4);
                        yyf yyfVar2 = new yyf(4);
                        for (acby acbyVar : abxsVar) {
                            int i3 = acbyVar.b;
                            if ((i3 & 2) != 0) {
                                yyfVar.g(acbyVar);
                            } else if ((i3 & 1) != 0) {
                                yyfVar2.g(Long.valueOf(acbyVar.c));
                            }
                        }
                        yyk yykVarF = yyfVar.f();
                        int i4 = ((zcg) yykVarF).d;
                        long jO = 0;
                        for (int i5 = 0; i5 < i4; i5++) {
                            acby acbyVar2 = (acby) yykVarF.get(i5);
                            jO += (acbyVar2.b & 1) != 0 ? ooz.o(map, acbyVar2.d, acbyVar2.c, yqtVar5, yqtVar6, yqtVar7) : ooz.n(map, acbyVar2.d, yqtVar5, yqtVar6, yqtVar7);
                        }
                        jP = jO + ooz.p(map, yyfVar2.f(), yqtVar5, yqtVar6, yqtVar7);
                    } else if (i == 2) {
                        acdd acddVar = (acdd) acdeVar2.c;
                        abxm abxmVar = acddVar.b;
                        abxs<String> abxsVar2 = acddVar.c;
                        if (abxmVar.isEmpty() && abxsVar2.isEmpty()) {
                            Iterator it = map.keySet().iterator();
                            while (it.hasNext()) {
                                jP += ooz.n(map, (String) it.next(), yqtVar5, yqtVar6, yqtVar7);
                            }
                        } else if (abxmVar.isEmpty()) {
                            Iterator it2 = abxsVar2.iterator();
                            while (it2.hasNext()) {
                                jP += ooz.n(map, (String) it2.next(), yqtVar5, yqtVar6, yqtVar7);
                            }
                        } else if (abxsVar2.isEmpty()) {
                            jP = ooz.p(map, abxmVar, yqtVar5, yqtVar6, yqtVar7);
                        } else if (!abxsVar2.isEmpty() && !abxmVar.isEmpty()) {
                            for (String str2 : abxsVar2) {
                                Iterator it3 = abxmVar.iterator();
                                long jO2 = jP;
                                while (it3.hasNext()) {
                                    String str3 = str2;
                                    jO2 += ooz.o(map, str3, ((Long) it3.next()).longValue(), yqtVar5, yqtVar6, yqtVar7);
                                    str2 = str3;
                                }
                                jP = jO2;
                            }
                        }
                    }
                    return zuz.g(zwx.u(ooz.q(ujkVar, map, Long.valueOf(jP))), wyo.a(new yqi() { // from class: oov
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            Long l = (Long) obj2;
                            yzq yzqVar2 = ooz.a;
                            return l;
                        }
                    }), zwk.a);
                }
            }), zwk.a), TimeUnit.MILLISECONDS)).longValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "updateElementStatus", 302, "GellerProtoDataStoreStorage.java")).x("Failed to update status of the protoDataStore: %s", str);
            return 0L;
        } catch (ExecutionException e2) {
            e = e2;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "updateElementStatus", 297, "GellerProtoDataStoreStorage.java")).x("Failed to update status of the protoDataStore: %s", str);
            return 0L;
        } catch (TimeoutException e3) {
            e = e3;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "updateElementStatus", 297, "GellerProtoDataStoreStorage.java")).x("Failed to update status of the protoDataStore: %s", str);
            return 0L;
        }
    }

    @Override // defpackage.ooe
    public final boolean g(yqt yqtVar, final String str, String[] strArr, final long j, final boolean z, byte[] bArr) throws abxv {
        try {
            abxd abxdVarH = abxd.h(acgi.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            final acgi acgiVar = (acgi) abxdVarH;
            return true;
        } catch (abxv e) {
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "write", 102, "GellerProtoDataStoreStorage.java")).x("Failed to parse the element: %s", str);
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((zdv) ((zdv) ((zdv) b.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "write", 109, "GellerProtoDataStoreStorage.java")).x("Failed to write to the protoDataStore %s", str);
            return false;
        } catch (ExecutionException e3) {
            e = e3;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "write", 104, "GellerProtoDataStoreStorage.java")).x("Failed to write to the protoDataStore: %s", str);
            return false;
        } catch (TimeoutException e4) {
            e = e4;
            ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "write", 104, "GellerProtoDataStoreStorage.java")).x("Failed to write to the protoDataStore: %s", str);
            return false;
        }
    }

    @Override // defpackage.ooe
    public final /* synthetic */ acel h(yqt yqtVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws GellerException {
        throw new GellerException(abqb.UNKNOWN, "writeWithResult is not supported for this storage type.");
    }

    @Override // defpackage.ooe
    public final /* synthetic */ byte[][] i(yqt yqtVar, acdt acdtVar) {
        return d(yqtVar, acdtVar);
    }

    @Override // defpackage.ooe
    public final boolean j(yqt yqtVar, aceh acehVar) {
        String strName;
        final HashMap map = new HashMap();
        yqt yqtVarI = ypv.a;
        Iterator it = acehVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                Object objC = yqtVarI.c();
                try {
                    final String str = (String) objC;
                    return true;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "batchWrite", 382, "GellerProtoDataStoreStorage.java")).x("Failed to write to the protoDataStore %s", objC);
                    return false;
                } catch (ExecutionException e2) {
                    e = e2;
                    ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "batchWrite", 377, "GellerProtoDataStoreStorage.java")).x("Failed to write to the protoDataStore: %s", objC);
                    return false;
                } catch (TimeoutException e3) {
                    e = e3;
                    ((zdv) ((zdv) ((zdv) b.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerProtoDataStoreStorage", "batchWrite", 377, "GellerProtoDataStoreStorage.java")).x("Failed to write to the protoDataStore: %s", objC);
                    return false;
                }
            }
            aceg acegVar = (aceg) it.next();
            int i = acegVar.b;
            if ((i & 8) == 0 || (((i & 1) == 0 && (i & 64) == 0) || (i & 2) == 0)) {
                break;
            }
            if (!yqtVarI.g()) {
                if ((i & 64) != 0) {
                    strName = acegVar.j;
                } else {
                    acgd acgdVarB = acgd.b(acegVar.c);
                    if (acgdVarB == null) {
                        acgdVarB = acgd.UNKNOWN;
                    }
                    strName = acgdVarB.name();
                }
                yqtVarI = yqt.i(strName);
            }
            acgi acgiVar = acegVar.g;
            if (acgiVar == null) {
                acgiVar = acgi.a;
            }
            String str2 = (acgiVar.b & 4) != 0 ? acgiVar.d : "";
            acgt acgtVar = acgt.a;
            acgs acgsVar = new acgs();
            if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acgsVar.y();
            }
            acgt acgtVar2 = (acgt) acgsVar.b;
            acgiVar.getClass();
            acgtVar2.c = acgiVar;
            acgtVar2.b |= 1;
            long j = acegVar.e;
            if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acgsVar.y();
            }
            acgt acgtVar3 = (acgt) acgsVar.b;
            acgtVar3.b |= 16;
            acgtVar3.g = j;
            if ((acegVar.b & 4) != 0) {
                int i2 = true != acegVar.f ? 1 : 2;
                if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acgsVar.y();
                }
                acgt acgtVar4 = (acgt) acgsVar.b;
                acgtVar4.d = i2 - 1;
                acgtVar4.b |= 2;
            }
            if ((acegVar.b & 16) != 0) {
                int i3 = true != acegVar.h ? 1 : 3;
                if ((acgsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acgsVar.y();
                }
                acgt acgtVar5 = (acgt) acgsVar.b;
                acgtVar5.f = i3 - 1;
                acgtVar5.b |= 8;
            }
            if ((acegVar.b & 32) != 0) {
                int iB = aceq.b(acegVar.i);
                v(acgsVar, aceq.a(iB != 0 ? iB : 1));
            }
            if (map.containsKey(str2)) {
                if (((zdd) a).b.equals(yqtVarI.c())) {
                    ((List) map.get(str2)).add((acgt) acgsVar.v());
                } else {
                    ArrayList arrayList = new ArrayList((Collection) map.get(str2));
                    if (((acgt) arrayList.get(0)).g < ((acgt) acgsVar.b).g) {
                        arrayList.set(0, (acgt) acgsVar.v());
                        map.put(str2, arrayList);
                    }
                }
            } else {
                map.put(str2, new ArrayList(yyk.o((acgt) acgsVar.v())));
            }
        }
        return false;
    }
}

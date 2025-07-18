package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqg {
    public final wqb a;
    private final wor b;
    private final zyg c;

    public wqg(wor worVar, wqb wqbVar, zyg zygVar) {
        this.b = worVar;
        this.a = wqbVar;
        this.c = zygVar;
        Boolean bool = false;
        bool.getClass();
    }

    public final zyd a(final Set set, final long j, final Map map) {
        return zuz.g(this.b.b(), wyo.a(new yqi() { // from class: wqf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                long jLongValue;
                Iterator it;
                Map map2 = (Map) obj;
                ArrayList<wqd> arrayList = new ArrayList();
                long epochMilli = Instant.now().toEpochMilli();
                for (Map.Entry entry : map.entrySet()) {
                    Set set2 = set;
                    wqc wqcVar = (wqc) entry.getKey();
                    wnp wnpVarD = ((wnw) entry.getValue()).d();
                    Long l = (Long) map2.get(wqcVar);
                    if (set2.contains(wqcVar)) {
                        jLongValue = epochMilli;
                    } else {
                        jLongValue = j;
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                    }
                    yzo yzoVar = new yzo();
                    yqt yqtVarI = ypv.a;
                    wnk wnkVar = (wnk) wnpVarD;
                    long j2 = wnkVar.a;
                    Iterator it2 = ((yyr) wnkVar.c).values().iterator();
                    while (it2.hasNext()) {
                        wnr wnrVar = (wnr) it2.next();
                        long jA = wnrVar.a();
                        if (jA != -1) {
                            long j3 = jA + jLongValue + j2;
                            if (epochMilli <= j3) {
                                if (yqtVarI.g()) {
                                    it = it2;
                                    yqtVarI = yqt.i(Long.valueOf(Math.min(((Long) yqtVarI.c()).longValue(), j3)));
                                } else {
                                    yqtVarI = yqt.i(Long.valueOf(j3));
                                    it = it2;
                                }
                                yzoVar.c(wnrVar.b());
                            } else {
                                it = it2;
                            }
                        } else {
                            it = it2;
                            yzoVar.c(wnrVar.b());
                        }
                        it2 = it;
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(yzoVar.f());
                    arrayList.add(new wod(hashSet, j2 + jLongValue, yqtVarI));
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    wqd wqdVar = (wqd) arrayList.get(i);
                    long jConvert = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
                    long j4 = jConvert + epochMilli;
                    if (wqdVar.a() < j4) {
                        long jMax = Math.max(epochMilli, wqdVar.a());
                        HashSet hashSet2 = new HashSet();
                        yqt yqtVarI2 = ypv.a;
                        hashSet2.addAll(wqdVar.c());
                        if (wqdVar.b().g()) {
                            long j5 = j4 - jMax;
                            yqw.L(j5 > 0);
                            yqw.L(j5 <= jConvert);
                            yqtVarI2 = yqt.i(Long.valueOf(((Long) wqdVar.b().c()).longValue() + j5));
                        }
                        arrayList.set(i, new wod(hashSet2, j4, yqtVarI2));
                    }
                }
                long jAbs = Math.abs(((SecureRandom) this.a.a.a.a()).nextLong()) % TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    wqd wqdVar2 = (wqd) arrayList.get(i2);
                    HashSet hashSet3 = new HashSet();
                    yqt yqtVarI3 = ypv.a;
                    hashSet3.addAll(wqdVar2.c());
                    long jA2 = wqdVar2.a() + jAbs;
                    if (wqdVar2.b().g()) {
                        yqtVarI3 = yqt.i(Long.valueOf(((Long) wqdVar2.b().c()).longValue() + jAbs));
                    }
                    arrayList.set(i2, new wod(hashSet3, jA2, yqtVarI3));
                }
                we weVar = new we();
                for (wqd wqdVar3 : arrayList) {
                    Set setC = wqdVar3.c();
                    wqd wqdVar4 = (wqd) weVar.get(setC);
                    if (wqdVar4 == null) {
                        weVar.put(setC, wqdVar3);
                    } else {
                        weVar.put(setC, wqd.d(wqdVar4, wqdVar3));
                    }
                }
                yqt yqtVarI4 = ypv.a;
                for (wqd wqdVar5 : weVar.values()) {
                    if (wqdVar5.b().g()) {
                        yqtVarI4 = yqtVarI4.g() ? yqt.i(Long.valueOf(Math.min(((Long) yqtVarI4.c()).longValue(), ((Long) wqdVar5.b().c()).longValue()))) : wqdVar5.b();
                    }
                }
                if (!yqtVarI4.g()) {
                    return weVar;
                }
                HashMap map3 = new HashMap(weVar);
                zcp zcpVar = zcp.b;
                HashSet hashSet4 = new HashSet();
                long jLongValue2 = ((Long) yqtVarI4.c()).longValue();
                hashSet4.addAll(zcpVar);
                wod wodVar = new wod(hashSet4, jLongValue2, yqtVarI4);
                wqd wqdVar6 = (wqd) map3.get(zcpVar);
                if (wqdVar6 == null) {
                    map3.put(zcpVar, wodVar);
                } else {
                    map3.put(zcpVar, wqd.d(wqdVar6, wodVar));
                }
                return DesugarCollections.unmodifiableMap(map3);
            }
        }), this.c);
    }
}

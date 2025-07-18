package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbm {
    public final yqt a;
    public final Map b;
    public final wbt c;

    public wbm(final Context context, web webVar, Map map, wbt wbtVar, zyg zygVar, final ueg uegVar, yqt yqtVar, Map map2, vzs vzsVar, final agux aguxVar, Executor executor, Map map3, agvb agvbVar, final agux aguxVar2, final zvi zviVar, agum agumVar) {
        context.getClass();
        webVar.getClass();
        map.getClass();
        wbtVar.getClass();
        zygVar.getClass();
        uegVar.getClass();
        yqtVar.getClass();
        map2.getClass();
        vzsVar.getClass();
        this.c = wbtVar;
        this.a = yqtVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((vzs) entry.getValue()) == vzsVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        int iB = agrj.b(agqq.i(setKeySet, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj : setKeySet) {
            final String str = (String) obj;
            final mfw mfwVar = new mfw(zygVar);
            agow agowVar = (agow) map3.get(rff.b(str));
            if (agowVar == null) {
                agowVar = new agow() { // from class: wbj
                    @Override // defpackage.agow
                    public final Object a() {
                        return wah.a;
                    }
                };
            }
            agow agowVar2 = agowVar;
            yrp yrpVarA = yru.a(new yrp() { // from class: wbk
                @Override // defpackage.yrp
                public final Object eV() {
                    return wbm.d(str, mfwVar, uegVar, aguxVar, wbl.a);
                }
            });
            yrpVarA.getClass();
            linkedHashMap2.put(obj, webVar.a(str, mfwVar, agvbVar, agowVar2, executor, yrpVarA, d(str, mfwVar, uegVar, aguxVar, new agux() { // from class: waz
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    String str2 = (String) obj2;
                    str2.getClass();
                    return str2;
                }
            }), new agow() { // from class: wba
                @Override // defpackage.agow
                public final Object a() {
                    return (wap) aguxVar2.a(str);
                }
            }, new zvh() { // from class: wbb
                @Override // defpackage.zvh
                public final zyd a() {
                    return zviVar.a(str);
                }
            }, agumVar));
        }
        this.b = linkedHashMap2;
    }

    public static final ujk d(final String str, final mfw mfwVar, ueg uegVar, final agux aguxVar, final agux aguxVar2) {
        zye zyeVar = new zye(new Callable() { // from class: wbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Uri) aguxVar.a(aguxVar2.a(str));
            }
        });
        mfwVar.a.add(zyeVar);
        vzv vzvVar = vzv.a;
        vzv vzvVarA = vzw.a(new vzu());
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        abza abzaVar = abza.a;
        return umw.a(str, zyeVar, vzvVarA, ExtensionRegistryLite.a, new Executor() { // from class: wbi
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                mfwVar.d(runnable);
            }
        }, yqt.h(new unr(vzv.a)), uegVar);
    }

    public final zyd a() {
        Map map = this.b;
        final ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            final String str = (String) entry.getKey();
            final wea weaVar = (wea) entry.getValue();
            vrf vrfVar = weaVar.v;
            zyd zydVarB = vrfVar.d.isDone() ? vrfVar.b() : weaVar.m.a(weaVar.c, new zvh() { // from class: wdd
                @Override // defpackage.zvh
                public final zyd a() {
                    return weaVar.v.b();
                }
            });
            yqi yqiVar = new yqi() { // from class: wdm
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    wcp wcpVar = (wcp) obj;
                    wcpVar.getClass();
                    return wcpVar.b().b;
                }
            };
            zwk zwkVar = zwk.a;
            zyd zydVarG = zuz.g(zydVarB, wyo.a(yqiVar), zwkVar);
            final agux aguxVar = new agux() { // from class: wbc
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    return new agpi(str, str2);
                }
            };
            arrayList.add(zuz.g(zydVarG, wyo.a(new yqi() { // from class: wbd
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return aguxVar.a(obj);
                }
            }), zwkVar));
        }
        return xab.c(arrayList).a(new Callable() { // from class: wbe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                int iB = agrj.b(agqq.i(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    agpi agpiVar = (agpi) zxn.o((Future) it.next());
                    linkedHashMap.put(agpiVar.a, agpiVar.b);
                }
                return linkedHashMap;
            }
        }, zwk.a);
    }

    public final zyd b(String str, rgu rguVar) {
        Object obj = this.b.get(str);
        obj.getClass();
        final wea weaVar = (wea) obj;
        Object objA = weaVar.o.a();
        objA.getClass();
        wah wahVar = (wah) objA;
        vzv vzvVar = vzv.a;
        vzu vzuVar = new vzu();
        int i = weaVar.b;
        if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vzuVar.y();
        }
        vzv vzvVar2 = (vzv) vzuVar.b;
        vzvVar2.b |= 8;
        vzvVar2.h = i;
        if ((rguVar.b & 2) != 0) {
            abvo abvoVar = rguVar.d;
            abvoVar.getClass();
            if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                vzuVar.y();
            }
            vzv vzvVar3 = (vzv) vzuVar.b;
            vzvVar3.b |= 4;
            vzvVar3.e = abvoVar;
        }
        String str2 = rguVar.c;
        str2.getClass();
        if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vzuVar.y();
        }
        vzv vzvVar4 = (vzv) vzuVar.b;
        vzvVar4.b |= 2;
        vzvVar4.d = str2;
        String str3 = rguVar.e;
        str3.getClass();
        if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vzuVar.y();
        }
        vzv vzvVar5 = (vzv) vzuVar.b;
        vzvVar5.b |= 1;
        vzvVar5.c = str3;
        long epochMilli = Instant.now().toEpochMilli();
        if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vzuVar.y();
        }
        vzv vzvVar6 = (vzv) vzuVar.b;
        vzvVar6.b |= 16;
        vzvVar6.i = epochMilli;
        abxs<rgx> abxsVar = rguVar.f;
        abxsVar.getClass();
        for (rgx rgxVar : abxsVar) {
            wag wagVarA = wahVar.a(rgxVar.e);
            if (wagVarA != null) {
                DesugarCollections.unmodifiableList(((vzv) vzuVar.b).f).getClass();
                rgxVar.getClass();
                vzz vzzVar = vzz.a;
                vzx vzxVar = new vzx();
                String str4 = rgxVar.e;
                str4.getClass();
                if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vzxVar.y();
                }
                vzz vzzVar2 = (vzz) vzxVar.b;
                vzzVar2.b |= 1;
                vzzVar2.e = str4;
                int i2 = wagVarA.d - 1;
                if (i2 == 0) {
                    long jLongValue = rgxVar.c == 1 ? ((Long) rgxVar.d).longValue() : 0L;
                    if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vzxVar.y();
                    }
                    vzz vzzVar3 = (vzz) vzxVar.b;
                    vzzVar3.c = 1;
                    vzzVar3.d = Long.valueOf(jLongValue);
                } else if (i2 == 1) {
                    boolean zBooleanValue = rgxVar.c == 2 ? ((Boolean) rgxVar.d).booleanValue() : false;
                    if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vzxVar.y();
                    }
                    vzz vzzVar4 = (vzz) vzxVar.b;
                    vzzVar4.c = 2;
                    vzzVar4.d = Boolean.valueOf(zBooleanValue);
                } else if (i2 == 2) {
                    double dDoubleValue = rgxVar.c == 3 ? ((Double) rgxVar.d).doubleValue() : 0.0d;
                    if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vzxVar.y();
                    }
                    vzz vzzVar5 = (vzz) vzxVar.b;
                    vzzVar5.c = 3;
                    vzzVar5.d = Double.valueOf(dDoubleValue);
                } else if (i2 == 3) {
                    String str5 = rgxVar.c == 4 ? (String) rgxVar.d : "";
                    str5.getClass();
                    if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vzxVar.y();
                    }
                    vzz vzzVar6 = (vzz) vzxVar.b;
                    vzzVar6.c = 4;
                    vzzVar6.d = str5;
                } else if (i2 != 4) {
                    abvo abvoVar2 = rgxVar.c == 5 ? (abvo) rgxVar.d : abvo.b;
                    abvoVar2.getClass();
                    if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vzxVar.y();
                    }
                    vzz vzzVar7 = (vzz) vzxVar.b;
                    vzzVar7.c = 6;
                    vzzVar7.d = abvoVar2;
                } else {
                    abvo abvoVar3 = rgxVar.c == 5 ? (abvo) rgxVar.d : abvo.b;
                    abvoVar3.getClass();
                    if ((vzxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vzxVar.y();
                    }
                    vzz vzzVar8 = (vzz) vzxVar.b;
                    vzzVar8.c = 5;
                    vzzVar8.d = abvoVar3;
                }
                abxd abxdVarV = vzxVar.v();
                abxdVarV.getClass();
                vzz vzzVar9 = (vzz) abxdVarV;
                if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vzuVar.y();
                }
                vzv vzvVar7 = (vzv) vzuVar.b;
                abxs abxsVar2 = vzvVar7.f;
                if (!abxsVar2.c()) {
                    int size = abxsVar2.size();
                    vzvVar7.f = abxsVar2.d(size + size);
                }
                vzvVar7.f.add(vzzVar9);
            }
        }
        DesugarCollections.unmodifiableList(((vzv) vzuVar.b).g).getClass();
        abxs abxsVar3 = rguVar.g;
        abxsVar3.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : abxsVar3) {
            if (wahVar.b.containsKey((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if ((vzuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vzuVar.y();
        }
        vzv vzvVar8 = (vzv) vzuVar.b;
        abxs abxsVar4 = vzvVar8.g;
        if (!abxsVar4.c()) {
            int size2 = abxsVar4.size();
            vzvVar8.g = abxsVar4.d(size2 + size2);
        }
        abus.m(arrayList, vzvVar8.g);
        final vzv vzvVarA = vzw.a(vzuVar);
        try {
            final yyr yyrVarC = weaVar.c(vzvVarA);
            return zuz.h(weaVar.m.a(weaVar.c, new zvh() { // from class: wdc
                @Override // defpackage.zvh
                public final zyd a() {
                    final wea weaVar2 = weaVar;
                    final vzv vzvVar9 = vzvVarA;
                    return zuz.h(weaVar2.v.b(), wyo.c(new zvi() { // from class: wcv
                        @Override // defpackage.zvi
                        public final zyd a(Object obj3) {
                            final wcp wcpVar = (wcp) obj3;
                            final vzv vzvVar10 = vzvVar9;
                            yqi yqiVarA = wyo.a(new yqi() { // from class: wcz
                                @Override // defpackage.yqi
                                public final Object apply(Object obj4) {
                                    return vzvVar10;
                                }
                            });
                            ujk ujkVar = weaVar2.r;
                            zwk zwkVar = zwk.a;
                            return zuz.g(ujkVar.a(yqiVarA, zwkVar), wyo.a(wyo.a(new yqi() { // from class: wda
                                @Override // defpackage.yqi
                                public final Object apply(Object obj4) {
                                    return wcpVar;
                                }
                            })), zwkVar);
                        }
                    }), zwk.a);
                }
            }), wyo.c(new zvi() { // from class: wdl
                /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, wap] */
                @Override // defpackage.zvi
                public final zyd a(Object obj3) {
                    wcp wcpVar = (wcp) obj3;
                    rgs rgsVar = rgs.a;
                    rgo rgoVar = new rgo();
                    rgr rgrVar = rgr.a;
                    rgp rgpVar = new rgp();
                    if ((rgpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        rgpVar.y();
                    }
                    rgr rgrVar2 = (rgr) rgpVar.b;
                    rgrVar2.c = 2;
                    rgrVar2.b |= 1;
                    if ((rgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        rgoVar.y();
                    }
                    yyr yyrVar = yyrVarC;
                    vzv vzvVar9 = vzvVarA;
                    wea weaVar2 = weaVar;
                    rgs rgsVar2 = (rgs) rgoVar.b;
                    rgr rgrVar3 = (rgr) rgpVar.v();
                    rgrVar3.getClass();
                    rgsVar2.d = rgrVar3;
                    rgsVar2.b |= 2;
                    weaVar2.d(rgoVar);
                    wdw wdwVarA = wdw.a.a(vzvVar9, rgoVar, weaVar2.a());
                    if (!wcpVar.e(yyrVar, wdwVarA)) {
                        return zxn.h(new wau(false));
                    }
                    if (((Boolean) weaVar2.x.a()).booleanValue()) {
                        return zxn.h(new wau(true));
                    }
                    return zuz.g(weaVar2.s.a().b(vzvVar9.e, wdwVarA.e), wyo.a(wyo.a(new yqi() { // from class: wcy
                        @Override // defpackage.yqi
                        public final Object apply(Object obj4) {
                            return new wau(true);
                        }
                    })), zwk.a);
                }
            }), weaVar.p);
        } catch (abxv e) {
            return zxn.g(e);
        }
    }

    public final boolean c() {
        Collection collectionValues = this.b.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((wea) it.next()).e()) {
                return true;
            }
        }
        return false;
    }
}

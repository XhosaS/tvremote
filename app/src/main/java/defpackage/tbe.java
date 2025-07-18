package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tbe {
    public final vrf a;
    public final Context b;
    public final zyg c;
    public final zyg d;
    public final aehf e;
    public final GellerLoggingCallback f;
    public final vhb g;
    public final vyb h;
    public final zyg i;
    public final vjo j;
    public final Set k;
    public final acdh l;
    public final ons m;

    public tbe(Context context, zyg zygVar, zyg zygVar2, ons onsVar, GellerLoggingCallback gellerLoggingCallback, vhb vhbVar, vyb vybVar, zyg zygVar3, vjo vjoVar, Set set, acdh acdhVar, aehf aehfVar) {
        this.b = context;
        this.c = zygVar;
        this.d = zygVar2;
        this.m = onsVar;
        this.f = gellerLoggingCallback;
        this.a = new vrf(new zvh() { // from class: tax
            @Override // defpackage.zvh
            public final zyd a() {
                final tbe tbeVar = this.a;
                vyb vybVar2 = tbeVar.h;
                vhb vhbVar2 = tbeVar.g;
                vxo vxoVarA = vhbVar2.a();
                vyr vyrVar = vyr.DONT_CARE;
                zyd zydVarB = vybVar2.b(vxoVarA, vyrVar);
                final vjo vjoVar2 = tbeVar.j;
                final Context context2 = tbeVar.b;
                yqi yqiVarA = wyo.a(new yqi() { // from class: tay
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        HashSet hashSet = new HashSet();
                        HashMap map = new HashMap();
                        for (vha vhaVar : (List) obj) {
                            vjo vjoVar3 = vjoVar2;
                            String strE = vjoVar3.e(vhaVar.b());
                            if (!TextUtils.isEmpty(strE)) {
                                tbd tbdVar = (tbd) wgv.a(context2, tbd.class, vhaVar.a());
                                hashSet.addAll(((yyr) tbdVar.p()).keySet());
                                map.put(strE, tbdVar.a());
                            }
                        }
                        return new yqu(hashSet, map);
                    }
                });
                zyg zygVar4 = tbeVar.i;
                final zyd zydVarG = zuz.g(zydVarB, yqiVarA, zygVar4);
                final zyd zydVarA = tbeVar.a(acgd.PORTABLE_PROVIDER);
                final zyd zydVarA2 = tbeVar.a(acgd.PORTABLE_PROVIDER_NAME_ANNOTATION);
                final zyd zydVarA3 = tbeVar.a(acgd.PORTABLE_PROVIDER_WEB_FULFILLMENT);
                final zyd zydVarG2 = zuz.g(vybVar2.b(vhbVar2.a(), vyrVar), wyo.a(new yqi() { // from class: tar
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        yyn yynVar = new yyn(4);
                        for (vha vhaVar : (List) obj) {
                            tbe tbeVar2 = tbeVar;
                            String strE = tbeVar2.j.e(vhaVar.b());
                            if (!TextUtils.isEmpty(strE)) {
                                yynVar.c(strE, ((tbd) wgv.a(tbeVar2.b, tbd.class, vhaVar.a())).c());
                            }
                        }
                        return yynVar.a(false);
                    }
                }), zygVar4);
                return xab.d(zydVarG, zydVarA, zydVarA2, zydVarA3, tbeVar.m.a.a(onr.a), zydVarG2).a(new Callable() { // from class: tau
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        yyr yyrVar = (yyr) zxn.o(zydVarG2);
                        final tbe tbeVar2 = tbeVar;
                        Set set2 = tbeVar2.k;
                        if (set2 == null) {
                            set2 = zcp.b;
                        }
                        Set set3 = set2;
                        zyg zygVar5 = tbeVar2.d;
                        zyg zygVar6 = tbeVar2.c;
                        zyg zygVar7 = tbeVar2.i;
                        Context context3 = tbeVar2.b;
                        zyd zydVar = zydVarG;
                        onn onnVar = new onn(context3, zygVar7, zygVar6, zygVar5, set3);
                        onnVar.g = tbeVar2.f;
                        onnVar.m = tbeVar2.l;
                        onnVar.i = yyrVar;
                        onnVar.n = yqt.i(tbeVar2.e);
                        yqu yquVar = (yqu) zxn.o(zydVar);
                        Iterator it = ((Set) yquVar.a).iterator();
                        while (it.hasNext()) {
                            onnVar.a((acgd) it.next(), (Map) yquVar.b, new yqi() { // from class: tba
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    String str = (String) obj;
                                    if (TextUtils.isEmpty(str)) {
                                        return zxn.h(new ool());
                                    }
                                    final tbe tbeVar3 = tbeVar2;
                                    return zuz.g(tbeVar3.j.c(str), wyo.a(new yqi() { // from class: tas
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj2) {
                                            return ((tbd) wgv.a(tbeVar3.b, tbd.class, (AccountId) obj2)).a();
                                        }
                                    }), tbeVar3.d);
                                }
                            });
                        }
                        Map map = (Map) zxn.o(zydVarA);
                        if (!map.isEmpty()) {
                            onnVar.a(acgd.PORTABLE_PROVIDER, map, new yqi() { // from class: tbb
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    String str = (String) obj;
                                    if (TextUtils.isEmpty(str)) {
                                        return zxn.h(new ool());
                                    }
                                    final tbe tbeVar3 = tbeVar2;
                                    return zuz.h(tbeVar3.j.c(str), wyo.c(new zvi() { // from class: tav
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj2) {
                                            Map mapQ = ((tbd) wgv.a(tbeVar3.b, tbd.class, (AccountId) obj2)).q();
                                            acgd acgdVar = acgd.PORTABLE_PROVIDER;
                                            return mapQ.containsKey(acgdVar) ? ((tan) mapQ.get(acgdVar)).a() : zxn.h(new ool());
                                        }
                                    }), tbeVar3.d);
                                }
                            });
                        }
                        Map map2 = (Map) zxn.o(zydVarA2);
                        if (!map2.isEmpty()) {
                            onnVar.a(acgd.PORTABLE_PROVIDER_NAME_ANNOTATION, map2, new yqi() { // from class: tbc
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    String str = (String) obj;
                                    if (TextUtils.isEmpty(str)) {
                                        return zxn.h(new ool());
                                    }
                                    final tbe tbeVar3 = tbeVar2;
                                    return zuz.h(tbeVar3.j.c(str), wyo.c(new zvi() { // from class: tat
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj2) {
                                            Map mapQ = ((tbd) wgv.a(tbeVar3.b, tbd.class, (AccountId) obj2)).q();
                                            acgd acgdVar = acgd.PORTABLE_PROVIDER_NAME_ANNOTATION;
                                            return mapQ.containsKey(acgdVar) ? ((tan) mapQ.get(acgdVar)).a() : zxn.h(new ool());
                                        }
                                    }), tbeVar3.d);
                                }
                            });
                        }
                        Map map3 = (Map) zxn.o(zydVarA3);
                        if (!map3.isEmpty()) {
                            onnVar.a(acgd.PORTABLE_PROVIDER_WEB_FULFILLMENT, map3, new yqi() { // from class: taq
                                @Override // defpackage.yqi
                                public final Object apply(Object obj) {
                                    String str = (String) obj;
                                    if (TextUtils.isEmpty(str)) {
                                        return zxn.h(new ool());
                                    }
                                    final tbe tbeVar3 = tbeVar2;
                                    return zuz.h(tbeVar3.j.c(str), wyo.c(new zvi() { // from class: tap
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj2) {
                                            Map mapQ = ((tbd) wgv.a(tbeVar3.b, tbd.class, (AccountId) obj2)).q();
                                            acgd acgdVar = acgd.PORTABLE_PROVIDER_WEB_FULFILLMENT;
                                            return mapQ.containsKey(acgdVar) ? ((tan) mapQ.get(acgdVar)).a() : zxn.h(new ool());
                                        }
                                    }), tbeVar3.d);
                                }
                            });
                        }
                        return new Geller(onnVar);
                    }
                }, tbeVar.c);
            }
        }, zygVar);
        this.g = vhbVar;
        this.h = vybVar;
        this.i = zygVar3;
        this.k = set;
        this.j = vjoVar;
        this.l = acdhVar;
        this.e = aehfVar;
    }

    public final zyd a(final acgd acgdVar) {
        return zuz.h(this.g.c(), wyo.c(new zvi() { // from class: taw
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                tbe tbeVar;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    tbeVar = this.a;
                    if (!it.hasNext()) {
                        break;
                    }
                    vha vhaVar = (vha) it.next();
                    String strE = tbeVar.j.e(vhaVar.b());
                    if (!TextUtils.isEmpty(strE)) {
                        acgd acgdVar2 = acgdVar;
                        Map mapQ = ((tbd) wgv.a(tbeVar.b, tbd.class, vhaVar.a())).q();
                        if (mapQ.containsKey(acgdVar2)) {
                            arrayList2.add(strE);
                            arrayList.add(((tan) mapQ.get(acgdVar2)).a());
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return zxn.h(new HashMap());
                }
                final HashMap map = new HashMap();
                return xab.c(arrayList).a(new Callable() { // from class: taz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i = 0;
                        while (true) {
                            Map map2 = map;
                            List list = arrayList2;
                            if (i >= list.size()) {
                                return map2;
                            }
                            map2.put((String) list.get(i), (ooe) zxn.o((Future) arrayList.get(i)));
                            i++;
                        }
                    }
                }, tbeVar.i);
            }
        }), this.i);
    }
}

package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbr implements qba {
    public final phd a;
    public final Executor b;
    private final phg c;
    private final prk d;

    public qbr(phg phgVar, phd phdVar, prk prkVar, Executor executor) {
        this.c = phgVar;
        this.a = phdVar;
        this.d = prkVar;
        this.b = executor;
    }

    public static final Set g(Map map, qbq qbqVar) {
        if (!map.containsKey(qbqVar)) {
            map.put(qbqVar, new HashSet());
        }
        return (Set) map.get(qbqVar);
    }

    public static boolean i(pia piaVar, String str) {
        return str.equals(piaVar.e) && (piaVar.c & 131072) != 0;
    }

    private final yyk j() {
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        phd phdVar = this.a;
        yyfVar.g(((yqz) phdVar.b()).a);
        yyfVar.g(((yqz) phdVar.c()).a);
        yyfVar.g("ICING");
        return yyfVar.f();
    }

    @Override // defpackage.qba
    public final zyd a(Collection collection) {
        return qft.a(zag.d(collection, new yqi() { // from class: qbc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                final qbr qbrVar = this.a;
                pia piaVar = (pia) obj;
                final qbq qbqVarD = qbrVar.d(piaVar);
                String str = piaVar.e;
                if (!qbrVar.h()) {
                    return zxy.a;
                }
                zyd zydVarE = qbrVar.e(str);
                qbk qbkVar = new qbk(qbrVar);
                Executor executor = qbrVar.b;
                return zuz.h(zuz.g(zydVarE, wyo.a(qbkVar), executor), wyo.c(new zvi() { // from class: qbl
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        qbq qbqVar = qbqVarD;
                        Object obj3 = (Set) ((Map) obj2).get(qbqVar);
                        if (obj3 == null) {
                            obj3 = zcp.b;
                        }
                        return qbrVar.f(yyr.k(qbqVar, obj3));
                    }
                }), executor);
            }
        })).a(new Callable() { // from class: qbi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.qba
    public final zyd b(String str) {
        phd phdVar = this.a;
        yyk yykVarJ = j();
        int[] iArr = new int[0];
        rgy rgyVarA = phdVar.a();
        ArrayList arrayList = new ArrayList();
        int i = ((zcg) yykVarJ).d;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(rgyVarA.f(iArr, str, (String) yykVarJ.get(i2)));
        }
        return qft.a(arrayList).a(new Callable() { // from class: qbj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.qba
    public final zyd c(final String str) {
        if (!h()) {
            return zxy.a;
        }
        zyd zydVarE = e(str);
        qbk qbkVar = new qbk(this);
        Executor executor = this.b;
        return qft.b(zuz.h(zuz.g(zydVarE, wyo.a(qbkVar), executor), wyo.c(new zvi() { // from class: qbd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.f((Map) obj);
            }
        }), executor), zuz.h(zuz.g(zuz.g(this.d.e(), wyo.a(new yqi() { // from class: qbo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                final String str2 = str;
                return zag.c((List) obj, new yqx() { // from class: qbn
                    @Override // defpackage.yqx
                    public final boolean a(Object obj2) {
                        return qbr.i((pia) obj2, str2);
                    }
                });
            }
        }), executor), wyo.a(new yqi() { // from class: qbe
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                HashMap map = new HashMap();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    qbr.g(map, this.a.d((pia) it.next()));
                }
                return map;
            }
        }), executor), wyo.c(new zvi() { // from class: qbd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.f((Map) obj);
            }
        }), executor)).a(new Callable() { // from class: qbf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, executor);
    }

    public final qbq d(pia piaVar) {
        return new qbq(Long.valueOf(piaVar.s));
    }

    public final zyd e(final String str) {
        return zuz.g(this.d.c(), wyo.a(new yqi() { // from class: qbm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                final String str2 = str;
                return zag.c((List) obj, new yqx() { // from class: qbp
                    @Override // defpackage.yqx
                    public final boolean a(Object obj2) {
                        return qbr.i(((pyj) obj2).a(), str2);
                    }
                });
            }
        }), this.b);
    }

    public final zyd f(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            final qbq qbqVar = (qbq) entry.getKey();
            final int[] iArrF = ztm.f((Set) entry.getValue());
            arrayList.addAll(Lists.c(j(), new yqi() { // from class: qbg
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    return this.a.a.a().f(iArrF, "mdd_" + qbqVar.a + "_" + str, str);
                }
            }));
        }
        return qft.c(arrayList).a(new Callable() { // from class: qbh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zwk.a);
    }

    public final boolean h() {
        return this.c.E();
    }
}

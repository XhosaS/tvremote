package defpackage;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbb {
    public final zyg a;
    public final paw b;
    private final agow c;
    private final Set d;
    private final Executor e;
    private volatile yyr f;

    public pbb(zyg zygVar, agow agowVar, Set set, paw pawVar) {
        this.a = zygVar;
        this.c = agowVar;
        this.d = set;
        this.b = pawVar;
        this.e = new zyt(zygVar);
        yqw.M(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static zyd a(pbe pbeVar, pbc pbcVar) {
        try {
            return pbcVar.a(pbeVar);
        } catch (Throwable th) {
            return zxn.g(th);
        }
    }

    private final void d(zyd zydVar) {
        for (pfh pfhVar : this.d) {
            zxn.p(zydVar, new pbf(), zwk.a);
        }
    }

    public final List b(Class cls) {
        yyr yyrVarJ = this.f;
        if (yyrVarJ == null) {
            synchronized (this) {
                yyrVarJ = this.f;
                if (yyrVarJ == null) {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (pbc pbcVar : (Set) this.c.a()) {
                        if (pbcVar.b().isEmpty()) {
                            arrayList.add(pbcVar);
                        } else {
                            for (Class cls2 : pbcVar.b()) {
                                List arrayList2 = (List) map.get(cls2);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    map.put(cls2, arrayList2);
                                }
                                arrayList2.add(pbcVar);
                            }
                        }
                    }
                    map.put(pbd.class, arrayList);
                    yyrVarJ = yyr.j(map);
                    this.f = yyrVarJ;
                }
            }
        }
        int i = yyk.e;
        return (List) yyrVarJ.getOrDefault(cls, zcg.b);
    }

    public final void c(pba pbaVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                final List listA = pbaVar.a();
                if (listA != null) {
                    if (!listA.isEmpty()) {
                        Callable callableI = wyo.i(new Callable() { // from class: pay
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                List<pbd> list = listA;
                                ArrayList arrayList = new ArrayList(list.size());
                                for (pbd pbdVar : list) {
                                    pbb pbbVar = this.a;
                                    arrayList.add(new pbe(pbdVar, pbbVar.b.a(pbdVar)));
                                }
                                return arrayList;
                            }
                        });
                        Executor executor = this.e;
                        d(zuz.h(zxn.k(callableI, executor), wyo.c(new zvi() { // from class: paz
                            @Override // defpackage.zvi
                            public final zyd a(Object obj) {
                                List list = (List) obj;
                                int size = list.size();
                                ArrayList arrayList = new ArrayList(size + size);
                                Iterator it = list.iterator();
                                while (true) {
                                    pbb pbbVar = this.a;
                                    if (!it.hasNext()) {
                                        return zxn.c(arrayList).a(new zvk(), pbbVar.a);
                                    }
                                    pbe pbeVar = (pbe) it.next();
                                    try {
                                        List listB = pbbVar.b(pbeVar.a.getClass());
                                        List listB2 = pbbVar.b(pbd.class);
                                        ArrayList arrayList2 = new ArrayList(listB.size() + listB2.size());
                                        Iterator it2 = listB.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(pbb.a(pbeVar, (pbc) it2.next()));
                                        }
                                        Iterator it3 = listB2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(pbb.a(pbeVar, (pbc) it3.next()));
                                        }
                                        arrayList.add(zuz.g(zxn.e(arrayList2), new yqi() { // from class: pax
                                            @Override // defpackage.yqi
                                            public final Object apply(Object obj2) {
                                                return null;
                                            }
                                        }, zwk.a));
                                        arrayList.add(pbeVar.b);
                                    } catch (Throwable th) {
                                        arrayList.add(zxn.g(th));
                                    }
                                }
                            }
                        }), executor));
                    }
                }
            } catch (Throwable th) {
                zyd zydVarG = zxn.g(th);
                zxn.g(th);
                d(zydVarG);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

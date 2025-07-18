package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lye implements idf {
    private final idf a;
    private final idf b;
    private final idf c;
    private final idy d;

    public lye(idf idfVar, idf idfVar2, idf idfVar3, idy idyVar) {
        this.a = idfVar;
        this.b = idfVar2;
        this.c = idfVar3;
        this.d = idyVar;
    }

    private static void c(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lyj lyjVar = (lyj) it.next();
            map.put(lyjVar.a, lyjVar);
        }
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List b(Object obj) {
        List list;
        ieg iegVar = (ieg) this.a.b(obj);
        if (iegVar.k()) {
            return Collections.EMPTY_LIST;
        }
        lyf lyfVar = (lyf) iegVar.g();
        ImmutableList<lyc> immutableList = lyfVar.g;
        HashMap map = new HashMap(immutableList.size());
        c((List) this.b.b(lyfVar), map);
        long j = lyfVar.d;
        if (map.isEmpty()) {
            list = immutableList;
        } else {
            List arrayList = new ArrayList();
            for (lyc lycVar : immutableList) {
                lyj lyjVar = (lyj) map.get(lycVar);
                if (lyjVar == null || lyjVar.c < j) {
                    arrayList.add(lycVar);
                }
            }
            list = arrayList;
        }
        if (!list.isEmpty()) {
            lyf lyfVarA = lyf.a(lyfVar.a, lyfVar.b, lyfVar.c, j, lyfVar.e, lyfVar.f, list);
            List list2 = (List) this.c.b(lyfVarA);
            c(list2, map);
            if (!list2.isEmpty()) {
                ieg iegVar2 = lyfVarA.a;
                this.d.c(new lyh(iegVar2.k() ? "_" : ((ksn) iegVar2.g()).a, lyfVarA.b, lyfVarA.c, list2));
            }
        }
        if (map.isEmpty()) {
            return ImmutableList.of();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            lyj lyjVar2 = (lyj) map.get((lyc) it.next());
            if (lyjVar2 != null) {
                arrayList2.add(lyjVar2);
            }
        }
        return ImmutableList.copyOf((Collection) arrayList2);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agyg extends agyb {
    public static final List b(agxs agxsVar) {
        Iterator itA = agxsVar.a();
        if (!itA.hasNext()) {
            return agrd.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            List listSingletonList = Collections.singletonList(next);
            listSingletonList.getClass();
            return listSingletonList;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static final agxs c(agxs agxsVar, int i) {
        return i == 0 ? agxl.a : agxsVar instanceof agxk ? ((agxk) agxsVar).b(i) : new agyi(agxsVar, i);
    }
}

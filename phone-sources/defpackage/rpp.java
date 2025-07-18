package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rpp {
    public abstract vvj a(String str, Object obj);

    public abstract vvj b(vvj vvjVar, vvj vvjVar2);

    public abstract String c(vvj vvjVar);

    public final List d(Map map) {
        vvj vvjVarA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (vvjVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(vvjVarA);
            }
        }
        return arrayList;
    }

    public final List e(List list, List list2) {
        vvj vvjVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vvj vvjVar2 = (vvj) it.next();
            String strC = c(vvjVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    vvjVar = null;
                    break;
                }
                vvjVar = (vvj) it2.next();
                if (strC.equals(c(vvjVar))) {
                    break;
                }
            }
            vvj vvjVarB = b(vvjVar2, vvjVar);
            if (vvjVarB != null) {
                arrayList.add(vvjVarB);
            }
        }
        return arrayList;
    }
}

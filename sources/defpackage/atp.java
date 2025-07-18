package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atp {
    public abstract cmz a(String str, Object obj);

    public abstract cmz b(cmz cmzVar, cmz cmzVar2);

    public abstract String c(cmz cmzVar);

    public final List d(Map map) {
        cmz cmzVarA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (cmzVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(cmzVarA);
            }
        }
        return arrayList;
    }

    public final List e(List list, List list2) {
        cmz cmzVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cmz cmzVar2 = (cmz) it.next();
            String strC = c(cmzVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    cmzVar = null;
                    break;
                }
                cmzVar = (cmz) it2.next();
                if (strC.equals(c(cmzVar))) {
                    break;
                }
            }
            cmz cmzVarB = b(cmzVar2, cmzVar);
            if (cmzVarB != null) {
                arrayList.add(cmzVarB);
            }
        }
        return arrayList;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class edd {
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    public static void b(String str, dxw dxwVar, Map map) {
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(dxwVar);
    }

    public static void c(Map map, Map map2, String str) {
        List list = (List) map2.get(str);
        List list2 = (List) map.remove(str);
        if (list != null && list2 != null) {
            list2.removeAll(list);
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        map.put(str, list2);
    }

    public final edd a() {
        edd eddVar = new edd();
        Map map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                eddVar.a.put(str, new ArrayList((Collection) map.get(str)));
            }
            Map map2 = this.b;
            for (String str2 : map2.keySet()) {
                eddVar.b.put(str2, new ArrayList((Collection) map2.get(str2)));
            }
        }
        return eddVar;
    }
}

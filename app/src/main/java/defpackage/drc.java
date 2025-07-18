package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drc {
    public Map a;

    public final void a(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((dvc) it.next()).b();
        }
    }

    public final void b(List list) {
        dyd.a();
        Map map = this.a;
        if (map == null && list == null) {
            return;
        }
        if (list == null) {
            a(map);
            this.a = null;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dvc dvcVar = (dvc) it.next();
            linkedHashMap.put(dvcVar.a, dvcVar);
        }
        Map map2 = this.a;
        if (map2 == null) {
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                ((dvc) it2.next()).a();
            }
        } else {
            for (Map.Entry entry : map2.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    ((dvc) entry.getValue()).b();
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((dvc) this.a.get(entry2.getKey())) == null) {
                    ((dvc) entry2.getValue()).a();
                }
            }
        }
        this.a = linkedHashMap;
    }
}

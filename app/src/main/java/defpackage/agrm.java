package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class agrm extends agrl {
    public static final Map d(agpi... agpiVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(agrj.b(agpiVarArr.length));
        for (agpi agpiVar : agpiVarArr) {
            linkedHashMap.put(agpiVar.a, agpiVar.b);
        }
        return linkedHashMap;
    }

    public static final Map e(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map f(Iterable iterable) {
        int size = iterable.size();
        if (size == 0) {
            return agre.a;
        }
        if (size == 1) {
            return agrj.c((agpi) iterable.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(agrj.b(iterable.size()));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            agpi agpiVar = (agpi) it.next();
            linkedHashMap.put(agpiVar.a, agpiVar.b);
        }
        return linkedHashMap;
    }

    public static final Map g(Map map) {
        int size = map.size();
        if (size == 0) {
            return agre.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}

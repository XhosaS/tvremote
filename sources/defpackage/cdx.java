package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdx extends cdy {
    private final Map a;

    public cdx(cdh cdhVar, cdh cdhVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, cdhVar);
        e(linkedHashMap, cdhVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((cck) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, cdh cdhVar) {
        for (int i = 0; i < cdhVar.b(); i++) {
            cck cckVarC = cdhVar.c(i);
            Object obj = map.get(cckVarC);
            if (cckVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(cckVarC, arrayList);
                }
                arrayList.add(cckVarC.c(cdhVar.e(i)));
            } else {
                map.put(cckVarC, cckVarC.c(cdhVar.e(i)));
            }
        }
    }

    @Override // defpackage.cdy
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.cdy
    public final Object b(cck cckVar) {
        ces.j(!cckVar.b, "key must be single valued");
        Object obj = this.a.get(cckVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.cdy
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.cdy
    public final void d(cdo cdoVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            cck cckVar = (cck) entry.getKey();
            Object value = entry.getValue();
            if (cckVar.b) {
                cdoVar.b(cckVar, ((List) value).iterator(), obj);
            } else {
                cdoVar.a(cckVar, value, obj);
            }
        }
    }
}

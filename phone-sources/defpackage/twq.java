package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twq extends twr {
    private final Map a;

    public twq(twa twaVar, twa twaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, twaVar);
        e(linkedHashMap, twaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((tuy) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, twa twaVar) {
        for (int i = 0; i < twaVar.b(); i++) {
            tuy tuyVarC = twaVar.c(i);
            Object obj = map.get(tuyVarC);
            if (tuyVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(tuyVarC, arrayList);
                }
                arrayList.add(tuyVarC.c(twaVar.e(i)));
            } else {
                map.put(tuyVarC, tuyVarC.c(twaVar.e(i)));
            }
        }
    }

    @Override // defpackage.twr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.twr
    public final Object b(tuy tuyVar) {
        a.aD(!tuyVar.b, "key must be single valued");
        Object obj = this.a.get(tuyVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.twr
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.twr
    public final void d(twh twhVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            tuy tuyVar = (tuy) entry.getKey();
            Object value = entry.getValue();
            if (tuyVar.b) {
                twhVar.b(tuyVar, ((List) value).iterator(), obj);
            } else {
                twhVar.a(tuyVar, value, obj);
            }
        }
    }
}

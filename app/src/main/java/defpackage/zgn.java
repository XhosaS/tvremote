package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgn extends zgo {
    private final Map a;

    public zgn(zfx zfxVar, zfx zfxVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, zfxVar);
        e(linkedHashMap, zfxVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zer) entry.getKey()).c) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, zfx zfxVar) {
        for (int i = 0; i < zfxVar.a(); i++) {
            zer zerVarB = zfxVar.b(i);
            Object obj = map.get(zerVarB);
            if (zerVarB.c) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(zerVarB, arrayList);
                }
                arrayList.add(zerVarB.b.cast(zfxVar.d(i)));
            } else {
                map.put(zerVarB, zerVarB.b.cast(zfxVar.d(i)));
            }
        }
    }

    @Override // defpackage.zgo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.zgo
    public final Object b(zer zerVar) {
        ziu.a(!zerVar.c, "key must be single valued");
        Object obj = this.a.get(zerVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.zgo
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.zgo
    public final void d(zge zgeVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            zer zerVar = (zer) entry.getKey();
            Object value = entry.getValue();
            if (zerVar.c) {
                zgeVar.b(zerVar, ((List) value).iterator(), obj);
            } else {
                zgeVar.a(zerVar, value, obj);
            }
        }
    }
}

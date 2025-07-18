package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpk extends cpf {
    public static final cpm b = cpj.b(Collections.EMPTY_MAP);

    public cpk(Map map) {
        super(map);
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b */
    public final Map a() {
        Map map = this.a;
        LinkedHashMap linkedHashMapBk = dnx.bk(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapBk.put(entry.getKey(), ((cpm) entry.getValue()).a());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapBk);
    }
}

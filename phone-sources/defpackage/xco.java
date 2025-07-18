package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xco extends xcj {
    public static final xcq b = xcn.a(Collections.EMPTY_MAP);

    public xco(Map map) {
        super(map);
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        Map map = this.a;
        LinkedHashMap linkedHashMapV = wae.v(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapV.put(entry.getKey(), ((xcq) entry.getValue()).b());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapV);
    }
}

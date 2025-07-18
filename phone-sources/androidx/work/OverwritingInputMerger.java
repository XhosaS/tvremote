package androidx.work;

import defpackage.gli;
import defpackage.gox;
import defpackage.gpf;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends gpf {
    @Override // defpackage.gpf
    public final gox a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((gox) it.next()).b);
            mapUnmodifiableMap.getClass();
            linkedHashMap2.putAll(mapUnmodifiableMap);
        }
        gli.B(linkedHashMap2, linkedHashMap);
        return gli.y(linkedHashMap);
    }
}

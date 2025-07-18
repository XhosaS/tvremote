package androidx.work;

import defpackage.cav;
import defpackage.caz;
import defpackage.cbh;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends cbh {
    @Override // defpackage.cbh
    public final caz a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap2.putAll(((caz) it.next()).b());
        }
        cav.c(linkedHashMap2, linkedHashMap);
        return cav.a(linkedHashMap);
    }
}

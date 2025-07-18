package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qnw {
    public static final void a(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        qlt qltVarM = qlv.m();
        qltVarM.b(str);
        map.put(str, qltVarM);
    }
}

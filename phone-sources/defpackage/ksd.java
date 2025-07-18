package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksd {
    private static long a;

    public static long a() {
        long j = a;
        a = 1 + j;
        return j;
    }

    public static idf b() {
        long j = a;
        a = 1000000 + j;
        return c(j);
    }

    public static idf c(final long j) {
        final HashMap map = new HashMap();
        return new idf() { // from class: ksc
            @Override // defpackage.idf
            public final Object b(Object obj) {
                Map map2 = map;
                Long l = (Long) map2.get(obj);
                if (l != null) {
                    return l;
                }
                Long lValueOf = Long.valueOf(map2.size() + 1 + j);
                map2.put(obj, lValueOf);
                return lValueOf;
            }
        };
    }
}

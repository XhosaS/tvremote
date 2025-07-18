package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlk {
    public static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        a = map2;
        map.put("SHA-256", dcg.c);
        map.put("SHA-512", dcg.e);
        map.put("SHAKE128", dcg.m);
        map.put("SHAKE256", dcg.n);
        map2.put(dcg.c, "SHA-256");
        map2.put(dcg.e, "SHA-512");
        map2.put(dcg.m, "SHAKE128");
        map2.put(dcg.n, "SHAKE256");
    }

    static czv a(String str) {
        czv czvVar = (czv) b.get(str);
        if (czvVar != null) {
            return czvVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(str));
    }

    static deh b(czv czvVar) {
        if (czvVar.w(dcg.c)) {
            return new deo();
        }
        if (czvVar.w(dcg.e)) {
            return new der();
        }
        if (czvVar.w(dcg.m)) {
            return new des(128);
        }
        if (czvVar.w(dcg.n)) {
            return new des(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(czvVar.b()));
    }
}

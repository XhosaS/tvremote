package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zut {
    public static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        a = map2;
        map.put("SHA-256", zln.c);
        map.put("SHA-512", zln.e);
        map.put("SHAKE128", zln.m);
        map.put("SHAKE256", zln.n);
        map2.put(zln.c, "SHA-256");
        map2.put(zln.e, "SHA-512");
        map2.put(zln.m, "SHAKE128");
        map2.put(zln.n, "SHAKE256");
    }

    static zjb a(String str) {
        zjb zjbVar = (zjb) b.get(str);
        if (zjbVar != null) {
            return zjbVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(str));
    }

    static znp b(zjb zjbVar) {
        if (zjbVar.w(zln.c)) {
            return new znw();
        }
        if (zjbVar.w(zln.e)) {
            return new znz();
        }
        if (zjbVar.w(zln.m)) {
            return new zoa(128);
        }
        if (zjbVar.w(zln.n)) {
            return new zoa(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(zjbVar.b()));
    }
}

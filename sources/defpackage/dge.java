package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dge {
    public static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(dci.o, "MD2");
        map.put(dci.p, "MD4");
        map.put(dci.q, "MD5");
        map.put(dfh.a, "SHA-1");
        map.put(dcg.f, "SHA-224");
        map.put(dcg.c, "SHA-256");
        map.put(dcg.d, "SHA-384");
        map.put(dcg.e, "SHA-512");
        map.put(dcg.g, "SHA-512(224)");
        map.put(dcg.h, "SHA-512(256)");
        map.put(dcm.c, "RIPEMD-128");
        map.put(dcm.b, "RIPEMD-160");
        map.put(dcm.d, "RIPEMD-128");
        map.put(dfc.d, "RIPEMD-128");
        map.put(dfc.c, "RIPEMD-160");
        map.put(dce.b, "GOST3411");
        map.put(dfa.a, "Tiger");
        map.put(dfc.e, "Whirlpool");
        map.put(dcg.i, "SHA3-224");
        map.put(dcg.j, "SHA3-256");
        map.put(dcg.k, "SHA3-384");
        map.put(dcg.l, "SHA3-512");
        map.put(dcg.m, "SHAKE128");
        map.put(dcg.n, "SHAKE256");
        map.put(dcf.c, "SM3");
        map.put(dfd.l, "BLAKE3-256");
        map2.put("SHA-1", new dcw(dfh.a, dbg.a));
        map2.put("SHA-224", new dcw(dcg.f));
        map2.put("SHA224", new dcw(dcg.f));
        map2.put("SHA-256", new dcw(dcg.c));
        map2.put("SHA256", new dcw(dcg.c));
        map2.put("SHA-384", new dcw(dcg.d));
        map2.put("SHA384", new dcw(dcg.d));
        map2.put("SHA-512", new dcw(dcg.e));
        map2.put("SHA512", new dcw(dcg.e));
        map2.put("SHA3-224", new dcw(dcg.i));
        map2.put("SHA3-256", new dcw(dcg.j));
        map2.put("SHA3-384", new dcw(dcg.k));
        map2.put("SHA3-512", new dcw(dcg.l));
        map2.put("BLAKE3-256", new dcw(dfd.l));
    }
}

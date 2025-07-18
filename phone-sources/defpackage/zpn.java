package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpn {
    public static final Map a;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(zlp.o, "MD2");
        map.put(zlp.p, "MD4");
        map.put(zlp.q, "MD5");
        map.put(zoq.a, "SHA-1");
        map.put(zln.f, "SHA-224");
        map.put(zln.c, "SHA-256");
        map.put(zln.d, "SHA-384");
        map.put(zln.e, "SHA-512");
        map.put(zln.g, "SHA-512(224)");
        map.put(zln.h, "SHA-512(256)");
        map.put(zlt.c, "RIPEMD-128");
        map.put(zlt.b, "RIPEMD-160");
        map.put(zlt.d, "RIPEMD-128");
        map.put(zol.d, "RIPEMD-128");
        map.put(zol.c, "RIPEMD-160");
        map.put(zll.b, "GOST3411");
        map.put(zoj.a, "Tiger");
        map.put(zol.e, "Whirlpool");
        map.put(zln.i, "SHA3-224");
        map.put(zln.j, "SHA3-256");
        map.put(zln.k, "SHA3-384");
        map.put(zln.l, "SHA3-512");
        map.put(zln.m, "SHAKE128");
        map.put(zln.n, "SHAKE256");
        map.put(zlm.c, "SM3");
        map.put(zom.l, "BLAKE3-256");
        map2.put("SHA-1", new zmd(zoq.a, zkm.a));
        map2.put("SHA-224", new zmd(zln.f));
        map2.put("SHA224", new zmd(zln.f));
        map2.put("SHA-256", new zmd(zln.c));
        map2.put("SHA256", new zmd(zln.c));
        map2.put("SHA-384", new zmd(zln.d));
        map2.put("SHA384", new zmd(zln.d));
        map2.put("SHA-512", new zmd(zln.e));
        map2.put("SHA512", new zmd(zln.e));
        map2.put("SHA3-224", new zmd(zln.i));
        map2.put("SHA3-256", new zmd(zln.j));
        map2.put("SHA3-384", new zmd(zln.k));
        map2.put("SHA3-512", new zmd(zln.l));
        map2.put("BLAKE3-256", new zmd(zom.l));
    }
}

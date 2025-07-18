package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zur implements zvm {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap map = new HashMap();
        map.put(a("SHA-256", 32, 67, 20, 2), new zur(1, "XMSSMT_SHA2_20/2_256"));
        map.put(a("SHA-256", 32, 67, 20, 4), new zur(2, "XMSSMT_SHA2_20/4_256"));
        map.put(a("SHA-256", 32, 67, 40, 2), new zur(3, "XMSSMT_SHA2_40/2_256"));
        map.put(a("SHA-256", 32, 67, 40, 4), new zur(4, "XMSSMT_SHA2_40/4_256"));
        map.put(a("SHA-256", 32, 67, 40, 8), new zur(5, "XMSSMT_SHA2_40/8_256"));
        map.put(a("SHA-256", 32, 67, 60, 3), new zur(6, "XMSSMT_SHA2_60/3_256"));
        map.put(a("SHA-256", 32, 67, 60, 6), new zur(7, "XMSSMT_SHA2_60/6_256"));
        map.put(a("SHA-256", 32, 67, 60, 12), new zur(8, "XMSSMT_SHA2_60/12_256"));
        map.put(a("SHA-512", 64, 131, 20, 2), new zur(9, "XMSSMT_SHA2_20/2_512"));
        map.put(a("SHA-512", 64, 131, 20, 4), new zur(10, "XMSSMT_SHA2_20/4_512"));
        map.put(a("SHA-512", 64, 131, 40, 2), new zur(11, "XMSSMT_SHA2_40/2_512"));
        map.put(a("SHA-512", 64, 131, 40, 4), new zur(12, "XMSSMT_SHA2_40/4_512"));
        map.put(a("SHA-512", 64, 131, 40, 8), new zur(13, "XMSSMT_SHA2_40/8_512"));
        map.put(a("SHA-512", 64, 131, 60, 3), new zur(14, "XMSSMT_SHA2_60/3_512"));
        map.put(a("SHA-512", 64, 131, 60, 6), new zur(15, "XMSSMT_SHA2_60/6_512"));
        map.put(a("SHA-512", 64, 131, 60, 12), new zur(16, "XMSSMT_SHA2_60/12_512"));
        map.put(a("SHAKE128", 32, 67, 20, 2), new zur(17, "XMSSMT_SHAKE_20/2_256"));
        map.put(a("SHAKE128", 32, 67, 20, 4), new zur(18, "XMSSMT_SHAKE_20/4_256"));
        map.put(a("SHAKE128", 32, 67, 40, 2), new zur(19, "XMSSMT_SHAKE_40/2_256"));
        map.put(a("SHAKE128", 32, 67, 40, 4), new zur(20, "XMSSMT_SHAKE_40/4_256"));
        map.put(a("SHAKE128", 32, 67, 40, 8), new zur(21, "XMSSMT_SHAKE_40/8_256"));
        map.put(a("SHAKE128", 32, 67, 60, 3), new zur(22, "XMSSMT_SHAKE_60/3_256"));
        map.put(a("SHAKE128", 32, 67, 60, 6), new zur(23, "XMSSMT_SHAKE_60/6_256"));
        map.put(a("SHAKE128", 32, 67, 60, 12), new zur(24, "XMSSMT_SHAKE_60/12_256"));
        map.put(a("SHAKE256", 64, 131, 20, 2), new zur(25, "XMSSMT_SHAKE_20/2_512"));
        map.put(a("SHAKE256", 64, 131, 20, 4), new zur(26, "XMSSMT_SHAKE_20/4_512"));
        map.put(a("SHAKE256", 64, 131, 40, 2), new zur(27, "XMSSMT_SHAKE_40/2_512"));
        map.put(a("SHAKE256", 64, 131, 40, 4), new zur(28, "XMSSMT_SHAKE_40/4_512"));
        map.put(a("SHAKE256", 64, 131, 40, 8), new zur(29, "XMSSMT_SHAKE_40/8_512"));
        map.put(a("SHAKE256", 64, 131, 60, 3), new zur(30, "XMSSMT_SHAKE_60/3_512"));
        map.put(a("SHAKE256", 64, 131, 60, 6), new zur(31, "XMSSMT_SHAKE_60/6_512"));
        map.put(a("SHAKE256", 64, 131, 60, 12), new zur(32, "XMSSMT_SHAKE_60/12_512"));
        a = DesugarCollections.unmodifiableMap(map);
    }

    private zur(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-16-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.c;
    }
}

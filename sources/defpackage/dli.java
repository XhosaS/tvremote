package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dli implements dmd {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap map = new HashMap();
        map.put(a("SHA-256", 32, 67, 20, 2), new dli(1, "XMSSMT_SHA2_20/2_256"));
        map.put(a("SHA-256", 32, 67, 20, 4), new dli(2, "XMSSMT_SHA2_20/4_256"));
        map.put(a("SHA-256", 32, 67, 40, 2), new dli(3, "XMSSMT_SHA2_40/2_256"));
        map.put(a("SHA-256", 32, 67, 40, 4), new dli(4, "XMSSMT_SHA2_40/4_256"));
        map.put(a("SHA-256", 32, 67, 40, 8), new dli(5, "XMSSMT_SHA2_40/8_256"));
        map.put(a("SHA-256", 32, 67, 60, 3), new dli(6, "XMSSMT_SHA2_60/3_256"));
        map.put(a("SHA-256", 32, 67, 60, 6), new dli(7, "XMSSMT_SHA2_60/6_256"));
        map.put(a("SHA-256", 32, 67, 60, 12), new dli(8, "XMSSMT_SHA2_60/12_256"));
        map.put(a("SHA-512", 64, 131, 20, 2), new dli(9, "XMSSMT_SHA2_20/2_512"));
        map.put(a("SHA-512", 64, 131, 20, 4), new dli(10, "XMSSMT_SHA2_20/4_512"));
        map.put(a("SHA-512", 64, 131, 40, 2), new dli(11, "XMSSMT_SHA2_40/2_512"));
        map.put(a("SHA-512", 64, 131, 40, 4), new dli(12, "XMSSMT_SHA2_40/4_512"));
        map.put(a("SHA-512", 64, 131, 40, 8), new dli(13, "XMSSMT_SHA2_40/8_512"));
        map.put(a("SHA-512", 64, 131, 60, 3), new dli(14, "XMSSMT_SHA2_60/3_512"));
        map.put(a("SHA-512", 64, 131, 60, 6), new dli(15, "XMSSMT_SHA2_60/6_512"));
        map.put(a("SHA-512", 64, 131, 60, 12), new dli(16, "XMSSMT_SHA2_60/12_512"));
        map.put(a("SHAKE128", 32, 67, 20, 2), new dli(17, "XMSSMT_SHAKE_20/2_256"));
        map.put(a("SHAKE128", 32, 67, 20, 4), new dli(18, "XMSSMT_SHAKE_20/4_256"));
        map.put(a("SHAKE128", 32, 67, 40, 2), new dli(19, "XMSSMT_SHAKE_40/2_256"));
        map.put(a("SHAKE128", 32, 67, 40, 4), new dli(20, "XMSSMT_SHAKE_40/4_256"));
        map.put(a("SHAKE128", 32, 67, 40, 8), new dli(21, "XMSSMT_SHAKE_40/8_256"));
        map.put(a("SHAKE128", 32, 67, 60, 3), new dli(22, "XMSSMT_SHAKE_60/3_256"));
        map.put(a("SHAKE128", 32, 67, 60, 6), new dli(23, "XMSSMT_SHAKE_60/6_256"));
        map.put(a("SHAKE128", 32, 67, 60, 12), new dli(24, "XMSSMT_SHAKE_60/12_256"));
        map.put(a("SHAKE256", 64, 131, 20, 2), new dli(25, "XMSSMT_SHAKE_20/2_512"));
        map.put(a("SHAKE256", 64, 131, 20, 4), new dli(26, "XMSSMT_SHAKE_20/4_512"));
        map.put(a("SHAKE256", 64, 131, 40, 2), new dli(27, "XMSSMT_SHAKE_40/2_512"));
        map.put(a("SHAKE256", 64, 131, 40, 4), new dli(28, "XMSSMT_SHAKE_40/4_512"));
        map.put(a("SHAKE256", 64, 131, 40, 8), new dli(29, "XMSSMT_SHAKE_40/8_512"));
        map.put(a("SHAKE256", 64, 131, 60, 3), new dli(30, "XMSSMT_SHAKE_60/3_512"));
        map.put(a("SHAKE256", 64, 131, 60, 6), new dli(31, "XMSSMT_SHAKE_60/6_512"));
        map.put(a("SHAKE256", 64, 131, 60, 12), new dli(32, "XMSSMT_SHAKE_60/12_512"));
        a = DesugarCollections.unmodifiableMap(map);
    }

    private dli(int i, String str) {
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

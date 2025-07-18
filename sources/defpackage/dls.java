package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dls implements dmd {
    public static final Map a;
    private final String b;

    static {
        HashMap map = new HashMap();
        map.put(a("SHA-256", 32, 67), new dls("WOTSP_SHA2-256_W16"));
        map.put(a("SHA-512", 64, 131), new dls("WOTSP_SHA2-512_W16"));
        map.put(a("SHAKE128", 32, 67), new dls("WOTSP_SHAKE128_W16"));
        map.put(a("SHAKE256", 64, 131), new dls("WOTSP_SHAKE256_W16"));
        a = DesugarCollections.unmodifiableMap(map);
    }

    private dls(String str) {
        this.b = str;
    }

    public static String a(String str, int i, int i2) {
        return str + "-" + i + "-16-" + i2;
    }

    public final String toString() {
        return this.b;
    }
}

package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfh {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        b = new HashMap();
        new ulp("PlayCoreVersion", (byte[]) null);
    }

    public static synchronized Map a() {
        Map map;
        map = b;
        map.put("java", 20002);
        return map;
    }
}

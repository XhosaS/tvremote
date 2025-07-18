package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzr {
    public final Map a = new HashMap();

    private static String c(String str) {
        return "imageprefetch_".concat(String.valueOf(str));
    }

    public final boolean a(String str) {
        Map map = this.a;
        String strC = c(str);
        return map.containsKey(strC) && ((Integer) map.get(strC)).intValue() == 1;
    }

    public final void b(String str, int i) {
        this.a.put(c(str), Integer.valueOf(i));
    }
}

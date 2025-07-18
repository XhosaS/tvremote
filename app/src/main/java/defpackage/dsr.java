package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsr {
    public static int a(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 3 : 2;
        }
        return 1;
    }

    public static void b(int i, String str) {
        elo.a().a(a(i), str, null, null);
    }

    public static void c(int i, String str, Map map) {
        elo.a().a(a(i), str, null, map);
    }
}

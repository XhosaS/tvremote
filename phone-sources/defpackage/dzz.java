package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzz {
    private static final HashSet a = new HashSet();
    private static String b = "media3.common";

    public static synchronized String a() {
        return b;
    }

    public static synchronized void b(String str) {
        if (a.add(str)) {
            b = b + ", " + str;
        }
    }
}

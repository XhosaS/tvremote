package defpackage;

import android.os.SystemClock;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hav {
    public static final hav a = new hav();
    private static final File b = new File("/proc/self/fd");
    private static int c = 30;
    private static long d = SystemClock.uptimeMillis();
    private static boolean e = true;

    private hav() {
    }

    public final synchronized boolean a() {
        int i = c;
        c = i + 1;
        if (i >= 30 || SystemClock.uptimeMillis() > d + 30000) {
            c = 0;
            d = SystemClock.uptimeMillis();
            String[] list = b.list();
            if (list == null) {
                list = new String[0];
            }
            e = list.length < 800;
        }
        return e;
    }
}

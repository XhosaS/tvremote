package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajq {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(PackageManager packageManager) {
        if (d == null) {
            boolean z = false;
            if (aju.c() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        return d(context.getPackageManager());
    }

    public static boolean d(PackageManager packageManager) {
        if (b == null) {
            b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return b.booleanValue();
    }

    public static boolean e(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (c.booleanValue()) {
            return !aju.c() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}

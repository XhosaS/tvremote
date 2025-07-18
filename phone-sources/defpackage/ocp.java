package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocp {
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
            if (ocv.f() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
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
            return !ocv.f() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}

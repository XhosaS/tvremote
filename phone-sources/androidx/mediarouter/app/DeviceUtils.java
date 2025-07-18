package androidx.mediarouter.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class DeviceUtils {
    public static Boolean a;
    public static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;
    private static Boolean f;
    private static Boolean g;

    private DeviceUtils() {
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f == null) {
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f = Boolean.valueOf(z);
        }
        return f.booleanValue();
    }

    public static boolean b(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (c == null) {
            c = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || b(resources));
        }
        return c.booleanValue();
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (g == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            g = Boolean.valueOf(z);
        }
        return g.booleanValue();
    }

    public static boolean e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (e == null) {
            e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return e.booleanValue();
    }
}

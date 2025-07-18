package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afp {
    public static boolean a = false;
    public static boolean b = false;

    @Deprecated
    static final AtomicBoolean c = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!b) {
                PackageInfo packageInfoK = ajv.b(context).k("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                afq.b(context);
                if (packageInfoK == null || afq.d(packageInfoK, false) || !afq.d(packageInfoK, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }
}

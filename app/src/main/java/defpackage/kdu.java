package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdu {
    public static boolean b = false;
    public static boolean c = false;

    @Deprecated
    static final AtomicBoolean d = new AtomicBoolean();
    public static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static void b(Context context, int i) throws PackageManager.NameNotFoundException, kdr, kds {
        kcy kcyVar = kcy.d;
        int iG = kcyVar.g(context, i);
        if (iG != 0) {
            Intent intentH = kcyVar.h(context, iG, "e");
            Log.e("GooglePlayServicesUtil", a.b(iG, "GooglePlayServices not available due to error "));
            if (intentH != null) {
                throw new kds(iG, "Google Play Services not available", intentH);
            }
            throw new kdr(iG);
        }
    }

    public static boolean c(Context context) {
        try {
            if (!c) {
                PackageInfo packageInfoB = kmb.a.a(context).b("com.google.android.gms", 134217792);
                kdv kdvVarA = kdv.a(context);
                if (packageInfoB == null || kdvVarA.b(packageInfoB, false) || !kdvVarA.b(packageInfoB, true)) {
                    b = false;
                } else {
                    b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            c = true;
        }
        return b || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean d(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean e(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}

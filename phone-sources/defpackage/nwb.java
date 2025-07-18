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
/* loaded from: classes2.dex */
public final class nwb {
    public static boolean a = false;
    public static boolean b = false;

    @Deprecated
    public static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean d = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwb.b(android.content.Context, int):int");
    }

    @Deprecated
    public static void c(Context context, int i) throws nvz, nwa {
        nvk nvkVar = nvk.d;
        int iH = nvkVar.h(context, i);
        if (iH != 0) {
            Intent intentI = nvkVar.i(context, iH, "e");
            Log.e("GooglePlayServicesUtil", a.cf(iH, "GooglePlayServices not available due to error "));
            if (intentI != null) {
                throw new nwa(iH, "Google Play Services not available", intentI);
            }
            throw new nvz();
        }
    }

    public static boolean d(Context context) {
        try {
            if (!b) {
                PackageInfo packageInfoZ = oda.b(context).z("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                nwc.a(context);
                if (packageInfoZ == null || nwc.b(packageInfoZ, false) || !nwc.b(packageInfoZ, true)) {
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

    @Deprecated
    public static boolean e(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return g(context);
        }
        return false;
    }

    @Deprecated
    public static boolean f(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    static boolean g(Context context) {
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

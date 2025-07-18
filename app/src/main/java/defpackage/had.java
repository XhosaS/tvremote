package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class had {
    public static final PackageInfo a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        str.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 128);
            packageInfo.getClass();
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(128L));
        packageInfo2.getClass();
        return packageInfo2;
    }
}

package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abw {
    public static int a(Context context, String str) {
        int iA;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iA = aax.a(appOpsManager, strPermissionToOp, Binder.getCallingUid(), packageName);
            if (iA == 0) {
                iA = aax.a(appOpsManager, strPermissionToOp, iMyUid, context.getOpPackageName());
            }
        } else {
            iA = aay.a(context, strPermissionToOp, packageName);
        }
        return iA != 0 ? -2 : 0;
    }
}

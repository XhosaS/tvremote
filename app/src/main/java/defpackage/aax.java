package defpackage;

import android.app.AppOpsManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aax {
    public static int a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }
}

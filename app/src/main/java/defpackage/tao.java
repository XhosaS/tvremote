package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tao {
    public static yqt a(Context context) {
        try {
            return yqt.h(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return ypv.a;
        }
    }
}

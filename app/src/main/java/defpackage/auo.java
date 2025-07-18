package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class auo {
    private static auo c;
    public boolean a;
    public boolean b;

    private auo(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0).iterator();
        Resources resourcesForApplication = null;
        String str = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.activityInfo.packageName;
            if (str2 != null && next.activityInfo != null && (next.activityInfo.applicationInfo.flags & 1) != 0) {
                try {
                    resourcesForApplication = packageManager.getResourcesForApplication(str2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (resourcesForApplication != null) {
                str = str2;
                break;
            }
            str = str2;
        }
        aun aunVar = resourcesForApplication != null ? new aun(resourcesForApplication, str) : null;
        int i = bap.f;
        this.a = false;
        if (aunVar != null) {
            this.a = aunVar.a("leanback_prefer_static_shadows", false);
        }
        boolean zIsLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        this.b = zIsLowRamDevice;
        if (aunVar != null) {
            this.b = aunVar.a("leanback_outline_clipping_disabled", zIsLowRamDevice);
        }
    }

    public static auo a(Context context) {
        if (c == null) {
            c = new auo(context);
        }
        return c;
    }
}

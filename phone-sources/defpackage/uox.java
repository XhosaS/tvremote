package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uox {
    private static uox d;
    private String e = null;
    public Boolean a = null;
    public Boolean b = null;
    public final Queue c = new ArrayDeque();

    private uox() {
    }

    public static synchronized uox a() {
        if (d == null) {
            d = new uox();
        }
        return d;
    }

    public final synchronized String b(Context context, Intent intent) {
        String str = this.e;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
            ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
            if (context.getPackageName().equals(serviceInfo.packageName) && serviceInfo.name != null) {
                if (serviceInfo.name.startsWith(".")) {
                    this.e = String.valueOf(context.getPackageName()).concat(String.valueOf(serviceInfo.name));
                } else {
                    this.e = serviceInfo.name;
                }
                return this.e;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public final boolean c(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a.booleanValue();
    }
}

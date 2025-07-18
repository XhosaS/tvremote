package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvs {
    public static final String a = gpn.a("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (gvt.a) {
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}

package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aog {
    public static Thread a;
    public static Thread b;

    private aog() {
    }

    public static void a(Context context) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            Log.e("AppDoctorRestartUtil", "Failed to get ActivityManager.");
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.uid == iMyUid && runningAppProcessInfo.pid != iMyPid) {
                Log.i("AppDoctorRestartUtil", String.format("Killing '%s' pid=%d", runningAppProcessInfo.processName, Integer.valueOf(runningAppProcessInfo.pid)));
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    public static void b() {
        Process.killProcess(Process.myPid());
    }
}

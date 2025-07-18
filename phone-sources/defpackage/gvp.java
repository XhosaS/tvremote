package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvp {
    static {
        gpn.a("ProcessUtils");
    }

    public static final boolean a(Context context, tae taeVar) {
        String processName;
        Object next;
        Object objInvoke;
        context.getClass();
        taeVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            processName.getClass();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, gpz.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
            } catch (Throwable unused) {
                gpn.b();
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        processName = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return yks.e(processName, context.getApplicationInfo().processName);
    }
}

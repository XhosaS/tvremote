package defpackage;

import android.app.ActivityManager;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbg {
    public static final boolean a(ActivityManager activityManager, String str) {
        qpi qpiVar = hag.g.j;
        Objects.toString(qpiVar);
        String strValueOf = String.valueOf(qpiVar);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
            return false;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (agvy.c(((ActivityManager.RunningAppProcessInfo) it.next()).processName, str.concat(strValueOf))) {
                return true;
            }
        }
        return false;
    }
}

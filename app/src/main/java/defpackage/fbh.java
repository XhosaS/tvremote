package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fbh {
    public final /* synthetic */ ActivityManager a;
    public final /* synthetic */ Context b;

    public /* synthetic */ fbh(ActivityManager activityManager, Context context) {
        this.a = activityManager;
        this.b = context;
    }

    public final void a() {
        Object next;
        String packageName = this.b.getPackageName();
        packageName.getClass();
        qpi qpiVar = hag.d.j;
        Objects.toString(qpiVar);
        String strValueOf = String.valueOf(qpiVar);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.a.getRunningAppProcesses();
        Integer numValueOf = null;
        if (runningAppProcesses != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                String strConcat = packageName.concat(strValueOf);
                next = it.next();
                if (agvy.c(((ActivityManager.RunningAppProcessInfo) next).processName, strConcat)) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo != null) {
                numValueOf = Integer.valueOf(runningAppProcessInfo.pid);
            }
        }
        if (numValueOf != null) {
            Process.killProcess(numValueOf.intValue());
        }
    }
}

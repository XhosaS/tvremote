package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aom extends anx {
    public aom() {
        super(aco.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        byg bygVarH;
        if (!bygVar.f() || ((adb) bygVar.b()).b != 5) {
            throw new IllegalArgumentException("Required ProcessRestartFixConfig missing.");
        }
        adb adbVar = (adb) bygVar.b();
        acw acwVar = adbVar.b == 5 ? (acw) adbVar.c : acw.a;
        if (acwVar.b == 1 && ((Boolean) acwVar.c).booleanValue()) {
            aoc aocVar = new aoc(aodVar);
            aocVar.c();
            return aocVar.a();
        }
        adb adbVar2 = (adb) bygVar.b();
        acw acwVar2 = adbVar2.b == 5 ? (acw) adbVar2.c : acw.a;
        String str = acwVar2.b == 2 ? (String) acwVar2.c : "";
        ActivityManager activityManager = (ActivityManager) aodVar.b.getSystemService("activity");
        if (activityManager == null) {
            throw new IllegalStateException("ActivityManager is null!");
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                bygVarH = bxw.a;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals(str)) {
                bygVarH = byg.h(Integer.valueOf(next.pid));
                break;
            }
        }
        if (!bygVarH.f()) {
            Log.d("ProcessRestartFix", String.format("Process '%s' is not currently running.", str));
            return aodVar;
        }
        Integer num = (Integer) bygVarH.b();
        int iIntValue = num.intValue();
        Log.i("ProcessRestartFix", String.format("Killing '%s' pid=%d", str, num));
        if (iIntValue == Process.myPid()) {
            aoc aocVar2 = new aoc(aodVar);
            aocVar2.h = true;
            return aocVar2.a();
        }
        Process.killProcess(iIntValue);
        aoc aocVar3 = new aoc(aodVar);
        aocVar3.h = false;
        return aocVar3.a();
    }

    @Override // defpackage.anx
    public final String b() {
        return "ProcessRestartFix";
    }
}

package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqy extends oqk {
    public oqy() {
        super(ngl.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        tst tstVarI;
        if (!tstVar.g() || ((ngy) tstVar.c()).b != 5) {
            throw new IllegalArgumentException("Required ProcessRestartFixConfig missing.");
        }
        ngy ngyVar = (ngy) tstVar.c();
        ngt ngtVar = ngyVar.b == 5 ? (ngt) ngyVar.c : ngt.a;
        if (ngtVar.b == 1 && ((Boolean) ngtVar.c).booleanValue()) {
            oqo oqoVar = new oqo(oqpVar);
            oqoVar.c();
            return oqoVar.a();
        }
        ngy ngyVar2 = (ngy) tstVar.c();
        ngt ngtVar2 = ngyVar2.b == 5 ? (ngt) ngyVar2.c : ngt.a;
        String str = ngtVar2.b == 2 ? (String) ngtVar2.c : "";
        ActivityManager activityManager = (ActivityManager) oqpVar.b.getSystemService("activity");
        if (activityManager == null) {
            throw new IllegalStateException("ActivityManager is null!");
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                tstVarI = trk.a;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals(str)) {
                tstVarI = tst.i(Integer.valueOf(next.pid));
                break;
            }
        }
        if (!tstVarI.g()) {
            String.format("Process '%s' is not currently running.", str);
            return oqpVar;
        }
        Integer num = (Integer) tstVarI.c();
        int iIntValue = num.intValue();
        String.format("Killing '%s' pid=%d", str, num);
        if (iIntValue == Process.myPid()) {
            oqo oqoVar2 = new oqo(oqpVar);
            oqoVar2.h = true;
            return oqoVar2.a();
        }
        Process.killProcess(iIntValue);
        oqo oqoVar3 = new oqo(oqpVar);
        oqoVar3.h = false;
        return oqoVar3.a();
    }

    @Override // defpackage.oqk
    public final String b() {
        return "ProcessRestartFix";
    }
}

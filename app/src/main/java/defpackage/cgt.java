package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class cgt {
    public static final String a = cbx.d("Alarms");

    public static void a(Context context, ckp ckpVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, cgu.c(context, ckpVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        cbx.c().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + ckpVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, ckp ckpVar, long j) {
        ckg ckgVarA = workDatabase.A();
        ckf ckfVarA = ckgVarA.a(ckpVar);
        if (ckfVarA != null) {
            int i = ckfVarA.c;
            a(context, ckpVar, i);
            c(context, ckpVar, i, j);
        } else {
            final cnf cnfVar = new cnf(workDatabase);
            Object objE = cnfVar.a.e(new Callable() { // from class: cnd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(cng.a(cnfVar.a, "next_alarm_manager_id"));
                }
            });
            objE.getClass();
            int iIntValue = ((Number) objE).intValue();
            ckgVarA.c(cko.a(ckpVar, iIntValue));
            c(context, ckpVar, iIntValue, j);
        }
    }

    private static void c(Context context, ckp ckpVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, cgu.c(context, ckpVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}

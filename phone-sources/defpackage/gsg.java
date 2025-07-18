package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsg {
    public static final /* synthetic */ int a = 0;

    static {
        gpn.a("Alarms");
    }

    public static void a(Context context, gun gunVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, gsh.c(context, gunVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        gpn.b();
        Objects.toString(gunVar);
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, gun gunVar, long j) {
        guk gukVarA = workDatabase.A();
        guj gujVarA = gukVarA.a(gunVar);
        if (gujVarA != null) {
            int i = gujVarA.c;
            a(context, gunVar, i);
            c(context, gunVar, i, j);
            return;
        }
        cb cbVar = new cb(workDatabase, (byte[]) null);
        Object objE = ((gex) cbVar.a).e(new eet(cbVar, 4));
        objE.getClass();
        int iIntValue = ((Number) objE).intValue();
        gukVarA.c(fki.aP(gunVar, iIntValue));
        c(context, gunVar, iIntValue, j);
    }

    private static void c(Context context, gun gunVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, gsh.c(context, gunVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}

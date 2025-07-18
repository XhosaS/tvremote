package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lho extends lht {
    private final AlarmManager a;
    private kuj b;
    private Integer c;

    public lho(lih lihVar) {
        super(lihVar);
        this.a = (AlarmManager) this.y.a.getSystemService("alarm");
    }

    private final PendingIntent f() {
        Intent intent = new Intent();
        Context context = this.y.a;
        return PendingIntent.getBroadcast(context, 0, intent.setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), kok.a);
    }

    private final void i() {
        JobScheduler jobScheduler = (JobScheduler) this.y.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(a());
        }
    }

    public final int a() {
        if (this.c == null) {
            this.c = Integer.valueOf("measurement".concat(String.valueOf(this.y.a.getPackageName())).hashCode());
        }
        return this.c.intValue();
    }

    @Override // defpackage.lht
    protected final void b() {
        AlarmManager alarmManager = this.a;
        if (alarmManager != null) {
            alarmManager.cancel(f());
        }
        i();
    }

    public final kuj d() {
        if (this.b == null) {
            this.b = new lhn(this, this.m.l);
        }
        return this.b;
    }

    public final void e() {
        ag();
        lbk lbkVar = this.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.k.a("Unscheduling upload");
        AlarmManager alarmManager = this.a;
        if (alarmManager != null) {
            alarmManager.cancel(f());
        }
        d().a();
        i();
    }
}

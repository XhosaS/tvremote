package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lev extends ksw {
    private JobScheduler a;

    public lev(lbk lbkVar) {
        super(lbkVar);
    }

    @Override // defpackage.ksw
    protected final void d() {
        this.a = (JobScheduler) this.y.a.getSystemService("jobscheduler");
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return true;
    }

    final int i() {
        return "measurement-client".concat(String.valueOf(this.y.a.getPackageName())).hashCode();
    }

    final lln j() {
        a();
        g();
        if (this.a == null) {
            return lln.MISSING_JOB_SCHEDULER;
        }
        lbk lbkVar = this.y;
        if (!lbkVar.d.z()) {
            return lln.NOT_ENABLED_IN_MANIFEST;
        }
        lbk lbkVar2 = this.y;
        return lbkVar2.e().c >= 119000 ? lio.av(lbkVar.a) ? !lbkVar2.k().z() ? lln.NON_PLAY_MODE : lln.CLIENT_UPLOAD_ELIGIBLE : lln.MEASUREMENT_SERVICE_NOT_ENABLED : lln.SDK_TOO_OLD;
    }

    public final void k(long j) {
        a();
        g();
        JobScheduler jobScheduler = this.a;
        if (jobScheduler != null && jobScheduler.getPendingJob(i()) != null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        lln llnVarJ = j();
        if (llnVarJ != lln.CLIENT_UPLOAD_ELIGIBLE) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.k.b("[sgtm] Not eligible for Scion upload", llnVarJ.name());
            return;
        }
        lbk lbkVar3 = this.y;
        lab labVar3 = lbkVar3.f;
        lbkVar3.o(labVar3);
        kzz kzzVar = labVar3.k;
        kzzVar.b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(i(), new ComponentName(lbkVar3.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.a;
        kkk.k(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        lbkVar3.o(labVar3);
        kzzVar.b("[sgtm] Scion upload job scheduled with result", iSchedule == 1 ? "SUCCESS" : "FAILURE");
    }
}

package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eup extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iA = new eur(extras.getInt("requirements")).a(this);
        if (iA != 0) {
            edb.e("PlatformScheduler", a.cf(iA, "Requirements not met: "));
            jobFinished(jobParameters, true);
            return false;
        }
        String string = extras.getString("service_action");
        string.getClass();
        String string2 = extras.getString("service_package");
        string2.getClass();
        edt.aD(this, new Intent(string).setPackage(string2));
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

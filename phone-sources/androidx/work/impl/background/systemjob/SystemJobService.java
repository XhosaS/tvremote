package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.cb;
import defpackage.fki;
import defpackage.fse;
import defpackage.gpn;
import defpackage.gqg;
import defpackage.gqr;
import defpackage.gqw;
import defpackage.grs;
import defpackage.gun;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements gqg {
    private static final String a = gpn.a("SystemJobService");
    private grs b;
    private final Map c = new HashMap();
    private final gqw d = fki.aS(false);
    private fse e;

    private static gun b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new gun(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.cg(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.gqg
    public final void a(gun gunVar, boolean z) {
        c("onExecuted");
        gpn.b();
        JobParameters jobParameters = (JobParameters) this.c.remove(gunVar);
        this.d.c(gunVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            grs grsVarH = grs.h(getApplicationContext());
            this.b = grsVarH;
            gqr gqrVar = grsVarH.e;
            this.e = new fse(gqrVar, grsVarH.k);
            gqrVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            gpn.b();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        grs grsVar = this.b;
        if (grsVar != null) {
            grsVar.e.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            gpn.b();
            jobFinished(jobParameters, true);
            return false;
        }
        gun gunVarB = b(jobParameters);
        if (gunVarB == null) {
            gpn.b();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        Map map = this.c;
        if (map.containsKey(gunVarB)) {
            gpn.b();
            Objects.toString(gunVarB);
            gunVarB.toString();
            return false;
        }
        gpn.b();
        Objects.toString(gunVarB);
        gunVarB.toString();
        map.put(gunVarB, jobParameters);
        fki fkiVar = new fki(null, null, null);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            jobParameters.getNetwork();
        }
        this.e.N(this.d.d(gunVarB), fkiVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            gpn.b();
            return true;
        }
        gun gunVarB = b(jobParameters);
        if (gunVarB == null) {
            gpn.b();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        gpn.b();
        Objects.toString(gunVarB);
        gunVarB.toString();
        this.c.remove(gunVarB);
        cb cbVarC = this.d.c(gunVarB);
        if (cbVarC != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                int stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.M(cbVarC, i);
        }
        gqr gqrVar = this.b.e;
        String str = gunVarB.a;
        synchronized (gqrVar.i) {
            zContains = gqrVar.g.contains(str);
        }
        return !zContains;
    }
}

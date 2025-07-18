package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.cbx;
import defpackage.cdf;
import defpackage.cdk;
import defpackage.cdy;
import defpackage.cee;
import defpackage.ceh;
import defpackage.cfo;
import defpackage.cfq;
import defpackage.ckp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements cdk {
    private static final String a = cbx.d("SystemJobService");
    private cfq b;
    private final Map c = new HashMap();
    private final ceh d = ceh.a.a(false);
    private cfo e;

    private static ckp b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ckp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.e(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.cdk
    public final void a(ckp ckpVar, boolean z) {
        c("onExecuted");
        cbx.c().a(a, ckpVar.a.concat(" executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.c.remove(ckpVar);
        this.d.a(ckpVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            cfq cfqVarJ = cfq.j(getApplicationContext());
            this.b = cfqVarJ;
            cdy cdyVar = cfqVarJ.g;
            this.e = new cfo(cdyVar, cfqVarJ.m);
            cdyVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            cbx.c();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        cfq cfqVar = this.b;
        if (cfqVar != null) {
            cfqVar.g.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        c("onStartJob");
        if (this.b == null) {
            cbx.c().a(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        ckp ckpVarB = b(jobParameters);
        if (ckpVarB == null) {
            cbx.c();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        Map map = this.c;
        if (map.containsKey(ckpVarB)) {
            cbx cbxVarC = cbx.c();
            String str = a;
            Objects.toString(ckpVarB);
            cbxVarC.a(str, "Job is already being executed by SystemJobService: ".concat(ckpVarB.toString()));
            return false;
        }
        cbx cbxVarC2 = cbx.c();
        String str2 = a;
        Objects.toString(ckpVarB);
        cbxVarC2.a(str2, "onStartJob for ".concat(ckpVarB.toString()));
        map.put(ckpVarB, jobParameters);
        cdf cdfVar = new cdf();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.e.a(this.d.b(ckpVarB), cdfVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            cbx.c().a(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        ckp ckpVarB = b(jobParameters);
        if (ckpVarB == null) {
            cbx.c();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        cbx cbxVarC = cbx.c();
        String str = a;
        Objects.toString(ckpVarB);
        cbxVarC.a(str, "onStopJob for ".concat(ckpVarB.toString()));
        this.c.remove(ckpVarB);
        cee ceeVarA = this.d.a(ckpVarB);
        if (ceeVarA != null) {
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
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.b(ceeVarA, i);
        }
        cdy cdyVar = this.b.g;
        String str2 = ckpVarB.a;
        synchronized (cdyVar.g) {
            zContains = cdyVar.e.contains(str2);
        }
        return !zContains;
    }
}

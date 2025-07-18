package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import j$.time.Duration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipr implements wlk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/partnerliveexperiment/UpdateFeatureIdsReceiver");
    private final JobScheduler b;

    public ipr(JobScheduler jobScheduler) {
        this.b = jobScheduler;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        if (action.endsWith("android.intent.action.BOOT_COMPLETED") || action.endsWith("android.intent.action.MY_PACKAGE_REPLACED")) {
            JobScheduler jobScheduler = this.b;
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/partnerliveexperiment/UpdateFeatureIdsReceiver", "maybeScheduleUpdateFeatureIdsJob", 45, "UpdateFeatureIdsReceiver.kt")).x("Scheduling periodic update feature ids job by %s intent", action);
                    Duration duration = ipq.a;
                    ComponentName componentName = irm.a;
                    JobInfo.Builder builder = new JobInfo.Builder(20, irm.A);
                    Duration duration2 = ipq.b;
                    duration2.getClass();
                    JobInfo.Builder backoffCriteria = builder.setBackoffCriteria(duration2.toMillis(), 1);
                    backoffCriteria.getClass();
                    Duration duration3 = ipq.a;
                    duration3.getClass();
                    JobInfo.Builder periodic = backoffCriteria.setPeriodic(duration3.toMillis());
                    periodic.getClass();
                    JobInfo jobInfoBuild = periodic.setRequiredNetworkType(1).setPersisted(true).build();
                    jobInfoBuild.getClass();
                    jobScheduler.schedule(jobInfoBuild);
                    break;
                }
                if (it.next().getId() == 20) {
                    break;
                }
            }
        } else {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/setup/partnerliveexperiment/UpdateFeatureIdsReceiver", "onReceive", 32, "UpdateFeatureIdsReceiver.kt")).x("Received an unexpected intent: %s", action);
        }
        return zxy.a;
    }
}

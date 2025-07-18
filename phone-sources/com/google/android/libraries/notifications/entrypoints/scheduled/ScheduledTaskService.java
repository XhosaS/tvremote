package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.qhj;
import defpackage.qhk;
import defpackage.tvk;
import defpackage.tvn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScheduledTaskService extends JobService {
    private static final tvn a = tvn.n("GnpSdk");

    private final qhk a() {
        try {
            return qhj.a(getApplicationContext());
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/entrypoints/scheduled/ScheduledTaskService", "getGnpComponent", '1', "ScheduledTaskService.java")).s("Failed to get GnpComponent for ScheduledTaskService");
            return null;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        qhk qhkVarA = a();
        if (qhkVarA == null) {
            return false;
        }
        qhkVarA.x().a(getApplicationContext());
        return qhkVarA.t().a(jobParameters, this);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        qhk qhkVarA = a();
        if (qhkVarA == null) {
            return false;
        }
        qhkVarA.t().b(jobParameters);
        return true;
    }
}

package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import defpackage.kkk;
import defpackage.krv;
import defpackage.ksp;
import defpackage.kts;
import defpackage.lab;
import defpackage.lgw;
import defpackage.lgx;
import defpackage.lih;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements lgw {
    private lgx a;

    private final lgx d() {
        if (this.a == null) {
            this.a = new lgx(this);
        }
        return this.a;
    }

    @Override // defpackage.lgw
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lgw
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().c(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final lgx lgxVarD = d();
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            kkk.k(string);
            lih lihVarO = lih.o(lgxVarD.a);
            final lab labVarAB = lihVarO.aB();
            kts ktsVar = lihVarO.l.c;
            labVarAB.k.b("Local AppMeasurementJobService called. action", string);
            lgxVarD.d(lihVarO, new Runnable() { // from class: lgu
                @Override // java.lang.Runnable
                public final void run() {
                    labVarAB.k.a("AppMeasurementJobService processed last upload request.");
                    ((lgw) lgxVarD.a).c(jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        kkk.k(string);
        ksp kspVarA = ksp.a(lgxVarD.a, null);
        kspVarA.c(new krv(kspVarA, new Runnable() { // from class: lgs
            @Override // java.lang.Runnable
            public final void run() {
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((lgw) lgxVarD.a).c(jobParameters);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().e(intent);
        return true;
    }

    @Override // defpackage.lgw
    public final void a(Intent intent) {
    }
}

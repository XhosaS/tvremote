package com.google.android.apps.tvsearch.providers.launcher;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import defpackage.etn;
import defpackage.eup;
import defpackage.feq;
import defpackage.gph;
import defpackage.hce;
import defpackage.hcj;
import defpackage.irm;
import defpackage.iro;
import defpackage.iyj;
import defpackage.iyu;
import defpackage.izq;
import defpackage.uea;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wmw;
import defpackage.wvp;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wzg;
import defpackage.xtv;
import defpackage.yqw;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WidgetInfoUpdateJobService extends hce implements wgt {
    public wmw a;
    private hcj b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public WidgetInfoUpdateJobService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hcj L() {
        hcj hcjVar = this.b;
        if (hcjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return hcjVar;
    }

    @Override // defpackage.hce, android.app.Service
    public final void onCreate() {
        wwt wwtVarD = this.d.d();
        try {
            this.c = true;
            yqw.L(getApplication() instanceof wip);
            if (this.b == null) {
                if (!this.c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.e) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                wvx wvxVarF = wzg.f("CreateComponent", wwb.a, true);
                try {
                    cO().dN();
                    wvxVarF.close();
                    wvxVarF = wzg.f("CreatePeer", wwb.a, true);
                    try {
                        try {
                            eup eupVar = ((etn) cO().dN()).b;
                            this.b = new hcj((Context) eupVar.n.a(), eupVar.bj(), eupVar.g(), (iyj) eupVar.mA.a(), eupVar.co(), eupVar.cr());
                            wvxVarF.close();
                        } finally {
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } finally {
                }
            }
            super.onCreate();
            this.c = false;
            wwtVarD.close();
        } finally {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        wwt wwtVarF = this.d.f();
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            wmwVar.a();
            super.onDestroy();
            this.e = true;
            wwtVarF.close();
        } catch (Throwable th) {
            try {
                wwtVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        wwt wwtVarE = this.d.e("onStartJob");
        try {
            hcj hcjVarL = L();
            jobParameters.getClass();
            if (hcjVarL.b != gph.a) {
                iyj iyjVar = hcjVarL.d;
                izq izqVar = hcjVarL.f;
                iyu iyuVar = hcjVarL.e;
                Optional optionalEmpty = Optional.empty();
                xtv xtvVar = xtv.OPA_TV_LAUNCHER_SUGGESTIONS;
                Duration duration = iro.a;
                iyjVar.c(izqVar, iyuVar, null, optionalEmpty, xtvVar, iro.a);
                JobScheduler jobScheduler = hcjVarL.c;
                ComponentName componentName = irm.a;
                JobInfo.Builder requiredNetworkType = new JobInfo.Builder(12, irm.B).setRequiredNetworkType(1);
                requiredNetworkType.getClass();
                jobScheduler.schedule(feq.a(requiredNetworkType, hcj.a).build());
            }
            wwtVarE.close();
            return false;
        } finally {
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        wwt wwtVarE = this.d.e("onStopJob");
        try {
            hcj hcjVarL = L();
            jobParameters.getClass();
            hcjVarL.d.b();
            wwtVarE.close();
            return true;
        } catch (Throwable th) {
            try {
                wwtVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

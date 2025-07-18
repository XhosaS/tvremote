package com.google.android.apps.tvsearch.fcm;

import android.app.Service;
import android.app.job.JobParameters;
import defpackage.a;
import defpackage.agux;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.ffp;
import defpackage.fjn;
import defpackage.fyd;
import defpackage.fyf;
import defpackage.fyk;
import defpackage.uea;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wmw;
import defpackage.wvp;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wzg;
import defpackage.yqw;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FcmRegistrationJobService extends fyk implements wgt {
    public wmw a;
    private fyf b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public FcmRegistrationJobService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyf L() {
        fyf fyfVar = this.b;
        if (fyfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fyfVar;
    }

    @Override // defpackage.fyk, android.app.Service
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
                            Object objDN = cO().dN();
                            eup eupVar = ((etn) objDN).b;
                            ahbt ahbtVar = (ahbt) eupVar.lw.a();
                            fjn fjnVar = (fjn) eupVar.bD.a();
                            Service service = ((etn) objDN).a;
                            if (!(service instanceof FcmRegistrationJobService)) {
                                throw new IllegalStateException(a.B(service, fyf.class, "Attempt to inject a Service wrapper of type "));
                            }
                            FcmRegistrationJobService fcmRegistrationJobService = (FcmRegistrationJobService) service;
                            fcmRegistrationJobService.getClass();
                            this.b = new fyf(ahbtVar, fjnVar, fcmRegistrationJobService, eupVar.at(), eupVar.aR(), (ffp) eupVar.by.a(), eupVar.mW);
                            wvxVarF.close();
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    } finally {
                    }
                } finally {
                    try {
                        wvxVarF.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
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
            fyf fyfVarL = L();
            fyfVarL.d = jobParameters;
            ahal.e(fyfVarL.b, null, 0, new fyd(fyfVarL, null), 3).w(new agux() { // from class: fyc
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th != null && !(th instanceof CancellationException)) {
                        ((zdv) ((zdv) fyf.a.d()).p(th).q("com/google/android/apps/tvsearch/fcm/FcmRegistrationJobServicePeer", "onStartJob$lambda$0", 72, "FcmRegistrationJobServicePeer.kt")).u("Exception when registering fcm.");
                    }
                    return agpu.a;
                }
            });
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

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        wwt wwtVarE = this.d.e("onStopJob");
        try {
            L();
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

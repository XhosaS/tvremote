package com.google.android.apps.tvsearch.setup.partnerliveexperiment;

import android.app.job.JobParameters;
import defpackage.abxs;
import defpackage.acfo;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.fco;
import defpackage.fhi;
import defpackage.fky;
import defpackage.ipn;
import defpackage.ipo;
import defpackage.ipq;
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
import defpackage.ztw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UpdateFeatureIdsJobService extends ipn implements wgt {
    public wmw a;
    private ipq b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public UpdateFeatureIdsJobService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ipq L() {
        ipq ipqVar = this.b;
        if (ipqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ipqVar;
    }

    @Override // defpackage.ipn, android.app.Service
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
                            this.b = new ipq(eupVar.lF, (ahbt) eupVar.q.a(), eupVar.fU, new fky((fhi) eupVar.an.a()), (ztw) eupVar.ao.a(), (fco) eupVar.kS.a());
                            wvxVarF.close();
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    } finally {
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
            ipq ipqVarL = L();
            abxs abxsVar = ((acfo) ipqVarL.d.a()).b;
            abxsVar.getClass();
            ahal.e(ipqVarL.e, null, 0, new ipo(ipqVarL, abxsVar, null), 3);
            wwtVarE.close();
            return false;
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

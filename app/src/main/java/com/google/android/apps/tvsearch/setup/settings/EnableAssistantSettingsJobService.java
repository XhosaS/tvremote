package com.google.android.apps.tvsearch.setup.settings;

import android.accounts.Account;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.PersistableBundle;
import defpackage.a;
import defpackage.aejl;
import defpackage.agvy;
import defpackage.ahbt;
import defpackage.ahkr;
import defpackage.etn;
import defpackage.eup;
import defpackage.fda;
import defpackage.feq;
import defpackage.gph;
import defpackage.gtu;
import defpackage.iax;
import defpackage.idl;
import defpackage.iqi;
import defpackage.iqj;
import defpackage.iqk;
import defpackage.ira;
import defpackage.uea;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wmw;
import defpackage.wvp;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wyo;
import defpackage.wzg;
import defpackage.yqw;
import defpackage.zwk;
import defpackage.zxn;
import defpackage.zyd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnableAssistantSettingsJobService extends ira implements wgt {
    public wmw a;
    private iqk b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public EnableAssistantSettingsJobService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iqk L() {
        iqk iqkVar = this.b;
        if (iqkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iqkVar;
    }

    @Override // defpackage.ira, android.app.Service
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
                            iax iaxVar = (iax) eupVar.gb.a();
                            fda fdaVar = (fda) eupVar.fS.a();
                            Context context = (Context) eupVar.n.a();
                            ahbt ahbtVar = (ahbt) eupVar.q.a();
                            aejl aejlVar = eupVar.km;
                            aejl aejlVar2 = eupVar.bw;
                            gph gphVarBj = eupVar.bj();
                            gtu gtuVar = (gtu) eupVar.bE.a();
                            idl idlVar = (idl) eupVar.ga.a();
                            Service service = ((etn) objDN).a;
                            if (!(service instanceof EnableAssistantSettingsJobService)) {
                                throw new IllegalStateException(a.B(service, iqk.class, "Attempt to inject a Service wrapper of type "));
                            }
                            EnableAssistantSettingsJobService enableAssistantSettingsJobService = (EnableAssistantSettingsJobService) service;
                            enableAssistantSettingsJobService.getClass();
                            this.b = new iqk(iaxVar, fdaVar, context, ahbtVar, aejlVar, aejlVar2, gphVarBj, gtuVar, idlVar, enableAssistantSettingsJobService, eupVar.gl);
                            wvxVarF.close();
                        } finally {
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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
        PersistableBundle extras;
        wwt wwtVarE = this.d.e("onStartJob");
        try {
            iqk iqkVarL = L();
            zyd zydVar = null;
            Account account = ((jobParameters != null ? jobParameters.getExtras() : null) != null && jobParameters.getExtras().containsKey("authAccount") && jobParameters.getExtras().containsKey("accountType")) ? new Account(jobParameters.getExtras().getString("authAccount", ""), jobParameters.getExtras().getString("accountType", "")) : iqkVarL.e.c();
            iqkVarL.k = (jobParameters == null || (extras = jobParameters.getExtras()) == null) ? false : extras.getBoolean("skip_legacy_linking", false);
            iqkVarL.g = ((Boolean) iqkVarL.f.a()).booleanValue() ? ahkr.c(iqkVarL.d, 0, new iqi(iqkVarL, null), 3) : iqkVarL.c.b();
            zyd zydVar2 = iqkVarL.g;
            if (zydVar2 == null) {
                agvy.b("castInfoFuture");
            } else {
                zydVar = zydVar2;
            }
            zxn.p(zydVar, wyo.f(new iqj(iqkVarL, account)), zwk.a);
            feq.e(iqkVarL.h, iqk.b, iqkVarL.j);
            iqkVarL.i = jobParameters;
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

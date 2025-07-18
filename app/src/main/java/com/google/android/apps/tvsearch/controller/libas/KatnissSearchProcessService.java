package com.google.android.apps.tvsearch.controller.libas;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.aejl;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.fda;
import defpackage.ffs;
import defpackage.fga;
import defpackage.fjr;
import defpackage.fzw;
import defpackage.ggr;
import defpackage.gph;
import defpackage.gtu;
import defpackage.gyy;
import defpackage.iax;
import defpackage.idl;
import defpackage.iqd;
import defpackage.iqz;
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

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KatnissSearchProcessService extends ffs implements wgt {
    public wmw a;
    private fga b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public KatnissSearchProcessService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fga L() {
        fga fgaVar = this.b;
        if (fgaVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fgaVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        wwt wwtVarC = this.d.c(intent);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            wmwVar.b();
            fga fgaVarL = L();
            intent.getClass();
            IBinder binder = fgaVarL.u.getBinder();
            binder.getClass();
            wwtVarC.close();
            return binder;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffs, android.app.Service
    public final void onCreate() throws Throwable {
        wwt wwtVar;
        wwt wwtVar2;
        Throwable th;
        wwt wwtVarD = this.d.d();
        try {
            this.c = true;
            yqw.L(getApplication() instanceof wip);
        } catch (Throwable th2) {
            th = th2;
            wwtVar = wwtVarD;
        }
        try {
            if (this.b != null) {
                wwtVar2 = wwtVarD;
            } else {
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
                    wvx wvxVarF2 = wzg.f("CreatePeer", wwb.a, true);
                    try {
                        try {
                            try {
                                eup eupVar = ((etn) cO().dN()).b;
                                Context context = (Context) eupVar.n.a();
                                ahbt ahbtVar = (ahbt) eupVar.q.a();
                                aejl aejlVar = eupVar.co;
                                gph gphVarBj = eupVar.bj();
                                aejl aejlVar2 = eupVar.rX;
                                ggr ggrVarAY = eupVar.aY();
                                iax iaxVar = (iax) eupVar.gb.a();
                                iqd iqdVarCg = eupVar.cg();
                                fda fdaVar = (fda) eupVar.fS.a();
                                Context context2 = (Context) eupVar.n.a();
                                wwtVar2 = wwtVarD;
                                ahbt ahbtVar2 = (ahbt) eupVar.q.a();
                                aejl aejlVar3 = eupVar.bw;
                                gph gphVarBj2 = eupVar.bj();
                                fzw fzwVarAP = eupVar.aP();
                                eupVar.hf();
                                this.b = new fga(context, ahbtVar, aejlVar, gphVarBj, aejlVar2, new iqz(ggrVarAY, iaxVar, iqdVarCg, fdaVar, context2, ahbtVar2, aejlVar3, gphVarBj2, fzwVarAP, (fjr) eupVar.fW.a(), (gtu) eupVar.bE.a(), eupVar.bZ(), (idl) eupVar.ga.a(), (gyy) eupVar.fX.a(), eupVar.aD()), eupVar.by, eupVar.gG, eupVar.hl, eupVar.gH, eupVar.eV, eupVar.fu, eupVar.hc, eupVar.rY, eupVar.fj, eupVar.gf, eupVar.sa, eupVar.nY, eupVar.sb);
                                wvxVarF2.close();
                            } catch (ClassCastException e) {
                                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            wwtVar = wwtVarD;
                            th = th;
                            try {
                                wvxVarF2.close();
                                throw th;
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                        wvxVarF2.close();
                        throw th;
                    }
                } finally {
                }
            }
            super.onCreate();
            this.c = false;
            wwtVar2.close();
        } catch (Throwable th6) {
            th = th6;
            Throwable th7 = th;
            try {
                wwtVar.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
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
}

package com.google.android.apps.tvsearch.grpc.interactor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.a;
import defpackage.aatb;
import defpackage.afkm;
import defpackage.agvy;
import defpackage.etn;
import defpackage.fyv;
import defpackage.fyw;
import defpackage.fyx;
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
import defpackage.yrp;
import defpackage.zcp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InteractorEndpointService extends fyw implements wgt {
    public wmw a;
    private fyx b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public InteractorEndpointService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fyx L() {
        fyx fyxVar = this.b;
        if (fyxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fyxVar;
    }

    @Override // defpackage.bcq, android.app.Service
    public final IBinder onBind(Intent intent) {
        wwt wwtVarC = this.d.c(intent);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            wmwVar.b();
            super.onBind(intent);
            fyx fyxVarL = L();
            intent.getClass();
            yrp yrpVar = fyxVarL.c;
            if (yrpVar == null) {
                agvy.b("binderSupplier");
                yrpVar = null;
            }
            IBinder iBinderEV = ((aatb) yrpVar).eV();
            iBinderEV.getClass();
            wwtVarC.close();
            return iBinderEV;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fyw, defpackage.bcq, android.app.Service
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
                            Service service = ((etn) cO().dN()).a;
                            if (!(service instanceof InteractorEndpointService)) {
                                throw new IllegalStateException(a.B(service, fyx.class, "Attempt to inject a Service wrapper of type "));
                            }
                            InteractorEndpointService interactorEndpointService = (InteractorEndpointService) service;
                            interactorEndpointService.getClass();
                            this.b = new fyx(interactorEndpointService, zcp.b);
                            wvxVarF.close();
                        } finally {
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } finally {
                    try {
                        wvxVarF.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            super.onCreate();
            fyx fyxVarL = L();
            afkm afkmVar = new afkm();
            InteractorEndpointService interactorEndpointService2 = fyxVarL.a;
            fyxVarL.c = new aatb(fyv.a(interactorEndpointService2, afkmVar, fyxVarL.b), afkmVar, interactorEndpointService2);
            this.c = false;
            wwtVarD.close();
        } catch (Throwable th2) {
            try {
                wwtVarD.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.bcq, android.app.Service
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

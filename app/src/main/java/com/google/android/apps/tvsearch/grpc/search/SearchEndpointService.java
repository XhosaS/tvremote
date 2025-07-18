package com.google.android.apps.tvsearch.grpc.search;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.a;
import defpackage.aatb;
import defpackage.afkm;
import defpackage.agvy;
import defpackage.etn;
import defpackage.fyv;
import defpackage.fyy;
import defpackage.fyz;
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
public final class SearchEndpointService extends fyy implements wgt {
    public wmw a;
    private fyz b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public SearchEndpointService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fyz L() {
        fyz fyzVar = this.b;
        if (fyzVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fyzVar;
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
            fyz fyzVarL = L();
            intent.getClass();
            yrp yrpVar = fyzVarL.c;
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

    @Override // defpackage.fyy, defpackage.bcq, android.app.Service
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
                            zcp zcpVar = zcp.b;
                            Service service = ((etn) objDN).a;
                            if (!(service instanceof SearchEndpointService)) {
                                throw new IllegalStateException(a.B(service, fyz.class, "Attempt to inject a Service wrapper of type "));
                            }
                            SearchEndpointService searchEndpointService = (SearchEndpointService) service;
                            searchEndpointService.getClass();
                            this.b = new fyz(zcpVar, searchEndpointService);
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
            fyz fyzVarL = L();
            afkm afkmVar = new afkm();
            SearchEndpointService searchEndpointService2 = fyzVarL.b;
            fyzVarL.c = new aatb(fyv.a(searchEndpointService2, afkmVar, fyzVarL.a), afkmVar, searchEndpointService2);
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

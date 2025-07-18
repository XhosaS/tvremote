package com.google.android.apps.tvsearch.settings;

import android.content.Intent;
import android.os.IBinder;
import defpackage.agvy;
import defpackage.etn;
import defpackage.iap;
import defpackage.iav;
import defpackage.icu;
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
import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SearchSettingsService extends iap implements wgt {
    public wmw a;
    private iav b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public SearchSettingsService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final iav L() {
        iav iavVar = this.b;
        if (iavVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iavVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        icu icuVar;
        wwt wwtVarC = this.d.c(intent);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            wmwVar.b();
            iav iavVarL = L();
            intent.getClass();
            zdy zdyVar = iav.a;
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/SearchSettingsServicePeer", "onBind", 59, "SearchSettingsServicePeer.kt")).u("Binding to SearchSettingsService");
            if (agvy.c("SearchSettingsServiceBind", intent.getAction())) {
                icuVar = iavVarL.c;
                icuVar.asBinder();
            } else {
                ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/settings/SearchSettingsServicePeer", "onBind", 63, "SearchSettingsServicePeer.kt")).x("Unexpected intent[%s]", intent.getAction());
                icuVar = null;
            }
            wwtVarC.close();
            return icuVar;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iap, android.app.Service
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
                            this.b = new iav(((etn) cO().dN()).b.bY());
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
        } catch (Throwable th) {
            try {
                wwtVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
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

package com.google.android.apps.tvsearch.voice.audiostateholder;

import android.content.Intent;
import android.os.IBinder;
import defpackage.agvy;
import defpackage.etn;
import defpackage.jbn;
import defpackage.jbr;
import defpackage.jbs;
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
public final class KatnissSsbService extends jbr implements wgt {
    public wmw a;
    private jbs b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public KatnissSsbService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jbs L() {
        jbs jbsVar = this.b;
        if (jbsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return jbsVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinderA;
        wwt wwtVarC = this.d.c(intent);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            wmwVar.b();
            jbs jbsVarL = L();
            intent.getClass();
            if (agvy.c(intent.getAction(), "com.google.android.apps.tvsearch.voice.search.KVS_SERVICE")) {
                jbn jbnVar = jbsVarL.a;
                jbnVar.c();
                iBinderA = jbnVar.a();
            } else {
                iBinderA = null;
            }
            wwtVarC.close();
            return iBinderA;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.jbr, android.app.Service
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
                            this.b = new jbs((jbn) ((etn) cO().dN()).b.np.a());
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

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        boolean z;
        wwt wwtVarI = this.d.i();
        try {
            super.onUnbind(intent);
            jbs jbsVarL = L();
            intent.getClass();
            if (agvy.c(intent.getAction(), "com.google.android.apps.tvsearch.voice.search.KVS_SERVICE")) {
                jbn jbnVar = jbsVarL.a;
                jbnVar.d();
                jbnVar.b();
                z = true;
            } else {
                z = false;
            }
            wwtVarI.close();
            return z;
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

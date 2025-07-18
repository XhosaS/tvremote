package com.google.android.apps.tvsearch.assistant.appintegration;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.google.assistant.sdk.libassistant.ConversationStateListener;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.fbp;
import defpackage.fbq;
import defpackage.fbv;
import defpackage.fby;
import defpackage.fcf;
import defpackage.fiu;
import defpackage.fpg;
import defpackage.fus;
import defpackage.gtu;
import defpackage.jnb;
import defpackage.lzb;
import defpackage.mcw;
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
public final class AppAssistantIntegrationService extends fcf implements wgt {
    public wmw a;
    private fbv b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public AppAssistantIntegrationService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbv L() {
        fbv fbvVar = this.b;
        if (fbvVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fbvVar;
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
            fbv fbvVarL = L();
            intent.getClass();
            IBinder binder = new Messenger(new fbq(fbvVarL)).getBinder();
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

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.fcf, android.app.Service
    public final void onCreate() throws Throwable {
        wwt wwtVar;
        wwt wwtVarD = this.d.d();
        try {
            this.c = true;
            yqw.L(getApplication() instanceof wip);
        } catch (Throwable th) {
            th = th;
            wwtVar = wwtVarD;
        }
        try {
            if (this.b != null) {
                wwtVar = wwtVarD;
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
                    try {
                        wvxVarF.close();
                        wvx wvxVarF2 = wzg.f("CreatePeer", wwb.a, true);
                        try {
                            try {
                                eup eupVar = ((etn) cO().dN()).b;
                                wwtVar = wwtVarD;
                                try {
                                    this.b = new fbv((fiu) eupVar.eY.a(), (fbp) eupVar.gZ.a(), (fby) eupVar.hh.a(), eupVar.mc, (mcw) eupVar.i.a(), (ahbt) eupVar.q.a(), eupVar.lm, eupVar.ln, eupVar.bj(), (gtu) eupVar.bE.a(), eupVar.cp, eupVar.mu, eupVar.k(), new fus((fpg) eupVar.bU.a()), eupVar.fV, eupVar.go, (lzb) eupVar.gZ.a());
                                    wvxVarF2.close();
                                    this.b.z = this;
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    try {
                                        wvxVarF2.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (ClassCastException e) {
                                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            wwtVar = wwtVarD;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    wwtVar = wwtVarD;
                    try {
                        wvxVarF.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            fbv fbvVarL = L();
            super.onCreate();
            fbvVarL.f.o(fbvVarL);
            this.c = false;
            wwtVar.close();
        } catch (Throwable th9) {
            th = th9;
            Throwable th10 = th;
            try {
                wwtVar.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
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
            fbv fbvVarL = L();
            fby fbyVar = fbvVarL.f;
            fbyVar.o(null);
            fbyVar.n(null);
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
        wwt wwtVarI = this.d.i();
        try {
            fbv fbvVarL = L();
            intent.getClass();
            ConversationStateListener conversationStateListener = fbvVarL.x;
            if (conversationStateListener != null) {
                ((jnb) fbvVarL.n.a()).a(conversationStateListener);
            }
            fbvVarL.x = null;
            boolean zOnUnbind = super.onUnbind(intent);
            wwtVarI.close();
            return zOnUnbind;
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

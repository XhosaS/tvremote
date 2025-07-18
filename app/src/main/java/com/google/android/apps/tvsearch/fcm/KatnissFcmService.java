package com.google.android.apps.tvsearch.fcm;

import android.app.Service;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.a;
import defpackage.agux;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.ffp;
import defpackage.fjn;
import defpackage.fsv;
import defpackage.fyl;
import defpackage.fyn;
import defpackage.fyo;
import defpackage.fyp;
import defpackage.isn;
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
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KatnissFcmService extends fyl implements wgt {
    public wmw a;
    private fyp c;
    private boolean d;
    private final wvp e = new wvp(this);

    @Deprecated
    public KatnissFcmService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fyp L() {
        fyp fypVar = this.c;
        if (fypVar != null) {
            return fypVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(RemoteMessage remoteMessage) {
        wwt wwtVarE = this.e.e("onMessageReceived");
        try {
            fyp fypVarL = L();
            if (agvy.c(remoteMessage.a.getString("from"), "749708704966")) {
                ahal.e(fypVarL.b, null, 0, new fyn(fypVarL, remoteMessage, null), 3);
            } else {
                ((zdv) fyp.a.b().q("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer", "onMessageReceived", 58, "KatnissFcmServicePeer.kt")).u("Unknown sender. Ignoring the message.");
            }
            wwtVarE.close();
        } catch (Throwable th) {
            try {
                wwtVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(String str) {
        wwt wwtVarE = this.e.e("onNewToken");
        try {
            fyp fypVarL = L();
            str.getClass();
            ((zdv) fyp.a.b().q("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer", "onNewToken", 75, "KatnissFcmServicePeer.kt")).u("#onNewToken");
            ahal.e(fypVarL.b, null, 0, new fyo(str, fypVarL, null), 3).w(new agux() { // from class: fym
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (th != null && !(th instanceof CancellationException)) {
                        ((zdv) ((zdv) fyp.a.d()).p(th).q("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer", "onNewToken$lambda$0", 97, "KatnissFcmServicePeer.kt")).u("Failed to handle new token.");
                    }
                    return agpu.a;
                }
            });
            wwtVarE.close();
        } catch (Throwable th) {
            try {
                wwtVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fyl, android.app.Service
    public final void onCreate() {
        wwt wwtVarD = this.e.d();
        try {
            this.d = true;
            yqw.L(getApplication() instanceof wip);
            if (this.c == null) {
                if (!this.d) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
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
                            ahbt ahbtVar = (ahbt) eupVar.q.a();
                            fjn fjnVar = (fjn) eupVar.bD.a();
                            fsv fsvVarAt = eupVar.at();
                            ffp ffpVar = (ffp) eupVar.by.a();
                            Service service = ((etn) objDN).a;
                            if (!(service instanceof KatnissFcmService)) {
                                throw new IllegalStateException(a.B(service, fyp.class, "Attempt to inject a Service wrapper of type "));
                            }
                            KatnissFcmService katnissFcmService = (KatnissFcmService) service;
                            katnissFcmService.getClass();
                            this.c = new fyp(ahbtVar, fjnVar, fsvVarAt, ffpVar, katnissFcmService, eupVar.mW, (isn) eupVar.sa.a());
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
            this.d = false;
            wwtVarD.close();
        } finally {
        }
    }

    @Override // defpackage.aaov, android.app.Service
    public final void onDestroy() {
        wwt wwtVarF = this.e.f();
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            wmwVar.a();
            super.onDestroy();
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

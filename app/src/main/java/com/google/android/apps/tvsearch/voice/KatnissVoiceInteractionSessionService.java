package com.google.android.apps.tvsearch.voice;

import android.app.Service;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import defpackage.a;
import defpackage.etl;
import defpackage.etn;
import defpackage.eup;
import defpackage.exz;
import defpackage.jbk;
import defpackage.jbl;
import defpackage.jbm;
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
public final class KatnissVoiceInteractionSessionService extends jbk implements wgt {
    public wmw a;
    private jbm b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public KatnissVoiceInteractionSessionService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jbm L() {
        jbm jbmVar = this.b;
        if (jbmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return jbmVar;
    }

    @Override // defpackage.jbk, android.service.voice.VoiceInteractionSessionService, android.app.Service
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
                            etl etlVar = (etl) ((etn) objDN).n.a();
                            Service service = ((etn) objDN).a;
                            if (!(service instanceof KatnissVoiceInteractionSessionService)) {
                                throw new IllegalStateException(a.B(service, jbm.class, "Attempt to inject a Service wrapper of type "));
                            }
                            KatnissVoiceInteractionSessionService katnissVoiceInteractionSessionService = (KatnissVoiceInteractionSessionService) service;
                            katnissVoiceInteractionSessionService.getClass();
                            this.b = new jbm(etlVar, katnissVoiceInteractionSessionService);
                            wvxVarF.close();
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    } finally {
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

    @Override // android.service.voice.VoiceInteractionSessionService
    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        wwt wwtVarE = this.d.e("onNewSession");
        try {
            jbm jbmVarL = L();
            etl etlVar = jbmVarL.b;
            KatnissVoiceInteractionSessionService katnissVoiceInteractionSessionService = jbmVarL.a;
            eup eupVar = etlVar.a.a;
            jbl jblVar = new jbl((mcw) eupVar.i.a(), katnissVoiceInteractionSessionService, eupVar.fA, eupVar.cp, (exz) eupVar.gG.a(), eupVar.mH, eupVar.ml, eupVar.sq);
            wwtVarE.close();
            return jblVar;
        } finally {
        }
    }
}

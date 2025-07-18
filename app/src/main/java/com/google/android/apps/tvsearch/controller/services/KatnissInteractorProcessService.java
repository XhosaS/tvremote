package com.google.android.apps.tvsearch.controller.services;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.etn;
import defpackage.eup;
import defpackage.eyw;
import defpackage.fby;
import defpackage.fgp;
import defpackage.fgs;
import defpackage.gfr;
import defpackage.gsz;
import defpackage.gzu;
import defpackage.ics;
import defpackage.jdt;
import defpackage.jhs;
import defpackage.jjc;
import defpackage.jkx;
import defpackage.jlp;
import defpackage.jma;
import defpackage.lzb;
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
import defpackage.zyh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KatnissInteractorProcessService extends fgp implements wgt {
    public wmw a;
    private fgs b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public KatnissInteractorProcessService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fgs L() {
        fgs fgsVar = this.b;
        if (fgsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return fgsVar;
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
            fgs fgsVarL = L();
            fgsVarL.q = new Messenger(fgsVarL.p);
            IBinder binder = fgsVarL.q.getBinder();
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

    @Override // defpackage.fgp, android.app.Service
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
                            this.b = new fgs((eyw) eupVar.T.a(), (fby) eupVar.hh.a(), eupVar.fE, (jdt) eupVar.mc.a(), (jhs) eupVar.ln.a(), (gzu) eupVar.R.a(), (gfr) eupVar.cu.a(), (jjc) eupVar.ly.a(), (jma) eupVar.gS.a(), (zyh) eupVar.A.a(), (jkx) eupVar.lE.a(), (ics) eupVar.mj.a(), (gsz) eupVar.bz.a(), (lzb) eupVar.gZ.a(), (jlp) eupVar.lQ.a());
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
}

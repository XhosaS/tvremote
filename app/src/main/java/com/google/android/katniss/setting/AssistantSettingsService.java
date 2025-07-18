package com.google.android.katniss.setting;

import android.content.Intent;
import android.os.IBinder;
import defpackage.aejl;
import defpackage.ahbt;
import defpackage.etn;
import defpackage.eup;
import defpackage.ftw;
import defpackage.gph;
import defpackage.gtu;
import defpackage.gtw;
import defpackage.gvn;
import defpackage.iax;
import defpackage.iba;
import defpackage.idl;
import defpackage.lzl;
import defpackage.lzm;
import defpackage.lzp;
import defpackage.uea;
import defpackage.vtm;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wmw;
import defpackage.wvp;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wzg;
import defpackage.yqw;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AssistantSettingsService extends lzm implements wgt {
    public wmw a;
    private lzl b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public AssistantSettingsService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lzl L() {
        lzl lzlVar = this.b;
        if (lzlVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return lzlVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        lzp lzpVar;
        wwt wwtVarC = this.d.c(intent);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            wmwVar.b();
            lzl lzlVarL = L();
            if ("com.google.android.katniss.setting.AssistantSettingsService".equals(intent.getAction())) {
                lzpVar = lzlVarL.o;
            } else {
                intent.getAction();
                lzpVar = null;
            }
            wwtVarC.close();
            return lzpVar;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lzm, android.app.Service
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
                            iax iaxVar = (iax) eupVar.gb.a();
                            iba ibaVar = new iba((iax) eupVar.gb.a(), (ahbt) eupVar.q.a());
                            Supplier supplierGJ = eupVar.gJ();
                            gvn gvnVarBx = eupVar.bx();
                            gph gphVarBj = eupVar.bj();
                            vtm vtmVar = (vtm) eupVar.hU.a();
                            aejl aejlVar = eupVar.bE;
                            this.b = new lzl(iaxVar, ibaVar, supplierGJ, gvnVarBx, gphVarBj, vtmVar, (gtu) aejlVar.a(), new gtw((ahbt) eupVar.q.a(), (gtu) aejlVar.a()), new ftw((ahbt) eupVar.q.a(), eupVar.ax()), eupVar.k(), (idl) eupVar.ga.a(), eupVar.gN(), eupVar.ge);
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

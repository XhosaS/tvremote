package com.google.android.apps.tvsearch.statesync.service;

import android.content.Intent;
import android.os.IBinder;
import defpackage.agte;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.ahdl;
import defpackage.etn;
import defpackage.eup;
import defpackage.ite;
import defpackage.itg;
import defpackage.itk;
import defpackage.itn;
import defpackage.itr;
import defpackage.iub;
import defpackage.iuf;
import defpackage.iui;
import defpackage.iuk;
import defpackage.iul;
import defpackage.iup;
import defpackage.ivs;
import defpackage.ivu;
import defpackage.ivy;
import defpackage.ivz;
import defpackage.iwa;
import defpackage.iwb;
import defpackage.iwd;
import defpackage.iwh;
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
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StateSyncService extends ivs implements wgt {
    public wmw a;
    private ivu b;
    private boolean c;
    private final wvp d = new wvp(this);
    private boolean e;

    @Deprecated
    public StateSyncService() {
        uea.c();
    }

    @Override // defpackage.wgt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ivu L() {
        ivu ivuVar = this.b;
        if (ivuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ivuVar;
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
            L();
            wwtVarC.close();
            return null;
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ivs, android.app.Service
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
                            iwh iwhVar = (iwh) ((etn) objDN).c.a();
                            eup eupVar = ((etn) objDN).b;
                            this.b = new ivu(iwhVar, (agte) eupVar.fR.a(), (ahbt) eupVar.q.a(), (itn) ((etn) objDN).d.a(), (itr) ((etn) objDN).e.a(), (iub) ((etn) objDN).f.a(), (itg) ((etn) objDN).g.a(), (iuf) ((etn) objDN).h.a(), (iui) ((etn) objDN).i.a(), (itk) ((etn) objDN).j.a(), (iuk) ((etn) objDN).k.a(), eupVar.sn, (iul) ((etn) objDN).l.a(), (iup) ((etn) objDN).m.a());
                            wvxVarF.close();
                            this.b.o = this;
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
            ivu ivuVarL = L();
            iwd iwdVarA = ivuVarL.a();
            ReentrantLock reentrantLock = iwdVarA.f;
            reentrantLock.lock();
            try {
                if (iwdVarA.g) {
                    ahdl ahdlVar = iwdVarA.h;
                    if (ahdlVar != null) {
                        ahdlVar.s(null);
                    }
                    Iterator it = iwdVarA.i.values().iterator();
                    while (it.hasNext()) {
                        ((ahdl) it.next()).s(null);
                    }
                    Iterator it2 = iwdVarA.d.iterator();
                    while (it2.hasNext()) {
                        ((ite) it2.next()).i();
                    }
                    iwdVarA.g = false;
                } else {
                    reentrantLock.unlock();
                }
                super.onDestroy();
                this.e = true;
                wwtVarF.close();
            } finally {
                reentrantLock.unlock();
            }
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
    public final int onStartCommand(Intent intent, int i, int i2) {
        wwt wwtVarH = this.d.h(intent, i);
        try {
            wmw wmwVar = this.a;
            if (wmwVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onStartCommand called before onCreate.");
            }
            wmwVar.c();
            super.onStartCommand(intent, i, i2);
            iwd iwdVarA = L().a();
            ReentrantLock reentrantLock = iwdVarA.f;
            reentrantLock.lock();
            try {
                if (iwdVarA.g) {
                    reentrantLock.unlock();
                } else {
                    iwdVarA.g = true;
                    List<ite> list = iwdVarA.d;
                    for (ite iteVar : list) {
                        iteVar.k(new ivy(iwdVarA));
                        iteVar.l(new ivz(iwdVarA));
                        iteVar.j(new iwa(iwdVarA));
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ite) it.next()).h();
                    }
                    if (iwdVarA.c.compareTo(Duration.ZERO) > 0) {
                        iwdVarA.h = ahal.e(iwdVarA.b, null, 0, new iwb(iwdVarA, null), 3);
                    }
                }
                wwtVarH.close();
                return 1;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            try {
                wwtVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

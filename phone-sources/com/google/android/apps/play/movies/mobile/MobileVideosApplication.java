package com.google.android.apps.play.movies.mobile;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;
import com.google.android.apps.play.movies.common.VideosGlobals;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.a;
import defpackage.hfx;
import defpackage.ifm;
import defpackage.igp;
import defpackage.kpz;
import defpackage.kqc;
import defpackage.krd;
import defpackage.lii;
import defpackage.meb;
import defpackage.mie;
import defpackage.mif;
import defpackage.mjo;
import defpackage.ngj;
import defpackage.ngl;
import defpackage.ngz;
import defpackage.oqf;
import defpackage.oqg;
import defpackage.oqk;
import defpackage.oqn;
import defpackage.oqo;
import defpackage.oqp;
import defpackage.oxe;
import defpackage.rqj;
import defpackage.rtq;
import defpackage.rts;
import defpackage.rtx;
import defpackage.sjl;
import defpackage.tst;
import defpackage.twz;
import defpackage.txa;
import defpackage.txg;
import defpackage.txh;
import defpackage.txi;
import defpackage.txk;
import defpackage.txw;
import defpackage.uoo;
import defpackage.uus;
import defpackage.xby;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MobileVideosApplication extends kqc implements ifm<mif> {
    public static final /* synthetic */ int j = 0;
    private kpz k;

    static {
        rtx.a.d();
    }

    @Override // defpackage.ifm
    public final /* synthetic */ Object a() {
        return mif.b(this);
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws IOException {
        Closeable rtqVar;
        try {
            rtx rtxVar = rtx.a;
            if (sjl.g() && rtxVar.b != null && rtxVar.e == null) {
                rtxVar.e = rqj.a();
                rtqVar = new rts(rtxVar, 1);
            } else {
                rtqVar = new rtq(0);
            }
            try {
                super.attachBaseContext(context);
                rtqVar.close();
            } finally {
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.kqc, defpackage.kqa
    public final kpz b() {
        if (this.k == null) {
            this.k = new mie();
        }
        return this.k;
    }

    @Override // defpackage.kqc
    public final VideosGlobals c() {
        return mif.b(this);
    }

    @Override // defpackage.kqc
    protected final xby d() {
        return mif.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, xbw] */
    @Override // defpackage.kqc, android.app.Application
    public final void onCreate() throws IOException {
        try {
            Closeable closeableA = rtx.a.a(this);
            try {
                super.onCreate();
                txi txiVar = txk.c;
                String str = txiVar.a;
                txi txiVar2 = new txi(1, txiVar.b, txiVar.c, txiVar.d, txiVar.e);
                txi txiVar3 = new txi(txiVar2.f, txiVar2.b, true, txiVar2.d, txiVar2.e);
                Context applicationContext = getApplicationContext();
                lii liiVar = new lii(new mjo(), 20);
                applicationContext.getClass();
                uus uusVar = new uus(new twz[]{txiVar3, new uus(applicationContext, liiVar, 1)}, 0);
                if (!txa.a.compareAndSet(false, true)) {
                    throw new IllegalStateException("Logger backend configuration may only occur once.");
                }
                if (!a.v(txg.d, uusVar)) {
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
                txg.e();
                txh.a.b.set(txw.a);
                mif mifVarB = mif.b(this);
                ((hfx) mifVarB.BV.b()).a.b();
                meb.a.c((igp) mifVarB.Cg.b());
                registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) mif.b(this).BK.b());
                try {
                    AppCompatDelegate.setDefaultNightMode(2);
                } catch (RuntimeException e) {
                    krd.d(e.getMessage(), e);
                    setTheme(R.style.Theme_GoogleTv_Dark);
                }
                closeableA.close();
                oqg oqgVarA = new oqf().a();
                ngj ngjVar = ngj.STARTUP;
                oqgVarA.g(this, ngjVar);
                ImmutableSet immutableSet = oqgVarA.b;
                if (immutableSet.isEmpty()) {
                    return;
                }
                oqo oqoVar = new oqo();
                oqoVar.b = this;
                oqoVar.a = ngjVar;
                oqoVar.c = oqgVarA.a;
                oqp oqpVarA = oqoVar.a();
                ImmutableMap immutableMapB = oqgVarA.b();
                oxe oxeVar = new oxe((uoo) null);
                UnmodifiableIterator it = immutableSet.iterator();
                while (it.hasNext()) {
                    ngl nglVar = (ngl) it.next();
                    if (immutableMapB.containsKey(nglVar)) {
                        tst tstVarA = oqg.a((Class) immutableMapB.get(nglVar));
                        if (tstVarA.g()) {
                            oxeVar.c(new oqn("startup_" + nglVar.a(), nglVar, null, (oqk) tstVarA.c(), oqn.a));
                        } else {
                            oqgVarA.d(oqpVarA.b, nglVar, oqpVarA.a);
                        }
                    } else {
                        oqgVarA.f(oqpVarA.b, nglVar, oqpVarA.a);
                    }
                }
                try {
                    oxeVar.i(oqpVarA).b.get();
                } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                    oqgVarA.e(this, ngz.a, ngj.STARTUP);
                }
            } finally {
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}

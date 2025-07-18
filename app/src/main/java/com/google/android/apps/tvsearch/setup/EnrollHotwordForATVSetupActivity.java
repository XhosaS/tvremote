package com.google.android.apps.tvsearch.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.tvsearch.setup.EnrollHotwordForATVSetupActivity;
import defpackage.a;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.agvy;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.etb;
import defpackage.eup;
import defpackage.gtu;
import defpackage.idl;
import defpackage.ifv;
import defpackage.ifx;
import defpackage.ify;
import defpackage.igi;
import defpackage.tt;
import defpackage.wgr;
import defpackage.wgs;
import defpackage.wgt;
import defpackage.wip;
import defpackage.wiq;
import defpackage.wji;
import defpackage.wsv;
import defpackage.wsw;
import defpackage.wsx;
import defpackage.wsz;
import defpackage.wum;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwt;
import defpackage.wyo;
import defpackage.wzg;
import defpackage.xag;
import defpackage.zdv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnrollHotwordForATVSetupActivity extends igi implements wgt, wgr, wip {
    private ify m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public EnrollHotwordForATVSetupActivity() {
        this.f.a(new ifv(this));
    }

    @Override // defpackage.igi
    public final /* synthetic */ aeia C() {
        return new wji(this);
    }

    public final void D() {
        if (this.m != null) {
            return;
        }
        if (!this.o) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.s && !isFinishing()) {
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
                    Activity activity = ((etb) objDN).a;
                    aeiv.a(activity);
                    if (!(activity instanceof EnrollHotwordForATVSetupActivity)) {
                        throw new IllegalStateException(a.w((tt) activity, ify.class));
                    }
                    eup eupVar = ((etb) objDN).c;
                    this.m = new ify((EnrollHotwordForATVSetupActivity) activity, (ahbt) eupVar.q.a(), (gtu) eupVar.bE.a(), eupVar.bZ(), (idl) eupVar.ga.a());
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

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        ify ifyVar = this.m;
        if (ifyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ifyVar;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.p;
        }
        xag.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.gf, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.p = context;
        xag.a(context);
        super.attachBaseContext(context);
        this.p = null;
    }

    @Override // defpackage.gf
    public final boolean cV() {
        wwt wwtVarL = this.n.l();
        try {
            boolean zCV = super.cV();
            wwtVarL.close();
            return zCV;
        } catch (Throwable th) {
            try {
                wwtVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eq, defpackage.bcl
    public final bcg ek() {
        if (this.r == null) {
            this.r = new wiq(this);
        }
        return this.r;
    }

    @Override // android.app.Activity
    public final void finish() {
        wwt wwtVarA = this.n.a();
        try {
            super.finish();
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, android.app.Activity
    public final void invalidateOptionsMenu() {
        wwt wwtVarI = wum.i();
        try {
            cT().e();
            wwtVarI.close();
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        wwt wwtVarU = this.n.u();
        try {
            super.onActivityResult(i, i2, intent);
            wwtVarU.close();
        } catch (Throwable th) {
            try {
                wwtVarU.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        wwt wwtVarB = this.n.b();
        try {
            super.onAttachedToWindow();
            wwtVarB.close();
        } catch (Throwable th) {
            try {
                wwtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    public final void onBackPressed() {
        wwt wwtVarC = this.n.c();
        try {
            this.j.a.c();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.tt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        wwt wwtVarN = this.n.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
            wwtVarN.close();
        } catch (Throwable th) {
            try {
                wwtVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.igi, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            D();
            final ify ifyVar = this.m;
            EnrollHotwordForATVSetupActivity enrollHotwordForATVSetupActivity = ifyVar.b;
            if (!agvy.c(enrollHotwordForATVSetupActivity.getCallingPackage(), "com.google.android.tungsten.setupwraith")) {
                ((zdv) ify.a.b().q("com/google/android/apps/tvsearch/setup/EnrollHotwordForATVSetupActivityPeer", "onCreate", 46, "EnrollHotwordForATVSetupActivityPeer.kt")).u("Calling pkg is not setupwraith, return.");
            }
            ahal.e(ifyVar.c, null, 0, new ifx(ifyVar, null), 3);
            ifyVar.f.y(true);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ifw
                @Override // java.lang.Runnable
                public final void run() {
                    EnrollHotwordForATVSetupActivity enrollHotwordForATVSetupActivity2 = ifyVar.b;
                    enrollHotwordForATVSetupActivity2.setResult(-1);
                    enrollHotwordForATVSetupActivity2.finish();
                }
            });
            enrollHotwordForATVSetupActivity.convertToTranslucent(null, null);
            this.o = false;
            wszVar.o();
            ((wsx) wwtVarV).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarV).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        wwt wwtVarW = this.n.w();
        try {
            super.onCreatePanelMenu(i, menu);
            wwtVarW.close();
            return true;
        } catch (Throwable th) {
            try {
                wwtVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.igi, defpackage.gf, defpackage.bw, android.app.Activity
    public final void onDestroy() {
        wwt wwtVarD = this.n.d();
        try {
            super.onDestroy();
            this.s = true;
            wsz.p(((wsw) wwtVarD).a);
        } catch (Throwable th) {
            try {
                wsz.p(((wsw) wwtVarD).a);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        wwt wwtVarE = this.n.e(intent);
        try {
            super.onNewIntent(intent);
            ((wsx) wwtVarE).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarE).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        wwt wwtVarY = this.n.y();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            wwtVarY.close();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            try {
                wwtVarY.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onPause() {
        wwt wwtVarF = this.n.f();
        try {
            super.onPause();
            wsz wszVar = ((wsv) wwtVarF).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarF).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        wwt wwtVarZ = this.n.z();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            wwtVarZ.close();
        } catch (Throwable th) {
            try {
                wwtVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        wwt wwtVarA = this.n.A();
        try {
            super.onPostCreate(bundle);
            ((wsx) wwtVarA).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarA).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onPostResume() {
        wwt wwtVarG = this.n.g();
        try {
            super.onPostResume();
            wwtVarG.close();
        } catch (Throwable th) {
            try {
                wwtVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        wwt wwtVarI = wum.i();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            wwtVarI.close();
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                wwtVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        wwt wwtVarN = this.n.n("onRequestPermissionsResult", null);
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            wwtVarN.close();
        } catch (Throwable th) {
            try {
                wwtVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        wwt wwtVarH = this.n.h();
        try {
            super.onRestart();
            ((wsx) wwtVarH).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarH).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bw, android.app.Activity
    protected final void onResume() {
        wwt wwtVarI = this.n.i();
        try {
            super.onResume();
            ((wsx) wwtVarI).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarI).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tt, defpackage.eq, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        wwt wwtVarB = this.n.B();
        try {
            super.onSaveInstanceState(bundle);
            wsz wszVar = ((wsv) wwtVarB).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarB).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStart() {
        wwt wwtVarJ = this.n.j();
        try {
            super.onStart();
            ((wsx) wwtVarJ).a.t();
        } catch (Throwable th) {
            try {
                ((wsx) wwtVarJ).a.t();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStop() {
        wwt wwtVarK = this.n.k();
        try {
            super.onStop();
            wsz wszVar = ((wsv) wwtVarK).a;
            wszVar.t();
            wszVar.r();
        } catch (Throwable th) {
            try {
                wsz wszVar2 = ((wsv) wwtVarK).a;
                wszVar2.t();
                wszVar2.r();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        wwt wwtVarM = this.n.m();
        try {
            super.onUserInteraction();
            wwtVarM.close();
        } catch (Throwable th) {
            try {
                wwtVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (wgs.a(intent, getApplicationContext())) {
            wyo.k(intent);
        }
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (wgs.a(intent, getApplicationContext())) {
            wyo.k(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.gf
    protected final void cW() {
    }

    @Override // defpackage.gf
    protected final void cX() {
    }
}

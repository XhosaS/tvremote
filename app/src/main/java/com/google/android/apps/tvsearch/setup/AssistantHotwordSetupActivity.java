package com.google.android.apps.tvsearch.setup;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.agvy;
import defpackage.ahbt;
import defpackage.bcg;
import defpackage.bco;
import defpackage.bds;
import defpackage.bet;
import defpackage.beu;
import defpackage.etb;
import defpackage.eup;
import defpackage.eyp;
import defpackage.ffo;
import defpackage.ffp;
import defpackage.fjr;
import defpackage.fjx;
import defpackage.foc;
import defpackage.ghr;
import defpackage.gtu;
import defpackage.idl;
import defpackage.idu;
import defpackage.ieq;
import defpackage.ies;
import defpackage.igc;
import defpackage.ire;
import defpackage.irh;
import defpackage.irm;
import defpackage.jcy;
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
import defpackage.zdy;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AssistantHotwordSetupActivity extends igc implements wgt, wgr, wip {
    private ies m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public AssistantHotwordSetupActivity() {
        this.f.a(new ieq(this));
    }

    @Override // defpackage.igc
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
                    eup eupVar = ((etb) objDN).c;
                    Supplier supplierGG = eupVar.gG();
                    Activity activity = ((etb) objDN).a;
                    aeiv.a(activity);
                    if (!(activity instanceof AssistantHotwordSetupActivity)) {
                        throw new IllegalStateException(a.w((tt) activity, ies.class));
                    }
                    this.m = new ies(supplierGG, (AssistantHotwordSetupActivity) activity, (eyp) eupVar.gT.a(), eupVar.gJ(), (ahbt) eupVar.q.a(), eupVar.gI(), eupVar.hf(), (fjr) eupVar.fW.a(), (fjx) eupVar.gs.a(), eupVar.gK(), (jcy) eupVar.gx.a(), (ffp) eupVar.by.a(), (gtu) eupVar.bE.a(), eupVar.ho(), eupVar.bZ(), (idl) eupVar.ga.a(), (idu) eupVar.fZ.a(), (irh) ((etb) objDN).g.a(), (ffo) eupVar.fu.a(), (ghr) eupVar.fg.a());
                    wvxVarF.close();
                    this.m.v = this;
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
        ies iesVar = this.m;
        if (iesVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return iesVar;
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

    @Override // defpackage.tt, defpackage.bbz
    public final bet em() {
        beu beuVar = new beu(super.em());
        beuVar.b(bds.c, new Bundle());
        return beuVar;
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
            D();
            ies iesVar = this.m;
            if (i != 556) {
                ((zdv) ies.a.d().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onActivityResult", 292, "AssistantHotwordSetupActivityPeer.kt")).v("Unexpected requestCode: [%s], discarding results from OEM hotword setup", i);
            } else if (i2 == -1) {
                ((zdv) ies.a.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onActivityResult", 270, "AssistantHotwordSetupActivityPeer.kt")).u("OEM hotword setup completed and user accepted.");
                iesVar.h(ire.b);
            } else if (i2 == 0) {
                ((zdv) ies.a.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onActivityResult", 278, "AssistantHotwordSetupActivityPeer.kt")).u("OEM Hotword setup exited without an action.");
                iesVar.h(ire.d);
            } else if (i2 != 1) {
                ((zdv) ies.a.d().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onActivityResult", 284, "AssistantHotwordSetupActivityPeer.kt")).v("Unexpected resultCode: [%s], discarding results from OEM hotword setup", i2);
            } else {
                ((zdv) ies.a.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onActivityResult", 274, "AssistantHotwordSetupActivityPeer.kt")).u("OEM hotword setup completed but user rejected.");
                iesVar.h(ire.c);
            }
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
            D();
            ies iesVar = this.m;
            if (iesVar.t == 0) {
                iesVar.a(4);
            } else {
                iesVar.h(ire.d);
            }
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

    @Override // defpackage.igc, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            D();
            ies iesVar = this.m;
            zdy zdyVar = ies.a;
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onCreate", 164, "AssistantHotwordSetupActivityPeer.kt")).u("#onCreate");
            AssistantHotwordSetupActivity assistantHotwordSetupActivity = iesVar.b;
            Intent intent = assistantHotwordSetupActivity.getIntent();
            if (intent != null && intent.getBooleanExtra("start_from_setup_wraith", false)) {
                assistantHotwordSetupActivity.setTheme(R.style.Theme_KatnissSetup_Opaque_Black);
            }
            assistantHotwordSetupActivity.setContentView(R.layout.setup_assistant_container);
            idl idlVar = iesVar.l;
            idlVar.M();
            iesVar.q = intent != null ? intent.getBooleanExtra("commit_hotword_permission", true) : true;
            iesVar.r = (intent == null || (extras = intent.getExtras()) == null) ? true : extras.getBoolean("start_stop_hotword", false);
            iesVar.o = (intent == null || intent.getBooleanExtra("caller_log_client_setup_event", false)) ? false : true;
            Supplier supplier = iesVar.c;
            iesVar.u = (((Boolean) supplier.get()).booleanValue() && ((Boolean) iesVar.d.get()).booleanValue() && !idlVar.R(iesVar.j.c())) ? 3 : 2;
            if (intent != null && intent.getBooleanExtra("START_VIA_MIC_PRESS", false) && iesVar.s.b()) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onCreate", 199, "AssistantHotwordSetupActivityPeer.kt")).u("Do not begin a AssistantHotwordSetupActivity instance if another setup activity is visible");
                assistantHotwordSetupActivity.finish();
            } else if ((intent == null || !intent.getBooleanExtra("suppress_assistant_setup", false)) && ((Boolean) supplier.get()).booleanValue() && !idlVar.ad(iesVar.j.c())) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onCreate", 208, "AssistantHotwordSetupActivityPeer.kt")).u("Start full assistant setup.");
                Intent intent2 = new Intent();
                ComponentName componentName = irm.a;
                Intent component = intent2.setComponent(irm.e);
                component.getClass();
                wyo.l(assistantHotwordSetupActivity, component);
                iesVar.a(1);
            } else if (!iesVar.e || !((Boolean) iesVar.h.get()).booleanValue()) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onCreate", 215, "AssistantHotwordSetupActivityPeer.kt")).u("Hotword is not supported in this device.");
                iesVar.a(6);
            } else if (iesVar.m.B() && iesVar.g.b == foc.TOGGLE_ON) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onCreate", 224, "AssistantHotwordSetupActivityPeer.kt")).u("Hotword is already accepted.");
                iesVar.a(7);
            } else {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantHotwordSetupActivityPeer", "onCreate", 228, "AssistantHotwordSetupActivityPeer.kt")).u("Start hotword enrollment dialog.");
                if (agvy.c(Build.MODEL, "SHIELD Android TV")) {
                    iesVar.p = true;
                    iesVar.t = 2;
                    iesVar.b(true);
                } else {
                    iesVar.t = 1;
                    iesVar.b(true);
                }
            }
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

    @Override // defpackage.igc, defpackage.gf, defpackage.bw, android.app.Activity
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
            D();
            this.m.n.w();
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
            D();
            this.m.n.x();
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

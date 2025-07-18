package com.google.android.apps.tvsearch.platform.account.state;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.tvsearch.platform.account.state.ReauthSettingsActivity;
import com.google.android.katniss.R;
import defpackage.a;
import defpackage.aeia;
import defpackage.aeiv;
import defpackage.agvy;
import defpackage.bcg;
import defpackage.bco;
import defpackage.etb;
import defpackage.eup;
import defpackage.ghr;
import defpackage.gph;
import defpackage.gxh;
import defpackage.gxk;
import defpackage.gxm;
import defpackage.idl;
import defpackage.tt;
import defpackage.uq;
import defpackage.vd;
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
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ReauthSettingsActivity extends gxh implements wgt, wgr, wip {
    private gxm m;
    private boolean o;
    private Context p;
    private bco r;
    private boolean s;
    private final wsz n = new wsz(this, this);
    private final long q = SystemClock.elapsedRealtime();

    public ReauthSettingsActivity() {
        this.f.a(new gxk(this));
    }

    @Override // defpackage.gxh
    public final /* synthetic */ aeia D() {
        return new wji(this);
    }

    @Override // defpackage.wgr
    public final long F() {
        return this.q;
    }

    @Override // defpackage.wgt
    public final /* bridge */ /* synthetic */ Object L() {
        gxm gxmVar = this.m;
        if (gxmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.s) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return gxmVar;
    }

    public final void M() {
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
                    if (!(activity instanceof ReauthSettingsActivity)) {
                        throw new IllegalStateException(a.w((tt) activity, gxm.class));
                    }
                    eup eupVar = ((etb) objDN).c;
                    this.m = new gxm((ReauthSettingsActivity) activity, (Context) eupVar.n.a(), eupVar.bj(), eupVar.cB(), eupVar.fV, (idl) eupVar.ga.a(), (ghr) eupVar.fg.a());
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

    @Override // defpackage.gxh, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wsz wszVar = this.n;
        wwt wwtVarV = wszVar.v();
        try {
            this.o = true;
            ((wiq) ek()).g(wszVar);
            super.onCreate(bundle);
            M();
            gxm gxmVar = this.m;
            gxmVar.j = bundle != null ? bundle.getBoolean("auth_launched") : false;
            Account accountA = gxmVar.a();
            if (accountA == null) {
                accountA = new Account("", "");
            }
            gxmVar.k = accountA;
            gxmVar.l = gxmVar.a();
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

    @Override // defpackage.gxh, defpackage.gf, defpackage.bw, android.app.Activity
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
            M();
            gxm gxmVar = this.m;
            bundle.getClass();
            bundle.putBoolean("auth_launched", gxmVar.j);
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
        Duration duration;
        wwt wwtVarJ = this.n.j();
        try {
            super.onStart();
            M();
            final gxm gxmVar = this.m;
            if (!gxmVar.j) {
                idl idlVar = gxmVar.h;
                Account account = gxmVar.k;
                Intent intentPutExtra = null;
                if (account == null) {
                    agvy.b("userAccount");
                    account = null;
                }
                idlVar.D(account, true);
                if (((Boolean) gxmVar.g.a()).booleanValue()) {
                    Account account2 = gxmVar.k;
                    if (account2 == null) {
                        agvy.b("userAccount");
                        account2 = null;
                    }
                    idlVar.F(account2, true);
                }
                Account account3 = gxmVar.l;
                if (account3 != null) {
                    String string = gxmVar.d.getString(R.string.title_verify_identity);
                    string.getClass();
                    if (gxmVar.e == gph.a) {
                        duration = gxm.b;
                    } else {
                        duration = Duration.ZERO;
                        duration.getClass();
                    }
                    duration.getClass();
                    intentPutExtra = new Intent("com.google.android.apps.tv.REAUTH").setPackage("com.google.android.apps.tv.launcherx").putExtra("reauthDescText", "").putExtra("reauthTitleText", string).putExtra("reauthMethod", 2).putExtra("reauthLaunchCreatePinIfNotSet", true).putExtra("reauthMethodUseCachedTokenDurationSeconds", (int) duration.toSeconds()).putExtra("reauthAccount", account3);
                    intentPutExtra.getClass();
                }
                if (intentPutExtra != null) {
                    ReauthSettingsActivity reauthSettingsActivity = gxmVar.c;
                    reauthSettingsActivity.dd(new vd(), reauthSettingsActivity.h, new uq() { // from class: gxl
                        @Override // defpackage.uq
                        public final void a(Object obj) {
                            ActivityResult activityResult = (ActivityResult) obj;
                            activityResult.getClass();
                            gxm gxmVar2 = gxmVar;
                            ReauthSettingsActivity reauthSettingsActivity2 = gxmVar2.c;
                            int iA = yeu.a(reauthSettingsActivity2.getIntent().getIntExtra("settingItem", 0));
                            if (iA == 0) {
                                iA = 1;
                            }
                            int iA2 = yew.a(reauthSettingsActivity2.getIntent().getIntExtra("entryPoint", 0));
                            int i = iA2 != 0 ? iA2 : 1;
                            if (activityResult.a == -1) {
                                zdy zdyVar = gxm.a;
                                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/platform/account/state/ReauthSettingsActivityPeer", "handleReauthActivityResult", 125, "ReauthSettingsActivityPeer.kt")).u("reauth successful");
                                if (reauthSettingsActivity2.getIntent().getStringExtra("reauthDisplayId") == null) {
                                    ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/platform/account/state/ReauthSettingsActivityPeer", "updatePersonalResult", 152, "ReauthSettingsActivityPeer.kt")).u("No display id given, failed to update personal results.");
                                } else {
                                    boolean booleanExtra = reauthSettingsActivity2.getIntent().getBooleanExtra("reauthPersonalResults", false);
                                    boolean booleanExtra2 = reauthSettingsActivity2.getIntent().getBooleanExtra("reauthProactiveResults", false);
                                    idl idlVar2 = gxmVar2.h;
                                    Account account4 = gxmVar2.k;
                                    Account account5 = null;
                                    if (account4 == null) {
                                        agvy.b("userAccount");
                                        account4 = null;
                                    }
                                    idlVar2.C(account4, booleanExtra);
                                    if (gxmVar2.b(booleanExtra2)) {
                                        Account account6 = gxmVar2.k;
                                        if (account6 == null) {
                                            agvy.b("userAccount");
                                        } else {
                                            account5 = account6;
                                        }
                                        idlVar2.E(account5, booleanExtra2);
                                    }
                                    Intent intent = new Intent("ACTION_PERSONAL_RESULTS_CHANGED");
                                    ComponentName componentName = irm.a;
                                    Intent intentPutExtra2 = intent.setComponent(irm.d).putExtra("android.app.slice.extra.TOGGLE_STATE", reauthSettingsActivity2.getIntent().getBooleanExtra("reauthPersonalResults", false)).putExtra("display_id", reauthSettingsActivity2.getIntent().getStringExtra("reauthDisplayId"));
                                    if (gxmVar2.b(booleanExtra2)) {
                                        intentPutExtra2.putExtra("reauthProactiveResults", booleanExtra2);
                                    }
                                    intentPutExtra2.getClass();
                                    gxmVar2.d.sendBroadcast(intentPutExtra2);
                                }
                                reauthSettingsActivity2.setResult(-1);
                                gxmVar2.i.H(2, i, iA);
                            } else {
                                ((zdv) gxm.a.d().q("com/google/android/apps/tvsearch/platform/account/state/ReauthSettingsActivityPeer", "handleReauthActivityResult", 130, "ReauthSettingsActivityPeer.kt")).u("reauth failed");
                                reauthSettingsActivity2.setResult(0);
                                gxmVar2.i.H(3, i, iA);
                                idl idlVar3 = gxmVar2.h;
                                idlVar3.D(gxmVar2.a(), false);
                                if (((Boolean) gxmVar2.g.a()).booleanValue()) {
                                    idlVar3.F(gxmVar2.a(), false);
                                }
                                gxmVar2.f.c(R.string.reauth_setting_failed);
                            }
                            reauthSettingsActivity2.finish();
                        }
                    }).b(intentPutExtra);
                }
            }
            gxmVar.j = true;
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

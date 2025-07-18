package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.app.ActivityManager;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cr;
import defpackage.dyd;
import defpackage.fuy;
import defpackage.gag;
import defpackage.hjt;
import defpackage.icy;
import defpackage.icz;
import defpackage.idb;
import defpackage.idr;
import defpackage.idz;
import defpackage.iea;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.iej;
import defpackage.ino;
import defpackage.itk;
import defpackage.jbr;
import defpackage.jwq;
import defpackage.kfw;
import defpackage.krd;
import defpackage.krl;
import defpackage.kry;
import defpackage.ksf;
import defpackage.ksn;
import defpackage.ksy;
import defpackage.ktz;
import defpackage.kub;
import defpackage.kwx;
import defpackage.kxb;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lhr;
import defpackage.lid;
import defpackage.lie;
import defpackage.lin;
import defpackage.liq;
import defpackage.lll;
import defpackage.llt;
import defpackage.lod;
import defpackage.mcw;
import defpackage.mem;
import defpackage.mgr;
import defpackage.mij;
import defpackage.mjl;
import defpackage.mjo;
import defpackage.mrh;
import defpackage.mrm;
import defpackage.mrz;
import defpackage.msa;
import defpackage.msb;
import defpackage.msc;
import defpackage.msd;
import defpackage.msf;
import defpackage.msh;
import defpackage.msw;
import defpackage.nbt;
import defpackage.nqq;
import defpackage.nxb;
import defpackage.pjr;
import defpackage.pke;
import defpackage.pkg;
import defpackage.qtl;
import defpackage.rdd;
import defpackage.rmp;
import defpackage.rmr;
import defpackage.trk;
import defpackage.tug;
import defpackage.tui;
import defpackage.vsz;
import defpackage.vtw;
import defpackage.wae;
import defpackage.wij;
import defpackage.wji;
import defpackage.xay;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import defpackage.xhn;
import defpackage.xji;
import defpackage.xmp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchActivity extends mij implements lod, xce {
    public static final tui c = tui.l("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity");
    public ksy A;
    public String B;
    public String C;
    public boolean D;
    public mrm E;
    public xcd F;
    public lin G;
    public nqq H;
    public gag I;
    private final idr J;
    private final idr K;
    private final krl L;
    private final krl M;
    private final krl N;
    private final List O;
    private final List P;
    private final ksf Q;
    private msd S;
    private ieg T;
    private iej U;
    private iej V;
    private lid W;
    private boolean X;
    private boolean Y;
    private ieg Z;
    private boolean aa;
    private boolean ab;
    private msc ac;
    private final iej ad;
    private msh ae;
    private final idr b;
    public final idr d;
    public final idr e;
    public final List f;
    public final List g;
    public final List h;
    public ieh i;
    public ldv j;
    public mcw k;
    public lfn l;
    public lie m;
    public idb n;
    public mjl o;
    public mjo p;
    public xhn q;
    public xji r;
    public xmp s;
    public ino t;
    public pkg u;
    public lhr v;
    public itk w;
    public mem x;
    public msf y;
    public ActionBar z;

    /* compiled from: PG */
    public final class InitiallyLandscape extends WatchActivity {
        public xcd b;

        @Override // com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity, defpackage.xcf, defpackage.xce
        public final xby<Object> androidInjector() {
            return this.b;
        }

        @Override // com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity, defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
        protected final void onCreate(Bundle bundle) {
            wae.y(this);
            super.onCreate(bundle);
            setTheme(R.style.MoviesTheme);
            getOnBackPressedDispatcher().b(this, new msa(this, this));
        }
    }

    public WatchActivity() {
        ieg iegVar = ieg.a;
        this.b = new idz(iegVar);
        this.J = new idz(iegVar);
        this.K = new idz(iegVar);
        this.L = new krl(false);
        this.M = new krl(false);
        this.d = new idz(iegVar);
        this.e = new idz(trk.a);
        this.N = new krl(false);
        this.f = new ArrayList();
        this.O = new ArrayList();
        this.g = new ArrayList();
        this.P = new ArrayList();
        this.h = new ArrayList();
        this.Q = ksf.a();
        this.T = iegVar;
        this.Z = iegVar;
        this.ad = new mrz(this);
    }

    private final boolean k() {
        return getIntent().getParcelableExtra("playback_info_extra") != null;
    }

    public final idb a() {
        tui tuiVar = c;
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "useInAppDrmCondition", 914, "WatchActivity.java")).s("[Playback] Inside useInAppDrmCondition");
        tug tugVar = (tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "useInAppDrmCondition", 915, "WatchActivity.java");
        Boolean boolValueOf = Boolean.valueOf(this.D);
        Boolean boolValueOf2 = Boolean.valueOf(this.l.dd());
        krl krlVar = this.L;
        tugVar.E("[Playback] isTrailer=%s , preferInAppDrmPlayerForStreaming= %s , usingFallbackInAppPlayerCondition=%s", boolValueOf, boolValueOf2, Boolean.valueOf(krlVar.a));
        return hjt.g(hjt.i(hjt.j(this.D)), hjt.h(new idb[]{hjt.j(this.l.dd()), krlVar}, icz.c, icz.b));
    }

    @Override // defpackage.xcf, defpackage.xce
    public xby<Object> androidInjector() {
        return this.F;
    }

    public final ieg b() {
        return (ieg) this.K.a();
    }

    public final void c(KeyEvent.Callback callback) {
        this.O.add(callback);
    }

    public final void d(mrh mrhVar) {
        this.f.add(mrhVar);
    }

    public final void e(lod lodVar) {
        this.P.add(lodVar);
    }

    public final void f(boolean z) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = true != z ? -1.0f : 0.01f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (!this.ab) {
            super.finish();
        } else {
            finishAndRemoveTask();
            startActivity(jbr.V(this));
        }
    }

    public final void g(KeyEvent.Callback callback) {
        a.ab(this.O.remove(callback));
    }

    public final void h(mrh mrhVar) {
        a.ab(this.f.remove(mrhVar));
    }

    public final void i(lod lodVar) {
        this.P.remove(lodVar);
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.j.x(i, i2)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ksy ksyVar;
        lin linVarN;
        Bundle bundle2;
        wae.y(this);
        cr.a = true;
        mjl mjlVar = this.o;
        ieg iegVar = (ieg) mjlVar.d.a();
        String str = iegVar.m() ? ((kub) iegVar.g()).a : "";
        krd.b("externally provided routeId: ".concat(str));
        mjlVar.T(str);
        idr idrVar = this.J;
        this.ae = new msh(this, idrVar);
        msf msfVar = new msf(this, !jwq.S(this), this.o, this.ae);
        this.y = msfVar;
        idrVar.c(ieg.a(msfVar.e));
        this.X = bundle != null;
        tui tuiVar = c;
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "onCreate", 335, "WatchActivity.java")).D("[Playback] WatchActivity.onCreate: hasBeenStopped=%b, savedInstanceState=%s", this.X, bundle);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.getClass();
        this.z = supportActionBar;
        supportActionBar.setTitle((CharSequence) null);
        this.z.setNavigationMode(0);
        this.z.setDisplayOptions(28, 28);
        this.T = this.j.a();
        this.W = lid.b(getIntent());
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "onCreate", 347, "WatchActivity.java")).v("[Playback] WatchActivity.onCreate: hasPlaybackInfo=%b", Boolean.valueOf(k()));
        if (k()) {
            msw mswVar = (msw) getIntent().getParcelableExtra("playback_info_extra");
            mswVar.getClass();
            this.A = mswVar.e;
            this.C = mswVar.c();
            this.B = mswVar.b();
            this.D = mswVar.h;
            this.K.c(mswVar.d);
            if ((!this.D && !this.T.m()) || (ksyVar = this.A) == null || (this.C == null && this.B != null)) {
                throw new IllegalArgumentException("invalid arguments format: " + String.valueOf(this.T) + ", " + String.valueOf(this.A) + ", " + this.B + ", " + this.C + ", " + this.D);
            }
            krd.f(ksyVar.toString() + ", " + String.valueOf(this.T));
            if (this.D) {
                linVarN = lin.n(this.H, liq.b(50, kxb.b(this.A.b, Uri.EMPTY, Uri.EMPTY).a, wij.TRAILER, ktz.a), this.W);
            } else {
                linVarN = lin.n(this.H, liq.b(50, this.A.b, liq.l(TextUtils.isEmpty(this.C) ? xay.MOVIE : xay.EPISODE), ktz.a), this.W);
            }
            this.G = linVarN;
            if (this.l.cH() && this.r.a()) {
                wji wjiVarP = liq.p(this.A);
                pjr pjrVarB = ((pke) this.u.b).b(115367);
                ieg iegVarG = ((ldy) this.j.f()).a();
                pjrVarB.e(iegVarG.m() ? rdd.Z(((ksn) iegVarG.g()).a) : rdd.ab());
                pjrVarB.d(qtl.af(wjiVarP, vsz.b));
                vtw vtwVarM = nbt.a.m();
                long jB = this.H.b();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                nbt nbtVar = (nbt) vtwVarM.b;
                nbtVar.b |= 1;
                nbtVar.c = jB;
                pjrVarB.e(qtl.ag((nbt) vtwVarM.r()));
                pjrVarB.c(this);
            }
        } else {
            finishAndRemoveTask();
            startActivity(jbr.V(this));
        }
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "onCreate", 382, "WatchActivity.java")).v("[Playback] WatchActivity.onCreate: umpLibraryV2FeatureFlags.enabled=%b", Boolean.valueOf(this.s.d()));
        if (this.s.d()) {
            this.t.C(this.A, true ^ this.x.d());
            if (this.A.a == 20) {
                this.t.B(ksy.l(this.C), this.A);
            }
        }
        this.aa = false;
        if (bundle != null) {
            this.d.c(kfw.G(bundle));
            krl krlVar = this.L;
            krlVar.c(Boolean.valueOf(bundle.getBoolean("USING_FALLBACK_INAPP", false)));
            krl krlVar2 = this.M;
            krlVar2.c(Boolean.valueOf(bundle.getBoolean("USING_FALLBACK_INCOMPLETE_LICENSE", false)));
            this.aa = bundle.getBoolean("WAS_IN_PIP_MODE", false);
            krd.f("Restore WatchActivity");
            krd.f("In app DRM: " + krlVar.a);
            krd.f("Incomplete License: " + krlVar2.a);
            krd.f("Was in PiP Mode: " + this.aa);
            bundle2 = bundle;
        } else {
            bundle2 = null;
        }
        setVolumeControlStream(3);
        idr idrVar2 = this.b;
        this.S = new msd(this, idrVar2, this.y);
        boolean booleanExtra = getIntent().getBooleanExtra("is_avod_playback", false);
        tug tugVar = (tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "onCreate", 415, "WatchActivity.java");
        idr idrVar3 = this.e;
        idr idrVar4 = this.d;
        krl krlVar3 = this.L;
        Object objA = idrVar3.a();
        Object objA2 = idrVar4.a();
        Boolean boolValueOf = Boolean.valueOf(krlVar3.a);
        krl krlVar4 = this.M;
        tugVar.F("[Playback] WatchActivity.onCreate: currentPlaybackRestrictionRepository=%s, currentPlayerErrorRepository=%s, usingFallbackInAppPlayerCondition=%b, usingFallbackIncompleteLicenseCondition=%b", objA, objA2, boolValueOf, Boolean.valueOf(krlVar4.a));
        if (k()) {
            Bundle bundle3 = new Bundle(getIntent().getExtras());
            bundle3.putBoolean("is_trailer", this.D);
            cr supportFragmentManager = getSupportFragmentManager();
            lfn lfnVar = this.l;
            krl krlVar5 = this.N;
            this.U = new kry(supportFragmentManager, new msb(lfnVar, idrVar2, idrVar4, idrVar3, krlVar3, krlVar4, krlVar5, this.q, booleanExtra), new icy(bundle3), krlVar5);
        }
        this.ac = new msc();
        mjl mjlVar2 = this.o;
        mjlVar2.a.c(mjlVar2.b, this.ac);
        this.o.S(this.S);
        lll lllVar = new lll(this, 14);
        this.V = lllVar;
        this.Q.ea(lllVar);
        msf msfVar2 = this.y;
        fuy fuyVar = msfVar2.d;
        nxb nxbVar = new nxb();
        nxbVar.i("android.media.intent.category.LIVE_VIDEO");
        fuyVar.c(nxbVar.g(), msfVar2.f);
        msfVar2.b();
        this.E = new mrm(this, this.l, this.z, dyd.a(this), booleanExtra);
        if (getIntent().getBooleanExtra("use_close_as_home_up_indicator", false)) {
            getSupportActionBar().setHomeAsUpIndicator(2131231508);
        }
        super.onCreate(bundle2);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.E.h) {
            return false;
        }
        MenuInflater menuInflater = getMenuInflater();
        if (this.D) {
            return true;
        }
        menuInflater.inflate(R.menu.settings_and_help_menu, menu);
        if (!this.l.dh() || this.o.V()) {
            return true;
        }
        menuInflater.inflate(R.menu.pin_screen_menu, menu);
        return true;
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        this.o.U(this.S);
        this.o.a.f(this.ac);
        this.Q.ee(this.V);
        msf msfVar = this.y;
        msfVar.d.f(msfVar.f);
        msfVar.e = null;
        this.E.d();
        super.onDestroy();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            if (((KeyEvent.Callback) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            if (((KeyEvent.Callback) it.next()).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        msw mswVar;
        super.onNewIntent(intent);
        ((tug) ((tug) c.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "isNewPlaybackNeededForIntent", 507, "WatchActivity.java")).v("[Playback] WatchActivity.isNewPlaybackNeededForIntent: newIntent=%s", intent);
        if (intent == null || (mswVar = (msw) intent.getParcelableExtra("playback_info_extra")) == null || this.A.equals(mswVar.e)) {
            return;
        }
        finish();
        startActivity(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_settings) {
            startActivity(SettingsActivity.createIntent(this));
            return true;
        }
        if (itemId == R.id.menu_help_and_feedback) {
            this.v.c(this.m, this.j, ((ldy) this.i).a(), this, "mobile_movie_player");
            return true;
        }
        if (itemId == R.id.menu_pin_screen) {
            if (!ActivityManager.isUserAMonkey()) {
                startLockTask();
            }
        } else {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            if (!jwq.N(this)) {
                finish();
            }
        }
        return true;
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.G.f();
        try {
            this.w.c().ee(this.ad);
            this.b.ee(this.U);
            this.J.ee(this.U);
            this.d.ee(this.U);
        } catch (IllegalStateException e) {
            krd.c("Encountered error while trying to remove updatables: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.fl, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        this.aa = z;
        if (!z) {
            this.ab = true;
        }
        this.E.c(z);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (jwq.M(this)) {
            menu.removeItem(R.id.menu_pin_screen);
            return false;
        }
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_pin_screen);
        if (menuItemFindItem == null) {
            if (this.Z.m()) {
                menu.add(0, R.id.menu_pin_screen, ((Integer) this.Z.g()).intValue(), R.string.menu_pin_screen);
            }
        } else if (this.Z.l()) {
            this.Z = ieg.f(Integer.valueOf(menuItemFindItem.getOrder()));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.n.a()) {
            finish();
            return;
        }
        if (!this.D && !this.j.r(this.T)) {
            krd.c("account does not exist: ".concat(String.valueOf(String.valueOf(this.T))));
            finish();
            return;
        }
        if (this.X || !this.Y) {
            this.Y = true;
            this.G.j();
            this.G.h(true ^ this.r.a());
            this.m.ab(this.A.b, this.B, this.C, this.D, this.W);
        }
        this.Q.c(2500L);
        rmr.a().d(new rmp("WatchActivityOnResume"));
        this.b.ea(this.U);
        this.J.ea(this.U);
        idr idrVar = this.d;
        idrVar.ea(this.U);
        this.U.dM();
        iea ieaVarC = this.w.c();
        iej iejVar = this.ad;
        ieaVarC.ea(iejVar);
        iejVar.dM();
        ((tug) ((tug) c.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "onResume", 579, "WatchActivity.java")).v("[Playback] WatchActivity.onResume:  currentPlayerErrorRepository=%s", idrVar.a());
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ieg iegVar = (ieg) this.d.a();
        if (iegVar.m()) {
            kfw.H(bundle, (llt) iegVar.g());
            ((tug) ((tug) ((tug) c.g()).i((Throwable) iegVar.g())).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity", "onSaveInstanceState", 661, "WatchActivity.java")).E("[Playback] WatchActivity.onSaveInstanceState: outState=%s, playbackExceptionPresent=%bk, playbackException=%s", bundle, Boolean.valueOf(iegVar.m()), iegVar.g());
        }
        bundle.putBoolean("USING_FALLBACK_INAPP", this.L.a);
        bundle.putBoolean("USING_FALLBACK_INCOMPLETE_LICENSE", this.M.a);
        bundle.putBoolean("WAS_IN_PIP_MODE", this.aa);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        msf msfVar = this.y;
        msfVar.c.ea(msfVar);
        msfVar.a();
        this.z.hide();
        if (!this.E.h) {
            this.z.show();
        }
        if (this.l.cP() && !this.D && this.T.m()) {
            this.k.g((ksn) this.T.g(), icz.a);
        }
        mrm mrmVar = this.E;
        mrmVar.i = false;
        if (this.aa) {
            mrmVar.g.c();
            this.E.c(this.aa);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        msf msfVar = this.y;
        msfVar.c.ee(msfVar);
        msfVar.a.setRequestedOrientation(-1);
        this.ae.c();
        this.X = true;
        this.E.i = true;
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        f(false);
        this.Q.c(2500L);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((mgr) it.next()).a();
        }
    }

    @Override // defpackage.fl, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (isFinishing()) {
            return;
        }
        mrm mrmVar = this.E;
        if (mrmVar.h || !mrmVar.g.g()) {
            return;
        }
        PictureInPictureParams pictureInPictureParamsA = mrmVar.g.a();
        mrmVar.g.c();
        if (mrmVar.c.enterPictureInPictureMode(pictureInPictureParamsA)) {
            return;
        }
        mrmVar.g.d();
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by
    public final void supportInvalidateOptionsMenu() {
        if (this.z != null) {
            super.supportInvalidateOptionsMenu();
        }
    }

    @Override // defpackage.lod
    public final void u(int i) {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((lod) it.next()).u(i);
        }
    }

    @Override // defpackage.lod
    public final void v(kwx kwxVar) {
        invalidateOptionsMenu();
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((lod) it.next()).v(kwxVar);
        }
    }
}

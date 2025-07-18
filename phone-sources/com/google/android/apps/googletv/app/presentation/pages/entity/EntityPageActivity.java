package com.google.android.apps.googletv.app.presentation.pages.entity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.ajo;
import defpackage.at;
import defpackage.bck;
import defpackage.bv;
import defpackage.cn;
import defpackage.cr;
import defpackage.dvb;
import defpackage.hjr;
import defpackage.hju;
import defpackage.hke;
import defpackage.icy;
import defpackage.idr;
import defpackage.idy;
import defpackage.ieg;
import defpackage.iej;
import defpackage.iof;
import defpackage.ivt;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.jaa;
import defpackage.jad;
import defpackage.jaf;
import defpackage.jbb;
import defpackage.jbr;
import defpackage.jef;
import defpackage.jeg;
import defpackage.jei;
import defpackage.jej;
import defpackage.jlw;
import defpackage.jxm;
import defpackage.jyr;
import defpackage.jyu;
import defpackage.jyv;
import defpackage.jyw;
import defpackage.jyx;
import defpackage.jyy;
import defpackage.jzg;
import defpackage.kiw;
import defpackage.kix;
import defpackage.kiy;
import defpackage.kja;
import defpackage.krd;
import defpackage.ksy;
import defpackage.ldu;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.led;
import defpackage.lhp;
import defpackage.lhr;
import defpackage.mta;
import defpackage.opz;
import defpackage.osk;
import defpackage.rtx;
import defpackage.sfy;
import defpackage.sij;
import defpackage.tyq;
import defpackage.ubf;
import defpackage.ubi;
import defpackage.ubk;
import defpackage.ubl;
import defpackage.ubm;
import defpackage.uby;
import defpackage.vtw;
import defpackage.vtz;
import defpackage.vub;
import defpackage.vuc;
import defpackage.vvd;
import defpackage.wkx;
import defpackage.wll;
import defpackage.wlx;
import defpackage.wni;
import defpackage.wse;
import defpackage.xjf;
import defpackage.xjk;
import defpackage.yft;
import defpackage.ygi;
import defpackage.yhb;
import defpackage.yhc;
import defpackage.yih;
import defpackage.ykl;
import defpackage.ykr;
import defpackage.yks;
import defpackage.ylg;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EntityPageActivity extends jxm implements kiw, jei, jeg, idy, ldu, iej, ivt {
    public static final jyv Companion = new jyv();
    private static final Class J;
    public static final String TRAILER_PLAYER_FRAGMENT_TAG = "trailer_fragment";
    public ldv A;
    public jlw B;
    public xjf C;
    public kja D;
    public AppBarLayout E;
    public View F;
    public View G;
    public FrameLayout H;
    public mta I;
    private final /* synthetic */ kix K = new kix();
    private final yft L;
    private MediaDeviceFloatingActionButton M;
    private RecyclerView N;
    private led O;
    private jaa P;
    public iyn w;
    public iof x;
    public lhr y;
    public xjk z;

    /* renamed from: $r8$lambda$H_K-WcqdzIrPw2dTARdodj20xtM, reason: not valid java name */
    public static /* synthetic */ ygi m114$r8$lambda$H_KWcqdzIrPw2dTARdodj20xtM(EntityPageActivity entityPageActivity) {
        int iAX;
        iyn iynVar = entityPageActivity.w;
        if (iynVar == null) {
            yks.c("streamPagePresenter");
            iynVar = null;
        }
        iyq iyqVar = (iyq) iynVar.l(entityPageActivity.N().f());
        View viewFindViewById = entityPageActivity.findViewById(R.id.entity_page_layout);
        viewFindViewById.getClass();
        sfy.m(entityPageActivity, viewFindViewById).a(iyqVar);
        xjf xjfVar = entityPageActivity.C;
        if (xjfVar == null) {
            yks.c("genAiFeatureFlags");
            xjfVar = null;
        }
        if (xjfVar.a()) {
            vtz vtzVar = entityPageActivity.f.e;
            if (vtzVar == null) {
                vtzVar = wkx.a;
            }
            vvd vvdVar = wse.g;
            vtzVar.i(vvdVar);
            Object objK = vtzVar.l.k((vub) vvdVar.c);
            if (objK == null) {
                objK = vvdVar.b;
            } else {
                vvdVar.c(objK);
            }
            wse wseVar = objK instanceof wse ? (wse) objK : null;
            if (wseVar != null) {
                iAX = a.aX(wseVar.f);
                if (iAX == 0) {
                    iAX = 1;
                }
            } else {
                iAX = 0;
            }
            if (iAX != 0 && iAX == 3) {
                entityPageActivity.N().a().c(entityPageActivity);
                entityPageActivity.N().g.c(true);
            }
        }
        return ygi.a;
    }

    public static /* synthetic */ Float $r8$lambda$ZPWnm8MmALaWtAqMHeSP1EhlqRI(EntityPageActivity entityPageActivity) {
        if (entityPageActivity.E().l() != 0) {
            return Float.valueOf((-r0) + entityPageActivity.h);
        }
        return null;
    }

    public static /* synthetic */ void $r8$lambda$hbbjfCdHj5gJnrn9folkmbX6CUA(EntityPageActivity entityPageActivity, View view) {
        if (entityPageActivity.t()) {
            return;
        }
        entityPageActivity.u().a(entityPageActivity, entityPageActivity.f);
    }

    static {
        Class<?> cls = Class.forName("jcm");
        cls.getClass();
        J = cls;
    }

    public EntityPageActivity() {
        int i = ylg.a;
        this.L = new jej(new ykl(jyw.class), new bck(this, 5), this);
        rtx.a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jyw N() {
        return (jyw) this.L.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        boolean z = getSupportFragmentManager().f(TRAILER_PLAYER_FRAGMENT_TAG) != null;
        this.l.c(Boolean.valueOf(z));
        invalidateOptionsMenu();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeAsUpIndicator(z ? R.drawable.ic_close_24px : R.drawable.app_bar_back_button_icon);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setHomeActionContentDescription(true != z ? R.string.accessibility_navigate_up : R.string.accessibility_close_trailer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P() {
        return getResources().getConfiguration().orientation == 1;
    }

    public static final /* synthetic */ int access$getTrailerPlayerHeight(EntityPageActivity entityPageActivity, Resources resources) {
        if (!entityPageActivity.P()) {
            return -1;
        }
        return Math.min((int) ((resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density) / 1.27d), (int) (resources.getConfiguration().screenHeightDp * resources.getDisplayMetrics().density));
    }

    public final kja F() {
        kja kjaVar = this.D;
        if (kjaVar != null) {
            return kjaVar;
        }
        yks.c("dynamicColorViewModel");
        return null;
    }

    @Override // defpackage.ldu
    public final void G(ieg iegVar, String str) {
        krd.b("Account authenticated");
    }

    public final void J(AppBarLayout appBarLayout) {
        appBarLayout.getClass();
        this.E = appBarLayout;
    }

    @Override // defpackage.kiw
    public final void K(int i) {
        this.K.K(i);
    }

    @Override // defpackage.kiw
    public final void L(String str) {
        this.K.L(str);
    }

    @Override // defpackage.kiw
    public final void M(int i, int i2, View.OnClickListener onClickListener) {
        this.K.M(i, i2, onClickListener);
    }

    @Override // defpackage.jeg
    public final void a(wni wniVar) throws IllegalAccessException, InstantiationException {
        Object objNewInstance = J.newInstance();
        objNewInstance.getClass();
        bv bvVar = (bv) objNewInstance;
        Bundle bundle = new Bundle();
        bundle.putParcelable("asset_id", ksy.m(wniVar.b));
        bundle.putBoolean("manage_action_bar_visibility", true);
        bvVar.setArguments(bundle);
        cr supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.f(TRAILER_PLAYER_FRAGMENT_TAG) != null) {
            supportFragmentManager.M();
        }
        findViewById(R.id.player_container).bringToFront();
        findViewById(R.id.appBar).bringToFront();
        at atVar = new at(getSupportFragmentManager());
        atVar.s(null);
        atVar.u(R.id.player_container, bvVar, TRAILER_PLAYER_FRAGMENT_TAG);
        atVar.a();
    }

    @Override // defpackage.jei
    public final idr b() {
        return N().e;
    }

    @Override // defpackage.idy
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ieg iegVar = (ieg) obj;
        iegVar.getClass();
        led ledVar = null;
        Throwable thI = iegVar.k() ? iegVar.i() : null;
        led ledVar2 = this.O;
        if (ledVar2 == null) {
            yks.c("authenticationHelper");
        } else {
            ledVar = ledVar2;
        }
        ledVar.d(iegVar, thI, this);
    }

    @Override // defpackage.jxs, defpackage.ivt
    public final void f(boolean z) {
        if (this.E == null) {
            return;
        }
        AppBarLayout appBarLayoutO = o();
        int i = true != z ? 0 : 8;
        appBarLayoutO.setVisibility(i);
        l().setVisibility(i);
    }

    @Override // defpackage.jxm
    public final RecyclerView i() {
        return this.N;
    }

    @Override // defpackage.jxm
    public final View j() {
        View view = this.F;
        if (view != null) {
            return view;
        }
        yks.c("pageLayout");
        return null;
    }

    @Override // defpackage.jxm
    public final View k() {
        View view = this.G;
        if (view != null) {
            return view;
        }
        yks.c("streamView");
        return null;
    }

    @Override // defpackage.jxm
    public final FrameLayout l() {
        FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        yks.c("statusBarBackgroundView");
        return null;
    }

    @Override // defpackage.jxm
    public final AppBarLayout o() {
        AppBarLayout appBarLayout = this.E;
        if (appBarLayout != null) {
            return appBarLayout;
        }
        yks.c("appBar");
        return null;
    }

    @Override // defpackage.jxm, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jaf jafVarX = x();
        String str = (String) N().d.a();
        wll wllVarB = N().b();
        String str2 = N().h.b;
        str2.getClass();
        str.getClass();
        wllVarB.getClass();
        vtw vtwVarM = uby.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = ubk.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ubk ubkVar = (ubk) vtwVarM2.b;
        int i = 2;
        ubkVar.b |= 2;
        ubkVar.e = str;
        vtw vtwVarM3 = ubi.a.m();
        vtw vtwVarM4 = ubf.a.m();
        vtw vtwVarM5 = ubl.a.m();
        vtw vtwVarM6 = ubm.a.m();
        int i2 = 1;
        String str3 = wllVarB.b == 1 ? (String) wllVarB.c : "";
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        ubm ubmVar = (ubm) vtwVarM6.b;
        str3.getClass();
        ubmVar.b |= 1;
        ubmVar.c = str3;
        ubm ubmVar2 = (ubm) vtwVarM6.r();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vuc vucVar = vtwVarM5.b;
        ubl ublVar = (ubl) vucVar;
        ubmVar2.getClass();
        ublVar.d = ubmVar2;
        ublVar.c = 2;
        if (!vucVar.A()) {
            vtwVarM5.u();
        }
        ubl ublVar2 = (ubl) vtwVarM5.b;
        ublVar2.b |= 1;
        ublVar2.e = str2;
        ubl ublVar3 = (ubl) vtwVarM5.r();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        ubf ubfVar = (ubf) vtwVarM4.b;
        ublVar3.getClass();
        ubfVar.c = ublVar3;
        ubfVar.b |= 1;
        ubf ubfVar2 = (ubf) vtwVarM4.r();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ubi ubiVar = (ubi) vtwVarM3.b;
        ubfVar2.getClass();
        ubiVar.c = ubfVar2;
        ubiVar.b = 1;
        ubi ubiVar2 = (ubi) vtwVarM3.r();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ubk ubkVar2 = (ubk) vtwVarM2.b;
        ubiVar2.getClass();
        ubkVar2.d = ubiVar2;
        ubkVar2.c = 1;
        vuc vucVarR = vtwVarM2.r();
        vucVarR.getClass();
        tyq.l((ubk) vucVarR, vtwVarM);
        jafVarX.e(this, new jad(179116, 0L, 0, tyq.j(vtwVarM), null, null, 6));
        if (bundle == null) {
            ConcurrentHashMap concurrentHashMap = opz.a;
            osk.l(this, getIntent());
        }
        int i3 = 0;
        sij.A((N().c() == null && hju.u(N().b())) ? false : true, "Neither AssetId [%s] nor EntityId [%s] is provided.", N().c(), N().b());
        setContentView(R.layout.entity_page);
        getSupportFragmentManager().aq(new jyy(this));
        getSupportFragmentManager().m(new cn() { // from class: jyt
            @Override // defpackage.cn
            public final void b() {
                this.a.O();
            }

            @Override // defpackage.cn
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.cn
            public final /* synthetic */ void c() {
            }

            @Override // defpackage.cn
            public final /* synthetic */ void d() {
            }

            @Override // defpackage.cn
            public final /* synthetic */ void e() {
            }
        });
        ldv ldvVar = this.A;
        jaa jaaVar = null;
        if (ldvVar == null) {
            yks.c("accountManagerWrapper");
            ldvVar = null;
        }
        this.O = new led(this, ldvVar, new icy(((ldy) m()).a()));
        xjk xjkVar = this.z;
        if (xjkVar == null) {
            yks.c("glanceWidgetFeatureFlags");
            xjkVar = null;
        }
        if (xjkVar.a() && ((ldy) m()).a().l()) {
            led ledVar = this.O;
            if (ledVar == null) {
                yks.c("authenticationHelper");
                ledVar = null;
            }
            ledVar.e(this);
            led ledVar2 = this.O;
            if (ledVar2 == null) {
                yks.c("authenticationHelper");
                ledVar2 = null;
            }
            ledVar2.ea(this);
        }
        int i4 = 3;
        if (v().a()) {
            AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar_expressive);
            appBarLayout.setVisibility(0);
            J(appBarLayout);
            this.k = (MaterialToolbar) findViewById(R.id.toolbar_expressive);
            this.i = false;
            this.j = false;
            Drawable drawable = getDrawable(R.drawable.gs_more_vert_vd_theme_24);
            drawable.getClass();
            drawable.setTint(-16777216);
            Drawable drawable2 = getDrawable(R.drawable.circle_shape);
            drawable2.getClass();
            Drawable drawable3 = getDrawable(R.drawable.circle_shape);
            drawable3.getClass();
            Drawable drawable4 = getDrawable(R.drawable.oval_shape);
            drawable4.getClass();
            ImageButton imageButton = (ImageButton) findViewById(R.id.expressive_back_button);
            imageButton.setColorFilter(-16777216);
            imageButton.setBackground(drawable2);
            imageButton.setOnClickListener(new jyr(this, i));
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.expressive_share_button);
            imageButton2.setColorFilter(-16777216);
            imageButton2.setBackground(drawable3);
            imageButton2.setOnClickListener(new jyr(this, i4));
            MaterialToolbar materialToolbar = this.k;
            if (materialToolbar != null && materialToolbar.getOverflowIcon() != null) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable4, drawable});
                layerDrawable.setLayerGravity(1, 17);
                MaterialToolbar materialToolbar2 = this.k;
                materialToolbar2.getClass();
                materialToolbar2.setOverflowIcon(layerDrawable);
            }
            ykr.q(dvb.d(this), null, 0, new ajo(this, drawable2, drawable3, drawable4, (yih) null, 16), 3);
        } else {
            AppBarLayout appBarLayout2 = (AppBarLayout) findViewById(R.id.appBar);
            appBarLayout2.setVisibility(0);
            J(appBarLayout2);
        }
        this.N = (RecyclerView) findViewById(R.id.recycler_view);
        View viewFindViewById = findViewById(R.id.entity_page_layout);
        viewFindViewById.getClass();
        this.F = viewFindViewById;
        if (v().a()) {
            ykr.q(dvb.d(this), null, 0, new jbb(this, (yih) null, 14), 3);
        }
        View viewFindViewById2 = findViewById(R.id.stream_view);
        viewFindViewById2.getClass();
        this.G = viewFindViewById2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.status_bar_background);
        frameLayout.getClass();
        this.H = frameLayout;
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = (MediaDeviceFloatingActionButton) findViewById(R.id.media_device_fab);
        if (mediaDeviceFloatingActionButton != null) {
            C(mediaDeviceFloatingActionButton);
        } else {
            mediaDeviceFloatingActionButton = null;
        }
        this.M = mediaDeviceFloatingActionButton;
        p(N().e());
        q();
        r();
        mta mtaVar = this.I;
        if (mtaVar == null) {
            yks.c("pinHelper");
            mtaVar = null;
        }
        mtaVar.d(this, ((ldy) m()).a(), z());
        this.P = new jaa();
        jzg jzgVarF = N().f();
        jaa jaaVar2 = this.P;
        if (jaaVar2 == null) {
            yks.c("appInstallBroadcastReceiver");
        } else {
            jaaVar = jaaVar2;
        }
        jaaVar.getClass();
        jzgVarF.f(jef.h, jaaVar);
        if (getSupportFragmentManager().f(TRAILER_PLAYER_FRAGMENT_TAG) != null) {
            findViewById(R.id.player_container).bringToFront();
            o().bringToFront();
        }
        sfy.q(this, new jyu(this, i3));
        if (y().cG()) {
            hke hkeVarB = hjr.d(this).c(this).b();
            wkx wkxVar = N().e().e;
            if (wkxVar == null) {
                wkxVar = wkx.a;
            }
            vvd vvdVar = wse.g;
            wkxVar.i(vvdVar);
            Object objK = wkxVar.l.k((vub) vvdVar.c);
            if (objK == null) {
                objK = vvdVar.b;
            } else {
                vvdVar.c(objK);
            }
            wlx wlxVar = ((wse) objK).c;
            if (wlxVar == null) {
                wlxVar = wlx.a;
            }
            hkeVarB.f(wlxVar).l(new jyx(this));
        }
        View viewFindViewById3 = findViewById(android.R.id.content);
        viewFindViewById3.getClass();
        this.K.a = new kiy(this, viewFindViewById3, new jyu(this, i2));
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        jaa jaaVar = null;
        if (B().a()) {
            jlw jlwVar = this.B;
            if (jlwVar == null) {
                yks.c("titlePresenter");
                jlwVar = null;
            }
            jlwVar.e();
        }
        try {
            jaa jaaVar2 = this.P;
            if (jaaVar2 == null) {
                yks.c("appInstallBroadcastReceiver");
            } else {
                jaaVar = jaaVar2;
            }
            unregisterReceiver(jaaVar);
        } catch (Exception unused) {
            krd.f("Unregistered receiver that doesn't exist");
        }
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        ConcurrentHashMap concurrentHashMap = opz.a;
        osk.l(this, intent);
    }

    @Override // defpackage.jxm, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getOnBackPressedDispatcher().c();
            return true;
        }
        if (itemId != R.id.base_menu_help_and_feedback) {
            return super.onOptionsItemSelected(menuItem);
        }
        s();
        return true;
    }

    @Override // defpackage.jxm, defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = this.M;
        if (mediaDeviceFloatingActionButton != null) {
            x().g(mediaDeviceFloatingActionButton, yhb.a);
        }
        N().g.c(false);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        menu.findItem(R.id.base_menu_search).setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.jxm, defpackage.jxs, defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (!hju.u(N().b())) {
            iof iofVar = this.x;
            if (iofVar == null) {
                yks.c("watchActionStore");
                iofVar = null;
            }
            iofVar.f(N().b());
        }
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = this.M;
        if (mediaDeviceFloatingActionButton != null) {
            x().a(mediaDeviceFloatingActionButton, jbr.E(166395, null), yhc.a);
        }
    }

    @Override // defpackage.jxm
    public final void s() {
        lhp lhpVar = new lhp("", "mobile_movie_object", "");
        wll wllVarB = N().b();
        lhpVar.b = wllVarB.b == 1 ? (String) wllVarB.c : "";
        wni wniVarC = N().c();
        if (wniVarC != null) {
            lhpVar.a = wniVarC.b;
        }
        lhr lhrVar = this.y;
        if (lhrVar == null) {
            yks.c("gmsHelpUtil");
            lhrVar = null;
        }
        lhrVar.d(this, lhpVar);
    }

    @Override // defpackage.iej
    public final void dM() {
    }

    @Override // defpackage.ldu
    public final void I(ieg iegVar) {
    }

    @Override // defpackage.ldu
    public final void H(ieg iegVar, Exception exc) {
    }
}

package com.google.android.apps.googletv.app.presentation.pages.home;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.apps.googletv.app.presentation.pages.launcher.GtvLauncherActivity;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableExtensionsKt;
import com.google.common.collect.ImmutableList;
import defpackage.aafi;
import defpackage.aiy;
import defpackage.bne;
import defpackage.by;
import defpackage.cdr;
import defpackage.cr;
import defpackage.cse;
import defpackage.csr;
import defpackage.ctk;
import defpackage.cwk;
import defpackage.cww;
import defpackage.cyh;
import defpackage.czi;
import defpackage.dvb;
import defpackage.dvk;
import defpackage.gmd;
import defpackage.hju;
import defpackage.icy;
import defpackage.idr;
import defpackage.idy;
import defpackage.idz;
import defpackage.iea;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.iej;
import defpackage.igs;
import defpackage.igu;
import defpackage.igv;
import defpackage.ihf;
import defpackage.iht;
import defpackage.ihx;
import defpackage.ihz;
import defpackage.imw;
import defpackage.ioc;
import defpackage.ioi;
import defpackage.iop;
import defpackage.irc;
import defpackage.isi;
import defpackage.iuy;
import defpackage.ivt;
import defpackage.iys;
import defpackage.jan;
import defpackage.jbb;
import defpackage.jbr;
import defpackage.jeh;
import defpackage.jlr;
import defpackage.jwq;
import defpackage.jxn;
import defpackage.jxo;
import defpackage.jxp;
import defpackage.jxs;
import defpackage.jyr;
import defpackage.jyu;
import defpackage.jzm;
import defpackage.kab;
import defpackage.kaf;
import defpackage.kai;
import defpackage.kaj;
import defpackage.kak;
import defpackage.kej;
import defpackage.kek;
import defpackage.kiw;
import defpackage.kix;
import defpackage.kiz;
import defpackage.kjc;
import defpackage.kka;
import defpackage.kmo;
import defpackage.krd;
import defpackage.ksn;
import defpackage.kwy;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.ldz;
import defpackage.led;
import defpackage.lfn;
import defpackage.lhr;
import defpackage.lie;
import defpackage.lif;
import defpackage.lin;
import defpackage.lys;
import defpackage.mjc;
import defpackage.mjo;
import defpackage.mos;
import defpackage.mot;
import defpackage.mta;
import defpackage.mtr;
import defpackage.nay;
import defpackage.nqq;
import defpackage.opz;
import defpackage.osk;
import defpackage.pil;
import defpackage.pim;
import defpackage.pke;
import defpackage.pkg;
import defpackage.pqi;
import defpackage.qoi;
import defpackage.qub;
import defpackage.qun;
import defpackage.quy;
import defpackage.qwb;
import defpackage.qwm;
import defpackage.qwn;
import defpackage.qwo;
import defpackage.qwu;
import defpackage.qwv;
import defpackage.qww;
import defpackage.qxa;
import defpackage.qxn;
import defpackage.qyb;
import defpackage.qyn;
import defpackage.rbi;
import defpackage.rdd;
import defpackage.rez;
import defpackage.rfa;
import defpackage.rfc;
import defpackage.rfd;
import defpackage.rfe;
import defpackage.rff;
import defpackage.rfg;
import defpackage.rfh;
import defpackage.rfi;
import defpackage.rfl;
import defpackage.rfm;
import defpackage.rfo;
import defpackage.rfp;
import defpackage.rfu;
import defpackage.rga;
import defpackage.rgb;
import defpackage.rgn;
import defpackage.rjg;
import defpackage.rrx;
import defpackage.rtx;
import defpackage.rzg;
import defpackage.sij;
import defpackage.sip;
import defpackage.sjl;
import defpackage.swh;
import defpackage.swj;
import defpackage.tbb;
import defpackage.tel;
import defpackage.teo;
import defpackage.tst;
import defpackage.uhp;
import defpackage.ulp;
import defpackage.ulq;
import defpackage.vtw;
import defpackage.vun;
import defpackage.vvd;
import defpackage.vvt;
import defpackage.vwe;
import defpackage.wbb;
import defpackage.wfo;
import defpackage.wlf;
import defpackage.wlg;
import defpackage.xij;
import defpackage.xja;
import defpackage.xjt;
import defpackage.xka;
import defpackage.xke;
import defpackage.xms;
import defpackage.xnl;
import defpackage.xwk;
import defpackage.xzg;
import defpackage.yfm;
import defpackage.yft;
import defpackage.yga;
import defpackage.ygi;
import defpackage.yhb;
import defpackage.yhc;
import defpackage.yih;
import defpackage.yjv;
import defpackage.ykr;
import defpackage.yks;
import defpackage.ylh;
import defpackage.yoz;
import defpackage.yyh;
import defpackage.zft;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GtvHomePageActivity extends jxs implements kek, swh, kiw, kka, igs, iej, jeh, ivt, pim, ldz, idy, jxo {
    public static final kaf Companion = new kaf();
    private static final int S = Color.parseColor("#ff1e1f20");
    private static final int T = Color.parseColor("#ff131314");
    private static final boolean U = true;
    private static final String V = "android.permission.POST_NOTIFICATIONS";
    public xij A;
    public xja B;
    public mtr C;
    public ieg D;
    public wlg E;
    public iop F;
    public lys G;
    public igv H;
    public isi I;
    public ioi J;
    public irc K;
    public mjc L;
    public nqq M;
    public jwq N;
    public rbi O;
    public irc P;
    public mta Q;
    private final /* synthetic */ kix W = new kix();
    private gmd X;
    private ProgressBar Y;
    private swj Z;
    public ldv a;
    private ViewPager2 aa;
    private AppBarLayout ab;
    private kai ac;
    private View ad;
    private FrameLayout ae;
    private kej af;
    private ImageButton ag;
    private led ah;
    private Toolbar ai;
    private String aj;
    private String ak;
    private MediaDeviceFloatingActionButton al;
    private final idr am;
    private boolean an;
    private boolean ao;
    private final yft ap;
    private final yft aq;
    private int ar;
    public ieh b;
    public qwn c;
    public rgn d;
    public lhr e;
    public pke f;
    public pkg g;
    public SharedPreferences h;
    public xms i;
    public xke j;
    public iys k;
    public kmo l;
    public xjt m;
    public kjc w;
    public tbb x;
    public idy y;
    public iea z;

    /* renamed from: $r8$lambda$5lNkpJZU4W0YRxjWSC-w_ieFXWQ, reason: not valid java name */
    public static /* synthetic */ jxp m116$r8$lambda$5lNkpJZU4W0YRxjWSCw_ieFXWQ(GtvHomePageActivity gtvHomePageActivity) {
        AppBarLayout appBarLayout = gtvHomePageActivity.ab;
        if (appBarLayout == null) {
            yks.c("appBarLayout");
            appBarLayout = null;
        }
        return new jxp(appBarLayout, gtvHomePageActivity);
    }

    public static /* synthetic */ void $r8$lambda$BjySdHRcJT9lHQd3gpOUHW2P3ys(yjv yjvVar, Object obj) {
        obj.getClass();
        yjvVar.a(obj);
    }

    public static /* synthetic */ void $r8$lambda$FGdta_y9b1mhFuCy0RfOtU0_kAY(GtvHomePageActivity gtvHomePageActivity, View view) {
        igv igvVarJ = gtvHomePageActivity.J();
        ioc iocVar = igvVarJ.d.i.g;
        if (iocVar == null) {
            iocVar = ioc.a;
        }
        iocVar.getClass();
        lie lieVar = igvVarJ.a;
        int i = iocVar.d;
        int i2 = iocVar.f;
        vwe vweVar = iocVar.c;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        lieVar.aA(i, i2, vweVar, 2, 4, 0);
        aafi aafiVar = igvVarJ.e;
        Object obj = aafiVar.c;
        Object obj2 = aafiVar.b;
        String packageName = ((Context) obj).getPackageName();
        teo teoVar = (teo) obj2;
        if (teoVar.a == null) {
            teo.c();
        } else {
            kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
            teoVar.a.e(new tel(teoVar, kwyVar, kwyVar, packageName), kwyVar);
        }
    }

    public static /* synthetic */ void $r8$lambda$HOG4BiUCz9Fz3OnodttnSy6tOv4(Exception exc) {
        exc.getClass();
        krd.d("getDynamicLink:onFailure", exc);
    }

    public static /* synthetic */ cyh $r8$lambda$LmMcRNqoJOJLwOIUUSxV1eozcPo(GtvHomePageActivity gtvHomePageActivity, View view, cyh cyhVar) {
        ihz.P(view, cyhVar.f(519).c);
        return cyhVar;
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool $r8$lambda$UknsBT1q6U9LN8g2KpYBVwRXy5s() {
        return new RecyclerView.RecycledViewPool();
    }

    /* renamed from: $r8$lambda$XA_qyIVnSobjiMbn-L980itp_CA, reason: not valid java name */
    public static /* synthetic */ String m118$r8$lambda$XA_qyIVnSobjiMbnL980itp_CA(GtvHomePageActivity gtvHomePageActivity) {
        kai kaiVar = gtvHomePageActivity.ac;
        if (kaiVar == null) {
            yks.c("viewModel");
            kaiVar = null;
        }
        kab kabVar = (kab) kaiVar.c.get(Integer.valueOf(kaiVar.a));
        return kabVar != null ? kabVar.a : "mobile_movies_default";
    }

    /* renamed from: $r8$lambda$YQJtWovTiqEsES-67p8Rmyq2lRw, reason: not valid java name */
    public static /* synthetic */ ygi m119$r8$lambda$YQJtWovTiqEsES67p8Rmyq2lRw(GtvHomePageActivity gtvHomePageActivity, wlg wlgVar) {
        wlgVar.getClass();
        gtvHomePageActivity.Y(wlgVar);
        return ygi.a;
    }

    public static /* synthetic */ boolean $r8$lambda$fqTPoWgAjMvtK1TCZ7LrUMRIdt0(GtvHomePageActivity gtvHomePageActivity, wlf wlfVar, MenuItem menuItem) {
        menuItem.getClass();
        swj swjVar = gtvHomePageActivity.Z;
        if (swjVar == null) {
            yks.c("navigationBarView");
            swjVar = null;
        }
        swjVar.i(menuItem.getItemId());
        ykr.q(dvb.d(gtvHomePageActivity), null, 0, new imw(gtvHomePageActivity, wlfVar, (yih) null, 20), 3);
        menuItem.setOnMenuItemClickListener(null);
        return false;
    }

    /* renamed from: $r8$lambda$gti0KX-PSZtQw9mCL2uTIwOK6To, reason: not valid java name */
    public static /* synthetic */ void m120$r8$lambda$gti0KXPSZtQw9mCL2uTIwOK6To(GtvHomePageActivity gtvHomePageActivity, mos mosVar) {
        swj swjVar = gtvHomePageActivity.Z;
        if (swjVar == null) {
            yks.c("navigationBarView");
            swjVar = null;
        }
        swjVar.o(0);
    }

    public static /* synthetic */ cyh $r8$lambda$kcXmvvJhfKMnm8isSoHX_P2l8WM(GtvHomePageActivity gtvHomePageActivity, View view, cyh cyhVar) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        csr csrVarF = cyhVar.f(519);
        int i = csrVarF.b;
        if (i > 0) {
            paddingLeft = i;
        }
        int i2 = csrVarF.d;
        if (i2 > 0) {
            paddingRight = i2;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, view.getPaddingBottom());
        return cyhVar;
    }

    public static /* synthetic */ void $r8$lambda$lu4qoCJbCISzjA3NMIH8j1dNF9g(GtvHomePageActivity gtvHomePageActivity, ulp ulpVar) {
        if (ulpVar != null) {
            String str = ((ulq) ulpVar.a).b;
            Uri uri = str != null ? Uri.parse(str) : null;
            if (uri == null) {
                return;
            }
            ykr.q(yoz.m(), null, 0, new imw(gtvHomePageActivity, uri, (yih) null, 19), 3);
        }
    }

    public static /* synthetic */ void $r8$lambda$qPTCPOBrel_c45fiuhjYARodMKg(GtvHomePageActivity gtvHomePageActivity, mot motVar) {
        swj swjVar = gtvHomePageActivity.Z;
        if (swjVar == null) {
            yks.c("navigationBarView");
            swjVar = null;
        }
        swjVar.o(0);
    }

    public static /* synthetic */ void $r8$lambda$sKNn9WDi35pRTej8XCaqMAlVbUE(GtvHomePageActivity gtvHomePageActivity) {
        Object objA = gtvHomePageActivity.am.a();
        objA.getClass();
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        AppBarLayout appBarLayout = gtvHomePageActivity.ab;
        if (appBarLayout == null) {
            yks.c("appBarLayout");
            appBarLayout = null;
        }
        Drawable background = appBarLayout.getBackground();
        TransitionDrawable transitionDrawable = background instanceof TransitionDrawable ? (TransitionDrawable) background : null;
        if (transitionDrawable == null) {
            return;
        }
        if (zBooleanValue) {
            if (gtvHomePageActivity.an) {
                return;
            }
            transitionDrawable.reverseTransition(500);
            gtvHomePageActivity.an = true;
            return;
        }
        if (gtvHomePageActivity.an) {
            transitionDrawable.startTransition(0);
            gtvHomePageActivity.an = false;
        }
    }

    public GtvHomePageActivity() {
        wlg wlgVar = wlg.a;
        wlgVar.getClass();
        this.E = wlgVar;
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        this.ak = languageTag;
        this.ar = 3;
        this.am = new idz(true);
        this.an = true;
        rtx.a.c();
        this.ap = new yga(new jzm(2));
        this.aq = new yga(new jyu(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2 A[Catch: Exception -> 0x0205, TryCatch #1 {Exception -> 0x0205, blocks: (B:10:0x0049, B:12:0x0051, B:13:0x006e, B:15:0x0074, B:20:0x0097, B:22:0x00a1, B:24:0x00d0, B:26:0x00d6, B:29:0x00db, B:34:0x00e4, B:36:0x00ea, B:39:0x00f2, B:41:0x00ff, B:40:0x00fb, B:42:0x0101, B:44:0x0109, B:59:0x017a, B:70:0x01af, B:72:0x01bd, B:73:0x01c3, B:74:0x01cc, B:76:0x01ce, B:78:0x01dc, B:79:0x01e5, B:80:0x01e6, B:81:0x01eb, B:82:0x01ec, B:85:0x01fb, B:86:0x0204, B:45:0x011d, B:47:0x0121, B:49:0x0133, B:51:0x013d, B:52:0x0143, B:54:0x0149, B:56:0x0157, B:57:0x0160, B:58:0x016b, B:19:0x0092, B:17:0x0089, B:60:0x017d, B:62:0x0188, B:63:0x018d, B:65:0x0193, B:67:0x019d, B:68:0x01a1, B:69:0x01a8), top: B:89:0x0049, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb A[Catch: Exception -> 0x0205, TryCatch #1 {Exception -> 0x0205, blocks: (B:10:0x0049, B:12:0x0051, B:13:0x006e, B:15:0x0074, B:20:0x0097, B:22:0x00a1, B:24:0x00d0, B:26:0x00d6, B:29:0x00db, B:34:0x00e4, B:36:0x00ea, B:39:0x00f2, B:41:0x00ff, B:40:0x00fb, B:42:0x0101, B:44:0x0109, B:59:0x017a, B:70:0x01af, B:72:0x01bd, B:73:0x01c3, B:74:0x01cc, B:76:0x01ce, B:78:0x01dc, B:79:0x01e5, B:80:0x01e6, B:81:0x01eb, B:82:0x01ec, B:85:0x01fb, B:86:0x0204, B:45:0x011d, B:47:0x0121, B:49:0x0133, B:51:0x013d, B:52:0x0143, B:54:0x0149, B:56:0x0157, B:57:0x0160, B:58:0x016b, B:19:0x0092, B:17:0x0089, B:60:0x017d, B:62:0x0188, B:63:0x018d, B:65:0x0193, B:67:0x019d, B:68:0x01a1, B:69:0x01a8), top: B:89:0x0049, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void R(defpackage.wlf r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity.R(wlf, int, int):void");
    }

    private final void S() {
        String stringExtra = getIntent().getStringExtra("destination_id");
        if (stringExtra == null || ylh.L(stringExtra)) {
            stringExtra = this.aj;
        }
        this.aj = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        String str = this.aj;
        str.getClass();
        cse.c(this, str);
    }

    private final void T() {
        ProgressBar progressBar = this.Y;
        if (progressBar == null) {
            yks.c("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        ykr.q(yoz.m(), null, 0, new jbb(this, (yih) null, 15), 3);
    }

    private final void U() {
        if (yks.e(this.E, wlg.a)) {
            T();
            return;
        }
        V();
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        if (yks.e(languageTag, this.ak)) {
            return;
        }
        this.ak = languageTag;
        T();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void V() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity.V():void");
    }

    private final void W(AppBarLayout appBarLayout) {
        View view;
        TextView textView;
        FrameLayout frameLayout = null;
        if (this.ao) {
            this.ai = (Toolbar) findViewById(R.id.material_toolbar_immersive);
            this.ag = (ImageButton) findViewById(R.id.search_button);
            if (v().b()) {
                ykr.q(dvb.d(this), null, 0, new jbb(this, (yih) null, 16, (byte[]) null), 3);
            }
            ImageButton imageButton = this.ag;
            if (imageButton == null) {
                yks.c("searchButton");
                imageButton = null;
            }
            imageButton.setOnClickListener(new jyr(this, 8));
        } else {
            Toolbar toolbar = (Toolbar) findViewById(R.id.material_toolbar);
            this.ai = toolbar;
            OpenSearchBar openSearchBar = toolbar instanceof OpenSearchBar ? (OpenSearchBar) toolbar : null;
            if (openSearchBar != null && (view = openSearchBar.e) != null) {
                view.setAlpha(1.0f);
            }
            Toolbar toolbar2 = this.ai;
            if (toolbar2 != null) {
                toolbar2.setOnClickListener(new jyr(this, 9));
            }
        }
        if (ctk.c()) {
            try {
                Toolbar toolbar3 = this.ai;
                if (toolbar3 != null) {
                    toolbar3.setHandwritingDelegatorCallback(new jlr(this, 6));
                }
            } catch (LinkageError unused) {
            }
        }
        setSupportActionBar(this.ai);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        appBarLayout.bringToFront();
        if (this.ao) {
            FrameLayout frameLayout2 = this.ae;
            if (frameLayout2 == null) {
                yks.c("statusBarBackgroundView");
            } else {
                frameLayout = frameLayout2;
            }
            appBarLayout.h(new jxn(frameLayout, this.am));
            return;
        }
        Toolbar toolbar4 = this.ai;
        if (toolbar4 == null || (textView = (TextView) toolbar4.findViewById(R.id.toolbar_title)) == null) {
            return;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getContext().getDrawable(R.drawable.ic_gtv_logo_header), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText((CharSequence) null);
        textView.setContentDescription(getString(R.string.gtv_application_name));
        textView.setVisibility(0);
    }

    private final void X() {
        vun vunVar = this.E.b;
        vunVar.getClass();
        Iterator<E> it = vunVar.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (yks.e(((wlf) it.next()).e, this.aj)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            kai kaiVar = this.ac;
            swj swjVar = null;
            if (kaiVar == null) {
                yks.c("viewModel");
                kaiVar = null;
            }
            kaiVar.a = i;
            H(i);
            ViewPager2 viewPager2 = this.aa;
            if (viewPager2 == null) {
                yks.c("viewPager");
                viewPager2 = null;
            }
            viewPager2.e(i);
            swj swjVar2 = this.Z;
            if (swjVar2 == null) {
                yks.c("navigationBarView");
            } else {
                swjVar = swjVar2;
            }
            swjVar.o(i);
        }
    }

    private final void Y(wlg wlgVar) {
        wlg wlgVarU;
        xjt xjtVar = this.m;
        kai kaiVar = null;
        if (xjtVar == null) {
            yks.c("hotAndNewFeatureFlags");
            xjtVar = null;
        }
        if (xjtVar.a()) {
            wlgVarU = wlgVar;
        } else {
            vtw vtwVar = (vtw) wlgVar.a(5, null);
            vtwVar.x(wlgVar);
            vtwVar.getClass();
            vun vunVar = wlgVar.b;
            vunVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : vunVar) {
                if (!yks.e(((wlf) obj).e, "hot-and-new")) {
                    arrayList.add(obj);
                }
            }
            DesugarCollections.unmodifiableList(((wlg) vtwVar.b).b).getClass();
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            ((wlg) vtwVar.b).b = vvt.a;
            DesugarCollections.unmodifiableList(((wlg) vtwVar.b).b).getClass();
            vtwVar.aJ(arrayList);
            wlgVarU = wbb.u(vtwVar);
        }
        this.E = wlgVarU;
        String str = wlgVar.d;
        str.getClass();
        if (ylh.L(str)) {
            return;
        }
        vun vunVar2 = wlgVar.b;
        vunVar2.getClass();
        Iterator<E> it = vunVar2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (yks.e(((wlf) it.next()).e, wlgVar.d)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            kai kaiVar2 = this.ac;
            if (kaiVar2 == null) {
                yks.c("viewModel");
            } else {
                kaiVar = kaiVar2;
            }
            kaiVar.a = i;
            H(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(int i, lin linVar, String str, String str2) {
        lif lifVar = new lif(408, linVar);
        kai kaiVar = this.ac;
        if (kaiVar == null) {
            yks.c("viewModel");
            kaiVar = null;
        }
        kaiVar.c.put(Integer.valueOf(i), new kab(lifVar, str, str2));
    }

    public static final /* synthetic */ void access$processResponse(GtvHomePageActivity gtvHomePageActivity, ihz ihzVar) {
        ProgressBar progressBar = gtvHomePageActivity.Y;
        ViewPager2 viewPager2 = null;
        if (progressBar == null) {
            yks.c("loadingProgressBar");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        if (!(ihzVar instanceof ihx)) {
            if (ihzVar instanceof iht) {
                gtvHomePageActivity.Y((wlg) ((iht) ihzVar).a);
                gtvHomePageActivity.V();
                return;
            }
            return;
        }
        ProgressBar progressBar2 = gtvHomePageActivity.Y;
        if (progressBar2 == null) {
            yks.c("loadingProgressBar");
            progressBar2 = null;
        }
        progressBar2.setVisibility(0);
        swj swjVar = gtvHomePageActivity.Z;
        if (swjVar == null) {
            yks.c("navigationBarView");
            swjVar = null;
        }
        swjVar.a.clear();
        ViewPager2 viewPager22 = gtvHomePageActivity.aa;
        if (viewPager22 == null) {
            yks.c("viewPager");
        } else {
            viewPager2 = viewPager22;
        }
        viewPager2.setVisibility(8);
    }

    public final void F(ieg iegVar) {
        iegVar.getClass();
        this.D = iegVar;
    }

    @Override // defpackage.ldz
    public final void G() {
        final led ledVar = new led(this, p(), new icy(((ldy) k()).a()));
        this.ah = ledVar;
        AccountManager.get(this).addAccount("com.google", null, null, null, this, new AccountManagerCallback() { // from class: lec
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                led ledVar2 = ledVar;
                try {
                    Bundle bundle = (Bundle) accountManagerFuture.getResult();
                    if (bundle == null) {
                        krd.c("Got null result");
                        return;
                    }
                    String string = bundle.getString("authAccount");
                    if (string == null) {
                        krd.c("Got null account name");
                    } else {
                        ledVar2.a.p(ksn.b(string));
                    }
                } catch (Exception unused) {
                    krd.c("Failed to add new account");
                }
            }
        }, null);
    }

    public final void H(int i) {
        vun vunVar = this.E.b;
        vunVar.getClass();
        wlf wlfVar = (wlf) yfm.V(vunVar, i);
        if (wlfVar != null) {
            kai kaiVar = this.ac;
            if (kaiVar == null) {
                yks.c("viewModel");
                kaiVar = null;
            }
            kaiVar.b = wlfVar.e;
            if (v().b()) {
                I();
            }
        }
    }

    public final void I() {
        ImageButton imageButton = this.ag;
        if (imageButton == null) {
            return;
        }
        imageButton.setColorFilter(-16777216);
        Drawable drawable = getDrawable(R.drawable.search_button_bc25_bg);
        drawable.getClass();
        kai kaiVar = this.ac;
        ImageButton imageButton2 = null;
        if (kaiVar == null) {
            yks.c("viewModel");
            kaiVar = null;
        }
        wfo wfoVar = yks.e(kaiVar.b, "for-you") ? (wfo) ((kiz) n()).a.d() : ihf.a;
        drawable.setTint(wfoVar.j());
        ImageButton imageButton3 = this.ag;
        if (imageButton3 == null) {
            yks.c("searchButton");
            imageButton3 = null;
        }
        imageButton3.setBackground(drawable);
        ImageButton imageButton4 = this.ag;
        if (imageButton4 == null) {
            yks.c("searchButton");
        } else {
            imageButton2 = imageButton4;
        }
        imageButton2.setColorFilter(wfoVar.d());
    }

    public final igv J() {
        igv igvVar = this.H;
        if (igvVar != null) {
            return igvVar;
        }
        yks.c("appUpdater");
        return null;
    }

    @Override // defpackage.kiw
    public final void K(int i) {
        this.W.K(i);
    }

    @Override // defpackage.kiw
    public final void L(String str) {
        this.W.L(str);
    }

    @Override // defpackage.kiw
    public final void M(int i, int i2, View.OnClickListener onClickListener) {
        this.W.M(i, i2, onClickListener);
    }

    public final iop N() {
        iop iopVar = this.F;
        if (iopVar != null) {
            return iopVar;
        }
        yks.c("destinationStore");
        return null;
    }

    public final isi O() {
        isi isiVar = this.I;
        if (isiVar != null) {
            return isiVar;
        }
        yks.c("userSettingsStore");
        return null;
    }

    public final mjc P() {
        mjc mjcVar = this.L;
        if (mjcVar != null) {
            return mjcVar;
        }
        yks.c("rootActivityRootUiElements");
        return null;
    }

    @Override // defpackage.igs
    public final void a(int i) {
        igv igvVarJ = J();
        igvVarJ.e.n().q(new igu(new aiy(i, igvVarJ, this, 7), 0));
    }

    @Override // defpackage.igs
    public final void b() {
        tbb tbbVar = this.x;
        if (tbbVar == null) {
            yks.c("appUpdateProgress");
            tbbVar = null;
        }
        tbbVar.e();
    }

    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        ((ieg) obj).getClass();
    }

    @Override // defpackage.pim
    public final /* synthetic */ uhp d(String str) {
        return rdd.ae(str);
    }

    @Override // defpackage.iej
    public final void dM() {
        int iA = q().a();
        if (iA == 5) {
            finish();
            return;
        }
        if (iA != 2 && iA != 1 && iA != 8 && iA != 6 && l().k()) {
            q().c();
        }
        invalidateOptionsMenu();
        if (l().l() && ((ldy) k()).a().m()) {
            F(((ldy) k()).a());
            U();
        }
    }

    @Override // defpackage.swh
    public final boolean dT(MenuItem menuItem) {
        menuItem.getClass();
        swj swjVar = this.Z;
        AppBarLayout appBarLayout = null;
        if (swjVar == null) {
            yks.c("navigationBarView");
            swjVar = null;
        }
        if (swjVar.e() == menuItem.getItemId()) {
            return false;
        }
        ViewPager2 viewPager2 = this.aa;
        if (viewPager2 == null) {
            yks.c("viewPager");
            viewPager2 = null;
        }
        viewPager2.f(menuItem.getItemId(), false);
        kai kaiVar = this.ac;
        if (kaiVar == null) {
            yks.c("viewModel");
            kaiVar = null;
        }
        kaiVar.a = menuItem.getItemId();
        H(menuItem.getItemId());
        AppBarLayout appBarLayout2 = this.ab;
        if (appBarLayout2 == null) {
            yks.c("appBarLayout");
        } else {
            appBarLayout = appBarLayout2;
        }
        appBarLayout.k(true, true);
        return true;
    }

    @Override // defpackage.pim
    public final rzg dU(pil pilVar) {
        int i = pilVar.a;
        if (i != 0 && i - 1 == 5) {
            return new rzg(true, this.ar, 1);
        }
        kai kaiVar = this.ac;
        kai kaiVar2 = null;
        if (kaiVar == null) {
            yks.c("viewModel");
            kaiVar = null;
        }
        if (kaiVar.d) {
            return new rzg(false, 1, 2);
        }
        kai kaiVar3 = this.ac;
        if (kaiVar3 == null) {
            yks.c("viewModel");
        } else {
            kaiVar2 = kaiVar3;
        }
        kaiVar2.d = true;
        return new rzg(true, this.ar, 1);
    }

    @Override // defpackage.igs
    public final void e() {
        tbb tbbVar = this.x;
        if (tbbVar == null) {
            yks.c("appUpdateProgress");
            tbbVar = null;
        }
        tbbVar.r(R.string.app_update_failed);
        tbbVar.o(R.string.dismiss, new jyr(tbbVar, 6));
        tbbVar.h();
    }

    @Override // defpackage.jxs, defpackage.ivt
    public final void f(boolean z) {
        Window window = getWindow();
        int i = 0;
        if (window != null) {
            window.setStatusBarColor(this.ao ? 0 : (z && y().cJ()) ? getColor(R.color.status_light) : z ? getColor(R.color.status_dark) : sip.d(this, android.R.attr.statusBarColor, 0));
        }
        swj swjVar = this.Z;
        if (swjVar == null) {
            return;
        }
        if ((swjVar instanceof BottomNavigationView) && z) {
            i = 8;
        }
        swjVar.setVisibility(i);
    }

    @Override // defpackage.jeh
    public final RecyclerView.RecycledViewPool g() {
        return (RecyclerView.RecycledViewPool) this.ap.a();
    }

    @Override // defpackage.jxo
    public final RecyclerView.OnScrollListener h() {
        return (RecyclerView.OnScrollListener) this.aq.a();
    }

    @Override // defpackage.jxo
    public final void i(boolean z) {
        this.am.c(Boolean.valueOf(z));
    }

    public final Intent j(Bundle bundle) {
        if (yks.e(bundle != null ? bundle.getString("DEEPLINK_DESTINATION") : null, GtvLauncherActivity.GTV_APP_VIRTUAL_REMOTE_DEEPLINK)) {
            return jbr.U(this, new Intent());
        }
        return null;
    }

    public final iea k() {
        iea ieaVar = this.z;
        if (ieaVar != null) {
            return ieaVar;
        }
        yks.c("accountRepository");
        return null;
    }

    public final ieg l() {
        ieg iegVar = this.D;
        if (iegVar != null) {
            return iegVar;
        }
        yks.c("selectedAccount");
        return null;
    }

    public final iys m() {
        iys iysVar = this.k;
        if (iysVar != null) {
            return iysVar;
        }
        yks.c("growthKitManager");
        return null;
    }

    public final kjc n() {
        kjc kjcVar = this.w;
        if (kjcVar != null) {
            return kjcVar;
        }
        yks.c("dynamicColorViewModel");
        return null;
    }

    public final kmo o() {
        kmo kmoVar = this.l;
        if (kmoVar != null) {
            return kmoVar;
        }
        yks.c("sherlogFeedbackManager");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // defpackage.by, defpackage.fl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            super.onActivityResult(r11, r12, r13)
            igv r0 = r10.J()
            r1 = 1010(0x3f2, float:1.415E-42)
            r2 = 0
            if (r11 == r1) goto L14
            r1 = 1011(0x3f3, float:1.417E-42)
            if (r11 == r1) goto L12
            goto L9b
        L12:
            r1 = 3
            goto L15
        L14:
            r1 = 2
        L15:
            r7 = r1
            isi r1 = r0.d
            iod r1 = r1.i
            ioc r1 = r1.g
            if (r1 != 0) goto L20
            ioc r1 = defpackage.ioc.a
        L20:
            r1.getClass()
            r3 = -1
            if (r12 == r3) goto L6b
            if (r12 == 0) goto L4c
            r3 = 1
            if (r12 == r3) goto L2d
            goto L9b
        L2d:
            java.lang.String r3 = "Installation failed"
            defpackage.krd.e(r3)
            lie r3 = r0.a
            int r4 = r1.d
            int r5 = r1.f
            vwe r1 = r1.c
            if (r1 != 0) goto L3e
            vwe r1 = defpackage.vwe.a
        L3e:
            r6 = r1
            r8 = 5
            r9 = 0
            r3.aA(r4, r5, r6, r7, r8, r9)
            igs r0 = r0.c
            if (r0 == 0) goto L9b
            r0.e()
            goto L9b
        L4c:
            java.lang.String r3 = "User cancelled installation"
            defpackage.krd.e(r3)
            lie r3 = r0.a
            int r4 = r1.d
            int r5 = r1.f
            vwe r1 = r1.c
            if (r1 != 0) goto L5d
            vwe r1 = defpackage.vwe.a
        L5d:
            r6 = r1
            r8 = 3
            r9 = 0
            r3.aA(r4, r5, r6, r7, r8, r9)
            igs r0 = r0.c
            if (r0 == 0) goto L9b
            r0.b()
            goto L9b
        L6b:
            java.lang.String r3 = "User accepted the installation"
            defpackage.krd.e(r3)
            lie r3 = r0.a
            int r4 = r1.d
            int r5 = r1.f
            vwe r1 = r1.c
            if (r1 != 0) goto L7c
            vwe r1 = defpackage.vwe.a
        L7c:
            r6 = r1
            r8 = 2
            r9 = 0
            r3.aA(r4, r5, r6, r7, r8, r9)
            igs r0 = r0.c
            if (r0 == 0) goto L9b
            com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity r0 = (com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity) r0
            tbb r0 = r0.x
            if (r0 != 0) goto L92
            java.lang.String r0 = "appUpdateProgress"
            defpackage.yks.c(r0)
            r0 = r2
        L92:
            r1 = 2132017265(0x7f140071, float:1.9672804E38)
            r0.r(r1)
            r0.h()
        L9b:
            mtr r0 = r10.q()
            r0.f(r11, r12, r13)
            led r0 = r10.ah
            if (r0 == 0) goto Lae
            boolean r11 = r0.g(r11, r12, r13)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
        Lae:
            java.util.Objects.toString(r2)
            java.lang.String r11 = java.lang.String.valueOf(r2)
            java.lang.String r12 = "Add account result was "
            java.lang.String r11 = r12.concat(r11)
            defpackage.krd.b(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, unj] */
    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [dvk, java.lang.Object] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) throws Resources.NotFoundException {
        ImmutableList immutableListOf;
        dvk dvkVar;
        dvk dvkVar2;
        menu.getClass();
        if (this.ao) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.home_toolbar_menu, menu);
        } else {
            MenuInflater menuInflater2 = getMenuInflater();
            menuInflater2.getClass();
            menuInflater2.inflate(R.menu.search_menu, menu);
            MenuInflater menuInflater3 = getMenuInflater();
            menuInflater3.getClass();
            menuInflater3.inflate(R.menu.one_google_bar_menu_item, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.voice_search_menu_item);
            if (menuItemFindItem != null) {
                cwk.g(menuItemFindItem, getResources().getString(R.string.abc_searchview_description_voice));
            }
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.selected_account_disc_item);
        menuItemFindItem2.getClass();
        if (!((ldy) k()).a().l()) {
            jyu jyuVar = new jyu(this, 19);
            lhr lhrVar = this.e;
            if (lhrVar == null) {
                yks.c("gmsHelpUtil");
                lhrVar = null;
            }
            lhrVar.getClass();
            jyr jyrVar = new jyr(this, 10);
            String string = getString(R.string.og_app_settings, getString(R.string.gtv_application_name));
            rfa rfaVarA = rfc.a();
            rfaVarA.e(R.id.og_ai_settings);
            rfaVarA.d(R.drawable.quantum_gm_ic_settings_vd_theme_24);
            rfaVarA.f(string);
            rfaVarA.h(90537);
            rfaVarA.g(jyrVar);
            rfaVarA.i(true);
            rfaVarA.b(rez.SETTINGS);
            rfc rfcVarA = rfaVarA.a();
            kaj kajVar = new kaj(lhrVar, this, jyuVar, 0);
            rfa rfaVarA2 = rfc.a();
            rfaVarA2.e(R.id.og_ai_help_and_feedback);
            rfaVarA2.d(R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
            rfaVarA2.f(getString(R.string.og_help_feedback));
            rfaVarA2.h(90538);
            rfaVarA2.g(kajVar);
            rfaVarA2.i(true);
            rfaVarA2.b(rez.HELP_AND_FEEDBACK);
            ImmutableList immutableListOf2 = ImmutableList.of(rfcVarA, rfaVarA2.a());
            immutableListOf2.getClass();
            lfn lfnVarY = y();
            ksn ksnVar = (ksn) p().a().g();
            lys lysVar = this.G;
            if (lysVar == null) {
                yks.c("configurationStore");
                lysVar = null;
            }
            lfnVarY.getClass();
            lysVar.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 11;
            if (!lfnVarY.cI()) {
                rfl rflVarB = rfm.b();
                rflVarB.b(getString(R.string.menu_manage_services));
                rflVarB.b = getDrawable(R.drawable.ic_manage_services_white);
                rflVarB.e = new jyr(this, i);
                arrayList.add(rflVarB.a());
            }
            rfl rflVarB2 = rfm.b();
            rflVarB2.b(getString(R.string.my_activity));
            rflVarB2.b = getDrawable(R.drawable.ic_my_activity);
            rflVarB2.e = new iuy(lfnVarY, this, 5);
            arrayList.add(rflVarB2.a());
            if (lfnVarY.bZ(lysVar.d(ksnVar))) {
                rfl rflVarB3 = rfm.b();
                rflVarB3.b(getString(R.string.tab_consumer_information));
                rflVarB3.b = getDrawable(R.drawable.navigation_empty_icon);
                rflVarB3.e = new iuy(lfnVarY, this, 6);
                arrayList.add(rflVarB3.a());
            }
            if (lfnVarY.ck()) {
                rfl rflVarB4 = rfm.b();
                rflVarB4.b(getString(R.string.internal_settings));
                rflVarB4.b = getDrawable(R.drawable.navigation_empty_icon);
                rflVarB4.e = new jyr(this, 12);
                arrayList.add(rflVarB4.a());
            }
            ImmutableList immutableList = ImmutableExtensionsKt.toImmutableList((Collection) yfm.ak(arrayList, 4));
            rfd rfdVar = new rfd(r().h);
            rfdVar.b(false);
            rfe rfeVarA = rfdVar.a();
            xwk xwkVar = new xwk(null, null);
            xwkVar.f(ImmutableList.of());
            sij.o(immutableList.size() <= 4, "Custom actions are limited to up to 4 items.");
            xwkVar.f(immutableList);
            Object obj = xwkVar.a;
            if (obj == null) {
                throw new IllegalStateException("Missing required properties: flavorCustomActions");
            }
            rfi rfiVar = new rfi((tst) xwkVar.b, (ImmutableList) obj, (tst) xwkVar.c);
            qwm qwmVar = new qwm(r());
            qwmVar.g = rfeVarA;
            rff rffVarA = rfg.a();
            rffVarA.b = rfiVar;
            rffVarA.b(immutableListOf2);
            rffVarA.i = new rrx();
            qwmVar.d = rffVarA.a();
            this.c = qwmVar.a();
            qwn qwnVarR = r();
            ldv ldvVarP = p();
            rbi rbiVar = this.O;
            if (rbiVar == null) {
                yks.c("discBinder");
                rbiVar = null;
            }
            qwnVarR.getClass();
            ldvVarP.getClass();
            rbiVar.getClass();
            menuItemFindItem2.setActionView(R.layout.selected_account_disc_open_search_bar);
            SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) menuItemFindItem2.getActionView().findViewById(R.id.selected_account_disc);
            selectedAccountDisc.getClass();
            yyh yyhVar = new yyh(this, qwnVarR, selectedAccountDisc, new qxn((zft) rbiVar.b, new qyn(qwnVarR)));
            if (xnl.b(qwnVarR.a)) {
                Context context = selectedAccountDisc.getContext();
                context.getClass();
                new xzg().d(context);
                selectedAccountDisc.g = null;
                selectedAccountDisc.h = null;
                rfo rfoVar = qwnVarR.e.j;
                ykr.q(yoz.m(), null, 0, new qxa(rbiVar, rdd.g(qwnVarR), (yih) null, 1), 3);
            }
            sjl.c();
            ?? r2 = yyhVar.e;
            by byVar = (by) r2;
            byVar.getSupportFragmentManager();
            Object obj2 = yyhVar.b;
            Object obj3 = yyhVar.a;
            Object obj4 = yyhVar.c;
            sjl.c();
            qwn qwnVar = (qwn) obj2;
            qww qwwVar = new qww((View) obj3, new vvd(byVar.getSupportFragmentManager(), qwnVar, byVar, (qxn) obj4), qwnVar);
            rfo rfoVar2 = qwnVar.e.j;
            tst.i(qwnVar.p);
            Object obj5 = yyhVar.d;
            qwb qwbVar = (qwb) obj5;
            qwn qwnVar2 = qwbVar.a;
            SelectedAccountDisc selectedAccountDisc2 = qwbVar.b;
            selectedAccountDisc2.e = qwnVar2;
            rjg rjgVar = qwnVar2.m;
            rjgVar.a(selectedAccountDisc2, 75245);
            AccountParticleDisc accountParticleDisc = selectedAccountDisc2.b;
            accountParticleDisc.e();
            accountParticleDisc.q();
            accountParticleDisc.f(qwnVar2.j, qwnVar2.c);
            accountParticleDisc.d(rjgVar);
            selectedAccountDisc2.getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size);
            accountParticleDisc.a();
            rfg rfgVar = qwnVar2.e;
            tst tstVar = rfgVar.b;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            rrx rrxVar = rfgVar.q;
            Context contextZ = rrx.Z(selectedAccountDisc2.getContext());
            rfp rfpVar = rfgVar.f;
            ExecutorService executorService = qwnVar2.k;
            if (accountParticleDisc.i != null) {
                immutableListOf = ImmutableList.of();
            } else {
                rfpVar.c();
                immutableListOf = ImmutableList.of();
            }
            builder.addAll((Iterable) immutableListOf);
            tst tstVar2 = rfgVar.g;
            if (tstVar2.g()) {
                rgb rgbVar = new rgb(contextZ, r2, (quy) tstVar2.c());
                ImageView imageView = selectedAccountDisc2.a;
                int height = imageView.getVisibility() == 0 ? (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom() : accountParticleDisc.l.g() ? accountParticleDisc.d.b(accountParticleDisc.a()) : accountParticleDisc.a();
                CirclePulseDrawable circlePulseDrawable = (CirclePulseDrawable) rgbVar.e.a;
                circlePulseDrawable.b = height;
                circlePulseDrawable.a();
                rgbVar.d = true;
                tst tstVar3 = rfgVar.l;
                dvkVar = r2;
                r2.getLifecycle().c(new rga(qwnVar2.b, rgbVar));
                builder.add((ImmutableList.Builder) rgbVar);
            } else {
                dvkVar = r2;
            }
            tst tstVar4 = rfgVar.h;
            if (tstVar4.g()) {
                rfh rfhVar = (rfh) tstVar4.c();
                dvkVar2 = dvkVar;
                rfhVar.j = new rfu(contextZ, rfhVar.a, new qoi(qwnVar2, 3), dvkVar, rfhVar.d);
                rfhVar.j.b(rfhVar.l);
                builder.add((ImmutableList.Builder) rfhVar.j);
                dvkVar2.getLifecycle().c(((rfh) tstVar4.c()).f);
            } else {
                dvkVar2 = dvkVar;
            }
            qub qubVar = selectedAccountDisc2.g;
            qub qubVar2 = selectedAccountDisc2.h;
            ImmutableList immutableListBuild = builder.build();
            if (!immutableListBuild.isEmpty()) {
                selectedAccountDisc2.f = new qun(immutableListBuild, dvkVar2);
                accountParticleDisc.k(selectedAccountDisc2.f);
            }
            bne bneVar = new bne(obj5, 10);
            bne bneVar2 = new bne(obj5, 11);
            selectedAccountDisc2.addOnAttachStateChangeListener(bneVar);
            selectedAccountDisc2.addOnAttachStateChangeListener(bneVar2);
            int[] iArr = cww.a;
            if (selectedAccountDisc2.isAttachedToWindow()) {
                bneVar.onViewAttachedToWindow(selectedAccountDisc2);
                bneVar2.onViewAttachedToWindow(selectedAccountDisc2);
            }
            qwwVar.c = new pqi(yyhVar, 18);
            qwwVar.d = new qoi(yyhVar, 4);
            sjl.c();
            cdr cdrVar = new cdr(qwwVar, new qwv(qwwVar), 3, null);
            View view = qwwVar.a;
            view.addOnAttachStateChangeListener(cdrVar);
            if (view.isAttachedToWindow()) {
                cdrVar.onViewAttachedToWindow(view);
            }
            view.setEnabled(qwwVar.b.b());
            vvd vvdVar = qwwVar.e;
            qxn qxnVar = (qxn) vvdVar.a;
            zft zftVar = qxnVar.b;
            Object obj6 = vvdVar.c;
            view.setOnClickListener(new nay(qwwVar, new qwu((cr) vvdVar.b, (qwn) obj6, (by) vvdVar.d, (zftVar != null && xnl.b(((qwn) obj6).a)) ? (qyb) tst.h(((rbi) zftVar.a).a).f() : null, qxnVar.a), 5, null));
            if (ldvVarP.a().m() && ((ldy) ldvVarP.f()).a().m()) {
                ksn ksnVar2 = (ksn) ldvVarP.a().g();
                qwo qwoVar = qwnVarR.b;
                qwoVar.getClass();
                kaf.a(ksnVar2, qwoVar);
                qwoVar.c(new kak(ksnVar2, qwoVar, ldvVarP));
            }
        }
        kmo kmoVarO = o();
        MenuInflater menuInflater4 = getMenuInflater();
        menuInflater4.getClass();
        kmoVarO.c(menu, menuInflater4);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        q().ee(this);
        kej kejVar = this.af;
        if (kejVar == null) {
            yks.c("voiceSearchController");
            kejVar = null;
        }
        kejVar.a();
        super.onDestroy();
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        Intent intentJ;
        intent.getClass();
        super.onNewIntent(intent);
        if (s().a() && (intentJ = j(intent.getExtras())) != null) {
            startActivity(intentJ);
        }
        q().b();
        setIntent(intent);
        S();
        X();
        ConcurrentHashMap concurrentHashMap = opz.a;
        osk.l(this, intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            D().h(this);
            return true;
        }
        if (itemId != R.id.voice_search_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        kej kejVar = this.af;
        if (kejVar == null) {
            yks.c("voiceSearchController");
            kejVar = null;
        }
        kejVar.b();
        return true;
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        m().b();
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = this.al;
        if (mediaDeviceFloatingActionButton != null) {
            x().g(mediaDeviceFloatingActionButton, yhb.a);
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        super.onPrepareOptionsMenu(menu);
        boolean z = false;
        mjo.t(menu, R.id.menu_search, false);
        mjo.t(menu, R.id.selected_account_disc_item, true);
        kej kejVar = this.af;
        if (kejVar == null) {
            yks.c("voiceSearchController");
            kejVar = null;
        }
        if (kejVar.c() && !o().e()) {
            z = true;
        }
        mjo.t(menu, R.id.voice_search_menu_item, z);
        return true;
    }

    @Override // defpackage.jxs, defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        m().a(this);
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = this.al;
        if (mediaDeviceFloatingActionButton != null) {
            x().a(mediaDeviceFloatingActionButton, jbr.E(166395, null), yhc.a);
        }
        final igv igvVarJ = J();
        int i = 1;
        if (((Boolean) xka.a.e(5, "InAppUpdateFeature__enabled", true).et(((xka) igvVarJ.b).b)).booleanValue()) {
            igvVarJ.e.n().q(new igu(new yjv() { // from class: igt
                /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
                @Override // defpackage.yjv
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r22) {
                    /*
                        Method dump skipped, instructions count: 401
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.igt.a(java.lang.Object):java.lang.Object");
                }
            }, i));
        }
        ioi ioiVar = this.J;
        if (ioiVar == null) {
            yks.c("checkInStore");
            ioiVar = null;
        }
        ioiVar.a(4);
        int iA = q().a();
        if (iA == 0 || iA == 8) {
            q().c();
        }
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        hju.I(bundle, "destinations_key", this.E);
        bundle.putString("locale_key", Locale.getDefault().toLanguageTag());
        super.onSaveInstanceState(bundle);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        J().c = this;
        if (Build.VERSION.SDK_INT >= 33) {
            String str = V;
            if (czi.b(this, str) != 0) {
                requestPermissions(new String[]{str}, 1);
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        J().c = null;
        if (isFinishing()) {
            q().e();
        } else {
            q().d();
        }
    }

    public final ldv p() {
        ldv ldvVar = this.a;
        if (ldvVar != null) {
            return ldvVar;
        }
        yks.c("accountManagerWrapper");
        return null;
    }

    public final mtr q() {
        mtr mtrVar = this.C;
        if (mtrVar != null) {
            return mtrVar;
        }
        yks.c("syncHelper");
        return null;
    }

    public final qwn r() {
        qwn qwnVar = this.c;
        if (qwnVar != null) {
            return qwnVar;
        }
        yks.c("accountMenuManager");
        return null;
    }

    public final xij s() {
        xij xijVar = this.A;
        if (xijVar != null) {
            return xijVar;
        }
        yks.c("deeplinkFeatureFlags");
        return null;
    }

    @Override // defpackage.kek
    public final void t(String str) {
        if (isFinishing()) {
            return;
        }
        D();
        jan.j(this, str, "");
    }

    @Override // defpackage.kka
    public final void u() {
        T();
    }

    public static /* synthetic */ void getFullPurchaseAccountSyncScheduler$annotations() {
    }

    @Override // defpackage.pim
    public final by dR() {
        return this;
    }
}

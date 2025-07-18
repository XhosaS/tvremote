package com.google.android.apps.googletv.app.presentation.pages.search;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.by;
import defpackage.csr;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cyh;
import defpackage.czn;
import defpackage.ivt;
import defpackage.iym;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.iys;
import defpackage.jan;
import defpackage.jbr;
import defpackage.jeh;
import defpackage.jej;
import defpackage.jxs;
import defpackage.jyr;
import defpackage.jzm;
import defpackage.kal;
import defpackage.keh;
import defpackage.kej;
import defpackage.kek;
import defpackage.kiw;
import defpackage.kix;
import defpackage.kiy;
import defpackage.kmo;
import defpackage.mjo;
import defpackage.mta;
import defpackage.pil;
import defpackage.pim;
import defpackage.rdd;
import defpackage.rtx;
import defpackage.rzg;
import defpackage.sfy;
import defpackage.sip;
import defpackage.uhp;
import defpackage.yft;
import defpackage.yga;
import defpackage.ygi;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;
import defpackage.ylh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchResultsPageActivity extends jxs implements kek, pim, ivt, kiw, jeh {
    public iyn a;
    public iys b;
    public kmo c;
    protected View d;
    protected Toolbar e;
    public mta f;
    private final /* synthetic */ kix g = new kix();
    private final yft h;
    private kej i;
    private final int j;
    private final yft k;
    private int l;

    /* renamed from: $r8$lambda$fGXH-0Clu3skbJm6Q77C5iL1Xh8, reason: not valid java name */
    public static /* synthetic */ cyh m124$r8$lambda$fGXH0Clu3skbJm6Q77C5iL1Xh8(SearchResultsPageActivity searchResultsPageActivity, View view, cyh cyhVar) {
        view.getClass();
        cyhVar.getClass();
        csr csrVarF = cyhVar.f(519);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = csrVarF.b;
        marginLayoutParams.rightMargin = csrVarF.d;
        marginLayoutParams.topMargin = csrVarF.c;
        if (!searchResultsPageActivity.v().c()) {
            marginLayoutParams.bottomMargin = csrVarF.e;
        }
        view.setLayoutParams(marginLayoutParams);
        return cyhVar;
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool $r8$lambda$g7Y0BgvKUytUKzv23hSFleSKAIQ() {
        return new RecyclerView.RecycledViewPool();
    }

    public static /* synthetic */ ygi $r8$lambda$gKccfTflLOlwEDhMjWRy2PotV1Q(SearchResultsPageActivity searchResultsPageActivity) {
        iyn iynVar = searchResultsPageActivity.a;
        if (iynVar == null) {
            yks.c("searchResultsPagePresenter");
            iynVar = null;
        }
        Object objA = searchResultsPageActivity.i().b.a();
        objA.getClass();
        iyq iyqVar = (iyq) iynVar.l((iym) objA);
        View viewFindViewById = searchResultsPageActivity.b().findViewById(R.id.search_results_view);
        viewFindViewById.getClass();
        sfy.m(searchResultsPageActivity, viewFindViewById).a(iyqVar);
        return ygi.a;
    }

    public SearchResultsPageActivity() {
        int i = ylg.a;
        this.h = new jej(new ykl(keh.class), new bck(this, 14), this);
        this.l = 3;
        this.j = Color.parseColor("#ff1e1f20");
        rtx.a.c();
        this.k = new yga(new jzm(6));
    }

    @Override // defpackage.kiw
    public final void K(int i) {
        this.g.K(i);
    }

    @Override // defpackage.kiw
    public final void L(String str) {
        this.g.L(str);
    }

    @Override // defpackage.kiw
    public final void M(int i, int i2, View.OnClickListener onClickListener) {
        this.g.M(i, i2, onClickListener);
    }

    protected final Toolbar a() {
        Toolbar toolbar = this.e;
        if (toolbar != null) {
            return toolbar;
        }
        yks.c("toolbar");
        return null;
    }

    protected final View b() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("searchResultsView");
        return null;
    }

    @Override // defpackage.pim
    public final /* synthetic */ uhp d(String str) {
        return rdd.ae(str);
    }

    @Override // defpackage.pim
    public final rzg dU(pil pilVar) {
        int i = pilVar.a;
        if (i != 0 && i - 1 == 5) {
            return new rzg(true, this.l, 1);
        }
        if (i().c) {
            return new rzg(false, 1, 2);
        }
        i().c = true;
        return new rzg(true, this.l, 1);
    }

    @Override // defpackage.jxs, defpackage.ivt
    public final void f(boolean z) {
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setStatusBarColor(getColor(true != y().cJ() ? R.color.status_dark : R.color.status_light));
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(sip.d(this, android.R.attr.statusBarColor, 0));
        }
    }

    @Override // defpackage.jeh
    public final RecyclerView.RecycledViewPool g() {
        return (RecyclerView.RecycledViewPool) this.k.a();
    }

    public final iys h() {
        iys iysVar = this.b;
        if (iysVar != null) {
            return iysVar;
        }
        yks.c("growthKitManager");
        return null;
    }

    protected final keh i() {
        return (keh) this.h.a();
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x().e(this, jbr.L(104280, (String) i().d.a(), 6));
        if (y().cJ()) {
            getDelegate().setLocalNightMode(1);
            if (v().e()) {
                setTheme(R.style.Theme_GoogleTvGM3ExpressiveLight);
            } else {
                setTheme(R.style.Theme_GoogleTv_Light);
            }
            new cxe(getWindow(), getWindow().getDecorView()).i(true);
            this.l = 2;
        } else if (v().e()) {
            setTheme(R.style.Theme_GoogleTvGM3ExpressiveDark);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        this.i = new kej(this, this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.search_results_activity_layout, (ViewGroup) new FrameLayout(this), false);
        viewInflate.getClass();
        this.d = viewInflate;
        if (v().c()) {
            Window window = getWindow();
            int i = this.j;
            window.setNavigationBarColor(i);
            getWindow().getDecorView().getRootView().setBackgroundColor(i);
            View viewFindViewById = b().findViewById(R.id.search_results_main_bg);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(getDrawable(R.drawable.search_results_page_root_shape));
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setStatusBarColor(sip.d(this, android.R.attr.statusBarColor, -16777216));
            }
            getWindow().setNavigationBarColor(0);
            getWindow().getDecorView().getRootView().setBackgroundColor(sip.d(this, android.R.attr.colorBackground, -16777216));
        }
        int i2 = 18;
        sfy.q(this, new kal(this, i2));
        View viewFindViewById2 = findViewById(android.R.id.content);
        viewFindViewById2.getClass();
        this.g.a = new kiy(this, viewFindViewById2, new kal(this, 19));
        setContentView(b());
        Toolbar toolbar = (Toolbar) b().findViewById(R.id.toolbar);
        toolbar.getClass();
        this.e = toolbar;
        View viewFindViewById3 = b().findViewById(R.id.toolbar_divider);
        a().setTitle(i().a);
        a().setOnClickListener(new jyr(this, i2));
        setSupportActionBar(a());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_24dp);
        }
        if (v().c()) {
            a().setBackgroundColor(this.j);
            viewFindViewById3.setVisibility(8);
        }
        View viewFindViewById4 = b().findViewById(R.id.media_device_fab);
        viewFindViewById4.getClass();
        C((MediaDeviceFloatingActionButton) viewFindViewById4);
        View viewFindViewById5 = b().findViewById(R.id.search_page_activity_layout);
        czn cznVar = new czn(this, 11);
        int[] iArr = cww.a;
        cwm.l(viewFindViewById5, cznVar);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        kmo kmoVar = this.c;
        if (kmoVar == null) {
            yks.c("sherlogFeedbackManager");
            kmoVar = null;
        }
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        kmoVar.c(menu, menuInflater);
        getMenuInflater().inflate(R.menu.open_search_results_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        kej kejVar = this.i;
        if (kejVar == null) {
            yks.c("voiceSearchController");
            kejVar = null;
        }
        kejVar.a();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
        } else if (itemId == R.id.search_menu_item) {
            D().i(this, i().a);
        } else if (itemId == R.id.voice_search_menu_item) {
            kej kejVar = this.i;
            if (kejVar == null) {
                yks.c("voiceSearchController");
                kejVar = null;
            }
            kejVar.b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        super.onPause();
        h().b();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        super.onPrepareOptionsMenu(menu);
        kej kejVar = this.i;
        if (kejVar == null) {
            yks.c("voiceSearchController");
            kejVar = null;
        }
        mjo.t(menu, R.id.voice_search_menu_item, kejVar.c());
        return true;
    }

    @Override // defpackage.jxs, defpackage.by, android.app.Activity
    protected final void onResume() {
        super.onResume();
        h().a(this);
    }

    @Override // defpackage.kek
    public final void t(String str) {
        if (isFinishing()) {
            return;
        }
        if (!ylh.L(str)) {
            mta mtaVar = this.f;
            if (mtaVar == null) {
                yks.c("searchSuggestionsStore");
                mtaVar = null;
            }
            mtaVar.p(str);
        }
        D();
        jan.j(this, str, "");
    }

    @Override // defpackage.pim
    public final by dR() {
        return this;
    }
}

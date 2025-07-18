package com.google.android.apps.googletv.app.presentation.pages.myepisodes;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.idr;
import defpackage.ino;
import defpackage.iof;
import defpackage.iym;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.jbr;
import defpackage.jei;
import defpackage.jej;
import defpackage.jxm;
import defpackage.jyr;
import defpackage.kal;
import defpackage.kcw;
import defpackage.ldy;
import defpackage.lhp;
import defpackage.lhr;
import defpackage.mta;
import defpackage.sfy;
import defpackage.tug;
import defpackage.tui;
import defpackage.wll;
import defpackage.yft;
import defpackage.ygi;
import defpackage.yhc;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MyEpisodesActivity extends jxm implements jei {
    private static final tui F = tui.l("com/google/android/apps/googletv/app/presentation/pages/myepisodes/MyEpisodesActivity");
    public AppBarLayout A;
    public View B;
    public View C;
    public FrameLayout D;
    public mta E;
    private RecyclerView G;
    private final yft H;
    public iyn w;
    public lhr x;
    public iof y;
    public ino z;

    public static /* synthetic */ ygi $r8$lambda$5EWduzaU6alFg8rKOYfQOiw47E8(MyEpisodesActivity myEpisodesActivity) {
        iyn iynVar = myEpisodesActivity.w;
        if (iynVar == null) {
            yks.c("streamPagePresenter");
            iynVar = null;
        }
        Object objA = myEpisodesActivity.F().c.a();
        objA.getClass();
        iyq iyqVar = (iyq) iynVar.l((iym) objA);
        View viewFindViewById = myEpisodesActivity.findViewById(R.id.my_episodes_page_layout);
        viewFindViewById.getClass();
        sfy.m(myEpisodesActivity, viewFindViewById).a(iyqVar);
        return ygi.a;
    }

    public static /* synthetic */ void $r8$lambda$d25ru1fni1N08dR7Om9_ZmTDoHg(MyEpisodesActivity myEpisodesActivity, View view) {
        myEpisodesActivity.D();
        jbr.v(myEpisodesActivity, myEpisodesActivity.F().b(), null, null, null, 60);
        myEpisodesActivity.finish();
    }

    public MyEpisodesActivity() {
        int i = ylg.a;
        this.H = new jej(new ykl(kcw.class), new bck(this, 11), this);
    }

    private final kcw F() {
        return (kcw) this.H.a();
    }

    public final idr a() {
        return F().e;
    }

    @Override // defpackage.jei
    public final idr b() {
        return F().d;
    }

    @Override // defpackage.jxs, defpackage.ivt
    public final void f(boolean z) {
        if (this.A == null) {
            return;
        }
        AppBarLayout appBarLayoutO = o();
        int i = true != z ? 0 : 8;
        appBarLayoutO.setVisibility(i);
        l().setVisibility(i);
    }

    @Override // defpackage.jxm
    public final RecyclerView i() {
        return this.G;
    }

    @Override // defpackage.jxm
    public final View j() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        yks.c("pageLayout");
        return null;
    }

    @Override // defpackage.jxm
    public final View k() {
        View view = this.C;
        if (view != null) {
            return view;
        }
        yks.c("streamView");
        return null;
    }

    @Override // defpackage.jxm
    public final FrameLayout l() {
        FrameLayout frameLayout = this.D;
        if (frameLayout != null) {
            return frameLayout;
        }
        yks.c("statusBarBackgroundView");
        return null;
    }

    @Override // defpackage.jxm
    public final AppBarLayout o() {
        AppBarLayout appBarLayout = this.A;
        if (appBarLayout != null) {
            return appBarLayout;
        }
        yks.c("appBar");
        return null;
    }

    @Override // defpackage.jxm, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("referrer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        int i = 6;
        x().e(this, jbr.L(159220, stringExtra, 6));
        if (y().cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        tui tuiVar = F;
        ((tug) tuiVar.e().j("com/google/android/apps/googletv/app/presentation/pages/myepisodes/MyEpisodesActivity", "onCreate", 79, "MyEpisodesActivity.kt")).F("[MyEpisodes]: PlayId=%s, ShowId=%s, SelectedSeasonId=%s, SelectedSeasonPlayId=%s", F().b(), F().a(), F().d, F().e);
        setContentView(R.layout.my_episodes_page_layout);
        ino inoVar = this.z;
        mta mtaVar = null;
        if (inoVar == null) {
            yks.c("mediaLibraryStore");
            inoVar = null;
        }
        boolean zM = inoVar.M(F().b());
        ((tug) tuiVar.e().j("com/google/android/apps/googletv/app/presentation/pages/myepisodes/MyEpisodesActivity", "onCreate", 88, "MyEpisodesActivity.kt")).v("[MyEpisodes]: SeasonsExistForShow=%b", Boolean.valueOf(zM));
        if (!zM) {
            finish();
            D();
            jbr.v(this, F().b(), null, null, null, 60);
            return;
        }
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = (MediaDeviceFloatingActionButton) findViewById(R.id.media_device_fab);
        mediaDeviceFloatingActionButton.getClass();
        C(mediaDeviceFloatingActionButton);
        x().a(mediaDeviceFloatingActionButton, jbr.E(166395, null), yhc.a);
        sfy.q(this, new kal(this, i));
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        appBarLayout.getClass();
        this.A = appBarLayout;
        this.G = (RecyclerView) findViewById(R.id.recycler_view);
        View viewFindViewById = findViewById(R.id.my_episodes_page_layout);
        viewFindViewById.getClass();
        this.B = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.stream_view);
        viewFindViewById2.getClass();
        this.C = viewFindViewById2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.status_bar_background);
        frameLayout.getClass();
        this.D = frameLayout;
        q();
        r();
        o().addView(getLayoutInflater().inflate(R.layout.my_episodes_toolbar_button, (ViewGroup) null));
        o().findViewById(R.id.open_show_details_button).setOnClickListener(new jyr(this, 14));
        mta mtaVar2 = this.E;
        if (mtaVar2 == null) {
            yks.c("pinHelper");
        } else {
            mtaVar = mtaVar2;
        }
        mtaVar.d(this, ((ldy) m()).a(), z());
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
        wll wllVar = (wll) F().d.a();
        if (yks.e(wllVar, wll.a)) {
            return;
        }
        iof iofVar = this.y;
        if (iofVar == null) {
            yks.c("watchActionStore");
            iofVar = null;
        }
        iofVar.f(wllVar);
    }

    @Override // defpackage.jxm
    public final void s() {
        lhp lhpVar = new lhp("", "mobile_movie_object", "");
        wll wllVarA = F().a();
        lhpVar.b = wllVarA.b == 1 ? (String) wllVarA.c : "";
        lhr lhrVar = this.x;
        if (lhrVar == null) {
            yks.c("gmsHelpUtil");
            lhrVar = null;
        }
        lhrVar.d(this, lhpVar);
    }
}

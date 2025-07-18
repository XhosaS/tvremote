package com.google.android.apps.googletv.app.presentation.pages.genericcomponent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.videos.R;
import defpackage.bck;
import defpackage.hju;
import defpackage.isg;
import defpackage.ivt;
import defpackage.ixh;
import defpackage.jaf;
import defpackage.jbr;
import defpackage.jef;
import defpackage.jej;
import defpackage.jok;
import defpackage.jxm;
import defpackage.jzm;
import defpackage.jzn;
import defpackage.jzs;
import defpackage.kiw;
import defpackage.kix;
import defpackage.kiy;
import defpackage.lhp;
import defpackage.lhr;
import defpackage.rtx;
import defpackage.sfy;
import defpackage.ubt;
import defpackage.vsz;
import defpackage.vvj;
import defpackage.wmc;
import defpackage.woi;
import defpackage.yft;
import defpackage.ygi;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GenericComponentPageActivity extends jxm implements kiw, ivt {
    public FrameLayout A;
    protected View B;
    public jzs C;
    private final /* synthetic */ kix D = new kix();
    private final yft E;
    private RecyclerView F;
    public lhr w;
    public AppBarLayout x;
    public View y;
    public View z;

    public static /* synthetic */ ygi $r8$lambda$9GrcPg0mbdeSEP6muo5KcdM8Lhw(GenericComponentPageActivity genericComponentPageActivity, View view) {
        jzs jzsVar = genericComponentPageActivity.C;
        if (jzsVar == null) {
            yks.c("componentManager");
            jzsVar = null;
        }
        view.getClass();
        ixh ixhVarA = genericComponentPageActivity.b().a();
        genericComponentPageActivity.getClass();
        ixhVarA.getClass();
        sfy.m(genericComponentPageActivity, view).a(jzsVar.d(ixhVarA));
        if (yks.e(genericComponentPageActivity.b().b(), "tpfy-channel") && genericComponentPageActivity.B().c()) {
            ixh ixhVarA2 = genericComponentPageActivity.b().a();
            jok jokVar = ixhVarA2 instanceof jok ? (jok) ixhVarA2 : null;
            if (jokVar != null) {
                jokVar.i(jef.i, true);
            }
        }
        return ygi.a;
    }

    public static /* synthetic */ Float $r8$lambda$SkAJzucmY_75w1C2bTd9i2vQVTg() {
        return null;
    }

    public GenericComponentPageActivity() {
        int i = ylg.a;
        this.E = new jej(new ykl(jzn.class), new bck(this, 7), this);
        rtx.a.c();
    }

    private final jzn b() {
        return (jzn) this.E.a();
    }

    @Override // defpackage.kiw
    public final void K(int i) {
        this.D.K(i);
    }

    @Override // defpackage.kiw
    public final void L(String str) {
        this.D.L(str);
    }

    @Override // defpackage.kiw
    public final void M(int i, int i2, View.OnClickListener onClickListener) {
        this.D.M(i, i2, onClickListener);
    }

    protected final View a() {
        View view = this.B;
        if (view != null) {
            return view;
        }
        yks.c("genericComponentView");
        return null;
    }

    @Override // defpackage.jxs, defpackage.ivt
    public final void f(boolean z) {
        if (this.x == null) {
            return;
        }
        AppBarLayout appBarLayoutO = o();
        int i = true != z ? 0 : 8;
        appBarLayoutO.setVisibility(i);
        l().setVisibility(i);
    }

    @Override // defpackage.jxm
    public final RecyclerView i() {
        return this.F;
    }

    @Override // defpackage.jxm
    public final View j() {
        View view = this.y;
        if (view != null) {
            return view;
        }
        yks.c("pageLayout");
        return null;
    }

    @Override // defpackage.jxm
    public final View k() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        yks.c("streamView");
        return null;
    }

    @Override // defpackage.jxm
    public final FrameLayout l() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            return frameLayout;
        }
        yks.c("statusBarBackgroundView");
        return null;
    }

    @Override // defpackage.jxm
    public final AppBarLayout o() {
        AppBarLayout appBarLayout = this.x;
        if (appBarLayout != null) {
            return appBarLayout;
        }
        yks.c("appBar");
        return null;
    }

    @Override // defpackage.jxm, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        wmc wmcVar = wmc.a;
        wmcVar.getClass();
        vvj vvjVarZ = hju.z(intent, "logging_info", wmcVar);
        vvjVarZ.getClass();
        wmc wmcVar2 = (wmc) vvjVarZ;
        jaf jafVarX = x();
        int i = wmcVar2.c;
        if (i == 0) {
            i = 129676;
        }
        ubt ubtVar = wmcVar2.d;
        if (ubtVar == null) {
            ubtVar = ubt.a;
        }
        jafVarX.e(this, jbr.G(i, ubtVar, vsz.s(wmcVar2.b), b().b()));
        if (y().cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.generic_component_page, (ViewGroup) new FrameLayout(this), false);
        viewInflate.getClass();
        this.B = viewInflate;
        Intent intent2 = getIntent();
        intent2.getClass();
        woi woiVar = woi.a;
        woiVar.getClass();
        p((woi) hju.z(intent2, "sharing_info", woiVar));
        String strValueOf = String.valueOf(getIntent().getStringExtra("stream_page_title"));
        strValueOf.getClass();
        this.g = strValueOf;
        this.e = getIntent().getBooleanExtra("stream_page_show_title_only_when_scrolled", false);
        sfy.q(this, new isg(this, v().b() ? a().findViewById(R.id.component_view_bc25) : a().findViewById(R.id.component_view), 20, null));
        View viewFindViewById = a().findViewById(R.id.appBar);
        viewFindViewById.getClass();
        AppBarLayout appBarLayout = (AppBarLayout) viewFindViewById;
        View viewFindViewById2 = a().findViewById(R.id.appBarBc25);
        viewFindViewById2.getClass();
        AppBarLayout appBarLayout2 = (AppBarLayout) viewFindViewById2;
        if (v().b()) {
            this.x = appBarLayout2;
            appBarLayout.setVisibility(8);
            this.k = (MaterialToolbar) a().findViewById(R.id.toolbarBc25);
        } else {
            this.x = appBarLayout;
            appBarLayout2.setVisibility(8);
        }
        View viewFindViewById3 = a().findViewById(R.id.generic_stream_page_layout);
        viewFindViewById3.getClass();
        this.y = viewFindViewById3;
        FrameLayout frameLayout = (FrameLayout) a().findViewById(R.id.status_bar_background);
        frameLayout.getClass();
        this.A = frameLayout;
        View viewFindViewById4 = a().findViewById(R.id.stream_view);
        viewFindViewById4.getClass();
        this.z = viewFindViewById4;
        this.F = (RecyclerView) a().findViewById(R.id.recycler_view);
        q();
        View viewFindViewById5 = findViewById(android.R.id.content);
        viewFindViewById5.getClass();
        this.D.a = new kiy(this, viewFindViewById5, new jzm(0));
        setContentView(a());
        r();
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = (MediaDeviceFloatingActionButton) a().findViewById(R.id.media_device_fab);
        if (mediaDeviceFloatingActionButton != null) {
            mediaDeviceFloatingActionButton.e(w(), E(), A(), v());
        }
    }

    @Override // defpackage.jxm, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.jxm
    public final void s() {
        b();
        lhp lhpVar = new lhp("", "unknown", "");
        lhr lhrVar = this.w;
        if (lhrVar == null) {
            yks.c("gmsHelpUtil");
            lhrVar = null;
        }
        lhrVar.d(this, lhpVar);
    }
}

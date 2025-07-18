package com.google.android.apps.googletv.app.presentation.pages.entitypurchase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.videos.R;
import defpackage.cxe;
import defpackage.dxa;
import defpackage.hfw;
import defpackage.hju;
import defpackage.idr;
import defpackage.isg;
import defpackage.iyn;
import defpackage.iyq;
import defpackage.jad;
import defpackage.jef;
import defpackage.jeh;
import defpackage.jei;
import defpackage.jxm;
import defpackage.jzg;
import defpackage.jzi;
import defpackage.jzj;
import defpackage.ldy;
import defpackage.lhp;
import defpackage.lhr;
import defpackage.mta;
import defpackage.nqq;
import defpackage.pke;
import defpackage.pkg;
import defpackage.rtx;
import defpackage.sfy;
import defpackage.wll;
import defpackage.ygi;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EntityPurchasePageActivity extends jxm implements jei, jeh {
    public View A;
    public FrameLayout B;
    public pke C;
    public pkg D;
    public nqq E;
    public mta F;
    public hfw G;
    private RecyclerView H;
    private jzi I;
    public iyn w;
    public lhr x;
    public AppBarLayout y;
    public View z;

    public static /* synthetic */ ygi $r8$lambda$tGzl2J0zg3n4C0_eW5KxvZi0lvY(EntityPurchasePageActivity entityPurchasePageActivity, jzg jzgVar) {
        iyn iynVar = entityPurchasePageActivity.w;
        if (iynVar == null) {
            yks.c("streamPagePresenter");
            iynVar = null;
        }
        iyq iyqVar = (iyq) iynVar.l(jzgVar);
        View viewFindViewById = entityPurchasePageActivity.findViewById(R.id.entity_purchase_page_layout);
        viewFindViewById.getClass();
        sfy.m(entityPurchasePageActivity, viewFindViewById).a(iyqVar);
        return ygi.a;
    }

    public EntityPurchasePageActivity() {
        rtx.a.c();
    }

    @Override // defpackage.jei
    public final idr b() {
        jzi jziVar = this.I;
        if (jziVar == null) {
            yks.c("viewModel");
            jziVar = null;
        }
        return jziVar.b;
    }

    @Override // defpackage.jxm, defpackage.jeh
    public final RecyclerView.RecycledViewPool g() {
        return h();
    }

    @Override // defpackage.jxm
    public final RecyclerView i() {
        return this.H;
    }

    @Override // defpackage.jxm
    public final View j() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        yks.c("pageLayout");
        return null;
    }

    @Override // defpackage.jxm
    public final View k() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        yks.c("streamView");
        return null;
    }

    @Override // defpackage.jxm
    public final FrameLayout l() {
        FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            return frameLayout;
        }
        yks.c("statusBarBackgroundView");
        return null;
    }

    @Override // defpackage.jxm
    public final AppBarLayout o() {
        AppBarLayout appBarLayout = this.y;
        if (appBarLayout != null) {
            return appBarLayout;
        }
        yks.c("appBar");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yfo] */
    @Override // defpackage.jxm, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x().e(this, new jad(130386, 0L, 0, null, null, null, 62));
        if (y().cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
            new cxe(getWindow(), getWindow().getDecorView()).i(true);
        } else {
            setTheme(R.style.Theme_GoogleTv_Dark);
        }
        setContentView(R.layout.entity_purchase_page_material);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appBar);
        appBarLayout.getClass();
        this.y = appBarLayout;
        this.H = (RecyclerView) findViewById(R.id.recycler_view);
        View viewFindViewById = findViewById(R.id.entity_purchase_page_layout);
        viewFindViewById.getClass();
        this.z = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.stream_view);
        viewFindViewById2.getClass();
        this.A = viewFindViewById2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.status_bar_background);
        frameLayout.getClass();
        this.B = frameLayout;
        q();
        r();
        mta mtaVar = this.F;
        jzi jziVar = null;
        if (mtaVar == null) {
            yks.c("pinHelper");
            mtaVar = null;
        }
        mtaVar.d(this, ((ldy) m()).a(), z());
        hfw hfwVar = this.G;
        if (hfwVar == null) {
            yks.c("viewModelFactoryFactory");
            hfwVar = null;
        }
        Intent intent = getIntent();
        intent.getClass();
        wll wllVar = wll.a;
        wllVar.getClass();
        wll wllVar2 = (wll) hju.z(intent, "entity_id", wllVar);
        if (wllVar2 == null) {
            wllVar.getClass();
        } else {
            wllVar = wllVar2;
        }
        jzi jziVar2 = (jzi) new dxa(this, new jzj((hfw) hfwVar.a.b(), wllVar)).a(jzi.class);
        this.I = jziVar2;
        if (jziVar2 == null) {
            yks.c("viewModel");
            jziVar2 = null;
        }
        jzg jzgVar = jziVar2.a;
        jzi jziVar3 = this.I;
        if (jziVar3 == null) {
            yks.c("viewModel");
        } else {
            jziVar = jziVar3;
        }
        jzgVar.f(jef.a, jziVar.b);
        sfy.q(this, new isg(this, jzgVar, 19));
        MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = (MediaDeviceFloatingActionButton) findViewById(R.id.media_device_fab);
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
        lhp lhpVar = new lhp("", "mobile_movie_object", "");
        jzi jziVar = this.I;
        lhr lhrVar = null;
        if (jziVar == null) {
            yks.c("viewModel");
            jziVar = null;
        }
        wll wllVar = (wll) jziVar.a.d;
        lhpVar.b = wllVar.b == 1 ? (String) wllVar.c : "";
        lhr lhrVar2 = this.x;
        if (lhrVar2 == null) {
            yks.c("gmsHelpUtil");
        } else {
            lhrVar = lhrVar2;
        }
        lhrVar.d(this, lhpVar);
    }
}

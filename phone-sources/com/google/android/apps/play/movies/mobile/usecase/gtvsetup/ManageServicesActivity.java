package com.google.android.apps.play.movies.mobile.usecase.gtvsetup;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.google.android.videos.R;
import defpackage.at;
import defpackage.bv;
import defpackage.cr;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cyh;
import defpackage.iea;
import defpackage.igw;
import defpackage.ihg;
import defpackage.jbr;
import defpackage.jzm;
import defpackage.kch;
import defpackage.kiw;
import defpackage.kix;
import defpackage.kiy;
import defpackage.ksn;
import defpackage.ldv;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lid;
import defpackage.mns;
import defpackage.mnu;
import defpackage.mqg;
import defpackage.nbt;
import defpackage.nqq;
import defpackage.pjr;
import defpackage.pju;
import defpackage.pke;
import defpackage.pkg;
import defpackage.qtl;
import defpackage.rdd;
import defpackage.vtw;
import defpackage.xcf;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ManageServicesActivity extends xcf implements kiw {
    public static final mnu Companion = new mnu();
    public lfn a;
    public pke b;
    public pkg c;
    public iea d;
    public ldv e;
    public ihg f;
    public nqq g;
    private boolean i;
    private final /* synthetic */ kix h = new kix();
    private lid j = lid.a;

    /* renamed from: $r8$lambda$6ajh-3bsDazb5_rvDBOeyV7lz_c, reason: not valid java name */
    public static /* synthetic */ Float m126$r8$lambda$6ajh3bsDazb5_rvDBOeyV7lz_c() {
        return null;
    }

    /* renamed from: $r8$lambda$xWNmYme7cZ2yXkfH7XqIG-HWDK4, reason: not valid java name */
    public static /* synthetic */ cyh m127$r8$lambda$xWNmYme7cZ2yXkfH7XqIGHWDK4(View view, cyh cyhVar) {
        view.getClass();
        cyhVar.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), cyhVar.f(519).e);
        return cyh.a;
    }

    public static final Intent manageServicesActivityIntent(Context context, boolean z, lid lidVar) {
        return mnu.a(context, z, lidVar);
    }

    @Override // defpackage.kiw
    public final void K(int i) {
        this.h.K(i);
    }

    @Override // defpackage.kiw
    public final void L(String str) {
        this.h.L(str);
    }

    @Override // defpackage.kiw
    public final void M(int i, int i2, View.OnClickListener onClickListener) {
        this.h.M(i, i2, onClickListener);
    }

    public final iea a() {
        iea ieaVar = this.d;
        if (ieaVar != null) {
            return ieaVar;
        }
        yks.c("accountRepository");
        return null;
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.i) {
            super.finish();
        } else {
            startActivity(jbr.V(this));
            super.finish();
        }
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 903) {
            if (i2 != -1) {
                finish();
            }
            i = 903;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        bv kchVar;
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        mqg mqgVar = new mqg(1);
        int[] iArr = cww.a;
        cwm.l(decorView, mqgVar);
        lfn lfnVar = this.a;
        nqq nqqVar = null;
        if (lfnVar == null) {
            yks.c("config");
            lfnVar = null;
        }
        if (lfnVar.cJ()) {
            setTheme(R.style.Theme_GoogleTv_Light);
            new cxe(getWindow(), getWindow().getDecorView()).i(true);
        } else {
            ihg ihgVar = this.f;
            if (ihgVar == null) {
                yks.c("bc25FlagsManager");
                ihgVar = null;
            }
            if (ihgVar.e()) {
                View decorView2 = getWindow().getDecorView();
                int i = igw.a;
                decorView2.setBackgroundColor(igw.b);
                setTheme(R.style.Theme_GoogleTvGM3ExpressiveDark);
            } else {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#ff303030"));
                setTheme(R.style.Theme_GoogleTv_Dark);
            }
        }
        ldv ldvVar = this.e;
        if (ldvVar == null) {
            yks.c("accountManagerWrapper");
            ldvVar = null;
        }
        if (!ldvVar.r(((ldy) a()).a())) {
            Intent intentNewChooseAccountIntent = AccountManager.newChooseAccountIntent(null, null, new String[]{"com.google"}, null, null, null, null);
            intentNewChooseAccountIntent.getClass();
            startActivityForResult(intentNewChooseAccountIntent, 903);
        }
        Intent intent = getIntent();
        this.i = intent.getBooleanExtra("re_setup_flag", false);
        this.j = lid.c((lid) intent.getParcelableExtra("parent_event_id"));
        cr supportFragmentManager = getSupportFragmentManager();
        if (this.i) {
            kchVar = new kch();
        } else {
            lid lidVar = this.j;
            lidVar.getClass();
            mns mnsVar = new mns();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("parent_event_id", lidVar);
            mnsVar.setArguments(bundle2);
            kchVar = mnsVar;
        }
        pke pkeVar = this.b;
        if (pkeVar == null) {
            yks.c("viewVisualElement");
            pkeVar = null;
        }
        pkg pkgVar = this.c;
        if (pkgVar == null) {
            yks.c("visualElements");
            pkgVar = null;
        }
        pjr pjrVarA = pkgVar.a(true != this.i ? 123898 : 123899);
        pjrVarA.e(((ldy) a()).a().m() ? rdd.Z(((ksn) ((ldy) a()).a().g()).a) : rdd.ab());
        vtw vtwVarM = nbt.a.m();
        nqq nqqVar2 = this.g;
        if (nqqVar2 == null) {
            yks.c("uiEventLoggingHelper");
        } else {
            nqqVar = nqqVar2;
        }
        long jB = nqqVar.b();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        nbt nbtVar = (nbt) vtwVarM.b;
        nbtVar.b = 1 | nbtVar.b;
        nbtVar.c = jB;
        pjrVarA.e(qtl.ag((nbt) vtwVarM.r()));
        pjrVarA.f(pju.b);
        pkeVar.d(this, pjrVarA);
        String name = this.i ? kch.class.getName() : mns.class.getName();
        name.getClass();
        at atVar = new at(supportFragmentManager);
        atVar.u(android.R.id.content, kchVar, name);
        atVar.a();
        View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.getClass();
        this.h.a = new kiy(this, viewFindViewById, new jzm(20));
    }
}

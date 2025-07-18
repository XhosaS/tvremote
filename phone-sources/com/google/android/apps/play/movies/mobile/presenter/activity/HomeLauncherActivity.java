package com.google.android.apps.play.movies.mobile.presenter.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.play.movies.common.presenter.activity.GmsErrorActivity;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.videos.R;
import defpackage.idb;
import defpackage.iea;
import defpackage.ieg;
import defpackage.imw;
import defpackage.iop;
import defpackage.isy;
import defpackage.jaq;
import defpackage.jbb;
import defpackage.jbr;
import defpackage.krh;
import defpackage.kuw;
import defpackage.ldy;
import defpackage.lfn;
import defpackage.lid;
import defpackage.lig;
import defpackage.lin;
import defpackage.liq;
import defpackage.lkt;
import defpackage.nqq;
import defpackage.qf;
import defpackage.xbu;
import defpackage.xbz;
import defpackage.xic;
import defpackage.xid;
import defpackage.xjq;
import defpackage.yih;
import defpackage.ykr;
import defpackage.yol;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HomeLauncherActivity extends xbz implements Runnable {
    public lfn a;
    public SharedPreferences b;
    public jaq c;
    public xid d;
    public idb e;
    public Consumer f;
    public xjq g;
    public iop h;
    public nqq i;
    public lkt j;
    public isy k;
    public kuw l;
    private boolean n = false;
    private lid o;
    private lin p;

    private final void a() {
        overridePendingTransition(R.anim.play_fade_in, android.R.anim.fade_out);
        startActivity(jbr.T(this, getIntent()).addFlags(65536));
        overridePendingTransition(0, 0);
        this.f.accept(this);
        overridePendingTransition(0, 0);
    }

    public static void restartAppStartingWithHomeLauncherActivity(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HomeLauncherActivity.class).addFlags(268468224));
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, yow] */
    @Override // defpackage.xbz, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lig.a();
        lig.a().b(xbu.HOME_LAUNCH_ACTIVITY);
        if (GmsErrorActivity.startIfNecessary(this)) {
            finish();
            return;
        }
        iop iopVar = this.h;
        iea ieaVar = iopVar.a;
        yol yolVar = new yol();
        if (((ldy) ieaVar).a().l()) {
            yolVar.t(null);
        } else {
            ykr.q(iopVar, null, 0, new imw(iopVar, yolVar, (yih) null, 3), 3);
        }
        this.n = this.b.getBoolean(krh.GTV_APP_FIRST_LAUNCH_COMPLETED, false);
        lkt lktVar = this.j;
        ieg iegVar = ieg.a;
        this.o = lktVar.b("", iegVar, iegVar);
        if (this.d.a()) {
            this.c.a();
        }
        if (this.g.b()) {
            kuw kuwVar = this.l;
            ykr.q(kuwVar.b, null, 0, new jbb(kuwVar, (yih) null, 1), 3);
        } else {
            isy isyVar = this.k;
            if (((Boolean) xic.a.et(((xic) isyVar.a).b)).booleanValue() && ((ldy) isyVar.d).a().m()) {
                ykr.q(isyVar.b, null, 0, new qf(isyVar, (yih) null, 18), 3);
            }
        }
        run();
        this.p = lin.n(this.i, liq.e(139), lid.c((lid) getIntent().getParcelableExtra("parent_event_id")));
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.p.j();
        this.p.g();
    }

    @Override // android.app.Activity
    protected final void onStop() {
        this.p.f();
        super.onStop();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.a()) {
            a();
            finish();
            return;
        }
        if (this.n || this.a.cI()) {
            a();
        } else {
            startActivity(ManageServicesActivity.manageServicesActivityIntent(this, false, this.o));
        }
        this.b.edit().putBoolean(krh.GTV_APP_FIRST_LAUNCH_COMPLETED, true).apply();
        lig.a().b(xbu.HOME_LAUNCH_ACTIVITY_POST_DELAY);
    }
}

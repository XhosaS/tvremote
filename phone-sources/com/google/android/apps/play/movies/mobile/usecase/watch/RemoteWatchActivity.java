package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.videos.R;
import defpackage.idf;
import defpackage.idr;
import defpackage.idz;
import defpackage.iea;
import defpackage.ieg;
import defpackage.iej;
import defpackage.krb;
import defpackage.krd;
import defpackage.kst;
import defpackage.ksy;
import defpackage.kuo;
import defpackage.kvf;
import defpackage.ldv;
import defpackage.lhr;
import defpackage.lie;
import defpackage.lll;
import defpackage.mij;
import defpackage.mjl;
import defpackage.mjo;
import defpackage.msk;
import defpackage.msr;
import defpackage.mst;
import defpackage.mwi;
import defpackage.nmg;
import defpackage.nmq;
import defpackage.nnl;
import defpackage.nnm;
import defpackage.nnn;
import defpackage.npz;
import defpackage.nqj;
import defpackage.rrx;
import defpackage.rzt;
import defpackage.rzy;
import defpackage.sah;
import defpackage.san;
import defpackage.wae;
import defpackage.wgi;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RemoteWatchActivity extends mij implements xce, npz, mwi, nnn {
    public mjl b;
    public mjo c;
    public msr d;
    public xcd e;
    public idf f;
    public SharedPreferences g;
    public Executor h;
    public lhr i;
    public san j;
    public lie k;
    public ldv l;
    public iea n;
    public krb o;
    public mjo p;
    private rzy q;
    private msk s;
    private ImageView t;
    private ImageView u;
    private final idr v;
    private final idr w;
    private final iej x;
    private boolean r = false;
    boolean m = false;

    public static /* synthetic */ void $r8$lambda$cfrqM4IJNxnJ_M7RDJk4cPF2avE(RemoteWatchActivity remoteWatchActivity, mst mstVar) {
        if (remoteWatchActivity.isFinishing()) {
            return;
        }
        int i = mstVar.a;
        msk mskVar = remoteWatchActivity.s;
        ImageView imageView = remoteWatchActivity.u;
        ImageView imageView2 = remoteWatchActivity.t;
        throw null;
    }

    public static /* synthetic */ void $r8$lambda$i75d1SdbyhtD7q0PluwH5q6pCVU(RemoteWatchActivity remoteWatchActivity) {
        kst kstVarK = remoteWatchActivity.k();
        if (kstVarK != null) {
            remoteWatchActivity.getSupportActionBar().setTitle(kstVarK instanceof kuo ? ((kuo) kstVarK).e : ((kvf) kstVarK).E());
        }
        kst kstVarK2 = remoteWatchActivity.k();
        if (kstVarK2 == null) {
            return;
        }
        if (kstVarK2 instanceof kvf) {
        } else if (kstVarK2 instanceof kuo) {
        }
        ImageView imageView = remoteWatchActivity.t;
        throw null;
    }

    public static /* synthetic */ Boolean $r8$lambda$jcLq7TL203g46_NA8Cx1SXuH2lI(RemoteWatchActivity remoteWatchActivity, Boolean bool) {
        boolean z = false;
        if (!bool.booleanValue() && ((ieg) remoteWatchActivity.v.a()).m() && !((ieg) remoteWatchActivity.n.a()).l()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: $r8$lambda$wo1Y2SJxCER-V34NjCCShkL1JZY, reason: not valid java name */
    public static /* synthetic */ ieg m138$r8$lambda$wo1Y2SJxCERV34NjCCShkL1JZY(RemoteWatchActivity remoteWatchActivity, ieg iegVar) {
        ieg iegVar2 = (ieg) remoteWatchActivity.w.a();
        if (!iegVar2.m()) {
            return iegVar;
        }
        ieg iegVar3 = (ieg) remoteWatchActivity.f.b((ksy) iegVar2.g());
        if (!iegVar3.l()) {
            return iegVar3;
        }
        ieg iegVar4 = ieg.b;
        krd.c(String.format("Could not load asset with id %s", iegVar2.g()));
        return iegVar4;
    }

    public RemoteWatchActivity() {
        ieg iegVar = ieg.a;
        this.v = new idz(iegVar);
        this.w = new idz(iegVar);
        this.n = new idz(iegVar);
        this.x = new lll(this, 12, null);
    }

    public static Intent createRemoteWatchActivityIntent(Context context) {
        return new Intent(context, (Class<?>) RemoteWatchActivity.class).addFlags(131072);
    }

    private final nnm t() {
        msr.b();
        return nmg.d(this).h();
    }

    private final void u(nmq nmqVar) {
        this.v.c(ieg.a(nmqVar.d()));
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void a(nnl nnlVar, int i) {
        krd.e(String.format("Cast session ended, closing activity. Error Code %s.", Integer.valueOf(i)));
        finish();
    }

    @Override // defpackage.xcf, defpackage.xce
    public final xby<Object> androidInjector() {
        return this.e;
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void b(nnl nnlVar) {
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void c(nnl nnlVar, int i) {
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void d(nnl nnlVar, boolean z) {
        krd.e(String.format("Cast session resumed. wasSuspended: %s", Boolean.valueOf(z)));
        u((nmq) nnlVar);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void e(nnl nnlVar, String str) {
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void f(nnl nnlVar, int i) {
        krd.e(String.format("Cast session failed to start, closing activity. Error Code %s.", Integer.valueOf(i)));
        finish();
    }

    @Override // defpackage.nnn
    public final /* bridge */ /* synthetic */ void g(nnl nnlVar, String str) {
        krd.e(String.format("Cast session started. Session Id: %s.", str));
        u((nmq) nnlVar);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void h(nnl nnlVar) {
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void i(nnl nnlVar, int i) {
    }

    public final kst k() {
        return (kst) ((ieg) this.n.a()).c;
    }

    public final nqj l() {
        nmq nmqVarA = t().a();
        if (nmqVarA == null || !nmqVarA.s()) {
            return null;
        }
        return nmqVarA.d();
    }

    @Override // defpackage.npz
    public final void n() {
        this.w.c(msr.a(l()));
    }

    @Override // defpackage.fl, android.app.Activity
    public final void onBackPressed() {
        throw null;
    }

    @Override // defpackage.mij, defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        rzt rztVarB;
        wae.y(this);
        super.onCreate(bundle);
        msr.b();
        if (!getIntent().hasExtra("referrer")) {
            overridePendingTransition(R.anim.enter_remote_remote_activity_transition, R.anim.enter_remote_parent_activity_transition);
        }
        Intent intent = getIntent();
        Parcelable.Creator<rzt> creator = rzt.CREATOR;
        if (intent.getExtras() == null || (rztVarB = (rzt) intent.getExtras().getParcelable("com.google.android.libraries.play.logging.ulex.ULEX_CAUSE_EVENT_ID")) == null) {
            rztVarB = rzt.b();
        }
        this.q = (rzy) ((sah) rrx.E(this.j.j(rztVarB), wgi.CAST_PLAYBACK)).e();
        this.r = true;
        finish();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.settings_and_help_menu, menu);
        menuInflater.inflate(R.menu.controller_overlay_menu, menu);
        menu.findItem(R.id.cc_menu_item_selected);
        menu.findItem(R.id.cc_menu_item_unselected);
        throw null;
    }

    @Override // defpackage.fl, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
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
        if (itemId != R.id.menu_help_and_feedback) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.i.b(this, "mobile_movie_player");
        return true;
    }

    @Override // defpackage.by, android.app.Activity
    protected final void onPause() {
        t().e(this, nmq.class);
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.by, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onResume() {
        /*
            r2 = this;
            java.lang.Class<nmq> r0 = defpackage.nmq.class
            nnm r1 = r2.t()
            r1.c(r2, r0)
            nnm r0 = r2.t()
            nmq r0 = r0.a()
            if (r0 == 0) goto L2d
            boolean r1 = r0.s()
            if (r1 != 0) goto L35
            defpackage.ocv.aC()
            nnd r0 = r0.f
            if (r0 != 0) goto L21
            goto L2d
        L21:
            boolean r0 = r0.f()     // Catch: android.os.RemoteException -> L28
            if (r0 != 0) goto L35
            goto L2d
        L28:
            java.lang.Class<nnd> r0 = defpackage.nnd.class
            defpackage.nsf.e()
        L2d:
            java.lang.String r0 = "No current/connecting cast session, finishing activity"
            defpackage.krd.c(r0)
            r2.finish()
        L35:
            nqj r0 = r2.l()
            r1 = 1
            if (r0 == 0) goto L44
            boolean r0 = r0.q()
            if (r0 != 0) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            r2.m = r1
            super.onResume()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.watch.RemoteWatchActivity.onResume():void");
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStart() {
        super.onStart();
        if (this.r) {
            this.r = false;
        } else {
            this.j.e(this.q);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onStop() {
        super.onStop();
        iea ieaVar = this.n;
        if (ieaVar == null || !((ieg) ieaVar.a()).m()) {
            return;
        }
        this.n.ee(this.x);
        this.n = new idz(ieg.a);
    }

    @Override // android.support.v7.app.AppCompatActivity
    public final boolean onSupportNavigateUp() {
        throw null;
    }

    @Override // defpackage.npz
    public final void r() {
        nqj nqjVarL = l();
        if (nqjVarL != null && nqjVarL.q()) {
            this.m = false;
        } else {
            if (this.m) {
                return;
            }
            krd.e("Cast status updated. No active cast session, finishing activity.");
            if (isFinishing()) {
                return;
            }
            finish();
        }
    }

    @Override // defpackage.mwi
    public final void s(String str) {
        if (str.hashCode() == 598892822 && str.equals("CONTENT_NOT_ALLOWED")) {
            krd.e(String.format("Handling %s: Closing activity.", str));
            finish();
        } else {
            krd.e(String.format("Handling %s: Restarting activity.", str));
            onNewIntent(getIntent());
        }
    }

    @Override // defpackage.npz
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.npz
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.npz
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.npz
    public final /* synthetic */ void q() {
    }
}

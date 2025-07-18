package com.google.android.apps.play.movies.common.service.playstore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.by;
import defpackage.idr;
import defpackage.ieg;
import defpackage.ieh;
import defpackage.izo;
import defpackage.jwq;
import defpackage.kfw;
import defpackage.kgu;
import defpackage.kmh;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.ksy;
import defpackage.kwy;
import defpackage.lid;
import defpackage.lie;
import defpackage.lof;
import defpackage.log;
import defpackage.mab;
import defpackage.mdy;
import defpackage.mdz;
import defpackage.mem;
import defpackage.nbt;
import defpackage.nbu;
import defpackage.ntp;
import defpackage.nuh;
import defpackage.pjv;
import defpackage.pkg;
import defpackage.qtl;
import defpackage.rdd;
import defpackage.rfa;
import defpackage.ubv;
import defpackage.ubx;
import defpackage.vtw;
import defpackage.vvd;
import defpackage.wae;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PlayStoreBootstrapActivity extends by implements xce {
    public lie a;
    public mem b;
    public mab c;
    public ieh d;
    public idr e;
    public izo f;
    public xcd g;
    public kmh h;
    public ntp i;
    private int j;
    private String k;
    private int l;
    private ksy m;
    private kwy n;

    private final void a() {
        b(194117);
    }

    private final void b(int i) {
        nuh nuhVarN = pkg.n(i);
        ksn ksnVar = (ksn) getIntent().getParcelableExtra("account");
        ksnVar.getClass();
        nuhVarN.x(rdd.Z(ksnVar.a));
        nuhVarN.x(qtl.ag(nbt.a));
        vvd vvdVar = nbu.c;
        vtw vtwVarM = ubx.a.m();
        vtw vtwVarM2 = ubv.a.m();
        String packageName = getPackageName();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ubv ubvVar = (ubv) vtwVarM2.b;
        packageName.getClass();
        ubvVar.b |= 1;
        ubvVar.c = packageName;
        ubv ubvVar2 = (ubv) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ubx ubxVar = (ubx) vtwVarM.b;
        ubvVar2.getClass();
        ubxVar.e = ubvVar2;
        ubxVar.b |= 4;
        nuhVarN.w(new pjv(vvdVar, (ubx) vtwVarM.r()));
        this.i.w(nuhVarN.y());
    }

    public static void purchase(Context context, mdy mdyVar, ieg<ksy> iegVar, ieg<ksy> iegVar2, ieg<ksy> iegVar3, ieg<ksy> iegVar4, ksn ksnVar, boolean z, boolean z2, int i, String str, lid lidVar) {
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        a.ab(z3);
        mdyVar.a(new Intent(context, (Class<?>) PlayStoreBootstrapActivity.class).putExtra("movie_id", (Parcelable) iegVar.c).putExtra("episode_id", (Parcelable) iegVar2.c).putExtra("season_id", (Parcelable) iegVar3.c).putExtra("show_id", (Parcelable) iegVar4.c).putExtra("account", ksnVar).putExtra("purchases", z).putExtra("rentals", z2).putExtra("event_source", i).putExtra("referrer", str).putExtra("parent_event_id", lidVar));
    }

    public static void purchaseMovie(Context context, mdy mdyVar, ksy ksyVar, ksn ksnVar, boolean z, boolean z2, int i, String str, lid lidVar) {
        a.ab(ksy.v(ksyVar));
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        a.ab(z3);
        mdyVar.a(new Intent(context, (Class<?>) PlayStoreBootstrapActivity.class).putExtra("movie_id", ksyVar).putExtra("account", ksnVar).putExtra("purchases", z).putExtra("rentals", z2).putExtra("event_source", i).putExtra("referrer", str).putExtra("parent_event_id", lidVar));
    }

    public static void purchaseMoviesBundle(Context context, mdy mdyVar, ksy ksyVar, ksn ksnVar, boolean z, boolean z2, int i, String str, lid lidVar) {
        a.ab(ksy.w(ksyVar));
        a.ab(z || z2);
        mdyVar.a(kgu.y(new Intent(context, (Class<?>) PlayStoreBootstrapActivity.class).putExtra("movies_bundle_id", ksyVar).putExtra("account", ksnVar).putExtra("purchases", z).putExtra("rentals", z2).putExtra("suppress_post_success_action", true).putExtra("event_source", i), str).putExtra("parent_event_id", lidVar));
    }

    public static void purchaseSeason(Context context, mdy mdyVar, ksy ksyVar, ksy ksyVar2, ksn ksnVar, boolean z, boolean z2, int i, String str, lid lidVar) {
        a.ab(ksy.x(ksyVar));
        a.ab(ksy.y(ksyVar2));
        boolean z3 = true;
        if (!z && !z2) {
            z3 = false;
        }
        a.ab(z3);
        mdyVar.a(new Intent(context, (Class<?>) PlayStoreBootstrapActivity.class).putExtra("season_id", ksyVar).putExtra("show_id", ksyVar2).putExtra("account", ksnVar).putExtra("purchases", z).putExtra("rentals", z2).putExtra("event_source", i).putExtra("referrer", str).putExtra("parent_event_id", lidVar));
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        return this.g;
    }

    @Override // defpackage.by, defpackage.fl, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 905) {
            if (i2 == -1) {
                a();
                b(1941180);
            } else if (i2 != 0) {
                a();
                b(1941178);
            }
            i = 905;
        }
        if (this.n.e(i, i2, intent)) {
            this.a.at(i2 == -1 ? -1 : 12, this.m, this.j, this.k);
            if (i2 == -1) {
                this.e.c(Long.valueOf(System.currentTimeMillis()));
                this.h.eb();
                ksy ksyVar = this.m;
                if (ksyVar != null) {
                    this.f.e(ksyVar);
                }
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
        finish();
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        ksy ksyVarI;
        wae.y(this);
        super.onCreate(bundle);
        this.n = new kwy(this.c);
        Intent intent = getIntent();
        ieg iegVarA = ieg.a((ksy) intent.getParcelableExtra("episode_id"));
        ieg iegVarA2 = ieg.a((ksy) intent.getParcelableExtra("season_id"));
        ieg iegVarA3 = ieg.a((ksy) intent.getParcelableExtra("show_id"));
        ieg iegVarA4 = ieg.a((ksy) intent.getParcelableExtra("movie_id"));
        ieg iegVarA5 = ieg.a((ksy) intent.getParcelableExtra("movies_bundle_id"));
        a.ab((((iegVarA.m() || iegVarA2.m()) ? 1 : 0) + (iegVarA4.m() ? 1 : 0)) + (iegVarA5.m() ? 1 : 0) == 1);
        ksn ksnVar = (ksn) intent.getParcelableExtra("account");
        ksnVar.getClass();
        a.ab(intent.hasExtra("event_source") && intent.hasExtra("purchases") && intent.hasExtra("rentals"));
        boolean booleanExtra = intent.getBooleanExtra("purchases", false);
        boolean booleanExtra2 = intent.getBooleanExtra("rentals", false);
        boolean booleanExtra3 = intent.getBooleanExtra("suppress_post_success_action", false);
        a.ab(booleanExtra || booleanExtra2);
        if (booleanExtra && booleanExtra2) {
            this.l = 0;
        } else if (booleanExtra) {
            this.l = 1;
        } else {
            this.l = 2;
        }
        this.j = intent.getIntExtra("event_source", -1);
        String stringExtra = intent.getStringExtra("referrer");
        stringExtra.getClass();
        this.k = stringExtra;
        if (bundle != null) {
            this.m = (ksy) bundle.getParcelable("asset_id");
            return;
        }
        lid lidVarC = lid.c((lid) intent.getParcelableExtra("parent_event_id"));
        if (!this.b.d()) {
            jwq.T(this, R.string.error_connection, 1);
            this.a.at(0, (ksy) ksk.c(iegVarA, iegVarA2, iegVarA4, iegVarA5).g(), this.j, this.k);
            finish();
            return;
        }
        rfa rfaVarA = lof.a(this.j, this.k, (ieg) this.d.a());
        rfaVarA.f = ksnVar;
        rfaVarA.m(this.l);
        rfaVarA.q(booleanExtra3);
        if (iegVarA.m()) {
            if (iegVarA2.m() && iegVarA3.m()) {
                String str = ((ksy) iegVarA.g()).b;
                String str2 = ((ksy) iegVarA2.g()).b;
                String str3 = ((ksy) iegVarA3.g()).b;
                rfaVarA.n(20);
                rfaVarA.g = str;
                rfaVarA.i = str2;
                rfaVarA.b = str3;
                rfaVarA.o(log.a(kfw.y(rfaVarA.k(), rfaVarA.l()), (ieg) rfaVarA.e, log.a.buildUpon().appendEncodedPath("tv/show").appendQueryParameter("id", str3).appendQueryParameter("cdid", "tvseason-".concat(str2)).appendQueryParameter("gdid", "tvepisode-".concat(str))));
            } else {
                String str4 = ((ksy) iegVarA.g()).b;
                rfaVarA.n(20);
                rfaVarA.g = str4;
                rfaVarA.o(log.a(kfw.y(rfaVarA.k(), rfaVarA.l()), (ieg) rfaVarA.e, log.a.buildUpon().appendEncodedPath("tv/show").appendQueryParameter("id", "tvepisode-".concat(str4))));
            }
        } else if (iegVarA2.m()) {
            if (iegVarA3.m()) {
                String str5 = ((ksy) iegVarA2.g()).b;
                String str6 = ((ksy) iegVarA3.g()).b;
                rfaVarA.n(19);
                rfaVarA.g = str5;
                rfaVarA.i = str5;
                rfaVarA.b = str6;
                rfaVarA.o(log.a(kfw.y(rfaVarA.k(), rfaVarA.l()), (ieg) rfaVarA.e, log.a.buildUpon().appendEncodedPath("tv/show").appendQueryParameter("id", str6).appendQueryParameter("cdid", "tvseason-".concat(str5))));
            } else {
                String str7 = ((ksy) iegVarA2.g()).b;
                rfaVarA.n(19);
                rfaVarA.g = str7;
                rfaVarA.o(log.a(kfw.y(rfaVarA.k(), rfaVarA.l()), (ieg) rfaVarA.e, log.a.buildUpon().appendEncodedPath("tv/show").appendQueryParameter("id", "tvseason-".concat(str7))));
            }
        } else if (iegVarA4.m()) {
            rfaVarA.p(((ksy) iegVarA4.g()).b);
        } else {
            if (!iegVarA5.m()) {
                throw new RuntimeException("No valid asset given");
            }
            rfaVarA.p(((ksy) iegVarA5.g()).b);
        }
        lof lofVarJ = rfaVarA.j();
        int iZ = kfw.z(this, new mdz(this, 1), lidVarC, lofVarJ);
        int i = lofVarJ.g;
        if (i == 6) {
            ksyVarI = ksy.i(lofVarJ.a);
        } else if (i == 19) {
            ksyVarI = ksy.k(lofVarJ.a);
        } else {
            if (i != 20) {
                throw new IllegalStateException();
            }
            ksyVarI = ksy.h(lofVarJ.a);
        }
        this.m = ksyVarI;
        if (iZ == -1) {
            b(1941179);
        } else {
            this.a.at(iZ, ksyVarI, this.j, this.k);
            finish();
        }
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("asset_id", this.m);
    }
}

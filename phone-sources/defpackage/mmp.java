package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.common.service.playstore.PlayStoreBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmp extends xch implements ieh {
    public mbk A;
    public mta B;
    public gag C;
    private kri D;
    private RecyclerView E;
    private ifb F;
    private ieh G;
    public mlz a;
    public final idr b = new idz(false);
    public lfn c;
    public lie d;
    public iea e;
    public lxj f;
    public iea g;
    public iea h;
    public iea i;
    public SharedPreferences j;
    public ExecutorService k;
    public Executor l;
    public mcd m;
    public mcy n;
    public xhs o;
    public xmc p;
    public xma q;
    public xjd r;
    public xme s;
    public pkg t;
    public pjx u;
    public lys v;
    public lhm w;
    public lyz x;
    public lxp y;
    public lfz z;

    private final void b(Class cls, lhg lhgVar) {
        kff.p(this.E, cls, lhgVar);
    }

    @Override // defpackage.ieh
    public final /* synthetic */ Object a() {
        return getActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [iec, ied] */
    /* JADX WARN: Type inference failed for: r4v13, types: [iec, ied, iee] */
    /* JADX WARN: Type inference failed for: r4v34, types: [ids, iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [iec, ied] */
    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        final Context context = getContext();
        Bundle arguments = getArguments();
        ieg iegVarA = ((ldy) this.e).a();
        final String strB = kgu.B(arguments);
        kvj kvjVar = (kvj) arguments.getParcelable("movie_bundle");
        kvjVar.getClass();
        mlz mlzVar = this.a;
        ieg iegVar = ieg.a;
        mmd mmdVarF = mlzVar.f(bundle, iegVar, iegVar);
        final iea ieaVarE = this.f.e(kvjVar);
        boolean z = true;
        final idw idwVarC = hjt.c(this.z.e(), new lyr(this.v, this.e, z));
        ids idsVarC = this.a.c();
        by activity = getActivity();
        a.ab(activity instanceof mjd);
        ksy ksyVar = kvjVar.a;
        final lif lifVar = new lif(liq.f(418, ksyVar), this.a.e());
        Resources resources = getResources();
        idz idzVar = new idz(iegVar);
        final mdz mdzVar = new mdz(this, 0);
        ?? C = ieb.c(iegVar);
        ieb iebVar = (ieb) C;
        iebVar.k(ieaVarE, this.g, this.x.c(2));
        iebVar.q();
        iebVar.e(ieaVarE);
        iebVar.l();
        iebVar.i(this.k);
        iebVar.n(new mmm(this, 3));
        iea ieaVarA = C.a();
        mlo mloVar = new mlo(new miw(context, mdzVar, iegVarA), new mme(new kqd(activity, 19), strB, activity.getIntent()), new mio(this, getFragmentManager(), this.e, this.h, this.B, this.d));
        idm idmVar = new idm(new miz(new icy(context), 0), 0);
        icy icyVar = new icy(24L);
        iff iffVar = new iff();
        iffVar.f(R.layout.details_bundle_item_card);
        iffVar.c = mloVar;
        iffVar.e = ksd.b();
        iffVar.e(new mcm(8), false);
        miq miqVar = new miq(icyVar, new icy(iffVar.b()), idmVar, new RecyclerView.RecycledViewPool());
        idw idwVarC2 = hjt.c(this.z.e(), new lyr(this.v, this.e, z));
        lqs lqsVar = new lqs(idzVar, this.g, 11);
        lrc lrcVar = new lrc(idwVarC2, lqsVar, idzVar, 9);
        lif lifVar2 = new lif(liq.q("bundle_item_cluster"), this.a.e());
        iea ieaVar = this.h;
        mtv mtvVar = new mtv(context, lqsVar, lrcVar, new mmm(this, 5), new kqd(context, 20), new mmm(lifVar2, 6));
        Executor executor = this.l;
        lxp lxpVar = this.y;
        ?? C2 = ieb.c(iegVar);
        ieb iebVar2 = (ieb) C2;
        iebVar2.k(ieaVarE, idzVar, ieaVar, this.a.c());
        iebVar2.q();
        iebVar2.e(ieaVarE);
        iebVar2.d(new mcm(5));
        C2.p(idwVarC);
        iebVar2.d(new icy(iegVar));
        iebVar2.i(executor);
        idh idhVarD = idh.d();
        idhVarD.e(new mcm(7));
        idhVarD.e(lxpVar.e(kvf.class));
        iebVar2.o(idhVarD.c(mtvVar));
        iebVar2.n(new kro(3));
        iea ieaVarA2 = C2.a();
        nsf nsfVarH = nsf.h(ieaVarE, idwVarC, mmb.g(resources) / 2, this.l, this.a.c(), lifVar, icz.c, this.t, this.u, this.c.cL());
        b(myp.class, new mna(mdzVar, getContext(), kvjVar, strB, 3));
        lxj lxjVar = this.f;
        lxh lxhVar = (lxh) lxjVar;
        mev mevVarA = mev.a(302400000L, lxhVar.h);
        krz krzVar = new krz(iegVar);
        krzVar.a = new ids[]{mevVarA};
        krzVar.c(mevVarA);
        Executor executor2 = lxhVar.b;
        krzVar.b = executor2;
        krzVar.d(new kqd(lxjVar, 5));
        iea ieaVarA3 = krzVar.a();
        krz krzVar2 = new krz(new ltu(18));
        krzVar2.a = new ids[]{ieaVarA3};
        krzVar2.b = executor2;
        krzVar2.b(new ljt(ieaVarA3, 14));
        final iea ieaVarA4 = krzVar2.a();
        final iea ieaVar2 = this.g;
        ids idsVarD = hjt.d(idsVarC, ieaVar2, idzVar);
        final Resources resources2 = getResources();
        final boolean zA = this.o.a();
        final boolean zA2 = this.p.a();
        final boolean zDk = this.c.dk();
        final boolean zCL = this.c.cL();
        krz krzVar3 = new krz(iegVar);
        krzVar3.a = new ids[]{ieaVarE, ieaVarA4, idsVarD};
        krzVar3.d(new ieh() { // from class: mzz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ieh
            public final Object a() {
                idf idfVar = (idf) ieaVarA4.a();
                iea ieaVar3 = ieaVarE;
                if (!((ieg) ieaVar3.a()).m()) {
                    return ieg.a;
                }
                Resources resources3 = resources2;
                kvj kvjVar2 = (kvj) ((ieg) ieaVar3.a()).g();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i2 = kvjVar2.f;
                if (i2 > 0) {
                    String strF = ksi.f(i2);
                    arrayList.add(strF);
                    arrayList2.add(resources3.getString(R.string.accessibility_movie_year, strF));
                }
                UnmodifiableIterator it = kvjVar2.g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    ieg iegVarE = ((ieg) idfVar.b(str)).e(new mzs(2));
                    if (iegVarE.m()) {
                        String str2 = (String) iegVarE.g();
                        arrayList.add(str2);
                        arrayList2.add(resources3.getString(R.string.accessibility_genre, str2));
                        break;
                    }
                    krd.f("Unknown category ID " + str + " for bundle " + kvjVar2.a.toString());
                }
                boolean z2 = zCL;
                return ieg.f(jxl.J(kvjVar2, 0.6939625f, jwq.F(resources3, true, arrayList), jwq.F(resources3, true, arrayList2), kdw.F(ieaVar2, kvjVar2), zA, zA2, false, zDk, z2));
            }
        });
        iea ieaVarA5 = krzVar3.a();
        iff iffVar2 = new iff();
        iffVar2.f(R.layout.details_titlesection);
        iffVar2.c = new mlw(8);
        iffVar2.g(ksd.a());
        iffVar2.d();
        ifc ifcVarC = iffVar2.c();
        if (this.c.dk()) {
            i = 0;
            b(nac.class, new mmn(this, kvjVar, i));
        } else {
            i = 0;
        }
        mmm mmmVar = new mmm(this, 7);
        mmm mmmVar2 = new mmm(this, 8);
        ids[] idsVarArr = new ids[4];
        idsVarArr[i] = idsVarC;
        idsVarArr[1] = this.g;
        idsVarArr[2] = this.i;
        idsVarArr[3] = this.m.a();
        jzs jzsVarW = jzs.w(ieaVarE, idwVarC, mmmVar, mmmVar2, hjt.d(idsVarArr), lifVar, getResources(), this.c.cH(), this.t, this.u, this.c.cL());
        final oxe oxeVarK = oxe.k(new mmo(this, 1));
        mnu.i(this.e, this.d, this.m, this.n, oxeVarK, getResources(), strB, 37, this.E);
        idz idzVar2 = new idz(Boolean.valueOf(mmdVarF.a));
        Resources resources3 = getResources();
        iea ieaVarL = jxl.L(ieaVarE, idzVar2, new mzv(kvjVar, idzVar2, jwq.X(context), lifVar, this.t, this.u, 1));
        iff iffVar3 = new iff();
        iffVar3.f(R.layout.details_synopsis_section);
        iffVar3.e = ksd.b();
        iffVar3.c = new mlw(7);
        iffVar3.d();
        ifc ifcVarC2 = iffVar3.c();
        b(mzt.class, new kad(idzVar2, 9));
        ntp ntpVarG = ntp.g(ieaVarE, this.g, idzVar, this.e, this.a.b, this.j, idwVarC, new mmh(2), idsVarC, this.y.e(kue.class), this.l, resources.getString(R.string.details_out_of_window_movie), new mmo(lifVar, 0), resources, context, false, this.r.a(), this.c.cL(), this.s.a(), this.t);
        final iea ieaVar3 = this.g;
        final ?? r4 = ntpVarG.a;
        final iea ieaVar4 = this.i;
        ids idsVarD2 = hjt.d(idsVarC, this.a.b());
        final boolean zCL2 = this.c.cL();
        pkg pkgVar = this.t;
        final pjx pjxVar = this.u;
        krz krzVar4 = new krz(iegVar);
        krzVar4.a = new ids[]{ieaVarE, ieaVar3, r4, ieaVar4, idsVarD2};
        krzVar4.d(new ieh() { // from class: mwt
            @Override // defpackage.ieh
            public final Object a() {
                iea ieaVar5 = ieaVarE;
                if (((ieg) ieaVar5.a()).m() && idwVarC.b((kvj) ((ieg) ieaVar5.a()).g())) {
                    iea ieaVar6 = r4;
                    if (((ieg) ieaVar6.a()).m()) {
                        pjx pjxVar2 = pjxVar;
                        Context context2 = context;
                        lio lioVar = lifVar;
                        kvj kvjVar2 = (kvj) ((ieg) ieaVar5.a()).g();
                        if (((mxo) ((ieg) ieaVar6.a()).g()).e.m()) {
                            return mnu.u(kvjVar2, ieaVar4, lioVar, context2, pjxVar2);
                        }
                        if (!kuf.b(((mxo) ((ieg) ieaVar6.a()).g()).c.a)) {
                            return ieg.a;
                        }
                        boolean z2 = zCL2;
                        return mnu.y(kvjVar2, trk.a, ieaVar3, R.string.play_first_movie_in_bundle, context2, lioVar, true, false, z2, pjxVar2);
                    }
                }
                return ieg.a;
            }
        });
        iea ieaVarA6 = krzVar4.a();
        ifc ifcVarB = mnu.B(new mmo(lifVar, 10), pkgVar);
        Resources resources4 = context.getResources();
        final iea ieaVar5 = this.e;
        final iea ieaVar6 = this.g;
        final mcy mcyVar = this.n;
        final lzt lztVarA = this.A.a(context);
        kff.p(this.E, mwq.class, new lhg() { // from class: mmx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lhg
            public final void a(lhf lhfVar) throws Resources.NotFoundException {
                mwq mwqVar = (mwq) lhfVar;
                mwv mwvVar = mwqVar.b;
                lio lioVar = mwvVar.c;
                lid lidVarD = nqq.d(lioVar);
                ieh iehVar = ieaVar5;
                ldy ldyVar = (ldy) iehVar;
                if (ldyVar.a().m()) {
                    ieh iehVar2 = ieaVarE;
                    if (((ieg) iehVar2.a()).m()) {
                        ksn ksnVar = (ksn) ldyVar.a().g();
                        kvj kvjVar2 = (kvj) ((ieg) iehVar2.a()).g();
                        int i2 = mwvVar.i;
                        if (i2 == 0) {
                            throw null;
                        }
                        int i3 = i2 - 1;
                        oxe oxeVar = oxeVarK;
                        mcy mcyVar2 = mcyVar;
                        String str = strB;
                        Context context2 = context;
                        mdy mdyVar = mdzVar;
                        switch (i3) {
                            case 2:
                                ksy ksyVar2 = (ksy) kvjVar2.q.get(0);
                                Uri uri = kvjVar2.c;
                                Uri uri2 = kvjVar2.d;
                                ieg iegVar2 = ieg.a;
                                mdyVar.a(BootstrapWatchActivity.createAssetIntent(context2, ksyVar2, iegVar2, iegVar2, uri, uri2, "details", null));
                                return;
                            case 3:
                                PlayStoreBootstrapActivity.purchaseMoviesBundle(context2, mdyVar, kvjVar2.a, ksnVar, true, false, 37, str, lidVarD);
                                return;
                            case 4:
                                PlayStoreBootstrapActivity.purchaseMoviesBundle(context2, mdyVar, kvjVar2.a, ksnVar, false, true, 37, str, lidVarD);
                                return;
                            case 5:
                                PlayStoreBootstrapActivity.purchaseMoviesBundle(context2, mdyVar, kvjVar2.a, ksnVar, true, true, 37, str, lidVarD);
                                return;
                            case 6:
                                idy idyVar = lztVarA;
                                kvc kvcVarA = ((kva) ieaVar6.a()).a(kvjVar2);
                                idyVar.c(new lqm(ksnVar, kvjVar2.a, !kvcVarA.e ? 1 : 0, kvcVarA.g ? 1 : 0));
                                return;
                            case 7:
                            default:
                                return;
                            case 8:
                                mnu.g(iehVar, mcyVar2, oxeVar, kvjVar2.a, true, false, lioVar.b(), mwqVar.a, context2.getResources(), str, 37);
                                return;
                            case 9:
                                mnu.g(iehVar, mcyVar2, oxeVar, kvjVar2.a, false, false, lioVar.b(), mwqVar.a, context2.getResources(), str, 37);
                                return;
                        }
                    }
                }
            }
        });
        pkg pkgVarO = pkg.o(this.g, new krk(this, 12), ksyVar, resources);
        idz idzVar3 = new idz(false);
        oxe oxeVarJ = oxe.j(idzVar3, new ldj(this, ieaVarA, 17), r4, trk.a, this.k, hjt.d(this.g, this.x.c(2), this.w, this.e, ieaVarA));
        mnu.c(this.e, ieaVarA, this.w, mdzVar, idzVar3, getFragmentManager(), this.E);
        rbi rbiVarM = rbi.m(ieaVarE, idwVarC, this.y.e(kvf.class), this.a.c(), this.l, lifVar);
        b(nai.class, new mng(mdzVar, context, new mmm(kvjVar, 0), ieg.f(ksyVar), strB, 2));
        mmm mmmVar3 = new mmm(this, 2);
        iea ieaVar7 = this.g;
        ids idsVarD3 = hjt.d(this.e, this.w);
        lfn lfnVar = this.c;
        boolean zA3 = this.o.a();
        boolean zA4 = this.p.a();
        int i2 = true != this.q.a() ? 2 : 1;
        pkg pkgVar2 = this.t;
        krz krzVar5 = new krz(iegVar);
        krzVar5.a = new ids[]{ieaVarE, r4, ieaVar7, idsVarD3};
        krzVar5.d(new myy(ieaVarE, mmmVar3, r4, ieaVar7, lfnVar, resources, zA3, zA4, i2, 0));
        iea ieaVarA7 = krzVar5.a();
        ifc ifcVarO = jxl.O(lifVar, pkgVar2);
        ntp ntpVar = new ntp((byte[]) null);
        HashMap map = new HashMap();
        int iG = mmb.g(resources);
        Integer numValueOf = Integer.valueOf((iG + iG) / 3);
        iff iffVar4 = new iff();
        iffVar4.f(R.layout.play_movies_header_spacer);
        iffVar4.c = new mlw(0);
        ntpVar.e(numValueOf, iffVar4.a());
        nsfVarH.i(ntpVar);
        ntpVar.c(ieaVarA5, ifcVarC);
        jxl.K(map, resources2);
        jzsVarW.u(ntpVar);
        jzsVarW.t(map);
        ntpVar.c(ieaVarL, ifcVarC2);
        jxl.M(map, resources3);
        ntpVar.c(ieaVarA6, ifcVarB);
        mnu.z(map, resources4);
        pkgVarO.m(ntpVar);
        oxeVarJ.h(ntpVar);
        rbiVarM.j(ntpVar);
        ?? C3 = ieb.c("");
        ieb iebVar3 = (ieb) C3;
        iebVar3.k(ieaVarA2);
        iebVar3.q();
        iebVar3.e(ieaVarA2);
        iebVar3.d(new mcm(6));
        iebVar3.n(new mmm(resources, 4));
        iea ieaVarA8 = C3.a();
        iff iffVar5 = new iff();
        iffVar5.f(R.layout.details_row_title);
        iffVar5.c = new mlw(2);
        iffVar5.g(23L);
        ntpVar.c(ieaVarA8, iffVar5.a());
        iff iffVar6 = new iff();
        iffVar6.f(R.layout.details_bundle_items_row);
        iffVar6.c = miqVar;
        iffVar6.d = miqVar;
        iffVar6.g(24L);
        ntpVar.c(ieaVarA2, iffVar6.c());
        ntpVar.c(ieaVarA7, ifcVarO);
        ntpVar.d(this.h);
        ifb ifbVarB = ntpVar.b();
        this.F = ifbVarB;
        ifbVarB.setHasStableIds(true);
        this.E.setAdapter(this.F);
        this.E.setLayoutManager(this.a.i());
        byte[] bArr = null;
        this.D = ksa.c(new ksa(this.F, 0), new krv(r4, new kde(this, ntpVarG, 5, bArr)));
        this.G = new ldj(idzVar2, idzVar, 18, bArr);
    }

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.g(i, i2, intent, "mobile_movie_object");
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlz mlzVarN = this.C.n(this);
        this.a = mlzVarN;
        RecyclerView recyclerViewA = mlzVarN.a(layoutInflater, viewGroup);
        this.E = recyclerViewA;
        return recyclerViewA;
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        this.E.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("details_view_state", this.G.a());
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        this.D.a();
    }

    @Override // defpackage.bv
    public final void onStop() {
        this.D.b();
        super.onStop();
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        mlz.h(view, (AppCompatActivity) getActivity());
    }
}

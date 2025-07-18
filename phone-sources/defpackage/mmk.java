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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.common.service.playstore.PlayStoreBootstrapActivity;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.apps.play.movies.mobile.presenter.helper.DetailsHeaderListLayout;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmk extends xch implements ieh {
    public xhn A;
    public xjd B;
    public xmj C;
    public xme D;
    public pkg E;
    public pjx F;
    public lys G;
    public lhm H;
    public jan I;
    public lyz J;
    public lxp K;
    public lxm L;
    public lfz M;
    public lqs N;
    public nqq O;
    public mbk P;
    public mta Q;
    public gag R;
    public gag S;
    public gag T;
    private kri U;
    private ifb V;
    RecyclerView a;
    public ieh b;
    public mlz c;
    public boolean d = false;
    public final idr e = new idz(false);
    public kvf f = null;
    public String g = null;
    public lfn h;
    public lie i;
    public iea j;
    public lxj k;
    public iea l;
    public iea m;
    public iea n;
    public SharedPreferences o;
    public mjl p;
    public itk q;
    public ExecutorService r;
    public Executor s;
    public mem t;
    public mcd u;
    public mcy v;
    public ieh w;
    public xhs x;
    public xmc y;
    public xma z;

    private final void e(Class cls, lhg lhgVar) {
        kff.p(this.a, cls, lhgVar);
    }

    @Override // defpackage.ieh
    public final /* synthetic */ Object a() {
        return getActivity();
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [idr, java.lang.Object] */
    public final void b(ksy ksyVar) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        Uri uriH = this.f.h();
        Uri uriG = this.f.g();
        ieg iegVarB = this.L.b(this.f.o());
        if (iegVarB.m()) {
            kvf kvfVar = (kvf) iegVarB.g();
            Uri uriH2 = kvfVar.h();
            uriG = kvfVar.g();
            uriH = uriH2;
        }
        if (this.q.e() == null || ((iua) this.q.e()).d) {
            if (!this.C.a() || this.p.V()) {
                new mdz(this, 0).a(BootstrapWatchActivity.createTrailerIntent(appCompatActivity, kxb.b(ksyVar.b, uriH, uriG), ieg.f(this.f.o()), ieg.a, this.g));
                return;
            }
            msv msvVarA = msw.a(ksyVar);
            msvVarA.i(true);
            msvVarA.e(uriG);
            msvVarA.f(uriH);
            msvVarA.d(ieg.f(this.f.o()));
            InlineLocalWatchFragment inlineLocalWatchFragmentNewInstance = InlineLocalWatchFragment.newInstance(msvVarA.a(), true, this.g);
            cr supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            if (supportFragmentManager.f("TRAILER_PLAYER_FRAGMENT_TAG") != null) {
                supportFragmentManager.M();
            }
            at atVar = new at(supportFragmentManager);
            atVar.s(null);
            atVar.u(R.id.player_container, inlineLocalWatchFragmentNewInstance, "TRAILER_PLAYER_FRAGMENT_TAG");
            atVar.a();
            return;
        }
        vtw vtwVarM = wni.a.m();
        String str = ksyVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((wni) vucVar).b = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((wni) vtwVarM.b).c = a.aJ(7);
        wni wniVar = (wni) vtwVarM.r();
        vtw vtwVarM2 = wpl.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpl wplVar = (wpl) vtwVarM2.b;
        wniVar.getClass();
        wplVar.c = wniVar;
        wplVar.b |= 1;
        wpl wplVar2 = (wpl) vtwVarM2.r();
        vtw vtwVarM3 = wpm.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        wpm wpmVar = (wpm) vtwVarM3.b;
        wplVar2.getClass();
        wpmVar.g = wplVar2;
        wpmVar.b |= 4;
        if (this.q.m((wpm) vtwVarM3.r())) {
            this.R.e.c(true);
        } else {
            krd.f("Failed to initiate remote trailer playback for TrailerId: ".concat(str));
        }
    }

    public final void c() {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if (appCompatActivity != null) {
            boolean zD = d();
            appCompatActivity.invalidateOptionsMenu();
            appCompatActivity.getSupportActionBar().setHomeAsUpIndicator(zD ? 2131231508 : R.drawable.ic_arrow_back_white_24dp);
            appCompatActivity.getSupportActionBar().setHomeActionContentDescription(true != zD ? R.string.accessibility_navigate_up : R.string.accessibility_close_trailer);
            DetailsHeaderListLayout detailsHeaderListLayout = (DetailsHeaderListLayout) getActivity().findViewById(R.id.details_header_list_layout);
            if (detailsHeaderListLayout != null && zD) {
                detailsHeaderListLayout.b(detailsHeaderListLayout.b, 1.0f);
            }
            View viewFindViewById = appCompatActivity.findViewById(R.id.background_image);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(true != zD ? 0 : 8);
            }
        }
        ifb ifbVar = this.V;
        if (ifbVar != null) {
            ifbVar.notifyItemRangeChanged(0, 3);
        }
    }

    public final boolean d() {
        return (((AppCompatActivity) getActivity()) == null || getActivity().getSupportFragmentManager().f("TRAILER_PLAYER_FRAGMENT_TAG") == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [iec, ied] */
    /* JADX WARN: Type inference failed for: r5v10, types: [iec, ied, iee] */
    /* JADX WARN: Type inference failed for: r5v11, types: [iec, ied] */
    /* JADX WARN: Type inference failed for: r6v16, types: [iea, java.lang.Object] */
    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) throws Resources.NotFoundException {
        int i;
        Intent intent;
        int i2;
        int i3;
        char c;
        int i4;
        lio lioVarD;
        Context context;
        int i5;
        ids idsVar;
        super.onActivityCreated(bundle);
        boolean z = true;
        setHasOptionsMenu(true);
        final Context context2 = getContext();
        Bundle arguments = getArguments();
        ieg iegVarA = ((ldy) this.j).a();
        this.g = kgu.B(arguments);
        kvf kvfVar = (kvf) arguments.getParcelable("movie");
        kvfVar.getClass();
        this.f = kvfVar;
        ksy ksyVarO = kvfVar.o();
        wji wjiVarP = liq.p(ksyVarO);
        pjr pjrVarB = ((pke) this.E.b).b(109927);
        pjrVarB.d(qtl.af(wjiVarP, vsz.b));
        pjrVarB.a(getView());
        mlz mlzVar = this.c;
        ieg iegVar = ieg.a;
        mmd mmdVarF = mlzVar.f(bundle, iegVar, iegVar);
        int i6 = 0;
        if (mmdVarF.i) {
            this.G.f((ksn) ((ldy) this.j).a().g(), new mmg(i6));
        }
        Intent intentT = (Intent) arguments.getParcelable("parent_intent");
        if (intentT == null) {
            intentT = jbr.T(context2, new Intent());
        }
        final iea ieaVarD = this.k.d(this.f);
        final idw idwVarC = hjt.c(this.M.e(), new lyr(this.G, this.j, z), new mcb(this, 3));
        ids idsVarC = this.c.c();
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        a.ab(appCompatActivity instanceof mjd);
        if (this.f.V()) {
            mlz mlzVar2 = this.c;
            c = 16;
            ktz ktzVar = ktz.a;
            i3 = 2;
            wij wijVarL = liq.l(ksyVarO.n());
            i2 = 0;
            String str = ksyVarO.b;
            i4 = 4;
            kys kysVar = kys.a;
            i = 1;
            vtw vtwVarM = wik.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            intent = intentT;
            wik wikVar = (wik) vucVar;
            wikVar.c = wijVarL.q;
            wikVar.b |= 1;
            wii wiiVar = wii.YOUTUBE_ID;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wik wikVar2 = (wik) vucVar2;
            wikVar2.d = wiiVar.h;
            wikVar2.b |= 2;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            wik wikVar3 = (wik) vucVar3;
            wikVar3.b |= 4;
            wikVar3.e = str;
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            wik wikVar4 = (wik) vtwVarM.b;
            wikVar4.b |= 16;
            wikVar4.g = 3;
            wik wikVar5 = (wik) vtwVarM.r();
            vtw vtwVarM2 = wji.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wji wjiVar = (wji) vtwVarM2.b;
            wikVar5.getClass();
            wjiVar.c = wikVar5;
            wjiVar.b |= 1;
            if (ktzVar != null) {
                vtwVarM2.aI(liq.n(ktzVar));
            }
            lioVarD = new lif(liq.j(401, (wji) vtwVarM2.r(), kysVar), mlzVar2.e());
        } else {
            i = 1;
            intent = intentT;
            i2 = 0;
            i3 = 2;
            c = 16;
            i4 = 4;
            lioVarD = this.c.d(ksyVarO);
        }
        final lio lioVar = lioVarD;
        Resources resources = getResources();
        int integer = resources.getInteger(R.integer.watch_suggestions_max_items);
        mnf mnfVar = new mnf(ieaVarD);
        mmt mmtVar = new mmt(i);
        final idz idzVar = new idz(iegVar);
        ?? C = ieb.c(iegVar);
        ids[] idsVarArr = new ids[3];
        idsVarArr[i2] = ieaVarD;
        idsVarArr[i] = this.l;
        idsVarArr[i3] = this.t;
        ieb iebVar = (ieb) C;
        iebVar.k(idsVarArr);
        iebVar.q();
        iebVar.e(ieaVarD);
        iebVar.d(new mcm(i4));
        iebVar.i(this.r);
        iebVar.n(new lff(this, mmdVarF, 5, null));
        iea ieaVarA = C.a();
        final mdz mdzVar = new mdz(this, i2);
        lxj lxjVar = this.k;
        kvf kvfVar2 = this.f;
        lxh lxhVar = (lxh) lxjVar;
        idf idfVarE = lxhVar.k.e(kvf.class);
        lfz lfzVar = lxhVar.m;
        idw idwVarE = lfzVar.e();
        krz krzVar = new krz(iegVar);
        ids[] idsVarArr2 = new ids[i3];
        idsVarArr2[0] = lxhVar.e;
        idsVarArr2[1] = lfzVar.c();
        krzVar.a = idsVarArr2;
        krzVar.b = lxhVar.a;
        krzVar.d(new lxf(lxhVar, (Object) kvfVar2, idfVarE, (Object) idwVarE, 3));
        iea ieaVarA2 = krzVar.a();
        mml mmlVar = new mml(new lif(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, lioVar), new mru(context2, getFragmentManager(), this.O), this.l, mjo.p(context2, 0.0f) * 3);
        idm idmVar = new idm(new miz(new icy(context2), 0), 0);
        icy icyVar = new icy(10L);
        iff iffVar = new iff();
        iffVar.f(R.layout.cluster_item_movie_extra);
        idh idhVarD = idh.d();
        idhVarD.e(ldh.a);
        iffVar.e = idhVarD.b(ksd.c(0L));
        iffVar.c = new mnn(mmlVar, 1);
        miq miqVar = new miq(icyVar, new icy(iffVar.b()), idmVar, new RecyclerView.RecycledViewPool());
        ?? C2 = ieb.c(iegVar);
        ieb iebVar2 = (ieb) C2;
        iebVar2.k(ieaVarD, ieaVarA2, idsVarC);
        iebVar2.q();
        iebVar2.e(ieaVarD);
        iebVar2.d(new mcm(4));
        C2.p(idwVarC);
        iebVar2.d(new icy(iegVar));
        iebVar2.e(ieaVarA2);
        iebVar2.d(new icy(iegVar));
        iebVar2.n(new kro(3));
        iea ieaVarA3 = C2.a();
        ?? C3 = ieb.c(iegVar);
        ieb iebVar3 = (ieb) C3;
        iebVar3.k(ieaVarD, this.l, this.J.c(2));
        iebVar3.q();
        iebVar3.e(ieaVarD);
        iebVar3.l();
        iebVar3.i(this.r);
        iebVar3.n(this.N);
        iea ieaVarA4 = C3.a();
        idz idzVar2 = new idz(iegVar);
        iea idzVar3 = this.h.cL() ? new idz(ImmutableList.of()) : this.T.q(ksyVarO, idzVar2, integer);
        int iP = mjo.p(context2, getResources().getDimension(R.dimen.movies_cluster_card_side_padding));
        final cr supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        if (this.C.a()) {
            final mmj mmjVar = new mmj(this, supportFragmentManager);
            supportFragmentManager.aq(mmjVar);
            supportFragmentManager.m(new cn() { // from class: mmf
                @Override // defpackage.cn
                public final void b() {
                    supportFragmentManager.aq(mmjVar);
                    this.a.c();
                }

                @Override // defpackage.cn
                public final /* synthetic */ void a() {
                }

                @Override // defpackage.cn
                public final /* synthetic */ void c() {
                }

                @Override // defpackage.cn
                public final /* synthetic */ void d() {
                }

                @Override // defpackage.cn
                public final /* synthetic */ void e() {
                }
            });
            c();
        }
        int iG = mmb.g(resources);
        nsf nsfVarH = nsf.h(ieaVarD, idwVarC, iG / 3, this.s, this.c.c(), lioVar, new krk(this, 9), this.E, this.F, this.h.cL());
        e(myp.class, new kad(this, 8));
        final iea ieaVar = this.l;
        ids idsVarD = hjt.d(idsVarC, ieaVar, idzVar);
        final Resources resources2 = getResources();
        final boolean zA = this.x.a();
        final boolean zA2 = this.y.a();
        final boolean zDk = this.h.dk();
        final boolean zCL = this.h.cL();
        krz krzVar2 = new krz(iegVar);
        krzVar2.a = new ids[]{ieaVarD, idsVarD};
        krzVar2.d(new ieh() { // from class: naa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ieh
            public final Object a() {
                boolean z2;
                iea ieaVar2 = ieaVarD;
                if (!((ieg) ieaVar2.a()).m()) {
                    return ieg.a;
                }
                Resources resources3 = resources2;
                kvf kvfVar3 = (kvf) ((ieg) ieaVar2.a()).g();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (kvfVar3.d() > 0) {
                    String strF = ksi.f(kvfVar3.d());
                    arrayList.add(strF);
                    arrayList2.add(resources3.getString(R.string.accessibility_movie_year, strF));
                }
                if (kvfVar3.c() > 0) {
                    Integer numValueOf = Integer.valueOf(kvfVar3.c() / 60);
                    arrayList.add(resources3.getString(R.string.movie_duration, numValueOf));
                    arrayList2.add(resources3.getString(R.string.accessibility_movie_duration, numValueOf));
                }
                UnmodifiableIterator it = kvfVar3.r().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((kte) it.next()).d == kzq.PRIMARY_DESCRIPTIVE) {
                        z2 = true;
                        break;
                    }
                }
                boolean z3 = zCL;
                return ieg.f(jxl.J(kvfVar3, 0.6939625f, jwq.F(resources3, true, arrayList), jwq.F(resources3, true, arrayList2), kdw.E(ieaVar, kvfVar3), zA, zA2, z2, zDk, z3));
            }
        });
        iea ieaVarA5 = krzVar2.a();
        iff iffVar2 = new iff();
        iffVar2.f(R.layout.details_titlesection);
        iffVar2.c = new mlw(8);
        iffVar2.g(ksd.a());
        iffVar2.d();
        ifc ifcVarC = iffVar2.c();
        e(nab.class, new kad(ieaVarD, 18));
        iea ieaVar2 = this.l;
        iea ieaVar3 = this.j;
        idt idtVar = this.c.b;
        SharedPreferences sharedPreferences = this.o;
        mmh mmhVar = new mmh(0);
        idf idfVarE2 = this.K.e(kue.class);
        Executor executor = this.s;
        String string = resources.getString(R.string.details_out_of_window_movie);
        kqd kqdVar = new kqd(lioVar, 15);
        boolean zC = this.A.c();
        if (((ieg) ieaVarD.a()).m()) {
            ((kvf) ((ieg) ieaVarD.a()).g()).V();
        }
        Intent intent2 = intent;
        ntp ntpVarG = ntp.g(ieaVarD, ieaVar2, idzVar, ieaVar3, idtVar, sharedPreferences, idwVarC, mmhVar, idsVarC, idfVarE2, executor, string, kqdVar, resources, context2, zC, this.B.a(), this.h.cL(), this.D.a(), this.E);
        mnu.e(this.j, idzVar, this.c.b, new kqd(lioVar, 16), getActivity().getSupportFragmentManager(), this.o, getView(), this.F);
        final lxt lxtVar = new lxt(this, 20);
        final mmm mmmVar = new mmm(this, 1);
        ids idsVarD2 = hjt.d(idsVarC, this.l, this.n, this.u.a(), idzVar);
        Resources resources3 = getResources();
        final lqs lqsVar = new lqs(idzVar, this.l, 11);
        kqd kqdVar2 = new kqd(this, 17);
        final boolean zCH = this.h.cH();
        pkg pkgVar = this.E;
        pjx pjxVar = this.F;
        final boolean zCL2 = this.h.cL();
        krz krzVar3 = new krz(iegVar);
        krzVar3.a = new ids[]{ieaVarD, idsVarD2};
        krzVar3.d(new ieh() { // from class: nar
            @Override // defpackage.ieh
            public final Object a() {
                iea ieaVar4 = ieaVarD;
                if (!((ieg) ieaVar4.a()).m() || !idwVarC.b((kst) ((ieg) ieaVar4.a()).g())) {
                    return ieg.a;
                }
                kst kstVar = (kst) ((ieg) ieaVar4.a()).g();
                ksy ksyVarO2 = kstVar.o();
                boolean z2 = false;
                if (kstVar instanceof kvf) {
                    ieh iehVar = idzVar;
                    Object objB = lqsVar.b((kvf) kstVar);
                    if (((ieg) iehVar.a()).m() && ((kuf) ((ieg) iehVar.a()).g()).equals(kuf.a)) {
                        ieg iegVar2 = (ieg) objB;
                        if (iegVar2.m() && ((kxg) iegVar2.g()).equals(kxg.a)) {
                            z2 = true;
                        }
                    }
                }
                boolean z3 = zCL2;
                boolean z4 = zCH;
                idf idfVar = mmmVar;
                idf idfVar2 = lxtVar;
                nat natVarA = nau.a();
                natVarA.a = ((kwz) kstVar).E();
                natVarA.b = jys.ab((kwi) kstVar);
                natVarA.e((kxe) idfVar.b(ksyVarO2));
                natVarA.g(((Boolean) idfVar2.b(ksyVarO2)).booleanValue());
                natVarA.f(z2);
                natVarA.d(true);
                natVarA.b(z4);
                natVarA.c(z3);
                return ieg.f(natVarA.a());
            }
        });
        jzs jzsVar = new jzs(krzVar3.a(), lioVar, resources3, kqdVar2, pkgVar, pjxVar, zCL2);
        final oxe oxeVarK = oxe.k(new kqd(this, 18));
        iea ieaVar4 = this.j;
        lie lieVar = this.i;
        mcd mcdVar = this.u;
        mcy mcyVar = this.v;
        Resources resources4 = getResources();
        String str2 = this.g;
        RecyclerView recyclerView = this.a;
        kqd kqdVar3 = new kqd(this, 11);
        kqd kqdVar4 = new kqd(this, 12);
        iea ieaVar5 = this.m;
        mta mtaVar = this.Q;
        mnu.i(ieaVar4, lieVar, mcdVar, mcyVar, oxeVarK, resources4, str2, 37, recyclerView);
        kff.p(recyclerView, nak.class, new mmz(ieaVarD, kqdVar3, kqdVar4, ieaVar4, ieaVar5, mtaVar, lieVar, 2));
        idz idzVar4 = new idz(Boolean.valueOf(mmdVarF.a));
        iea ieaVarL = jxl.L(ieaVarD, idzVar4, new mzv(this.f, idzVar4, jwq.X(context2), lioVar, this.E, this.F, 0));
        Resources resources5 = context2.getResources();
        iff iffVar3 = new iff();
        iffVar3.f(R.layout.details_synopsis_section);
        iffVar3.e = ksd.b();
        iffVar3.c = new mlw(7);
        iffVar3.d();
        ifc ifcVarC2 = iffVar3.c();
        e(mzt.class, new kad(idzVar4, 4));
        ksf ksfVarA = ksf.a();
        ksfVarA.d(3000L);
        lxt lxtVar2 = new lxt(this, 19);
        final ?? r6 = ntpVarG.a;
        iea ieaVar6 = this.l;
        ids idsVarD3 = hjt.d(this.j, this.H);
        lfn lfnVar = this.h;
        boolean zA3 = this.x.a();
        boolean zA4 = this.y.a();
        int i7 = true != this.z.a() ? 2 : 1;
        pkg pkgVar2 = this.E;
        AtomicReference atomicReference = new AtomicReference(false);
        ksfVarA.ea(new lll(atomicReference, 17, null));
        idzVar3.ea(new lll(atomicReference, 18, null));
        krz krzVar4 = new krz(iegVar);
        krzVar4.a = new ids[]{ieaVarD, r6, ieaVar6, idsVarD3, idzVar3, ksfVarA};
        krzVar4.c(new mpw(atomicReference, idzVar3, 5));
        krzVar4.d(new myy(ieaVarD, lxtVar2, r6, ieaVar6, lfnVar, resources, zA3, zA4, i7, 1));
        iea ieaVarA6 = krzVar4.a();
        ifc ifcVarO = jxl.O(lioVar, pkgVar2);
        final iea ieaVar7 = this.l;
        final iea ieaVar8 = this.n;
        ids idsVarD4 = hjt.d(idsVarC, this.c.b());
        this.A.c();
        final lys lysVar = this.G;
        final ksn ksnVar = (ksn) iegVarA.g();
        final boolean zA5 = this.A.a();
        final boolean zA6 = this.B.a();
        final boolean zCL3 = this.h.cL();
        final boolean zA7 = this.D.a();
        pkg pkgVar3 = this.E;
        final pjx pjxVar2 = this.F;
        krz krzVar5 = new krz(iegVar);
        krzVar5.a = new ids[]{ieaVarD, ieaVar7, r6, ieaVar8, idsVarD4};
        krzVar5.d(new ieh() { // from class: mwr
            @Override // defpackage.ieh
            public final Object a() {
                int i8;
                iea ieaVar9 = ieaVarD;
                mnu.C((kvf) ((ieg) ieaVar9.a()).g(), lysVar.a(ksnVar), zA5);
                if (((ieg) ieaVar9.a()).m() && idwVarC.b((kvf) ((ieg) ieaVar9.a()).g())) {
                    iea ieaVar10 = r6;
                    if (((ieg) ieaVar10.a()).m()) {
                        pjx pjxVar3 = pjxVar2;
                        Context context3 = context2;
                        lio lioVar2 = lioVar;
                        kvf kvfVar3 = (kvf) ((ieg) ieaVar9.a()).g();
                        if (((mxo) ((ieg) ieaVar10.a()).g()).e.m()) {
                            return mnu.u(kvfVar3, ieaVar8, lioVar2, context3, pjxVar3);
                        }
                        boolean z2 = zCL3;
                        mxe mxeVar = ((mxo) ((ieg) ieaVar10.a()).g()).c;
                        kuf kufVar = mxeVar.a;
                        if (kuf.b(kufVar)) {
                            iea ieaVar11 = ieaVar7;
                            return mnu.y(kvfVar3, trk.a, ieaVar11, z2 ? R.string.watch : (!zA6 || (i8 = ((kva) ieaVar11.a()).b(kvfVar3.o()).d) == 0 || i8 >= kvfVar3.c() + (-5)) ? R.string.play : R.string.resume, context3, lioVar2, true, false, z2, pjxVar3);
                        }
                        ieg iegVarS = mnu.s(kufVar, kvfVar3.dY());
                        if (!iegVarS.k()) {
                            return mnu.t((kxg) iegVarS.g(), trk.a, mxeVar.d, lioVar2, context3, z2, zA7, pjxVar3);
                        }
                        iegVarS.p();
                        return iegVarS;
                    }
                }
                return ieg.a;
            }
        });
        iea ieaVarA7 = krzVar5.a();
        ifc ifcVarB = mnu.B(new mmo(lioVar, 9), pkgVar3);
        Resources resources6 = context2.getResources();
        final iea ieaVar9 = this.j;
        final iea ieaVar10 = this.l;
        final mcy mcyVar2 = this.v;
        final lzt lztVarA = this.P.a(context2);
        final String str3 = this.g;
        this.A.b();
        final jan janVar = this.I;
        e(mwq.class, new lhg() { // from class: mmw
            @Override // defpackage.lhg
            public final void a(lhf lhfVar) throws Resources.NotFoundException {
                mwq mwqVar = (mwq) lhfVar;
                mwv mwvVar = mwqVar.b;
                lio lioVar2 = mwvVar.c;
                lid lidVarD = nqq.d(lioVar2);
                if (lidVarD == null) {
                    lidVarD = lid.a();
                }
                lid lidVar = lidVarD;
                ieh iehVar = ieaVar9;
                ldy ldyVar = (ldy) iehVar;
                if (ldyVar.a().m()) {
                    ieh iehVar2 = ieaVarD;
                    if (((ieg) iehVar2.a()).m()) {
                        ksn ksnVar2 = (ksn) ldyVar.a().g();
                        kvf kvfVar3 = (kvf) ((ieg) iehVar2.a()).g();
                        int i8 = mwvVar.i;
                        if (i8 == 0) {
                            throw null;
                        }
                        int i9 = i8 - 1;
                        oxe oxeVar = oxeVarK;
                        mcy mcyVar3 = mcyVar2;
                        String str4 = str3;
                        mdy mdyVar = mdzVar;
                        Context context3 = context2;
                        switch (i9) {
                            case 1:
                                tst tstVar = mwvVar.e;
                                if (tstVar.g()) {
                                    ksy ksyVarO2 = kvfVar3.o();
                                    ieg iegVar2 = ieg.a;
                                    WatchActionBootstrapActivity.startWatchActionActivityOrOpenPlayStore(context3, mdyVar, ksnVar2, ksyVarO2, iegVar2, iegVar2, tstVar, lidVar);
                                    return;
                                }
                                return;
                            case 2:
                                try {
                                    krd.e(jbr.u(janVar.q(context3, wll.a, kuf.a.b, a.ao(kvfVar3.o().b), "details", false)));
                                    return;
                                } catch (Exception e) {
                                    krd.c("Failed to log WatchAction result with exception ".concat(String.valueOf(e.getMessage())));
                                    return;
                                }
                            case 3:
                                PlayStoreBootstrapActivity.purchaseMovie(context3, mdyVar, kvfVar3.o(), ksnVar2, true, false, 37, str4, lidVar);
                                return;
                            case 4:
                                PlayStoreBootstrapActivity.purchaseMovie(context3, mdyVar, kvfVar3.o(), ksnVar2, false, true, 37, str4, lidVar);
                                return;
                            case 5:
                                PlayStoreBootstrapActivity.purchaseMovie(context3, mdyVar, kvfVar3.o(), ksnVar2, true, true, 37, str4, lidVar);
                                return;
                            case 6:
                                idy idyVar = lztVarA;
                                kvc kvcVarA = ((kva) ieaVar10.a()).a(kvfVar3);
                                idyVar.c(new lqm(ksnVar2, kvfVar3.o(), !kvcVarA.e ? 1 : 0, kvcVarA.g ? 1 : 0));
                                return;
                            case 7:
                            default:
                                return;
                            case 8:
                                mnu.g(iehVar, mcyVar3, oxeVar, kvfVar3.o(), true, false, lioVar2.b(), mwqVar.a, context3.getResources(), str4, 37);
                                return;
                            case 9:
                                mnu.g(iehVar, mcyVar3, oxeVar, kvfVar3.o(), false, false, lioVar2.b(), mwqVar.a, context3.getResources(), str4, 37);
                                return;
                        }
                    }
                }
            }
        });
        pkg pkgVarO = pkg.o(this.l, new krk(this, 8), ksyVarO, resources);
        idz idzVar5 = new idz(false);
        ldj ldjVar = new ldj(this, ieaVarA4, 16);
        ExecutorService executorService = this.r;
        ids idsVarD5 = hjt.d(this.l, this.J.c(2), this.H, this.j, ieaVarA4);
        Resources resources7 = getResources();
        uje ujeVarA = mwh.a();
        ujeVarA.f(resources7.getString(R.string.welcome_title_family_library));
        ujeVarA.e(resources7.getString(R.string.welcome_instructions_family_library));
        ujeVarA.a = tst.i(Integer.valueOf(R.drawable.ic_family_library_welcome_card));
        reo reoVarA = mwf.a();
        reoVarA.e(resources7.getString(R.string.welcome_button_label_get_started));
        reoVarA.d(true);
        ujeVarA.b = tst.i(reoVarA.c());
        reo reoVarA2 = mwf.a();
        reoVarA2.e(resources7.getString(R.string.welcome_button_label_no_thanks));
        reoVarA2.d(false);
        ujeVarA.c = tst.i(reoVarA2.c());
        oxe oxeVarJ = oxe.j(idzVar5, ldjVar, r6, tst.i(ujeVarA.d()), executorService, idsVarD5);
        mnu.c(this.j, ieaVarA4, this.H, mdzVar, idzVar5, getFragmentManager(), this.a);
        e(mzq.class, new mmn(this, intent2, 1));
        e(mzr.class, new kad(idzVar2, 5));
        rbi rbiVarM = rbi.m(ieaVarD, idwVarC, this.K.e(kvf.class), this.c.c(), this.s, lioVar);
        if (this.h.dk()) {
            e(nac.class, new kad(this, 6));
        }
        e(nai.class, new kad(this, 7));
        ntp ntpVar = new ntp((byte[]) null);
        HashMap map = new HashMap();
        if (this.C.a()) {
            krk krkVar = new krk(this, 9);
            iff iffVar4 = new iff();
            iffVar4.f(R.layout.play_movies_header_spacer);
            bv bvVar = this.c.a;
            context = context2;
            final int iC = bvVar.getResources().getConfiguration().orientation == 2 ? 0 : mmb.c(bvVar.getResources()) - mmb.g(bvVar.getResources());
            iffVar4.c = new icv() { // from class: mlx
                @Override // defpackage.icv
                public final void a(Object obj, Object obj2) {
                    ((View) obj2).findViewById(R.id.play_header_spacer).setMinimumHeight(true != ((idb) obj).a() ? 0 : iC);
                }
            };
            ntpVar.e(krkVar, iffVar4.a());
        } else {
            context = context2;
        }
        Integer numValueOf = Integer.valueOf((iG + iG) / 3);
        iff iffVar5 = new iff();
        iffVar5.f(R.layout.play_movies_header_spacer);
        iffVar5.c = new mlw(0);
        ntpVar.e(numValueOf, iffVar5.a());
        nsfVarH.i(ntpVar);
        ntpVar.c(ieaVarA5, ifcVarC);
        jxl.K(map, resources2);
        jzsVar.u(ntpVar);
        jzsVar.t(map);
        ntpVar.c(ieaVarL, ifcVarC2);
        jxl.M(map, resources5);
        ntpVar.c(ieaVarA7, ifcVarB);
        mnu.z(map, resources6);
        pkgVarO.m(ntpVar);
        oxeVarJ.h(ntpVar);
        rbiVarM.j(ntpVar);
        iff iffVar6 = new iff();
        iffVar6.f(R.layout.details_extras_title);
        iffVar6.g(15L);
        ntpVar.c(ieaVarA3, iffVar6.c());
        iff iffVar7 = new iff();
        iffVar7.f(R.layout.details_row);
        iffVar7.c = miqVar;
        iffVar7.d = miqVar;
        iffVar7.g(10L);
        ntpVar.c(ieaVarA3, iffVar7.c());
        if (this.h.cL()) {
            i5 = 4;
            idsVar = r6;
        } else {
            Context context3 = getContext();
            lxm lxmVar = this.L;
            iea ieaVar11 = this.l;
            i5 = 4;
            idsVar = r6;
            mru.b(context3, idzVar3, new mnb(lioVar, context, lxmVar, ieaVar11, mmtVar, iP, this.E, this.F), new mmr(ieaVarD, idwVarC, 1), hjt.d(ieaVarD, ieaVar11, idsVarC, lxmVar.a()), this.E).f(ntpVar);
        }
        ntpVar.c(ieaVarA6, ifcVarO);
        ntpVar.d(this.m);
        ifb ifbVarB = ntpVar.b();
        this.V = ifbVarB;
        ifbVarB.setHasStableIds(true);
        this.a.setAdapter(this.V);
        this.a.setLayoutManager(this.c.i());
        kri[] kriVarArr = new kri[i5];
        byte[] bArr = null;
        kriVarArr[0] = krv.c(ieaVarA, new krn(this, idzVar, 13, bArr));
        kriVarArr[1] = new krv(idsVar, new kde(this, ntpVarG, i5, bArr));
        kriVarArr[2] = new krv(hjt.d(this.m, ieaVarD), mnfVar);
        kriVarArr[3] = new ksa(this.V, 0);
        this.U = ksa.c(kriVarArr);
        this.b = new lxf(this, (idr) idzVar4, (idr) idzVar, iegVarA, 5);
    }

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.c.g(i, i2, intent, "mobile_movie_object");
    }

    @Override // defpackage.bv
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_search);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(!d());
        }
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlz mlzVarN = this.S.n(this);
        this.c = mlzVarN;
        RecyclerView recyclerViewA = mlzVarN.a(layoutInflater, viewGroup);
        this.a = recyclerViewA;
        return recyclerViewA;
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        this.a.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("details_view_state", this.b.a());
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        this.U.a();
    }

    @Override // defpackage.bv
    public final void onStop() {
        this.U.b();
        this.d = true;
        super.onStop();
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        if (getActivity() instanceof AppCompatActivity) {
            mlz.h(view, (AppCompatActivity) getActivity());
        }
        this.a.addItemDecoration(new mmi(this));
    }
}

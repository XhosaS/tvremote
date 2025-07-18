package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.common.service.playstore.PlayStoreBootstrapActivity;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmv extends xch implements ieh {
    public lys A;
    public lhm B;
    public jan C;
    public lyz D;
    public lxp E;
    public lxm F;
    public lfz G;
    public mta H;
    public gag I;
    public gag J;
    public gag K;
    private kri L;
    private RecyclerView M;
    private ieh N;
    public mlz a;
    public final idr b = new idz(false);
    public lfn c;
    public lie d;
    public iea e;
    public lxj f;
    public iea g;
    public iea h;
    public lxj i;
    public iea j;
    public SharedPreferences k;
    public itk l;
    public ExecutorService m;
    public Executor n;
    public mem o;
    public mcd p;
    public mcy q;
    public ieh r;
    public pkg s;
    public xhs t;
    public xmc u;
    public xkc v;
    public xhn w;
    public xjd x;
    public xme y;
    public pjx z;

    private final void b(Class cls, lhg lhgVar) {
        kff.p(this.M, cls, lhgVar);
    }

    @Override // defpackage.ieh
    public final /* synthetic */ Object a() {
        return getActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [iec, ied] */
    /* JADX WARN: Type inference failed for: r1v86, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v87, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [iec, ied] */
    @Override // defpackage.bv
    public final void onActivityCreated(Bundle bundle) throws Resources.NotFoundException {
        kwn kwnVar;
        Context context;
        lio lioVar;
        ids idsVar;
        byte[] bArr;
        super.onActivityCreated(bundle);
        final Context context2 = getContext();
        Bundle arguments = getArguments();
        final String strB = kgu.B(arguments);
        kwn kwnVar2 = (kwn) arguments.getParcelable("show");
        kwnVar2.getClass();
        ksy ksyVar = kwnVar2.d;
        wji wjiVarP = liq.p(ksyVar);
        pjr pjrVarB = ((pke) this.s.b).b(109927);
        pjrVarB.d(qtl.af(wjiVarP, vsz.b));
        pjrVarB.a(getView());
        mmd mmdVarF = this.a.f(bundle, ieg.a((ksy) arguments.getParcelable("season_id")), ieg.a(Integer.valueOf(arguments.getInt("season_selection_location"))));
        by activity = getActivity();
        a.ab(activity instanceof mjd);
        Intent intentT = (Intent) arguments.getParcelable("parent_intent");
        if (intentT == null) {
            intentT = jbr.T(context2, new Intent());
        }
        lio lioVarD = this.a.d(ksyVar);
        final iea ieaVarH = this.f.h(kwnVar2);
        final idw idwVarC = hjt.c(this.G.e(), new lyr(this.A, this.e, false), new mcb(this, 4));
        mxz mxzVar = new mxz(idwVarC, ieaVarH, kwnVar2, 1);
        ids idsVarC = this.a.c();
        int integer = getResources().getInteger(R.integer.watch_suggestions_max_items);
        mmt mmtVar = new mmt(0);
        ieg iegVar = ieg.a;
        final idz idzVar = new idz(iegVar);
        idz idzVar2 = new idz(iegVar);
        Intent intent = intentT;
        lxj lxjVar = this.i;
        krz krzVar = new krz(iegVar);
        lxh lxhVar = (lxh) lxjVar;
        krzVar.a = new ids[]{lxhVar.h, lxhVar.e};
        krzVar.b = lxhVar.b;
        krzVar.d(new ldj(lxjVar, ksyVar, 10));
        final iea ieaVarA = krzVar.a();
        idz idzVar3 = new idz(mmdVarF.f);
        final mdz mdzVar = new mdz(this, 0);
        lxh lxhVar2 = (lxh) this.f;
        lxp lxpVar = lxhVar2.k;
        idf idfVarD = lxpVar.d(lcg.class);
        idf idfVarC = idh.d().c(new ltu(17));
        idf idfVar = lxpVar.a;
        idh idhVarD = idh.d();
        idhVarD.e(idfVar);
        idhVarD.f(lbj.a(kwl.class));
        idf idfVarB = idhVarD.b(new kro(5));
        idh idhVarD2 = idh.d();
        idhVarD2.g(lxw.a);
        idf idfVarA = idhVarD2.a();
        krz krzVar2 = new krz(iegVar);
        krzVar2.a = new ids[]{lxhVar2.i.c(4), lxhVar2.h, lxhVar2.c, lxhVar2.d, lxhVar2.f};
        krzVar2.b = lxhVar2.b;
        krzVar2.d(new mms(idfVarD, ksyVar, idfVarC, idfVarB, idfVarA, 1));
        iea ieaVarA2 = krzVar2.a();
        ?? C = ieb.c(iegVar);
        ieb iebVar = (ieb) C;
        iebVar.k(ieaVarA2, this.g);
        iebVar.q();
        iebVar.e(ieaVarA2);
        iebVar.d(new mcm(9));
        iebVar.i(this.m);
        iebVar.n(new mne(ksyVar, mmdVarF, this.E.f(kwq.class), this.g, this.c.cg()));
        iea ieaVarA3 = C.a();
        lxj lxjVar2 = this.f;
        ?? C2 = ieb.c(iegVar);
        ieb iebVar2 = (ieb) C2;
        iebVar2.k(idzVar);
        iebVar2.q();
        iebVar2.e(idzVar);
        iebVar2.d(new mcm(9));
        iebVar2.n(new mcm(10));
        iea ieaVarA4 = C2.a();
        Exception exc = new Exception();
        idh idhVarD3 = idh.d();
        lxh lxhVar3 = (lxh) lxjVar2;
        lxp lxpVar2 = lxhVar3.k;
        idhVarD3.e(lxpVar2.d(lcd.class));
        idhVarD3.e(new jxt(lcd.a, 6));
        idhVarD3.e(new ltu(14));
        idf idfVarC2 = idhVarD3.c(new ltu(15));
        idh idhVarD4 = idh.d();
        idhVarD4.e(new ltu(16));
        iea ieaVar = lxhVar3.h;
        lyz lyzVar = lxhVar3.i;
        idhVarD4.e(new lrc(new krr(2), idfVarC2, new lza(ieaVar, lyzVar), 1));
        idhVarD4.e(lxpVar2.e(kuo.class));
        idhVarD4.g(lxw.b);
        jxt jxtVar = new jxt(idhVarD4.b(new kro(3)), 8);
        krz krzVar3 = new krz(iegVar);
        krzVar3.a = new ids[]{ieaVarA4};
        krzVar3.d(new ldj(ieaVarA4, exc, 6, null));
        iea ieaVarA5 = krzVar3.a();
        krz krzVar4 = new krz(iegVar);
        krzVar4.a = new ids[]{ieaVarA5, ieaVarA4, lxhVar3.c, ieaVar, lxhVar3.f, lyzVar.c(0)};
        krzVar4.b = lxhVar3.b;
        krzVar4.d(new lxf(ieaVarA5, (Throwable) exc, (idf) jxtVar, ieaVarA4, 0));
        final iea ieaVarA6 = krzVar4.a();
        idz idzVar4 = new idz(Boolean.valueOf(mmdVarF.g));
        lqs lqsVar = new lqs(this.g, idzVar2, 10, null);
        idz idzVar5 = new idz(ieg.f(kwnVar2));
        idz idzVar6 = new idz(iegVar);
        int iP = mjo.p(context2, getResources().getDimension(R.dimen.movies_cluster_card_side_padding));
        final Resources resources = getResources();
        final boolean zA = this.t.a();
        final boolean zA2 = this.u.a();
        final boolean zDk = this.c.dk();
        final boolean zCL = this.c.cL();
        krz krzVar5 = new krz(iegVar);
        krzVar5.a = new ids[]{ieaVarH, idsVarC};
        krzVar5.d(new ieh() { // from class: mzy
            @Override // defpackage.ieh
            public final Object a() {
                ieg iegVar2 = (ieg) ieaVarH.a();
                if (!iegVar2.m()) {
                    return ieg.a;
                }
                boolean z = zCL;
                boolean z2 = zDk;
                boolean z3 = zA2;
                boolean z4 = zA;
                Resources resources2 = resources;
                kwn kwnVar3 = (kwn) iegVar2.g();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(kwnVar3.q);
                String strF = jwq.F(resources2, true, arrayList);
                return ieg.f(jxl.J(kwnVar3, kwnVar3.f, strF, strF, false, z4, z3, false, z2, z));
            }
        });
        iea ieaVarA7 = krzVar5.a();
        iff iffVar = new iff();
        iffVar.f(R.layout.details_titlesection);
        iffVar.c = new mlw(8);
        iffVar.g(ksd.a());
        iffVar.d();
        ifc ifcVarC = iffVar.c();
        if (this.c.dk()) {
            kwnVar = kwnVar2;
            b(nac.class, new mmn(this, kwnVar, 2));
        } else {
            kwnVar = kwnVar2;
        }
        jzs jzsVarW = jzs.w(ieaVarH, idwVarC, new mmm(this, 9), new mmm(this, 10), hjt.d(idsVarC, this.g, this.j, this.p.a()), lioVarD, getResources(), this.c.cH(), this.s, this.z, this.c.cL());
        final oxe oxeVarK = oxe.k(new mmo(this, 2));
        mnu.i(this.e, this.d, this.p, this.q, oxeVarK, getResources(), strB, 38, this.M);
        idz idzVar7 = new idz(Boolean.valueOf(mmdVarF.a));
        Resources resources2 = getResources();
        iea ieaVarL = jxl.L(ieaVarH, idzVar7, new mzv(kwnVar, idzVar7, jwq.X(context2), lioVarD, this.s, this.z, 2));
        iff iffVar2 = new iff();
        iffVar2.f(R.layout.details_synopsis_section);
        iffVar2.e = ksd.b();
        iffVar2.c = new mlw(7);
        iffVar2.d();
        ifc ifcVarC2 = iffVar2.c();
        b(mzt.class, new kad(idzVar7, 10));
        Resources resources3 = getResources();
        pkg pkgVar = this.s;
        pjx pjxVar = this.z;
        final mzu mzuVar = new mzu(idzVar, lioVarD, 1);
        krz krzVar6 = new krz(iegVar);
        krzVar6.a = new ids[]{ieaVarH, idzVar, idsVarC};
        krzVar6.d(new mms(ieaVarH, idwVarC, ieaVarA2, idzVar, pjxVar, 2));
        iea ieaVarA8 = krzVar6.a();
        iff iffVar3 = new iff();
        iffVar3.f(R.layout.details_seasonpicker);
        iffVar3.c = new mxj(pkgVar, lioVarD, 3);
        iffVar3.g(ksd.a());
        iffVar3.d();
        ifc ifcVarC3 = iffVar3.c();
        RecyclerView recyclerView = this.M;
        mmo mmoVar = new mmo(this, 3);
        kff.p(recyclerView, mzk.class, new mng(idzVar, idzVar2, lqsVar, recyclerView, mzuVar, 0));
        kff.p(recyclerView, mzj.class, new kad(mmoVar, 17));
        final iea ieaVar2 = this.g;
        iea ieaVar3 = this.e;
        idt idtVar = this.a.b;
        SharedPreferences sharedPreferences = this.k;
        final mcb mcbVar = new mcb(mxzVar, 5);
        this.E.c(kue.class);
        Executor executor = this.n;
        String string = getResources().getString(R.string.details_out_of_window_season);
        final Resources resources4 = getResources();
        final boolean zC = this.w.c();
        final boolean zA3 = this.x.a();
        final boolean zCL2 = this.c.cL();
        boolean zA4 = this.y.a();
        pkg pkgVar2 = this.s;
        krz krzVar7 = new krz(mxc.a().f());
        krzVar7.a = new ids[]{idzVar, ieaVarA6, ieaVar2, idsVarC};
        krzVar7.b = executor;
        krzVar7.d(new ieh() { // from class: mxm
            @Override // defpackage.ieh
            public final Object a() throws Resources.NotFoundException {
                rub rubVarA = mxc.a();
                iea ieaVar4 = idzVar;
                if (!((ieg) ieaVar4.a()).m()) {
                    return rubVarA.f();
                }
                if (!mcbVar.b((kwl) ((ieg) ieaVar4.a()).g())) {
                    rubVarA.h(3);
                    return rubVarA.f();
                }
                iea ieaVar5 = ieaVar2;
                kwl kwlVar = (kwl) ((ieg) ieaVar4.a()).g();
                boolean z = ((kva) ieaVar5.a()).a(kwlVar).b || ((kva) ieaVar5.a()).d(kwlVar.d);
                boolean z2 = zCL2;
                boolean z3 = zA3;
                boolean z4 = zC;
                Resources resources5 = resources4;
                mnu.k(resources5, z4, z3, z2);
                if (kwlVar.d() || z) {
                    rubVarA.h(1);
                    rubVarA.g(Collections.singletonList(mnu.k(resources5, z4, z3, z2).a()));
                } else {
                    rubVarA.h(2);
                }
                return rubVarA.f();
            }
        });
        ntp ntpVarF = ntp.f(krzVar7.a(), idzVar2, ieaVar3, idtVar, sharedPreferences, idsVarC, string, mzuVar, resources4, context2, zC, zA3, zCL2, zA4, pkgVar2);
        mnu.e(this.e, idzVar2, this.a.b, mzuVar, getActivity().getSupportFragmentManager(), this.k, getView(), this.z);
        final iea ieaVar4 = this.g;
        final ?? r4 = ntpVarF.a;
        final iea ieaVar5 = this.j;
        ids idsVarD = hjt.d(idsVarC, this.a.b());
        final boolean zA5 = this.x.a();
        final boolean zCL3 = this.c.cL();
        final boolean zA6 = this.y.a();
        pkg pkgVar3 = this.s;
        final pjx pjxVar2 = this.z;
        krz krzVar8 = new krz(iegVar);
        krzVar8.a = new ids[]{ieaVarH, idzVar, ieaVar4, ieaVarA6, r4, ieaVar5, idsVarD};
        krzVar8.d(new ieh() { // from class: mws
            /* JADX WARN: Code restructure failed: missing block: B:62:0x01a2, code lost:
            
                if (((defpackage.kwr) r4.c()).a(r13.c) != false) goto L69;
             */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, lio] */
            @Override // defpackage.ieh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instructions count: 670
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mws.a():java.lang.Object");
            }
        });
        iea ieaVarA9 = krzVar8.a();
        ifc ifcVarB = mnu.B(mzuVar, pkgVar3);
        Resources resources5 = context2.getResources();
        final iea ieaVar6 = this.e;
        final mcy mcyVar = this.q;
        final jan janVar = this.C;
        b(mwq.class, new lhg() { // from class: mmy
            @Override // defpackage.lhg
            public final void a(lhf lhfVar) throws Resources.NotFoundException {
                mwq mwqVar = (mwq) lhfVar;
                mwv mwvVar = mwqVar.b;
                lid lidVarD = nqq.d(mwvVar.c);
                if (lidVarD == null) {
                    lidVarD = lid.a();
                }
                lid lidVar = lidVarD;
                ieh iehVar = ieaVar6;
                ldy ldyVar = (ldy) iehVar;
                if (ldyVar.a().m()) {
                    ieh iehVar2 = ieaVarH;
                    if (((ieg) iehVar2.a()).m()) {
                        ieh iehVar3 = idzVar;
                        if (((ieg) iehVar3.a()).m()) {
                            ksn ksnVar = (ksn) ldyVar.a().g();
                            kwn kwnVar3 = (kwn) ((ieg) iehVar2.a()).g();
                            kwl kwlVar = (kwl) ((ieg) iehVar3.a()).g();
                            int i = mwvVar.i;
                            if (i == 0) {
                                throw null;
                            }
                            int i2 = i - 1;
                            oxe oxeVar = oxeVarK;
                            mcy mcyVar2 = mcyVar;
                            String str = strB;
                            mdy mdyVar = mdzVar;
                            Context context3 = context2;
                            if (i2 == 1) {
                                tst tstVar = mwvVar.e;
                                if (tstVar.g()) {
                                    tst tstVar2 = mwvVar.f;
                                    if (tstVar2.g()) {
                                        WatchActionBootstrapActivity.startWatchActionActivity(context3, mdyVar, ksnVar, ((kuo) tstVar2.c()).c, ieg.f(kwlVar.l), ieg.f(kwlVar.d), (kxg) tstVar.c(), lidVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    PlayStoreBootstrapActivity.purchaseSeason(context3, mdyVar, kwlVar.d, kwlVar.l, ksnVar, true, false, 38, str, lidVar);
                                    return;
                                }
                                if (i2 == 4) {
                                    PlayStoreBootstrapActivity.purchaseSeason(context3, mdyVar, kwlVar.d, kwlVar.l, ksnVar, false, true, 38, str, lidVar);
                                    return;
                                }
                                if (i2 == 8) {
                                    mnu.g(iehVar, mcyVar2, oxeVar, kwnVar3.d, true, false, mwvVar.c.b(), mwqVar.a, context3.getResources(), str, 38);
                                    return;
                                }
                                if (i2 != 9) {
                                    return;
                                }
                                mnu.g(iehVar, mcyVar2, oxeVar, kwnVar3.d, false, false, mwvVar.c.b(), mwqVar.a, context3.getResources(), str, 38);
                                return;
                            }
                            tst tstVar3 = mwvVar.f;
                            if (tstVar3.g()) {
                                kuo kuoVar = (kuo) tstVar3.c();
                                wll wllVar = wll.a;
                                String str2 = kuf.a.b;
                                ksy ksyVar2 = kuoVar.c;
                                ksy ksyVar3 = kwlVar.d;
                                ksy ksyVar4 = kwnVar3.d;
                                vtw vtwVarM = wpm.a.m();
                                vtw vtwVarM2 = wpl.a.m();
                                wni wniVar = wni.a;
                                vtw vtwVarM3 = wniVar.m();
                                if (!vtwVarM3.b.A()) {
                                    vtwVarM3.u();
                                }
                                String str3 = ksyVar4.b;
                                vuc vucVar = vtwVarM3.b;
                                ((wni) vucVar).b = str3;
                                if (!vucVar.A()) {
                                    vtwVarM3.u();
                                }
                                ((wni) vtwVarM3.b).c = a.aJ(4);
                                wni wniVar2 = (wni) vtwVarM3.r();
                                if (!vtwVarM2.b.A()) {
                                    vtwVarM2.u();
                                }
                                wpl wplVar = (wpl) vtwVarM2.b;
                                wniVar2.getClass();
                                wplVar.d = wniVar2;
                                wplVar.b |= 2;
                                vtw vtwVarM4 = wniVar.m();
                                if (!vtwVarM4.b.A()) {
                                    vtwVarM4.u();
                                }
                                String str4 = ksyVar3.b;
                                vuc vucVar2 = vtwVarM4.b;
                                ((wni) vucVar2).b = str4;
                                if (!vucVar2.A()) {
                                    vtwVarM4.u();
                                }
                                ((wni) vtwVarM4.b).c = a.aJ(5);
                                wni wniVar3 = (wni) vtwVarM4.r();
                                if (!vtwVarM2.b.A()) {
                                    vtwVarM2.u();
                                }
                                wpl wplVar2 = (wpl) vtwVarM2.b;
                                wniVar3.getClass();
                                wplVar2.e = wniVar3;
                                wplVar2.b |= 4;
                                vtw vtwVarM5 = wniVar.m();
                                if (!vtwVarM5.b.A()) {
                                    vtwVarM5.u();
                                }
                                String str5 = ksyVar2.b;
                                vuc vucVar3 = vtwVarM5.b;
                                ((wni) vucVar3).b = str5;
                                if (!vucVar3.A()) {
                                    vtwVarM5.u();
                                }
                                ((wni) vtwVarM5.b).c = a.aJ(6);
                                wni wniVar4 = (wni) vtwVarM5.r();
                                if (!vtwVarM2.b.A()) {
                                    vtwVarM2.u();
                                }
                                wpl wplVar3 = (wpl) vtwVarM2.b;
                                wniVar4.getClass();
                                wplVar3.c = wniVar4;
                                wplVar3.b |= 1;
                                wpl wplVar4 = (wpl) vtwVarM2.r();
                                if (!vtwVarM.b.A()) {
                                    vtwVarM.u();
                                }
                                wpm wpmVar = (wpm) vtwVarM.b;
                                wplVar4.getClass();
                                wpmVar.g = wplVar4;
                                wpmVar.b |= 4;
                                vtw vtwVarM6 = woz.a.m();
                                vtwVarM6.aQ(wnt.a);
                                woz wozVar = (woz) vtwVarM6.r();
                                if (!vtwVarM.b.A()) {
                                    vtwVarM.u();
                                }
                                jan janVar2 = janVar;
                                wpm wpmVar2 = (wpm) vtwVarM.b;
                                wozVar.getClass();
                                wpmVar2.d = wozVar;
                                wpmVar2.c = 4;
                                try {
                                    krd.e(jbr.u(janVar2.q(context3, wllVar, str2, (wpm) vtwVarM.r(), "details", false)));
                                } catch (Exception e) {
                                    krd.c("Failed to log WatchAction result with exception ".concat(String.valueOf(e.getMessage())));
                                }
                            }
                        }
                    }
                }
            }
        });
        pkg pkgVarO = pkg.o(this.g, new krk(this, 14), ksyVar, getResources());
        idz idzVar8 = new idz(false);
        ldj ldjVar = new ldj(this, idzVar5, 19);
        ExecutorService executorService = this.m;
        ids idsVarD2 = hjt.d(this.g, this.D.c(4), this.B, this.e, idzVar5);
        Resources resources6 = getResources();
        uje ujeVarA = mwh.a();
        ujeVarA.f(resources6.getString(R.string.show_sharing_title));
        ujeVarA.e(resources6.getString(R.string.show_sharing_message));
        reo reoVarA = mwf.a();
        reoVarA.e(resources6.getString(R.string.show_sharing_add_button_label));
        reoVarA.d(true);
        ujeVarA.b = tst.i(reoVarA.c());
        reo reoVarA2 = mwf.a();
        reoVarA2.e(resources6.getString(R.string.show_sharing_remove_all_button_label));
        reoVarA2.d(false);
        ujeVarA.c = tst.i(reoVarA2.c());
        oxe oxeVarJ = oxe.j(idzVar8, ldjVar, r4, tst.i(ujeVarA.d()), executorService, idsVarD2);
        iea ieaVar7 = this.e;
        lhm lhmVar = this.B;
        SharedPreferences sharedPreferences2 = this.k;
        cr fragmentManager = getFragmentManager();
        RecyclerView recyclerView2 = this.M;
        kff.p(recyclerView2, myh.class, new mng(ieaVar7, ieaVarH, sharedPreferences2, lhmVar, fragmentManager, 1));
        kff.p(recyclerView2, mwg.class, new mna(ieaVarH, ieaVar7, lhmVar, idzVar8, 0));
        kff.p(recyclerView2, myf.class, new kad(lhmVar, 15));
        kff.p(recyclerView2, myg.class, new kad(sharedPreferences2, 16));
        final idz idzVar9 = new idz(false);
        final idz idzVar10 = new idz(ieg.f(0));
        final iea ieaVar8 = this.g;
        final iea ieaVar9 = this.h;
        ids idsVarD3 = hjt.d(idsVarC, this.B, this.a.b());
        final lqs lqsVar2 = new lqs(idzVar2, this.g, 11);
        final mcb mcbVar2 = new mcb(this, 6);
        final mem memVar = this.o;
        boolean z = this.c.cO() || ((Boolean) xkd.a.et(((xkd) this.v).b)).booleanValue();
        final boolean zA7 = this.x.a();
        final boolean zX = jwq.X(context2);
        final boolean zDk2 = this.c.dk();
        final boolean zCL4 = this.c.cL();
        pkg pkgVar4 = this.s;
        final pjx pjxVar3 = this.z;
        final boolean z2 = z;
        final mxz mxzVar2 = new mxz(idzVar, ieaVarA6, mxzVar, 0);
        krz krzVar9 = new krz(iegVar);
        krzVar9.a = new ids[]{idzVar, ieaVarA6, r4, idzVar9};
        krzVar9.d(new ieh() { // from class: mya
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ieh
            public final Object a() {
                int iA;
                Object obj;
                if (!mxzVar2.a() || z2) {
                    return ieg.a;
                }
                iea ieaVar10 = r4;
                if (!((ieg) ieaVar10.a()).m()) {
                    return ieg.f(mxy.a().e());
                }
                iea ieaVar11 = idzVar;
                iea ieaVar12 = ieaVarA6;
                mxe mxeVar = ((mxo) ((ieg) ieaVar10.a()).g()).c;
                List list = (List) ((ieg) ieaVar12.a()).g();
                kwl kwlVar = (kwl) ((ieg) ieaVar11.a()).g();
                kuf kufVar = mxeVar.a;
                if (!kuf.b(kufVar)) {
                    Iterator it = list.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (!((kuo) it.next()).v) {
                            i++;
                        }
                    }
                    UnmodifiableIterator it2 = kwlVar.q.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        kup kupVar = (kup) it2.next();
                        if (kupVar.a.equals(kufVar)) {
                            iA = i - kupVar.a();
                            if (iA <= 0) {
                                break;
                            }
                        }
                    }
                } else {
                    iA = 0;
                }
                if (iA <= 0) {
                    return ieg.f(mxy.a().e());
                }
                iea ieaVar13 = idzVar9;
                Context context3 = context2;
                nxb nxbVarA = mxy.a();
                nwo nwoVar = new nwo();
                nwoVar.b = "";
                nwoVar.b("");
                nwoVar.b = hjs.e(context3.getString(R.string.details_some_episodes_unavailable), "count", Integer.valueOf(iA), "provider_name", mxeVar.d);
                nwoVar.b(context3.getString(true != ((Boolean) ieaVar13.a()).booleanValue() ? R.string.details_show_episodes : R.string.details_hide_episodes));
                Object obj2 = nwoVar.b;
                if (obj2 != null && (obj = nwoVar.a) != null) {
                    nxbVarA.a = tst.i(new myc((String) obj2, (String) obj));
                    return ieg.f(nxbVarA.e());
                }
                StringBuilder sb = new StringBuilder();
                if (nwoVar.b == null) {
                    sb.append(" messageText");
                }
                if (nwoVar.a == null) {
                    sb.append(" toggleText");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
        iea ieaVarA10 = krzVar9.a();
        krz krzVar10 = new krz(Collections.EMPTY_LIST);
        krzVar10.a = new ids[]{idzVar, ieaVarA6, ieaVar8, ieaVarA, r4, idzVar9, idzVar10, ieaVar9, idsVarD3};
        krzVar10.d(new ieh() { // from class: myb
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0327  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x032a  */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v23 */
            /* JADX WARN: Type inference failed for: r1v4, types: [lio] */
            @Override // defpackage.ieh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instructions count: 1186
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.a():java.lang.Object");
            }
        });
        paq paqVar = new paq(krzVar10.a(), ieaVarA10, context2.getResources(), pkgVar4);
        iea ieaVar10 = this.e;
        iea ieaVar11 = this.h;
        cr fragmentManager2 = getFragmentManager();
        mta mtaVar = this.H;
        lie lieVar = this.d;
        RecyclerView recyclerView3 = this.M;
        kff.p(recyclerView3, mxx.class, new kad(idzVar9, 13));
        kff.p(recyclerView3, mxw.class, new kad(idzVar10, 14));
        kff.p(recyclerView3, mxu.class, new ldk((Object) mdzVar, context2, (Object) ieaVar10, 5));
        kff.p(recyclerView3, mxt.class, new mmz(ieaVar10, ieaVarH, ieaVar11, mtaVar, activity, fragmentManager2, lieVar, 0));
        kff.p(recyclerView3, mxv.class, new mna(ieaVar10, context2, mdzVar, strB, 1));
        b(mzq.class, new ldk(this, strB, intent, 4));
        b(mzr.class, new kad(idzVar6, 11));
        final mmm mmmVar = new mmm(this, 11);
        final iea ieaVar12 = this.g;
        ids idsVarD4 = hjt.d(this.e, this.B);
        final lfn lfnVar = this.c;
        final Resources resources7 = getResources();
        final boolean zA8 = this.t.a();
        final boolean zA9 = this.u.a();
        pkg pkgVar5 = this.s;
        krz krzVar11 = new krz(iegVar);
        krzVar11.a = new ids[]{r4, ieaVarA6, ieaVar12, idsVarD4};
        krzVar11.d(new ieh() { // from class: myx
            /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
            @Override // defpackage.ieh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() throws android.content.res.Resources.NotFoundException {
                /*
                    Method dump skipped, instructions count: 374
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.myx.a():java.lang.Object");
            }
        });
        iea ieaVarA11 = krzVar11.a();
        ifc ifcVarO = jxl.O(lioVarD, pkgVar5);
        ntp ntpVar = new ntp((byte[]) null);
        Map map = new HashMap();
        Integer numValueOf = Integer.valueOf(mmb.g(getResources()));
        iff iffVar4 = new iff();
        iffVar4.f(R.layout.play_movies_header_spacer);
        iffVar4.c = new mlw(0);
        ntpVar.e(numValueOf, iffVar4.a());
        ntpVar.c(ieaVarA7, ifcVarC);
        jxl.K(map, resources);
        jzsVarW.u(ntpVar);
        jzsVarW.t(map);
        ntpVar.c(ieaVarL, ifcVarC2);
        jxl.M(map, resources2);
        pkgVarO.m(ntpVar);
        if (this.c.cL()) {
            ntpVar.c(ieaVarA9, ifcVarB);
            mnu.z(map, resources5);
            ntpVar.c(ieaVarA8, ifcVarC3);
            jxl.N(map, resources3);
            context = context2;
            lioVar = lioVarD;
        } else {
            context = context2;
            lioVar = lioVarD;
            ntpVar.c(ieaVarA8, ifcVarC3);
            jxl.N(map, resources3);
            ntpVar.c(ieaVarA9, ifcVarB);
            mnu.z(map, resources5);
        }
        oxeVarJ.h(ntpVar);
        ?? r1 = paqVar.b;
        iff iffVar5 = new iff();
        iffVar5.f(R.layout.details_episodes_header);
        iffVar5.c = new mlw(3);
        iffVar5.g(ksd.a());
        iffVar5.d();
        ntpVar.c(r1, iffVar5.c());
        ?? r12 = paqVar.a;
        iff iffVar6 = new iff();
        iffVar6.f(R.layout.details_episode_updated_download);
        iffVar6.e = new mcm(16);
        iffVar6.c = new mnn(paqVar, 3);
        iffVar6.d = new lnt(paqVar, 10);
        iffVar6.e(new mcm(17), true);
        ntpVar.c(r12, iffVar6.b());
        Resources resources8 = (Resources) paqVar.c;
        map.put(Integer.valueOf(R.layout.details_episode), new tid(resources8.getInteger(R.integer.details_episodes_column_count), resources8.getInteger(R.integer.details_section_row_span_default)));
        if (this.c.cL()) {
            idsVar = r4;
            bArr = null;
        } else {
            iea ieaVarQ = this.K.q(ksyVar, idzVar6, integer);
            Context context3 = getContext();
            lxm lxmVar = this.F;
            iea ieaVar13 = this.g;
            idsVar = r4;
            bArr = null;
            mru.b(context3, ieaVarQ, new mnb(lioVar, context, lxmVar, ieaVar13, mmtVar, iP, this.s, this.z), new mmr(ieaVarH, idwVarC, 0), hjt.d(ieaVarH, ieaVar13, idsVarC, lxmVar.a()), this.s).f(ntpVar);
        }
        ntpVar.c(ieaVarA11, ifcVarO);
        ntpVar.d(this.e);
        ntpVar.d(this.o);
        ntpVar.d(idzVar3);
        ntpVar.d(this.h);
        ifb ifbVarB = ntpVar.b();
        ifbVarB.setHasStableIds(true);
        this.M.setAdapter(ifbVarB);
        this.M.setLayoutManager(this.a.i());
        this.L = ksa.c(krv.c(ieaVarA3, new krn(idzVar, idzVar2, 15)), new krv(idsVar, new kde(this, ntpVarF, 6, bArr)), new ksa(ifbVarB, 0));
        this.N = new mms(idzVar7, idzVar, idzVar2, idzVar3, idzVar4, 0);
    }

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.g(i, i2, intent, "mobile_show_object");
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlz mlzVarN = this.J.n(this);
        this.a = mlzVarN;
        RecyclerView recyclerViewA = mlzVarN.a(layoutInflater, viewGroup);
        this.M = recyclerViewA;
        return recyclerViewA;
    }

    @Override // defpackage.bv
    public final void onDestroyView() {
        this.M.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("details_view_state", this.N.a());
    }

    @Override // defpackage.bv
    public final void onStart() {
        super.onStart();
        this.L.a();
    }

    @Override // defpackage.bv
    public final void onStop() {
        this.L.b();
        super.onStop();
    }

    @Override // defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        mlz.h(view, (AppCompatActivity) getActivity());
        this.M.addItemDecoration(new mmu(this));
    }
}

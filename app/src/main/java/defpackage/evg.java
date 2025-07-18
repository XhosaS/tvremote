package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.FetcherResolver;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evg implements tkw {
    final aejl A;
    final aejl B;
    final aejl C;
    final aejl D;
    final aejl E;
    final aejl F;
    final aejl G;
    final aejl H;
    final aejl I;
    final aejl J;
    final aejl K;
    final aejl L;
    final aejl M;
    final aejl N;
    final aejl O;
    final aejl P;
    final aejl Q;
    final aejl R;
    final aejl S;
    final aejl T;
    final aejl U;
    final aejl V;
    final aejl W;
    final aejl X;
    final aejl Y;
    final aejl Z;
    public final addl a;
    final aejl aa;
    final aejl ab;
    final aejl ac;
    final aejl ad;
    final aejl ae;
    final aejl af;
    final aejl ag;
    final aejl ah;
    final aejl ai;
    final aejl aj;
    final aejl ak;
    final aejl al;
    final aejl am;
    final aejl an;
    final aejl ao;
    final aejl ap;
    final aejl aq;
    final aejl ar;
    final aejl as;
    final aejl at;
    private final evg au = this;
    public final mrb b;
    public final Set c;
    public final mrt d;
    public final Set e;
    public final Set f;
    public final eup g;
    final aejl h;
    final aejl i;
    final aejl j;
    final aejl k;
    final aejl l;
    final aejl m;
    final aejl n;
    final aejl o;
    final aejl p;
    final aejl q;
    final aejl r;
    final aejl s;
    final aejl t;
    final aejl u;
    final aejl v;
    final aejl w;
    final aejl x;
    final aejl y;
    final aejl z;

    public evg(eup eupVar, mrt mrtVar, mrb mrbVar, oat oatVar, addl addlVar, Set set, Set set2, Set set3) {
        this.g = eupVar;
        this.a = addlVar;
        this.b = mrbVar;
        this.c = set;
        this.d = mrtVar;
        this.e = set2;
        this.f = set3;
        this.h = aejo.b(new evf(eupVar, this, 1));
        this.i = new evf(eupVar, this, 0);
        this.j = aejf.c(new evf(eupVar, this, 5));
        this.k = aejf.c(new evf(eupVar, this, 4));
        this.l = aejo.b(new evf(eupVar, this, 3));
        aeje aejeVar = new aeje();
        this.m = aejeVar;
        this.n = aejh.b(oatVar);
        this.o = new evf(eupVar, this, 10);
        this.p = new evf(eupVar, this, 9);
        this.q = aejo.b(new evf(eupVar, this, 11));
        aeje.b(aejeVar, new evf(eupVar, this, 7));
        this.r = new evf(eupVar, this, 6);
        this.s = new evf(eupVar, this, 2);
        this.t = new evf(eupVar, this, 12);
        this.u = new evf(eupVar, this, 15);
        this.v = new evf(eupVar, this, 16);
        aejl aejlVar = evh.b;
        this.w = aejlVar;
        this.x = aejlVar;
        this.y = aejlVar;
        this.z = aejo.b(new evf(eupVar, this, 14));
        aeje aejeVar2 = new aeje();
        this.A = aejeVar2;
        aeje aejeVar3 = new aeje();
        this.B = aejeVar3;
        this.C = new evf(eupVar, this, 20);
        this.D = new evf(eupVar, this, 21);
        this.E = aejo.b(new evf(eupVar, this, 23));
        this.F = new evf(eupVar, this, 22);
        this.G = new evf(eupVar, this, 24);
        this.H = aejf.c(new evf(eupVar, this, 25));
        this.I = new evf(eupVar, this, 26);
        this.J = aejh.a;
        this.K = aejf.c(new evf(eupVar, this, 27));
        this.L = aejf.c(new evf(eupVar, this, 28));
        this.M = new evf(eupVar, this, 29);
        this.N = new evf(eupVar, this, 30);
        this.O = aejo.b(new evf(eupVar, this, 19));
        this.P = aejo.b(new evf(eupVar, this, 31));
        this.Q = aejo.b(new evf(eupVar, this, 32));
        aeje.b(aejeVar2, aejo.b(new evf(eupVar, this, 18)));
        this.R = new evf(eupVar, this, 33);
        evf evfVar = new evf(eupVar, this, 17);
        this.S = evfVar;
        aeje.b(aejeVar3, aejo.b(evfVar));
        this.T = aejf.c(new evf(eupVar, this, 34));
        this.U = aejo.b(new evf(eupVar, this, 35));
        this.V = aejo.b(new evf(eupVar, this, 36));
        this.W = aejo.b(new evf(eupVar, this, 37));
        this.X = aejo.b(new evf(eupVar, this, 38));
        this.Y = aejo.b(new evf(eupVar, this, 39));
        this.Z = new evf(eupVar, this, 41);
        this.aa = new evf(eupVar, this, 40);
        this.ab = new evf(eupVar, this, 42);
        this.ac = aejo.b(new evf(eupVar, this, 43));
        this.ad = aejo.b(new evf(eupVar, this, 44));
        this.ae = new evf(eupVar, this, 45);
        this.af = aejo.b(new evf(eupVar, this, 47));
        this.ag = aejo.b(new evf(eupVar, this, 46));
        this.ah = new evf(eupVar, this, 48);
        this.ai = aejf.c(new evf(eupVar, this, 49));
        this.aj = aejo.b(new evf(eupVar, this, 51));
        this.ak = aejf.c(new evf(eupVar, this, 53));
        this.al = aejf.c(new evf(eupVar, this, 54));
        this.am = new evf(eupVar, this, 52);
        this.an = aejo.b(new evf(eupVar, this, 55));
        this.ao = aejo.b(new evf(eupVar, this, 56));
        evf evfVar2 = new evf(eupVar, this, 13);
        this.ap = evfVar2;
        this.aq = aejo.b(evfVar2);
        this.ar = aejf.c(new evf(eupVar, this, 57));
        this.as = aejf.c(new evf(eupVar, this, 58));
        this.at = aejf.c(new evf(eupVar, this, 59));
    }

    final muw a() {
        agfx agfxVar = (agfx) this.I.a();
        agfx agfxVar2 = aggd.a;
        aggb.a(agfxVar2);
        return new muw(agfxVar, agfxVar2);
    }

    final mva b() {
        return new mva((tkb) ((yqz) yqt.i(new tkb((Context) this.g.n.a(), (tmi) this.j.a()))).a, this.N);
    }

    @Override // defpackage.tkw
    public final oat c() {
        return (oat) ((aejh) this.n).b;
    }

    @Override // defpackage.tkw
    public final oci d() {
        aejl aejlVar = this.as;
        tln tlnVarS = s();
        oce oceVar = (oce) aejlVar.a();
        oct octVar = (oct) this.at.a();
        nyz nyzVar = new nyz();
        aejl aejlVar2 = this.aq;
        if (aejlVar2 == null) {
            throw new NullPointerException("Null converterProvider");
        }
        nyzVar.a = aejlVar2;
        nyzVar.a(true);
        nyzVar.c = oce.a;
        nyzVar.d = oct.a;
        nyzVar.h = true;
        nyzVar.j = (byte) (nyzVar.j | 30);
        nyzVar.b = "xUIKit";
        nyzVar.a(false);
        nyzVar.k = tlnVarS;
        if (oceVar == null) {
            throw new NullPointerException("Null perfLoggerFactory");
        }
        nyzVar.c = oceVar;
        if (octVar == null) {
            throw new NullPointerException("Null elementsLifeCycleLogger");
        }
        nyzVar.d = octVar;
        return nyzVar;
    }

    @Override // defpackage.tkw
    public final oei e() {
        tll tllVar = new tll(new tlk((Executor) this.g.m.a()));
        tln tlnVarS = s();
        nzb nzbVar = new nzb();
        nzbVar.a = 4;
        nzbVar.b = 0.45f;
        nzbVar.c = 0.5f;
        nzbVar.d = Byte.MAX_VALUE;
        nzbVar.e = tllVar;
        nzbVar.f = tlnVarS;
        return nzbVar;
    }

    @Override // defpackage.tkw
    public final tjk f() {
        return (tjk) this.t.a();
    }

    @Override // defpackage.tkw
    public final tjl g() {
        return (tjl) this.g.sB.a();
    }

    @Override // defpackage.tkw
    public final tjp h() {
        return new tjp(k(), (tjk) this.t.a(), (tjl) this.g.sB.a(), (tmm) this.i.a(), (tls) this.ar.a());
    }

    final tli i() {
        return new tli(this.n, this.A, this.B, this.C, this.a, m());
    }

    @Override // defpackage.tkw
    public final tlq j() {
        return (tlq) this.g.cc.a();
    }

    @Override // defpackage.tkw
    public final toj k() {
        eup eupVar = this.g;
        tmz tmzVar = new tmz(new mjd((oco) this.s.a()), (Context) eupVar.n.a(), (zyg) eupVar.w.a());
        tol tolVar = (tol) eupVar.sA.a();
        tmm tmmVar = (tmm) this.i.a();
        tolVar.getClass();
        return new toj(tmmVar, tmzVar, tolVar);
    }

    final tor l() {
        return new tor((toy) this.g.pk.a());
    }

    final yqt m() {
        return tmx.a(yqt.i(yqt.h(null)));
    }

    final Map n() {
        ExtensionRegistryLite extensionRegistryLite;
        aejl aejlVar = this.z;
        yyn yynVarH = yyr.h(11);
        mov movVar = (mov) aejlVar.a();
        aejl aejlVar2 = this.B;
        oea oeaVar = (oea) aejlVar2.a();
        aejl aejlVar3 = this.A;
        final oaa oaaVar = (oaa) aejlVar3.a();
        aejl aejlVar4 = this.D;
        final ofy ofyVar = (ofy) aejlVar4.a();
        aejl aejlVar5 = this.s;
        final oco ocoVar = (oco) aejlVar5.a();
        aejl aejlVar6 = this.T;
        yqt yqtVarI = yqt.i((oap) aejlVar6.a());
        aejl aejlVar7 = this.G;
        final Map map = (Map) aejlVar7.a();
        aejl aejlVar8 = this.F;
        final nya nyaVar = (nya) aejlVar8.a();
        yyr yyrVar = zcl.a;
        final mrg mrgVar = new mrg(yyrVar);
        Object obj = ((yqz) yqtVarI).a;
        final boolean zR = r();
        final oap oapVar = (oap) obj;
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        bool.getClass();
        bool.getClass();
        bool.getClass();
        bool.getClass();
        bool.getClass();
        bool.getClass();
        yynVarH.c(nmt.class, movVar.a(oeaVar, new mot() { // from class: mql
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str, nlr nlrVar, mlm mlmVar, List list) {
                boolean zI;
                boolean zG;
                boolean zL;
                boolean zJ;
                nmt nmtVar = (nmt) obj2;
                mii miiVar = niv.O;
                if (nlrVar.b(miiVar)) {
                    niv nivVar = (niv) nlrVar.a(miiVar);
                    zG = nivVar.g();
                    zL = nivVar.l();
                    zJ = nivVar.j();
                    zI = nivVar.i();
                } else {
                    zI = false;
                    zG = false;
                    zL = false;
                    zJ = false;
                }
                nya nyaVar2 = nyaVar;
                Map map2 = map;
                mrg mrgVar2 = mrgVar;
                boolean z = zR;
                oap oapVar2 = oapVar;
                oco ocoVar2 = ocoVar;
                ofy ofyVar2 = ofyVar;
                oaa oaaVar2 = oaaVar;
                if (!zJ && !nmtVar.k()) {
                    myk mykVarAB = mym.aB(druVar);
                    mykVarAB.c(oaaVar2);
                    mykVarAB.h(nmtVar);
                    mykVarAB.aa(ofyVar2);
                    mykVarAB.f(ocoVar2);
                    mym mymVar = mykVarAB.a;
                    mymVar.d = oapVar2;
                    mymVar.r = z || zI;
                    mykVarAB.d(oalVar);
                    mymVar.A = mrgVar2;
                    mykVarAB.g(map2);
                    mykVarAB.e(nyaVar2.a());
                    mymVar.f = zG;
                    mii miiVar2 = nmn.aa;
                    if (nlrVar.b(miiVar2)) {
                        nmn nmnVar = (nmn) nlrVar.a(miiVar2);
                        if (nmnVar.u()) {
                            mymVar.a = Boolean.valueOf(nmnVar.s());
                        }
                    }
                    return mykVarAB;
                }
                mys mysVar = new mys(druVar, new myv());
                myv myvVar = mysVar.a;
                myvVar.b = oaaVar2;
                BitSet bitSet = mysVar.d;
                bitSet.set(0);
                myvVar.y = nmtVar;
                bitSet.set(5);
                myvVar.z = ofyVar2;
                bitSet.set(6);
                myvVar.s = ocoVar2;
                bitSet.set(3);
                myvVar.d = oapVar2;
                myvVar.r = z || zI;
                myvVar.c = oalVar;
                bitSet.set(1);
                myvVar.A = mrgVar2;
                myvVar.x = map2;
                bitSet.set(4);
                myvVar.e = nyaVar2.a();
                bitSet.set(2);
                myvVar.f = zL;
                mii miiVar3 = nmn.aa;
                if (nlrVar.b(miiVar3)) {
                    nmn nmnVar2 = (nmn) nlrVar.a(miiVar3);
                    if (nmnVar2.u()) {
                        myvVar.a = Boolean.valueOf(nmnVar2.s());
                    }
                }
                return mysVar;
            }
        }, null, nmt.ab, false));
        yynVarH.c(nfn.class, ((mov) this.U.a()).a((oea) aejlVar2.a(), new mot() { // from class: mlc
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str, nlr nlrVar, mlm mlmVar, List list) {
                mme mmeVarAA = mmf.aA(druVar);
                mmeVarAA.c(list);
                int iG = ((nfn) obj2).g();
                if (iG != 0) {
                    mmeVarAA.a.f = Integer.valueOf(iG);
                }
                mii miiVar = nlk.Y;
                if (nlrVar.b(miiVar)) {
                    mmeVarAA.d(mmh.a(((nlk) nlrVar.a(miiVar)).K()));
                } else {
                    mmeVarAA.d(1);
                }
                mii miiVar2 = njn.S;
                if (nlrVar.b(miiVar2)) {
                    njn njnVar = (njn) nlrVar.a(miiVar2);
                    if (njnVar.h()) {
                        mmeVarAA.a.r = njnVar.g();
                    }
                }
                mii miiVar3 = ncx.z;
                if (!nlrVar.b(miiVar3)) {
                    mmeVarAA.P(true);
                    return mmeVarAA;
                }
                ncx ncxVar = (ncx) nlrVar.a(miiVar3);
                if (ncxVar.ao()) {
                    mmeVarAA.P(ncxVar.k());
                    return mmeVarAA;
                }
                mmeVarAA.P(true);
                return mmeVarAA;
            }
        }, null, nfn.D, false));
        mov movVar2 = (mov) this.V.a();
        oea oeaVar2 = (oea) aejlVar2.a();
        bool.getClass();
        bool.getClass();
        String str = mmh.a;
        yynVarH.c(nhk.class, movVar2.a(oeaVar2, new mot() { // from class: mmg
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                nhk nhkVar = (nhk) obj2;
                String str3 = mmh.a;
                mme mmeVarAA = mmf.aA(druVar);
                mmeVarAA.c(list);
                mii miiVar = nlk.Y;
                if (nlrVar.b(miiVar)) {
                    mmeVarAA.d(mmh.a(((nlk) nlrVar.a(miiVar)).K()));
                } else {
                    mmeVarAA.d(1);
                }
                if (nhkVar.g()) {
                    mmeVarAA.Z();
                    mmeVarAA.F(mmh.a + mmh.b.getAndIncrement());
                }
                return mmeVarAA;
            }
        }, null, nhk.K, false));
        mov movVar3 = (mov) this.W.a();
        oea oeaVar3 = (oea) aejlVar2.a();
        final oaa oaaVar2 = (oaa) aejlVar3.a();
        final oco ocoVar2 = (oco) aejlVar5.a();
        bool.getClass();
        final ogr ogrVar = new ogr(ocoVar2);
        yynVarH.c(nmd.class, movVar3.a(oeaVar3, new mot() { // from class: mpz
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                nmd nmdVar = (nmd) obj2;
                mpr mprVar = new mpr(druVar, new mpt());
                mpt mptVar = mprVar.a;
                mptVar.a = list;
                BitSet bitSet = mprVar.d;
                bitSet.set(0);
                mii miiVar = nlk.Y;
                if (nlrVar.b(miiVar)) {
                    mprVar.c(mmh.a(((nlk) nlrVar.a(miiVar)).K()));
                } else {
                    mprVar.c(1);
                }
                mii miiVar2 = niv.O;
                if (nlrVar.b(miiVar2)) {
                    mprVar.b(((niv) nlrVar.a(miiVar2)).k());
                } else {
                    mprVar.b(false);
                }
                if (str2 != null) {
                    mptVar.d = str2;
                }
                ogr ogrVar2 = ogrVar;
                oaa oaaVar3 = oaaVar2;
                bitSet.set(7);
                mptVar.b = oaaVar3;
                bitSet.set(1);
                mptVar.t = nmdVar;
                bitSet.set(11);
                mptVar.r = nmdVar.r() ? ogrVar2.o(nmdVar.g(), oalVar) : null;
                bitSet.set(9);
                mptVar.f = nmdVar.s() ? ogrVar2.o(nmdVar.h(), oalVar) : null;
                bitSet.set(8);
                mptVar.s = nmdVar.t() ? ogrVar2.o(nmdVar.i(), oalVar) : null;
                bitSet.set(10);
                mptVar.c = oalVar;
                bitSet.set(2);
                bitSet.set(5);
                bitSet.set(3);
                return mprVar;
            }
        }, null, nmd.Z, false));
        mov movVar4 = (mov) this.X.a();
        oea oeaVar4 = (oea) aejlVar2.a();
        final oaa oaaVar3 = (oaa) aejlVar3.a();
        final ofy ofyVar2 = (ofy) aejlVar4.a();
        final oco ocoVar3 = (oco) aejlVar5.a();
        yqt yqtVarI2 = yqt.i((oap) aejlVar6.a());
        final Map map2 = (Map) aejlVar7.a();
        final nya nyaVar2 = (nya) aejlVar8.a();
        final oap oapVar2 = (oap) ((yqz) yqtVarI2).a;
        final ogr ogrVar2 = new ogr(ocoVar3);
        yynVarH.c(nir.class, movVar4.a(oeaVar4, new mot() { // from class: mpm
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                nir nirVar = (nir) obj2;
                mpg mpgVar = new mpg(druVar, new mpi());
                boolean zX = nirVar.x();
                ogr ogrVar3 = ogrVar2;
                ogq ogqVarO = zX ? ogrVar3.o(nirVar.n(), oalVar) : null;
                mpi mpiVar = mpgVar.a;
                mpiVar.r = ogqVarO;
                BitSet bitSet = mpgVar.d;
                bitSet.set(6);
                ogq ogqVarO2 = nirVar.w() ? ogrVar3.o(nirVar.m(), oalVar) : null;
                Map map3 = map2;
                nya nyaVar3 = nyaVar2;
                oap oapVar3 = oapVar2;
                oco ocoVar4 = ocoVar3;
                ofy ofyVar3 = ofyVar2;
                oaa oaaVar4 = oaaVar3;
                mpiVar.a = ogqVarO2;
                bitSet.set(0);
                mpiVar.b = oaaVar4;
                bitSet.set(1);
                mpiVar.f = nirVar;
                bitSet.set(5);
                mpiVar.u = ofyVar3;
                bitSet.set(9);
                mpiVar.s = ocoVar4;
                bitSet.set(7);
                mpiVar.d = oapVar3;
                bitSet.set(3);
                mpiVar.c = oalVar;
                bitSet.set(2);
                mpiVar.e = nyaVar3.a();
                bitSet.set(4);
                mpiVar.t = map3;
                bitSet.set(8);
                return mpgVar;
            }
        }, null, nir.N, false));
        mov movVar5 = (mov) this.Y.a();
        oea oeaVar5 = (oea) aejlVar2.a();
        final oaa oaaVar4 = (oaa) aejlVar3.a();
        final muw muwVarA = a();
        aejl aejlVar9 = this.aa;
        final oco ocoVar4 = (oco) aejlVar5.a();
        aejl aejlVar10 = this.R;
        final ogr ogrVar3 = (ogr) aejlVar10.a();
        aejl aejlVar11 = this.ab;
        oco ocoVar5 = (oco) aejlVar5.a();
        mqr mqrVar = new mqr(aejlVar10);
        aejl aejlVar12 = this.I;
        mqy mqyVar = new mqy(aejlVar3, aejlVar12);
        aejl aejlVar13 = this.o;
        yqt yqtVarI3 = yqt.i(aejlVar13);
        zcp zcpVar = zcp.b;
        if (zcpVar.isEmpty()) {
            ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            extensionRegistryLite = ExtensionRegistryLite.a;
        } else {
            ExtensionRegistryLite extensionRegistryLite3 = ExtensionRegistryLite.a;
            abza abzaVar2 = abza.a;
            extensionRegistryLite = new ExtensionRegistryLite();
            zdm zdmVarListIterator = zcpVar.f().listIterator(0);
            while (zdmVarListIterator.hasNext()) {
                abwk abwkVarA = ((oar) zdmVarListIterator.next()).a();
                aejl aejlVar14 = aejlVar2;
                if (abwkVarA instanceof abxc) {
                    extensionRegistryLite.b((abxc) abwkVarA);
                }
                aejlVar2 = aejlVar14;
            }
        }
        aejl aejlVar15 = aejlVar2;
        ExtensionRegistryLite extensionRegistryLite4 = extensionRegistryLite;
        extensionRegistryLite4.getClass();
        final mqv mqvVar = new mqv(aejlVar11, ocoVar5, mqrVar, mqyVar, yqtVarI3, zcpVar, extensionRegistryLite4);
        ypv ypvVar = ypv.a;
        yqt yqtVarI4 = yqt.i((oap) aejlVar6.a());
        zdm zdmVarListIterator2 = zcpVar.f().listIterator(0);
        while (zdmVarListIterator2.hasNext()) {
            oan oanVar = (oan) zdmVarListIterator2.next();
            abwk abwkVarA2 = oanVar.a();
            int iA = abwkVarA2.a();
            aejl aejlVar16 = aejlVar9;
            mqu mquVar = new mqu(mqvVar, abwkVarA2, oanVar);
            FetcherResolver fetcherResolverSharedResolver = FetcherResolver.sharedResolver();
            if (fetcherResolverSharedResolver != null) {
                fetcherResolverSharedResolver.register(iA, mquVar);
            }
            aejlVar9 = aejlVar16;
        }
        final aejl aejlVar17 = aejlVar9;
        bool.getClass();
        bool.getClass();
        bool.getClass();
        final oap oapVar3 = (oap) ((yqz) yqtVarI4).a;
        bool.getClass();
        bool.getClass();
        yynVarH.c(ngd.class, movVar5.a(oeaVar5, new mot() { // from class: mlg
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                ngd ngdVar = (ngd) obj2;
                aggh agghVar = new aggh();
                mld mldVar = new mld(druVar, new mlf());
                mlf mlfVar = mldVar.a;
                mlfVar.B = muwVarA;
                BitSet bitSet = mldVar.d;
                bitSet.set(14);
                mlfVar.e = oalVar;
                bitSet.set(4);
                mlfVar.b = agghVar;
                bitSet.set(1);
                mlfVar.c = ngdVar;
                bitSet.set(2);
                bitSet.set(7);
                mlfVar.r = oapVar3;
                bitSet.set(6);
                bitSet.set(8);
                mlfVar.a = list;
                bitSet.set(0);
                bitSet.set(9);
                if (mlmVar != null) {
                    mlfVar.C = mlmVar;
                }
                agow agowVar = aejlVar17;
                mlfVar.z = ((nyx) oalVar).t;
                mlfVar.A = agowVar;
                if (str2 != null) {
                    mlfVar.s = str2;
                }
                ogr ogrVar4 = ogrVar3;
                oco ocoVar6 = ocoVar4;
                mlfVar.d = oaaVar4;
                bitSet.set(3);
                mlfVar.v = ocoVar6;
                bitSet.set(10);
                mlfVar.x = ngdVar.w() ? ogrVar4.o(ngdVar.k(), oalVar) : null;
                bitSet.set(12);
                mlfVar.w = ngdVar.x() ? ogrVar4.o(ngdVar.l(), oalVar) : null;
                bitSet.set(11);
                ogq ogqVarO = ngdVar.y() ? ogrVar4.o(ngdVar.m(), oalVar) : null;
                oao oaoVar = mqvVar;
                mlfVar.y = ogqVarO;
                bitSet.set(13);
                mlfVar.f = oaoVar;
                bitSet.set(5);
                return mldVar;
            }
        }, null, ngd.G, true));
        mov movVar6 = (mov) this.ac.a();
        oea oeaVar6 = (oea) aejlVar15.a();
        final oaa oaaVar5 = (oaa) aejlVar3.a();
        final ofy ofyVar3 = (ofy) aejlVar4.a();
        final oco ocoVar6 = (oco) aejlVar5.a();
        yqt yqtVarI5 = yqt.i((oap) aejlVar6.a());
        final mrg mrgVar2 = new mrg(yyrVar);
        final boolean zR2 = r();
        final Map map3 = (Map) aejlVar7.a();
        final oap oapVar4 = (oap) ((yqz) yqtVarI5).a;
        bool.getClass();
        bool.getClass();
        bool.getClass();
        final ogr ogrVar4 = new ogr(ocoVar6);
        yynVarH.c(nhw.class, movVar6.a(oeaVar6, new mot() { // from class: mnj
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                boolean zI;
                boolean zN;
                boolean zH;
                boolean zM;
                nhw nhwVar = (nhw) obj2;
                mii miiVar = niv.O;
                if (nlrVar.b(miiVar)) {
                    niv nivVar = (niv) nlrVar.a(miiVar);
                    zN = nivVar.n();
                    zH = nivVar.h();
                    zM = nivVar.m();
                    zI = nivVar.i();
                } else {
                    zI = false;
                    zN = false;
                    zH = false;
                    zM = false;
                }
                Map map4 = map3;
                boolean z = zR2;
                oap oapVar5 = oapVar4;
                mrg mrgVar3 = mrgVar2;
                oco ocoVar7 = ocoVar6;
                ofy ofyVar4 = ofyVar3;
                ogr ogrVar5 = ogrVar4;
                oaa oaaVar6 = oaaVar5;
                if (zN) {
                    mnm mnmVar = new mnm(druVar, new mnp());
                    mnp mnpVar = mnmVar.a;
                    mnpVar.a = oaaVar6;
                    BitSet bitSet = mnmVar.d;
                    bitSet.set(0);
                    mnpVar.d = nhwVar;
                    bitSet.set(3);
                    mnpVar.s = nhwVar.w() ? ogrVar5.o(nhwVar.m(), oalVar) : null;
                    bitSet.set(8);
                    mnpVar.t = nhwVar.x() ? ogrVar5.o(nhwVar.n(), oalVar) : null;
                    bitSet.set(9);
                    mnpVar.r = nhwVar.v() ? ogrVar5.o(nhwVar.l(), oalVar) : null;
                    bitSet.set(7);
                    mnpVar.u = nhwVar.y() ? ogrVar5.o(nhwVar.o(), oalVar) : null;
                    bitSet.set(10);
                    mnpVar.w = ofyVar4;
                    bitSet.set(12);
                    mnpVar.f = ocoVar7;
                    bitSet.set(6);
                    mnpVar.x = mrgVar3;
                    bitSet.set(5);
                    mnpVar.c = oapVar5;
                    bitSet.set(2);
                    mnpVar.e = z || zI;
                    bitSet.set(4);
                    mnpVar.b = oalVar;
                    bitSet.set(1);
                    mnpVar.v = map4;
                    bitSet.set(11);
                    return mnmVar;
                }
                mng mngVar = new mng(druVar, new mni());
                mni mniVar = mngVar.a;
                mniVar.a = oaaVar6;
                BitSet bitSet2 = mngVar.d;
                bitSet2.set(0);
                mniVar.c = nhwVar;
                bitSet2.set(3);
                mniVar.u = nhwVar.w() ? ogrVar5.o(nhwVar.m(), oalVar) : null;
                bitSet2.set(7);
                mniVar.v = nhwVar.x() ? ogrVar5.o(nhwVar.n(), oalVar) : null;
                bitSet2.set(8);
                mniVar.t = nhwVar.v() ? ogrVar5.o(nhwVar.l(), oalVar) : null;
                bitSet2.set(6);
                mniVar.w = nhwVar.y() ? ogrVar5.o(nhwVar.o(), oalVar) : null;
                bitSet2.set(9);
                mniVar.y = ofyVar4;
                bitSet2.set(11);
                mniVar.s = ocoVar7;
                bitSet2.set(5);
                mniVar.z = mrgVar3;
                bitSet2.set(2);
                mniVar.e = z || zI;
                mniVar.r = false;
                mniVar.b = oalVar;
                bitSet2.set(1);
                mniVar.x = map4;
                bitSet2.set(10);
                mniVar.f = zM;
                mniVar.d = zH;
                bitSet2.set(4);
                return mngVar;
            }
        }, null, nhw.L, false));
        mov movVar7 = (mov) this.ad.a();
        u();
        yqt yqtVarI6 = yqt.i(aejlVar13);
        oco ocoVar7 = (oco) aejlVar5.a();
        aejl aejlVar18 = this.ae;
        aejl aejlVar19 = this.ag;
        aehf aehfVarB = aejf.b(aejlVar18);
        mxi mxiVar = (mxi) aejlVar19.a();
        aejl aejlVar20 = this.m;
        mzj mzjVar = (mzj) this.N.a();
        agfx agfxVar = (agfx) aejlVar12.a();
        yqt yqtVarI7 = yqt.i(Boolean.valueOf(q()));
        aehf aehfVarB2 = aejf.b(this.ah);
        yqt yqtVarI8 = yqt.i(Boolean.valueOf(p()));
        eup eupVar = this.g;
        Boolean bool2 = true;
        yynVarH.c(nhf.class, movVar7.a((oea) aejlVar15.a(), null, new mqk(yqtVarI6, ocoVar7, aehfVarB, mxiVar, aejlVar20, mzjVar, agfxVar, yqtVarI7, aehfVarB2, yqtVarI8, yqt.i(bool2), yqt.i((ComponentConfig) this.ai.a())), nhf.J, false));
        mov movVar8 = (mov) this.aj.a();
        aejl aejlVar21 = this.am;
        mpn mpnVar = new mpn();
        oea oeaVar7 = (oea) aejlVar15.a();
        yynVarH.c(nhb.class, ((yqz) yqt.i((oap) aejlVar6.a())).a instanceof ogk ? movVar8.a(oeaVar7, null, (mou) aejlVar21.a(), nhb.I, false) : movVar8.a(oeaVar7, null, mpnVar, nhb.I, false));
        mov movVar9 = (mov) this.an.a();
        oea oeaVar8 = (oea) aejlVar15.a();
        yqt yqtVarI9 = yqt.i(new tku(new zdd(new tmn((Context) eupVar.n.a(), (tmi) this.j.a())), eupVar.eL()));
        oco ocoVar8 = (oco) aejlVar5.a();
        oaa oaaVar6 = (oaa) aejlVar3.a();
        mrf mrfVar = new mrf(yyr.k(aeeq.class, new mrc((Context) eupVar.n.a(), (oco) aejlVar5.a(), ypvVar)), yyrVar, (oco) aejlVar5.a());
        mrg mrgVar3 = new mrg(yyrVar);
        yqt yqtVarI10 = yqt.i(Float.valueOf(0.0f));
        yqt yqtVarI11 = yqt.i(bool2);
        odj odjVar = (odj) ((yqz) yqtVarI9).a;
        bool2.getClass();
        float fFloatValue = ((Float) ((yqz) yqtVarI10).a).floatValue();
        boolean zBooleanValue = ((Boolean) ((yqz) yqtVarI11).a).booleanValue();
        bool.getClass();
        final nyg nygVar = new nyg(ocoVar8, zBooleanValue, odjVar, oaaVar6, fFloatValue, mrfVar, mrgVar3);
        yynVarH.c(nke.class, movVar9.a(oeaVar8, new mot() { // from class: nyh
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                nke nkeVar = (nke) obj2;
                if (!nkeVar.n()) {
                    throw new ocp("ImageType.image missing");
                }
                nyg nygVar2 = nygVar;
                njs njsVarK = nkeVar.k();
                nyc nycVar = new nyc(druVar, new nyf());
                nyf nyfVar = nycVar.a;
                nyfVar.r = njsVarK;
                BitSet bitSet = nycVar.d;
                bitSet.set(1);
                oco ocoVar9 = nygVar2.a;
                nyfVar.u = ocoVar9;
                bitSet.set(6);
                nyfVar.v = true;
                bitSet.set(7);
                nyfVar.e = nygVar2.b;
                bitSet.set(0);
                if (nkeVar.l()) {
                    nyfVar.d = nkeVar.i();
                }
                if (nkeVar.m()) {
                    nyfVar.f = nkeVar.j();
                }
                nyfVar.s = nygVar2.c;
                ogr ogrVar5 = new ogr(ocoVar9);
                if (njsVarK.l() == 5 || njsVarK.l() == 4 || njsVarK.l() == 6) {
                    ogq ogqVarO = nkeVar.p() ? ogrVar5.o(nkeVar.h(), oalVar) : null;
                    ogq ogqVarO2 = nkeVar.o() ? ogrVar5.o(nkeVar.g(), oalVar) : null;
                    nyfVar.b = new ogf(ogqVarO != null ? ogqVarO.a() : null, ogqVarO2 != null ? ogqVarO2.a() : null, nygVar2.d, nkeVar);
                }
                float f = nygVar2.e;
                nyfVar.w = nkeVar.r();
                bitSet.set(5);
                nyfVar.x = nkeVar.q();
                nyfVar.c = oalVar;
                nyfVar.t = f;
                bitSet.set(2);
                if (nlrVar != null) {
                    mii miiVar = ncx.z;
                    nyfVar.a = Boolean.valueOf(nlrVar.b(miiVar) && ((ncx) nlrVar.a(miiVar)).l() && ((ncx) nlrVar.a(miiVar)).i().equals("primary_image"));
                }
                mrg mrgVar4 = nygVar2.g;
                nyfVar.y = nygVar2.f;
                bitSet.set(3);
                nyfVar.z = mrgVar4;
                bitSet.set(4);
                return nycVar;
            }
        }, null, nke.T, false));
        mov movVar10 = (mov) this.ao.a();
        oea oeaVar9 = (oea) aejlVar15.a();
        final oaa oaaVar7 = (oaa) aejlVar3.a();
        final oco ocoVar9 = (oco) aejlVar5.a();
        bool.getClass();
        yynVarH.c(ndh.class, movVar10.a(oeaVar9, new mot() { // from class: mkn
            @Override // defpackage.mot
            public final drn a(dru druVar, oal oalVar, Object obj2, String str2, nlr nlrVar, mlm mlmVar, List list) {
                ndh ndhVar = (ndh) obj2;
                if (!ndhVar.q()) {
                    throw new ocp("AnimatedVectorType.animation missing");
                }
                if (!ndhVar.k().j() && !ndhVar.k().l() && !ndhVar.k().k() && !ndhVar.k().k()) {
                    throw new ocp("AnimatedVectorType.animation doesn't have url or jsonStr or client resource.");
                }
                oaa oaaVar8 = oaaVar7;
                oco ocoVar10 = ocoVar9;
                ogr ogrVar5 = new ogr(ocoVar10);
                mkl mklVar = new mkl(druVar, new mkm());
                mkm mkmVar = mklVar.a;
                mkmVar.a = oaaVar8;
                BitSet bitSet = mklVar.d;
                bitSet.set(0);
                mkmVar.b = oalVar;
                bitSet.set(1);
                mkmVar.r = ndhVar;
                bitSet.set(5);
                mkmVar.d = ocoVar10;
                bitSet.set(2);
                mkmVar.s = mlmVar;
                mkmVar.e = ndhVar.s() ? ogrVar5.o(ndhVar.l(), oalVar) : null;
                bitSet.set(3);
                mkmVar.f = ndhVar.t() ? ogrVar5.o(ndhVar.m(), oalVar) : null;
                bitSet.set(4);
                mkmVar.c = str2;
                return mklVar;
            }
        }, null, ndh.A, false));
        return yynVarH.a(true);
    }

    final Map o() {
        yyn yynVarH = yyr.h(8);
        yynVarH.c(aeeh.class, new msr());
        yynVarH.c(aefq.class, new mtz());
        aejl aejlVar = this.R;
        aejl aejlVar2 = this.I;
        aejl aejlVar3 = this.A;
        yynVarH.c(aeev.class, new msw(aejf.b(aejlVar3), aejf.b(aejlVar2), aejf.b(aejlVar)));
        yynVarH.c(aeez.class, new mtx((oaa) aejlVar3.a(), (ogr) aejlVar.a(), (mtb) this.Q.a()));
        yynVarH.c(aegh.class, new mug());
        yyr yyrVarK = yyr.k(nez.class, new mwd());
        mky mkyVar = new mky((oco) this.s.a());
        acyf acyfVar = acyf.a;
        abyy abwxVar = acyf.b;
        if (abwxVar == null) {
            synchronized (acyf.class) {
                abwxVar = acyf.b;
                if (abwxVar == null) {
                    abwxVar = new abwx(acyf.a);
                    acyf.b = abwxVar;
                }
            }
        }
        Pair pairCreate = Pair.create(mkyVar, abwxVar);
        pairCreate.getClass();
        aejl aejlVar4 = this.s;
        yynVarH.c(aegx.class, new mum(yyrVarK, yyr.k(acyf.class, pairCreate), (oco) aejlVar4.a()));
        aejl aejlVar5 = this.A;
        oaa oaaVar = (oaa) aejlVar5.a();
        aejl aejlVar6 = this.R;
        yynVarH.c(aegg.class, new muc(yyr.m(nki.class, new mri(oaaVar, (ogr) aejlVar6.a()), nkm.class, new mrl((oaa) aejlVar5.a(), (ogr) aejlVar6.a()), nky.class, new msa((oaa) aejlVar5.a(), (ogr) aejlVar6.a())), zcl.a, (oco) aejlVar4.a()));
        yynVarH.c(aehd.class, new muo((oaa) aejlVar5.a(), (ogr) aejlVar6.a(), (oco) aejlVar4.a()));
        return yynVarH.a(true);
    }

    final boolean p() {
        Context context = (Context) this.g.n.a();
        context.getClass();
        return afdz.a.eV().f(context);
    }

    final boolean q() {
        Context context = (Context) this.g.n.a();
        context.getClass();
        return afdz.a.eV().e(context);
    }

    final boolean r() {
        Context context = (Context) this.g.n.a();
        ocu ocuVar = agvy.c(null, true) ? ocu.MANUAL_INITIALIZATION : ocu.DISABLE;
        ocuVar.getClass();
        int iOrdinal = ((ocu) ((yqz) yqt.i(ocuVar)).a).ordinal();
        if (iOrdinal != 1) {
            return iOrdinal == 2;
        }
        if (mif.b) {
            return true;
        }
        synchronized (mif.a) {
            if (!mif.b) {
                if (!(context.getApplicationContext() instanceof Application)) {
                    throw new IllegalArgumentException("The Context instance doesn't provide Application which is required by EmojiCompat init process");
                }
                ark arkVar = new ark(context, new aee());
                arkVar.b = true;
                are areVar = new are();
                aqw aqwVar = arkVar.a;
                synchronized (((ari) aqwVar).a) {
                    ((ari) aqwVar).d = areVar;
                }
                if (aqy.b == null) {
                    synchronized (aqy.a) {
                        if (aqy.b == null) {
                            aqy.b = new aqy(arkVar);
                        }
                    }
                }
                aqy aqyVar = aqy.b;
                aqy aqyVarB = aqy.b();
                aqyVarB.d(new mie(aqyVarB));
            }
        }
        return true;
    }

    final tln s() {
        return new tln((Executor) this.g.m.a());
    }

    final tmq t() {
        return tmr.a(yqt.i(yqt.h(null)));
    }

    final void u() {
        int i = mwl.a;
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        bool.getClass();
    }
}

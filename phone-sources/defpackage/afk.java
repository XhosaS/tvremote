package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afk implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ afk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v4, types: [bol] */
    /* JADX WARN: Type inference failed for: r10v5, types: [agf] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boi] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v86, types: [bns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v22, types: [bvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, zr] */
    /* JADX WARN: Type inference failed for: r3v33, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, zr] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, zr] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v24, types: [bol, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        cgz cgzVarK;
        cfx cfxVarN;
        bni bniVarT;
        int i = 10;
        int i2 = 0;
        switch (this.c) {
            case 0:
                cgz cgzVar = (cgz) obj;
                this.a.b(cgzVar);
                this.b.a(cgzVar);
                return ygi.a;
            case 1:
                cgz cgzVar2 = (cgz) obj;
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((ajs) obj2).a.b(cgzVar2);
                }
                ?? r2 = this.b;
                if (r2 != 0) {
                    r2.a(cgzVar2);
                }
                return ygi.a;
            case 2:
                bmx bmxVar = (bmx) obj;
                cgz cgzVar3 = (cgz) this.a.a();
                if (cgzVar3 != null) {
                    this.b.a(Integer.valueOf(cgzVar3.j(bmxVar.a)));
                }
                return ygi.a;
            case 3:
                bwi bwiVar = (bwi) obj;
                List listM = hp.m(this.b, ((afx) this.a).a);
                if (listM != null) {
                    int size = listM.size();
                    while (i2 < size) {
                        yfw yfwVar = (yfw) listM.get(i2);
                        bwj bwjVar = (bwj) yfwVar.a;
                        yjk yjkVar = (yjk) yfwVar.b;
                        bwiVar.s(bwjVar, yjkVar != null ? ((cmf) yjkVar.a()).a : 0L, 0.0f);
                        i2++;
                    }
                }
                return ygi.a;
            case 4:
                ?? r1 = (boi) obj;
                Object obj3 = this.a;
                if (!((Boolean) new afi(obj3, 4).a()).booleanValue() || (cgzVarK = ((ajs) obj3).k()) == null || (cfxVarN = ajs.n((cfx) this.b, cgzVarK)) == null) {
                    bniVarT = null;
                } else {
                    int i3 = cfxVarN.b;
                    int i4 = cfxVarN.c;
                    bniVarT = cgzVarK.t(i3, i4);
                    bmy bmyVarL = cgzVarK.l(i3);
                    bniVarT.n(((Float.floatToRawIntBits(cgzVarK.g(i3) == cgzVarK.g(i4 - 1) ? Math.min(cgzVarK.l(r3).b, bmyVarL.b) : 0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(bmyVarL.c))) ^ (-9223372034707292160L));
                }
                agfVar = bniVarT != null ? new agf(bniVarT) : 0;
                if (agfVar != 0) {
                    r1.w(agfVar);
                    r1.q(true);
                }
                return ygi.a;
            case 5:
                Object obj4 = this.a;
                ?? r22 = ((ajs) obj4).b;
                Object obj5 = this.b;
                r22.add(obj5);
                return new pg(obj4, obj5, 6);
            case 6:
                fx fxVar = (fx) obj;
                Object obj6 = this.b;
                cgf cgfVar = (cgf) ((cfx) obj6).a;
                cha chaVarA = cgfVar.a();
                cgs cgsVar = chaVarA != null ? chaVarA.a : null;
                bhi bhiVar = (bhi) this.a;
                if (bhiVar.n()) {
                    cgfVar.a();
                }
                cgs cgsVarO = ajs.o(cgsVar);
                if (bhiVar.o()) {
                    cgfVar.a();
                }
                cgs cgsVarO2 = ajs.o(cgsVarO);
                if (bhiVar.p()) {
                    cgfVar.a();
                }
                fxVar.b = ((cfy) fxVar.a).b(new gk((Object) new ylb(), obj6, (Object) ajs.o(cgsVarO2), 5, (char[]) null));
                return ygi.a;
            case 7:
                bwi bwiVar2 = (bwi) obj;
                ?? r4 = this.a;
                if (r4 != 0) {
                    int size2 = r4.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        yfw yfwVar2 = (yfw) r4.get(i5);
                        bwiVar2.s((bwj) yfwVar2.a, ((cmf) yfwVar2.b).a, 0.0f);
                    }
                }
                ?? r42 = this.b;
                if (r42 != 0) {
                    int size3 = r42.size();
                    while (i2 < size3) {
                        yfw yfwVar3 = (yfw) r42.get(i2);
                        bwj bwjVar2 = (bwj) yfwVar3.a;
                        yjk yjkVar2 = (yjk) yfwVar3.b;
                        bwiVar2.s(bwjVar2, yjkVar2 != null ? ((cmf) yjkVar2.a()).a : 0L, 0.0f);
                        i2++;
                    }
                }
                return ygi.a;
            case 8:
                cb cbVar = (cb) obj;
                List list = ((agk) this.a).b;
                int size4 = list.size();
                while (i2 < size4) {
                    agj agjVar = (agj) list.get(i2);
                    if (agjVar instanceof agl) {
                        cbVar.a.add(new bhq(424163756, true, new ada((yjz) new aoq(agjVar, 1), (bkp) bkp.g, (yka) (((agl) agjVar).c == 0 ? null : new bhq(-1930700965, true, new ro(agjVar, 7))), (yjk) new qm(agjVar, this.b, i), 1)));
                    } else if (agjVar instanceof agn) {
                        cbVar.a.add(sr.a);
                    }
                    i2++;
                }
                return ygi.a;
            case 9:
                aafi aafiVar = (aafi) obj;
                yld yldVar = (yld) this.a;
                if (yldVar.a == -1) {
                    yldVar.a = aafiVar.a().a;
                }
                ((yld) this.b).a = aafiVar.a().b + 1;
                return "";
            case 10:
                bsz bszVar = (bsz) obj;
                long j = bszVar.c;
                alq alqVar = (alq) this.a;
                ?? A = alqVar.a.a();
                if (A != 0) {
                    anh anhVar = alqVar.b;
                    long j2 = alqVar.c;
                    if (A.s() && ani.a(anhVar, j2)) {
                        anhVar.f();
                        Object obj7 = this.b;
                        bszVar.b();
                        ((ylb) obj7).a = true;
                    }
                } else {
                    Object obj72 = this.b;
                    bszVar.b();
                    ((ylb) obj72).a = true;
                }
                return ygi.a;
            case 11:
                ((aov) this.b).a.b(new yf(this.a, (zr) obj));
                return ygi.a;
            case 12:
                long j3 = atc.a;
                if (!((auv) this.a).h()) {
                    this.b.a();
                }
                return ygi.a;
            case 13:
                long j4 = atc.a;
                if (!((auv) this.a).h()) {
                    this.b.a();
                }
                return ygi.a;
            case 14:
                Object obj8 = this.b;
                boi boiVar = (boi) obj;
                long j5 = atc.a;
                float fB = ((auv) obj8).b.b();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (boiVar.n & 4294967295L));
                if (!Float.isNaN(fB) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) ((mr) this.a).d()).floatValue();
                    boiVar.t(atc.b(boiVar, fFloatValue));
                    boiVar.u(atc.c(boiVar, fFloatValue));
                    boiVar.y(brx.E(0.5f, (fB + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return ygi.a;
            case 15:
                cfc cfcVar = (cfc) obj;
                Object obj9 = this.a;
                long j6 = atc.a;
                cfk.p(cfcVar, 1.0f);
                cfk.g(cfcVar, (String) obj9);
                cfk.e(cfcVar, null, new aoe(this.b, i));
                return ygi.a;
            case 16:
                bpq bpqVar = (bpq) obj;
                float fCr = bpqVar.cr(2.0f);
                ?? r3 = this.a;
                float f = fCr / 2.0f;
                brx.F(bpqVar, ((bnq) r3.a()).h, bpqVar.cr(10.0f) - f, 0L, new bpt(fCr, 0.0f, 0, 0, 30), 108);
                ?? r43 = this.b;
                if (Float.compare(((cma) r43.a()).a, 0.0f) > 0) {
                    brx.F(bpqVar, ((bnq) r3.a()).h, bpqVar.cr(((cma) r43.a()).a) - f, 0L, bps.a, 108);
                }
                return ygi.a;
            case 17:
                ((ayy) this.b).f(new yf(this.a, (zr) obj));
                return ygi.a;
            case 18:
                float f2 = aun.a;
                ((ayy) this.b).f(new yf(this.a, (zr) obj));
                return ygi.a;
            case 19:
                bnj.y((bpq) obj, (boe) this.b, this.a.a(), 0.0f, 60);
                return ygi.a;
            default:
                blr blrVar = (blr) obj;
                return blrVar.p(new lk(new afk(this.b.a(blrVar.m(), blrVar.n(), blrVar), this.a, 19, agfVar), 13));
        }
    }

    public /* synthetic */ afk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}

package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asl implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public asl(arl arlVar, ath athVar, auq auqVar, axg axgVar, yjz yjzVar, int i) {
        this.f = i;
        this.a = arlVar;
        this.b = athVar;
        this.c = auqVar;
        this.d = axgVar;
        this.e = yjzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [bib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ath] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ahl] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        yy yyVar;
        int i = this.f;
        int i2 = 2;
        if (i == 0) {
            bao baoVar = (bao) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i3 = iIntValue & 3;
            if (baoVar.L(i3 != 2, iIntValue & 1)) {
                Object objD = this.a;
                if (objD == null) {
                    long j = azq.a;
                    objD = arm.d(azq.G, 0L, azq.N, azq.U, 0L, 0L, 0L, 0L, 0L, azq.d, 0L, -33558793);
                }
                Object obj3 = this.b;
                ?? r3 = obj3;
                if (obj3 == null) {
                    r3 = atf.a;
                }
                Object auqVar = this.c;
                if (auqVar == null) {
                    auqVar = new auq(null);
                }
                arl arlVar = (arl) objD;
                asm.b(arlVar, r3, (auq) auqVar, (axg) this.d, this.e, baoVar, 0);
            } else {
                baoVar.t();
            }
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            int i4 = iIntValue2 & 3;
            if (baoVar2.L(i4 != 2, iIntValue2 & 1)) {
                ?? r2 = this.c;
                Object obj4 = this.b;
                Object objG = baoVar2.g();
                if (objG == ban.a) {
                    objG = new agt(obj4, i2);
                    baoVar2.A(objG);
                }
                bkp bkpVarT = fh.T(r2, (yjv) objG);
                ?? r4 = this.e;
                Object obj5 = this.a;
                ?? r7 = this.d;
                bvt bvtVarA = xo.a(bkb.a, true);
                int iK = a.k(zy.p(baoVar2));
                bhu bhuVarO = baoVar2.O();
                bkp bkpVarC = bdi.C(baoVar2, bkpVarT);
                yjk yjkVar = bxt.a;
                baoVar2.c();
                baoVar2.z();
                if (baoVar2.J()) {
                    baoVar2.k(yjkVar);
                } else {
                    baoVar2.B();
                }
                beb.a(baoVar2, bvtVarA, bxt.d);
                beb.a(baoVar2, bhuVarO, bxt.c);
                yjz yjzVar = bxt.e;
                if (baoVar2.J() || !yks.e(baoVar2.g(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    baoVar2.A(numValueOf);
                    baoVar2.i(numValueOf, yjzVar);
                }
                beb.a(baoVar2, bkpVarC, bxt.b);
                r4.a(baoVar2, 0);
                ((ahl) obj5).c(r7, baoVar2, 6);
                baoVar2.o();
            } else {
                baoVar2.t();
            }
            return ygi.a;
        }
        if (i == 2) {
            bao baoVar3 = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
                baoVar3.t();
            } else {
                Object obj6 = this.c;
                boolean zH = baoVar3.H(obj6);
                Object obj7 = this.e;
                boolean zH2 = zH | baoVar3.H(obj7);
                Object obj8 = this.b;
                Object objG2 = baoVar3.g();
                if (zH2 || objG2 == ban.a) {
                    objG2 = new gk(obj8, obj6, obj7, 17, (int[]) null);
                    baoVar3.A(objG2);
                }
                bbn.c(obj6, (yjv) objG2, baoVar3);
                fus.E((fwr) obj6, this.a, bga.k(-497631156, new awh(this.d, obj6, 7, null), baoVar3), baoVar3, 384);
            }
            return ygi.a;
        }
        bao baoVar4 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar4.K()) {
            baoVar4.t();
        } else {
            Object obj9 = this.d;
            jxa jxaVar = (jxa) obj9;
            if ((jxaVar.f().b & 1) != 0) {
                wqn wqnVar = jxaVar.f().c;
                if (wqnVar == null) {
                    wqnVar = wqn.a;
                }
                wqn wqnVar2 = wqnVar;
                wqnVar2.getClass();
                irc ircVarK = jxaVar.k();
                bkm bkmVar = bkp.g;
                if (((wqo) jxaVar.h().get(((bdn) this.c).e())).c == 12) {
                    yy yyVar2 = jww.a;
                    yyVar = jww.c;
                } else {
                    yy yyVar3 = jww.a;
                    yyVar = jww.b;
                }
                bkp bkpVarO = wv.o(bkmVar, yyVar);
                bcb bcbVarC = jxaVar.c();
                baoVar4.x(-1224400529);
                boolean zH3 = baoVar4.H(obj9);
                Object obj10 = this.a;
                boolean zH4 = zH3 | baoVar4.H(obj10);
                Object obj11 = this.e;
                boolean zH5 = zH4 | baoVar4.H(obj11);
                Object obj12 = this.b;
                Object objG3 = baoVar4.g();
                if (zH5 || objG3 == ban.a) {
                    nz nzVar = new nz(obj12, obj9, obj10, obj11, 12, null);
                    baoVar4.A(nzVar);
                    objG3 = nzVar;
                }
                baoVar4.p();
                jwq.k(wqnVar2, ircVarK, bcbVarC, (yjk) objG3, bkpVarO, baoVar4, 0);
            }
        }
        return ygi.a;
    }

    public asl(bkp bkpVar, bcb bcbVar, yjz yjzVar, ahl ahlVar, yjk yjkVar, int i) {
        this.f = i;
        this.c = bkpVar;
        this.b = bcbVar;
        this.e = yjzVar;
        this.a = ahlVar;
        this.d = yjkVar;
    }

    public asl(fwr fwrVar, fyg fygVar, bib bibVar, bje bjeVar, fyf fyfVar, int i) {
        this.f = i;
        this.c = fwrVar;
        this.e = fygVar;
        this.a = bibVar;
        this.b = bjeVar;
        this.d = fyfVar;
    }

    public asl(jxa jxaVar, bdn bdnVar, Context context, yow yowVar, bhi bhiVar, int i) {
        this.f = i;
        this.d = jxaVar;
        this.c = bdnVar;
        this.a = context;
        this.e = yowVar;
        this.b = bhiVar;
    }
}

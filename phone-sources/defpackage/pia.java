package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pia implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final /* synthetic */ int f;

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.f) {
            case 0:
                xcq xcqVar = this.b;
                return new phz(((phy) this.a).b(), (uhs) xcqVar.b(), ((pfx) this.c).b(), (oxp) this.d.b(), (uhs) this.e.b());
            case 1:
                qjm qjmVar = (qjm) this.b.b();
                xcq xcqVar2 = this.a;
                return new pbk(qjmVar, ((pfl) this.c).b(), ((qhp) this.d).b(), ((qhq) xcqVar2).b(), this.e);
            case 2:
                uhs uhsVar = (uhs) this.e.b();
                xcq xcqVar3 = this.a;
                return new piq(uhsVar, this.b, xcl.a(this.d), (String) xcqVar3.b(), xcl.a(this.c));
            case 3:
                xcq xcqVar4 = this.c;
                pjg pjgVarB = ((pjl) this.d).b();
                uhs uhsVar2 = (uhs) xcqVar4.b();
                xcq xcqVar5 = this.b;
                Set setB = ((xcs) this.a).b();
                return new pji(uhsVar2, this.e, setB, pjgVarB);
            case 4:
                pnh pnhVar = (pnh) this.d.b();
                pjo pjoVar = (pjo) this.b.b();
                tst tstVar = (tst) ((xcn) this.e).a;
                tst tstVar2 = (tst) ((xcn) this.c).a;
                pmf pmfVar = new pmf(pnhVar, pjoVar, ((pmo) this.a).b());
                if (tstVar.g()) {
                    pmfVar.c = ((Boolean) tstVar.c()).booleanValue();
                }
                if (tstVar2.g()) {
                    pmfVar.d = ((Boolean) tstVar2.c()).booleanValue();
                }
                return pmfVar;
            case 5:
                xcq xcqVar6 = this.c;
                return new pul(((rgq) this.e).a(), ((xcs) this.a).b(), (qgq) xcqVar6.b(), (pvg) this.d.b(), (qoj) this.b.b());
            case 6:
                qbr qbrVar = (qbr) this.a.b();
                nsf nsfVar = (nsf) this.e.b();
                xcq xcqVar7 = this.b;
                return new yyh(qbrVar, nsfVar, ((mdx) this.c).a(), ((mdx) this.d).a(), ((mdx) xcqVar7).a());
            case 7:
                return new pxk((pwp) this.a.b(), (pvg) this.b.b(), (qja) this.d.b(), (osk) this.e.b(), (tst) ((xcn) this.c).a);
            case 8:
                qai qaiVar = (qai) this.d.b();
                qsy qsyVar = (qsy) this.b.b();
                xcq xcqVar8 = this.c;
                return new pxs(qaiVar, qsyVar, xcl.a(this.e), ((pxv) this.a).b(), ((pxo) xcqVar8).a());
            case 9:
                qha qhaVarB = ((qhc) this.c).b();
                ntp ntpVar = (ntp) this.d.b();
                uhs uhsVar3 = (uhs) this.b.b();
                sgr sgrVarB = ((qpq) this.e).b();
                tsp tspVar = vry.a;
                return new qpp(qhaVarB, ntpVar, uhsVar3, sgrVarB, ((qia) this.a).b());
            case 10:
                xcq xcqVar9 = this.e;
                xcq xcqVar10 = this.c;
                return new yyh(((rcz) this.b).b(), ((raq) this.d).b(), ((qzs) xcqVar10).b(), ((rbj) this.a).b(), ((qzr) xcqVar9).b());
            default:
                xcq xcqVar11 = this.c;
                xcq xcqVar12 = this.e;
                xcq xcqVar13 = this.a;
                rzy rzyVarB = ((rck) this.b).b();
                rci rciVarB = ((rcl) xcqVar13).b();
                cb cbVarB = ((rby) xcqVar12).b();
                ((rbz) xcqVar11).b();
                return new rcb(rzyVarB, rciVarB, cbVarB, ((mii) this.d).b());
        }
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
        this.e = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, char[] cArr) {
        this.f = i;
        this.e = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
        this.c = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, float[] fArr) {
        this.f = i;
        this.a = xcqVar;
        this.e = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.b = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, int[] iArr) {
        this.f = i;
        this.d = xcqVar;
        this.b = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.c = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, short[] sArr) {
        this.f = i;
        this.d = xcqVar;
        this.c = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.b = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, boolean[] zArr) {
        this.f = i;
        this.e = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.b = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.e = xcqVar4;
        this.c = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, int[][] iArr) {
        this.f = i;
        this.b = xcqVar;
        this.d = xcqVar2;
        this.c = xcqVar3;
        this.a = xcqVar4;
        this.e = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, short[][] sArr) {
        this.f = i;
        this.c = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.e = xcqVar4;
        this.a = xcqVar5;
    }

    public pia(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.e = xcqVar3;
        this.c = xcqVar4;
        this.d = xcqVar5;
    }
}

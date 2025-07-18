package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgm implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final /* synthetic */ int e;

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.e) {
            case 0:
                return new pgl((tst) ((xcn) this.a).a, (pfn) this.b.b(), (oxp) this.c.b(), ((qib) this.d).a());
            case 1:
                return new pgi((pfn) this.a.b(), ((qib) this.d).a(), (pfs) this.b.b(), (oxp) this.c.b());
            case 2:
                xcq xcqVar = this.d;
                xcq xcqVar2 = this.b;
                kwy kwyVarB = ((phd) this.c).b();
                pkg pkgVarB = ((pfx) xcqVar2).b();
                oxp oxpVar = (oxp) xcqVar.b();
                return new phl(kwyVarB, pkgVarB, oxpVar, 1);
            case 3:
                xcq xcqVar3 = this.d;
                xcq xcqVar4 = this.a;
                kwy kwyVarB2 = ((phs) this.b).b();
                pkg pkgVarB2 = ((pfx) xcqVar4).b();
                oxp oxpVar2 = (oxp) xcqVar3.b();
                return new phl(kwyVarB2, pkgVarB2, oxpVar2, 0);
            case 4:
                return new pic(((rgq) this.a).a(), (pfn) this.b.b(), ((qib) this.d).a(), (oxp) this.c.b());
            case 5:
                return new plu((oyx) this.c.b(), ((iyu) this.a).a(), ((iyu) this.b).a(), (uhs) this.d.b());
            case 6:
                pnh pnhVar = (pnh) this.d.b();
                pjo pjoVar = (pjo) this.c.b();
                tst tstVar = (tst) ((xcn) this.a).a;
                pmb pmbVar = new pmb(pnhVar, pjoVar, ((pmn) this.b).b());
                if (tstVar.g() && ((Boolean) tstVar.c()).booleanValue()) {
                    pmbVar.c = true;
                }
                return pmbVar;
            case 7:
                return new ptj(((qoe) this.b).a(), (pyd) this.c.b(), (pzq) this.a.b(), ((mdx) this.d).a());
            case 8:
                return new pun(((rgq) this.a).a(), ((xcs) this.b).b(), (pvg) this.d.b(), (qoj) this.c.b());
            case 9:
                return new pur((pxf) this.d.b(), (nsf) this.c.b(), (Set) ((xcn) this.b).a, ((qca) this.a).b());
            case 10:
                return new pwo((qsy) this.a.b(), xcl.a(this.b), (qsx) this.c.b(), (qjl) this.d.b());
            case 11:
                return new pxn((pxk) this.c.b(), (pxs) this.a.b(), ((pxy) this.b).b(), ((mdx) this.d).a());
            case 12:
                pzu pzuVar = new pzu((pyd) this.c.b(), (qai) this.a.b());
                pzuVar.a = ((qoe) this.b).a();
                pzuVar.b = ((xco) this.d).b();
                return pzuVar;
            case 13:
                qaa qaaVar = new qaa((pyd) this.c.b(), (ntp) this.a.b());
                qaaVar.a = ((qoe) this.b).a();
                qaaVar.b = ((xco) this.d).b();
                return qaaVar;
            case 14:
                qaf qafVar = new qaf((pyd) this.c.b(), (qai) this.a.b());
                qafVar.a = ((qoe) this.b).a();
                qafVar.b = ((xco) this.d).b();
                return qafVar;
            case 15:
                return new qbk((pxf) this.d.b(), ((qoe) this.b).a(), (pvg) this.c.b(), (osk) this.a.b());
            case 16:
                return new qjp(((rgq) this.c).a(), ((mdx) this.a).a(), (Class) this.b.b(), (qoj) this.d.b());
            case 17:
                ((qod) this.a).b();
                return new qtl();
            case 18:
                Executor executor = (!((rnd) this.b.b()).c || ((tst) ((xcn) this.c).a).g()) ? (Executor) this.a.b() : (Executor) this.d.b();
                executor.getClass();
                return executor;
            case 19:
                return new rou((cb) this.c.b(), (rpb) this.a.b(), this.b, this.d);
            default:
                return new rru(((rqe) this.b).b(), xcl.a(this.d), (Executor) this.c.b());
        }
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, char[] cArr) {
        this.e = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, char[] cArr, byte[] bArr) {
        this.e = i;
        this.b = xcqVar;
        this.d = xcqVar2;
        this.a = xcqVar3;
        this.c = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, float[] fArr) {
        this.e = i;
        this.d = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
        this.a = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, int[] iArr) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, short[] sArr) {
        this.e = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, boolean[] zArr) {
        this.e = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.d = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
        this.d = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, float[][][] fArr) {
        this.e = i;
        this.d = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, short[][][] sArr) {
        this.e = i;
        this.d = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.a = xcqVar4;
    }

    public pgm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
    }
}

package defpackage;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ele implements eam, ewg, eoz {
    public final ecn a;
    public final eld b;
    public final SparseArray c;
    public eao d;
    public ecu e;
    public fvu f;
    private final eav g;
    private final eax h;
    private boolean i;

    public ele(ecn ecnVar) {
        ecnVar.getClass();
        this.a = ecnVar;
        this.f = new fvu(edt.N(), ecnVar, new ekw(0));
        eav eavVar = new eav();
        this.g = eavVar;
        this.h = new eax();
        this.b = new eld(eavVar);
        this.c = new SparseArray();
    }

    private final ekl O(int i, evz evzVar) {
        this.d.getClass();
        if (evzVar != null) {
            return this.b.a(evzVar) != null ? H(evzVar) : I(eay.a, i, evzVar);
        }
        eay eayVarN = this.d.N();
        if (i >= eayVarN.c()) {
            eayVarN = eay.a;
        }
        return I(eayVarN, i, null);
    }

    private final ekl P(eah eahVar) {
        evz evzVar;
        return (!(eahVar instanceof eii) || (evzVar = ((eii) eahVar).o) == null) ? G() : H(evzVar);
    }

    @Override // defpackage.eam
    public final void A(ebf ebfVar) {
        N(G(), 19, new eit(2));
    }

    @Override // defpackage.eam
    public final void B(ebh ebhVar) {
        ekl eklVarG = G();
        N(eklVarG, 2, new ekn(eklVarG, (Object) ebhVar, 4));
    }

    @Override // defpackage.eam
    public final void C(ebo eboVar) {
        ekl eklVarK = K();
        N(eklVarK, 25, new ekn(eklVarK, (Object) eboVar, 13));
    }

    @Override // defpackage.eam
    public final void D(final float f) {
        final ekl eklVarK = K();
        N(eklVarK, 22, new ecw() { // from class: ekp
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ((ekm) obj).M(eklVarK, f);
            }
        });
    }

    public final ekl G() {
        return H(this.b.c);
    }

    public final ekl H(evz evzVar) {
        this.d.getClass();
        eay eayVarA = evzVar == null ? null : this.b.a(evzVar);
        if (evzVar != null && eayVarA != null) {
            return I(eayVarA, eayVarA.o(evzVar.a, this.g).h, evzVar);
        }
        int iBd = this.d.bd();
        eay eayVarN = this.d.N();
        if (iBd >= eayVarN.c()) {
            eayVarN = eay.a;
        }
        return I(eayVarN, iBd, null);
    }

    protected final ekl I(eay eayVar, int i, evz evzVar) {
        evz evzVar2 = true == eayVar.q() ? null : evzVar;
        long jA = this.a.a();
        boolean z = eayVar.equals(this.d.N()) && i == this.d.bd();
        long jB = 0;
        if (evzVar2 == null || !evzVar2.b()) {
            if (z) {
                jB = this.d.C();
            } else if (!eayVar.q()) {
                jB = eayVar.p(i, this.h).b();
            }
        } else if (z && this.d.bb() == evzVar2.b && this.d.bc() == evzVar2.c) {
            jB = this.d.D();
        }
        return new ekl(jA, eayVar, i, evzVar2, jB, this.d.N(), this.d.bd(), this.b.c, this.d.D(), this.d.I());
    }

    public final ekl J() {
        return H(this.b.d);
    }

    public final ekl K() {
        return H(this.b.e);
    }

    public final void L(ekm ekmVar) {
        ekmVar.getClass();
        this.f.c(ekmVar);
    }

    public final void M() {
        if (this.i) {
            return;
        }
        ekl eklVarG = G();
        this.i = true;
        N(eklVarG, -1, new eit(10));
    }

    public final void N(ekl eklVar, int i, ecw ecwVar) {
        this.c.put(i, eklVar);
        this.f.h(i, ecwVar);
    }

    @Override // defpackage.eam
    public final void b(int i) {
        ekl eklVarK = K();
        N(eklVarK, 21, new eis(eklVarK, i, 8));
    }

    @Override // defpackage.eam
    public final void c(eak eakVar) {
        N(G(), 13, new eit(4));
    }

    @Override // defpackage.ewg
    public final void cX(int i, evz evzVar, evv evvVar) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1004, new ekn((Object) eklVarO, (Object) evvVar, 6));
    }

    @Override // defpackage.eoz
    public final void cY(int i, evz evzVar) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1023, new eky(eklVarO, 4));
    }

    @Override // defpackage.eoz
    public final void cZ(int i, evz evzVar) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1026, new eky(eklVarO, 0));
    }

    @Override // defpackage.eam
    public final void d(ecb ecbVar) {
        N(G(), 27, new eit(11));
    }

    @Override // defpackage.eoz
    public final void da(int i, evz evzVar) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1025, new eky(eklVarO, 2));
    }

    @Override // defpackage.eoz
    public final void db(int i, evz evzVar, int i2) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1022, new eis(eklVarO, i2, 7));
    }

    @Override // defpackage.eam
    public final void dc(boolean z) {
        ekl eklVarG = G();
        N(eklVarG, 3, new eko(eklVarG, z, 1));
    }

    @Override // defpackage.eam
    public final void dd(boolean z) {
        ekl eklVarG = G();
        N(eklVarG, 7, new eko(eklVarG, z, 2));
    }

    @Override // defpackage.eam
    public final void df(dzy dzyVar, int i) {
        ekl eklVarG = G();
        N(eklVarG, 1, new eis(eklVarG, i, 3));
    }

    @Override // defpackage.eam
    public final void dg(eab eabVar) {
        N(G(), 14, new eit(14));
    }

    @Override // defpackage.eam
    public final void dh(ead eadVar) {
        ekl eklVarG = G();
        N(eklVarG, 28, new ekn(eklVarG, (Object) eadVar, 3));
    }

    @Override // defpackage.ewg
    public final void di(int i, evz evzVar, evv evvVar) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1005, new ekn((Object) eklVarO, (Object) evvVar, 16));
    }

    @Override // defpackage.eam
    public final void e(List list) {
        N(G(), 27, new eit(7));
    }

    @Override // defpackage.eam
    public final void el(dyo dyoVar) {
        ekl eklVarK = K();
        N(eklVarK, 20, new ekn(eklVarK, (Object) dyoVar, 2));
    }

    @Override // defpackage.eoz
    public final void f(int i, evz evzVar, Exception exc) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1024, new ekn((Object) eklVarO, (Object) exc, 8));
    }

    @Override // defpackage.eoz
    public final void g(int i, evz evzVar) {
        ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1027, new eky(eklVarO, 5));
    }

    @Override // defpackage.ewg
    public final void h(int i, evz evzVar, evq evqVar, evv evvVar) {
        N(O(i, evzVar), 1002, new eit(8));
    }

    @Override // defpackage.ewg
    public final void i(int i, evz evzVar, evq evqVar, evv evvVar) {
        N(O(i, evzVar), 1001, new ekn(evqVar, evvVar, 9));
    }

    @Override // defpackage.ewg
    public final void j(int i, evz evzVar, final evq evqVar, final evv evvVar, final IOException iOException, boolean z) {
        final ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1003, new ecw() { // from class: ekr
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ((ekm) obj).ar(eklVarO, evqVar, evvVar, iOException);
            }
        });
    }

    @Override // defpackage.ewg
    public final void k(int i, evz evzVar, final evq evqVar, final evv evvVar, int i2) {
        final ekl eklVarO = O(i, evzVar);
        N(eklVarO, 1000, new ecw() { // from class: elc
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ekm ekmVar = (ekm) obj;
                ekmVar.r(eklVarO, evqVar, evvVar);
                ekmVar.Z();
            }
        });
    }

    @Override // defpackage.eam
    public final void l(boolean z, int i) {
        ekl eklVarG = G();
        N(eklVarG, 5, new eku(eklVarG, z, i, 0));
    }

    @Override // defpackage.eam
    public final void m(eai eaiVar) {
        ekl eklVarG = G();
        N(eklVarG, 12, new ekn(eklVarG, (Object) eaiVar, 1));
    }

    @Override // defpackage.eam
    public final void n(int i) {
        ekl eklVarG = G();
        N(eklVarG, 4, new eis(eklVarG, i, 6));
    }

    @Override // defpackage.eam
    public final void o(int i) {
        ekl eklVarG = G();
        N(eklVarG, 6, new eis(eklVarG, i, 4));
    }

    @Override // defpackage.eam
    public final void p(eah eahVar) {
        ekl eklVarP = P(eahVar);
        N(eklVarP, 10, new ekn(eklVarP, (Object) eahVar, 7));
    }

    @Override // defpackage.eam
    public final void q(eah eahVar) {
        N(P(eahVar), 10, new eit(6));
    }

    @Override // defpackage.eam
    public final void r(boolean z, int i) {
        ekl eklVarG = G();
        N(eklVarG, -1, new eku(eklVarG, z, i, 1));
    }

    @Override // defpackage.eam
    public final void s(eab eabVar) {
        N(G(), 15, new eit(9));
    }

    @Override // defpackage.eam
    public final void t(final ean eanVar, final ean eanVar2, final int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        eld eldVar = this.b;
        eao eaoVar = this.d;
        eaoVar.getClass();
        eldVar.c = eld.b(eaoVar, eldVar.b, eldVar.d, eldVar.a);
        final ekl eklVarG = G();
        N(eklVarG, 11, new ecw() { // from class: ekz
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ekm ekmVar = (ekm) obj;
                ekmVar.ag();
                ekmVar.z(eklVarG, eanVar, eanVar2, i);
            }
        });
    }

    @Override // defpackage.eam
    public final void v(int i) {
        ekl eklVarG = G();
        N(eklVarG, 8, new eis(eklVarG, i, 9));
    }

    @Override // defpackage.eam
    public final void w(boolean z) {
        ekl eklVarG = G();
        N(eklVarG, 9, new eko(eklVarG, z, 3));
    }

    @Override // defpackage.eam
    public final void x(boolean z) {
        ekl eklVarK = K();
        N(eklVarK, 23, new eko(eklVarK, z, 0));
    }

    @Override // defpackage.eam
    public final void y(final int i, final int i2) {
        final ekl eklVarK = K();
        N(eklVarK, 24, new ecw() { // from class: elb
            @Override // defpackage.ecw
            public final void a(Object obj) {
                ((ekm) obj).E(eklVarK, i, i2);
            }
        });
    }

    @Override // defpackage.eam
    public final void z(eay eayVar, int i) {
        eao eaoVar = this.d;
        eaoVar.getClass();
        eld eldVar = this.b;
        eldVar.c = eld.b(eaoVar, eldVar.b, eldVar.d, eldVar.a);
        eldVar.c(eaoVar.N());
        ekl eklVarG = G();
        N(eklVarG, 0, new eis(eklVarG, i, 2));
    }

    @Override // defpackage.eam
    public final void F() {
    }

    @Override // defpackage.eam
    public final void u() {
    }

    @Override // defpackage.eam
    public final void E(eal ealVar) {
    }

    @Override // defpackage.eam
    public final void de(boolean z) {
    }
}

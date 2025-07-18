package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqf implements nsh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nqf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nsh
    public final void a() {
        if (this.b != 0) {
            return;
        }
        nqj nqjVar = (nqj) this.a;
        Iterator it = nqjVar.e.iterator();
        while (it.hasNext()) {
            ((npz) it.next()).m();
        }
        Iterator it2 = nqjVar.f.iterator();
        while (it2.hasNext()) {
            ((npj) it2.next()).m();
        }
    }

    @Override // defpackage.nsh
    public final void b() {
        if (this.b != 0) {
            pku pkuVar = ((nma) this.a).d;
            if (pkuVar != null) {
                ((mkr) pkuVar.a).G();
                return;
            }
            return;
        }
        nqj nqjVar = (nqj) this.a;
        Iterator it = nqjVar.e.iterator();
        while (it.hasNext()) {
            ((npz) it.next()).n();
        }
        Iterator it2 = nqjVar.f.iterator();
        while (it2.hasNext()) {
            ((npj) it2.next()).a();
        }
    }

    @Override // defpackage.nsh
    public final void c() {
        if (this.b != 0) {
            return;
        }
        nqj nqjVar = (nqj) this.a;
        Iterator it = nqjVar.e.iterator();
        while (it.hasNext()) {
            ((npz) it.next()).o();
        }
        Iterator it2 = nqjVar.f.iterator();
        while (it2.hasNext()) {
            ((npj) it2.next()).n();
        }
    }

    @Override // defpackage.nsh
    public final void d(int[] iArr) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).d(iArr);
        }
    }

    @Override // defpackage.nsh
    public final void e(int[] iArr, int i) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).e(iArr, i);
        }
    }

    @Override // defpackage.nsh
    public final void f(nll[] nllVarArr) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).f(nllVarArr);
        }
    }

    @Override // defpackage.nsh
    public final void g(int[] iArr) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).g(iArr);
        }
    }

    @Override // defpackage.nsh
    public final void h(List list, List list2, int i) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).h(list, list2, i);
        }
    }

    @Override // defpackage.nsh
    public final void i(int[] iArr) {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).i(iArr);
        }
    }

    @Override // defpackage.nsh
    public final void j() {
        if (this.b != 0) {
            return;
        }
        nqj nqjVar = (nqj) this.a;
        Iterator it = nqjVar.e.iterator();
        while (it.hasNext()) {
            ((npz) it.next()).p();
        }
        Iterator it2 = nqjVar.f.iterator();
        while (it2.hasNext()) {
            ((npj) it2.next()).o();
        }
    }

    @Override // defpackage.nsh
    public final void k() {
        if (this.b != 0) {
            return;
        }
        Iterator it = ((nqj) this.a).f.iterator();
        while (it.hasNext()) {
            ((npj) it.next()).j();
        }
    }

    @Override // defpackage.nsh
    public final void l() {
        if (this.b != 0) {
            pku pkuVar = ((nma) this.a).e;
            if (pkuVar != null) {
                Object obj = pkuVar.a;
                mkr mkrVar = (mkr) obj;
                mkrVar.G();
                if (mkrVar.n == 2) {
                    mkrVar.F(3);
                    ((mjw) obj).j();
                    nzx nzxVar = mkrVar.t;
                    if (nzxVar != null) {
                        nzxVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        nqj nqjVar = (nqj) this.a;
        for (nqi nqiVar : nqjVar.h.values()) {
            if (nqjVar.q() && !nqiVar.b) {
                nqiVar.a();
            } else if (!nqjVar.q() && nqiVar.b) {
                nqiVar.b();
            }
            if (nqiVar.b && (nqjVar.r() || nqjVar.t() || nqjVar.v() || nqjVar.u())) {
                nqjVar.o(nqiVar.a);
            }
        }
        Iterator it = nqjVar.e.iterator();
        while (it.hasNext()) {
            ((npz) it.next()).r();
        }
        Iterator it2 = nqjVar.f.iterator();
        while (it2.hasNext()) {
            ((npj) it2.next()).b();
        }
    }

    @Override // defpackage.nsh
    public final void m() {
        if (this.b != 0) {
            return;
        }
        for (npj npjVar : ((nqj) this.a).f) {
        }
    }
}

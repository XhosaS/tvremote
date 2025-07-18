package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
class eix extends pq implements eja {
    final /* synthetic */ eiz d;

    public eix(eiz eizVar) {
        this.d = eizVar;
        k(eizVar.K.a.h);
    }

    @Override // defpackage.pq
    public final int a() {
        return this.d.a.size();
    }

    @Override // defpackage.pq
    public final int b(int i) {
        eiz eizVar = this.d;
        ((efn) eizVar.a.get(i)).c().l();
        int i2 = eizVar.H.b;
        return 0;
    }

    @Override // defpackage.pq
    public final long c(int i) {
        return ((efn) this.d.K.a.a.get(i)).b;
    }

    @Override // defpackage.pq
    public final qv d(ViewGroup viewGroup, int i) {
        eiv eivVar = this.d.K;
        eiz eizVar = eivVar.a;
        ejn ejnVar = eizVar.H;
        int i2 = ejnVar.b;
        eey eeyVarA = ejnVar.a(i);
        if (i == 0) {
            dru druVar = eizVar.e;
            boolean z = ebc.a;
            return new eir(new dvz(druVar), true);
        }
        if (eeyVarA == null) {
            eiz eizVar2 = eivVar.a;
            eey eeyVarA2 = eizVar2.H.a(i);
            Context context = eizVar2.e.a;
            return new eir(eeyVarA2.a(), false);
        }
        Context context2 = eizVar.e.a;
        try {
            return new eir(eeyVarA.a(), false);
        } catch (IllegalArgumentException e) {
            Class<?> cls = eeyVarA.getClass();
            Class<?> enclosingClass = cls.getEnclosingClass();
            throw new IllegalArgumentException("createView() may not return null from :".concat(String.valueOf(enclosingClass == null ? cls.getCanonicalName() : enclosingClass.getCanonicalName())), e);
        }
    }

    @Override // defpackage.pq
    public final void f(qv qvVar, int i) {
        eiz eizVar = this.d;
        boolean z = dvv.b(null) && !eizVar.B.isEmpty();
        efn efnVar = (efn) eizVar.a.get(i);
        ejm ejmVarC = efnVar.c();
        ejmVarC.l();
        dvz dvzVar = (dvz) qvVar.a;
        dvzVar.t = null;
        int iS = eizVar.s(efnVar);
        int iR = eizVar.r(efnVar);
        if (!efnVar.p(iS, iR)) {
            boolean z2 = ebc.a;
            efnVar.g(eizVar.e, iS, iR, new dxt());
        }
        egy egyVar = eizVar.c;
        boolean z3 = eizVar.k;
        int i2 = egyVar.i();
        if (z3 && eizVar.p && efnVar.q()) {
            efnVar.f();
            if (efnVar.a() > eizVar.t()) {
                synchronized (this) {
                    eiz eizVar2 = this.d;
                    eizVar2.O(eizVar2.r.a);
                    eizVar2.N();
                }
            }
        }
        int size = View.MeasureSpec.getMode(iS) == 1073741824 ? View.MeasureSpec.getSize(iS) : i2 != 0 ? -1 : -2;
        int size2 = View.MeasureSpec.getMode(iR) == 1073741824 ? View.MeasureSpec.getSize(iR) : i2 != 0 ? -2 : -1;
        boolean z4 = qvVar instanceof eir;
        if (z4) {
            ejmVarC.g();
            dvzVar.setLayoutParams(new eiy(size, size2, iS, iR));
        }
        dvzVar.v(efnVar.b(), true);
        eiz eizVar3 = this.d;
        if (eizVar3.c.j().C) {
            efnVar.b().p(new Rect(0, 0, View.MeasureSpec.getSize(iS), View.MeasureSpec.getSize(iR)), false);
        }
        dvzVar.post(new eiw(dvzVar));
        efnVar.c().k();
        if (z) {
            dvzVar.u = new dvy(eizVar3.C, eizVar3.D, i == a(), 1 == i2);
        } else {
            dvzVar.u = null;
        }
        efnVar.b();
        if (z4) {
            eir eirVar = (eir) qvVar;
            int i3 = eir.u;
            if (!eirVar.s) {
                eex eexVarC = ejmVarC.c();
                eirVar.t = eexVarC;
                View view = eirVar.a;
                eexVarC.a();
            }
        }
        boolean z5 = ebc.a;
    }

    @Override // defpackage.pq
    public final void j(qv qvVar) {
        if (!(qvVar instanceof eir)) {
            throw null;
        }
        eir eirVar = (eir) qvVar;
        int i = eir.u;
        if (!eirVar.s) {
            eex eexVar = eirVar.t;
        } else if (eirVar.z() != null) {
            dvz dvzVarZ = eirVar.z();
            dvzVarZ.v((ComponentTree) null, true);
            dvzVarZ.t = null;
            dvzVarZ.u = null;
        }
    }

    @Override // defpackage.eja
    public final void m(int i, int i2) {
        this.d.H(i, i2);
    }

    @Override // defpackage.pq
    public final void i(qv qvVar) {
    }

    @Override // defpackage.pq
    public final void v(qv qvVar) {
    }
}

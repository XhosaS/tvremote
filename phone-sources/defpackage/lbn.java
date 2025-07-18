package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbn implements idf {
    public static final idf a = new lbn();

    private lbn() {
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        ieg iegVarF;
        lbl lblVar = (lbl) obj;
        lcv lcvVar = lblVar.k;
        if (lcvVar == null) {
            lcvVar = lcv.a;
        }
        lac lacVar = lblVar.p;
        if (lacVar == null) {
            lacVar = lac.a;
        }
        lbo lboVar = lblVar.c;
        if (lboVar == null) {
            lboVar = lbo.a;
        }
        kve kveVarT = kvf.T(lbk.c(lboVar));
        kveVarT.m(lblVar.d);
        kveVarT.D(lacVar.b);
        kveVarT.i(lacVar.c);
        kveVarT.r(lblVar.r);
        kveVarT.x(lblVar.q);
        kveVarT.v(lblVar.s);
        kveVarT.q(lblVar.t);
        kveVarT.u(lblVar.I);
        kveVarT.s(lblVar.J);
        kveVarT.w(lblVar.K);
        kveVarT.t(lblVar.u);
        kveVarT.o(lblVar.j);
        kveVarT.E(lblVar.o);
        kveVarT.K(lblVar.e);
        lcr lcrVar = lblVar.f;
        if (lcrVar == null) {
            lcrVar = lcr.a;
        }
        kveVarT.A(lbk.a(lcrVar));
        lcr lcrVar2 = lblVar.g;
        if (lcrVar2 == null) {
            lcrVar2 = lcr.a;
        }
        kveVarT.F(lbk.a(lcrVar2));
        kveVarT.j(lblVar.h);
        kveVarT.J(lblVar.n);
        kveVarT.H(lcvVar.b);
        kveVarT.I(lcvVar.c);
        kveVarT.l(lblVar.i);
        kveVarT.N(ImmutableList.copyOf((Collection) lbk.y(lblVar.l)));
        kveVarT.p(lcvVar.d);
        lcu lcuVarB = lcu.b(lcvVar.e);
        if (lcuVarB == null) {
            lcuVarB = lcu.UNRECOGNIZED;
        }
        kveVarT.L(lcuVarB);
        kveVarT.M(lcvVar.f);
        kveVarT.z(ieg.f(lbk.d(lblVar.m)));
        kveVarT.B(lblVar.v);
        kveVarT.k(ImmutableList.copyOf((Collection) lbk.z(lblVar.w)));
        kveVarT.P(ImmutableList.copyOf((Collection) lbk.z(lblVar.x)));
        kveVarT.b(ImmutableList.copyOf((Collection) lbk.z(lblVar.y)));
        kveVarT.C(ImmutableList.copyOf((Collection) lbk.z(lblVar.z)));
        vun vunVar = lblVar.A;
        ArrayList arrayList = new ArrayList(vunVar.size());
        Iterator<E> it = vunVar.iterator();
        while (it.hasNext()) {
            arrayList.add(ksy.j(((kzv) it.next()).b));
        }
        kveVarT.g(ImmutableList.copyOf((Collection) arrayList));
        kveVarT.f(ImmutableList.copyOf((Collection) lbk.x(lblVar.B)));
        lbm lbmVar = lblVar.C;
        if (lbmVar == null) {
            lbmVar = lbm.a;
        }
        int i = lbmVar.b;
        int iAO = a.aO(i);
        int i2 = 2;
        if (iAO != 0 && iAO == 2) {
            iegVarF = ieg.a;
        } else {
            int iAO2 = a.aO(i);
            if (iAO2 == 0) {
                iAO2 = 1;
            }
            switch (iAO2 - 2) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            iegVarF = ieg.f(new kvg(i2, lbmVar.c));
        }
        kveVarT.c(iegVarF);
        kveVarT.e((ImmutableList) kzs.a.b(lblVar.D));
        kveVarT.h((ImmutableList) kzz.a.b(lblVar.E));
        kveVarT.G(ksh.c(lblVar.F));
        kveVarT.y(lblVar.G);
        kveVarT.O(ieg.f((List) lcx.a.b(lblVar.H)));
        kveVarT.d(lbk.b(lblVar.L));
        return kveVarT.a();
    }
}

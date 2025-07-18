package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfy {
    private static final ghd a = ghd.d("k", "x", "y");

    public static hel a(hhf hhfVar, hbk hbkVar) {
        ArrayList arrayList = new ArrayList();
        if (hhfVar.p() == 1) {
            hhfVar.g();
            while (hhfVar.n()) {
                hhf hhfVar2 = hhfVar;
                hbk hbkVar2 = hbkVar;
                arrayList.add(new hdo(hbkVar2, hgn.a(hhfVar2, hbkVar2, hhr.a(), hgg.d, hhfVar.p() == 3, false)));
                hhfVar = hhfVar2;
                hbkVar = hbkVar2;
            }
            hhfVar.i();
            hgo.b(arrayList);
        } else {
            arrayList.add(new hhs(hgm.c(hhfVar, hhr.a())));
        }
        return new hel(arrayList);
    }

    static hes b(hhf hhfVar, hbk hbkVar) {
        hhfVar.h();
        boolean z = false;
        hel helVarA = null;
        hei heiVarL = null;
        hei heiVarL2 = null;
        while (hhfVar.p() != 4) {
            int iQ = hhfVar.q(a);
            if (iQ == 0) {
                helVarA = a(hhfVar, hbkVar);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    hhfVar.l();
                    hhfVar.m();
                } else if (hhfVar.p() == 6) {
                    hhfVar.m();
                    z = true;
                } else {
                    heiVarL2 = hjs.l(hhfVar, hbkVar);
                }
            } else if (hhfVar.p() == 6) {
                hhfVar.m();
                z = true;
            } else {
                heiVarL = hjs.l(hhfVar, hbkVar);
            }
        }
        hhfVar.j();
        if (z) {
            hbkVar.d("Lottie doesn't support expressions.");
        }
        return helVarA != null ? helVarA : new hep(heiVarL, heiVarL2);
    }
}

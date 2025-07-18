package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cuw {
    private static final cwk a = cwk.a("k", "x", "y");

    public static ctb a(cwm cwmVar, cph cphVar) {
        ArrayList arrayList = new ArrayList();
        if (cwmVar.q() == 1) {
            cwmVar.h();
            while (cwmVar.o()) {
                cwm cwmVar2 = cwmVar;
                cph cphVar2 = cphVar;
                arrayList.add(new csc(cphVar2, cvp.a(cwmVar2, cphVar2, cwy.a(), cvu.a, cwmVar.q() == 3, false)));
                cwmVar = cwmVar2;
                cphVar = cphVar2;
            }
            cwmVar.j();
            cvq.b(arrayList);
        } else {
            arrayList.add(new cwz(cvo.c(cwmVar, cwy.a())));
        }
        return new ctb(arrayList);
    }

    static ctj b(cwm cwmVar, cph cphVar) {
        cwmVar.i();
        boolean z = false;
        ctb ctbVarA = null;
        csy csyVarB = null;
        csy csyVarB2 = null;
        while (cwmVar.q() != 4) {
            int iC = cwmVar.c(a);
            if (iC == 0) {
                ctbVarA = a(cwmVar, cphVar);
            } else if (iC != 1) {
                if (iC != 2) {
                    cwmVar.m();
                    cwmVar.n();
                } else if (cwmVar.q() == 6) {
                    cwmVar.n();
                    z = true;
                } else {
                    csyVarB2 = cuz.b(cwmVar, cphVar, true);
                }
            } else if (cwmVar.q() == 6) {
                cwmVar.n();
                z = true;
            } else {
                csyVarB = cuz.b(cwmVar, cphVar, true);
            }
        }
        cwmVar.k();
        if (z) {
            cphVar.c("Lottie doesn't support expressions.");
        }
        return ctbVarA != null ? ctbVarA : new ctf(csyVarB, csyVarB2);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvq {
    static final cwk a = cwk.a("k");

    static List a(cwm cwmVar, cph cphVar, float f, cwh cwhVar, boolean z) {
        cwm cwmVar2;
        cph cphVar2;
        float f2;
        cwh cwhVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (cwmVar.q() == 6) {
            cphVar.c("Lottie doesn't support expressions.");
            return arrayList;
        }
        cwmVar.i();
        while (cwmVar.o()) {
            if (cwmVar.c(a) != 0) {
                cwmVar.n();
            } else if (cwmVar.q() == 1) {
                cwmVar.h();
                if (cwmVar.q() != 7) {
                    while (cwmVar.o()) {
                        cwm cwmVar3 = cwmVar;
                        arrayList.add(cvp.a(cwmVar3, cphVar, f, cwhVar, true, z));
                        cwmVar = cwmVar3;
                    }
                    cwmVar2 = cwmVar;
                    cphVar2 = cphVar;
                    f2 = f;
                    cwhVar2 = cwhVar;
                    z2 = z;
                } else {
                    cwmVar2 = cwmVar;
                    cphVar2 = cphVar;
                    f2 = f;
                    cwhVar2 = cwhVar;
                    z2 = z;
                    arrayList.add(cvp.b(cwmVar2, f2, cwhVar2));
                }
                cwmVar2.j();
                cwmVar = cwmVar2;
                cphVar = cphVar2;
                f = f2;
                cwhVar = cwhVar2;
                z = z2;
            } else {
                cwm cwmVar4 = cwmVar;
                arrayList.add(cvp.b(cwmVar4, f, cwhVar));
                cwmVar = cwmVar4;
            }
        }
        cwmVar.k();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            cwz cwzVar = (cwz) list.get(i2);
            i2++;
            cwz cwzVar2 = (cwz) list.get(i2);
            cwzVar.h = Float.valueOf(cwzVar2.g);
            if (cwzVar.c == null && (obj = cwzVar2.b) != null) {
                cwzVar.c = obj;
                if (cwzVar instanceof csc) {
                    ((csc) cwzVar).a();
                }
            }
        }
        cwz cwzVar3 = (cwz) list.get(i);
        if ((cwzVar3.b == null || cwzVar3.c == null) && list.size() > 1) {
            list.remove(cwzVar3);
        }
    }
}

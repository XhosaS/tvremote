package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgo {
    static final ghd a = ghd.d("k");

    public static List a(hhf hhfVar, hbk hbkVar, float f, hhc hhcVar, boolean z) {
        hhf hhfVar2;
        hbk hbkVar2;
        float f2;
        hhc hhcVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (hhfVar.p() == 6) {
            hbkVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        hhfVar.h();
        while (hhfVar.n()) {
            if (hhfVar.q(a) != 0) {
                hhfVar.m();
            } else if (hhfVar.p() == 1) {
                hhfVar.g();
                if (hhfVar.p() != 7) {
                    while (hhfVar.n()) {
                        hhf hhfVar3 = hhfVar;
                        hbk hbkVar3 = hbkVar;
                        float f3 = f;
                        hhc hhcVar3 = hhcVar;
                        boolean z3 = z;
                        arrayList.add(hgn.a(hhfVar3, hbkVar3, f3, hhcVar3, true, z3));
                        hhfVar = hhfVar3;
                        hbkVar = hbkVar3;
                        f = f3;
                        hhcVar = hhcVar3;
                        z = z3;
                    }
                    hhfVar2 = hhfVar;
                    hbkVar2 = hbkVar;
                    f2 = f;
                    hhcVar2 = hhcVar;
                    z2 = z;
                } else {
                    hhfVar2 = hhfVar;
                    hbkVar2 = hbkVar;
                    f2 = f;
                    hhcVar2 = hhcVar;
                    z2 = z;
                    arrayList.add(hgn.a(hhfVar2, hbkVar2, f2, hhcVar2, false, z2));
                }
                hhfVar2.i();
                hhfVar = hhfVar2;
                hbkVar = hbkVar2;
                f = f2;
                hhcVar = hhcVar2;
                z = z2;
            } else {
                hhf hhfVar4 = hhfVar;
                arrayList.add(hgn.a(hhfVar4, hbkVar, f, hhcVar, false, z));
                hhfVar = hhfVar4;
            }
        }
        hhfVar.j();
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
            hhs hhsVar = (hhs) list.get(i2);
            i2++;
            hhs hhsVar2 = (hhs) list.get(i2);
            hhsVar.h = Float.valueOf(hhsVar2.g);
            if (hhsVar.c == null && (obj = hhsVar2.b) != null) {
                hhsVar.c = obj;
                if (hhsVar instanceof hdo) {
                    ((hdo) hhsVar).a();
                }
            }
        }
        hhs hhsVar3 = (hhs) list.get(i);
        if ((hhsVar3.b == null || hhsVar3.c == null) && list.size() > 1) {
            list.remove(hhsVar3);
        }
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssc {
    public final ssd a;
    public final boolean b;
    public final double c;
    public final int d;
    public final wfj e;
    public final wfj f;
    public final wfj g;
    public final wfj h;
    public final wfj i;
    public final wfj j;

    public ssc(ssd ssdVar, boolean z, double d) {
        ArrayList arrayList;
        wfj wfjVarC = wfj.c(ssdVar.a, ssdVar.b);
        double d2 = ssdVar.a;
        double d3 = ssdVar.b;
        wfj wfjVarC2 = wfj.c(d2, Math.max((-32.0d) + d3, d3 * 0.5d));
        ssk sskVar = new ssk(ssdVar);
        int iRound = (int) Math.round(((ssd) sskVar.a).a);
        ssd ssdVar2 = (ssd) sskVar.b().get(iRound);
        double dA = sskVar.a(ssdVar2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ssdVar2);
        int i = 0;
        double dAbs = 0.0d;
        while (i < 360) {
            double dA2 = sskVar.a((ssd) sskVar.b().get(sik.g(iRound + i)));
            dAbs += Math.abs(dA2 - dA);
            i++;
            dA = dA2;
        }
        double d4 = dAbs / 6.0d;
        double dA3 = sskVar.a(ssdVar2);
        int i2 = 1;
        double dAbs2 = 0.0d;
        while (true) {
            if (arrayList2.size() >= 6) {
                arrayList = arrayList2;
                break;
            }
            ssd ssdVar3 = (ssd) sskVar.b().get(sik.g(iRound + i2));
            double dA4 = sskVar.a(ssdVar3);
            dAbs2 += Math.abs(dA4 - dA3);
            boolean z2 = dAbs2 >= ((double) arrayList2.size()) * d4;
            int i3 = 1;
            for (int i4 = 6; z2 && arrayList2.size() < i4; i4 = 6) {
                arrayList2.add(ssdVar3);
                ArrayList arrayList3 = arrayList2;
                z2 = dAbs2 >= ((double) (arrayList2.size() + i3)) * d4;
                i3++;
                arrayList2 = arrayList3;
            }
            arrayList = arrayList2;
            i2++;
            if (i2 > 360) {
                while (arrayList.size() < 6) {
                    arrayList.add(ssdVar3);
                }
            } else {
                arrayList2 = arrayList;
                dA3 = dA4;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(sskVar.a);
        int iFloor = (int) Math.floor(1.0d);
        for (int i5 = 1; i5 < iFloor + 1; i5++) {
            int size = -i5;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList4.add(0, (ssd) arrayList.get(size));
        }
        int i6 = 3 - iFloor;
        for (int i7 = 1; i7 < i6; i7++) {
            int size2 = i7;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList4.add((ssd) arrayList.get(size2));
        }
        ssd ssdVarA = sik.A((ssd) arrayList4.get(2));
        wfj wfjVar = new wfj(ssdVarA.a, ssdVarA.b, null);
        wfj wfjVarC3 = wfj.c(ssdVar.a, ssdVar.b / 8.0d);
        wfj wfjVarC4 = wfj.c(ssdVar.a, (ssdVar.b / 8.0d) + 4.0d);
        this.a = ssdVar;
        this.d = 7;
        this.b = z;
        this.c = d;
        this.e = wfjVarC;
        this.f = wfjVarC2;
        this.g = wfjVar;
        this.h = wfjVarC3;
        this.i = wfjVarC4;
        this.j = wfj.c(25.0d, 84.0d);
    }
}

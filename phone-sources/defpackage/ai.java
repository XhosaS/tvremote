package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ai {
    public final ArrayList a = new ArrayList();

    public final void a(aj ajVar) {
        float f;
        float f2;
        float f3;
        ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= ajVar.e) {
                break;
            }
            ak akVar = ((ak[]) ajVar.g.c)[i];
            for (int i2 = 0; i2 < 6; i2++) {
                akVar.e[i2] = 0.0f;
            }
            akVar.e[akVar.c] = 1.0f;
            if (akVar.h == 4) {
                arrayList.add(akVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ak akVar2 = (ak) arrayList.get(i3);
            int i4 = akVar2.b;
            if (i4 != -1) {
                ag agVar = ajVar.c[i4].d;
                int i5 = agVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    ak akVarD = agVar.d(i6);
                    if (akVarD == null) {
                        f3 = f;
                    } else {
                        float fB = agVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = akVarD.e;
                            fArr[i7] = fArr[i7] + (akVar2.e[i7] * fB);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(akVarD)) {
                            arrayList.add(akVarD);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    akVar2.e[i8] = f2;
                }
            } else {
                f2 = f;
            }
            i3++;
            f = f2;
        }
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        String strConcat = "Goal: ";
        for (int i = 0; i < size; i++) {
            ak akVar = (ak) arrayList.get(i);
            Objects.toString(akVar);
            String strConcat2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = akVar.e;
                if (i2 < 6) {
                    strConcat2 = (strConcat2 + fArr[i2]).concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            strConcat = strConcat.concat(strConcat2);
        }
        return strConcat;
    }
}

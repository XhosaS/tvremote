package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class j {
    public final ArrayList a = new ArrayList();

    public final void a(k kVar) {
        float f;
        float f2;
        float f3;
        ArrayList arrayList = this.a;
        arrayList.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= kVar.e) {
                break;
            }
            m mVar = kVar.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                mVar.e[i2] = 0.0f;
            }
            mVar.e[mVar.c] = 1.0f;
            if (mVar.h == 4) {
                arrayList.add(mVar);
            }
            i++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            m mVar2 = (m) arrayList.get(i3);
            int i4 = mVar2.b;
            if (i4 != -1) {
                g gVar = kVar.c[i4].d;
                int i5 = gVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    m mVarD = gVar.d(i6);
                    if (mVarD == null) {
                        f3 = f;
                    } else {
                        float fB = gVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = mVarD.e;
                            fArr[i7] = fArr[i7] + (mVar2.e[i7] * fB);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!arrayList.contains(mVarD)) {
                            arrayList.add(mVarD);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    mVar2.e[i8] = f2;
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
            m mVar = (m) arrayList.get(i);
            Objects.toString(mVar);
            String strConcat2 = mVar.toString().concat("[");
            int i2 = 0;
            while (true) {
                float[] fArr = mVar.e;
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

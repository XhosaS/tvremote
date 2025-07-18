package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hej extends het {
    public hej(List list) {
        for (int i = 0; i < list.size(); i++) {
            hhs hhsVar = (hhs) list.get(i);
            ghd ghdVar = (ghd) hhsVar.b;
            ghd ghdVar2 = (ghd) hhsVar.c;
            if (ghdVar != null && ghdVar2 != null) {
                Object obj = ghdVar.a;
                int length = ((float[]) obj).length;
                Object obj2 = ghdVar2.a;
                int length2 = ((float[]) obj2).length;
                if (length != length2) {
                    int i2 = length + length2;
                    float[] fArr = new float[i2];
                    System.arraycopy(obj, 0, fArr, 0, length);
                    System.arraycopy(obj2, 0, fArr, length, length2);
                    Arrays.sort(fArr);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        float f2 = fArr[i4];
                        if (f2 != f) {
                            fArr[i3] = f2;
                            i3++;
                            f = fArr[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i3);
                    hhsVar = new hhs(ghdVar.e(fArrCopyOfRange), ghdVar2.e(fArrCopyOfRange));
                }
            }
            list.set(i, hhsVar);
        }
        super(list);
    }

    @Override // defpackage.hes
    public final hdg a() {
        return new hdl(this.a);
    }
}

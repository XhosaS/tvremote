package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csz extends ctk {
    public csz(List list) {
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        for (int i = 0; i < list.size(); i++) {
            cwz cwzVar = (cwz) list.get(i);
            cto ctoVar = (cto) cwzVar.b;
            cto ctoVar2 = (cto) cwzVar.c;
            if (ctoVar != null && ctoVar2 != null && (length = (fArr = ctoVar.a).length) != (length2 = (fArr2 = ctoVar2.a).length)) {
                int i2 = length + length2;
                float[] fArr3 = new float[i2];
                System.arraycopy(fArr, 0, fArr3, 0, length);
                System.arraycopy(fArr2, 0, fArr3, length, length2);
                Arrays.sort(fArr3);
                float f = Float.NaN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    float f2 = fArr3[i4];
                    if (f2 != f) {
                        fArr3[i3] = f2;
                        i3++;
                        f = fArr3[i4];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                cwzVar = new cwz(ctoVar.a(fArrCopyOfRange), ctoVar2.a(fArrCopyOfRange));
            }
            list.set(i, cwzVar);
        }
        super(list);
    }

    @Override // defpackage.ctj
    public final crt a() {
        return new cry(this.a);
    }
}

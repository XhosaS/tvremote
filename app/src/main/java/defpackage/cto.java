package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cto {
    public final float[] a;
    public final int[] b;

    public cto(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final cto a(float[] fArr) {
        int iA;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            if (iBinarySearch >= 0) {
                iA = this.b[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iA = this.b[0];
                } else {
                    int[] iArr2 = this.b;
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        iA = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iA = cwp.a((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = iA;
        }
        return new cto(fArr, iArr);
    }
}

package com.google.android.libraries.tv.ui.assets.gradients;

import android.graphics.Bitmap;
import android.graphics.Color;
import defpackage.acr;
import defpackage.yqw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativeSmoothGradient {
    public static final NativeSmoothGradient a;

    static {
        System.loadLibrary("smoothgradientjni");
        a = new NativeSmoothGradient();
    }

    private NativeSmoothGradient() {
    }

    public static int[] a(int[] iArr, float[] fArr, int i) {
        float f;
        float f2;
        int[] iArr2 = new int[i];
        boolean z = false;
        iArr2[0] = iArr[0];
        int length = iArr.length;
        int i2 = i - 1;
        iArr2[i2] = iArr[length - 1];
        int length2 = fArr.length;
        yqw.L(length == length2);
        float f3 = 1.0f;
        yqw.L(length2 >= 2 && fArr[0] == 0.0f && fArr[length2 + (-1)] == 1.0f);
        int i3 = 1;
        int i4 = 1;
        while (i3 < i2) {
            while (true) {
                f = fArr[i4];
                f2 = i3 / i2;
                if (f2 > f) {
                    yqw.L(i4 < fArr.length + (-1) ? true : z);
                    i4++;
                }
            }
            int i5 = i4 - 1;
            float f4 = fArr[i5];
            float f5 = f2 - f4;
            float f6 = f - f4;
            int i6 = iArr[i5];
            int i7 = iArr[i4];
            int i8 = acr.a;
            float f7 = f3;
            float f8 = f5 / f6;
            float f9 = f7 - f8;
            iArr2[i3] = Color.argb((int) ((Color.alpha(i6) * f9) + (Color.alpha(i7) * f8)), (int) ((Color.red(i6) * f9) + (Color.red(i7) * f8)), (int) ((Color.green(i6) * f9) + (Color.green(i7) * f8)), (int) ((Color.blue(i6) * f9) + (Color.blue(i7) * f8)));
            i3++;
            f3 = f7;
            z = false;
        }
        return iArr2;
    }

    public native boolean linearGradient(Bitmap bitmap, int[] iArr, float f, float f2, float f3, float f4);

    public native boolean radialGradient(Bitmap bitmap, float f, float f2, float f3, int[] iArr, float f4);
}

package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhm {
    public static final bho a(Bitmap bitmap, List list, List list2) {
        List list3;
        int i;
        float f;
        int width = bitmap.getWidth() * bitmap.getHeight();
        double dSqrt = width > 12544 ? Math.sqrt(12544.0d / width) : -1.0d;
        int i2 = 0;
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dSqrt), (int) Math.ceil(bitmap.getHeight() * dSqrt), false);
        int width2 = bitmapCreateScaledBitmap.getWidth();
        int height = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width2 * height];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
        bhk bhkVar = new bhk(iArr, list2.isEmpty() ? null : (bhl[]) list2.toArray(new bhl[list2.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        bho bhoVar = new bho(bhkVar.c, list);
        List list4 = bhoVar.b;
        int size = list4.size();
        int i3 = 0;
        while (i3 < size) {
            bhp bhpVar = (bhp) list4.get(i3);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i4 = i2; i4 < 3; i4++) {
                float f4 = bhpVar.i[i4];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                for (int i5 = i2; i5 < 3; i5++) {
                    float[] fArr = bhpVar.i;
                    float f5 = fArr[i5];
                    if (f5 > 0.0f) {
                        fArr[i5] = f5 / f3;
                    }
                }
            }
            wx wxVar = bhoVar.c;
            List list5 = bhoVar.a;
            int size2 = list5.size();
            int i6 = i2;
            float f6 = 0.0f;
            bhn bhnVar = null;
            while (i6 < size2) {
                bhn bhnVar2 = (bhn) list5.get(i6);
                float[] fArrA = bhnVar2.a();
                float f7 = fArrA[1];
                float[] fArr2 = bhpVar.g;
                if (f7 < fArr2[i2] || f7 > fArr2[2]) {
                    list3 = list4;
                    i = i2;
                } else {
                    float f8 = fArrA[2];
                    i = i2;
                    float[] fArr3 = bhpVar.h;
                    if (f8 < fArr3[i] || f8 > fArr3[2]) {
                        list3 = list4;
                    } else {
                        f = f2;
                        if (bhoVar.d.get(bhnVar2.a)) {
                            list3 = list4;
                        } else {
                            float[] fArrA2 = bhnVar2.a();
                            bhn bhnVar3 = bhoVar.e;
                            int i7 = bhnVar3 != null ? bhnVar3.b : 1;
                            list3 = list4;
                            float[] fArr4 = bhpVar.i;
                            float f9 = fArr4[i];
                            float fAbs = f9 > f ? f9 * (1.0f - Math.abs(fArrA2[1] - fArr2[1])) : f;
                            float f10 = fArr4[1];
                            float fAbs2 = f10 > f ? f10 * (1.0f - Math.abs(fArrA2[2] - fArr3[1])) : f;
                            float f11 = fArr4[2];
                            float f12 = fAbs + fAbs2 + (f11 > f ? f11 * (bhnVar2.b / i7) : f);
                            if (bhnVar == null || f12 > f6) {
                                bhnVar = bhnVar2;
                                f6 = f12;
                            }
                        }
                        i6++;
                        f2 = f;
                        list4 = list3;
                        i2 = i;
                    }
                }
                f = f2;
                i6++;
                f2 = f;
                list4 = list3;
                i2 = i;
            }
            List list6 = list4;
            int i8 = i2;
            if (bhnVar != null) {
                boolean z = bhpVar.j;
                bhoVar.d.append(bhnVar.a, true);
            } else {
                bhnVar = null;
            }
            wxVar.put(bhpVar, bhnVar);
            i3++;
            list4 = list6;
            i2 = i8;
        }
        bhoVar.d.clear();
        return bhoVar;
    }
}

package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhk {
    private static final Comparator e = new bhi();
    final int[] a;
    final int[] b;
    final List c;
    final bhl[] d;
    private final float[] f = new float[3];

    public bhk(int[] iArr, bhl[] bhlVarArr) {
        bhj bhjVar;
        int iMin;
        this.d = bhlVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int iF = f(Color.blue(i2), 8, 5) | (f(Color.red(i2), 8, 5) << 10) | (f(Color.green(i2), 8, 5) << 5);
            iArr[i] = iF;
            iArr2[iF] = iArr2[iF] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0) {
                int iE = e(i4);
                float[] fArr = this.f;
                int i5 = acr.a;
                acr.g(Color.red(iE), Color.green(iE), Color.blue(iE), fArr);
                if (g(this.f)) {
                    iArr2[i4] = 0;
                }
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i3 <= 16) {
            this.c = new ArrayList();
            for (int i8 = 0; i8 < i3; i8++) {
                int i9 = iArr3[i8];
                this.c.add(new bhn(e(i9), iArr2[i9]));
            }
            return;
        }
        PriorityQueue<bhj> priorityQueue = new PriorityQueue(16, e);
        priorityQueue.offer(new bhj(this, 0, this.a.length - 1));
        while (priorityQueue.size() < 16 && (bhjVar = (bhj) priorityQueue.poll()) != null && bhjVar.c()) {
            if (!bhjVar.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i10 = bhjVar.e - bhjVar.d;
            int i11 = bhjVar.g - bhjVar.f;
            int i12 = bhjVar.i - bhjVar.h;
            int i13 = (i10 < i11 || i10 < i12) ? (i11 < i10 || i11 < i12) ? -1 : -2 : -3;
            bhk bhkVar = bhjVar.j;
            int[] iArr4 = bhkVar.a;
            int[] iArr5 = bhkVar.b;
            d(iArr4, i13, bhjVar.a, bhjVar.b);
            Arrays.sort(iArr4, bhjVar.a, bhjVar.b + 1);
            d(iArr4, i13, bhjVar.a, bhjVar.b);
            int i14 = bhjVar.c / 2;
            int i15 = bhjVar.a;
            int i16 = 0;
            while (true) {
                int i17 = bhjVar.b;
                if (i15 > i17) {
                    iMin = bhjVar.a;
                    break;
                }
                i16 += iArr5[iArr4[i15]];
                if (i16 >= i14) {
                    iMin = Math.min(i17 - 1, i15);
                    break;
                }
                i15++;
            }
            bhj bhjVar2 = new bhj(bhjVar.j, iMin + 1, bhjVar.b);
            bhjVar.b = iMin;
            bhjVar.b();
            priorityQueue.offer(bhjVar2);
            priorityQueue.offer(bhjVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (bhj bhjVar3 : priorityQueue) {
            bhk bhkVar2 = bhjVar3.j;
            int[] iArr6 = bhkVar2.a;
            int[] iArr7 = bhkVar2.b;
            int iC = 0;
            int i18 = 0;
            int iB = 0;
            int i19 = 0;
            for (int i20 = bhjVar3.a; i20 <= bhjVar3.b; i20++) {
                int i21 = iArr6[i20];
                int i22 = iArr7[i21];
                i18 += i22;
                iC += c(i21) * i22;
                iB += b(i21) * i22;
                i19 += i22 * (i21 & 31);
            }
            float f = i18;
            bhn bhnVar = new bhn(a(Math.round(iC / f), Math.round(iB / f), Math.round(i19 / f)), i18);
            if (!g(bhnVar.a())) {
                arrayList.add(bhnVar);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(f(i, 5, 8), f(i2, 5, 8), f(i3, 5, 8));
    }

    static int b(int i) {
        return (i >> 5) & 31;
    }

    static int c(int i) {
        return (i >> 10) & 31;
    }

    static void d(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (b(i4) << 10) | (c(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = c(i5) | ((i5 & 31) << 10) | (b(i5) << 5);
            i2++;
        }
    }

    private static int e(int i) {
        return a(c(i), b(i), i & 31);
    }

    private static int f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private final boolean g(float[] fArr) {
        bhl[] bhlVarArr = this.d;
        if (bhlVarArr != null && (bhlVarArr.length) > 0) {
            for (bhl bhlVar : bhlVarArr) {
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}

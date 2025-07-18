package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcj {
    private static final Comparator e = new bxy(8);
    final int[] a;
    final int[] b;
    public final List c;
    final gez[] d;
    private final float[] f = new float[3];

    public gcj(int[] iArr, int i, gez[] gezVarArr) {
        gci gciVar;
        int iMin;
        this.d = gezVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iG = g(Color.blue(i3), 8, 5) | (g(Color.red(i3), 8, 5) << 10) | (g(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iF = f(i5);
                float[] fArr = this.f;
                int i6 = csq.a;
                csq.h(Color.red(iF), Color.green(iF), Color.blue(iF), fArr);
                if (h(this.f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i4 <= i) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new gck(f(i10), iArr2[i10]));
            }
            return;
        }
        PriorityQueue<gci> priorityQueue = new PriorityQueue(i, e);
        priorityQueue.offer(new gci(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i && (gciVar = (gci) priorityQueue.poll()) != null && gciVar.c()) {
            if (!gciVar.c()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i11 = gciVar.e - gciVar.d;
            int i12 = gciVar.g - gciVar.f;
            int i13 = gciVar.i - gciVar.h;
            int i14 = (i11 < i12 || i11 < i13) ? (i12 < i11 || i12 < i13) ? -1 : -2 : -3;
            gcj gcjVar = gciVar.j;
            int[] iArr4 = gcjVar.a;
            int[] iArr5 = gcjVar.b;
            e(iArr4, i14, gciVar.a, gciVar.b);
            Arrays.sort(iArr4, gciVar.a, gciVar.b + 1);
            e(iArr4, i14, gciVar.a, gciVar.b);
            int i15 = gciVar.c / 2;
            int i16 = gciVar.a;
            int i17 = 0;
            while (true) {
                int i18 = gciVar.b;
                if (i16 > i18) {
                    iMin = gciVar.a;
                    break;
                }
                i17 += iArr5[iArr4[i16]];
                if (i17 >= i15) {
                    iMin = Math.min(i18 - 1, i16);
                    break;
                }
                i16++;
            }
            gci gciVar2 = new gci(gciVar.j, iMin + 1, gciVar.b);
            gciVar.b = iMin;
            gciVar.b();
            priorityQueue.offer(gciVar2);
            priorityQueue.offer(gciVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (gci gciVar3 : priorityQueue) {
            gcj gcjVar2 = gciVar3.j;
            int[] iArr6 = gcjVar2.a;
            int[] iArr7 = gcjVar2.b;
            int iD = 0;
            int i19 = 0;
            int iC = 0;
            int iB = 0;
            for (int i20 = gciVar3.a; i20 <= gciVar3.b; i20++) {
                int i21 = iArr6[i20];
                int i22 = iArr7[i21];
                i19 += i22;
                iD += d(i21) * i22;
                iC += c(i21) * i22;
                iB += i22 * b(i21);
            }
            float f = i19;
            gck gckVar = new gck(a(Math.round(iD / f), Math.round(iC / f), Math.round(iB / f)), i19);
            if (!h(gckVar.a())) {
                arrayList.add(gckVar);
            }
        }
        this.c = arrayList;
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(g(i, 5, 8), g(i2, 5, 8), g(i3, 5, 8));
    }

    static int b(int i) {
        return i & 31;
    }

    static int c(int i) {
        return (i >> 5) & 31;
    }

    static int d(int i) {
        return (i >> 10) & 31;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = b(i4) | (c(i4) << 10) | (d(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = d(i5) | (b(i5) << 10) | (c(i5) << 5);
            i2++;
        }
    }

    private static int f(int i) {
        return a(d(i), c(i), b(i));
    }

    private static int g(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private final boolean h(float[] fArr) {
        gez[] gezVarArr = this.d;
        if (gezVarArr != null && (gezVarArr.length) > 0) {
            for (gez gezVar : gezVarArr) {
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

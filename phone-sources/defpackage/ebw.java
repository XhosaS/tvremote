package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebw {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public short[] f;
    public int g;
    public short[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public double r;
    private final int s;
    private final int t;
    private final int u;
    private final short[] v;
    private short[] w;

    public ebw(int i, int i2, float f, float f2, int i3) {
        this.s = i;
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = i / i3;
        this.t = i / 400;
        int i4 = i / 65;
        this.u = i4;
        int i5 = i4 + i4;
        this.e = i5;
        this.v = new short[i5];
        int i6 = i5 * i2;
        this.f = new short[i6];
        this.h = new short[i6];
        this.w = new short[i6];
    }

    private final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.a * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.p = i4 / i6;
        this.q = i7 / i5;
        return i6;
    }

    private final void e(short[] sArr, int i, int i2) {
        short[] sArrC = c(this.h, this.i, i2);
        this.h = sArrC;
        int i3 = this.i;
        int i4 = this.a;
        System.arraycopy(sArr, i * i4, sArrC, i3 * i4, i2 * i4);
        this.i += i2;
    }

    private final void f(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.e / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.a;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.v[i4] = (short) (i6 / i3);
        }
    }

    private static void g(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int a() {
        a.ab(this.i >= 0);
        int i = this.i * this.a;
        return i + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0293 A[LOOP:4: B:12:0x0036->B:105:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0192 A[EDGE_INSN: B:115:0x0192->B:68:0x0192 BREAK  A[LOOP:4: B:12:0x0036->B:105:0x0293], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebw.b():void");
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.a;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}

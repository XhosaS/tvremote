package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xk {
    public static final xe a = new xc(3);
    public static final xe b = new xc(2);
    public static final xj c = new xi(0);
    public static final xj d = new xi(1);
    public static final xf e = new xg(1);
    public static final xf f = new xg(0);

    public static final void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = (i - i4) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i7 = iArr[length];
            iArr2[length] = Math.round(f2);
            f2 += i7;
        }
    }

    public static final void b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i3] = i2;
                i2 += i4;
                i++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public static final void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        int i5 = i - i4;
        if (!z) {
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i8 = iArr[length];
            iArr2[length] = i5;
            i5 += i8;
        }
    }

    public static final void d(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(yfm.aK(iArr), 1);
        float f2 = 0.0f;
        if (z && iArr.length == 1) {
            f2 = fMax;
        }
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + fMax;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i7 + fMax;
        }
    }

    public static final xf e(float f2) {
        return new xh(f2, true, new xb(0));
    }

    public static final xe f(float f2, bkc bkcVar) {
        return new xh(f2, true, new xa(bkcVar, 0));
    }
}

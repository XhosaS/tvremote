package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfz {
    public int a;
    public Object b;

    public nfz() {
    }

    private final void k(int i, int i2) {
        int[] iArr = (int[]) this.b;
        cbp.U(iArr, i, i2);
        cbp.U(iArr, i + 1, i2 + 1);
        cbp.U(iArr, i + 2, i2 + 2);
    }

    private final int[] l(int[] iArr) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length);
        iArrCopyOf.getClass();
        this.b = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.b = null;
        this.a = 0;
    }

    public final myd b() {
        int i;
        Object obj = this.b;
        if (obj != null && (i = this.a) != 0) {
            return new myd((mwk) obj, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" accessibleText");
        }
        if (this.a == 0) {
            sb.append(" purchaseOption");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int c(int i) {
        return ((int[]) this.b)[i];
    }

    public final int d() {
        Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void e(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        Object objL = this.b;
        int[] iArr = (int[]) objL;
        if (i5 >= iArr.length) {
            objL = l(iArr);
        }
        int[] iArr2 = (int[]) objL;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        Object objL = this.b;
        int[] iArr = (int[]) objL;
        if (i6 >= iArr.length) {
            objL = l(iArr);
        }
        int[] iArr2 = (int[]) objL;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    k(i3, i4);
                }
            }
            k(i3 + 3, i2);
            g(i, i3);
            g(i3 + 6, i2);
        }
    }

    public final boolean h(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void i(long j) {
        if (h(j)) {
            return;
        }
        int i = this.a;
        Object objCopyOf = this.b;
        long[] jArr = (long[]) objCopyOf;
        int length = jArr.length;
        if (i >= length) {
            objCopyOf = Arrays.copyOf(jArr, Math.max(i + 1, length + length));
            objCopyOf.getClass();
            this.b = objCopyOf;
        }
        ((long[]) objCopyOf)[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public final void j(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    long[] jArr = (long[]) this.b;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public nfz(char[] cArr) {
        this.b = new long[2];
    }

    public nfz(int i) {
        this.b = new int[i];
    }
}

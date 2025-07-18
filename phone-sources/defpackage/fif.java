package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fif {
    public final fic a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public fif(fic ficVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        a.H(length == length2);
        int length3 = jArr.length;
        a.H(length3 == length2);
        int length4 = iArr2.length;
        a.H(length4 == length2);
        this.a = ficVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int iAz = edt.az(this.f, j, false); iAz >= 0; iAz--) {
            if ((this.g[iAz] & 1) != 0) {
                return iAz;
            }
        }
        return -1;
    }

    public final int b(long j) {
        long[] jArr = this.f;
        for (int iAx = edt.ax(jArr, j, true); iAx < jArr.length; iAx++) {
            if ((this.g[iAx] & 1) != 0) {
                return iAx;
            }
        }
        return -1;
    }
}

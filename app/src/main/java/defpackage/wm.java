package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wm {
    public long[] a = ww.a;
    public int[] b = wn.a;
    public int c;
    public int d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final boolean equals(Object obj) {
        boolean z;
        int[] iArr;
        ?? r18;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        boolean z3 = false;
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        int i = wmVar.d;
        int[] iArr2 = this.b;
        long[] jArr = this.a;
        int length = jArr.length;
        long j = jArr[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
            int i2 = 0;
            while (i2 < 7) {
                if ((255 & j) < 128) {
                    int i3 = iArr2[i2];
                    int i4 = (-862048943) * i3;
                    int i5 = wmVar.c;
                    while (true) {
                        long[] jArr2 = wmVar.a;
                        z = z2;
                        iArr = iArr2;
                        long j2 = jArr2[z3 ? 1 : 0];
                        long j3 = jArr2[z ? 1 : 0];
                        long j4 = ((((i4 << 16) ^ i4) & 127) * 72340172838076673L) ^ j2;
                        long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L);
                        while (j5 != 0) {
                            Long.numberOfTrailingZeros(j5);
                            r18 = z3;
                            if (wmVar.b[r18] == i3) {
                                break;
                            }
                            j5 &= j5 - 1;
                            z3 = r18;
                        }
                        boolean z4 = z3;
                        if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                            return z4;
                        }
                        iArr2 = iArr;
                        z2 = z ? 1 : 0;
                        z3 = z4;
                    }
                } else {
                    z = z2;
                    iArr = iArr2;
                    r18 = z3 ? 1 : 0;
                }
                j >>= 8;
                i2++;
                iArr2 = iArr;
                z2 = z;
                z3 = r18;
            }
        }
        return z2;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length;
        long j = jArr[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
            return 0;
        }
        long j2 = j;
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            if ((255 & j2) < 128) {
                i += iArr[i2];
            }
            j2 >>= 8;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length;
        long j = jArr[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
            long j2 = j;
            int i = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                if ((255 & j2) < 128) {
                    int i3 = iArr[i2];
                    if (i == -1) {
                        sb.append((CharSequence) "...");
                        break;
                    }
                    if (i != 0) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append(i3);
                    i++;
                }
                j2 >>= 8;
            }
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wp {
    public long[] a = ww.a;
    public long[] b = wq.a;
    public int c;
    public int d;

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        long j;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        boolean z4 = false;
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        int i = wpVar.d;
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length;
        long j2 = jArr2[0];
        long j3 = -9187201950435737472L;
        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
            int i2 = 0;
            for (int i3 = 7; i2 < i3; i3 = 7) {
                if ((255 & j2) < 128) {
                    long j4 = jArr[i2];
                    long j5 = (j4 >>> 32) ^ j4;
                    int i4 = wpVar.c;
                    while (true) {
                        z = z3;
                        long[] jArr3 = wpVar.a;
                        z2 = z4;
                        long j6 = jArr3[z2 ? 1 : 0];
                        long j7 = jArr3[z ? 1 : 0];
                        int i5 = ((int) j5) * (-862048943);
                        j = j3;
                        long j8 = ((((i5 << 16) ^ i5) & 127) * 72340172838076673L) ^ j6;
                        for (long j9 = (j8 - 72340172838076673L) & (~j8) & j; j9 != 0; j9 &= j9 - 1) {
                            Long.numberOfTrailingZeros(j9);
                            if (wpVar.b[z2 ? 1 : 0] == j4) {
                                break;
                            }
                        }
                        if ((j6 & ((~j6) << 6) & j) != 0) {
                            return z2;
                        }
                        z3 = z ? 1 : 0;
                        z4 = z2 ? 1 : 0;
                        j3 = j;
                    }
                } else {
                    z = z3;
                    z2 = z4;
                    j = j3;
                }
                j2 >>= 8;
                i2++;
                z3 = z;
                z4 = z2;
                j3 = j;
            }
        }
        return z3;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length;
        long j = jArr2[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
            return 0;
        }
        long j2 = j;
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            if ((255 & j2) < 128) {
                long j3 = jArr[i2];
                i += (int) (j3 ^ (j3 >>> 32));
            }
            j2 >>= 8;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length;
        long j = jArr2[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
            long j2 = j;
            int i = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                if ((255 & j2) < 128) {
                    long j3 = jArr[i2];
                    if (i == -1) {
                        sb.append((CharSequence) "...");
                        break;
                    }
                    if (i != 0) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append(j3);
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

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wv {
    public long[] a = ww.a;
    public Object[] b;
    public Object[] c;
    public int d;

    public wv() {
        Object[] objArr = xa.c;
        this.b = objArr;
        this.c = objArr;
    }

    public final Object a(Object obj) {
        long j;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        do {
            int i = (-862048943) * iHashCode;
            long[] jArr = this.a;
            j = jArr[0];
            long j2 = jArr[1];
            long j3 = (((i ^ (i << 16)) & 127) * 72340172838076673L) ^ j;
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                Long.numberOfTrailingZeros(j4);
                if (agvy.c(this.b[0], obj)) {
                    return this.c[0];
                }
            }
        } while ((((~j) << 6) & j & (-9187201950435737472L)) == 0);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v8 */
    public final boolean equals(Object obj) {
        boolean z;
        Object[] objArr;
        ?? r19;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        Object[] objArr2 = this.b;
        Object[] objArr3 = this.c;
        long[] jArr = this.a;
        int length = jArr.length;
        long j = jArr[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
            int i2 = 0;
            while (i2 < 7) {
                if ((255 & j) < 128) {
                    Object obj2 = objArr2[i2];
                    Object obj3 = objArr3[i2];
                    if (obj3 != null) {
                        z = z2;
                        objArr = objArr2;
                        r19 = i;
                        if (!agvy.c(obj3, wvVar.a(obj2))) {
                            return r19;
                        }
                    } else {
                        if (wvVar.a(obj2) != null) {
                            return i;
                        }
                        int iHashCode = obj2 != null ? obj2.hashCode() : i;
                        int i3 = wvVar.d;
                        while (true) {
                            int i4 = (-862048943) * iHashCode;
                            long[] jArr2 = wvVar.a;
                            z = z2;
                            objArr = objArr2;
                            long j2 = jArr2[i];
                            long j3 = jArr2[z ? 1 : 0];
                            long j4 = (((i4 ^ (i4 << 16)) & 127) * 72340172838076673L) ^ j2;
                            long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L);
                            while (j5 != 0) {
                                Long.numberOfTrailingZeros(j5);
                                r19 = i;
                                if (agvy.c(wvVar.b[r19 == true ? 1 : 0], obj2)) {
                                    break;
                                }
                                j5 &= j5 - 1;
                                i = r19 == true ? 1 : 0;
                            }
                            ?? r192 = i;
                            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                                return r192;
                            }
                            objArr2 = objArr;
                            z2 = z ? 1 : 0;
                            i = r192 == true ? 1 : 0;
                        }
                    }
                } else {
                    z = z2;
                    objArr = objArr2;
                    r19 = i;
                }
                j >>= 8;
                i2++;
                objArr2 = objArr;
                z2 = z;
                i = r19;
            }
        }
        return z2;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length;
        long j = jArr[0];
        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
            return 0;
        }
        int iHashCode = 0;
        for (int i = 0; i < 7; i++) {
            if ((255 & j) < 128) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                iHashCode += (obj != null ? obj.hashCode() : 0) ^ (obj2 != null ? obj2.hashCode() : 0);
            }
            j >>= 8;
        }
        return iHashCode;
    }

    public final String toString() {
        return "{}";
    }
}

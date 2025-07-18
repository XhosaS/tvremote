package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxi {
    public int[] a;

    public zxi(byte[] bArr) {
        int length = bArr.length;
        if (length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iBm = vxr.bm(bArr, 0);
        int iA = zxg.a(iBm - 1);
        if (length != (iBm * iA) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[iBm];
        for (int i = 0; i < iBm; i++) {
            int[] iArr = this.a;
            int i2 = (i * iA) + 4;
            int i3 = 0;
            for (int i4 = iA - 1; i4 >= 0; i4--) {
                i3 |= (bArr[i2 + i4] & 255) << (i4 * 8);
            }
            iArr[i] = i3;
        }
        int[] iArr2 = this.a;
        int length2 = iArr2.length;
        boolean[] zArr = new boolean[length2];
        for (int i5 : iArr2) {
            if (i5 < 0 || i5 >= length2 || zArr[i5]) {
                throw new IllegalArgumentException("invalid encoding");
            }
            zArr[i5] = true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zxi) {
            return vxr.bo(this.a, ((zxi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return vxr.bb(this.a);
    }

    public final String toString() {
        String str = "[" + this.a[0];
        int i = 1;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return str.concat("]");
            }
            str = str + ", " + iArr[i];
            i++;
        }
    }
}

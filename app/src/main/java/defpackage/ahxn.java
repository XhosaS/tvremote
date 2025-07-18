package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxn extends ahxb {
    public final transient byte[][] f;
    public final transient int[] g;

    public ahxn(byte[][] bArr, int[] iArr) {
        super(ahxb.b.c);
        this.f = bArr;
        this.g = iArr;
    }

    private final ahxb l() {
        return new ahxb(i());
    }

    private final Object writeReplace() {
        return l();
    }

    @Override // defpackage.ahxb
    public final byte a(int i) {
        byte[][] bArr = this.f;
        int length = bArr.length;
        int[] iArr = this.g;
        ahwt.a(iArr[length - 1], i, 1L);
        int iA = ahxw.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[length + iA]];
    }

    @Override // defpackage.ahxb
    public final int b() {
        return this.g[this.f.length - 1];
    }

    @Override // defpackage.ahxb
    public final String c() {
        return l().c();
    }

    @Override // defpackage.ahxb
    public final ahxb e() {
        return l().e();
    }

    @Override // defpackage.ahxb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahxb) {
            ahxb ahxbVar = (ahxb) obj;
            return ahxbVar.b() == b() && j(ahxbVar, b());
        }
        return false;
    }

    @Override // defpackage.ahxb
    public final boolean f(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iA = ahxw.a(this, i);
        while (i < i5) {
            if (iA == 0) {
                iA = 0;
                i4 = 0;
            } else {
                i4 = this.g[iA - 1];
            }
            int[] iArr = this.g;
            int i6 = iArr[iA] - i4;
            byte[][] bArr2 = this.f;
            int i7 = iArr[bArr2.length + iA];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!ahwt.b(bArr2[iA], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.ahxb
    public final byte[] h() {
        return i();
    }

    @Override // defpackage.ahxb
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.d = i3;
                return i3;
            }
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.ahxb
    public final byte[] i() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.f;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.g;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr3 = bArr2[i];
            int i6 = i5 - i2;
            bArr3.getClass();
            System.arraycopy(bArr3, i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.ahxb
    public final boolean j(ahxb ahxbVar, int i) {
        int i2;
        ahxbVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int iA = ahxw.a(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iA == 0) {
                iA = 0;
                i2 = 0;
            } else {
                i2 = this.g[iA - 1];
            }
            int[] iArr = this.g;
            int i5 = iArr[iA] - i2;
            byte[][] bArr = this.f;
            int i6 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i5 + i2) - i3;
            if (!ahxbVar.f(i4, bArr[iA], i6 + (i3 - i2), iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iA++;
        }
        return true;
    }

    @Override // defpackage.ahxb
    public final void k(ahwx ahwxVar, int i) {
        int i2;
        int iA = ahxw.a(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (iA == 0) {
                iA = 0;
                i2 = 0;
            } else {
                i2 = this.g[iA - 1];
            }
            int[] iArr = this.g;
            int i4 = iArr[iA] - i2;
            byte[][] bArr = this.f;
            int i5 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            ahxl ahxlVar = new ahxl(bArr[iA], i6, i6 + iMin, true);
            ahxl ahxlVar2 = ahwxVar.a;
            if (ahxlVar2 == null) {
                ahxlVar.g = ahxlVar;
                ahxlVar.f = ahxlVar.g;
                ahwxVar.a = ahxlVar.f;
            } else {
                ahxl ahxlVar3 = ahxlVar2.g;
                ahxlVar3.getClass();
                ahxlVar3.d(ahxlVar);
            }
            i3 += iMin;
            iA++;
        }
        ahwxVar.b += i;
    }

    @Override // defpackage.ahxb
    public final String toString() {
        return l().toString();
    }
}

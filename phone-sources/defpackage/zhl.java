package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhl extends zgn {
    public final transient byte[][] e;
    public final transient int[] f;

    public zhl(byte[][] bArr, int[] iArr) {
        super(zgn.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final zgn w() {
        return new zgn(o());
    }

    private final Object writeReplace() {
        return w();
    }

    @Override // defpackage.zgn
    public final byte a(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length;
        int[] iArr = this.f;
        wcq.aG(iArr[length - 1], i, 1L);
        int iAw = wcq.aw(this, i);
        return bArr[iAw][(i - (iAw == 0 ? 0 : iArr[iAw - 1])) + iArr[length + iAw]];
    }

    @Override // defpackage.zgn
    public final int c() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.zgn
    public final int e(byte[] bArr, int i) {
        bArr.getClass();
        return w().e(bArr, i);
    }

    @Override // defpackage.zgn
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zgn) {
            zgn zgnVar = (zgn) obj;
            return zgnVar.c() == c() && r(0, zgnVar, c());
        }
        return false;
    }

    @Override // defpackage.zgn
    public final String g() {
        return w().g();
    }

    @Override // defpackage.zgn
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.f;
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

    @Override // defpackage.zgn
    public final zgn j(int i, int i2) {
        int iAE = wcq.aE(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(a.cd(i, "beginIndex=", " < 0"));
        }
        if (iAE > c()) {
            throw new IllegalArgumentException("endIndex=" + iAE + " > length(" + c() + ")");
        }
        int i3 = iAE - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(a.ce(i, iAE, "endIndex=", " < beginIndex="));
        }
        if (i == 0 && iAE == c()) {
            return this;
        }
        if (i == iAE) {
            return zgn.a;
        }
        int iAw = wcq.aw(this, i);
        int iAw2 = wcq.aw(this, iAE - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) yfm.aH(bArr, iAw, iAw2 + 1);
        int length = bArr2.length;
        int[] iArr = new int[length + length];
        if (iAw <= iAw2) {
            int i4 = iAw;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f;
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iAw2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iAw != 0 ? this.f[iAw - 1] : 0;
        int length2 = bArr2.length;
        iArr[length2] = iArr[length2] + (i - i7);
        return new zhl(bArr2, iArr);
    }

    @Override // defpackage.zgn
    public final zgn k() {
        return w().k();
    }

    @Override // defpackage.zgn
    public final boolean l(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iAw = wcq.aw(this, i);
        while (i < i5) {
            if (iAw == 0) {
                iAw = 0;
                i4 = 0;
            } else {
                i4 = this.f[iAw - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iAw] - i4;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iAw];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!wcq.aH(bArr2[iAw], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iAw++;
        }
        return true;
    }

    @Override // defpackage.zgn
    public final byte[] n() {
        return o();
    }

    @Override // defpackage.zgn
    public final byte[] o() {
        byte[] bArr = new byte[c()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            yfm.be(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.zgn
    public final boolean r(int i, zgn zgnVar, int i2) {
        int i3;
        zgnVar.getClass();
        if (i < 0 || i > c() - i2) {
            return false;
        }
        int i4 = i2 + i;
        int iAw = wcq.aw(this, i);
        int i5 = 0;
        while (i < i4) {
            if (iAw == 0) {
                iAw = 0;
                i3 = 0;
            } else {
                i3 = this.f[iAw - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iAw] - i3;
            byte[][] bArr = this.e;
            int i7 = iArr[bArr.length + iAw];
            int iMin = Math.min(i4, i6 + i3) - i;
            if (!zgnVar.l(i5, bArr[iAw], i7 + (i - i3), iMin)) {
                return false;
            }
            i5 += iMin;
            i += iMin;
            iAw++;
        }
        return true;
    }

    @Override // defpackage.zgn
    public final void t(zgk zgkVar, int i) {
        int i2;
        int iAw = wcq.aw(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (iAw == 0) {
                iAw = 0;
                i2 = 0;
            } else {
                i2 = this.f[iAw - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[iAw] - i2;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iAw];
            int iMin = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            zhj zhjVar = new zhj(bArr[iAw], i6, i6 + iMin, true);
            zhj zhjVar2 = zgkVar.a;
            if (zhjVar2 == null) {
                zhjVar.g = zhjVar;
                zhjVar.f = zhjVar.g;
                zgkVar.a = zhjVar.f;
            } else {
                zhj zhjVar3 = zhjVar2.g;
                zhjVar3.getClass();
                zhjVar3.d(zhjVar);
            }
            i3 += iMin;
            iAw++;
        }
        zgkVar.b += i;
    }

    @Override // defpackage.zgn
    public final String toString() {
        return w().toString();
    }

    @Override // defpackage.zgn
    public final int v(byte[] bArr) {
        bArr.getClass();
        return w().v(bArr);
    }
}

package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgk implements Cloneable, ByteChannel, zgm, zgl {
    public zhj a;
    public long b;

    @Override // defpackage.zgm
    public final void A(long j) {
        throw null;
    }

    @Override // defpackage.zgm
    public final void B(long j) {
        while (j > 0) {
            zhj zhjVar = this.a;
            if (zhjVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, zhjVar.c - zhjVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = zhjVar.b + iMin;
            zhjVar.b = i;
            if (i == zhjVar.c) {
                this.a = zhjVar.a();
                zhk.b(zhjVar);
            }
        }
    }

    @Override // defpackage.zgm
    public final boolean C() {
        return this.b == 0;
    }

    @Override // defpackage.zgm
    public final boolean D(long j) {
        throw null;
    }

    public final byte[] E() {
        return F(this.b);
    }

    @Override // defpackage.zgm
    public final byte[] F(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.cs(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iE = e(bArr, i2, i - i2);
            if (iE == -1) {
                throw new EOFException();
            }
            i2 += iE;
        }
        return bArr;
    }

    public final void G(zgk zgkVar, long j, long j2) {
        long j3 = j;
        wcq.aG(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        zgkVar.b += j2;
        zhj zhjVar = this.a;
        while (true) {
            zhjVar.getClass();
            long j4 = zhjVar.c - zhjVar.b;
            if (j3 < j4) {
                break;
            }
            zhjVar = zhjVar.f;
            j3 -= j4;
        }
        zhj zhjVar2 = zhjVar;
        long j5 = j2;
        while (j5 > 0) {
            zhjVar2.getClass();
            zhj zhjVarB = zhjVar2.b();
            int i = zhjVarB.b + ((int) j3);
            zhjVarB.b = i;
            zhjVarB.c = Math.min(i + ((int) j5), zhjVarB.c);
            zhj zhjVar3 = zgkVar.a;
            if (zhjVar3 == null) {
                zhjVarB.g = zhjVarB;
                zhjVarB.f = zhjVarB.g;
                zgkVar.a = zhjVarB.f;
            } else {
                zhj zhjVar4 = zhjVar3.g;
                zhjVar4.getClass();
                zhjVar4.d(zhjVarB);
            }
            j5 -= zhjVarB.c - zhjVarB.b;
            zhjVar2 = zhjVar2.f;
            j3 = 0;
        }
    }

    public final boolean H(zgn zgnVar) {
        zgnVar.getClass();
        int iC = zgnVar.c();
        if (this.b < iC || zgnVar.c() < iC) {
            return false;
        }
        for (int i = 0; i < iC; i++) {
            if (c(i) != zgnVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zgm
    public final void I(zhm zhmVar) {
        long j = this.b;
        if (j > 0) {
            zhmVar.eW(this, j);
        }
    }

    public final void J(zgn zgnVar) {
        zgnVar.getClass();
        zgnVar.t(this, zgnVar.c());
    }

    public final void K(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        wcq.aG(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            zhj zhjVarW = w(1);
            int i5 = 8192 - zhjVarW.c;
            byte[] bArr2 = zhjVarW.a;
            int iMin = Math.min(i4 - i3, i5);
            int i6 = i3 + iMin;
            yfm.be(bArr, bArr2, zhjVarW.c, i3, i6);
            zhjVarW.c += iMin;
            i3 = i6;
        }
    }

    public final void L(zho zhoVar) {
        while (zhoVar.a(this, 8192L) != -1) {
        }
    }

    public final void M(int i) {
        zhj zhjVarW = w(1);
        byte[] bArr = zhjVarW.a;
        int i2 = zhjVarW.c;
        zhjVarW.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void N(int i) {
        zhj zhjVarW = w(4);
        byte[] bArr = zhjVarW.a;
        int i2 = zhjVarW.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zhjVarW.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.zgl
    public final /* bridge */ /* synthetic */ void O(int i) {
        throw null;
    }

    @Override // defpackage.zgl
    public final /* bridge */ /* synthetic */ void P(int i) {
        throw null;
    }

    public final void Q(OutputStream outputStream, long j) throws IOException {
        outputStream.getClass();
        wcq.aG(this.b, 0L, j);
        zhj zhjVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            zhjVar.getClass();
            int iMin = (int) Math.min(j2, zhjVar.c - zhjVar.b);
            outputStream.write(zhjVar.a, zhjVar.b, iMin);
            int i = zhjVar.b + iMin;
            zhjVar.b = i;
            long j3 = iMin;
            this.b -= j3;
            j2 -= j3;
            if (i == zhjVar.c) {
                zhj zhjVarA = zhjVar.a();
                this.a = zhjVarA;
                zhk.b(zhjVar);
                zhjVar = zhjVarA;
            }
        }
    }

    public final void R(String str, int i, int i2) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.cf(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.ce(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                zhj zhjVarW = w(1);
                byte[] bArr = zhjVarW.a;
                int i4 = zhjVarW.c - i;
                int iMin = Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = zhjVarW.c;
                int i6 = (i4 + i) - i5;
                zhjVarW.c = i5 + i6;
                this.b += i6;
            } else {
                if (cCharAt < 2048) {
                    zhj zhjVarW2 = w(2);
                    byte[] bArr2 = zhjVarW2.a;
                    int i7 = zhjVarW2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    zhjVarW2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    zhj zhjVarW3 = w(3);
                    byte[] bArr3 = zhjVarW3.a;
                    int i8 = zhjVarW3.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    zhjVarW3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        M(63);
                    } else {
                        zhj zhjVarW4 = w(4);
                        byte[] bArr4 = zhjVarW4.a;
                        int i9 = zhjVarW4.c;
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        zhjVarW4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    public final void S(int i) {
        if (i < 128) {
            M(i);
            return;
        }
        if (i < 2048) {
            zhj zhjVarW = w(2);
            byte[] bArr = zhjVarW.a;
            int i2 = zhjVarW.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            zhjVarW.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            M(63);
            return;
        }
        if (i < 65536) {
            zhj zhjVarW2 = w(3);
            byte[] bArr2 = zhjVarW2.a;
            int i3 = zhjVarW2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            zhjVarW2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(wcq.aF(i)));
        }
        zhj zhjVarW3 = w(4);
        byte[] bArr3 = zhjVarW3.a;
        int i4 = zhjVarW3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        zhjVarW3.c = i4 + 4;
        this.b += 4;
    }

    public final void T(byte[] bArr) {
        K(bArr, 0, bArr.length);
    }

    public final void U(long j) {
        if (j == 0) {
            M(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        zhj zhjVarW = w(i);
        byte[] bArr = zhjVarW.a;
        int i2 = zhjVarW.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                zhjVarW.c += i;
                this.b += i;
                return;
            } else {
                bArr[i3] = zhs.a[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    public final void V(String str) {
        str.getClass();
        R(str, 0, str.length());
    }

    @Override // defpackage.zgl
    public final /* bridge */ /* synthetic */ void W(int i) {
        throw null;
    }

    public final void X(long j) {
        boolean z;
        if (j == 0) {
            M(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                V("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = zhs.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > zhs.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        zhj zhjVarW = w(i);
        byte[] bArr2 = zhjVarW.a;
        int i2 = zhjVarW.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = zhs.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        zhjVarW.c += i;
        this.b += i;
    }

    @Override // defpackage.zgl
    public final /* bridge */ /* synthetic */ void Y(long j) {
        throw null;
    }

    @Override // defpackage.zgl
    public final /* bridge */ /* synthetic */ void Z(String str) {
        throw null;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.cs(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        zgkVar.eW(this, j);
        return j;
    }

    @Override // defpackage.zho
    public final zhq b() {
        return zhq.j;
    }

    public final byte c(long j) {
        wcq.aG(this.b, j, 1L);
        zhj zhjVar = this.a;
        zhjVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                zhjVar = zhjVar.g;
                zhjVar.getClass();
                j2 -= zhjVar.c - zhjVar.b;
            }
            zhjVar.getClass();
            return zhjVar.a[(int) ((zhjVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = zhjVar.c;
            int i2 = zhjVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                zhjVar.getClass();
                return zhjVar.a[(int) ((i2 + j) - j3)];
            }
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j3 = j4;
        }
    }

    public final /* synthetic */ Object clone() {
        zgk zgkVar = new zgk();
        if (this.b == 0) {
            return zgkVar;
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        zhj zhjVarB = zhjVar.b();
        zgkVar.a = zhjVarB;
        zhjVarB.g = zhjVarB;
        zhjVarB.f = zhjVarB.g;
        for (zhj zhjVar2 = zhjVar.f; zhjVar2 != zhjVar; zhjVar2 = zhjVar2.f) {
            zhj zhjVar3 = zhjVarB.g;
            zhjVar3.getClass();
            zhjVar2.getClass();
            zhjVar3.d(zhjVar2.b());
        }
        zgkVar.b = this.b;
        return zgkVar;
    }

    @Override // defpackage.zgm
    public final byte d() throws EOFException {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        int i = zhjVar.b;
        int i2 = i + 1;
        byte[] bArr = zhjVar.a;
        int i3 = zhjVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            zhjVar.b = i2;
            return b;
        }
        this.a = zhjVar.a();
        zhk.b(zhjVar);
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        wcq.aG(bArr.length, i, i2);
        zhj zhjVar = this.a;
        if (zhjVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, zhjVar.c - zhjVar.b);
        int i3 = zhjVar.b;
        yfm.be(zhjVar.a, bArr, i, i3, i3 + iMin);
        int i4 = zhjVar.b + iMin;
        zhjVar.b = i4;
        this.b -= iMin;
        if (i4 != zhjVar.c) {
            return iMin;
        }
        this.a = zhjVar.a();
        zhk.b(zhjVar);
        return iMin;
    }

    @Override // defpackage.zhm
    public final void eW(zgk zgkVar, long j) {
        zhj zhjVarB;
        zgkVar.getClass();
        if (zgkVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        wcq.aG(zgkVar.b, 0L, j);
        while (j > 0) {
            zhj zhjVar = zgkVar.a;
            zhjVar.getClass();
            int i = zhjVar.c;
            zhjVar.getClass();
            int i2 = i - zhjVar.b;
            int i3 = 0;
            if (j < i2) {
                zhj zhjVar2 = this.a;
                zhj zhjVar3 = zhjVar2 != null ? zhjVar2.g : null;
                int i4 = (int) j;
                if (zhjVar3 != null && zhjVar3.e) {
                    if ((zhjVar3.c + j) - (zhjVar3.d ? 0 : zhjVar3.b) <= 8192) {
                        zhjVar.getClass();
                        zhjVar.c(zhjVar3, i4);
                        zgkVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                zhjVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    zhjVarB = zhjVar.b();
                } else {
                    byte[] bArr = zhjVar.a;
                    zhj zhjVarA = zhk.a();
                    byte[] bArr2 = zhjVarA.a;
                    int i5 = zhjVar.b;
                    yfm.be(bArr, bArr2, 0, i5, i5 + i4);
                    zhjVarB = zhjVarA;
                }
                zhjVarB.c = zhjVarB.b + i4;
                zhjVar.b += i4;
                zhj zhjVar4 = zhjVar.g;
                zhjVar4.getClass();
                zhjVar4.d(zhjVarB);
                zgkVar.a = zhjVarB;
            }
            zhj zhjVar5 = zgkVar.a;
            zhjVar5.getClass();
            int i6 = zhjVar5.c - zhjVar5.b;
            zgkVar.a = zhjVar5.a();
            zhj zhjVar6 = this.a;
            if (zhjVar6 == null) {
                this.a = zhjVar5;
                zhjVar5.g = zhjVar5;
                zhjVar5.f = zhjVar5.g;
            } else {
                zhj zhjVar7 = zhjVar6.g;
                zhjVar7.getClass();
                zhjVar7.d(zhjVar5);
                zhj zhjVar8 = zhjVar5.g;
                if (zhjVar8 == zhjVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                zhjVar8.getClass();
                if (zhjVar8.e) {
                    int i7 = zhjVar5.c - zhjVar5.b;
                    zhjVar8.getClass();
                    int i8 = 8192 - zhjVar8.c;
                    zhjVar8.getClass();
                    if (!zhjVar8.d) {
                        zhjVar8.getClass();
                        i3 = zhjVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        zhjVar8.getClass();
                        zhjVar5.c(zhjVar8, i7);
                        zhjVar5.a();
                        zhk.b(zhjVar5);
                    }
                }
            }
            long j2 = i6;
            zgkVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgk)) {
            return false;
        }
        long j = this.b;
        zgk zgkVar = (zgk) obj;
        if (j != zgkVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        zhj zhjVar2 = zgkVar.a;
        zhjVar2.getClass();
        int i = zhjVar.b;
        int i2 = zhjVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(zhjVar.c - i, zhjVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (zhjVar.a[i] != zhjVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == zhjVar.c) {
                zhjVar = zhjVar.f;
                zhjVar.getClass();
                i = zhjVar.b;
            }
            if (i2 == zhjVar2.c) {
                zhjVar2 = zhjVar2.f;
                zhjVar2.getClass();
                i2 = zhjVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.zgm
    public final int f() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        int i = zhjVar.b;
        int i2 = zhjVar.c;
        if (i2 - i < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = zhjVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            zhjVar.b = i8;
            return i7;
        }
        this.a = zhjVar.a();
        zhk.b(zhjVar);
        return i7;
    }

    @Override // defpackage.zgm
    public final int g() {
        throw null;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        zhj zhjVar2 = zhjVar.g;
        zhjVar2.getClass();
        return (zhjVar2.c >= 8192 || !zhjVar2.e) ? j : j - (r3 - zhjVar2.b);
    }

    public final int hashCode() {
        zhj zhjVar = this.a;
        if (zhjVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zhjVar.c;
            for (int i3 = zhjVar.b; i3 < i2; i3++) {
                i = (i * 31) + zhjVar.a[i3];
            }
            zhjVar = zhjVar.f;
            zhjVar.getClass();
        } while (zhjVar != this.a);
        return i;
    }

    public final long i(byte b, long j, long j2) {
        zhj zhjVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (zhjVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                zhjVar = zhjVar.g;
                zhjVar.getClass();
                j6 -= zhjVar.c - zhjVar.b;
            }
            if (zhjVar == null) {
                return -1L;
            }
            while (j6 < j4) {
                byte[] bArr = zhjVar.a;
                long j8 = j7;
                int iMin = (int) Math.min(zhjVar.c, (zhjVar.b + j4) - j6);
                for (int i = (int) ((zhjVar.b + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return (i - zhjVar.b) + j6;
                    }
                }
                j6 += zhjVar.c - zhjVar.b;
                zhjVar = zhjVar.f;
                zhjVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (zhjVar.c - zhjVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j5 = j9;
        }
        if (zhjVar == null) {
            return -1L;
        }
        while (j5 < j4) {
            byte[] bArr2 = zhjVar.a;
            int iMin2 = (int) Math.min(zhjVar.c, (zhjVar.b + j4) - j5);
            for (int i2 = (int) ((zhjVar.b + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - zhjVar.b) + j5;
                }
            }
            j5 += zhjVar.c - zhjVar.b;
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.zgm
    public final long j(zgn zgnVar) {
        zgnVar.getClass();
        return k(zgnVar, 0L);
    }

    public final long k(zgn zgnVar, long j) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(a.cs(j, "fromIndex < 0: "));
        }
        zhj zhjVar = this.a;
        if (zhjVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                zhjVar = zhjVar.g;
                zhjVar.getClass();
                j3 -= zhjVar.c - zhjVar.b;
            }
            if (zhjVar == null) {
                return -1L;
            }
            if (zgnVar.c() == 2) {
                byte bA = zgnVar.a(0);
                byte bA2 = zgnVar.a(1);
                while (j3 < this.b) {
                    byte[] bArr = zhjVar.a;
                    long j4 = zhjVar.b + j;
                    int i = zhjVar.c;
                    for (int i2 = (int) (j4 - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bA || b == bA2) {
                            return (i2 - zhjVar.b) + j3;
                        }
                    }
                    j3 += zhjVar.c - zhjVar.b;
                    zhjVar = zhjVar.f;
                    zhjVar.getClass();
                    j = j3;
                }
                return -1L;
            }
            byte[] bArr2 = zgnVar.b;
            while (j3 < this.b) {
                byte[] bArr3 = zhjVar.a;
                long j5 = zhjVar.b + j;
                int i3 = zhjVar.c;
                for (int i4 = (int) (j5 - j3); i4 < i3; i4++) {
                    byte b2 = bArr3[i4];
                    for (byte b3 : bArr2) {
                        if (b2 == b3) {
                            return (i4 - zhjVar.b) + j3;
                        }
                    }
                }
                j3 += zhjVar.c - zhjVar.b;
                zhjVar = zhjVar.f;
                zhjVar.getClass();
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j6 = (zhjVar.c - zhjVar.b) + j2;
            if (j6 > j) {
                break;
            }
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j2 = j6;
        }
        if (zhjVar == null) {
            return -1L;
        }
        if (zgnVar.c() == 2) {
            byte bA3 = zgnVar.a(0);
            byte bA4 = zgnVar.a(1);
            while (j2 < this.b) {
                byte[] bArr4 = zhjVar.a;
                long j7 = zhjVar.b + j;
                int i5 = zhjVar.c;
                for (int i6 = (int) (j7 - j2); i6 < i5; i6++) {
                    byte b4 = bArr4[i6];
                    if (b4 == bA3 || b4 == bA4) {
                        return (i6 - zhjVar.b) + j2;
                    }
                }
                j2 += zhjVar.c - zhjVar.b;
                zhjVar = zhjVar.f;
                zhjVar.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] bArr5 = zgnVar.b;
        while (j2 < this.b) {
            byte[] bArr6 = zhjVar.a;
            long j8 = zhjVar.b + j;
            int i7 = zhjVar.c;
            for (int i8 = (int) (j8 - j2); i8 < i7; i8++) {
                byte b5 = bArr6[i8];
                for (byte b6 : bArr5) {
                    if (b5 == b6) {
                        return (i8 - zhjVar.b) + j2;
                    }
                }
            }
            j2 += zhjVar.c - zhjVar.b;
            zhjVar = zhjVar.f;
            zhjVar.getClass();
            j = j2;
        }
        return -1L;
    }

    @Override // defpackage.zgm
    public final long l() {
        throw null;
    }

    public final String m(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.cs(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        int i = zhjVar.b;
        int i2 = zhjVar.c;
        if (i + j > i2) {
            return new String(F(j), charset);
        }
        int i3 = (int) j;
        String str = new String(zhjVar.a, i, i3, charset);
        int i4 = i + i3;
        zhjVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = zhjVar.a();
            zhk.b(zhjVar);
        }
        return str;
    }

    public final String n() {
        return m(this.b, ynd.a);
    }

    @Override // defpackage.zgm
    public final String o(long j) {
        return m(j, ynd.a);
    }

    @Override // defpackage.zgm
    public final String p() {
        throw null;
    }

    @Override // defpackage.zgm
    public final String q(long j) {
        throw null;
    }

    @Override // defpackage.zgm
    public final zgm r() {
        throw null;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zhj zhjVar = this.a;
        if (zhjVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zhjVar.c - zhjVar.b);
        byteBuffer.put(zhjVar.a, zhjVar.b, iMin);
        int i = zhjVar.b + iMin;
        zhjVar.b = i;
        this.b -= iMin;
        if (i == zhjVar.c) {
            this.a = zhjVar.a();
            zhk.b(zhjVar);
        }
        return iMin;
    }

    public final zgn s() {
        return t(this.b);
    }

    @Override // defpackage.zgm
    public final zgn t(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.cs(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new zgn(F(j));
        }
        zgn zgnVarV = v((int) j);
        B(j);
        return zgnVarV;
    }

    public final String toString() {
        return u().toString();
    }

    public final zgn u() {
        long j = this.b;
        if (j <= 2147483647L) {
            return v((int) j);
        }
        throw new IllegalStateException(a.cs(j, "size > Int.MAX_VALUE: "));
    }

    public final zgn v(int i) {
        if (i == 0) {
            return zgn.a;
        }
        wcq.aG(this.b, 0L, i);
        zhj zhjVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            zhjVar.getClass();
            int i5 = zhjVar.c;
            int i6 = zhjVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            zhjVar = zhjVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        zhj zhjVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            zhjVar2.getClass();
            bArr[i7] = zhjVar2.a;
            i2 += zhjVar2.c - zhjVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = zhjVar2.b;
            zhjVar2.d = true;
            i7++;
            zhjVar2 = zhjVar2.f;
        }
        return new zhl(bArr, iArr);
    }

    public final zhj w(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        zhj zhjVar = this.a;
        if (zhjVar == null) {
            zhj zhjVarA = zhk.a();
            this.a = zhjVarA;
            zhjVarA.g = zhjVarA;
            zhjVarA.f = zhjVarA;
            return zhjVarA;
        }
        zhj zhjVar2 = zhjVar.g;
        zhjVar2.getClass();
        if (zhjVar2.c + i <= 8192 && zhjVar2.e) {
            return zhjVar2;
        }
        zhj zhjVarA2 = zhk.a();
        zhjVar2.d(zhjVarA2);
        return zhjVarA2;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            zhj zhjVarW = w(1);
            int i2 = 8192 - zhjVarW.c;
            byte[] bArr = zhjVarW.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, zhjVarW.c, iMin);
            i -= iMin;
            zhjVarW.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    @Override // defpackage.zgm
    public final short x() throws EOFException {
        int iD;
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        zhj zhjVar = this.a;
        zhjVar.getClass();
        int i = zhjVar.b;
        int i2 = zhjVar.c;
        if (i2 - i < 2) {
            iD = ((d() & 255) << 8) | (d() & 255);
        } else {
            byte[] bArr = zhjVar.a;
            int i3 = (bArr[i] & 255) << 8;
            int i4 = bArr[i + 1] & 255;
            this.b = j - 2;
            int i5 = i + 2;
            if (i5 == i2) {
                this.a = zhjVar.a();
                zhk.b(zhjVar);
            } else {
                zhjVar.b = i5;
            }
            iD = i3 | i4;
        }
        return (short) iD;
    }

    @Override // defpackage.zgm
    public final short y() throws EOFException {
        short sX = x();
        int i = sX >>> 8;
        return (short) (((sX & 255) << 8) | (i & 255));
    }

    public final void z() {
        B(this.b);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.zho
    public final void close() {
    }

    @Override // defpackage.zgl, defpackage.zhm, java.io.Flushable
    public final void flush() {
    }
}

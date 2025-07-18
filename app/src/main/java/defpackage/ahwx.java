package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwx implements Cloneable, ByteChannel, ahwz, ahwy {
    public ahxl a;
    public long b;

    public final void A(String str) {
        str.getClass();
        z(str, 0, str.length());
    }

    @Override // defpackage.ahwy
    public final /* bridge */ /* synthetic */ void B(String str) {
        throw null;
    }

    @Override // defpackage.ahxq
    public final long a(ahwx ahwxVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.l(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        ahwxVar.fF(this, j);
        return j;
    }

    public final byte b(long j) {
        ahwt.a(this.b, j, 1L);
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                ahxlVar = ahxlVar.g;
                ahxlVar.getClass();
                j2 -= ahxlVar.c - ahxlVar.b;
            }
            ahxlVar.getClass();
            return ahxlVar.a[(int) ((ahxlVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = ahxlVar.c;
            int i2 = ahxlVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                ahxlVar.getClass();
                return ahxlVar.a[(int) ((i2 + j) - j3)];
            }
            ahxlVar = ahxlVar.f;
            ahxlVar.getClass();
            j3 = j4;
        }
    }

    @Override // defpackage.ahwz
    public final byte c() throws EOFException {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        int i = ahxlVar.b;
        int i2 = i + 1;
        byte[] bArr = ahxlVar.a;
        int i3 = ahxlVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            ahxlVar.b = i2;
            return b;
        }
        this.a = ahxlVar.a();
        ahxm.b(ahxlVar);
        return b;
    }

    public final /* synthetic */ Object clone() {
        ahwx ahwxVar = new ahwx();
        if (this.b == 0) {
            return ahwxVar;
        }
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        ahxl ahxlVarB = ahxlVar.b();
        ahwxVar.a = ahxlVarB;
        ahxlVarB.g = ahxlVarB;
        ahxlVarB.f = ahxlVarB.g;
        for (ahxl ahxlVar2 = ahxlVar.f; ahxlVar2 != ahxlVar; ahxlVar2 = ahxlVar2.f) {
            ahxl ahxlVar3 = ahxlVarB.g;
            ahxlVar3.getClass();
            ahxlVar2.getClass();
            ahxlVar3.d(ahxlVar2.b());
        }
        ahwxVar.b = this.b;
        return ahwxVar;
    }

    public final int d(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ahwt.a(bArr.length, i, i2);
        ahxl ahxlVar = this.a;
        if (ahxlVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, ahxlVar.c - ahxlVar.b);
        int i3 = ahxlVar.b;
        System.arraycopy(ahxlVar.a, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = ahxlVar.b + iMin;
        ahxlVar.b = i4;
        this.b -= iMin;
        if (i4 != ahxlVar.c) {
            return iMin;
        }
        this.a = ahxlVar.a();
        ahxm.b(ahxlVar);
        return iMin;
    }

    @Override // defpackage.ahwz
    public final int e() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        int i = ahxlVar.b;
        int i2 = ahxlVar.c;
        if (i2 - i < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = ahxlVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            ahxlVar.b = i8;
            return i7;
        }
        this.a = ahxlVar.a();
        ahxm.b(ahxlVar);
        return i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahwx)) {
            return false;
        }
        long j = this.b;
        ahwx ahwxVar = (ahwx) obj;
        if (j != ahwxVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        ahxl ahxlVar2 = ahwxVar.a;
        ahxlVar2.getClass();
        int i = ahxlVar.b;
        int i2 = ahxlVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(ahxlVar.c - i, ahxlVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (ahxlVar.a[i] != ahxlVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == ahxlVar.c) {
                ahxlVar = ahxlVar.f;
                ahxlVar.getClass();
                i = ahxlVar.b;
            }
            if (i2 == ahxlVar2.c) {
                ahxlVar2 = ahxlVar2.f;
                ahxlVar2.getClass();
                i2 = ahxlVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final long f() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        ahxl ahxlVar2 = ahxlVar.g;
        ahxlVar2.getClass();
        return (ahxlVar2.c >= 8192 || !ahxlVar2.e) ? j : j - (r3 - ahxlVar2.b);
    }

    @Override // defpackage.ahxo
    public final void fF(ahwx ahwxVar, long j) {
        ahxl ahxlVarB;
        ahwxVar.getClass();
        if (ahwxVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        ahwt.a(ahwxVar.b, 0L, j);
        while (j > 0) {
            ahxl ahxlVar = ahwxVar.a;
            ahxlVar.getClass();
            int i = ahxlVar.c;
            ahxlVar.getClass();
            int i2 = i - ahxlVar.b;
            int i3 = 0;
            if (j < i2) {
                ahxl ahxlVar2 = this.a;
                ahxl ahxlVar3 = ahxlVar2 != null ? ahxlVar2.g : null;
                int i4 = (int) j;
                if (ahxlVar3 != null && ahxlVar3.e) {
                    if ((ahxlVar3.c + j) - (ahxlVar3.d ? 0 : ahxlVar3.b) <= 8192) {
                        ahxlVar.getClass();
                        ahxlVar.c(ahxlVar3, i4);
                        ahwxVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                ahxlVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    ahxlVarB = ahxlVar.b();
                } else {
                    byte[] bArr = ahxlVar.a;
                    ahxl ahxlVarA = ahxm.a();
                    byte[] bArr2 = ahxlVarA.a;
                    int i5 = ahxlVar.b;
                    System.arraycopy(bArr, i5, bArr2, 0, (i5 + i4) - i5);
                    ahxlVarB = ahxlVarA;
                }
                ahxlVarB.c = ahxlVarB.b + i4;
                ahxlVar.b += i4;
                ahxl ahxlVar4 = ahxlVar.g;
                ahxlVar4.getClass();
                ahxlVar4.d(ahxlVarB);
                ahwxVar.a = ahxlVarB;
            }
            ahxl ahxlVar5 = ahwxVar.a;
            ahxlVar5.getClass();
            int i6 = ahxlVar5.c - ahxlVar5.b;
            ahwxVar.a = ahxlVar5.a();
            ahxl ahxlVar6 = this.a;
            if (ahxlVar6 == null) {
                this.a = ahxlVar5;
                ahxlVar5.g = ahxlVar5;
                ahxlVar5.f = ahxlVar5.g;
            } else {
                ahxl ahxlVar7 = ahxlVar6.g;
                ahxlVar7.getClass();
                ahxlVar7.d(ahxlVar5);
                ahxl ahxlVar8 = ahxlVar5.g;
                if (ahxlVar8 == ahxlVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                ahxlVar8.getClass();
                if (ahxlVar8.e) {
                    int i7 = ahxlVar5.c - ahxlVar5.b;
                    ahxlVar8.getClass();
                    int i8 = 8192 - ahxlVar8.c;
                    ahxlVar8.getClass();
                    if (!ahxlVar8.d) {
                        ahxlVar8.getClass();
                        i3 = ahxlVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        ahxlVar8.getClass();
                        ahxlVar5.c(ahxlVar8, i7);
                        ahxlVar5.a();
                        ahxm.b(ahxlVar5);
                    }
                }
            }
            long j2 = i6;
            ahwxVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // defpackage.ahwz
    public final long g(ahxb ahxbVar) {
        throw null;
    }

    public final String h(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.l(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        ahxl ahxlVar = this.a;
        ahxlVar.getClass();
        int i = ahxlVar.b;
        int i2 = ahxlVar.c;
        if (i + j > i2) {
            return new String(q(j), charset);
        }
        int i3 = (int) j;
        String str = new String(ahxlVar.a, i, i3, charset);
        int i4 = i + i3;
        ahxlVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = ahxlVar.a();
            ahxm.b(ahxlVar);
        }
        return str;
    }

    public final int hashCode() {
        ahxl ahxlVar = this.a;
        if (ahxlVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ahxlVar.c;
            for (int i3 = ahxlVar.b; i3 < i2; i3++) {
                i = (i * 31) + ahxlVar.a[i3];
            }
            ahxlVar = ahxlVar.f;
            ahxlVar.getClass();
        } while (ahxlVar != this.a);
        return i;
    }

    public final String i() {
        return h(this.b, agyo.a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.ahwz
    public final ahxb j(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.l(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ahxb(q(j));
        }
        ahxb ahxbVarL = l((int) j);
        o(j);
        return ahxbVarL;
    }

    public final ahxb k() {
        long j = this.b;
        if (j <= 2147483647L) {
            return l((int) j);
        }
        throw new IllegalStateException(a.l(j, "size > Int.MAX_VALUE: "));
    }

    public final ahxb l(int i) {
        if (i == 0) {
            return ahxb.b;
        }
        ahwt.a(this.b, 0L, i);
        ahxl ahxlVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ahxlVar.getClass();
            int i5 = ahxlVar.c;
            int i6 = ahxlVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            ahxlVar = ahxlVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        ahxl ahxlVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            ahxlVar2.getClass();
            bArr[i7] = ahxlVar2.a;
            i2 += ahxlVar2.c - ahxlVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ahxlVar2.b;
            ahxlVar2.d = true;
            i7++;
            ahxlVar2 = ahxlVar2.f;
        }
        return new ahxn(bArr, iArr);
    }

    public final ahxl m(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        ahxl ahxlVar = this.a;
        if (ahxlVar == null) {
            ahxl ahxlVarA = ahxm.a();
            this.a = ahxlVarA;
            ahxlVarA.g = ahxlVarA;
            ahxlVarA.f = ahxlVarA;
            return ahxlVarA;
        }
        ahxl ahxlVar2 = ahxlVar.g;
        ahxlVar2.getClass();
        if (ahxlVar2.c + i <= 8192 && ahxlVar2.e) {
            return ahxlVar2;
        }
        ahxl ahxlVarA2 = ahxm.a();
        ahxlVar2.d(ahxlVarA2);
        return ahxlVarA2;
    }

    @Override // defpackage.ahwz
    public final void n(long j) {
        throw null;
    }

    @Override // defpackage.ahwz
    public final void o(long j) throws EOFException {
        while (j > 0) {
            ahxl ahxlVar = this.a;
            if (ahxlVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, ahxlVar.c - ahxlVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = ahxlVar.b + iMin;
            ahxlVar.b = i;
            if (i == ahxlVar.c) {
                this.a = ahxlVar.a();
                ahxm.b(ahxlVar);
            }
        }
    }

    @Override // defpackage.ahwz
    public final boolean p(long j) {
        throw null;
    }

    public final byte[] q(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.l(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iD = d(bArr, i2, i - i2);
            if (iD == -1) {
                throw new EOFException();
            }
            i2 += iD;
        }
        return bArr;
    }

    public final void r(ahwx ahwxVar, long j, long j2) {
        long j3 = j;
        ahwt.a(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        ahwxVar.b += j2;
        ahxl ahxlVar = this.a;
        while (true) {
            ahxlVar.getClass();
            long j4 = ahxlVar.c - ahxlVar.b;
            if (j3 < j4) {
                break;
            }
            ahxlVar = ahxlVar.f;
            j3 -= j4;
        }
        ahxl ahxlVar2 = ahxlVar;
        long j5 = j2;
        while (j5 > 0) {
            ahxlVar2.getClass();
            ahxl ahxlVarB = ahxlVar2.b();
            int i = ahxlVarB.b + ((int) j3);
            ahxlVarB.b = i;
            ahxlVarB.c = Math.min(i + ((int) j5), ahxlVarB.c);
            ahxl ahxlVar3 = ahwxVar.a;
            if (ahxlVar3 == null) {
                ahxlVarB.g = ahxlVarB;
                ahxlVarB.f = ahxlVarB.g;
                ahwxVar.a = ahxlVarB.f;
            } else {
                ahxl ahxlVar4 = ahxlVar3.g;
                ahxlVar4.getClass();
                ahxlVar4.d(ahxlVarB);
            }
            j5 -= ahxlVarB.c - ahxlVarB.b;
            ahxlVar2 = ahxlVar2.f;
            j3 = 0;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ahxl ahxlVar = this.a;
        if (ahxlVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), ahxlVar.c - ahxlVar.b);
        byteBuffer.put(ahxlVar.a, ahxlVar.b, iMin);
        int i = ahxlVar.b + iMin;
        ahxlVar.b = i;
        this.b -= iMin;
        if (i == ahxlVar.c) {
            this.a = ahxlVar.a();
            ahxm.b(ahxlVar);
        }
        return iMin;
    }

    public final void s(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ahwt.a(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            ahxl ahxlVarM = m(1);
            int i5 = 8192 - ahxlVarM.c;
            byte[] bArr2 = ahxlVarM.a;
            int iMin = Math.min(i4 - i3, i5);
            int i6 = i3 + iMin;
            System.arraycopy(bArr, i3, bArr2, ahxlVarM.c, i6 - i3);
            ahxlVarM.c += iMin;
            i3 = i6;
        }
    }

    public final void t(ahxq ahxqVar) {
        while (ahxqVar.a(this, 8192L) != -1) {
        }
    }

    public final String toString() {
        return k().toString();
    }

    public final void u(int i) {
        ahxl ahxlVarM = m(1);
        byte[] bArr = ahxlVarM.a;
        int i2 = ahxlVarM.c;
        ahxlVarM.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.ahwy
    public final /* bridge */ /* synthetic */ void v(int i) {
        throw null;
    }

    public final void w(int i) {
        ahxl ahxlVarM = m(4);
        byte[] bArr = ahxlVarM.a;
        int i2 = ahxlVarM.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        ahxlVarM.c = i2 + 4;
        this.b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            ahxl ahxlVarM = m(1);
            int i2 = 8192 - ahxlVarM.c;
            byte[] bArr = ahxlVarM.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, ahxlVarM.c, iMin);
            i -= iMin;
            ahxlVarM.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    @Override // defpackage.ahwy
    public final /* bridge */ /* synthetic */ void x(int i) {
        throw null;
    }

    public final void y(OutputStream outputStream, long j) throws IOException {
        outputStream.getClass();
        ahwt.a(this.b, 0L, j);
        ahxl ahxlVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            ahxlVar.getClass();
            int iMin = (int) Math.min(j2, ahxlVar.c - ahxlVar.b);
            outputStream.write(ahxlVar.a, ahxlVar.b, iMin);
            int i = ahxlVar.b + iMin;
            ahxlVar.b = i;
            long j3 = iMin;
            this.b -= j3;
            j2 -= j3;
            if (i == ahxlVar.c) {
                ahxl ahxlVarA = ahxlVar.a();
                this.a = ahxlVarA;
                ahxm.b(ahxlVar);
                ahxlVar = ahxlVarA;
            }
        }
    }

    public final void z(String str, int i, int i2) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.b(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.k(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                ahxl ahxlVarM = m(1);
                byte[] bArr = ahxlVarM.a;
                int i4 = ahxlVarM.c - i;
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
                int i5 = ahxlVarM.c;
                int i6 = (i4 + i) - i5;
                ahxlVarM.c = i5 + i6;
                this.b += i6;
            } else {
                if (cCharAt < 2048) {
                    ahxl ahxlVarM2 = m(2);
                    byte[] bArr2 = ahxlVarM2.a;
                    int i7 = ahxlVarM2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    ahxlVarM2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    ahxl ahxlVarM3 = m(3);
                    byte[] bArr3 = ahxlVarM3.a;
                    int i8 = ahxlVarM3.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    ahxlVarM3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        u(63);
                    } else {
                        ahxl ahxlVarM4 = m(4);
                        byte[] bArr4 = ahxlVarM4.a;
                        int i9 = ahxlVarM4.c;
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        ahxlVarM4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ahxq
    public final void close() {
    }

    @Override // defpackage.ahwy, defpackage.ahxo, java.io.Flushable
    public final void flush() {
    }
}

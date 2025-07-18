package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhi implements zgm {
    public final zho a;
    public final zgk b = new zgk();
    public boolean c;

    public zhi(zho zhoVar) {
        this.a = zhoVar;
    }

    @Override // defpackage.zgm
    public final void A(long j) throws EOFException {
        if (!D(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.zgm
    public final void B(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            zgk zgkVar = this.b;
            if (zgkVar.b == 0 && this.a.a(zgkVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, zgkVar.b);
            zgkVar.B(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.zgm
    public final boolean C() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        zgk zgkVar = this.b;
        return zgkVar.C() && this.a.a(zgkVar, 8192L) == -1;
    }

    @Override // defpackage.zgm
    public final boolean D(long j) {
        zgk zgkVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.cs(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            zgkVar = this.b;
            if (zgkVar.b >= j) {
                return true;
            }
        } while (this.a.a(zgkVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.zgm
    public final byte[] F(long j) throws EOFException {
        A(j);
        return this.b.F(j);
    }

    @Override // defpackage.zgm
    public final void I(zhm zhmVar) {
        zgk zgkVar;
        while (true) {
            zho zhoVar = this.a;
            zgkVar = this.b;
            if (zhoVar.a(zgkVar, 8192L) == -1) {
                break;
            }
            long jH = zgkVar.h();
            if (jH > 0) {
                zhmVar.eW(zgkVar, jH);
            }
        }
        long j = zgkVar.b;
        if (j > 0) {
            zhmVar.eW(zgkVar, j);
        }
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.cs(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        zgk zgkVar2 = this.b;
        if (zgkVar2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.a(zgkVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return zgkVar2.a(zgkVar, Math.min(j, zgkVar2.b));
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.a.b();
    }

    public final long c() {
        return e((byte) 0, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.zho
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.z();
    }

    @Override // defpackage.zgm
    public final byte d() throws EOFException {
        A(1L);
        return this.b.d();
    }

    public final long e(byte b, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (jMax < j) {
            zgk zgkVar = this.b;
            byte b2 = b;
            long j2 = j;
            long jI = zgkVar.i(b2, jMax, j2);
            if (jI != -1) {
                return jI;
            }
            long j3 = zgkVar.b;
            if (j3 >= j2 || this.a.a(zgkVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
            b = b2;
            j = j2;
        }
        return -1L;
    }

    @Override // defpackage.zgm
    public final int f() throws EOFException {
        A(4L);
        return this.b.f();
    }

    @Override // defpackage.zgm
    public final int g() throws EOFException {
        A(4L);
        int iF = this.b.f();
        int i = iF >>> 24;
        int i2 = 16711680 & iF;
        int i3 = 65280 & iF;
        return ((iF & 255) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.zgm
    public final long j(zgn zgnVar) {
        zgnVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            zgk zgkVar = this.b;
            long jK = zgkVar.k(zgnVar, jMax);
            if (jK != -1) {
                return jK;
            }
            long j = zgkVar.b;
            if (this.a.a(zgkVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // defpackage.zgm
    public final long l() throws EOFException {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        long jF;
        A(8L);
        zgk zgkVar = this.b;
        long j2 = zgkVar.b;
        if (j2 < 8) {
            throw new EOFException();
        }
        zhj zhjVar = zgkVar.a;
        zhjVar.getClass();
        int i = zhjVar.b;
        int i2 = zhjVar.c;
        if (i2 - i < 8) {
            jF = ((zgkVar.f() & 4294967295L) << 32) | (zgkVar.f() & 4294967295L);
            c3 = '8';
            j = 255;
            c = 24;
            c2 = '(';
            c4 = '\b';
        } else {
            byte[] bArr = zhjVar.a;
            c = 24;
            c2 = '(';
            c3 = '8';
            c4 = '\b';
            j = 255;
            long j3 = (bArr[i + 2] & 255) << 40;
            long j4 = (bArr[i + 3] & 255) << 32;
            long j5 = (bArr[i + 4] & 255) << 24;
            long j6 = (bArr[i + 6] & 255) << 8;
            long j7 = bArr[i + 7] & 255;
            zgkVar.b = j2 - 8;
            long j8 = j7 | ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | j3 | j4 | j5 | ((bArr[i + 5] & 255) << 16) | j6;
            int i3 = i + 8;
            if (i3 == i2) {
                zgkVar.a = zhjVar.a();
                zhk.b(zhjVar);
            } else {
                zhjVar.b = i3;
            }
            jF = j8;
        }
        return ((jF & (-72057594037927936L)) >>> c3) | ((jF & 71776119061217280L) >>> c2) | ((280375465082880L & jF) >>> c) | ((1095216660480L & jF) >>> c4) | ((4278190080L & jF) << c4) | ((16711680 & jF) << c) | ((65280 & jF) << c2) | ((jF & j) << c3);
    }

    @Override // defpackage.zgm
    public final String o(long j) throws EOFException {
        A(j);
        return this.b.o(j);
    }

    @Override // defpackage.zgm
    public final String p() {
        return q(Long.MAX_VALUE);
    }

    @Override // defpackage.zgm
    public final String q(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(a.cs(j, "limit < 0: "));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jE = e((byte) 10, j2);
        if (jE != -1) {
            return zhs.a(this.b, jE);
        }
        if (j2 < Long.MAX_VALUE && D(j2)) {
            zgk zgkVar = this.b;
            if (zgkVar.c((-1) + j2) == 13 && D(1 + j2) && zgkVar.c(j2) == 10) {
                return zhs.a(zgkVar, j2);
            }
        }
        zgk zgkVar2 = new zgk();
        zgk zgkVar3 = this.b;
        zgkVar3.G(zgkVar2, 0L, Math.min(32L, zgkVar3.b));
        throw new EOFException("\\n not found: limit=" + Math.min(zgkVar3.b, j) + " content=" + zgkVar2.s().g() + "…");
    }

    @Override // defpackage.zgm
    public final zgm r() {
        return new zhi(new zhf(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zgk zgkVar = this.b;
        if (zgkVar.b == 0 && this.a.a(zgkVar, 8192L) == -1) {
            return -1;
        }
        return zgkVar.read(byteBuffer);
    }

    @Override // defpackage.zgm
    public final zgn t(long j) throws EOFException {
        A(j);
        return this.b.t(j);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.zgm
    public final short x() throws EOFException {
        A(2L);
        return this.b.x();
    }

    @Override // defpackage.zgm
    public final short y() throws EOFException {
        A(2L);
        return this.b.y();
    }
}

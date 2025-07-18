package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmn {
    public boolean c;
    public boolean d;
    public boolean e;
    public final edo a = new edo(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final edi b = new edi();

    public fmn(byte[] bArr) {
    }

    public static long b(edi ediVar) {
        int i = ediVar.b;
        if (ediVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ediVar.F(bArr, 0, 9);
        ediVar.K(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (bArr[1] & 255) << 20;
        long j5 = (j2 & 3) << 13;
        return j5 | j4 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    public static final int d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void a(fdq fdqVar) {
        this.b.H(edt.b);
        this.c = true;
        fdqVar.k();
    }

    public final void c(fdq fdqVar) {
        this.b.H(edt.b);
        this.c = true;
        fdqVar.k();
    }

    public fmn() {
    }
}

package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final fse k;
    private final ead l;

    public fdu(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, fse fseVar, ead eadVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = fseVar;
        this.l = eadVar;
    }

    private static int f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return edt.t((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final dze c(byte[] bArr, ead eadVar) {
        bArr[4] = Byte.MIN_VALUE;
        ead eadVarD = d(eadVar);
        dzd dzdVar = new dzd();
        dzdVar.d("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        dzdVar.n = i;
        dzdVar.E = this.g;
        dzdVar.F = this.e;
        dzdVar.G = edt.n(this.h);
        dzdVar.p = Collections.singletonList(bArr);
        dzdVar.k = eadVarD;
        return new dze(dzdVar);
    }

    public final ead d(ead eadVar) {
        ead eadVar2 = this.l;
        return eadVar2 == null ? eadVar : eadVar2.d(eadVar);
    }

    public final fdu e(fse fseVar) {
        return new fdu(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, fseVar, this.l);
    }

    public fdu(byte[] bArr, int i) {
        edh edhVar = new edh(bArr);
        edhVar.l(i * 8);
        this.a = edhVar.d(16);
        this.b = edhVar.d(16);
        this.c = edhVar.d(24);
        this.d = edhVar.d(24);
        int iD = edhVar.d(20);
        this.e = iD;
        this.f = g(iD);
        this.g = edhVar.d(3) + 1;
        int iD2 = edhVar.d(5) + 1;
        this.h = iD2;
        this.i = f(iD2);
        this.j = edhVar.e(36);
        this.k = null;
        this.l = null;
    }
}

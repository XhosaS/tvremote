package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djr extends djp {
    public final byte[] c;
    public final short[][] d;
    public final short[][] e;
    public final short[][] f;
    public final short[][] g;
    public final short[][][] h;
    public final short[][][] i;
    public final short[][][] j;
    public final short[][][] k;
    public final short[][][] l;
    public final short[][][] m;
    public final short[][][] n;
    public final byte[] o;
    public byte[] p;

    public djr(djq djqVar, byte[] bArr) {
        super(true, djqVar);
        int i = 0;
        if (djqVar.m != 3) {
            int i2 = djqVar.g;
            int i3 = djqVar.h;
            int i4 = djqVar.i;
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
            this.d = sArr;
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i3);
            this.e = sArr2;
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2, i4);
            this.g = sArr3;
            short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i4);
            this.f = sArr4;
            short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i2, i2);
            this.h = sArr5;
            short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i3, i2, i3);
            this.i = sArr6;
            short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i2);
            this.j = sArr7;
            short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i3);
            this.k = sArr8;
            short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i2, i4);
            this.l = sArr9;
            short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i3, i3);
            this.m = sArr10;
            short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i4, i3, i4);
            this.n = sArr11;
            this.o = null;
            byte[] bArrT = dos.t(bArr, 0, 32);
            this.c = bArrT;
            int length = bArrT.length;
            int iV = length + dnx.v(sArr, bArr, length);
            int iV2 = iV + dnx.v(sArr2, bArr, iV);
            int iV3 = iV2 + dnx.v(sArr3, bArr, iV2);
            int iV4 = iV3 + dnx.v(sArr4, bArr, iV3);
            int iW = iV4 + dnx.w(sArr5, bArr, iV4, true);
            int iW2 = iW + dnx.w(sArr6, bArr, iW, false);
            int iW3 = iW2 + dnx.w(sArr7, bArr, iW2, true);
            int iW4 = iW3 + dnx.w(sArr8, bArr, iW3, false);
            int iW5 = iW4 + dnx.w(sArr9, bArr, iW4, false);
            int iW6 = iW5 + dnx.w(sArr10, bArr, iW5, true);
            this.p = dos.t(bArr, iW6 + dnx.w(sArr11, bArr, iW6, false), bArr.length);
            return;
        }
        byte[] bArrT2 = dos.t(bArr, 0, 32);
        this.o = bArrT2;
        byte[] bArrT3 = dos.t(bArr, 32, 64);
        this.c = bArrT3;
        int i5 = djqVar.m;
        int i6 = djqVar.g;
        int i7 = djqVar.h;
        int i8 = djqVar.i;
        byte[] bArrP = dos.p(bArrT3);
        byte[] bArrP2 = dos.p(bArrT2);
        djo djoVar = new djo(bArrP, djqVar.l);
        djo djoVar2 = new djo(bArrP2, djqVar.l);
        short[][] sArrA = dnx.A(djoVar, i7, i8);
        short[][] sArrA2 = dnx.A(djoVar, i6, i7);
        short[][] sArrA3 = dnx.A(djoVar, i6, i8);
        short[][] sArrA4 = dnx.A(djoVar, i7, i8);
        short[][] sArrD = dnx.D(dnx.E(sArrA2, sArrA4), sArrA3);
        short[][][] sArrC = dnx.C(djoVar2, i7, i6, i6, true);
        short[][][] sArrC2 = dnx.C(djoVar2, i7, i6, i7, false);
        short[][][] sArrC3 = dnx.C(djoVar2, i8, i6, i6, true);
        short[][][] sArrC4 = dnx.C(djoVar2, i8, i6, i7, false);
        short[][][] sArrC5 = dnx.C(djoVar2, i8, i6, i8, false);
        short[][][] sArrC6 = dnx.C(djoVar2, i8, i7, i7, true);
        short[][][] sArrC7 = dnx.C(djoVar2, i8, i7, i8, false);
        short[][][] sArrF = dnx.F(sArrA, sArrC3, sArrC);
        short[][][] sArrF2 = dnx.F(sArrA, sArrC4, sArrC2);
        short[][][] sArrB = dnx.B(sArrF);
        short[][][] sArr12 = new short[i7][][];
        while (i < i7) {
            short[][][] sArr13 = sArrC4;
            short[][] sArrH = dnx.H(sArrF[i]);
            sArr12[i] = sArrH;
            short[][] sArrE = dnx.E(sArrH, sArrA2);
            sArr12[i] = sArrE;
            sArr12[i] = dnx.D(sArrE, sArrF2[i]);
            i++;
            sArrC4 = sArr13;
        }
        short[][][] sArr14 = sArrC4;
        short[][][] sArr15 = new short[i8][][];
        short[][][] sArr16 = new short[i8][][];
        short[][][] sArr17 = new short[i8][][];
        short[][][] sArr18 = new short[i8][][];
        short[][][] sArrB2 = dnx.B(sArrC3);
        int i9 = 0;
        while (i9 < i8) {
            short[][][] sArr19 = sArr15;
            short[][] sArrH2 = dnx.H(sArrC3[i9]);
            short[][][] sArr20 = sArr16;
            short[][] sArrE2 = dnx.E(sArrH2, sArrA2);
            sArr19[i9] = sArrE2;
            short[][][] sArr21 = sArr12;
            sArr19[i9] = dnx.D(sArrE2, sArr14[i9]);
            sArr20[i9] = dnx.E(sArrH2, sArrD);
            short[][] sArrD2 = dnx.D(sArr20[i9], dnx.E(sArr14[i9], sArrA4));
            sArr20[i9] = sArrD2;
            sArr20[i9] = dnx.D(sArrD2, sArrC5[i9]);
            short[][] sArrD3 = dnx.D(dnx.E(sArrC3[i9], sArrA2), sArr14[i9]);
            short[][] sArrG = dnx.G(sArrA2);
            short[][] sArrE3 = dnx.E(sArrG, sArrD3);
            sArr17[i9] = sArrE3;
            short[][] sArrD4 = dnx.D(sArrE3, sArrC6[i9]);
            sArr17[i9] = sArrD4;
            int length2 = sArrD4.length;
            short[][] sArr22 = sArrA;
            if (length2 != sArrD4[0].length) {
                throw new RuntimeException("Computation to upper triangular matrix is not possible!");
            }
            short[][] sArr23 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length2);
            int i10 = 0;
            while (i10 < sArrD4.length) {
                sArr23[i10][i10] = sArrD4[i10][i10];
                short[][] sArr24 = sArrD4;
                int i11 = i10 + 1;
                while (i11 < sArr24[0].length) {
                    int i12 = i11;
                    sArr23[i10][i12] = djn.a(sArr24[i10][i12], sArr24[i12][i10]);
                    i11 = i12 + 1;
                }
                sArrD4 = sArr24;
                i10 = i11;
            }
            sArr17[i9] = sArr23;
            sArr18[i9] = dnx.E(sArrG, sArr20[i9]);
            sArr18[i9] = dnx.D(sArr18[i9], dnx.E(dnx.G(sArr14[i9]), sArrD));
            short[][] sArrD5 = dnx.D(sArr18[i9], dnx.E(dnx.H(sArrC6[i9]), sArrA4));
            sArr18[i9] = sArrD5;
            sArr18[i9] = dnx.D(sArrD5, sArrC7[i9]);
            i9++;
            sArr16 = sArr20;
            sArr15 = sArr19;
            sArr12 = sArr21;
            sArrA = sArr22;
        }
        djr djrVar = new djr(djqVar, bArrP, sArrA, sArrA2, sArrA4, sArrD, sArrB, sArr12, sArrB2, sArr15, sArr16, sArr17, sArr18);
        this.p = djrVar.p;
        this.d = djrVar.d;
        this.e = djrVar.e;
        this.f = djrVar.f;
        this.g = djrVar.g;
        this.h = djrVar.h;
        this.i = djrVar.i;
        this.j = djrVar.j;
        this.k = djrVar.k;
        this.l = djrVar.l;
        this.m = djrVar.m;
        this.n = djrVar.n;
    }

    public djr(djq djqVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, djqVar);
        this.o = null;
        this.p = null;
        this.c = (byte[]) bArr.clone();
        this.d = dnx.z(sArr);
        this.e = dnx.z(sArr2);
        this.f = dnx.z(sArr3);
        this.g = dnx.z(sArr4);
        this.h = dnx.B(sArr5);
        this.i = dnx.B(sArr6);
        this.j = dnx.B(sArr7);
        this.k = dnx.B(sArr8);
        this.l = dnx.B(sArr9);
        this.m = dnx.B(sArr10);
        this.n = dnx.B(sArr11);
    }
}

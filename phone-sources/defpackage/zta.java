package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zta extends zsy {
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

    public zta(zsz zszVar, byte[] bArr) {
        super(true, zszVar);
        int i = 0;
        if (zszVar.m != 3) {
            int i2 = zszVar.g;
            int i3 = zszVar.h;
            int i4 = zszVar.i;
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
            byte[] bArrBh = vxr.bh(bArr, 0, 32);
            this.c = bArrBh;
            int length = bArrBh.length;
            int iY = length + wef.y(sArr, bArr, length);
            int iY2 = iY + wef.y(sArr2, bArr, iY);
            int iY3 = iY2 + wef.y(sArr3, bArr, iY2);
            int iY4 = iY3 + wef.y(sArr4, bArr, iY3);
            int iZ = iY4 + wef.z(sArr5, bArr, iY4, true);
            int iZ2 = iZ + wef.z(sArr6, bArr, iZ, false);
            int iZ3 = iZ2 + wef.z(sArr7, bArr, iZ2, true);
            int iZ4 = iZ3 + wef.z(sArr8, bArr, iZ3, false);
            int iZ5 = iZ4 + wef.z(sArr9, bArr, iZ4, false);
            int iZ6 = iZ5 + wef.z(sArr10, bArr, iZ5, true);
            this.p = vxr.bh(bArr, iZ6 + wef.z(sArr11, bArr, iZ6, false), bArr.length);
            return;
        }
        byte[] bArrBh2 = vxr.bh(bArr, 0, 32);
        this.o = bArrBh2;
        byte[] bArrBh3 = vxr.bh(bArr, 32, 64);
        this.c = bArrBh3;
        int i5 = zszVar.m;
        int i6 = zszVar.g;
        int i7 = zszVar.h;
        int i8 = zszVar.i;
        byte[] bArrBd = vxr.bd(bArrBh3);
        byte[] bArrBd2 = vxr.bd(bArrBh2);
        zsx zsxVar = new zsx(bArrBd, zszVar.l);
        zsx zsxVar2 = new zsx(bArrBd2, zszVar.l);
        short[][] sArrD = wef.D(zsxVar, i7, i8);
        short[][] sArrD2 = wef.D(zsxVar, i6, i7);
        short[][] sArrD3 = wef.D(zsxVar, i6, i8);
        short[][] sArrD4 = wef.D(zsxVar, i7, i8);
        short[][] sArrG = wef.G(wef.H(sArrD2, sArrD4), sArrD3);
        short[][][] sArrF = wef.F(zsxVar2, i7, i6, i6, true);
        short[][][] sArrF2 = wef.F(zsxVar2, i7, i6, i7, false);
        short[][][] sArrF3 = wef.F(zsxVar2, i8, i6, i6, true);
        short[][][] sArrF4 = wef.F(zsxVar2, i8, i6, i7, false);
        short[][][] sArrF5 = wef.F(zsxVar2, i8, i6, i8, false);
        short[][][] sArrF6 = wef.F(zsxVar2, i8, i7, i7, true);
        short[][][] sArrF7 = wef.F(zsxVar2, i8, i7, i8, false);
        short[][][] sArrI = wef.I(sArrD, sArrF3, sArrF);
        short[][][] sArrI2 = wef.I(sArrD, sArrF4, sArrF2);
        short[][][] sArrE = wef.E(sArrI);
        short[][][] sArr12 = new short[i7][][];
        while (i < i7) {
            short[][][] sArr13 = sArrF4;
            short[][] sArrK = wef.K(sArrI[i]);
            sArr12[i] = sArrK;
            short[][] sArrH = wef.H(sArrK, sArrD2);
            sArr12[i] = sArrH;
            sArr12[i] = wef.G(sArrH, sArrI2[i]);
            i++;
            sArrF4 = sArr13;
        }
        short[][][] sArr14 = sArrF4;
        short[][][] sArr15 = new short[i8][][];
        short[][][] sArr16 = new short[i8][][];
        short[][][] sArr17 = new short[i8][][];
        short[][][] sArr18 = new short[i8][][];
        short[][][] sArrE2 = wef.E(sArrF3);
        int i9 = 0;
        while (i9 < i8) {
            short[][][] sArr19 = sArr15;
            short[][] sArrK2 = wef.K(sArrF3[i9]);
            short[][][] sArr20 = sArr16;
            short[][] sArrH2 = wef.H(sArrK2, sArrD2);
            sArr19[i9] = sArrH2;
            short[][][] sArr21 = sArr12;
            sArr19[i9] = wef.G(sArrH2, sArr14[i9]);
            sArr20[i9] = wef.H(sArrK2, sArrG);
            short[][] sArrG2 = wef.G(sArr20[i9], wef.H(sArr14[i9], sArrD4));
            sArr20[i9] = sArrG2;
            sArr20[i9] = wef.G(sArrG2, sArrF5[i9]);
            short[][] sArrG3 = wef.G(wef.H(sArrF3[i9], sArrD2), sArr14[i9]);
            short[][] sArrJ = wef.J(sArrD2);
            short[][] sArrH3 = wef.H(sArrJ, sArrG3);
            sArr17[i9] = sArrH3;
            short[][] sArrG4 = wef.G(sArrH3, sArrF6[i9]);
            sArr17[i9] = sArrG4;
            int length2 = sArrG4.length;
            short[][] sArr22 = sArrD;
            if (length2 != sArrG4[0].length) {
                throw new RuntimeException("Computation to upper triangular matrix is not possible!");
            }
            short[][] sArr23 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length2, length2);
            int i10 = 0;
            while (i10 < sArrG4.length) {
                sArr23[i10][i10] = sArrG4[i10][i10];
                short[][] sArr24 = sArrG4;
                int i11 = i10 + 1;
                while (i11 < sArr24[0].length) {
                    int i12 = i11;
                    sArr23[i10][i12] = zsw.a(sArr24[i10][i12], sArr24[i12][i10]);
                    i11 = i12 + 1;
                }
                sArrG4 = sArr24;
                i10 = i11;
            }
            sArr17[i9] = sArr23;
            sArr18[i9] = wef.H(sArrJ, sArr20[i9]);
            sArr18[i9] = wef.G(sArr18[i9], wef.H(wef.J(sArr14[i9]), sArrG));
            short[][] sArrG5 = wef.G(sArr18[i9], wef.H(wef.K(sArrF6[i9]), sArrD4));
            sArr18[i9] = sArrG5;
            sArr18[i9] = wef.G(sArrG5, sArrF7[i9]);
            i9++;
            sArr16 = sArr20;
            sArr15 = sArr19;
            sArr12 = sArr21;
            sArrD = sArr22;
        }
        zta ztaVar = new zta(zszVar, bArrBd, sArrD, sArrD2, sArrD4, sArrG, sArrE, sArr12, sArrE2, sArr15, sArr16, sArr17, sArr18);
        this.p = ztaVar.p;
        this.d = ztaVar.d;
        this.e = ztaVar.e;
        this.f = ztaVar.f;
        this.g = ztaVar.g;
        this.h = ztaVar.h;
        this.i = ztaVar.i;
        this.j = ztaVar.j;
        this.k = ztaVar.k;
        this.l = ztaVar.l;
        this.m = ztaVar.m;
        this.n = ztaVar.n;
    }

    public zta(zsz zszVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, zszVar);
        this.o = null;
        this.p = null;
        this.c = (byte[]) bArr.clone();
        this.d = wef.C(sArr);
        this.e = wef.C(sArr2);
        this.f = wef.C(sArr3);
        this.g = wef.C(sArr4);
        this.h = wef.E(sArr5);
        this.i = wef.E(sArr6);
        this.j = wef.E(sArr7);
        this.k = wef.E(sArr8);
        this.l = wef.E(sArr9);
        this.m = wef.E(sArr10);
        this.n = wef.E(sArr11);
    }
}

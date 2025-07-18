package defpackage;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zsx extends SecureRandom {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private znp d;

    public zsx(byte[] bArr, znp znpVar) {
        this.a = bArr;
        this.d = znpVar;
        int length = bArr.length;
        if (length >= 48) {
            b(bArr);
            return;
        }
        int i = 48 - length;
        int iB = znpVar.b();
        znpVar.e(bArr, 0, length);
        byte[] bArrBg = new byte[iB];
        znpVar.a(bArrBg, 0);
        if (i != iB) {
            if (i < iB) {
                bArrBg = vxr.bg(bArrBg, i);
            } else {
                byte[] bArrBg2 = vxr.bg(bArrBg, iB);
                while (true) {
                    i -= iB;
                    if (i < iB) {
                        break;
                    }
                    znpVar.e(bArrBg, 0, iB);
                    bArrBg = new byte[iB];
                    znpVar.a(bArrBg, 0);
                    bArrBg2 = vxr.bf(bArrBg2, bArrBg);
                }
                if (i > 0) {
                    znpVar.e(bArrBg, 0, iB);
                    byte[] bArr2 = new byte[iB];
                    znpVar.a(bArr2, 0);
                    int length2 = bArrBg2.length;
                    bArrBg2 = vxr.bg(bArrBg2, length2 + i);
                    System.arraycopy(bArr2, 0, bArrBg2, length2, i);
                }
                bArrBg = bArrBg2;
            }
        }
        b(vxr.bf(this.a, bArrBg));
    }

    private static final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        char c;
        byte[] bArr4 = bArr2;
        try {
            byte[] bArr5 = zoc.a;
            znn.a();
            int length = bArr.length;
            byte[] bArr6 = new byte[32];
            System.arraycopy(bArr, 0, bArr6, 0, 32);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 15, 4);
            int iAR = vxr.aR(bArr6, 0);
            iArr[0][0] = iAR;
            int iAR2 = vxr.aR(bArr6, 4);
            iArr[0][1] = iAR2;
            int i2 = 8;
            int iAR3 = vxr.aR(bArr6, 8);
            iArr[0][2] = iAR3;
            int iAR4 = vxr.aR(bArr6, 12);
            char c2 = 3;
            iArr[0][3] = iAR4;
            int i3 = 16;
            int iAR5 = vxr.aR(bArr6, 16);
            iArr[1][0] = iAR5;
            int iAR6 = vxr.aR(bArr6, 20);
            iArr[1][1] = iAR6;
            int i4 = 24;
            int iAR7 = vxr.aR(bArr6, 24);
            iArr[1][2] = iAR7;
            int iAR8 = vxr.aR(bArr6, 28);
            iArr[1][3] = iAR8;
            int i5 = 2;
            int i6 = 1;
            while (true) {
                int iB = zoc.b(zoc.a(iAR8, i2)) ^ i6;
                i6 += i6;
                iAR ^= iB;
                int[] iArr2 = iArr[i5];
                iArr2[0] = iAR;
                iAR2 ^= iAR;
                iArr2[1] = iAR2;
                iAR3 ^= iAR2;
                iArr2[2] = iAR3;
                iAR4 ^= iAR3;
                iArr2[c2] = iAR4;
                c = c2;
                int i7 = i5 + 1;
                if (i7 >= 15) {
                    break;
                }
                int[][] iArr3 = iArr;
                int i8 = i4;
                int i9 = i2;
                int i10 = i3;
                iAR5 ^= zoc.b(iAR4);
                int[] iArr4 = iArr3[i7];
                iArr4[0] = iAR5;
                iAR6 ^= iAR5;
                iArr4[1] = iAR6;
                iAR7 ^= iAR6;
                iArr4[2] = iAR7;
                iAR8 ^= iAR7;
                iArr4[c] = iAR8;
                i5 += 2;
                bArr4 = bArr2;
                c2 = c;
                i2 = i9;
                i3 = i10;
                i4 = i8;
                iArr = iArr3;
            }
            byte[] bArr7 = zoc.a;
            byte[] bArrBd = vxr.bd(bArr7);
            znn.a();
            int i11 = 0;
            while (true) {
                int length2 = bArr4.length;
                if (i11 == i3) {
                    return;
                }
                int i12 = i + i11;
                if (i11 > 0) {
                    throw new zno("input buffer too short");
                }
                if (i12 > bArr3.length - 16) {
                    throw new znq();
                }
                int iAR9 = vxr.aR(bArr4, i11);
                int iAR10 = vxr.aR(bArr4, i11 + 4);
                int iAR11 = vxr.aR(bArr4, i11 + 8);
                int iAR12 = vxr.aR(bArr4, i11 + 12);
                int[] iArr5 = iArr[0];
                int i13 = iAR9 ^ iArr5[0];
                int i14 = iAR10 ^ iArr5[1];
                int iA = iAR11 ^ iArr5[2];
                int iA2 = iAR12 ^ iArr5[c];
                int i15 = 1;
                while (i15 < 13) {
                    int[] iArr6 = zoc.b;
                    int iA3 = (zoc.a(iArr6[(iA >> 16) & 255], 16) ^ (iArr6[i13 & 255] ^ zoc.a(iArr6[(i14 >> 8) & 255], i4))) ^ zoc.a(iArr6[(iA2 >> 24) & 255], 8);
                    int[] iArr7 = iArr[i15];
                    byte[] bArr8 = bArr7;
                    int i16 = iA3 ^ iArr7[0];
                    int iA4 = ((zoc.a(iArr6[(iA2 >> 16) & 255], 16) ^ (iArr6[i14 & 255] ^ zoc.a(iArr6[(iA >> 8) & 255], 24))) ^ zoc.a(iArr6[(i13 >> 24) & 255], 8)) ^ iArr7[1];
                    int[][] iArr8 = iArr;
                    int iA5 = ((zoc.a(iArr6[(i13 >> 16) & 255], 16) ^ (iArr6[iA & 255] ^ zoc.a(iArr6[(iA2 >> 8) & 255], 24))) ^ zoc.a(iArr6[(i14 >> 24) & 255], 8)) ^ iArr7[2];
                    int iA6 = (((iArr6[iA2 & 255] ^ zoc.a(iArr6[(i13 >> 8) & 255], 24)) ^ zoc.a(iArr6[(i14 >> 16) & 255], 16)) ^ zoc.a(iArr6[(iA >> 24) & 255], 8)) ^ iArr7[c];
                    int iA7 = ((iArr6[i16 & 255] ^ zoc.a(iArr6[(iA4 >> 8) & 255], 24)) ^ zoc.a(iArr6[(iA5 >> 16) & 255], 16)) ^ zoc.a(iArr6[(iA6 >> 24) & 255], 8);
                    int[] iArr9 = iArr8[i15 + 1];
                    int i17 = iA7 ^ iArr9[0];
                    int iA8 = (((iArr6[iA4 & 255] ^ zoc.a(iArr6[(iA5 >> 8) & 255], 24)) ^ zoc.a(iArr6[(iA6 >> 16) & 255], 16)) ^ zoc.a(iArr6[(i16 >> 24) & 255], 8)) ^ iArr9[1];
                    iA = (((iArr6[iA5 & 255] ^ zoc.a(iArr6[(iA6 >> 8) & 255], 24)) ^ zoc.a(iArr6[(i16 >> 16) & 255], 16)) ^ zoc.a(iArr6[(iA4 >> 24) & 255], 8)) ^ iArr9[2];
                    i15 += 2;
                    iA2 = ((zoc.a(iArr6[(iA4 >> 16) & 255], 16) ^ (iArr6[iA6 & 255] ^ zoc.a(iArr6[(i16 >> 8) & 255], 24))) ^ zoc.a(iArr6[(iA5 >> 24) & 255], 8)) ^ iArr9[c];
                    i13 = i17;
                    i14 = iA8;
                    bArr7 = bArr8;
                    iArr = iArr8;
                    i4 = 24;
                }
                byte[] bArr9 = bArr7;
                int[][] iArr10 = iArr;
                int[] iArr11 = zoc.b;
                int iA9 = ((iArr11[i13 & 255] ^ zoc.a(iArr11[(i14 >> 8) & 255], 24)) ^ zoc.a(iArr11[(iA >> 16) & 255], 16)) ^ zoc.a(iArr11[(iA2 >> 24) & 255], 8);
                int[] iArr12 = iArr10[i15];
                int i18 = iA9 ^ iArr12[0];
                int iA10 = (((iArr11[i14 & 255] ^ zoc.a(iArr11[(iA >> 8) & 255], 24)) ^ zoc.a(iArr11[(iA2 >> 16) & 255], 16)) ^ zoc.a(iArr11[(i13 >> 24) & 255], 8)) ^ iArr12[1];
                int iA11 = (((iArr11[iA & 255] ^ zoc.a(iArr11[(iA2 >> 8) & 255], 24)) ^ zoc.a(iArr11[(i13 >> 16) & 255], 16)) ^ zoc.a(iArr11[(i14 >> 24) & 255], 8)) ^ iArr12[2];
                int iA12 = (zoc.a(iArr11[(iA >> 24) & 255], 8) ^ ((zoc.a(iArr11[(i13 >> 8) & 255], 24) ^ iArr11[iA2 & 255]) ^ zoc.a(iArr11[(i14 >> 16) & 255], 16))) ^ iArr12[c];
                int i19 = (((bArr9[i18 & 255] & 255) ^ ((bArr9[(iA10 >> 8) & 255] & 255) << 8)) ^ ((bArrBd[(iA11 >> 16) & 255] & 255) << 16)) ^ (bArrBd[(iA12 >> 24) & 255] << 24);
                int[] iArr13 = iArr10[i15 + 1];
                int i20 = i19 ^ iArr13[0];
                int i21 = ((((bArrBd[iA10 & 255] & 255) ^ ((bArr9[(iA11 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(iA12 >> 16) & 255] & 255) << 16)) ^ (bArrBd[(i18 >> 24) & 255] << 24)) ^ iArr13[1];
                int i22 = ((((bArrBd[iA11 & 255] & 255) ^ ((bArr9[(iA12 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr9[(iA10 >> 24) & 255] << 24)) ^ iArr13[2];
                int i23 = ((((bArrBd[iA12 & 255] & 255) ^ ((bArrBd[(i18 >> 8) & 255] & 255) << 8)) ^ ((bArrBd[(iA10 >> 16) & 255] & 255) << 16)) ^ (bArr9[(iA11 >> 24) & 255] << 24)) ^ iArr13[c];
                vxr.aV(i20, bArr3, i12);
                vxr.aV(i21, bArr3, i12 + 4);
                vxr.aV(i22, bArr3, i12 + 8);
                vxr.aV(i23, bArr3, i12 + 12);
                i11 += 16;
                bArr4 = bArr2;
                bArr7 = bArr9;
                i3 = 16;
                i4 = 24;
                iArr = iArr10;
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: ".concat(String.valueOf(th.getMessage())), th);
        }
    }

    private final void b(byte[] bArr) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.b = bArr3;
        byte[] bArr4 = new byte[16];
        this.c = bArr4;
        c(bArr2, bArr3, bArr4);
    }

    private static final void c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i = 0; i < 3; i++) {
            int i2 = 15;
            while (true) {
                if (i2 >= 0) {
                    byte b = bArr3[i2];
                    if ((b & 255) != 255) {
                        bArr3[i2] = (byte) (b + 1);
                        break;
                    } else {
                        bArr3[i2] = 0;
                        i2--;
                    }
                }
            }
            a(bArr2, bArr3, bArr4, i * 16);
        }
        if (bArr != null) {
            for (int i3 = 0; i3 < 48; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr[i3]);
            }
        }
        int length = bArr2.length;
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        int length2 = bArr3.length;
        System.arraycopy(bArr4, 32, bArr3, 0, 16);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int i2 = 15;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                byte[] bArr3 = this.c;
                byte b = bArr3[i2];
                if ((b & 255) != 255) {
                    bArr3[i2] = (byte) (b + 1);
                    break;
                } else {
                    bArr3[i2] = 0;
                    i2--;
                }
            }
            a(this.b, this.c, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i, 16);
                i += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i, length);
                length = 0;
            }
        }
        c(null, this.b, this.c);
    }
}

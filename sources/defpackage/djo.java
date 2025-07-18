package defpackage;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djo extends SecureRandom {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private deh d;

    public djo(byte[] bArr, deh dehVar) {
        this.a = bArr;
        this.d = dehVar;
        int length = bArr.length;
        if (length >= 48) {
            b(bArr);
            return;
        }
        int i = 48 - length;
        int iB = dehVar.b();
        dehVar.e(bArr, 0, length);
        byte[] bArrS = new byte[iB];
        dehVar.a(bArrS, 0);
        if (i != iB) {
            if (i < iB) {
                bArrS = dos.s(bArrS, i);
            } else {
                byte[] bArrS2 = dos.s(bArrS, iB);
                while (true) {
                    i -= iB;
                    if (i < iB) {
                        break;
                    }
                    dehVar.e(bArrS, 0, iB);
                    bArrS = new byte[iB];
                    dehVar.a(bArrS, 0);
                    bArrS2 = dos.r(bArrS2, bArrS);
                }
                if (i > 0) {
                    dehVar.e(bArrS, 0, iB);
                    byte[] bArr2 = new byte[iB];
                    dehVar.a(bArr2, 0);
                    int length2 = bArrS2.length;
                    bArrS2 = dos.s(bArrS2, length2 + i);
                    System.arraycopy(bArr2, 0, bArrS2, length2, i);
                }
                bArrS = bArrS2;
            }
        }
        b(dos.r(this.a, bArrS));
    }

    private static final void a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        char c;
        byte[] bArr4 = bArr2;
        try {
            byte[] bArr5 = det.a;
            def.a();
            int length = bArr.length;
            byte[] bArr6 = new byte[32];
            System.arraycopy(bArr, 0, bArr6, 0, 32);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 15, 4);
            int iD = dos.d(bArr6, 0);
            iArr[0][0] = iD;
            int iD2 = dos.d(bArr6, 4);
            iArr[0][1] = iD2;
            int i2 = 8;
            int iD3 = dos.d(bArr6, 8);
            iArr[0][2] = iD3;
            int iD4 = dos.d(bArr6, 12);
            char c2 = 3;
            iArr[0][3] = iD4;
            int i3 = 16;
            int iD5 = dos.d(bArr6, 16);
            iArr[1][0] = iD5;
            int iD6 = dos.d(bArr6, 20);
            iArr[1][1] = iD6;
            int i4 = 24;
            int iD7 = dos.d(bArr6, 24);
            iArr[1][2] = iD7;
            int iD8 = dos.d(bArr6, 28);
            iArr[1][3] = iD8;
            int i5 = 2;
            int i6 = 1;
            while (true) {
                int iB = det.b(det.a(iD8, i2)) ^ i6;
                i6 += i6;
                iD ^= iB;
                int[] iArr2 = iArr[i5];
                iArr2[0] = iD;
                iD2 ^= iD;
                iArr2[1] = iD2;
                iD3 ^= iD2;
                iArr2[2] = iD3;
                iD4 ^= iD3;
                iArr2[c2] = iD4;
                c = c2;
                int i7 = i5 + 1;
                if (i7 >= 15) {
                    break;
                }
                int[][] iArr3 = iArr;
                int i8 = i4;
                int i9 = i2;
                int i10 = i3;
                iD5 ^= det.b(iD4);
                int[] iArr4 = iArr3[i7];
                iArr4[0] = iD5;
                iD6 ^= iD5;
                iArr4[1] = iD6;
                iD7 ^= iD6;
                iArr4[2] = iD7;
                iD8 ^= iD7;
                iArr4[c] = iD8;
                i5 += 2;
                bArr4 = bArr2;
                c2 = c;
                i2 = i9;
                i3 = i10;
                i4 = i8;
                iArr = iArr3;
            }
            byte[] bArr7 = det.a;
            byte[] bArrP = dos.p(bArr7);
            def.a();
            int i11 = 0;
            while (true) {
                int length2 = bArr4.length;
                if (i11 == i3) {
                    return;
                }
                int i12 = i + i11;
                if (i11 > 0) {
                    throw new deg("input buffer too short");
                }
                if (i12 > bArr3.length - 16) {
                    throw new dei();
                }
                int iD9 = dos.d(bArr4, i11);
                int iD10 = dos.d(bArr4, i11 + 4);
                int iD11 = dos.d(bArr4, i11 + 8);
                int iD12 = dos.d(bArr4, i11 + 12);
                int[] iArr5 = iArr[0];
                int i13 = iD9 ^ iArr5[0];
                int i14 = iD10 ^ iArr5[1];
                int iA = iD11 ^ iArr5[2];
                int iA2 = iD12 ^ iArr5[c];
                int i15 = 1;
                while (i15 < 13) {
                    int[] iArr6 = det.b;
                    int iA3 = (det.a(iArr6[(iA >> 16) & 255], 16) ^ (iArr6[i13 & 255] ^ det.a(iArr6[(i14 >> 8) & 255], i4))) ^ det.a(iArr6[(iA2 >> 24) & 255], 8);
                    int[] iArr7 = iArr[i15];
                    byte[] bArr8 = bArr7;
                    int i16 = iA3 ^ iArr7[0];
                    int iA4 = ((det.a(iArr6[(iA2 >> 16) & 255], 16) ^ (iArr6[i14 & 255] ^ det.a(iArr6[(iA >> 8) & 255], 24))) ^ det.a(iArr6[(i13 >> 24) & 255], 8)) ^ iArr7[1];
                    int[][] iArr8 = iArr;
                    int iA5 = ((det.a(iArr6[(i13 >> 16) & 255], 16) ^ (iArr6[iA & 255] ^ det.a(iArr6[(iA2 >> 8) & 255], 24))) ^ det.a(iArr6[(i14 >> 24) & 255], 8)) ^ iArr7[2];
                    int iA6 = (((iArr6[iA2 & 255] ^ det.a(iArr6[(i13 >> 8) & 255], 24)) ^ det.a(iArr6[(i14 >> 16) & 255], 16)) ^ det.a(iArr6[(iA >> 24) & 255], 8)) ^ iArr7[c];
                    int iA7 = ((iArr6[i16 & 255] ^ det.a(iArr6[(iA4 >> 8) & 255], 24)) ^ det.a(iArr6[(iA5 >> 16) & 255], 16)) ^ det.a(iArr6[(iA6 >> 24) & 255], 8);
                    int[] iArr9 = iArr8[i15 + 1];
                    int i17 = iA7 ^ iArr9[0];
                    int iA8 = (((iArr6[iA4 & 255] ^ det.a(iArr6[(iA5 >> 8) & 255], 24)) ^ det.a(iArr6[(iA6 >> 16) & 255], 16)) ^ det.a(iArr6[(i16 >> 24) & 255], 8)) ^ iArr9[1];
                    iA = (((iArr6[iA5 & 255] ^ det.a(iArr6[(iA6 >> 8) & 255], 24)) ^ det.a(iArr6[(i16 >> 16) & 255], 16)) ^ det.a(iArr6[(iA4 >> 24) & 255], 8)) ^ iArr9[2];
                    i15 += 2;
                    iA2 = ((det.a(iArr6[(iA4 >> 16) & 255], 16) ^ (iArr6[iA6 & 255] ^ det.a(iArr6[(i16 >> 8) & 255], 24))) ^ det.a(iArr6[(iA5 >> 24) & 255], 8)) ^ iArr9[c];
                    i13 = i17;
                    i14 = iA8;
                    bArr7 = bArr8;
                    iArr = iArr8;
                    i4 = 24;
                }
                byte[] bArr9 = bArr7;
                int[][] iArr10 = iArr;
                int[] iArr11 = det.b;
                int iA9 = ((iArr11[i13 & 255] ^ det.a(iArr11[(i14 >> 8) & 255], 24)) ^ det.a(iArr11[(iA >> 16) & 255], 16)) ^ det.a(iArr11[(iA2 >> 24) & 255], 8);
                int[] iArr12 = iArr10[i15];
                int i18 = iA9 ^ iArr12[0];
                int iA10 = (((iArr11[i14 & 255] ^ det.a(iArr11[(iA >> 8) & 255], 24)) ^ det.a(iArr11[(iA2 >> 16) & 255], 16)) ^ det.a(iArr11[(i13 >> 24) & 255], 8)) ^ iArr12[1];
                int iA11 = (((iArr11[iA & 255] ^ det.a(iArr11[(iA2 >> 8) & 255], 24)) ^ det.a(iArr11[(i13 >> 16) & 255], 16)) ^ det.a(iArr11[(i14 >> 24) & 255], 8)) ^ iArr12[2];
                int iA12 = (det.a(iArr11[(iA >> 24) & 255], 8) ^ ((det.a(iArr11[(i13 >> 8) & 255], 24) ^ iArr11[iA2 & 255]) ^ det.a(iArr11[(i14 >> 16) & 255], 16))) ^ iArr12[c];
                int i19 = (((bArr9[i18 & 255] & 255) ^ ((bArr9[(iA10 >> 8) & 255] & 255) << 8)) ^ ((bArrP[(iA11 >> 16) & 255] & 255) << 16)) ^ (bArrP[(iA12 >> 24) & 255] << 24);
                int[] iArr13 = iArr10[i15 + 1];
                int i20 = i19 ^ iArr13[0];
                int i21 = ((((bArrP[iA10 & 255] & 255) ^ ((bArr9[(iA11 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(iA12 >> 16) & 255] & 255) << 16)) ^ (bArrP[(i18 >> 24) & 255] << 24)) ^ iArr13[1];
                int i22 = ((((bArrP[iA11 & 255] & 255) ^ ((bArr9[(iA12 >> 8) & 255] & 255) << 8)) ^ ((bArr9[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr9[(iA10 >> 24) & 255] << 24)) ^ iArr13[2];
                int i23 = ((((bArrP[iA12 & 255] & 255) ^ ((bArrP[(i18 >> 8) & 255] & 255) << 8)) ^ ((bArrP[(iA10 >> 16) & 255] & 255) << 16)) ^ (bArr9[(iA11 >> 24) & 255] << 24)) ^ iArr13[c];
                dos.h(i20, bArr3, i12);
                dos.h(i21, bArr3, i12 + 4);
                dos.h(i22, bArr3, i12 + 8);
                dos.h(i23, bArr3, i12 + 12);
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

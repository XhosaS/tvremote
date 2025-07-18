package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btu {
    private final boolean a;
    private final int b;
    private final btt[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final int h;

    public btu() {
        this(0, 3);
    }

    public final float a(float f) {
        float f2;
        float[] fArr;
        int i;
        float fSqrt;
        float f3;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            bty.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float[] fArr2 = this.e;
        float[] fArr3 = this.f;
        int i2 = this.d;
        btt[] bttVarArr = this.c;
        btt bttVar = bttVarArr[i2];
        if (bttVar == null) {
            f2 = 0.0f;
        } else {
            btt bttVar2 = bttVar;
            int i3 = 0;
            while (true) {
                btt bttVar3 = bttVarArr[i2];
                if (bttVar3 == null) {
                    f2 = f4;
                    fArr = fArr2;
                    i = 0;
                    break;
                }
                long j = bttVar.a;
                f2 = f4;
                fArr = fArr2;
                long j2 = bttVar3.a;
                long j3 = j - j2;
                i = 0;
                float fAbs = Math.abs(j2 - bttVar2.a);
                bttVar2 = (this.h == 1 || this.a) ? bttVar3 : bttVar;
                float f5 = j3;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = bttVar3.b;
                fArr3[i3] = -f5;
                if (i2 == 0) {
                    i2 = 20;
                }
                i2--;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
                fArr2 = fArr;
            }
            if (i3 >= this.b) {
                int i4 = this.h;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    try {
                        float[] fArr4 = this.g;
                        int i6 = i3 <= 2 ? 1 : 2;
                        int i7 = i6 + 1;
                        float[][] fArr5 = new float[i7][];
                        for (int i8 = i; i8 < i7; i8++) {
                            fArr5[i8] = new float[i3];
                        }
                        int i9 = i;
                        while (true) {
                            f3 = 1.0f;
                            if (i9 >= i3) {
                                break;
                            }
                            fArr5[i][i9] = 1.0f;
                            for (int i10 = 1; i10 < i7; i10++) {
                                fArr5[i10][i9] = fArr5[i10 - 1][i9] * fArr3[i9];
                            }
                            i9++;
                        }
                        float[][] fArr6 = new float[i7][];
                        for (int i11 = i; i11 < i7; i11++) {
                            fArr6[i11] = new float[i3];
                        }
                        float[][] fArr7 = new float[i7][];
                        for (int i12 = i; i12 < i7; i12++) {
                            fArr7[i12] = new float[i7];
                        }
                        int i13 = i;
                        while (i13 < i7) {
                            float[] fArr8 = fArr6[i13];
                            yfm.bg(fArr5[i13], fArr8, i3);
                            int i14 = i;
                            while (i14 < i13) {
                                float[] fArr9 = fArr6[i14];
                                float fE = bty.e(fArr8, fArr9);
                                float f6 = f3;
                                for (int i15 = i; i15 < i3; i15++) {
                                    fArr8[i15] = fArr8[i15] - (fArr9[i15] * fE);
                                }
                                i14++;
                                f3 = f6;
                            }
                            float f7 = f3;
                            float fSqrt2 = (float) Math.sqrt(bty.e(fArr8, fArr8));
                            if (fSqrt2 < 1.0E-6f) {
                                fSqrt2 = 1.0E-6f;
                            }
                            float f8 = f7 / fSqrt2;
                            for (int i16 = i; i16 < i3; i16++) {
                                fArr8[i16] = fArr8[i16] * f8;
                            }
                            float[] fArr10 = fArr7[i13];
                            int i17 = i;
                            while (i17 < i7) {
                                fArr10[i17] = i17 < i13 ? f2 : bty.e(fArr8, fArr5[i17]);
                                i17++;
                            }
                            i13++;
                            f3 = f7;
                        }
                        int i18 = i6;
                        while (i18 >= 0) {
                            float[] fArr11 = fArr;
                            float fE2 = bty.e(fArr6[i18], fArr11);
                            float[] fArr12 = fArr7[i18];
                            int i19 = i18 + 1;
                            if (i19 <= i6) {
                                int i20 = i6;
                                while (true) {
                                    fE2 -= fArr12[i20] * fArr4[i20];
                                    if (i20 != i19) {
                                        i20--;
                                    }
                                }
                            }
                            fArr4[i18] = fE2 / fArr12[i18];
                            i18--;
                            fArr = fArr11;
                        }
                        fSqrt = fArr4[1];
                    } catch (IllegalArgumentException unused) {
                        fSqrt = f2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new yfu();
                    }
                    boolean z = this.a;
                    int i21 = i3 - 1;
                    float f9 = fArr3[i21];
                    int i22 = i21;
                    float fSqrt3 = f2;
                    while (i22 > 0) {
                        int i23 = i22 - 1;
                        float f10 = fArr3[i23];
                        if (f9 != f10) {
                            float f11 = z ? -fArr[i23] : fArr[i22] - fArr[i23];
                            float fSignum = Math.signum(fSqrt3);
                            float fAbs2 = Math.abs(fSqrt3);
                            float f12 = f11 / (f9 - f10);
                            fSqrt3 += (f12 - (fSignum * ((float) Math.sqrt(fAbs2 + fAbs2)))) * Math.abs(f12);
                            if (i22 == i21) {
                                fSqrt3 *= 0.5f;
                            }
                        }
                        i22 = i23;
                        f9 = f10;
                    }
                    float fSignum2 = Math.signum(fSqrt3);
                    float fAbs3 = Math.abs(fSqrt3);
                    fSqrt = fSignum2 * ((float) Math.sqrt(fAbs3 + fAbs3));
                }
                f4 = fSqrt * 1000.0f;
            } else {
                f4 = f2;
            }
        }
        return (f4 == f2 || Float.isNaN(f4)) ? f2 : f4 > f2 ? ykn.h(f4, f) : ykn.g(f4, -f);
    }

    public final void b(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        btt[] bttVarArr = this.c;
        btt bttVar = bttVarArr[i];
        if (bttVar == null) {
            bttVarArr[i] = new btt(j, f);
        } else {
            bttVar.a = j;
            bttVar.b = f;
        }
    }

    public final void c() {
        btt[] bttVarArr = this.c;
        yfm.aD(bttVarArr, null, 0, bttVarArr.length);
        this.d = 0;
    }

    public btu(byte[] bArr) {
        this(true, 2);
    }

    public btu(boolean z, int i) {
        int i2;
        this.a = z;
        this.h = i;
        if (z) {
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
            }
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            i2 = 3;
        } else {
            if (i3 != 1) {
                throw new yfu();
            }
            i2 = 2;
        }
        this.b = i2;
        this.c = new btt[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public /* synthetic */ btu(int i, int i2) {
        this(false, i | (((i2 & 2) != 0 ? 0 : 1) ^ 1));
    }
}

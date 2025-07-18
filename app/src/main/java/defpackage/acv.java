package defpackage;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acv {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(acu[] acuVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        acu acuVar;
        int i3;
        char c;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        acu acuVar2;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        acu[] acuVarArr2 = acuVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = acuVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            acu acuVar3 = acuVarArr2[i6];
            char c3 = acuVar3.a;
            float[] fArr3 = acuVar3.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i7 = i5;
            float f20 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i8;
                    acuVar = acuVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i3 = i6;
                    c = c3;
                    int i9 = i2 + 6;
                    int i10 = i2 + 5;
                    int i11 = i2 + 4;
                    float f27 = fArr[i10];
                    float f28 = fArr[i9];
                    float f29 = fArr[i2];
                    float f30 = fArr[i2 + 1];
                    float f31 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        i4 = i11;
                        f = f30;
                        z = 1;
                    } else {
                        i4 = i11;
                        f = f30;
                        z = i7;
                    }
                    acu.a(path, f25, f26, f27, f28, f29, f, f31, z, fArr[i4] != 0.0f ? 1 : i7);
                    f17 = fArr[i10];
                    f2 = fArr[i9];
                    f18 = f2;
                    f3 = f17;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    acuVar = acuVar3;
                    c = c3;
                    int i12 = i2 + 5;
                    int i13 = i2 + 4;
                    int i14 = i2 + 3;
                    int i15 = i2 + 2;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i15], fArr[i14], fArr[i13], fArr[i12]);
                    float f32 = fArr[i13];
                    float f33 = fArr[i12];
                    f17 = fArr[i15];
                    f18 = fArr[i14];
                    f2 = f33;
                    f3 = f32;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i8;
                    acuVar = acuVar3;
                    c = c3;
                    f2 = f24;
                    i3 = i6;
                    path2.lineTo(fArr[i2], f2);
                    f3 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    acuVar = acuVar3;
                    c = c3;
                    int i16 = i2 + 3;
                    int i17 = i2 + 2;
                    int i18 = i2 + 1;
                    path2.quadTo(fArr[i2], fArr[i18], fArr[i17], fArr[i16]);
                    float f34 = fArr[i2];
                    float f35 = fArr[i18];
                    f3 = fArr[i17];
                    f18 = f35;
                    f2 = fArr[i16];
                    f17 = f34;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    acuVar = acuVar3;
                    f3 = f23;
                    c = c3;
                    path2.lineTo(f3, fArr[i2]);
                    f2 = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i8;
                        int i19 = i2 + 5;
                        int i20 = i2 + 4;
                        int i21 = i2 + 3;
                        int i22 = i2 + 2;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i21], fArr[i20], fArr[i19]);
                        float f36 = fArr[i22] + f23;
                        float f37 = fArr[i21] + f24;
                        f23 += fArr[i20];
                        f24 += fArr[i19];
                        f17 = f36;
                        f18 = f37;
                    } else if (c3 == 'h') {
                        fArr = fArr3;
                        i2 = i8;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f23 += fArr[i2];
                    } else if (c3 != 'q') {
                        if (c3 != 'v') {
                            if (c3 != 'L') {
                                if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    f9 = fArr[i2];
                                    f10 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f9, f10);
                                    } else {
                                        path2.moveTo(f9, f10);
                                        f21 = f9;
                                        f2 = f10;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                        f3 = f21;
                                    }
                                } else if (c3 == 'S') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.cubicTo(f23, f24, fArr[i2], fArr[i25], fArr[i24], fArr[i23]);
                                    f17 = fArr[i2];
                                    f18 = fArr[i25];
                                    f3 = fArr[i24];
                                    i3 = i6;
                                    c = c3;
                                    f2 = fArr[i23];
                                } else if (c3 == 'T') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i26 = i2 + 1;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f24 = (f24 + f24) - f18;
                                        f23 = (f23 + f23) - f17;
                                    }
                                    path2.quadTo(f23, f24, fArr[i2], fArr[i26]);
                                    float f38 = fArr[i2];
                                    f2 = fArr[i26];
                                    f17 = f23;
                                    f18 = f24;
                                    f3 = f38;
                                    i3 = i6;
                                    acuVar = acuVar3;
                                    c = c3;
                                } else if (c3 == 'l') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i27 = i2 + 1;
                                    path2.rLineTo(fArr[i2], fArr[i27]);
                                    f23 += fArr[i2];
                                    f8 = fArr[i27];
                                } else if (c3 == 'm') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    float f39 = fArr[i2];
                                    f23 += f39;
                                    float f40 = fArr[i2 + 1];
                                    f24 += f40;
                                    if (i2 > 0) {
                                        path2.rLineTo(f39, f40);
                                    } else {
                                        path2.rMoveTo(f39, f40);
                                        acuVar = acuVar3;
                                        f3 = f23;
                                        f21 = f3;
                                        f2 = f24;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 == 't') {
                                        int i28 = i8 + 1;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f13 = f24 - f18;
                                            f14 = f23 - f17;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        path2.rQuadTo(f14, f13, fArr3[i8], fArr3[i28]);
                                        float f41 = f14 + f23;
                                        float f42 = f13 + f24;
                                        f23 += fArr3[i8];
                                        f24 += fArr3[i28];
                                        f18 = f42;
                                        f17 = f41;
                                    }
                                    fArr = fArr3;
                                    i2 = i8;
                                    acuVar = acuVar3;
                                    f3 = f23;
                                    f2 = f24;
                                    i3 = i6;
                                    c = c3;
                                } else {
                                    int i29 = i8 + 3;
                                    int i30 = i8 + 2;
                                    int i31 = i8 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i32 = i8;
                                    fArr = fArr3;
                                    i2 = i32;
                                    path2.rCubicTo(f12, f11, fArr3[i32], fArr3[i31], fArr3[i30], fArr3[i29]);
                                    float f43 = fArr[i2] + f23;
                                    float f44 = fArr[i31] + f24;
                                    f23 += fArr[i30];
                                    f24 += fArr[i29];
                                    f17 = f43;
                                    f18 = f44;
                                }
                                acuVar = acuVar3;
                            } else {
                                fArr = fArr3;
                                i2 = i8;
                                int i33 = i2 + 1;
                                path2.lineTo(fArr[i2], fArr[i33]);
                                f9 = fArr[i2];
                                f10 = fArr[i33];
                            }
                            f2 = f10;
                            i3 = i6;
                            c = c3;
                            f3 = f9;
                            acuVar = acuVar3;
                        } else {
                            fArr = fArr3;
                            i2 = i8;
                            path2.rLineTo(0.0f, fArr[i2]);
                            f8 = fArr[i2];
                        }
                        f24 += f8;
                    } else {
                        fArr = fArr3;
                        i2 = i8;
                        int i34 = i2 + 3;
                        int i35 = i2 + 2;
                        int i36 = i2 + 1;
                        path2.rQuadTo(fArr[i2], fArr[i36], fArr[i35], fArr[i34]);
                        float f45 = fArr[i2] + f23;
                        float f46 = fArr[i36] + f24;
                        f23 += fArr[i35];
                        f24 += fArr[i34];
                        f18 = f46;
                        f17 = f45;
                    }
                    acuVar = acuVar3;
                    f3 = f23;
                    f2 = f24;
                    i3 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i8;
                    int i37 = i2 + 6;
                    int i38 = i2 + 5;
                    int i39 = i2 + 4;
                    float f47 = fArr[i38] + f23;
                    float f48 = fArr[i37] + f24;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        acuVar2 = acuVar3;
                        z2 = 1;
                    } else {
                        acuVar2 = acuVar3;
                        z2 = i7;
                    }
                    if (fArr[i39] != 0.0f) {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = 1;
                    } else {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = i7;
                    }
                    acuVar = acuVar2;
                    acu.a(path, f7, f5, f47, f48, f49, f4, f6, z2, z3);
                    f3 = f7 + fArr[i38];
                    f2 = f5 + fArr[i37];
                    f17 = f3;
                    f18 = f2;
                }
                i8 = i2 + i;
                path2 = path;
                acuVar3 = acuVar;
                c3 = c;
                i6 = i3;
                f23 = f3;
                f24 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c2 = acuVar3.a;
            i6++;
            acuVarArr2 = acuVarArr;
            path2 = path;
            i5 = i7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1 A[Catch: NumberFormatException -> 0x00d4, LOOP:3: B:32:0x0084->B:51:0x00b1, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.acu[] b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.b(java.lang.String):acu[]");
    }

    public static acu[] c(acu[] acuVarArr) {
        acu[] acuVarArr2 = new acu[acuVarArr.length];
        for (int i = 0; i < acuVarArr.length; i++) {
            acuVarArr2[i] = new acu(acuVarArr[i]);
        }
        return acuVarArr2;
    }

    static float[] d(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    private static void e(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new acu(c, fArr));
    }
}

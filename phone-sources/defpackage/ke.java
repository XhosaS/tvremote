package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ke {
    public long[] a = kj.a;
    public Object[] b = ku.c;
    public long[] c = kn.a;
    public int d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int f;
    public int g;
    private int h;

    public ke(int i) {
        k(kj.d(i));
    }

    private final int i(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void j() {
        this.h = kj.a(this.f) - this.g;
    }

    private final void k(int i) {
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3 = 0;
        int iMax = i > 0 ? Math.max(7, kj.c(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = kj.a;
            i2 = 0;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
            i2 = iMax;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((7 & i2) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        j();
        if (iMax == 0) {
            objArr = ku.c;
        } else {
            i3 = iMax;
            objArr = new Object[iMax];
        }
        this.b = objArr;
        if (i3 == 0) {
            jArr2 = kn.a;
        } else {
            jArr2 = new long[i3];
            yfm.bo(jArr2, 4611686018427387903L, jArr2.length);
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.f
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r5 & 7
            int r10 = r5 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r3
            r10 = 0
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4e:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6e
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.b
            r14 = r14[r9]
            boolean r14 = defpackage.yks.e(r14, r1)
            if (r14 == 0) goto L69
            if (r9 < 0) goto L7e
            return r13
        L69:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4e
        L6e:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L7e
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.a(java.lang.Object):boolean");
    }

    public final boolean b() {
        return this.g == 0;
    }

    public final int c(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = this.f;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr3[i10] >>> i11;
            long j5 = jArr3[i10 + 1] << (64 - i11);
            int i12 = i5;
            int i13 = 0;
            long j6 = i5 & 127;
            long j7 = (j5 & ((-i11) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i14 = i4;
                if (yks.e(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i14;
            }
            int i15 = i4;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int i16 = i(i6);
                if (this.h != 0 || ((this.a[i16 >> 3] >> ((i16 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i17 = this.f;
                    j3 = 128;
                    if (i17 <= 8 || a.l(this.g * 32, i17 * 25) > 0) {
                        j = j6;
                        i2 = i6;
                        j2 = 255;
                        i = 0;
                        int iB = kj.b(this.f);
                        long[] jArr4 = this.a;
                        Object[] objArr = this.b;
                        long[] jArr5 = this.c;
                        int i18 = this.f;
                        int[] iArr = new int[i18];
                        k(iB);
                        long[] jArr6 = this.a;
                        Object[] objArr2 = this.b;
                        long[] jArr7 = this.c;
                        int i19 = this.f;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr4[i20 >> 3] >> ((i20 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr[i20];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i15;
                                int i21 = i((iHashCode2 ^ (iHashCode2 << 16)) >>> 7);
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                jArr = jArr6;
                                jArr2 = jArr4;
                                long j10 = (jArr6[i22] & (~(255 << i23))) | ((r12 & 127) << i23);
                                jArr[i22] = j10;
                                jArr[(((i21 - 7) & i19) + (i19 & 7)) >> 3] = j10;
                                objArr2[i21] = obj2;
                                jArr7[i21] = jArr5[i20];
                                iArr[i20] = i21;
                            } else {
                                jArr = jArr6;
                                jArr2 = jArr4;
                            }
                            i20++;
                            jArr4 = jArr2;
                            jArr6 = jArr;
                        }
                        long[] jArr8 = this.c;
                        int length = jArr8.length;
                        for (int i24 = 0; i24 < length; i24++) {
                            long j11 = jArr8[i24];
                            jArr8[i24] = (((j11 & (-4611686018427387904L)) | (((int) ((j11 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r7])) << 31) | (((int) (j11 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r9]);
                        }
                        int i25 = this.d;
                        if (i25 != Integer.MAX_VALUE) {
                            this.d = iArr[i25];
                        }
                        int i26 = this.e;
                        if (i26 != Integer.MAX_VALUE) {
                            this.e = iArr[i26];
                        }
                    } else {
                        long[] jArr9 = this.a;
                        if (jArr9 == null) {
                            j = j6;
                            i3 = i6;
                            j2 = 255;
                            i = 0;
                            i16 = i(i3);
                        } else {
                            int i27 = this.f;
                            Object[] objArr3 = this.b;
                            long[] jArr10 = this.c;
                            long[] jArr11 = new long[i27];
                            j2 = 255;
                            yfm.bo(jArr11, 9223372034707292159L, i27);
                            int i28 = (i27 + 7) >> 3;
                            int i29 = 0;
                            while (i29 < i28) {
                                int i30 = i13;
                                long j12 = jArr9[i29] & (-9187201950435737472L);
                                jArr9[i29] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                                i29++;
                                i6 = i6;
                                i13 = i30;
                            }
                            int i31 = i6;
                            i = i13;
                            int iAL = yfm.aL(jArr9);
                            int i32 = iAL - 1;
                            jArr9[i32] = (jArr9[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr9[iAL] = jArr9[i];
                            int i33 = i;
                            while (i33 != i27) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j13 = (jArr9[i34] >> i35) & 255;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj3 = objArr3[i33];
                                    int iHashCode3 = (obj3 != null ? obj3.hashCode() : i) * i15;
                                    int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i37 = i36 & 127;
                                    int i38 = i36 >>> 7;
                                    int i39 = i(i38);
                                    int i40 = i38 & i27;
                                    long j14 = j6;
                                    long j15 = i37;
                                    if (((i39 - i40) & i27) / 8 == ((i33 - i40) & i27) / 8) {
                                        int i41 = i33 + 1;
                                        jArr9[i34] = (j15 << i35) | (jArr9[i34] & (~(255 << i35)));
                                        if (jArr11[i33] == 9223372034707292159L) {
                                            long j16 = i33;
                                            jArr11[i33] = j16 | (j16 << 32);
                                        }
                                        jArr9[jArr9.length - 1] = jArr9[i];
                                        i33 = i41;
                                    } else {
                                        long j17 = i33;
                                        int i42 = i31;
                                        long j18 = i39;
                                        int i43 = i39 >> 3;
                                        long j19 = jArr9[i43];
                                        int i44 = (i39 & 7) << 3;
                                        long j20 = j15 << i44;
                                        long j21 = j19 & (~(255 << i44));
                                        if (((j19 >> i44) & 255) == 128) {
                                            long j22 = j17 << 32;
                                            long j23 = ~(255 << i35);
                                            jArr9[i43] = j21 | j20;
                                            jArr9[i34] = (jArr9[i34] & j23) | (128 << i35);
                                            objArr3[i39] = objArr3[i33];
                                            objArr3[i33] = null;
                                            jArr10[i39] = jArr10[i33];
                                            jArr10[i33] = 4611686018427387903L;
                                            int i45 = (int) ((jArr11[i33] >> 32) & 4294967295L);
                                            if (i45 != Integer.MAX_VALUE) {
                                                jArr11[i45] = (jArr11[i45] & (-4294967296L)) | j18;
                                                jArr11[i33] = (jArr11[i33] & 4294967295L) | (-4294967296L);
                                            } else {
                                                jArr11[i33] = 9223372032559808512L | j18;
                                            }
                                            jArr11[i39] = j22 | 2147483647L;
                                        } else {
                                            long j24 = j18 << 32;
                                            jArr9[i43] = j21 | j20;
                                            Object obj4 = objArr3[i39];
                                            objArr3[i39] = objArr3[i33];
                                            objArr3[i33] = obj4;
                                            long j25 = jArr10[i39];
                                            jArr10[i39] = jArr10[i33];
                                            jArr10[i33] = j25;
                                            int i46 = (int) ((jArr11[i33] >> 32) & 4294967295L);
                                            if (i46 != Integer.MAX_VALUE) {
                                                jArr11[i46] = (jArr11[i46] & (-4294967296L)) | j18;
                                                jArr11[i33] = j24 | (jArr11[i33] & 4294967295L);
                                            } else {
                                                jArr11[i33] = j24 | j18;
                                                i46 = i33;
                                            }
                                            jArr11[i39] = (i46 << 32) | j17;
                                            i33--;
                                        }
                                        jArr9[jArr9.length - 1] = jArr9[i];
                                        i33++;
                                        i31 = i42;
                                    }
                                    j6 = j14;
                                } else {
                                    i33++;
                                }
                            }
                            j = j6;
                            i2 = i31;
                            j();
                            long[] jArr12 = this.c;
                            int length2 = jArr12.length;
                            for (int i47 = i; i47 < length2; i47++) {
                                long j26 = jArr12[i47];
                                jArr12[i47] = (((j26 & (-4611686018427387904L)) | (((int) ((j26 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr11[r6] & 4294967295L))) << 31) | (((int) (j26 & 2147483647L)) == Integer.MAX_VALUE ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) (jArr11[r8] & 4294967295L));
                            }
                            int i48 = this.d;
                            if (i48 != Integer.MAX_VALUE) {
                                this.d = (int) (jArr11[i48] & 4294967295L);
                            }
                            int i49 = this.e;
                            if (i49 != Integer.MAX_VALUE) {
                                this.e = (int) (jArr11[i49] & 4294967295L);
                            }
                        }
                    }
                    i3 = i2;
                    i16 = i(i3);
                }
                this.g++;
                int i50 = this.h;
                long[] jArr13 = this.a;
                int i51 = i16 >> 3;
                long j27 = jArr13[i51];
                int i52 = (i16 & 7) << 3;
                this.h = i50 - (((j27 >> i52) & j2) != j3 ? i : 1);
                int i53 = this.f;
                long j28 = (j27 & (~(j2 << i52))) | (j << i52);
                jArr13[i51] = j28;
                jArr13[(((i16 - 7) & i53) + (i53 & 7)) >> 3] = j28;
                return i16;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i12;
            i4 = i15;
        }
    }

    public final void d() {
        this.g = 0;
        if (this.a != kj.a) {
            long[] jArr = this.a;
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        yfm.aD(this.b, null, 0, this.f);
        long[] jArr3 = this.c;
        yfm.bo(jArr3, 4611686018427387903L, jArr3.length);
        this.d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        j();
    }

    public final void e(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.f;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | i6;
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (i5 << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        if (keVar.g != this.g) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128 && !keVar.a(objArr[(i << 3) + i3])) {
                                return false;
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean f(Object obj) {
        int i = this.g;
        int iC = c(obj);
        this.b[iC] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iC] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & iC) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = iC;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iC;
        }
        return this.g != i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.f
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r5
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r5 = r5 & r4
            r6 = 0
        L19:
            r7 = r3 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r5 & 7
            int r10 = r5 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r3
            long r2 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r11
            long r2 = r2 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r2
            long r2 = ~r2
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
        L4d:
            r14 = 0
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 == 0) goto L6b
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r9 = r9 + r5
            r9 = r9 & r4
            java.lang.Object[] r14 = r0.b
            r14 = r14[r9]
            boolean r14 = defpackage.yks.e(r14, r1)
            if (r14 == 0) goto L66
            goto L75
        L66:
            r14 = -1
            long r14 = r14 + r2
            long r2 = r2 & r14
            goto L4d
        L6b:
            long r2 = ~r7
            r9 = 6
            long r2 = r2 << r9
            long r2 = r2 & r7
            long r2 = r2 & r11
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L80
            r9 = -1
        L75:
            if (r9 < 0) goto L79
            r2 = r13
            goto L7a
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L7f
            r0.e(r9)
        L7f:
            return r2
        L80:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.g(java.lang.Object):boolean");
    }

    public final boolean h(Collection collection) {
        int i;
        collection.getClass();
        Object[] objArr = this.b;
        int i2 = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!yfm.as(collection, objArr[i6])) {
                                e(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.g;
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = (~(i2 - length)) >>> 31;
                    int i4 = 0;
                    while (true) {
                        i = 8 - i3;
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!yks.e(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        kb kbVar = new kb(this, 2);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) kbVar.a(obj));
            i2++;
            i = (int) (j & 2147483647L);
        }
        return sb.toString();
    }

    public ke() {
    }
}

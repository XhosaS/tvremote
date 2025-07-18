package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kk {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    private int e;

    public kk(int i) {
        this.a = kj.a;
        this.b = ku.c;
        p(kj.d(i));
    }

    private final int m(Object obj) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = this.c;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr3[i9] >>> i10;
            int i11 = 1;
            long j5 = jArr3[i9 + 1] << (64 - i10);
            int i12 = i4;
            int i13 = 0;
            long j6 = i4 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                int i14 = i3;
                if (yks.e(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i14;
            }
            int i15 = i3;
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            int i16 = 8;
            if (j10 != 0) {
                int iN = n(i5);
                long j11 = 255;
                if (this.e != 0 || ((this.a[iN >> 3] >> ((iN & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i17 = this.c;
                    if (i17 > 8) {
                        j3 = 128;
                        if (a.l(this.d * 32, i17 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i18 = this.c;
                            Object[] objArr = this.b;
                            int i19 = i18 + 7;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                long j12 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i20++;
                                i16 = i16;
                                j11 = j11;
                            }
                            int i21 = i16;
                            j2 = j11;
                            int iAL = yfm.aL(jArr4);
                            int i22 = iAL - 1;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iAL] = jArr4[0];
                            int i23 = 0;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j13 = (jArr4[i24] >> i25) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr[i23];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i13) * i15;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 & 127;
                                    int i28 = i26 >>> 7;
                                    int iN2 = n(i28);
                                    int i29 = i28 & i18;
                                    int i30 = i13;
                                    int i31 = ((iN2 - i29) & i18) / 8;
                                    int i32 = ((i23 - i29) & i18) / i21;
                                    int i33 = i21;
                                    int i34 = i11;
                                    long j14 = i27;
                                    if (i31 == i32) {
                                        jArr4[i24] = ((~(j2 << i25)) & jArr4[i24]) | (j14 << i25);
                                        jArr4[yfm.aL(jArr4)] = (jArr4[i30] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i11 = i34;
                                        i13 = i30;
                                        i21 = i33;
                                    } else {
                                        int i35 = iN2 >> 3;
                                        long j15 = jArr4[i35];
                                        int i36 = (iN2 & 7) << 3;
                                        long j16 = j14 << i36;
                                        long j17 = j6;
                                        long[] jArr5 = jArr4;
                                        long j18 = j15 & (~(j2 << i36));
                                        if (((j15 >> i36) & j2) == 128) {
                                            long j19 = ~(j2 << i25);
                                            jArr5[i35] = j18 | j16;
                                            jArr5[i24] = (j19 & jArr5[i24]) | (128 << i25);
                                            objArr[iN2] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            jArr5[i35] = j18 | j16;
                                            Object obj3 = objArr[iN2];
                                            objArr[iN2] = objArr[i23];
                                            objArr[i23] = obj3;
                                            i23--;
                                        }
                                        jArr5[yfm.aL(jArr5)] = (jArr5[i30] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        jArr4 = jArr5;
                                        i11 = i34;
                                        i13 = i30;
                                        i21 = i33;
                                        j6 = j17;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            j = j6;
                            i = i13;
                            i2 = i11;
                            o();
                        }
                        iN = n(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int iB = kj.b(this.c);
                    long[] jArr6 = this.a;
                    Object[] objArr2 = this.b;
                    int i37 = this.c;
                    p(iB);
                    long[] jArr7 = this.a;
                    Object[] objArr3 = this.b;
                    int i38 = this.c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr6[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr2[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i15;
                            int iN3 = n((iHashCode3 ^ (iHashCode3 << 16)) >>> 7);
                            int i40 = iN3 >> 3;
                            int i41 = (iN3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = ((~(255 << i41)) & jArr7[i40]) | ((r10 & 127) << i41);
                            jArr[i40] = j20;
                            jArr[(((iN3 - 7) & i38) + (i38 & 7)) >> 3] = j20;
                            objArr3[iN3] = obj4;
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i39++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    iN = n(i5);
                }
                this.d++;
                int i42 = this.e;
                long[] jArr8 = this.a;
                int i43 = iN >> 3;
                long j21 = jArr8[i43];
                int i44 = (iN & 7) << 3;
                if (((j21 >> i44) & j2) != j3) {
                    i2 = i;
                }
                this.e = i42 - i2;
                int i45 = this.c;
                long j22 = (j21 & (~(j2 << i44))) | (j << i44);
                jArr8[i43] = j22;
                jArr8[(((iN - 7) & i45) + (i45 & 7)) >> 3] = j22;
                return iN;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i12;
            i3 = i15;
        }
    }

    private final int n(int i) {
        int i2 = this.c;
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

    private final void o() {
        this.e = kj.a(this.c) - this.d;
    }

    private final void p(int i) {
        long[] jArr;
        int i2 = 0;
        int iMax = i > 0 ? Math.max(7, kj.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = kj.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
            i2 = iMax;
        }
        this.a = jArr;
        int i3 = i2 >> 3;
        long j = 255 << ((7 & i2) << 3);
        jArr[i3] = j | (jArr[i3] & (~j));
        o();
        this.b = iMax == 0 ? ku.c : new Object[iMax];
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
            int r4 = r0.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.a(java.lang.Object):boolean");
    }

    public final boolean b() {
        return this.d == 0;
    }

    public final boolean c() {
        return this.d != 0;
    }

    public final void d() {
        this.d = 0;
        if (this.a != kj.a) {
            long[] jArr = this.a;
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        yfm.aD(this.b, null, 0, this.c);
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.c
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r3
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
        L14:
            r3 = r3 & r2
            r4 = r1 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r3 & 7
            int r7 = r3 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L48:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L66
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r2
            java.lang.Object[] r11 = r14.b
            r11 = r11[r10]
            boolean r11 = defpackage.yks.e(r11, r15)
            if (r11 == 0) goto L61
            goto L70
        L61:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L48
        L66:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L76
            r10 = -1
        L70:
            if (r10 < 0) goto L75
            r14.i(r10)
        L75:
            return
        L76:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.e(java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        if (kkVar.d != this.d) {
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
                            if ((255 & j) < 128 && !kkVar.a(objArr[(i << 3) + i3])) {
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

    public final void f(kk kkVar) {
        int i;
        kkVar.getClass();
        Object[] objArr = kkVar.b;
        long[] jArr = kkVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        h(objArr[(i2 << 3) + i4]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void g(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(Object obj) {
        this.b[m(obj)] = obj;
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.c * 31) + this.d;
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

    public final void i(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final boolean j(Object obj) {
        int i = this.d;
        this.b[m(obj)] = obj;
        return this.d != i;
    }

    public final boolean k(Iterable iterable) {
        int i = this.d;
        g(iterable);
        return i != this.d;
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
    public final boolean l(java.lang.Object r18) {
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
            int r4 = r0.c
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
            r0.i(r9)
        L7f:
            return r2
        L80:
            int r6 = r6 + 8
            int r5 = r5 + r6
            r5 = r5 & r4
            r3 = r16
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.l(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        kb kbVar = new kb(this, 3);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    int i3 = i - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 == 8) {
                                break;
                                break;
                            }
                            break;
                        }
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) kbVar.a(obj));
                            i2++;
                        }
                        j >>= 8;
                        i4++;
                    }
                }
            }
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        return sb.toString();
    }

    public /* synthetic */ kk(byte[] bArr) {
        this(6);
    }

    public kk() {
        this.a = kj.a;
        this.b = ku.c;
    }
}

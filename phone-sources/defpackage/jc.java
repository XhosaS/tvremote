package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jc {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public jc() {
        this.a = kj.a;
        this.b = jf.a;
        this.c = ku.c;
    }

    private final int g(int i) {
        int i2 = this.d;
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

    private final void h() {
        this.f = kj.a(this.d) - this.e;
    }

    private final void i(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, kj.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = kj.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
        }
        this.a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        h();
        this.b = new int[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r15) {
        /*
            r14 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r15
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        Ld:
            r4 = r0 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r1 & 7
            int r7 = r1 >> 3
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
        L40:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            int[] r11 = r14.b
            r11 = r11[r10]
            if (r11 != r15) goto L55
            goto L64
        L55:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L40
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r15 = r14.c
            r15 = r15[r10]
            return r15
        L6b:
            r15 = 0
            return r15
        L6d:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.a(int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r2 >>> 7
            int r4 = r0.d
            r3 = r3 & r4
            r6 = 0
        L11:
            r7 = r2 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r3 & 7
            int r10 = r3 >> 3
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
            r16 = r6
            r10 = 0
            long r5 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r11
            long r5 = r5 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r5
            long r5 = ~r5
            long r5 = r5 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r11
        L46:
            r14 = 0
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L62
            int r9 = java.lang.Long.numberOfTrailingZeros(r5)
            int r9 = r9 >> 3
            int r9 = r9 + r3
            r9 = r9 & r4
            int[] r14 = r0.b
            r14 = r14[r9]
            if (r14 != r1) goto L5d
            if (r9 < 0) goto L70
            return r13
        L5d:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            goto L46
        L62:
            long r5 = ~r7
            r9 = 6
            long r5 = r5 << r9
            long r5 = r5 & r7
            long r5 = r5 & r11
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 != 0) goto L70
            int r6 = r16 + 8
            int r3 = r3 + r6
            r3 = r3 & r4
            goto L11
        L70:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.b(int):boolean");
    }

    public final int c(int i) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2 = -862048943;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr3[i9] >>> i10;
            long j5 = jArr3[i9 + 1] << (64 - i10);
            int i11 = i2;
            int i12 = i4;
            long j6 = i4 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int iG = g(i5);
                long j11 = 255;
                if (this.f != 0 || ((this.a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.d;
                    if (i13 > 8) {
                        j3 = 128;
                        if (a.l(this.e * 32, i13 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i14 = this.d;
                            int[] iArr = this.b;
                            Object[] objArr = this.c;
                            int i15 = i14 + 7;
                            int i16 = 0;
                            while (i16 < (i15 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i16] & (-9187201950435737472L);
                                jArr4[i16] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i16++;
                                i15 = i15;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i17 = i11;
                            int iAL = yfm.aL(jArr4);
                            int i18 = iAL - 1;
                            jArr4[i18] = (jArr4[i18] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iAL] = jArr4[0];
                            int i19 = 0;
                            while (i19 != i14) {
                                int i20 = i19 >> 3;
                                int i21 = (i19 & 7) << 3;
                                long j13 = (jArr4[i20] >> i21) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int i22 = iArr[i19] * i17;
                                    int i23 = i22 ^ (i22 << 16);
                                    int i24 = i23 & 127;
                                    int i25 = i23 >>> 7;
                                    int iG2 = g(i25);
                                    int i26 = i25 & i14;
                                    int i27 = i17;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i24;
                                    if (((iG2 - i26) & i14) / 8 == ((i19 - i26) & i14) / 8) {
                                        jArr5[i20] = (j15 << i21) | ((~(j2 << i21)) & jArr5[i20]);
                                        jArr5[yfm.aL(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i19++;
                                    } else {
                                        int i28 = iG2 >> 3;
                                        long j16 = jArr5[i28];
                                        int i29 = (iG2 & 7) << 3;
                                        long j17 = j15 << i29;
                                        long j18 = (~(j2 << i29)) & j16;
                                        if (((j16 >> i29) & j2) == 128) {
                                            long j19 = ~(j2 << i21);
                                            jArr5[i28] = j18 | j17;
                                            jArr5[i20] = (jArr5[i20] & j19) | (128 << i21);
                                            iArr[iG2] = iArr[i19];
                                            iArr[i19] = 0;
                                            objArr[iG2] = objArr[i19];
                                            objArr[i19] = null;
                                        } else {
                                            jArr5[i28] = j18 | j17;
                                            int i30 = iArr[iG2];
                                            iArr[iG2] = iArr[i19];
                                            iArr[i19] = i30;
                                            Object obj = objArr[iG2];
                                            objArr[iG2] = objArr[i19];
                                            objArr[i19] = obj;
                                            i19--;
                                        }
                                        jArr5[yfm.aL(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i19++;
                                    }
                                    jArr4 = jArr5;
                                    i17 = i27;
                                    j6 = j14;
                                } else {
                                    i19++;
                                }
                            }
                            j = j6;
                            h();
                        }
                        iG = g(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    int iB = kj.b(this.d);
                    long[] jArr6 = this.a;
                    int[] iArr2 = this.b;
                    Object[] objArr2 = this.c;
                    int i31 = this.d;
                    i(iB);
                    long[] jArr7 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr6[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j3) {
                            int i34 = iArr2[i33];
                            int i35 = i34 * i11;
                            int iG3 = g((i35 ^ (i35 << 16)) >>> 7);
                            int i36 = iG3 >> 3;
                            int i37 = (iG3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i36] & (~(255 << i37))) | ((r12 & 127) << i37);
                            jArr[i36] = j20;
                            jArr[(((iG3 - 7) & i32) + (i32 & 7)) >> 3] = j20;
                            iArr3[iG3] = i34;
                            objArr3[iG3] = objArr2[i33];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i33++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    iG = g(i5);
                }
                this.e++;
                int i38 = this.f;
                long[] jArr8 = this.a;
                int i39 = iG >> 3;
                long j21 = jArr8[i39];
                int i40 = (iG & 7) << 3;
                this.f = i38 - (((j21 >> i40) & j2) != j3 ? 0 : 1);
                int i41 = this.d;
                long j22 = (j21 & (~(j2 << i40))) | (j << i40);
                jArr8[i39] = j22;
                jArr8[(((iG - 7) & i41) + (i41 & 7)) >> 3] = j22;
                return iG;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i12;
            i2 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r15) {
        /*
            r14 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r15
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        Ld:
            r4 = r0 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r1 & 7
            int r7 = r1 >> 3
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
        L40:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r13 = -1
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            int[] r11 = r14.b
            r11 = r11[r10]
            if (r11 != r15) goto L56
            goto L65
        L56:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L40
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = r13
        L65:
            r15 = 0
            if (r10 < 0) goto L96
            int r0 = r14.e
            int r0 = r0 + r13
            r14.e = r0
            long[] r0 = r14.a
            int r1 = r14.d
            int r2 = r10 >> 3
            r3 = r0[r2]
            r5 = r10 & 7
            int r5 = r5 << 3
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r5
            long r6 = ~r6
            long r3 = r3 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r5 = r6 << r5
            long r3 = r3 | r5
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r14.c
            r1 = r0[r10]
            r0[r10] = r15
            return r1
        L96:
            return r15
        L97:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.d(int):java.lang.Object");
    }

    public final void e() {
        this.e = 0;
        if (this.a != kj.a) {
            long[] jArr = this.a;
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        yfm.aD(this.c, null, 0, this.d);
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.jc
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            jc r1 = (defpackage.jc) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L75
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L70
            int r11 = r8 - r7
            r12 = r4
        L36:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L6e
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L6a
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L5f
            java.lang.Object r13 = r1.a(r15)
            if (r13 != 0) goto L5e
            boolean r13 = r1.b(r15)
            if (r13 == 0) goto L5e
            goto L6a
        L5e:
            return r4
        L5f:
            java.lang.Object r15 = r1.a(r15)
            boolean r13 = defpackage.yks.e(r13, r15)
            if (r13 != 0) goto L6a
            return r4
        L6a:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L36
        L6e:
            if (r13 != r14) goto L75
        L70:
            if (r8 == r7) goto L75
            int r8 = r8 + 1
            goto L23
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.equals(java.lang.Object):boolean");
    }

    public final void f(int i, Object obj) {
        int iC = c(i);
        this.b[iC] = i;
        this.c[iC] = obj;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
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
                        int i5 = (i2 << 3) + i4;
                        int i6 = iArr[i5];
                        Object obj = objArr[i5];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ i6;
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iHashCode;
                }
            }
            if (i2 == length) {
                return iHashCode;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[PHI: r8
  0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:8:0x0029, B:21:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.e
            if (r1 == 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6c
            r6 = 0
            r7 = r6
            r8 = r7
        L1b:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = r6
        L31:
            r13 = 8
            int r14 = 8 - r11
            if (r12 >= r14) goto L65
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L61
            int r14 = r7 << 3
            int r14 = r14 + r12
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L53
            java.lang.String r14 = "(this)"
        L53:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L61
            java.lang.String r14 = ", "
            r1.append(r14)
        L61:
            long r9 = r9 >> r13
            int r12 = r12 + 1
            goto L31
        L65:
            if (r14 != r13) goto L6c
        L67:
            if (r7 == r5) goto L6c
            int r7 = r7 + 1
            goto L1b
        L6c:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L76:
            java.lang.String r1 = "{}"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.toString():java.lang.String");
    }

    public jc(int i) {
        this.a = kj.a;
        this.b = jf.a;
        this.c = ku.c;
        if (i < 0) {
            kv.a("Capacity must be a positive value.");
        }
        i(kj.d(i));
    }

    public /* synthetic */ jc(byte[] bArr) {
        this(6);
    }
}

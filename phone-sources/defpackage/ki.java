package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ki {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public ki(int i) {
        this.a = kj.a;
        Object[] objArr = ku.c;
        this.b = objArr;
        this.c = objArr;
        if (i < 0) {
            kv.a("Capacity must be a positive value.");
        }
        m(kj.d(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean e(defpackage.ki r17, java.lang.Object r18) {
        /*
            r0 = r17
            r1 = r18
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r4 = r0.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.e(ki, java.lang.Object):boolean");
    }

    private final int k(int i) {
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

    private final void l() {
        this.f = kj.a(this.d) - this.e;
    }

    private final void m(int i) {
        long[] jArr;
        Object[] objArr;
        int i2 = 0;
        int iMax = i > 0 ? Math.max(7, kj.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = kj.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            yfm.bo(jArr, -9187201950435737472L, jArr.length);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i3] = (jArr[i3] & (~j)) | j;
        }
        this.a = jArr;
        l();
        if (iMax == 0) {
            objArr = ku.c;
        } else {
            i2 = iMax;
            objArr = new Object[iMax];
        }
        this.b = objArr;
        this.c = i2 == 0 ? ku.c : new Object[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.d
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
            if (r4 == 0) goto L79
            r10 = -1
        L70:
            if (r10 < 0) goto L77
            java.lang.Object[] r15 = r14.c
            r15 = r15[r10]
            return r15
        L77:
            r15 = 0
            return r15
        L79:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.a(java.lang.Object):java.lang.Object");
    }

    public final boolean b(Object obj) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128 && yks.e(obj, objArr[(i << 3) + i3])) {
                                return true;
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.e == 0;
    }

    public final boolean d() {
        return this.e != 0;
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
            boolean r3 = r1 instanceof defpackage.ki
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ki r1 = (defpackage.ki) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
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
            boolean r13 = e(r1, r15)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.equals(java.lang.Object):boolean");
    }

    public final int f(Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.d;
        int i6 = i4 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = jArr3[i8] >>> i9;
            long j5 = jArr3[i8 + 1] << (64 - i9);
            int i10 = i3;
            int i11 = 0;
            long j6 = i3 & 127;
            long j7 = (j5 & ((-i9) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i6) & i5;
                int i12 = i2;
                if (yks.e(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i12;
            }
            int i13 = i2;
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int iK = k(i4);
                long j11 = 255;
                if (this.f != 0 || ((this.a[iK >> 3] >> ((iK & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j3 = 128;
                        if (a.l(this.e * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i15 = this.d;
                            Object[] objArr = this.b;
                            Object[] objArr2 = this.c;
                            int i16 = i15 + 7;
                            int i17 = 0;
                            while (i17 < (i16 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i17] & (-9187201950435737472L);
                                jArr4[i17] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i17++;
                                i16 = i16;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i18 = i11;
                            int iAL = yfm.aL(jArr4);
                            int i19 = iAL - 1;
                            jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iAL] = jArr4[i18];
                            int i20 = i18;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr4[i21] >> i22) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i18) * i13;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 & 127;
                                    int i25 = i23 >>> 7;
                                    int iK2 = k(i25);
                                    int i26 = i25 & i15;
                                    int i27 = i18;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i24;
                                    if (((iK2 - i26) & i15) / 8 == ((i20 - i26) & i15) / 8) {
                                        jArr5[i21] = (j15 << i22) | ((~(j2 << i22)) & jArr5[i21]);
                                        jArr5[yfm.aL(jArr5)] = jArr5[i27];
                                        i20++;
                                    } else {
                                        int i28 = iK2 >> 3;
                                        long j16 = jArr5[i28];
                                        int i29 = (iK2 & 7) << 3;
                                        long j17 = j15 << i29;
                                        long j18 = (~(j2 << i29)) & j16;
                                        if (((j16 >> i29) & j2) == 128) {
                                            long j19 = ~(j2 << i22);
                                            jArr5[i28] = j18 | j17;
                                            jArr5[i21] = (jArr5[i21] & j19) | (128 << i22);
                                            objArr[iK2] = objArr[i20];
                                            objArr[i20] = null;
                                            objArr2[iK2] = objArr2[i20];
                                            objArr2[i20] = null;
                                        } else {
                                            jArr5[i28] = j18 | j17;
                                            Object obj3 = objArr[iK2];
                                            objArr[iK2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            Object obj4 = objArr2[iK2];
                                            objArr2[iK2] = objArr2[i20];
                                            objArr2[i20] = obj4;
                                            i20--;
                                        }
                                        jArr5[yfm.aL(jArr5)] = jArr5[i27];
                                        i20++;
                                    }
                                    jArr4 = jArr5;
                                    i18 = i27;
                                    j6 = j14;
                                } else {
                                    i20++;
                                }
                            }
                            j = j6;
                            i = i18;
                            l();
                        }
                        iK = k(i4);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB = kj.b(this.d);
                    long[] jArr6 = this.a;
                    Object[] objArr3 = this.b;
                    Object[] objArr4 = this.c;
                    int i30 = this.d;
                    m(iB);
                    long[] jArr7 = this.a;
                    Object[] objArr5 = this.b;
                    Object[] objArr6 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr6[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < j3) {
                            Object obj5 = objArr3[i32];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int iK3 = k((iHashCode3 ^ (iHashCode3 << 16)) >>> 7);
                            int i33 = iK3 >> 3;
                            int i34 = (iK3 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i33] & (~(255 << i34))) | ((r12 & 127) << i34);
                            jArr[i33] = j20;
                            jArr[(((iK3 - 7) & i31) + (i31 & 7)) >> 3] = j20;
                            objArr5[iK3] = obj5;
                            objArr6[iK3] = objArr4[i32];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i32++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    iK = k(i4);
                }
                this.e++;
                int i35 = this.f;
                long[] jArr8 = this.a;
                int i36 = iK >> 3;
                long j21 = jArr8[i36];
                int i37 = (iK & 7) << 3;
                this.f = i35 - (((j21 >> i37) & j2) != j3 ? i : 1);
                int i38 = this.d;
                long j22 = (j21 & (~(j2 << i37))) | (j << i37);
                jArr8[i36] = j22;
                jArr8[(((iK - 7) & i38) + (i38 & 7)) >> 3] = j22;
                return ~iK;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i10;
            i2 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            if (r15 == 0) goto L8
            int r1 = r15.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r14.d
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
            if (r4 == 0) goto L79
            r10 = -1
        L70:
            if (r10 < 0) goto L77
            java.lang.Object r15 = r14.h(r10)
            return r15
        L77:
            r15 = 0
            return r15
        L79:
            int r0 = r0 + 8
            int r3 = r3 + r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.g(java.lang.Object):java.lang.Object");
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i() {
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
        yfm.aD(this.b, null, 0, this.d);
        l();
    }

    public final void j(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.b[iF] = obj;
        this.c[iF] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.c()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L77
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L72
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = r6
        L36:
            r13 = 8
            int r14 = 8 - r11
            if (r12 >= r14) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r7 << 3
            int r14 = r14 + r12
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L52
            r15 = r16
        L52:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L5e
            r14 = r16
        L5e:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L6c
            java.lang.String r14 = ", "
            r1.append(r14)
        L6c:
            long r9 = r9 >> r13
            int r12 = r12 + 1
            goto L36
        L70:
            if (r14 != r13) goto L77
        L72:
            if (r7 == r5) goto L77
            int r7 = r7 + 1
            goto L20
        L77:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.toString():java.lang.String");
    }

    public /* synthetic */ ki(byte[] bArr) {
        this(6);
    }

    public ki() {
        this.a = kj.a;
        Object[] objArr = ku.c;
        this.b = objArr;
        this.c = objArr;
    }
}

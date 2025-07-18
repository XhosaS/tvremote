package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jz {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public jz(int i) {
        this.a = kj.a;
        this.b = ku.c;
        this.c = jf.a;
        if (i < 0) {
            kv.a("Capacity must be a positive value.");
        }
        l(kj.d(i));
    }

    private final int i(int i) {
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

    private final int j(Object obj) {
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
                int i14 = i(i4);
                long j11 = 255;
                if (this.f != 0 || ((this.a[i14 >> 3] >> ((i14 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 > 8) {
                        j3 = 128;
                        if (a.l(this.e * 32, i15 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i16 = this.d;
                            Object[] objArr = this.b;
                            int[] iArr = this.c;
                            int i17 = i16 + 7;
                            int i18 = 0;
                            while (i18 < (i17 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i18++;
                                i17 = i17;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i19 = i11;
                            int iAL = yfm.aL(jArr4);
                            int i20 = iAL - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iAL] = jArr4[i19];
                            int i21 = i19;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j13 = (jArr4[i22] >> i23) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i19) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 & 127;
                                    int i26 = i24 >>> 7;
                                    int i27 = i(i26);
                                    int i28 = i26 & i16;
                                    int i29 = i19;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i25;
                                    if (((i27 - i28) & i16) / 8 == ((i21 - i28) & i16) / 8) {
                                        jArr5[i22] = (j15 << i23) | ((~(j2 << i23)) & jArr5[i22]);
                                        jArr5[yfm.aL(jArr5)] = (jArr5[i29] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    } else {
                                        int i30 = i27 >> 3;
                                        long j16 = jArr5[i30];
                                        int i31 = (i27 & 7) << 3;
                                        long j17 = j15 << i31;
                                        long j18 = (~(j2 << i31)) & j16;
                                        if (((j16 >> i31) & j2) == 128) {
                                            long j19 = ~(j2 << i23);
                                            jArr5[i30] = j18 | j17;
                                            jArr5[i22] = (jArr5[i22] & j19) | (128 << i23);
                                            objArr[i27] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[i27] = iArr[i21];
                                            iArr[i21] = i29;
                                        } else {
                                            jArr5[i30] = j18 | j17;
                                            Object obj3 = objArr[i27];
                                            objArr[i27] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i32 = iArr[i27];
                                            iArr[i27] = iArr[i21];
                                            iArr[i21] = i32;
                                            i21--;
                                        }
                                        jArr5[yfm.aL(jArr5)] = (jArr5[i29] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    }
                                    jArr4 = jArr5;
                                    i19 = i29;
                                    j6 = j14;
                                } else {
                                    i21++;
                                }
                            }
                            j = j6;
                            i = i19;
                            k();
                        }
                        i14 = i(i4);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB = kj.b(this.d);
                    long[] jArr6 = this.a;
                    Object[] objArr2 = this.b;
                    int[] iArr2 = this.c;
                    int i33 = this.d;
                    l(iB);
                    long[] jArr7 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr3 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr6[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr2[i35];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i36 = i((iHashCode3 ^ (iHashCode3 << 16)) >>> 7);
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i37] & (~(255 << i38))) | ((r12 & 127) << i38);
                            jArr[i37] = j20;
                            jArr[(((i36 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            objArr3[i36] = obj4;
                            iArr3[i36] = iArr2[i35];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i35++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    i14 = i(i4);
                }
                this.e++;
                int i39 = this.f;
                long[] jArr8 = this.a;
                int i40 = i14 >> 3;
                long j21 = jArr8[i40];
                int i41 = (i14 & 7) << 3;
                this.f = i39 - (((j21 >> i41) & j2) != j3 ? i : 1);
                int i42 = this.d;
                long j22 = (j21 & (~(j2 << i41))) | (j << i41);
                jArr8[i40] = j22;
                jArr8[(((i14 - 7) & i42) + (i42 & 7)) >> 3] = j22;
                return ~i14;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i10;
            i2 = i13;
        }
    }

    private final void k() {
        this.f = kj.a(this.d) - this.e;
    }

    private final void l(int i) {
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
        k();
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    public final int a(Object obj) {
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = iHashCode * (-862048943);
        int i4 = (i3 ^ (i3 << 16)) >>> 7;
        while (true) {
            int i5 = i4 & i2;
            long[] jArr = this.a;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = j ^ ((r1 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i2;
                if (yks.e(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    public final int b(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            kv.d(a.cj(obj, "There is no key ", " in the map"));
        }
        return this.c[iA];
    }

    public final int c(Object obj, int i) {
        int iA = a(obj);
        return iA >= 0 ? this.c[iA] : i;
    }

    public final boolean d() {
        return this.e != 0;
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
        yfm.aD(this.b, null, 0, this.d);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
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
            boolean r3 = r1 instanceof defpackage.jz
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            jz r1 = (defpackage.jz) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            int[] r5 = r0.c
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
            if (r11 == 0) goto L6c
            int r11 = r8 - r7
            r12 = r4
        L36:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L67
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r3[r13]
            r13 = r5[r13]
            int r15 = r1.a(r15)
            if (r15 < 0) goto L5e
            r16 = r2
            int[] r2 = r1.c
            r2 = r2[r15]
            if (r13 != r2) goto L5e
            goto L61
        L5e:
            return r4
        L5f:
            r16 = r2
        L61:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r2 = r16
            goto L36
        L67:
            r16 = r2
            if (r13 != r14) goto L77
            goto L6e
        L6c:
            r16 = r2
        L6e:
            if (r8 == r7) goto L77
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L75:
            r16 = r2
        L77:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.equals(java.lang.Object):boolean");
    }

    public final void f(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void g(Object obj, int i) {
        int iJ = j(obj);
        if (iJ < 0) {
            iJ = ~iJ;
        }
        this.b[iJ] = obj;
        this.c[iJ] = i;
    }

    public final int h(Object obj, int i) {
        int i2;
        int iJ = j(obj);
        if (iJ < 0) {
            iJ = ~iJ;
            i2 = -1;
        } else {
            i2 = this.c[iJ];
        }
        this.b[iJ] = obj;
        this.c[iJ] = i;
        return i2;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                        iHashCode += iArr[i5] ^ (obj != null ? obj.hashCode() : 0);
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
            java.lang.Object[] r2 = r0.b
            int[] r3 = r0.c
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
            if (r15 != r0) goto L4b
            java.lang.String r15 = "(this)"
        L4b:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.toString():java.lang.String");
    }

    public /* synthetic */ jz(byte[] bArr) {
        this(6);
    }

    public jz() {
        this.a = kj.a;
        this.b = ku.c;
        this.c = jf.a;
    }
}

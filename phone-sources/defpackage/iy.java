package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iy {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public iy() {
        this.a = kj.a;
        int[] iArr = jf.a;
        this.b = iArr;
        this.c = iArr;
    }

    private final int e(int i) {
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

    private final void f() {
        this.f = kj.a(this.d) - this.e;
    }

    private final void g(int i) {
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
        f();
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    public final int a(int i) {
        int i2 = (-862048943) * i;
        int i3 = this.d;
        int i4 = ((i2 ^ (i2 << 16)) >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = j ^ ((r0 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void b() {
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
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r5 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r37.f != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (((r37.a[r5 >> 3] >> ((r5 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        r5 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r5 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (defpackage.a.l(r37.e * 32, r5 * 25) > 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        r5 = r37.a;
        r6 = r37.d;
        r7 = r37.b;
        r8 = r37.c;
        r14 = r6 + 7;
        r24 = 255;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (r9 >= (r14 >> 3)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        r10 = r5[r9] & (-9187201950435737472L);
        r5[r9] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r9 = r9 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        r26 = r12;
        r9 = defpackage.yfm.aL(r5);
        r10 = r9 - 1;
        r13 = 72057594037927935L;
        r5[r10] = (r5[r10] & 72057594037927935L) | (-72057594037927936L);
        r5[r9] = r5[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fd, code lost:
    
        if (r9 == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        r10 = r9 >> 3;
        r16 = (r9 & 7) << 3;
        r11 = (r5[r10] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010d, code lost:
    
        if (r11 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        if (r11 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        r11 = r7[r9] * r26;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 & 127;
        r11 = r11 >>> 7;
        r17 = e(r11);
        r11 = r11 & r6;
        r29 = r13;
        r31 = r2;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        if ((((r17 - r11) & r6) / 8) != (((r9 - r11) & r6) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013b, code lost:
    
        r5[r10] = (r1 << r16) | ((~(255 << r16)) & r5[r10]);
        r5[defpackage.yfm.aL(r5)] = (r5[0] & r29) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        r13 = r29;
        r2 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        r3 = r17 >> 3;
        r11 = r5[r3];
        r13 = (r17 & 7) << 3;
        r1 = r1 << r13;
        r1 = (~(255 << r13)) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016f, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        r11 = ~(255 << r16);
        r5[r3] = r1 | r1;
        r5[r10] = (r5[r10] & r11) | (128 << r16);
        r7[r17] = r7[r9];
        r7[r9] = 0;
        r8[r17] = r8[r9];
        r8[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018d, code lost:
    
        r5[r3] = r1 | r1;
        r1 = r7[r17];
        r7[r17] = r7[r9];
        r7[r9] = r1;
        r1 = r8[r17];
        r8[r17] = r8[r9];
        r8[r9] = r1;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a3, code lost:
    
        r5[defpackage.yfm.aL(r5)] = (r5[0] & r29) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b1, code lost:
    
        r31 = r2;
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b8, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        r31 = r2;
        r24 = 255;
        r1 = defpackage.kj.b(r37.d);
        r2 = r37.a;
        r3 = r37.b;
        r5 = r37.c;
        r6 = r37.d;
        g(r1);
        r1 = r37.a;
        r7 = r37.b;
        r8 = r37.c;
        r9 = r37.d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01dd, code lost:
    
        if (r10 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ec, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r18) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ee, code lost:
    
        r11 = r3[r10];
        r12 = r11 * r12;
        r13 = e((r12 ^ (r12 << 16)) >>> 7);
        r14 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r20 = r1;
        r17 = r2;
        r1 = (r1[r14] & (~(255 << r16))) | ((r12 & 127) << r16);
        r20[r14] = r1;
        r20[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r13] = r11;
        r8[r13] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0228, code lost:
    
        r20 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022c, code lost:
    
        r10 = r10 + 1;
        r2 = r17;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0233, code lost:
    
        r5 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0238, code lost:
    
        r31 = r2;
        r24 = 255;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0240, code lost:
    
        r37.e++;
        r1 = r37.f;
        r2 = r37.a;
        r3 = r5 >> 3;
        r6 = r2[r3];
        r4 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0257, code lost:
    
        if (((r6 >> r4) & r24) != r18) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025a, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025c, code lost:
    
        r37.f = r1 - r15;
        r1 = r37.d;
        r6 = (r6 & (~(r24 << r4))) | (r31 << r4);
        r2[r3] = r6;
        r2[(((r5 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r11 = ~r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.c(int, int):void");
    }

    public final int d(int i) {
        int iA = a(i);
        if (iA >= 0) {
            return this.c[iA];
        }
        return -1;
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
            boolean r3 = r1 instanceof defpackage.iy
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            iy r1 = (defpackage.iy) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        i3 += iArr2[i6] ^ iArr[i6];
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[PHI: r8
  0x0063: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:8:0x0029, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.e
            if (r1 == 0) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L68
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
            if (r11 == 0) goto L63
            int r11 = r7 - r5
            r12 = r6
        L2e:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L61
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L5d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r15 = r2[r13]
            r13 = r3[r13]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r13)
            int r8 = r8 + 1
            int r13 = r0.e
            if (r8 >= r13) goto L5d
            java.lang.String r13 = ", "
            r1.append(r13)
        L5d:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            goto L2e
        L61:
            if (r13 != r14) goto L68
        L63:
            if (r7 == r5) goto L68
            int r7 = r7 + 1
            goto L1b
        L68:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L72:
            java.lang.String r1 = "{}"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.toString():java.lang.String");
    }

    public iy(int i) {
        this.a = kj.a;
        int[] iArr = jf.a;
        this.b = iArr;
        this.c = iArr;
        g(kj.d(i));
    }

    public /* synthetic */ iy(byte[] bArr) {
        this(6);
    }
}

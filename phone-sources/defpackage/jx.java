package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jx {
    public long[] a = kj.a;
    public Object[] b = ku.c;
    public float[] c = iw.a;
    public int d;
    public int e;
    private int f;

    public jx(int i) {
        e(kj.d(i));
    }

    private final int c(int i) {
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

    private final void d() {
        this.f = kj.a(this.d) - this.e;
    }

    private final void e(int i) {
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
        d();
        this.b = new Object[iMax];
        this.c = new float[iMax];
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        r2 = c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (r35.f != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (((r35.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r2 = r35.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r2 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        if (defpackage.a.l(r35.e * 32, r2 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        r2 = r35.a;
        r3 = r35.d;
        r5 = r35.b;
        r6 = r35.c;
        r14 = r3 + 7;
        r24 = 255;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        if (r9 >= (r14 >> 3)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        r10 = r2[r9] & (-9187201950435737472L);
        r2[r9] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r9 = r9 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        r26 = r12;
        r9 = defpackage.yfm.aL(r2);
        r10 = r9 - 1;
        r13 = 72057594037927935L;
        r2[r10] = (r2[r10] & 72057594037927935L) | (-72057594037927936L);
        r2[r9] = r2[r26];
        r9 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0105, code lost:
    
        if (r9 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        r10 = r9 >> 3;
        r16 = (r9 & 7) << 3;
        r11 = (r2[r10] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
    
        if (r11 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011c, code lost:
    
        if (r11 == 254) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        r11 = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        r11 = r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        r11 = r11 * r21;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 & 127;
        r11 = r11 >>> 7;
        r17 = c(r11);
        r11 = r11 & r3;
        r29 = r13;
        r14 = r2;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0149, code lost:
    
        if ((((r17 - r11) & r3) / 8) != (((r9 - r11) & r3) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014b, code lost:
    
        r14[r10] = (r1 << r16) | (r14[r10] & (~(255 << r16)));
        r14[defpackage.yfm.aL(r14)] = (r14[r26] & r29) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0165, code lost:
    
        r2 = r14;
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016b, code lost:
    
        r11 = r17 >> 3;
        r12 = r14[r11];
        r28 = (r17 & 7) << 3;
        r1 = r1 << r28;
        r1 = (~(255 << r28)) & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0181, code lost:
    
        if (((r12 >> r28) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0183, code lost:
    
        r12 = ~(255 << r16);
        r14[r11] = r1 | r1;
        r14[r10] = (r14[r10] & r12) | (128 << r16);
        r5[r17] = r5[r9];
        r5[r9] = null;
        r6[r17] = r6[r9];
        r6[r9] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a1, code lost:
    
        r14[r11] = r1 | r1;
        r1 = r5[r17];
        r5[r17] = r5[r9];
        r5[r9] = r1;
        r1 = r6[r17];
        r6[r17] = r6[r9];
        r6[r9] = r1;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b7, code lost:
    
        r14[defpackage.yfm.aL(r14)] = (r14[r26] & r29) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c5, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ca, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01cc, code lost:
    
        r24 = 255;
        r26 = 0;
        r1 = defpackage.kj.b(r35.d);
        r2 = r35.a;
        r3 = r35.b;
        r5 = r35.c;
        r6 = r35.d;
        e(r1);
        r1 = r35.a;
        r9 = r35.b;
        r10 = r35.c;
        r11 = r35.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ed, code lost:
    
        if (r12 >= r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01fd, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r18) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ff, code lost:
    
        r13 = r3[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0201, code lost:
    
        if (r13 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0203, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0208, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020a, code lost:
    
        r14 = r14 * r21;
        r16 = r15;
        r15 = c((r14 ^ (r14 << 16)) >>> 7);
        r17 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r29 = r1;
        r28 = r2;
        r1 = (r1[r17] & (~(255 << r20))) | ((r14 & 127) << r20);
        r29[r17] = r1;
        r29[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r9[r15] = r13;
        r10[r15] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0246, code lost:
    
        r29 = r1;
        r28 = r2;
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024c, code lost:
    
        r12 = r12 + 1;
        r15 = r16;
        r2 = r28;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0255, code lost:
    
        r16 = r15;
        r2 = c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x025c, code lost:
    
        r24 = 255;
        r26 = 0;
        r16 = 1;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0266, code lost:
    
        r35.e++;
        r1 = r35.f;
        r3 = r35.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027e, code lost:
    
        if (((r5 >> r9) & r24) != r18) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0281, code lost:
    
        r16 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0283, code lost:
    
        r35.f = r1 - r16;
        r1 = r35.d;
        r5 = (r5 & (~(r24 << r9))) | (r7 << r9);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r11 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r36, float r37) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx.b(java.lang.Object, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
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
            boolean r3 = r1 instanceof defpackage.jx
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            jx r1 = (defpackage.jx) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            float[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L77
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
            if (r11 == 0) goto L6e
            int r11 = r8 - r7
            r12 = r4
        L36:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L69
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L61
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r3[r13]
            r13 = r5[r13]
            int r15 = r1.a(r15)
            if (r15 < 0) goto L60
            r16 = r2
            float[] r2 = r1.c
            r2 = r2[r15]
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 != 0) goto L60
            goto L63
        L60:
            return r4
        L61:
            r16 = r2
        L63:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r2 = r16
            goto L36
        L69:
            r16 = r2
            if (r13 != r14) goto L79
            goto L70
        L6e:
            r16 = r2
        L70:
            if (r8 == r7) goto L79
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L77:
            r16 = r2
        L79:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iFloatToIntBits = 0;
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
                        iFloatToIntBits += Float.floatToIntBits(fArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iFloatToIntBits;
                }
            }
            if (i2 == length) {
                return iFloatToIntBits;
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
            float[] r3 = r0.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx.toString():java.lang.String");
    }

    public jx() {
    }
}

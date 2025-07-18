package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jl {
    public long[] a = kj.a;
    public long[] b = jm.a;
    public int c;
    public int d;
    private int e;

    public jl() {
    }

    private final int d(int i) {
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

    private final void e() {
        this.e = kj.a(this.c) - this.d;
    }

    private final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, kj.c(i)) : 0;
        this.c = iMax;
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
        e();
        this.b = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (((((~r6) << 6) & r6) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = defpackage.a.k(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.c
            r2 = r2 & r3
            r5 = 0
        L13:
            r6 = r1 & 127(0x7f, float:1.78E-43)
            long[] r7 = r0.a
            r8 = r2 & 7
            int r9 = r2 >> 3
            r10 = r7[r9]
            int r8 = r8 << 3
            long r10 = r10 >>> r8
            r12 = 1
            int r9 = r9 + r12
            r13 = r7[r9]
            int r7 = 64 - r8
            long r13 = r13 << r7
            long r7 = (long) r8
            long r7 = -r7
            r15 = r5
            r9 = 0
            long r4 = (long) r6
            r6 = 63
            long r6 = r7 >> r6
            long r6 = r6 & r13
            long r6 = r6 | r10
            r10 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r10
            long r4 = r4 ^ r6
            r10 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r10 = r10 + r4
            long r4 = ~r4
            long r4 = r4 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r10
        L47:
            r13 = 0
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 == 0) goto L65
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
            int r8 = r8 >> 3
            int r8 = r8 + r2
            r8 = r8 & r3
            long[] r13 = r0.b
            r16 = r13[r8]
            int r13 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r13 != 0) goto L60
            if (r8 < 0) goto L73
            return r12
        L60:
            r13 = -1
            long r13 = r13 + r4
            long r4 = r4 & r13
            goto L47
        L65:
            long r4 = ~r6
            r8 = 6
            long r4 = r4 << r8
            long r4 = r4 & r6
            long r4 = r4 & r10
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L73
            int r5 = r15 + 8
            int r2 = r2 + r5
            r2 = r2 & r3
            goto L13
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.a(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = d(r3);
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r36.e != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (((r36.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        r1 = r36.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (defpackage.a.l(r36.d * 32, r1 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        r1 = r36.a;
        r2 = r36.c;
        r4 = r36.b;
        r5 = r2 + 7;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        if (r13 >= (r5 >> 3)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        r28 = r9;
        r9 = r1[r13] & (-9187201950435737472L);
        r1[r13] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r13 = r13 + 1;
        r11 = r11;
        r9 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        r28 = r9;
        r8 = r11;
        r5 = defpackage.yfm.aL(r1);
        r9 = r5 - 1;
        r12 = 72057594037927935L;
        r1[r9] = (r1[r9] & 72057594037927935L) | (-72057594037927936L);
        r1[r5] = r1[r8];
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if (r5 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fa, code lost:
    
        r9 = r5 >> 3;
        r15 = (r5 & 7) << 3;
        r10 = (r1[r9] >> r15) & r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
    
        if (r10 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0109, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
    
        if (r10 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        r10 = defpackage.a.k(r4[r5]) * r20;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 & 127;
        r10 = r10 >>> 7;
        r16 = d(r10);
        r10 = r10 & r2;
        r27 = r8;
        r30 = r12;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if ((((r16 - r10) & r2) / 8) != (((r5 - r10) & r2) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        r1[r9] = (r1[r9] & (~(r28 << r15))) | (r12 << r15);
        r1[defpackage.yfm.aL(r1)] = (r1[r27] & r30) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r8 = r27;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0157, code lost:
    
        r8 = r16 >> 3;
        r10 = r1[r8];
        r26 = (r16 & 7) << 3;
        r12 = r12 << r26;
        r34 = r14;
        r14 = (~(r28 << r26)) & r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
    
        if (((r10 >> r26) & r28) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0171, code lost:
    
        r10 = ~(r28 << r15);
        r1[r8] = r12 | r14;
        r1[r9] = (r10 & r1[r9]) | (128 << r15);
        r4[r16] = r4[r5];
        r4[r5] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0186, code lost:
    
        r1[r8] = r14 | r12;
        r8 = r4[r16];
        r4[r16] = r4[r5];
        r4[r5] = r8;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0194, code lost:
    
        r1[defpackage.yfm.aL(r1)] = (r1[r27] & r30) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r8 = r27;
        r12 = r30;
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        r27 = r8;
        r34 = r14;
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b3, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b5, code lost:
    
        r28 = 255;
        r27 = 0;
        r34 = 1;
        r1 = defpackage.kj.b(r36.c);
        r2 = r36.a;
        r4 = r36.b;
        r5 = r36.c;
        f(r1);
        r1 = r36.a;
        r8 = r36.b;
        r9 = r36.c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d4, code lost:
    
        if (r10 >= r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e3, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r21) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e5, code lost:
    
        r11 = r4[r10];
        r13 = defpackage.a.k(r11) * r20;
        r14 = d((r13 ^ (r13 << 16)) >>> 7);
        r15 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r24 = r1;
        r23 = r2;
        r1 = (r1[r15] & (~(255 << r16))) | ((r13 & 127) << r16);
        r24[r15] = r1;
        r24[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r8[r14] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021f, code lost:
    
        r24 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0223, code lost:
    
        r10 = r10 + 1;
        r2 = r23;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022a, code lost:
    
        r1 = d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022f, code lost:
    
        r28 = 255;
        r27 = 0;
        r34 = 1;
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0239, code lost:
    
        r10 = r1;
        r36.d++;
        r1 = r36.e;
        r2 = r36.a;
        r3 = r10 >> 3;
        r4 = r2[r3];
        r8 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0252, code lost:
    
        if (((r4 >> r8) & r28) != r21) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0255, code lost:
    
        r34 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0257, code lost:
    
        r36.e = r1 - r34;
        r1 = r36.c;
        r4 = (r4 & (~(r28 << r8))) | (r6 << r8);
        r2[r3] = r4;
        r2[(((r10 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r37) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.b(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = defpackage.a.k(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.c
            r2 = r2 & r3
            r4 = 0
        L13:
            r5 = r1 & 127(0x7f, float:1.78E-43)
            long[] r6 = r0.a
            r7 = r2 & 7
            int r8 = r2 >> 3
            r9 = r6[r8]
            int r7 = r7 << 3
            long r9 = r9 >>> r7
            int r8 = r8 + 1
            r11 = r6[r8]
            int r6 = 64 - r7
            long r11 = r11 << r6
            long r6 = (long) r7
            long r6 = -r6
            long r13 = (long) r5
            r5 = 63
            long r5 = r6 >> r5
            long r5 = r5 & r11
            long r5 = r5 | r9
            r7 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r7
            long r7 = r5 ^ r13
            r9 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r9 = r9 + r7
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L46:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r14 = -1
            if (r13 == 0) goto L63
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r3
            long[] r12 = r0.b
            r15 = r12[r11]
            int r12 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r12 != 0) goto L5e
            goto L6d
        L5e:
            r11 = -1
            long r11 = r11 + r7
            long r7 = r7 & r11
            goto L46
        L63:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L97
            r11 = r14
        L6d:
            if (r11 < 0) goto L96
            int r1 = r0.d
            int r1 = r1 + r14
            r0.d = r1
            long[] r1 = r0.a
            int r2 = r0.c
            int r3 = r11 >> 3
            r4 = r11 & 7
            r5 = r1[r3]
            int r4 = r4 << 3
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r5 = r5 | r7
            r1[r3] = r5
            int r11 = r11 + (-7)
            r3 = r11 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r5
        L96:
            return
        L97:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.c(long):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        if (jlVar.d != this.d) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
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
                            if ((255 & j) < 128 && !jlVar.a(jArr[(i << 3) + i3])) {
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

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iK = 0;
        while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        iK += a.k(jArr[(i2 << 3) + i4]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iK;
                }
            }
            if (i2 == length) {
                return iK;
            }
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
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
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j2);
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

    public jl(int i) {
        f(kj.d(i));
    }
}

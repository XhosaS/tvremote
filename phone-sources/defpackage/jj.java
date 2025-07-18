package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jj {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public jj() {
        this.a = kj.a;
        this.b = jm.a;
        this.c = ku.c;
    }

    private final int f(int i) {
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

    private final void g() {
        this.f = kj.a(this.d) - this.e;
    }

    private final void h(int i) {
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
        g();
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r15) {
        /*
            r14 = this;
            int r0 = defpackage.a.k(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        L11:
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
        L44:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            long[] r11 = r14.b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L5b
            goto L6a
        L5b:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L44
        L60:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L71
            java.lang.Object[] r0 = r14.c
            r0 = r0[r10]
            return r0
        L71:
            r0 = 0
            return r0
        L73:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.a(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (((((~r6) << 6) & r6) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(long r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = defpackage.a.k(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.b(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = defpackage.a.k(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
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
            if (r5 == 0) goto L9f
            r11 = r14
        L6d:
            r1 = 0
            if (r11 < 0) goto L9e
            int r2 = r0.e
            int r2 = r2 + r14
            r0.e = r2
            long[] r2 = r0.a
            int r3 = r0.d
            int r4 = r11 >> 3
            r5 = r2[r4]
            r7 = r11 & 7
            int r7 = r7 << 3
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            r8 = 254(0xfe, double:1.255E-321)
            long r7 = r8 << r7
            long r5 = r5 | r7
            r2[r4] = r5
            int r4 = r11 + (-7)
            r4 = r4 & r3
            r3 = r3 & 7
            int r4 = r4 + r3
            int r3 = r4 >> 3
            r2[r3] = r5
            java.lang.Object[] r2 = r0.c
            r3 = r2[r11]
            r2[r11] = r1
            return r3
        L9e:
            return r1
        L9f:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.c(long):java.lang.Object");
    }

    public final void d() {
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
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r38.f != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (((r38.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        r1 = r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (defpackage.a.l(r38.e * 32, r1 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        r1 = r38.a;
        r2 = r38.d;
        r4 = r38.b;
        r5 = r38.c;
        r13 = r2 + 7;
        r26 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        if (r8 >= (r13 >> 3)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        r9 = r1[r8] & (-9187201950435737472L);
        r1[r8] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dc, code lost:
    
        r28 = r11;
        r8 = defpackage.yfm.aL(r1);
        r9 = r8 - 1;
        r12 = 72057594037927935L;
        r1[r9] = (r1[r9] & 72057594037927935L) | (-72057594037927936L);
        r1[r8] = r1[r28];
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if (r8 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fb, code lost:
    
        r9 = r8 >> 3;
        r15 = (r8 & 7) << 3;
        r10 = (r1[r9] >> r15) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        if (r10 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (r10 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r10 = defpackage.a.k(r4[r8]) * r20;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 & 127;
        r10 = r10 >>> 7;
        r16 = f(r10);
        r10 = r10 & r2;
        r30 = r12;
        r13 = r14;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        if ((((r16 - r10) & r2) / 8) != (((r8 - r10) & r2) / 8)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013b, code lost:
    
        r1[r9] = (r1[r9] & (~(255 << r15))) | (r14 << r15);
        r1[defpackage.yfm.aL(r1)] = (r1[r28] & r30) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r14 = r13;
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
    
        r10 = r16 >> 3;
        r11 = r1[r10];
        r34 = (r16 & 7) << 3;
        r14 = r14 << r34;
        r13 = (~(255 << r34)) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0171, code lost:
    
        if (((r11 >> r34) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0173, code lost:
    
        r11 = ~(255 << r15);
        r1[r10] = r13 | r14;
        r1[r9] = (r11 & r1[r9]) | (128 << r15);
        r4[r16] = r4[r8];
        r4[r8] = 0;
        r5[r16] = r5[r8];
        r5[r8] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0190, code lost:
    
        r1[r10] = r13 | r14;
        r9 = r4[r16];
        r4[r16] = r4[r8];
        r4[r8] = r9;
        r9 = r5[r16];
        r5[r16] = r5[r8];
        r5[r8] = r9;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a6, code lost:
    
        r1[defpackage.yfm.aL(r1)] = (r1[r28] & r30) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r12 = r30;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ba, code lost:
    
        r35 = r14;
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c1, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c3, code lost:
    
        r26 = 255;
        r28 = 0;
        r35 = 1;
        r1 = defpackage.kj.b(r38.d);
        r2 = r38.a;
        r4 = r38.b;
        r5 = r38.c;
        r8 = r38.d;
        h(r1);
        r1 = r38.a;
        r9 = r38.b;
        r10 = r38.c;
        r11 = r38.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e6, code lost:
    
        if (r12 >= r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f5, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r21) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f7, code lost:
    
        r13 = r4[r12];
        r15 = defpackage.a.k(r13) * r20;
        r16 = r1;
        r1 = f((r15 ^ (r15 << 16)) >>> 7);
        r18 = r1 >> 3;
        r19 = (r1 & 7) << 3;
        r25 = r2;
        r1 = (r16[r18] & (~(255 << r19))) | ((r15 & 127) << r19);
        r16[r18] = r1;
        r16[(((r1 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r9[r1] = r13;
        r10[r1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0239, code lost:
    
        r16 = r1;
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023d, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0244, code lost:
    
        r1 = f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0249, code lost:
    
        r26 = 255;
        r28 = 0;
        r35 = 1;
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0253, code lost:
    
        r10 = r1;
        r38.e++;
        r1 = r38.f;
        r2 = r38.a;
        r3 = r10 >> 3;
        r4 = r2[r3];
        r8 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026c, code lost:
    
        if (((r4 >> r8) & r26) != r21) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x026e, code lost:
    
        r28 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        r38.f = r1 - r28;
        r1 = r38.d;
        r4 = (r4 & (~(r26 << r8))) | (r6 << r8);
        r2[r3] = r4;
        r2[(((r10 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r39, java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.e(long, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
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
            boolean r3 = r1 instanceof defpackage.jj
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            jj r1 = (defpackage.jj) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L88
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
            if (r11 == 0) goto L7d
            int r11 = r8 - r7
            r12 = r4
        L36:
            int r13 = ~r11
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            if (r12 >= r13) goto L77
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r9
            r17 = 128(0x80, double:6.3E-322)
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 >= 0) goto L6d
            int r13 = r8 << 3
            int r13 = r13 + r12
            r15 = r2
            r16 = r3
            r2 = r16[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L62
            java.lang.Object r13 = r1.a(r2)
            if (r13 != 0) goto L61
            boolean r2 = r1.b(r2)
            if (r2 == 0) goto L61
            goto L70
        L61:
            return r4
        L62:
            java.lang.Object r2 = r1.a(r2)
            boolean r2 = defpackage.yks.e(r13, r2)
            if (r2 != 0) goto L70
            return r4
        L6d:
            r15 = r2
            r16 = r3
        L70:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r2 = r15
            r3 = r16
            goto L36
        L77:
            r15 = r2
            r16 = r3
            if (r13 != r14) goto L89
            goto L80
        L7d:
            r15 = r2
            r16 = r3
        L80:
            if (r8 == r7) goto L89
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L88:
            r15 = r2
        L89:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
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
                        int i5 = (i2 << 3) + i4;
                        long j2 = jArr[i5];
                        Object obj = objArr[i5];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ a.k(j2);
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

    public final String toString() {
        int i;
        int i2;
        int i3;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = (~(i4 - length)) >>> 31;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - i6;
                        if (i7 >= i2) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j2 = jArr[i8];
                            Object obj = objArr[i8];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i2 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i4;
                }
                if (i == length) {
                    break;
                }
                i4 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public jj(int i) {
        this.a = kj.a;
        this.b = jm.a;
        this.c = ku.c;
        h(kj.d(i));
    }

    public /* synthetic */ jj(byte[] bArr) {
        this(6);
    }
}

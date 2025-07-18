package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wu extends wo {
    private int f;

    public wu() {
        long[] jArr = ww.a;
        f(6);
    }

    private final int d(int i) {
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

    private final void e() {
        int i = this.d;
        long[] jArr = ww.a;
        this.f = (i == 7 ? 6 : i - (i / 8)) - this.e;
    }

    private final void f(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = ww.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.d = iMax;
        if (iMax == 0) {
            jArr = ww.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
        }
        this.a = jArr;
        long[] jArr3 = this.a;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr3[i2] = (jArr3[i2] & (~j)) | j;
        e();
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        r21 = r3;
        r3 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        r5 = d(r4);
        r13 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
    
        if (r38.f != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (((r38.a[r5 >> 3] >> ((r5 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        r5 = r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r5 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        r22 = 0;
        r26 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (java.lang.Long.compare((r38.e * 32) ^ Long.MIN_VALUE, (r5 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        r3 = r38.a;
        r5 = r38.d;
        r6 = r38.b;
        r7 = r38.c;
        r8 = r5 + 7;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r9 >= (r8 >> 3)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        r11 = r3[r9] & (-9187201950435737472L);
        r3[r9] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r9 = r9 + 1;
        r12 = r12;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        r10 = r12;
        r30 = r13;
        r8 = defpackage.agqj.j(r3);
        r9 = r8 - 1;
        r13 = 72057594037927935L;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r8] = r3[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
    
        if (r8 == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0110, code lost:
    
        r9 = r8 >> 3;
        r16 = (r8 & 7) << 3;
        r11 = (r3[r9] >> r16) & r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011e, code lost:
    
        if (r11 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0120, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        if (r11 == 254) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
    
        r11 = r6[r8];
        r11 = ((int) (r11 ^ (r11 >>> r10))) * r21;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 & 127;
        r11 = r11 >>> 7;
        r17 = d(r11);
        r11 = r11 & r5;
        r33 = r10;
        r34 = r13;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014d, code lost:
    
        if ((((r17 - r11) & r5) / 8) != (((r8 - r11) & r5) / 8)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014f, code lost:
    
        r3[r9] = (r3[r9] & (~(r30 << r16))) | (r13 << r16);
        r3[defpackage.agqj.j(r3)] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r10 = r33;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016e, code lost:
    
        r10 = r17 >> 3;
        r11 = r3[r10];
        r32 = (r17 & 7) << 3;
        r13 = r13 << r32;
        r36 = r1;
        r1 = (~(r30 << r32)) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0184, code lost:
    
        if (((r11 >> r32) & r30) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0186, code lost:
    
        r11 = ~(r30 << r16);
        r3[r10] = r1 | r13;
        r3[r9] = (r3[r9] & r11) | (128 << r16);
        r6[r17] = r6[r8];
        r6[r8] = 0;
        r7[r17] = r7[r8];
        r7[r8] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a2, code lost:
    
        r3[r10] = r1 | r13;
        r1 = r6[r17];
        r6[r17] = r6[r8];
        r6[r8] = r1;
        r1 = r7[r17];
        r7[r17] = r7[r8];
        r7[r8] = r1;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b7, code lost:
    
        r3[defpackage.agqj.j(r3)] = (r3[0] & r34) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r10 = r33;
        r13 = r34;
        r1 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01cc, code lost:
    
        r36 = r1;
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d3, code lost:
    
        r22 = 0;
        r26 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d7, code lost:
    
        r36 = r1;
        r30 = 255;
        r1 = r38.d;
        r2 = defpackage.ww.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e3, code lost:
    
        if (r1 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e6, code lost:
    
        r3 = (r1 + r1) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e9, code lost:
    
        r1 = r38.a;
        r2 = r38.b;
        r5 = r38.c;
        r6 = r38.d;
        f(r3);
        r3 = r38.a;
        r7 = r38.b;
        r8 = r38.c;
        r9 = r38.d;
        r10 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fe, code lost:
    
        if (r10 >= r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020d, code lost:
    
        if (((r1[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r26) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020f, code lost:
    
        r11 = r2[r10];
        r13 = ((int) ((r11 >>> r12) ^ r11)) * r21;
        r14 = d((r13 ^ (r13 << 16)) >>> 7);
        r16 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r23 = r1;
        r24 = r2;
        r1 = (r3[r16] & (~(255 << r17))) | ((r13 & 127) << r17);
        r3[r16] = r1;
        r3[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x024e, code lost:
    
        r23 = r1;
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0252, code lost:
    
        r10 = r10 + 1;
        r1 = r23;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0259, code lost:
    
        r11 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x025f, code lost:
    
        r36 = r1;
        r30 = 255;
        r22 = 0;
        r26 = 128;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026a, code lost:
    
        r38.e++;
        r1 = r38.f;
        r2 = r38.a;
        r3 = r11 >> 3;
        r4 = r2[r3];
        r6 = (r11 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0281, code lost:
    
        if (((r4 >> r6) & r30) != r26) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0283, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0285, code lost:
    
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0287, code lost:
    
        r38.f = r1 - r7;
        r1 = r38.d;
        r4 = (r4 & (~(r30 << r6))) | (r36 << r6);
        r2[r3] = r4;
        r2[(((r11 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r39, java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu.b(long, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
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
            r1 = 32
            long r1 = r18 >>> r1
            long r1 = r18 ^ r1
            int r1 = (int) r1
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.d
            r2 = r2 & r3
            r4 = 0
        L16:
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
        L49:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r14 = -1
            if (r13 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r3
            long[] r12 = r0.b
            r15 = r12[r11]
            int r12 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r12 != 0) goto L61
            goto L70
        L61:
            r11 = -1
            long r11 = r11 + r7
            long r7 = r7 & r11
            goto L49
        L66:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto La1
            r11 = r14
        L70:
            if (r11 < 0) goto La0
            int r1 = r0.e
            int r1 = r1 + r14
            r0.e = r1
            long[] r1 = r0.a
            int r2 = r0.d
            int r3 = r11 >> 3
            r4 = r1[r3]
            r6 = r11 & 7
            int r6 = r6 << 3
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r6
            long r7 = ~r7
            long r4 = r4 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r6 = r7 << r6
            long r4 = r4 | r6
            r1[r3] = r4
            int r3 = r11 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r1 = r0.c
            r2 = r1[r11]
            r2 = 0
            r1[r11] = r2
        La0:
            return
        La1:
            int r4 = r4 + 8
            int r2 = r2 + r4
            r2 = r2 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu.c(long):void");
    }
}

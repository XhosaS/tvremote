package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkg {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    public final boolean h;
    private final boolean[] i;

    /* JADX WARN: Illegal instructions before constructor call */
    public zkg(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            yqw.C(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            yqw.C(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    final int a(char c) throws zkj {
        if (c > 127) {
            throw new zkj("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zkj("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zkj("Unrecognized character: " + c);
    }

    final boolean b(int i) {
        return this.i[i % this.e];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zkg) {
            zkg zkgVar = (zkg) obj;
            if (this.h == zkgVar.h && Arrays.equals(this.b, zkgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[LOOP:0: B:18:0x0060->B:20:0x0064, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zkg(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            r6.getClass()
            r4.b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L84
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L84
            if (r5 <= 0) goto L7c
            int[] r1 = defpackage.zsy.a     // Catch: java.lang.ArithmeticException -> L84
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L84
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L84
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L37;
                case 2: goto L42;
                case 3: goto L42;
                case 4: goto L2e;
                case 5: goto L2e;
                case 6: goto L1f;
                case 7: goto L1f;
                case 8: goto L1f;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L84
        L1c:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L84
            goto L78
        L1f:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L84
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L48
        L2e:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L84
            int r0 = 32 - r0
            goto L48
        L37:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            defpackage.ztd.b(r0)     // Catch: java.lang.ArithmeticException -> L84
        L42:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L84
            int r0 = 31 - r0
        L48:
            r4.d = r0     // Catch: java.lang.ArithmeticException -> L84
            int r5 = r5 + (-1)
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.e = r3
            int r6 = r0 >> r6
            r4.f = r6
            r4.c = r5
            r4.g = r7
            boolean[] r5 = new boolean[r3]
        L60:
            int r6 = r4.f
            if (r1 >= r6) goto L73
            int r6 = r1 * 8
            int r7 = r4.d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = defpackage.zsz.a(r6, r7, r0)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L60
        L73:
            r4.i = r5
            r4.h = r8
            return
        L78:
            r5.<init>()     // Catch: java.lang.ArithmeticException -> L84
            throw r5     // Catch: java.lang.ArithmeticException -> L84
        L7c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L84
            java.lang.String r7 = "x (0) must be > 0"
            r5.<init>(r7)     // Catch: java.lang.ArithmeticException -> L84
            throw r5     // Catch: java.lang.ArithmeticException -> L84
        L84:
            r5 = move-exception
            int r6 = r6.length
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal alphabet length "
            r8.<init>(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkg.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}

package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class s implements Serializable, n {
    private static final long serialVersionUID = 1;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final int g;

    public s(int i, boolean z, int i2, boolean z2, double d, double d2, long[] jArr) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = d2;
        this.f = jArr;
        this.g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f A[RETURN] */
    @Override // defpackage.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.o r11) {
        /*
            r10 = this;
            int r0 = r10.g
            int r1 = r0 + (-1)
            r2 = 1
            if (r1 == r2) goto L23
            r3 = 2
            if (r1 == r3) goto L20
            r3 = 3
            if (r1 == r3) goto L1d
            r3 = 4
            if (r1 == r3) goto L19
            r3 = 5
            if (r1 == r3) goto L16
            double r3 = r11.a
            goto L26
        L16:
            int r1 = r11.c
            goto L1b
        L19:
            int r1 = r11.b
        L1b:
            double r3 = (double) r1
            goto L26
        L1d:
            long r3 = r11.e
            goto L25
        L20:
            long r3 = r11.d
            goto L25
        L23:
            long r3 = r11.f
        L25:
            double r3 = (double) r3
        L26:
            boolean r1 = r10.c
            r5 = 0
            if (r1 == 0) goto L35
            long r6 = (long) r3
            double r6 = (double) r6
            double r6 = r3 - r6
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L3c
        L35:
            r1 = 7
            if (r0 != r1) goto L42
            int r11 = r11.b
            if (r11 == 0) goto L42
        L3c:
            boolean r11 = r10.b
            if (r11 != 0) goto L41
            return r2
        L41:
            return r5
        L42:
            int r11 = r10.a
            if (r11 == 0) goto L48
            double r0 = (double) r11
            double r3 = r3 % r0
        L48:
            double r0 = r10.d
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 < 0) goto L56
            double r0 = r10.e
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 > 0) goto L56
            r11 = r2
            goto L57
        L56:
            r11 = r5
        L57:
            if (r11 == 0) goto L7a
            long[] r0 = r10.f
            if (r0 == 0) goto L7a
            r11 = r5
            r1 = r11
        L5f:
            if (r11 != 0) goto L7a
            int r6 = r0.length
            if (r1 >= r6) goto L7a
            r6 = r0[r1]
            double r6 = (double) r6
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 < 0) goto L76
            int r11 = r1 + 1
            r6 = r0[r11]
            double r6 = (double) r6
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 > 0) goto L76
            r11 = r2
            goto L77
        L76:
            r11 = r5
        L77:
            int r1 = r1 + 2
            goto L5f
        L7a:
            boolean r0 = r10.b
            if (r0 != r11) goto L7f
            return r2
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.a(o):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.g
            switch(r1) {
                case 1: goto L1c;
                case 2: goto L19;
                case 3: goto L16;
                case 4: goto L13;
                case 5: goto L10;
                case 6: goto Ld;
                default: goto La;
            }
        La:
            java.lang.String r1 = "j"
            goto L1e
        Ld:
            java.lang.String r1 = "w"
            goto L1e
        L10:
            java.lang.String r1 = "v"
            goto L1e
        L13:
            java.lang.String r1 = "t"
            goto L1e
        L16:
            java.lang.String r1 = "f"
            goto L1e
        L19:
            java.lang.String r1 = "i"
            goto L1e
        L1c:
            java.lang.String r1 = "n"
        L1e:
            r0.append(r1)
            int r1 = r9.a
            if (r1 == 0) goto L2d
            java.lang.String r2 = " % "
            r0.append(r2)
            r0.append(r1)
        L2d:
            double r1 = r9.d
            double r3 = r9.e
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r6 = " = "
            java.lang.String r7 = " != "
            if (r5 == 0) goto L4c
            boolean r5 = r9.c
            if (r5 == 0) goto L42
            boolean r5 = r9.b
            if (r5 == 0) goto L51
            goto L52
        L42:
            boolean r5 = r9.b
            if (r5 == 0) goto L49
            java.lang.String r6 = " within "
            goto L52
        L49:
            java.lang.String r6 = " not within "
            goto L52
        L4c:
            boolean r5 = r9.b
            if (r5 == 0) goto L51
            goto L52
        L51:
            r6 = r7
        L52:
            r0.append(r6)
            long[] r6 = r9.f
            if (r6 == 0) goto L71
            r7 = 0
            r8 = r7
        L5b:
            int r1 = r6.length
            if (r8 >= r1) goto L75
            r1 = r6[r8]
            double r1 = (double) r1
            int r3 = r8 + 1
            r3 = r6[r3]
            double r3 = (double) r3
            if (r8 == 0) goto L6a
            r5 = 1
            goto L6b
        L6a:
            r5 = r7
        L6b:
            defpackage.v.b(r0, r1, r3, r5)
            int r8 = r8 + 2
            goto L5b
        L71:
            r5 = 0
            defpackage.v.b(r0, r1, r3, r5)
        L75:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.toString():java.lang.String");
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udm {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = defpackage.sfy.av(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            defpackage.sij.o(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L71
            int[] r3 = defpackage.udl.a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L69;
                case 2: goto L68;
                case 3: goto L5f;
                case 4: goto L55;
                case 5: goto L4d;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                default: goto L2d;
            }
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L33:
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r3 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r5 = r5 & r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r5 | r3
            double r5 = java.lang.Double.longBitsToDouble(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L65
            r1 = r2
            goto L65
        L4d:
            if (r0 < 0) goto L50
            r1 = r2
        L50:
            boolean r5 = c(r5)
            goto L5c
        L55:
            if (r0 >= 0) goto L58
            r1 = r2
        L58:
            boolean r5 = c(r5)
        L5c:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L65
        L5f:
            boolean r5 = c(r5)
            r1 = r5 ^ 1
        L65:
            if (r1 == 0) goto L68
            int r0 = r0 + r2
        L68:
            return r0
        L69:
            boolean r5 = c(r5)
            defpackage.sfy.ak(r5)
            return r0
        L71:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = a(r5, r7)
            int r5 = r5 + (-52)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udm.a(double, java.math.RoundingMode):int");
    }

    public static boolean b(double d) {
        if (sfy.av(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(sfy.au(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean c(double d) {
        if (d > 0.0d && sfy.av(d)) {
            long jAu = sfy.au(d);
            if ((jAu & ((-1) + jAu)) == 0) {
                return true;
            }
        }
        return false;
    }
}

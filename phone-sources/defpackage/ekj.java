package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekj {
    public static final ekj a;
    public static final ekj b;
    public final long c;
    public final long d;

    static {
        ekj ekjVar = new ekj(0L, 0L);
        a = ekjVar;
        new ekj(Long.MAX_VALUE, Long.MAX_VALUE);
        new ekj(Long.MAX_VALUE, 0L);
        new ekj(0L, Long.MAX_VALUE);
        b = ekjVar;
    }

    public ekj(long j, long j2) {
        a.H(j >= 0);
        a.H(j2 >= 0);
        this.c = j;
        this.d = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r11, long r13, long r15) {
        /*
            r10 = this;
            long r0 = r10.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            long r0 = r10.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            return r11
        L11:
            java.lang.String r4 = defpackage.edt.a
            long r4 = r11 - r0
            long r0 = r0 ^ r11
            long r6 = r11 ^ r4
            long r8 = r10.d
            long r8 = defpackage.edt.aw(r11, r8)
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L25
            r4 = -9223372036854775808
        L25:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 > 0) goto L31
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 > 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            int r3 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r3 > 0) goto L3b
            int r3 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r3 > 0) goto L3b
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r0 == 0) goto L51
            if (r1 == 0) goto L51
            long r0 = r13 - r11
            long r11 = r15 - r11
            long r0 = java.lang.Math.abs(r0)
            long r11 = java.lang.Math.abs(r11)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 > 0) goto L56
            goto L53
        L51:
            if (r0 == 0) goto L54
        L53:
            return r13
        L54:
            if (r1 == 0) goto L57
        L56:
            return r15
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekj.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ekj ekjVar = (ekj) obj;
            if (this.c == ekjVar.c && this.d == ekjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}

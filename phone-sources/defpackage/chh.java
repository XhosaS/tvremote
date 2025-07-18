package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chh {
    private final cho a;
    private int b = -1;
    private float c;

    public chh(cho choVar) {
        this.a = choVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float e(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L1a
            cho r2 = r5.a
            android.text.Layout r3 = r2.d
            int r3 = defpackage.ccf.L(r3, r6)
            int r4 = r2.m(r3)
            int r2 = r2.j(r3)
            if (r6 == r4) goto L18
            if (r6 != r2) goto L1a
        L18:
            r2 = r0
            goto L1b
        L1a:
            r2 = r1
        L1b:
            int r3 = r6 * 4
            if (r9 == 0) goto L23
            if (r2 == 0) goto L28
            r0 = r1
            goto L28
        L23:
            if (r2 == 0) goto L27
            r0 = 2
            goto L28
        L27:
            r0 = 3
        L28:
            int r3 = r3 + r0
            int r0 = r5.b
            if (r0 != r3) goto L30
            float r6 = r5.c
            return r6
        L30:
            if (r9 == 0) goto L39
            cho r9 = r5.a
            float r6 = r9.e(r6, r7)
            goto L3f
        L39:
            cho r9 = r5.a
            float r6 = r9.f(r6, r7)
        L3f:
            if (r8 == 0) goto L45
            r5.b = r3
            r5.c = r6
        L45:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chh.e(int, boolean, boolean, boolean):float");
    }

    public final float a(int i) {
        return e(i, false, false, true);
    }

    public final float b(int i) {
        return e(i, true, true, true);
    }

    public final float c(int i) {
        return e(i, false, false, false);
    }

    public final float d(int i) {
        return e(i, true, true, false);
    }
}

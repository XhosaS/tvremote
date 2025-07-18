package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwi extends lwn {
    private final float f;
    private final float g;
    private final float h;

    public lwi(int i, int i2, int i3, boolean z) {
        super(i, i2, z);
        this.f = (i3 & 511) / 511.0f;
        this.g = ((i3 >> 9) & 511) / 511.0f;
        this.h = ((i3 >> 18) & 511) / 511.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // defpackage.lwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lwo a(int r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            boolean r0 = r6.d(r7)
            if (r0 == 0) goto L2b
            lwn r0 = r6.e
            boolean r1 = r0 instanceof defpackage.lwi
            if (r1 == 0) goto L2b
            lwi r0 = (defpackage.lwi) r0
            float r1 = r6.f
            int r2 = r0.b
            float r3 = r0.f
            float r1 = r6.b(r7, r1, r2, r3)
            float r1 = r1 * r8
            float r3 = r6.g
            float r4 = r0.g
            float r3 = r6.b(r7, r3, r2, r4)
            float r9 = r9 * r3
            float r3 = r6.h
            float r0 = r0.h
            float r7 = r6.b(r7, r3, r2, r0)
            goto L34
        L2b:
            float r7 = r6.f
            float r1 = r8 * r7
            float r7 = r6.g
            float r9 = r9 * r7
            float r7 = r6.h
        L34:
            float r8 = r8 * r7
            r2 = r9
            double r9 = (double) r10
            r3 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r9 = r9 / r3
            double r9 = java.lang.Math.sqrt(r9)
            float r7 = (float) r9
            float r3 = java.lang.Math.max(r8, r7)
            lwo r0 = new lwo
            r5 = 0
            r4 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwi.a(int, float, float, float):lwo");
    }
}

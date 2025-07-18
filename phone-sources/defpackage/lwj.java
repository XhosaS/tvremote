package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwj extends lwn {
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    public lwj(int i, int i2, long j, boolean z) {
        super(i, i2, z);
        this.f = (j & 511) / 511.0f;
        this.g = ((j >> 9) & 511) / 511.0f;
        this.h = (511 & (j >> 18)) / 511.0f;
        this.i = (((j >> 27) & 127) * 360) / 120.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    @Override // defpackage.lwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lwo a(int r10, float r11, float r12, float r13) {
        /*
            r9 = this;
            boolean r0 = r9.d(r10)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L4b
            lwn r0 = r9.e
            boolean r2 = r0 instanceof defpackage.lwj
            if (r2 == 0) goto L4b
            lwj r0 = (defpackage.lwj) r0
            float r2 = r9.f
            int r3 = r0.b
            float r4 = r0.f
            float r2 = r9.b(r10, r2, r3, r4)
            float r2 = r2 * r11
            float r4 = r9.g
            float r5 = r0.g
            float r4 = r9.b(r10, r4, r3, r5)
            float r12 = r12 * r4
            float r4 = r9.h
            float r5 = r0.h
            float r4 = r9.b(r10, r4, r3, r5)
            float r11 = r11 * r4
            float r11 = r11 / r1
            float r1 = r9.i
            float r0 = r0.i
            float r4 = r0 - r1
            r5 = 1127481344(0x43340000, float:180.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 1135869952(0x43b40000, float:360.0)
            if (r4 <= 0) goto L3e
            float r1 = r1 + r6
            goto L45
        L3e:
            float r4 = r1 - r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            float r0 = r0 + r6
        L45:
            float r10 = r9.b(r10, r1, r3, r0)
            float r10 = r10 % r6
            goto L58
        L4b:
            float r10 = r9.f
            float r2 = r11 * r10
            float r10 = r9.g
            float r12 = r12 * r10
            float r10 = r9.h
            float r11 = r11 * r10
            float r11 = r11 / r1
            float r10 = r9.i
        L58:
            r8 = r10
            r5 = r12
            r4 = r2
            double r12 = (double) r13
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r12 = r12 / r0
            r0 = 4608683618854764544(0x3ff5555560000000, double:1.3333333730697632)
            double r12 = r12 / r0
            double r12 = java.lang.Math.sqrt(r12)
            float r10 = (float) r12
            float r6 = java.lang.Math.max(r11, r10)
            r10 = 1068149419(0x3faaaaab, float:1.3333334)
            float r7 = r6 * r10
            lwo r3 = new lwo
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwj.a(int, float, float, float):lwo");
    }
}

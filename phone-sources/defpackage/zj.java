package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zj extends bko implements byl {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public zj(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long i(defpackage.clx r7) {
        /*
            r6 = this;
            float r0 = r6.c
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.c
            int r0 = r7.cu(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.d
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.d
            int r3 = r7.cu(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.a
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.a
            int r4 = r7.cu(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.b
            int r7 = r7.cu(r5)
            if (r7 >= 0) goto L52
            r7 = r2
        L52:
            if (r7 <= r3) goto L55
            r7 = r3
        L55:
            if (r7 != r1) goto L58
            goto L59
        L58:
            r2 = r7
        L59:
            long r0 = defpackage.clw.d(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj.i(clx):long");
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        int iD;
        int iB;
        int iC;
        int iA;
        long jD;
        long jI = i(bvvVar);
        if (this.e) {
            jD = clw.f(j, jI);
        } else {
            if (Float.isNaN(this.a)) {
                iD = clv.d(j);
                int iB2 = clv.b(jI);
                if (iD > iB2) {
                    iD = iB2;
                }
            } else {
                iD = clv.d(jI);
            }
            if (Float.isNaN(this.c)) {
                iB = clv.b(j);
                int iD2 = clv.d(jI);
                if (iB < iD2) {
                    iB = iD2;
                }
            } else {
                iB = clv.b(jI);
            }
            if (Float.isNaN(this.b)) {
                iC = clv.c(j);
                int iA2 = clv.a(jI);
                if (iC > iA2) {
                    iC = iA2;
                }
            } else {
                iC = clv.c(jI);
            }
            if (Float.isNaN(this.d)) {
                iA = clv.a(j);
                int iC2 = clv.c(jI);
                if (iA < iC2) {
                    iA = iC2;
                }
            } else {
                iA = clv.a(jI);
            }
            jD = clw.d(iD, iB, iC, iA);
        }
        bwj bwjVarU = bvsVar.u(jD);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new zn(bwjVarU, 1));
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        long jI = i(buzVar);
        if (clv.i(jI)) {
            return clv.a(jI);
        }
        if (!this.e) {
            i = clw.c(jI, i);
        }
        return clw.b(jI, buyVar.c(i));
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        long jI = i(buzVar);
        if (clv.j(jI)) {
            return clv.b(jI);
        }
        if (!this.e) {
            i = clw.b(jI, i);
        }
        return clw.c(jI, buyVar.d(i));
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        long jI = i(buzVar);
        if (clv.i(jI)) {
            return clv.a(jI);
        }
        if (!this.e) {
            i = clw.c(jI, i);
        }
        return clw.b(jI, buyVar.e(i));
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        long jI = i(buzVar);
        if (clv.j(jI)) {
            return clv.b(jI);
        }
        if (!this.e) {
            i = clw.b(jI, i);
        }
        return clw.c(jI, buyVar.f(i));
    }
}

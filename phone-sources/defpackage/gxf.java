package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxf extends cbp implements bve, blt {
    private final bqh a;
    private final bkd b;
    private final buo c;
    private final float d;
    private final bnr e;

    public gxf(bqh bqhVar, bkd bkdVar, buo buoVar, float f) {
        super(null, null);
        this.a = bqhVar;
        this.b = bkdVar;
        this.c = buoVar;
        this.d = f;
        this.e = null;
    }

    private final long ab(long j) {
        if (bna.e(j)) {
            return 0L;
        }
        long jA = this.a.a();
        if (jA == 9205357640488583168L) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        return fh.Q(jFloatToRawIntBits, this.c.a(jFloatToRawIntBits, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long ac(long r14) {
        /*
            r13 = this;
            boolean r0 = defpackage.clv.i(r14)
            boolean r1 = defpackage.clv.j(r14)
            r2 = 0
            if (r1 == 0) goto L11
            if (r0 != 0) goto Lf
            r0 = r2
            goto L11
        Lf:
            r6 = r14
            goto L41
        L11:
            boolean r3 = defpackage.clv.h(r14)
            if (r3 == 0) goto L1e
            boolean r3 = defpackage.clv.g(r14)
            if (r3 == 0) goto L1e
            r2 = 1
        L1e:
            bqh r3 = r13.a
            long r3 = r3.a()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L42
            if (r2 == 0) goto Lf
            int r8 = defpackage.clv.b(r14)
            int r10 = defpackage.clv.a(r14)
            r11 = 0
            r12 = 10
            r9 = 0
            r6 = r14
            long r14 = defpackage.clv.k(r6, r8, r9, r10, r11, r12)
            return r14
        L41:
            return r6
        L42:
            r6 = r14
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r2 == 0) goto L5b
            if (r1 != 0) goto L50
            if (r0 == 0) goto L5b
        L50:
            int r0 = defpackage.clv.b(r6)
            int r1 = defpackage.clv.a(r6)
            float r1 = (float) r1
            float r0 = (float) r0
            goto La7
        L5b:
            long r0 = r3 >> r5
            long r3 = r3 & r14
            int r2 = (int) r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r1 = java.lang.Float.intBitsToFloat(r2)
            float r2 = java.lang.Math.abs(r0)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L84
            long r8 = defpackage.gxj.a
            int r2 = defpackage.clv.d(r6)
            int r4 = defpackage.clv.b(r6)
            float r2 = (float) r2
            float r4 = (float) r4
            float r0 = defpackage.ykn.i(r0, r2, r4)
            goto L89
        L84:
            int r0 = defpackage.clv.d(r6)
            float r0 = (float) r0
        L89:
            float r2 = java.lang.Math.abs(r1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto La2
            long r2 = defpackage.gxj.a
            int r2 = defpackage.clv.c(r6)
            int r3 = defpackage.clv.a(r6)
            float r2 = (float) r2
            float r3 = (float) r3
            float r1 = defpackage.ykn.i(r1, r2, r3)
            goto La7
        La2:
            int r1 = defpackage.clv.c(r6)
            float r1 = (float) r1
        La7:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r5
            long r0 = r0 & r14
            long r0 = r0 | r2
            long r0 = r13.ab(r0)
            long r2 = r0 >> r5
            long r14 = r14 & r0
            int r14 = (int) r14
            int r15 = (int) r2
            float r15 = java.lang.Float.intBitsToFloat(r15)
            float r14 = java.lang.Float.intBitsToFloat(r14)
            int r15 = defpackage.yln.v(r15)
            int r2 = defpackage.clw.c(r6, r15)
            int r14 = defpackage.yln.v(r14)
            int r4 = defpackage.clw.b(r6, r14)
            r5 = 0
            r0 = r6
            r6 = 10
            r3 = 0
            long r14 = defpackage.clv.k(r0, r2, r3, r4, r5, r6)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxf.ac(long):long");
    }

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return bdi.y(this, obj, yjzVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return bdi.z(this, yjvVar);
    }

    @Override // defpackage.blt
    public final void d(byu byuVar) throws Throwable {
        byu byuVar2;
        long jAb = ab(byuVar.n());
        long jA = this.b.a(gxj.a(jAb), gxj.a(byuVar.n()), byuVar.o());
        float fA = cmf.a(jA);
        float fB = cmf.b(jA);
        byuVar.p().c.y(fA, fB);
        float f = -fA;
        float f2 = -fB;
        try {
            byuVar2 = byuVar;
        } catch (Throwable th) {
            th = th;
            byuVar2 = byuVar;
        }
        try {
            this.a.e(byuVar2, jAb, this.d, null);
            byuVar2.p().c.y(f, f2);
            byuVar2.r();
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            byuVar2.p().c.y(f, f2);
            throw th3;
        }
    }

    @Override // defpackage.bve
    public final int e(buz buzVar, buy buyVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return buyVar.c(i);
        }
        return Math.max(yln.v(Float.intBitsToFloat((int) (ab((Float.floatToRawIntBits(r5) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)) & 4294967295L))), buyVar.c(clv.b(ac(clw.k(i, 0, 13)))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxf)) {
            return false;
        }
        gxf gxfVar = (gxf) obj;
        if (!yks.e(this.a, gxfVar.a) || !yks.e(this.b, gxfVar.b) || !yks.e(this.c, gxfVar.c) || Float.compare(this.d, gxfVar.d) != 0) {
            return false;
        }
        bnr bnrVar = gxfVar.e;
        return yks.e(null, null);
    }

    @Override // defpackage.bve
    public final int h(buz buzVar, buy buyVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return buyVar.d(i);
        }
        int iD = buyVar.d(clv.a(ac(clw.k(0, i, 7))));
        return Math.max(yln.v(Float.intBitsToFloat((int) (ab((Float.floatToRawIntBits(i) & 4294967295L) | (Float.floatToRawIntBits(iD) << 32)) >> 32))), iD);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    @Override // defpackage.bve
    public final int i(buz buzVar, buy buyVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return buyVar.e(i);
        }
        return Math.max(yln.v(Float.intBitsToFloat((int) (ab((Float.floatToRawIntBits(r5) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)) & 4294967295L))), buyVar.e(clv.b(ac(clw.k(i, 0, 13)))));
    }

    @Override // defpackage.bve
    public final int j(buz buzVar, buy buyVar, int i) {
        if (this.a.a() == 9205357640488583168L) {
            return buyVar.f(i);
        }
        int iF = buyVar.f(clv.a(ac(clw.k(0, i, 7))));
        return Math.max(yln.v(Float.intBitsToFloat((int) (ab((Float.floatToRawIntBits(i) & 4294967295L) | (Float.floatToRawIntBits(iF) << 32)) >> 32))), iF);
    }

    @Override // defpackage.bve
    public final bvu k(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(ac(j));
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new gxb(bwjVarU, 2));
    }

    public final String toString() {
        return "ContentPainterModifier(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=null)";
    }
}

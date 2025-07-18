package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoy {
    public static final ni a;

    static {
        new ni(0.2f, 0.0f, 0.8f, 1.0f);
        new ni(0.4f, 0.0f, 1.0f, 1.0f);
        new ni(0.0f, 0.0f, 0.65f, 1.0f);
        new ni(0.1f, 0.0f, 0.45f, 1.0f);
        a = new ni(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void a(bpq bpqVar, float f, float f2, long j, bpt bptVar) {
        float fC = bna.c(bpqVar.n());
        float f3 = bptVar.a / 2.0f;
        float f4 = fC - (f3 + f3);
        bpqVar.v(j, f, f2, a.j(f3, f3), a.j(f4, f4), bptVar);
    }

    public static final void b(bkp bkpVar, long j, float f, long j2, int i, bao baoVar, final int i2) {
        final bkp bkpVar2;
        final long jH;
        long j3;
        final float f2;
        int i3;
        ny nyVar;
        bkp bkpVar3;
        final long j4;
        bao baoVar2;
        final long j5;
        final float f3;
        final long j6;
        final int i4;
        bao baoVarD = baoVar.d(-1119119072);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 = i2 | 22;
        }
        int i6 = i5 | 3456;
        if ((i2 & 24576) == 0) {
            i6 = i5 | 11648;
        }
        if ((i6 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            j6 = j;
            f3 = f;
            j5 = j2;
            i4 = i;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                jH = kv.B(baoVarD).h();
                j3 = bnq.f;
                f2 = 4.0f;
                i3 = 2;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                jH = j;
                f2 = f;
                j3 = j2;
                i3 = i;
            }
            baoVarD.m();
            final bpt bptVar = new bpt(((clx) baoVarD.f(ccq.d)).cr(f2), 0.0f, i3, 0, 26);
            ny nyVarD = og.d(baoVarD);
            bhi bhiVar = pm.b;
            nl nlVar = no.c;
            int i7 = i3;
            final bdy bdyVarO = og.O(nyVarD, 0, 5, bhiVar, fh.h(fh.i(6660, nlVar, 2), 0, 6), baoVarD, 33208);
            final bdy bdyVarC = og.c(nyVarD, 0.0f, 286.0f, fh.h(fh.i(1332, nlVar, 2), 0, 6), baoVarD, 4536);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new afh(17);
                basVar.ae(objT);
            }
            final bdy bdyVarC2 = og.c(nyVarD, 0.0f, 290.0f, fh.h(fh.f((yjv) objT), 0, 6), baoVarD, 4536);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                nyVar = nyVarD;
                objT2 = new afh(18);
                basVar.ae(objT2);
            } else {
                nyVar = nyVarD;
            }
            final bdy bdyVarC3 = og.c(nyVar, 0.0f, 290.0f, fh.h(fh.f((yjv) objT2), 0, 6), baoVarD, 4536);
            long j7 = j3;
            bkp bkpVarD = zi.d(cfd.b(bkpVar2, true, new pl(6)), 40.0f);
            boolean zH = ((i6 & 7168) == 2048) | baoVarD.H(bptVar) | baoVarD.F(bdyVarO) | baoVarD.F(bdyVarC2) | baoVarD.F(bdyVarC3) | baoVarD.F(bdyVarC);
            boolean z = (i6 & 896) == 256;
            boolean zE = baoVarD.E(jH);
            boolean z2 = z | zH;
            Object objT3 = basVar.T();
            if ((z2 || zE) || objT3 == obj) {
                bkpVar3 = bkpVarD;
                j4 = j7;
                yjv yjvVar = new yjv() { // from class: aow
                    @Override // defpackage.yjv
                    public final Object a(Object obj2) {
                        long j8 = j4;
                        bpt bptVar2 = bptVar;
                        bpq bpqVar = (bpq) obj2;
                        aoy.a(bpqVar, 0.0f, 360.0f, j8, bptVar2);
                        float fIntValue = ((Number) bdyVarO.a()).intValue();
                        float fFloatValue = ((Number) bdyVarC2.a()).floatValue();
                        bdy bdyVar = bdyVarC3;
                        aoy.a(bpqVar, ((Number) bdyVar.a()).floatValue() + (((fIntValue * 216.0f) % 360.0f) - 90.0f) + ((Number) bdyVarC.a()).floatValue() + (a.r(bptVar2.c, 0) ? 0.0f : ((f2 / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(fFloatValue - ((Number) bdyVar.a()).floatValue()), 0.1f), jH, bptVar2);
                        return ygi.a;
                    }
                };
                basVar.ae(yjvVar);
                objT3 = yjvVar;
            } else {
                bkpVar3 = bkpVarD;
                j4 = j7;
            }
            ht.i(bkpVar3, (yjv) objT3, baoVarD, 0);
            baoVar2 = baoVarD;
            j5 = j4;
            f3 = f2;
            j6 = jH;
            i4 = i7;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aox
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    bao baoVar3 = (bao) obj2;
                    ((Integer) obj3).intValue();
                    bkp bkpVar4 = bkpVar2;
                    long j8 = j6;
                    float f4 = f3;
                    int i8 = i2;
                    aoy.b(bkpVar4, j8, f4, j5, i4, baoVar3, bdi.n(i8 | 1));
                    return ygi.a;
                }
            };
        }
    }
}

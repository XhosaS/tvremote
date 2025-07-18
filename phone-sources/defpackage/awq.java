package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awq {
    public static final bcp a = new bbl(bcz.c, new awl(0));

    public static final bkp a(bkp bkpVar, bol bolVar, long j, qs qsVar, float f) {
        bol bolVar2;
        bkp bkpVarD;
        bkp bkpVarM;
        if (f > 0.0f) {
            bolVar2 = bolVar;
            bkpVarD = bny.d(bkp.g, 0.0f, 0.0f, 0.0f, f, bolVar2, 124895);
        } else {
            bolVar2 = bolVar;
            bkpVarD = bkp.g;
        }
        bkp bkpVarA = bkpVar.a(bkpVarD);
        if (qsVar != null) {
            bkpVarM = ht.m(bkp.g, 1.0f, qsVar.b, bolVar2);
        } else {
            bkpVarM = bkp.g;
        }
        return bga.w(hq.f(bkpVarA.a(bkpVarM), j, bolVar2), bolVar2);
    }

    public static final /* synthetic */ long b(long j, float f, bao baoVar) {
        arl arlVarK = wv.K(baoVar);
        boolean zBooleanValue = ((Boolean) baoVar.f(arm.b)).booleanValue();
        long j2 = arlVarK.p;
        long j3 = bnq.a;
        if (!a.s(j, j2) || !zBooleanValue) {
            return j;
        }
        if (cma.b(f, 0.0f)) {
            return j2;
        }
        float fLog = (float) Math.log(f + 1.0f);
        long j4 = arlVarK.t;
        return bny.m(bny.k(bnq.d(j4), bnq.c(j4), bnq.b(j4), ((fLog * 4.5f) + 2.0f) / 100.0f, bnq.f(j4)), j2);
    }

    public static final void c(bkp bkpVar, bol bolVar, long j, long j2, float f, float f2, yjz yjzVar, bao baoVar, int i) {
        if ((i & 1) != 0) {
            bkpVar = bkp.g;
        }
        bkp bkpVar2 = bkpVar;
        if ((i & 2) != 0) {
            bolVar = boh.a;
        }
        bol bolVar2 = bolVar;
        long j3 = (i & 4) != 0 ? wv.K(baoVar).p : j;
        long jB = (i & 8) != 0 ? arm.b(j3, baoVar) : j2;
        float f3 = (i & 16) != 0 ? 0.0f : f;
        float f4 = (i & 32) != 0 ? 0.0f : f2;
        bcp bcpVar = a;
        float f5 = ((cma) baoVar.f(bcpVar)).a + f3;
        bcm.j(new bcq[]{arr.a.c(new bnq(jB)), bcpVar.c(new cma(f5))}, bga.k(421772006, new awn(bkpVar2, bolVar2, j3, f5, f4, yjzVar, 0), baoVar), baoVar, 56);
    }

    public static final void d(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, long j, long j2, float f, qs qsVar, kw kwVar, yjz yjzVar, bao baoVar, int i) {
        char c;
        bkp bkpVar2 = (i & 2) != 0 ? bkp.g : bkpVar;
        boolean z2 = (!((i & 4) == 0)) | z;
        bol bolVar2 = (i & 8) != 0 ? boh.a : bolVar;
        long j3 = (i & 16) != 0 ? wv.K(baoVar).p : j;
        long jB = (i & 32) != 0 ? arm.b(j3, baoVar) : j2;
        float f2 = (i & 128) != 0 ? 0.0f : f;
        qs qsVar2 = (i & 256) != 0 ? null : qsVar;
        kw kwVar2 = (i & 512) != 0 ? null : kwVar;
        if (kwVar2 == null) {
            baoVar.x(-1701037204);
            bas basVar = (bas) baoVar;
            Object objT = basVar.T();
            c = 0;
            if (objT == ban.a) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            basVar.aa();
            kwVar2 = (kw) objT;
        } else {
            c = 0;
            baoVar.x(2023337163);
            ((bas) baoVar).aa();
        }
        bcp bcpVar = a;
        float f3 = ((cma) baoVar.f(bcpVar)).a + 0.0f;
        bcq[] bcqVarArr = new bcq[2];
        bcqVarArr[c] = arr.a.c(new bnq(jB));
        bcqVarArr[1] = bcpVar.c(new cma(f3));
        bcm.j(bcqVarArr, bga.k(849208527, new awo(bkpVar2, bolVar2, j3, f3, qsVar2, kwVar2, z2, yjkVar, f2, yjzVar), baoVar), baoVar, 56);
    }
}

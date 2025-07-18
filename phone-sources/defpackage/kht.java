package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.OffsetPxElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kht {
    public static final kht a = new kht();

    private kht() {
    }

    public final void a(bqh bqhVar, int i, bao baoVar, int i2) {
        bqh bqhVar2;
        int i3;
        bao baoVar2;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(907607141);
        if (i4 == 0) {
            bqhVar2 = bqhVar;
            i3 = i2 | (true != baoVarD.H(bqhVar2) ? 2 : 4);
        } else {
            bqhVar2 = bqhVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.D(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            xf xfVarE = xk.e(8.0f);
            bkm bkmVar = bkp.g;
            bvt bvtVarA = zf.a(xfVarE, bkb.m, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkmVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            rdd.z(bqhVar2, null, zi.d(bkmVar, 18.0f), 0L, baoVarD, (i3 & 14) | 432, 8);
            baoVar2 = baoVarD;
            String string = context.getString(i);
            string.getClass();
            rdd.p(string, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar2).j, baoVar2, 0, 0, 65534);
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aba(this, bqhVar, i, i2, 2);
        }
    }

    public final void b(xr xrVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1752661315);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(xrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarD = zi.d(bkpVar, 48.0f);
            long j = wv.K(baoVarD).r;
            aeh aehVar = aep.a;
            xo.b(xrVar.a(bga.w(hq.f(bkpVarD, j, aehVar), aehVar), bkb.e), baoVarD, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(this, xrVar, bkpVar, i, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [bdy, java.lang.Object] */
    public final void d(xr xrVar, iom iomVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 48;
        bao baoVarD = baoVar.d(623269674);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(iomVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 145) == 144 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (((Boolean) iomVar.c.a()).booleanValue()) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new ahm((Object) this, xrVar, (Object) iomVar, bkpVar, i, 17);
                    return;
                }
                return;
            }
            bkp bkpVarA = zi.a(bkpVar, 1.0f);
            bvt bvtVarA = xu.a(xk.e(4.0f), bkb.k, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bcp bcpVar = arr.a;
            long j = wv.K(baoVarD).A;
            bcm.i(bcpVar.c(new bnq(bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.8f, bnq.f(j)))), khf.b, baoVarD, 56);
            baoVarD.o();
        }
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new ahm((Object) this, xrVar, (Object) iomVar, bkpVar, i, 18);
        }
    }

    public final void e(iom iomVar, bkp bkpVar, ykb ykbVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        ykb ykbVar2;
        bao baoVarD = baoVar.d(889335470);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.F(iomVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            ykbVar2 = ykbVar;
        } else {
            bkm bkmVar = bkp.g;
            ykb ykbVar3 = khf.a;
            khr khrVarG = iomVar.g();
            bdy bdyVarBR = a.bR(iomVar.g(), baoVarD);
            bdy bdyVarC = mu.c(khrVarG.a, baoVarD);
            bdy bdyVarC2 = mu.c(khrVarG.b, baoVarD);
            baoVarD.x(-1633490746);
            boolean z = (i3 & 14) == 4;
            boolean zF = baoVarD.F(khrVarG) | z;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = new jzx(iomVar, khrVarG, 14);
                basVar.ae(objT);
            }
            yjk yjkVar = (yjk) objT;
            basVar.aa();
            bkp bkpVarW = bga.w(bkmVar.a(zi.c), kdw.k(baoVarD));
            baoVarD.x(-1633490746);
            boolean zF2 = baoVarD.F(bdyVarBR) | z;
            Object objT2 = basVar.T();
            if (zF2 || objT2 == ban.a) {
                objT2 = new jzu(iomVar, bdyVarBR, 8);
                basVar.ae(objT2);
            }
            basVar.aa();
            bkp bkpVarS = fh.S(bkpVarW, (yjv) objT2);
            ygi ygiVar = ygi.a;
            baoVarD.x(-1746271574);
            boolean zF3 = z | baoVarD.F(yjkVar) | baoVarD.F(bdyVarBR);
            Object objT3 = basVar.T();
            if (zF3 || objT3 == ban.a) {
                objT3 = new khs(yjkVar, iomVar, bdyVarBR);
                basVar.ae(objT3);
            }
            basVar.aa();
            bkp bkpVarA = btm.a(bkpVarS, ygiVar, (PointerInputEventHandler) objT3);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            xs xsVar = xs.a;
            baoVarD.x(-1633490746);
            boolean zF4 = baoVarD.F(bdyVarC) | baoVarD.F(bdyVarC2);
            Object objT4 = basVar.T();
            if (zF4 || objT4 == ban.a) {
                objT4 = new jzu(bdyVarC, bdyVarC2, 9, null);
                basVar.ae(objT4);
            }
            basVar.aa();
            ykbVar3.a(xsVar, new OffsetPxElement((yjv) objT4), baoVarD, Integer.valueOf((i3 & 896) | 6));
            baoVarD.o();
            bkpVar2 = bkmVar;
            ykbVar2 = ykbVar3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, iomVar, bkpVar2, ykbVar2, i, 19);
        }
    }
}

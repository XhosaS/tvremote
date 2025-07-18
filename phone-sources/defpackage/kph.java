package defpackage;

import androidx.compose.foundation.layout.SizeElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kph {
    private static final aeh b = aep.a(8.0f);
    private static final float a = 16.0f;

    public static final void a(kpe kpeVar, bao baoVar, int i) {
        int i2;
        int i3;
        bao baoVar2;
        int i4 = i & 6;
        bao baoVarD = baoVar.d(-1686138639);
        if (i4 == 0) {
            i2 = (true != baoVarD.F(kpeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            i3 = 3;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarA = zi.a(bkmVar, 1.0f);
            bvt bvtVarA = zf.a(xk.f, bkb.m, baoVarD, 54);
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
            bkp bkpVarA2 = zh.a(bkmVar, 1.0f, true);
            i3 = 3;
            String str = kpeVar.a;
            chc chcVar = wv.N(baoVarD).j;
            long j = kpeVar.e;
            baoVar2 = baoVarD;
            axa.b(str, bkpVarA2, j, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, chcVar, baoVar2, 0, 24960, 110584);
            asg.a(ccf.y(R.drawable.gs_arrow_outward_vd_theme_24, baoVar2, 0), null, zi.d(bkmVar, 24.0f), j, baoVar2, 432, 0);
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kny(kpeVar, i, i3);
        }
    }

    public static final void b(kpe kpeVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yy yyVar;
        int i3;
        yjz yjzVar;
        yjz yjzVar2;
        bao baoVar2;
        int i4 = i & 6;
        bao baoVarD = baoVar.d(1188064015);
        if (i4 == 0) {
            i2 = (true != baoVarD.F(kpeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bkp bkpVarA = zi.a(bkpVar, 1.0f);
            String str = kpeVar.d;
            if (str != null) {
                yy yyVar2 = kpf.a;
                yyVar = kpf.a;
            } else {
                yy yyVar3 = kpf.a;
                yyVar = kpf.b;
            }
            bkp bkpVarO = wv.o(bkpVarA, yyVar);
            bvt bvtVarA = zf.a(xk.a, bkb.m, baoVarD, 0);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarO);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar3 = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar3);
            yjz yjzVar4 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar4);
            yjz yjzVar5 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar5);
            }
            yjz yjzVar6 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar6);
            baoVarD.x(119146858);
            if (str != null) {
                yjzVar = yjzVar5;
                i3 = i2;
                yjzVar2 = yjzVar6;
                knh.d(str, bga.w(zi.d(bkp.g, 76.0f), b), bun.a, null, baoVarD, 3504, 16);
                float f = a;
                zy.k(new SizeElement(f, 0.0f, f, 0.0f, 10), baoVarD);
            } else {
                i3 = i2;
                yjzVar = yjzVar5;
                yjzVar2 = yjzVar6;
            }
            basVar.aa();
            bkm bkmVar = bkp.g;
            bkp bkpVarA2 = zh.a(bkmVar, 1.0f, true);
            bvt bvtVarA2 = xu.a(xk.f, bkb.j, baoVarD, 6);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar3);
            beb.a(baoVarD, bhuVarAi2, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar2);
            a(kpeVar, baoVarD, i3 & 14);
            zy.k(zi.b(bkmVar, 8.0f), baoVarD);
            baoVar2 = baoVarD;
            axa.b(kpeVar.b + " • " + kpeVar.c, zi.a(bkmVar, 1.0f), kpeVar.e, 0L, null, 0L, null, 0L, 2, false, str != null ? kpf.c : kpf.d, 0, null, wv.N(baoVarD).k, baoVar2, 48, 384, 110584);
            baoVar2.o();
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(kpeVar, bkpVar, i, 17);
        }
    }

    public static final void c(final kpe kpeVar, final yjk yjkVar, bkp bkpVar, bao baoVar, final int i) {
        int i2;
        final bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-660382710);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(kpeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            yy yyVar = kpf.a;
            bkp bkpVarO = wv.o(bkmVar, kpf.e);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarO);
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
            long j = kpeVar.e;
            bkpVar2 = bkmVar;
            og.x(yjkVar, zi.a(ht.l(bkmVar, 1.0f, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.32f, bnq.f(j)), kpf.f), 1.0f), false, null, og.C(bnq.f, 0L, 0L, 0L, baoVarD, 14), null, null, bga.k(321253253, new khb(kpeVar, 13), baoVarD), baoVarD, ((i3 >> 3) & 14) | 100663296, 236);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kpg
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kpe kpeVar2 = kpeVar;
                    int i4 = i;
                    yjk yjkVar3 = yjkVar;
                    int iN = bdi.n(i4 | 1);
                    kph.c(kpeVar2, yjkVar3, bkpVar2, (bao) obj, iN);
                    return ygi.a;
                }
            };
        }
    }
}

package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyv {
    public static final void A(yjk yjkVar, bkp bkpVar, long j, float f, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        float f2;
        long j2;
        bao baoVar2;
        yjzVar.getClass();
        bao baoVarD = baoVar.d(2023615499);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bkpVar2 = bkpVar;
            i2 |= true != baoVarD.F(bkpVar2) ? 16 : 32;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            j2 = j;
            f2 = f;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                f2 = 720.0f;
                j2 = wv.K(baoVarD).h;
            } else {
                baoVarD.t();
                j2 = j;
                f2 = f;
            }
            baoVarD.m();
            bkp bkpVarA = zi.a(bkpVar2, 1.0f);
            long j3 = atc.a;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            int i4 = 3;
            if (objT == obj) {
                objT = new aru(i4);
                basVar.ae(objT);
            }
            yjv yjvVar = (yjv) objT;
            auw auwVar = auw.a;
            my myVar = aut.a;
            clx clxVar = (clx) baoVarD.f(ccq.d);
            boolean zF = baoVarD.F(clxVar) | baoVarD.C(56.0f);
            Object objT2 = basVar.T();
            if (zF || objT2 == obj) {
                objT2 = new aoe(clxVar, 17);
                basVar.ae(objT2);
            }
            yjk yjkVar2 = (yjk) objT2;
            boolean zF2 = baoVarD.F(clxVar) | baoVarD.C(125.0f);
            Object objT3 = basVar.T();
            if (zF2 || objT3 == obj) {
                objT3 = new aoe(clxVar, 18);
                basVar.ae(objT3);
            }
            yjk yjkVar3 = (yjk) objT3;
            Object[] objArr = {false, yjvVar, false};
            bij bijVar = new bij(new xb(8), new gk(yjkVar2, yjkVar3, yjvVar, 11, (int[]) null));
            boolean zG = baoVarD.G(false) | baoVarD.G(false) | baoVarD.F(yjkVar2) | baoVarD.F(yjkVar3) | baoVarD.F(yjvVar);
            Object objT4 = basVar.T();
            if (zG || objT4 == obj) {
                objT4 = new nz(yjkVar2, yjkVar3, auwVar, yjvVar, 4, null);
                basVar.ae(objT4);
            }
            baoVar2 = baoVarD;
            atc.d(yjkVar, bkpVarA, (auv) bga.o(objArr, bijVar, (yjk) objT4, baoVarD, 0, 4), 0.0f, false, null, j2, 0L, 0L, kou.a, null, null, bga.k(1434105705, new kpa(f2, yjzVar), baoVarD), baoVar2, i3 & 14, 3078);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koz(yjkVar, bkpVar2, j2, f2, yjzVar, i, 0);
        }
    }

    private static String B(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        return className.substring(className.lastIndexOf(46) + 1) + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
    }

    public static final void a(String str, long j, bkp bkpVar, bao baoVar, int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1943718660);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != baoVarD.E(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
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
            bkm bkmVar = bkp.g;
            knh.d(str, bkmVar.a(zi.c), bun.a, null, baoVarD, (i2 & 14) | 3504, 16);
            bkp bkpVarA = bkmVar.a(zi.c);
            np npVar = kbf.a;
            xo.b(hq.g(bkpVarA, kbf.a(j2), null, 6), baoVarD, 0);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(str, j2, bkpVar, i, 7);
        }
    }

    public static final void b(final kca kcaVar, final ovq ovqVar, final long j, final String str, final yjk yjkVar, bkp bkpVar, final boolean z, final yjv yjvVar, bao baoVar, final int i) {
        int i2;
        ovq ovqVar2;
        bao baoVar2;
        bas basVar;
        final bkp bkpVar2;
        kcaVar.getClass();
        yjvVar.getClass();
        bao baoVarD = baoVar.d(-1909086430);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(kcaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ovqVar2 = ovqVar;
            i2 |= true != baoVarD.H(ovqVar2) ? 16 : 32;
        } else {
            ovqVar2 = ovqVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.E(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(str) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= true != baoVarD.G(z) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != baoVarD.H(yjvVar) ? 4194304 : 8388608;
        }
        int i4 = i3;
        if ((i4 & 4793491) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(false, bcz.c);
                basVar2.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar2.aa();
            bkp bkpVarF = hq.f(bkmVar.a(zi.c), j, boh.a);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarF);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            boolean z2 = (z && ((Boolean) bcbVar.a()).booleanValue()) ? false : true;
            np npVar = kbf.a;
            np npVar2 = kbf.a;
            kv.h(z2, null, mc.g(npVar2), mc.h(npVar2), null, bga.k(-426227072, new kbh(str, j), baoVarD), baoVarD, 196608);
            kv.h(((Boolean) bcbVar.a()).booleanValue(), null, mc.g(npVar2), mc.h(npVar2), null, bga.k(741429431, new kbj(j, ovqVar2, kcaVar, yjkVar, yjvVar, bcbVar), baoVarD), baoVarD, 196608);
            baoVar2 = baoVarD;
            Boolean boolValueOf = Boolean.valueOf(z);
            baoVar2.x(-1224400529);
            boolean zH = baoVar2.H(kcaVar) | ((i4 & 3670016) == 1048576);
            boolean z3 = (i4 & 29360128) == 8388608;
            Object objT2 = basVar2.T();
            if ((zH || z3) || objT2 == obj) {
                basVar = basVar2;
                avp avpVar = new avp(z, kcaVar, yjvVar, bcbVar, (yih) null, 3);
                basVar.ae(avpVar);
                objT2 = avpVar;
            } else {
                basVar = basVar2;
            }
            basVar.aa();
            bbn.f(boolValueOf, (yjz) objT2, baoVar2);
            xo.b(hq.g(zi.b(zi.a(bkmVar, 1.0f), 222.0f), new bof(yfm.s(new bnq(kbf.c), new bnq(kbf.d)), kbf.b), null, 6), baoVar2, 0);
            baoVar2.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kbg
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    kca kcaVar2 = kcaVar;
                    ovq ovqVar3 = ovqVar;
                    long j2 = j;
                    String str2 = str;
                    yjk yjkVar3 = yjkVar;
                    bkp bkpVar3 = bkpVar2;
                    boolean z4 = z;
                    jyv.b(kcaVar2, ovqVar3, j2, str2, yjkVar3, bkpVar3, z4, yjvVar, (bao) obj2, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void c(wst wstVar, ixm ixmVar, bkp bkpVar, bao baoVar, int i) {
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-1146830721);
        int i2 = (i & 6) == 0 ? i | (true != baoVarD.F(wstVar) ? 2 : 4) : i;
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(ixmVar) : baoVarD.H(ixmVar)) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarA = zi.a(bkmVar, 1.0f);
            bvt bvtVarA = zf.a(xk.e(8.0f), bkb.n, baoVarD, 54);
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
            baoVarD.x(-126207692);
            for (wkx wkxVar : wstVar.b) {
                bkp bkpVarA2 = zh.a(bkmVar, 1.0f, true);
                wkxVar.getClass();
                jbr.ag(ixmVar, wkxVar, bkpVarA2, null, baoVarD, ((i3 << 6) & 7168) | RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 4);
            }
            basVar.aa();
            baoVarD.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) wstVar, (Object) ixmVar, bkpVar2, i, 0);
        }
    }

    public static final void d(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2 = yjkVar;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-714501514);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            boolean zBooleanValue = ((Boolean) a.bH(kwVar, baoVarD, 6).a()).booleanValue();
            baoVarD.x(-1152988574);
            bdy bdyVarA = mu.a(zBooleanValue ? 32.0f : 16.0f, null, baoVarD, 14);
            float f = true != zBooleanValue ? 40.0f : 32.0f;
            bdy bdyVarA2 = mu.a(f, null, baoVarD, 14);
            bdy bdyVarA3 = mu.a(f, null, baoVarD, 14);
            bdy bdyVarA4 = mu.a(true != zBooleanValue ? 16.0f : 32.0f, null, baoVarD, 14);
            float f2 = ((cma) bdyVarA.a()).a;
            float f3 = ((cma) bdyVarA2.a()).a;
            float f4 = ((cma) bdyVarA3.a()).a;
            float f5 = ((cma) bdyVarA4.a()).a;
            baoVarD.x(-1224400529);
            boolean zC = baoVarD.C(f2) | baoVarD.C(f3) | baoVarD.C(f4) | baoVarD.C(f5);
            Object objT2 = basVar.T();
            if (zC || objT2 == obj) {
                objT2 = aep.b(((cma) bdyVarA2.a()).a, ((cma) bdyVarA.a()).a, ((cma) bdyVarA4.a()).a, ((cma) bdyVarA3.a()).a);
                basVar.ae(objT2);
            }
            aeh aehVar = (aeh) objT2;
            basVar.aa();
            basVar.aa();
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(bkpVar, 1.0f, wv.K(baoVarD).J, aehVar), aehVar), false, aehVar, rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), kwVar, bga.k(-348463274, new kgx(context, 7), baoVarD), baoVarD, (i2 & 14) | 1769472, 4);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 13);
        }
    }

    public static final void e(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(1995661782);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            bkp bkpVarK = zi.k(bkpVar, 40.0f, 0.0f, 2);
            yy yyVar = pog.a;
            yjkVar2 = yjkVar;
            qtl.aa(yjkVar2, bkpVarK, false, null, pog.d(baoVarD), ht.j(wv.K(baoVarD).B), new za(16.0f, 8.0f, 16.0f, 8.0f), bga.k(1959128228, new khb(context, 0), baoVarD), baoVarD, (i3 & 14) | 805306368);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 12);
        }
    }

    public static final void f(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(1333633654);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            bkp bkpVarK = zi.k(bkpVar, 40.0f, 0.0f, 2);
            yy yyVar = pog.a;
            yjkVar2 = yjkVar;
            qtl.aa(yjkVar2, bkpVarK, false, null, pog.d(baoVarD), ht.j(wv.K(baoVarD).B), new za(16.0f, 8.0f, 16.0f, 8.0f), bga.k(-1908965564, new khb(context, 1), baoVarD), baoVarD, (i3 & 14) | 805306368);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 11);
        }
    }

    public static final void g(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        bao baoVarD = baoVar.d(1269173766);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.e(bkpVar, rdd.H(1)), 1.0f, wv.K(baoVarD).I, rdd.F(baoVarD)), rdd.F(baoVarD)), false, rdd.F(baoVarD), rdd.G(wv.K(baoVarD).F, wv.K(baoVarD).s, baoVarD, 12), null, bga.k(1734865638, new kgx((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 6), baoVarD), baoVarD, (i3 & 14) | 1572864, 36);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 10);
        }
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "OTHER_ERROR";
            case 2:
                return "GENERIC_ERROR";
            case 3:
                return "SERVER_DATA_TO_MODEL_CONVERTING_ERROR";
            case 4:
                return "GUIDE_PAGE_LOADING_ERROR";
            case 5:
                return "GRPC_ERROR";
            case 6:
                return "VIDEO_REPOSITORIES_ERROR";
            default:
                return "null";
        }
    }

    public static String i(Object obj) {
        return obj == null ? "" : obj.getClass().getSimpleName();
    }

    public static String j(Throwable th) {
        StackTraceElement[] stackTrace;
        int length;
        if (th == null || (stackTrace = th.getStackTrace()) == null || (length = stackTrace.length) == 0) {
            return "";
        }
        String className = stackTrace[0].getClassName();
        return ((eci.class.getName().equals(className) || eci.class.getName().equals(className) || krf.class.getName().equals(className)) && length > 1) ? B(stackTrace[1]) : B(stackTrace[0]);
    }

    public static int k(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 1 : 5;
        }
        return 4;
    }

    public static int l(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 1 : 5;
        }
        return 4;
    }

    public static int m(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 3;
    }

    public static final /* synthetic */ kpu n(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (kpu) vucVarO;
    }

    public static final void o(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        kpu kpuVar = (kpu) vtwVar.b;
        kpu kpuVar2 = kpu.a;
        kpuVar.b = str;
    }

    public static final void p(boolean z, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        kpu kpuVar = (kpu) vtwVar.b;
        kpu kpuVar2 = kpu.a;
        kpuVar.c = z;
    }

    public static final void q(yjz yjzVar, bao baoVar, int i) {
        int i2;
        yjzVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(124103872);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            arl arlVar = kpr.a;
            bcm.i(arr.a.c(new bnq(arlVar.q)), bga.k(-697609856, new khi(arlVar, yjzVar, 9, null), baoVarD), baoVarD, 56);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kny(yjzVar, i, i4);
        }
    }

    public static final long r(float f, bao baoVar) {
        baoVar.x(-1159785067);
        long jCx = ((clx) baoVar.f(ccq.d)).cx(f);
        baoVar.p();
        return jCx;
    }

    public static final cfy s(String str, long j) {
        int iT;
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        cfw cfwVar = new cfw((byte[]) null);
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            int i2 = 1;
            if (str.charAt(i) == '<') {
                iT = ylh.T(str, '>', i, 4);
                if (iT <= i) {
                    String strSubstring = str.substring(i);
                    strSubstring.getClass();
                    cfwVar.c(strSubstring);
                    break;
                }
                int i3 = i + 1;
                String strSubstring2 = str.substring(i3, iT);
                strSubstring2.getClass();
                String lowerCase = strSubstring2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.length() > 0) {
                    if (ylh.N(lowerCase, '<')) {
                        int iT2 = ylh.T(str, '<', i3, 4);
                        String strSubstring3 = str.substring(i, iT2);
                        strSubstring3.getClass();
                        cfwVar.c(strSubstring3);
                        i = iT2;
                    } else if (ylh.ac(lowerCase, "/")) {
                        String strSubstring4 = lowerCase.substring(1);
                        strSubstring4.getClass();
                        if (!stack.isEmpty() && yks.e(stack.peek(), strSubstring4)) {
                            stack.pop();
                            if (!stack2.isEmpty()) {
                                stack2.pop();
                                cfwVar.d();
                            }
                        }
                    } else if (yks.e(lowerCase, "highlight") || yks.e(lowerCase, "i") || yks.e(lowerCase, "s")) {
                        stack.push(lowerCase);
                        int iHashCode = lowerCase.hashCode();
                        if (iHashCode != -681210700) {
                            if (iHashCode != 105) {
                                if (iHashCode == 115 && lowerCase.equals("s")) {
                                    stack2.push(new cgs(0L, (cji) null, (cje) null, (cjf) null, (ciy) null, 0L, (cld) null, 0L, cll.c, 61439));
                                }
                            } else if (lowerCase.equals("i")) {
                                stack2.push(new cgs(0L, (cji) null, new cje(i2), (cjf) null, (ciy) null, 0L, (cld) null, 0L, (cll) null, 65527));
                            }
                        } else if (lowerCase.equals("highlight")) {
                            stack2.push(new cgs(0L, (cji) null, (cje) null, (cjf) null, (ciy) null, 0L, (cld) null, j, (cll) null, 63487));
                        }
                        Object objPeek = stack2.peek();
                        objPeek.getClass();
                        cfv cfvVar = new cfv((cgs) objPeek, cfwVar.a.length(), 0, null, 12);
                        List list = cfwVar.b;
                        list.add(cfvVar);
                        cfwVar.c.add(cfvVar);
                        list.size();
                    }
                }
            } else {
                int iT3 = ylh.T(str, '<', i, 4);
                if (iT3 == -1) {
                    iT3 = str.length();
                }
                String strSubstring5 = str.substring(i, iT3);
                strSubstring5.getClass();
                cfwVar.c(strSubstring5);
                iT = iT3 - 1;
            }
            i = iT + 1;
        }
        return cfwVar.a();
    }

    public static final void t(kpc kpcVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(920701536);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(kpcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarA = zi.a(bkpVar, 1.0f);
            yy yyVar = kpd.a;
            bvt bvtVarA = xu.a(xk.e(kpd.b), bkb.j, baoVarD, 6);
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
            baoVarD.x(-1869726040);
            String str = kpcVar.a;
            if (str != null && str.length() != 0) {
                u(str, kpcVar.c, R.drawable.gs_thumb_up_vd_theme_24, ccf.d(bkp.g, "story_reviews_positive_content"), baoVarD, 3072);
            }
            basVar.aa();
            baoVarD.x(-1869715702);
            String str2 = kpcVar.b;
            if (str2 != null && str2.length() != 0) {
                u(str2, kpcVar.c, R.drawable.gs_thumb_down_vd_theme_24, ccf.d(bkp.g, "story_reviews_negative_content"), baoVarD, 3072);
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(kpcVar, bkpVar, i, i4);
        }
    }

    public static final void u(String str, long j, int i, bkp bkpVar, bao baoVar, int i2) {
        String str2;
        int i3;
        bao baoVar2;
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-229203538);
        if (i4 == 0) {
            str2 = str;
            i3 = (true != baoVarD.F(str2) ? 2 : 4) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.D(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bkp bkpVarA = zi.a(bkpVar, 1.0f);
            bkh bkhVar = bkb.m;
            yy yyVar = kpd.a;
            bvt bvtVarA = zf.a(xk.e(kpd.c), bkhVar, baoVarD, 54);
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
            asg.a(ccf.y(i, baoVarD, (i3 >> 6) & 14), null, wv.o(zi.d(bkp.g, 28.0f), kpd.a), j, baoVarD, ((i3 << 6) & 7168) | 432, 0);
            baoVar2 = baoVarD;
            axa.b(str2, null, j, 0L, null, 0L, null, 0L, 2, false, 0, 0, null, wv.N(baoVar2).g, baoVar2, (i3 & 14) | ((i3 << 3) & 896), 384, 126970);
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kns(str, j, i, bkpVar, i2, 2);
        }
    }

    public static final void v(wqq wqqVar, boolean z, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(273521772);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 128 : 256;
        } else {
            yjkVar2 = yjkVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            bvt bvtVarA = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar3 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar3);
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
            if (z) {
                baoVarD.x(-1692846923);
                baoVarD.x(-1855723291);
                if ((wqqVar.b & 1) != 0) {
                    wlx wlxVar = wqqVar.c;
                    if (wlxVar == null) {
                        wlxVar = wlx.a;
                    }
                    if (wlxVar.b == 3) {
                        wlx wlxVar2 = wqqVar.c;
                        if (wlxVar2 == null) {
                            wlxVar2 = wlx.a;
                        }
                        vun vunVar = (wlxVar2.b == 3 ? (wlw) wlxVar2.c : wlw.a).b;
                        vunVar.getClass();
                        if (!vunVar.isEmpty()) {
                            wlx wlxVar3 = wqqVar.c;
                            if (wlxVar3 == null) {
                                wlxVar3 = wlx.a;
                            }
                            wlw wlwVar = wlxVar3.b == 3 ? (wlw) wlxVar3.c : wlw.a;
                            wlwVar.getClass();
                            x(wlwVar, ccf.d(bkp.g, "story_header_thumbnail"), baoVarD, 48);
                            float f = 12.0f;
                            zy.k(new SizeElement(f, 0.0f, f, 0.0f, 10), baoVarD);
                        }
                    }
                }
                basVar.aa();
                String str = wqqVar.d;
                str.getClass();
                String str2 = wqqVar.e;
                str2.getClass();
                w(str, str2, zh.a(ccf.d(bkp.g, "story_header_content"), 1.0f, true), baoVarD, 0);
                float f2 = 16.0f;
                zy.k(new SizeElement(f2, 0.0f, f2, 0.0f, 10), baoVarD);
                basVar.aa();
            } else {
                baoVarD.x(-1692165698);
                zy.k(zh.a(bkp.g, 1.0f, true), baoVarD);
                basVar.aa();
            }
            bkp bkpVarD = ccf.d(bkp.g, "close_button");
            long j = kpb.a;
            og.I(yjkVar2, zi.d(bkpVarD, kpb.d), false, null, null, null, bga.k(931795310, new kie(context, 13), baoVarD), baoVarD, ((i2 >> 6) & 14) | 1572912, 60);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(wqqVar, z, yjkVar, bkpVar, i, 14);
        }
    }

    public static final void w(String str, String str2, bkp bkpVar, bao baoVar, int i) {
        String str3;
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-28541918);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != baoVarD.F(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            int i4 = 14;
            if (objT == ban.a) {
                objT = new kil(i4);
                basVar.ae(objT);
            }
            basVar.aa();
            bkp bkpVarB = cfd.b(bkpVar, true, (yjv) objT);
            bvt bvtVarA = xu.a(xk.e, bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarB);
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
            axa.b(str3, null, wv.K(baoVarD).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wv.N(baoVarD).i, baoVarD, i2 & 14, 24960, 110586);
            baoVarD.x(-1673956457);
            if (str2.length() > 0) {
                baoVar2 = baoVarD;
                axa.b(str2, bga.y(bkp.g, 0.6f), wv.K(baoVarD).q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wv.N(baoVarD).k, baoVar2, ((i2 >> 3) & 14) | 48, 24960, 110584);
            } else {
                baoVar2 = baoVarD;
            }
            basVar.aa();
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(str, str2, bkpVar, i, 20);
        }
    }

    public static final void x(wlw wlwVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        wlw wlwVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1346549953);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wlwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            wlwVar2 = wlwVar;
        } else {
            long j = kpb.a;
            aeh aehVar = kpb.f;
            bkp bkpVarP = wv.p(zi.d(ht.l(bga.w(bkpVar, aehVar), 1.0f, kpb.a, aehVar), kpb.b), kpb.c);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new kil(13);
                basVar.ae(objT);
            }
            basVar.aa();
            wlwVar2 = wlwVar;
            knh.c(wlwVar2, cfd.b(bkpVarP, false, (yjv) objT), null, baoVarD, i2 & 14, 12);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(wlwVar2, bkpVar, i, 15);
        }
    }

    public static final void y(kow kowVar, yjk yjkVar, bkp bkpVar, long j, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        long j2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(1218056496);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(kowVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            bkpVar2 = bkpVar;
            i2 |= true != baoVarD.F(bkpVar2) ? 128 : 256;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            j2 = j;
        } else {
            int i3 = i2 & (-7169);
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                j2 = wv.K(baoVarD).i;
            } else {
                baoVarD.t();
                j2 = j;
            }
            baoVarD.m();
            int i4 = i3 >> 3;
            A(yjkVar, bkpVar2, 0L, 0.0f, bga.k(-399357056, new aor(kowVar, j2, 4), baoVarD), baoVarD, (i4 & 14) | 24576 | (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koq(kowVar, yjkVar, bkpVar, j2, i, 5);
        }
    }

    public static final void z(kow kowVar, bkp bkpVar, long j, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(514247651);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(kowVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.E(j) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            sj sjVarI = hw.i(baoVarD);
            bkp bkpVarP = wv.p(hw.l(bkmVar, sjVarI, uv.a, (!((12 & 2) == 0)) | true, null, sjVarI.c, true, null).a(new ScrollingLayoutElement(sjVarI)), 16.0f);
            bvt bvtVarA = xu.a(xk.e(16.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarP);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            bkp bkpVarD = ccf.d(bkmVar, "title_text");
            bvt bvtVarA2 = zf.a(xk.e(8.0f), bkb.n, baoVarD, 54);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarD);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            String str = kowVar.c;
            bkp bkpVarW = bga.w(bkmVar, aep.a);
            yy yyVar = koy.a;
            knh.d(str, zi.d(bkpVarW, koy.b), null, null, baoVarD, 384, 24);
            baoVar2 = baoVarD;
            int i4 = i3 & 896;
            axa.b(kowVar.a, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar2).j, baoVar2, i4, 0, 131066);
            zy.k(zh.a(bkmVar, 1.0f, true), baoVar2);
            baoVar2.o();
            axa.b(kowVar.b, ccf.d(bkmVar, "subtitle_text"), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar2).k, baoVar2, i4 | 48, 0, 131064);
            baoVar2.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(kowVar, bkpVar2, j, i, 12);
        }
    }
}

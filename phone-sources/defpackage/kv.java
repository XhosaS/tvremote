package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import androidx.compose.animation.EnterExitTransitionElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kv {
    public kv() {
    }

    public static void A(apn apnVar, bkp bkpVar, yka ykaVar, bao baoVar, int i) {
        asb asbVar;
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1354335728);
        int i4 = i3 == 0 ? (true != ((i & 8) == 0 ? baoVarD.F(apnVar) : baoVarD.H(apnVar)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 128 : 256;
        }
        if ((i4 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new asb(null);
                basVar.ae(objT);
            }
            asb asbVar2 = (asb) objT;
            baoVarD.f(AndroidCompositionLocals_androidKt.a);
            Resources resources = ((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b)).getResources();
            int i5 = 6;
            String string = a.r(7, 0) ? resources.getString(R.string.navigation_menu) : a.r(7, 1) ? resources.getString(R.string.close_drawer) : a.r(7, 2) ? resources.getString(R.string.close_sheet) : a.r(7, 3) ? resources.getString(R.string.default_error_message) : a.r(7, 4) ? resources.getString(R.string.dropdown_menu) : a.r(7, 5) ? resources.getString(R.string.range_start) : a.r(7, 6) ? resources.getString(R.string.range_end) : a.r(7, 7) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
            if (yks.e(apnVar, asbVar2.a)) {
                asbVar = asbVar2;
                i2 = 6;
                baoVarD.x(95900978);
                basVar.aa();
            } else {
                baoVarD.x(141556995);
                asbVar2.a = apnVar;
                List list = asbVar2.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(((aol) list.get(i6)).a);
                }
                List listAn = yfm.an(arrayList);
                if (!listAn.contains(apnVar)) {
                    listAn.add(apnVar);
                }
                list.clear();
                List listB = cmq.b(listAn);
                int size2 = listB.size();
                int i7 = 0;
                while (i7 < size2) {
                    apn apnVar2 = (apn) listB.get(i7);
                    asb asbVar3 = asbVar2;
                    list.add(new aol(apnVar2, bga.k(-1032415134, new apo(apnVar2, apnVar, listAn, asbVar3, string), baoVarD)));
                    i7++;
                    i5 = i5;
                    asbVar2 = asbVar3;
                }
                asbVar = asbVar2;
                i2 = i5;
                basVar.aa();
            }
            bvt bvtVarA = xo.a(bkb.a, false);
            int iO = zy.o(baoVarD);
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
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            asbVar.c = zy.q(baoVarD);
            baoVarD.x(-1757732554);
            List list2 = asbVar.b;
            int size3 = list2.size();
            for (int i8 = 0; i8 < size3; i8++) {
                aol aolVar = (aol) list2.get(i8);
                Object obj = aolVar.a;
                yka ykaVar2 = aolVar.b;
                baoVarD.v(-1515535286, obj);
                ykaVar2.a(bga.k(2017516783, new acv(ykaVar, obj, 9), baoVarD), baoVarD, Integer.valueOf(i2));
                basVar.aa();
            }
            basVar.aa();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(apnVar, bkpVar, ykaVar, i, 6);
        }
    }

    public static anp B(bao baoVar) {
        return (anp) baoVar.f(anq.a);
    }

    public static apl C(bao baoVar) {
        return (apl) baoVar.f(apm.a);
    }

    public static aqa D(bao baoVar) {
        return (aqa) baoVar.f(aqb.b);
    }

    public static void E(yjk yjkVar, bkp bkpVar, bol bolVar, long j, long j2, aoc aocVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bol bolVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-482679837);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            bolVar2 = bolVar;
            i2 |= true != baoVarD.F(bolVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            bolVar2 = bolVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.E(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.E(j2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(aocVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 4194304 : 8388608;
        }
        if ((4793491 & i2) == 4793490 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(36083320);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar = (kw) objT;
            basVar.aa();
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new afh(16);
                basVar.ae(objT2);
            }
            bkp bkpVarB = cfd.b(bkpVar, false, (yjv) objT2);
            int i4 = i2 >> 15;
            baoVarD.x(-478475335);
            boolean zF = baoVarD.F(kwVar);
            Object objT3 = basVar.T();
            if (zF || objT3 == obj) {
                objT3 = new aoo();
                basVar.ae(objT3);
            }
            aoo aooVar = (aoo) objT3;
            boolean zH = baoVarD.H(aooVar) | ((((i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && baoVarD.F(aocVar)) || (i4 & 48) == 32);
            Object objT4 = basVar.T();
            if (zH || objT4 == obj) {
                objT4 = new aoa(aooVar, aocVar, (yih) null, 1);
                basVar.ae(objT4);
            }
            bbn.f(aocVar, (yjz) objT4, baoVarD);
            boolean zF2 = baoVarD.F(kwVar) | baoVarD.H(aooVar);
            Object objT5 = basVar.T();
            if (zF2 || objT5 == obj) {
                objT5 = new ajp(kwVar, aooVar, (yih) null, 2);
                basVar.ae(objT5);
            }
            bbn.f(kwVar, (yjz) objT5, baoVarD);
            mz mzVar = aooVar.e.a;
            basVar.aa();
            og.N(yjkVar, bkpVarB, false, bolVar2, j, j2, ((cma) mzVar.a()).a, kwVar, bga.k(-1823447062, new aor(j2, yjzVar, 0), baoVarD), baoVarD, (i2 & 14) | 805306368 | (i2 & 7168) | (57344 & i2) | (458752 & i2), 68);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aop(yjkVar, bkpVar, bolVar, j, j2, aocVar, yjzVar, i, 1);
        }
    }

    public static void F(yjz yjzVar, yjk yjkVar, bkp bkpVar, bol bolVar, long j, long j2, aoc aocVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        bkp bkpVar2;
        bol bolVar2;
        aoc aocVar2;
        long j3;
        long j4;
        bkp bkpVar3;
        bao baoVarD = baoVar.d(-1506973027);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.H(yjzVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 16 : 32;
        } else {
            yjkVar2 = yjkVar;
        }
        int i3 = i2 | 28032;
        if ((i & 196608) == 0) {
            i3 = i2 | 93568;
        }
        if ((i & 1572864) == 0) {
            i3 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((38347923 & i3) == 38347922 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            bolVar2 = bolVar;
            j3 = j;
            j4 = j2;
            aocVar2 = aocVar;
        } else {
            int i4 = (-268369921) & i3;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkm bkmVar = bkp.g;
                aeh aehVar = C(baoVarD).a;
                aei aeiVarA = aek.a(50);
                aeh aehVar2 = new aeh(aeiVarA, aeiVarA, aeiVarA, aeiVarA);
                long j5 = B(baoVarD).j();
                long jA = anq.a(j5, baoVarD);
                boolean zC = baoVarD.C(6.0f) | baoVarD.C(12.0f) | baoVarD.C(8.0f) | baoVarD.C(8.0f);
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (zC || objT == ban.a) {
                    objT = new aoc();
                    basVar.ae(objT);
                }
                aoc aocVar3 = (aoc) objT;
                bkpVar2 = bkmVar;
                bolVar2 = aehVar2;
                aocVar2 = aocVar3;
                j3 = j5;
                j4 = jA;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                bolVar2 = bolVar;
                j3 = j;
                j4 = j2;
                aocVar2 = aocVar;
            }
            baoVarD.m();
            E(yjkVar2, zi.m(bkpVar2, 48.0f, 48.0f, 0.0f, 12), bolVar2, j3, j4, aocVar2, bga.k(-555697957, new aoq(yjzVar, 0), baoVarD), baoVarD, 12582912 | ((i4 >> 3) & 14) | ((i4 >> 6) & 896));
            bkpVar3 = bkpVar2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aop(yjzVar, yjkVar, bkpVar3, bolVar2, j3, j4, aocVar2, i, 0);
        }
    }

    public static float G(float f, float f2, bao baoVar) {
        long j = ((bnq) baoVar.f(anx.a)).h;
        return (!B(baoVar).m() ? ((double) bny.g(j)) >= 0.5d : ((double) bny.g(j)) <= 0.5d) ? f : f2;
    }

    public static long H(bdy bdyVar) {
        return ((bnq) bdyVar.a()).h;
    }

    public static void I(yjk yjkVar, any anyVar, yka ykaVar, bao baoVar, int i) {
        bkm bkmVar = (i & 2) != 0 ? bkp.g : null;
        boolean z = (i & 4) != 0;
        aeh aehVar = (i & 32) != 0 ? C(baoVar).a : null;
        if ((i & 128) != 0) {
            float f = ann.a;
            anyVar = ann.a(0L, baoVar, 7);
        }
        any anyVar2 = anyVar;
        float f2 = ann.a;
        J(yjkVar, bkmVar, z, aehVar, anyVar2, ann.c, ykaVar, baoVar, 805306368);
    }

    public static void J(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, any anyVar, yy yyVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bol bolVar2;
        int i3;
        kw kwVar;
        long j;
        int i4 = i & 6;
        bao baoVarD = baoVar.d(-1084573925);
        if (i4 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(null) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            bolVar2 = bolVar;
            i2 |= true != baoVarD.F(bolVar2) ? 65536 : 131072;
        } else {
            bolVar2 = bolVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.F(anyVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != baoVarD.F(yyVar) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if ((306783379 & i2) == 306783378 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVarD.x(497772480);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new kw((byte[]) null, (byte[]) null);
                basVar.ae(objT);
            }
            kw kwVar2 = (kw) objT;
            basVar.aa();
            int i5 = i2 >> 6;
            baoVarD.x(-2133647540);
            if (z) {
                i3 = 805306368;
                kwVar = kwVar2;
                j = anyVar.b;
            } else {
                i3 = 805306368;
                kwVar = kwVar2;
                j = anyVar.d;
            }
            bdy bdyVarBR = a.bR(new bnq(j), baoVarD);
            basVar.aa();
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new afh(14);
                basVar.ae(objT2);
            }
            bkp bkpVarB = cfd.b(bkpVar, false, (yjv) objT2);
            baoVarD.x(-655254499);
            bdy bdyVarBR2 = a.bR(new bnq(z ? anyVar.a : anyVar.c), baoVarD);
            basVar.aa();
            long j2 = ((bnq) bdyVarBR2.a()).h;
            long jH = H(bdyVarBR);
            long jK = bny.k(bnq.d(jH), bnq.c(jH), bnq.b(jH), 1.0f, bnq.f(jH));
            baoVarD.x(498179137);
            basVar.aa();
            og.N(yjkVar, bkpVarB, z, bolVar2, j2, jK, 0.0f, kwVar, bga.k(-20345758, new ano(bdyVarBR, yyVar, ykaVar, 0), baoVarD), baoVarD, (i2 & 14) | i3 | (i2 & 896) | (i5 & 7168) | (i2 & 3670016), 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(yjkVar, bkpVar, z, bolVar, anyVar, yyVar, ykaVar, i, 1);
        }
    }

    public static bmy K(bvc bvcVar) {
        bmy bmyVarV = bty.v(bvcVar);
        long jO = bvcVar.o(bmyVarV.f());
        long jO2 = bvcVar.o(bmyVarV.c());
        return new bmy(Float.intBitsToFloat((int) (jO >> 32)), Float.intBitsToFloat((int) (jO & 4294967295L)), Float.intBitsToFloat((int) (jO2 >> 32)), Float.intBitsToFloat((int) (jO2 & 4294967295L)));
    }

    public static boolean L(bmy bmyVar, long j) {
        float f = bmyVar.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > bmyVar.d) {
            return false;
        }
        float f2 = bmyVar.c;
        float f3 = bmyVar.e;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f2 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f3;
    }

    public static int M(cgz cgzVar, int i) {
        cfy cfyVar = cgzVar.a.a;
        if (cfyVar.a() != 0) {
            int iG = cgzVar.g(i);
            if ((i != 0 && iG == cgzVar.g(i - 1)) || (i != cfyVar.a() && iG == cgzVar.g(i + 1))) {
                return cgzVar.r(i);
            }
        }
        return cgzVar.s(i);
    }

    public static void N(cb cbVar, bkp bkpVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(1351125615);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(cbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            ykaVar = ant.a;
            apn apnVarI = cbVar.i();
            kw kwVar = (kw) baoVarD.f(ccq.a);
            boolean zH = baoVarD.H(apnVarI) | baoVarD.H(kwVar);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new aoa(apnVarI, kwVar, (yih) null, 2);
                basVar.ae(objT);
            }
            bbn.f(apnVarI, (yjz) objT, baoVarD);
            A(cbVar.i(), bkpVar, ykaVar, baoVarD, i3 & 1008);
        }
        bkp bkpVar2 = bkpVar;
        yka ykaVar2 = ykaVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(cbVar, bkpVar2, ykaVar2, i, 7);
        }
    }

    private static lx O(pf pfVar, yjv yjvVar, Object obj, bao baoVar) {
        lx lxVar;
        baoVar.v(-422486105, pfVar);
        if (pfVar.A()) {
            baoVar.x(-212146657);
            ((bas) baoVar).aa();
            lxVar = ((Boolean) yjvVar.a(obj)).booleanValue() ? lx.b : ((Boolean) yjvVar.a(pfVar.f())).booleanValue() ? lx.c : lx.a;
        } else {
            baoVar.x(-211872524);
            bas basVar = (bas) baoVar;
            Object objT = basVar.T();
            if (objT == ban.a) {
                bci bciVar = new bci(false, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            if (((Boolean) yjvVar.a(pfVar.f())).booleanValue()) {
                bcbVar.b(true);
            }
            lxVar = ((Boolean) yjvVar.a(obj)).booleanValue() ? lx.b : ((Boolean) bcbVar.a()).booleanValue() ? lx.c : lx.a;
            basVar.aa();
        }
        ((bas) baoVar).aa();
        return lxVar;
    }

    private static int P(int i, int i2, boolean z) {
        return z ? i : i - i2;
    }

    private static int Q(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static boolean R(int i, int i2, int i3, boolean z) {
        return z ? i2 <= i : i3 - i2 > i;
    }

    public static void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void b(String str) {
        throw new IllegalStateException(str);
    }

    public static void c(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static void d(String str) {
        throw new NoSuchElementException(str);
    }

    public static void e(pf pfVar, yjv yjvVar, bkp bkpVar, mf mfVar, mg mgVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        mf mfVar2;
        mg mgVar2;
        yka ykaVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1706321816);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(pfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            mfVar2 = mfVar;
            i2 |= true != baoVarD.F(mfVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            mfVar2 = mfVar;
        }
        if ((i & 24576) == 0) {
            mgVar2 = mgVar;
            i2 |= true != baoVarD.F(mgVar2) ? 8192 : 16384;
        } else {
            mgVar2 = mgVar;
        }
        if ((i & 196608) == 0) {
            ykaVar2 = ykaVar;
            i2 |= true != baoVarD.H(ykaVar2) ? 65536 : 131072;
        } else {
            ykaVar2 = ykaVar;
        }
        if (baoVarD.L((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            boolean z = i4 == 32;
            int i5 = i2 & 14;
            boolean z2 = i5 == 4;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if ((z2 | z) || objT == ban.a) {
                objT = new lq(yjvVar, pfVar);
                basVar.ae(objT);
            }
            bkp bkpVarJ = bty.j((yka) objT);
            Object objT2 = basVar.T();
            if (objT2 == ban.a) {
                objT2 = lr.a;
                basVar.ae(objT2);
            }
            int i6 = i5 | 196608;
            int i7 = 57344 & i2;
            int i8 = ((i2 << 6) & 29360128) | i6 | i4 | (i2 & 7168) | i7;
            g(pfVar, yjvVar, bkpVarJ, mfVar2, mgVar2, (yjz) objT2, ykaVar2, baoVarD, i8);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ls(pfVar, yjvVar, bkpVar, mfVar, mgVar, ykaVar, i, 0);
        }
    }

    public static boolean f(pf pfVar) {
        Object objF = pfVar.f();
        lx lxVar = lx.c;
        return objF == lxVar && pfVar.g() == lxVar;
    }

    public static void g(pf pfVar, yjv yjvVar, bkp bkpVar, mf mfVar, mg mgVar, yjz yjzVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        int i3;
        int i4;
        hnj hnjVar;
        hnj hnjVar2;
        hnj hnjVar3;
        hnj hnjVarF;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(1912839215);
        if (i5 == 0) {
            i2 = (true != baoVarD.F(pfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(mfVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(mgVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 65536 : 131072;
        }
        int i6 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i6 |= true != baoVarD.H(ykaVar) ? 4194304 : 8388608;
        }
        if (!baoVarD.L((4793491 & i6) != 4793490, i6 & 1)) {
            baoVarD.t();
        } else if (((Boolean) yjvVar.a(pfVar.g())).booleanValue() || ((Boolean) yjvVar.a(pfVar.f())).booleanValue() || pfVar.A() || pfVar.y()) {
            baoVarD.x(-232323267);
            int i7 = i6 & 14;
            int i8 = i7 | 48;
            int i9 = i8 & 14;
            boolean z = ((i9 ^ 6) > 4 && baoVarD.F(pfVar)) || (i8 & 6) == 4;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z || objT == ban.a) {
                objT = pfVar.f();
                basVar.ae(objT);
            }
            if (pfVar.A()) {
                objT = pfVar.f();
            }
            baoVarD.x(1844425648);
            lx lxVarO = O(pfVar, yjvVar, objT, baoVarD);
            basVar.aa();
            Object objG = pfVar.g();
            baoVarD.x(1844425648);
            lx lxVarO2 = O(pfVar, yjvVar, objG, baoVarD);
            basVar.aa();
            int i10 = i9 | 3072;
            int i11 = (i10 & 14) ^ 6;
            yjv yjvVar2 = pi.a;
            int i12 = i6;
            boolean z2 = (i11 > 4 && baoVarD.F(pfVar)) || (i10 & 6) == 4;
            Object objT2 = basVar.T();
            if (z2 || objT2 == ban.a) {
                i3 = i10;
                objT2 = new pf(new od(lxVarO), pfVar, pfVar.a.concat(" > EnterExitTransition"));
                basVar.ae(objT2);
            } else {
                i3 = i10;
            }
            pf pfVar2 = (pf) objT2;
            boolean zF = ((i11 > 4 && baoVarD.F(pfVar)) || (i3 & 6) == 4) | baoVarD.F(pfVar2);
            Object objT3 = basVar.T();
            byte[] bArr = null;
            if (zF || objT3 == ban.a) {
                objT3 = new ox(pfVar, pfVar2, 3, bArr);
                basVar.ae(objT3);
            }
            bbn.c(pfVar2, (yjv) objT3, baoVarD);
            if (pfVar.A()) {
                i4 = i7;
                long j = pfVar.e;
                pfVar2.C(lxVarO, lxVarO2);
            } else {
                i4 = i7;
                pfVar2.x(lxVarO2);
                pfVar2.s(false);
            }
            bdy bdyVarBR = a.bR(yjzVar, baoVarD);
            Object objA = yjzVar.a(pfVar2.f(), pfVar2.g());
            boolean zF2 = baoVarD.F(pfVar2) | baoVarD.F(bdyVarBR);
            Object objT4 = basVar.T();
            if (zF2 || objT4 == ban.a) {
                objT4 = new ajp(pfVar2, bdyVarBR, (yih) null, 1);
                basVar.ae(objT4);
            }
            bdy bdyVarL = bdi.l(objA, (yjz) objT4, baoVarD);
            if (f(pfVar2) && ((Boolean) bdyVarL.a()).booleanValue()) {
                baoVarD.x(-230155437);
                basVar.aa();
            } else {
                baoVarD.x(-231293261);
                Object objT5 = basVar.T();
                if (i4 == 4 || objT5 == ban.a) {
                    objT5 = new lu();
                    basVar.ae(objT5);
                }
                lu luVar = (lu) objT5;
                os osVar = mc.a;
                Object objT6 = basVar.T();
                Object obj = ban.a;
                if (objT6 == obj) {
                    objT6 = bmf.b;
                    basVar.ae(objT6);
                }
                yjk yjkVar = (yjk) objT6;
                boolean zF3 = baoVarD.F(pfVar2);
                Object objT7 = basVar.T();
                if (zF3 || objT7 == obj) {
                    objT7 = new bci(mfVar, bcz.c);
                    basVar.ae(objT7);
                }
                bcb bcbVar = (bcb) objT7;
                if (pfVar2.f() == pfVar2.g() && pfVar2.f() == lx.b) {
                    if (pfVar2.A()) {
                        mc.c(bcbVar, mfVar);
                    } else {
                        mc.c(bcbVar, mf.a);
                    }
                } else if (pfVar2.g() == lx.b) {
                    mc.c(bcbVar, mc.a(bcbVar).a(mfVar));
                }
                mf mfVarA = mc.a(bcbVar);
                boolean zF4 = baoVarD.F(pfVar2);
                Object objT8 = basVar.T();
                if (zF4 || objT8 == obj) {
                    objT8 = new bci(mgVar, bcz.c);
                    basVar.ae(objT8);
                }
                bcb bcbVar2 = (bcb) objT8;
                if (pfVar2.f() == pfVar2.g() && pfVar2.f() == lx.b) {
                    if (pfVar2.A()) {
                        mc.d(bcbVar2, mgVar);
                    } else {
                        mc.d(bcbVar2, mg.a);
                    }
                } else if (pfVar2.g() != lx.b) {
                    mc.d(bcbVar2, mc.b(bcbVar2).a(mgVar));
                }
                mg mgVarB = mc.b(bcbVar2);
                mp mpVar = mfVarA.b;
                boolean z3 = (mpVar.b == null && mgVarB.b.b == null) ? false : true;
                boolean z4 = (mpVar.c == null && mgVarB.b.c == null) ? false : true;
                if (z3) {
                    baoVarD.x(133838277);
                    bhi bhiVar = pm.g;
                    Object objT9 = basVar.T();
                    if (objT9 == obj) {
                        objT9 = "Built-in slide";
                        basVar.ae("Built-in slide");
                    }
                    hnj hnjVarF2 = pi.f(pfVar2, bhiVar, baoVarD, 384);
                    basVar.aa();
                    hnjVar = hnjVarF2;
                } else {
                    baoVarD.x(133944080);
                    basVar.aa();
                    hnjVar = null;
                }
                if (z4) {
                    baoVarD.x(134035871);
                    bhi bhiVar2 = pm.h;
                    Object objT10 = basVar.T();
                    if (objT10 == obj) {
                        objT10 = "Built-in shrink/expand";
                        basVar.ae("Built-in shrink/expand");
                    }
                    hnj hnjVarF3 = pi.f(pfVar2, bhiVar2, baoVarD, 384);
                    basVar.aa();
                    hnjVar2 = hnjVarF3;
                } else {
                    baoVarD.x(134146695);
                    basVar.aa();
                    hnjVar2 = null;
                }
                if (z4) {
                    baoVarD.x(134220321);
                    bhi bhiVar3 = pm.g;
                    Object objT11 = basVar.T();
                    if (objT11 == obj) {
                        objT11 = "Built-in InterruptionHandlingOffset";
                        basVar.ae("Built-in InterruptionHandlingOffset");
                    }
                    hnj hnjVarF4 = pi.f(pfVar2, bhiVar3, baoVarD, 384);
                    basVar.aa();
                    hnjVar3 = hnjVarF4;
                } else {
                    baoVarD.x(134390727);
                    basVar.aa();
                    hnjVar3 = null;
                }
                mp mpVar2 = mgVarB.b;
                boolean z5 = !z4;
                if (mpVar.a == null && mpVar2.a == null) {
                    baoVarD.x(-703690136);
                    basVar.aa();
                    hnjVarF = null;
                } else {
                    baoVarD.x(-703859581);
                    bhi bhiVar4 = pm.a;
                    Object objT12 = basVar.T();
                    if (objT12 == obj) {
                        objT12 = "Built-in alpha";
                        basVar.ae("Built-in alpha");
                    }
                    hnjVarF = pi.f(pfVar2, bhiVar4, baoVarD, 384);
                    basVar.aa();
                }
                baoVarD.x(-703453048);
                basVar.aa();
                baoVarD.x(-703203064);
                basVar.aa();
                boolean zH = baoVarD.H(null) | baoVarD.H(hnjVarF) | baoVarD.F(mfVarA) | baoVarD.F(mgVarB) | baoVarD.H(null) | baoVarD.F(pfVar2);
                Object objT13 = basVar.T();
                if (zH || objT13 == obj) {
                    objT13 = new ly(hnjVarF, pfVar2, mfVarA, mgVarB);
                    basVar.ae(objT13);
                }
                ly lyVar = (ly) objT13;
                bkm bkmVar = bkp.g;
                boolean zG = baoVarD.G(z5) | baoVarD.F(yjkVar);
                Object objT14 = basVar.T();
                if (zG || objT14 == obj) {
                    objT14 = new mb(z5, yjkVar);
                    basVar.ae(objT14);
                }
                bkp bkpVarA = bny.c(bkmVar, (yjv) objT14).a(new EnterExitTransitionElement(pfVar2, hnjVar2, hnjVar3, hnjVar, mfVarA, mgVarB, yjkVar, lyVar));
                baoVarD.x(-7429769);
                basVar.aa();
                bkp bkpVarA2 = bkpVar.a(bkpVarA.a(bkmVar));
                Object objT15 = basVar.T();
                if (objT15 == obj) {
                    objT15 = new ll(luVar);
                    basVar.ae(objT15);
                }
                ll llVar = (ll) objT15;
                int iK = a.k(zy.p(baoVarD));
                bhu bhuVarAi = basVar.ai();
                bkp bkpVarC = bdi.C(baoVarD, bkpVarA2);
                yjk yjkVar2 = bxt.a;
                baoVarD.z();
                if (basVar.w) {
                    baoVarD.k(yjkVar2);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, llVar, bxt.d);
                beb.a(baoVarD, bhuVarAi, bxt.c);
                yjz yjzVar2 = bxt.e;
                if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    basVar.ae(numValueOf);
                    baoVarD.i(numValueOf, yjzVar2);
                }
                beb.a(baoVarD, bkpVarC, bxt.b);
                ykaVar.a(luVar, baoVarD, Integer.valueOf((i12 >> 18) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                baoVarD.o();
                basVar.aa();
            }
            basVar.aa();
        } else {
            baoVarD.x(-230149485);
            ((bas) baoVarD).aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new lm(pfVar, yjvVar, bkpVar, mfVar, mgVar, yjzVar, ykaVar, i);
        }
    }

    public static void h(boolean z, bkp bkpVar, mf mfVar, mg mgVar, String str, yka ykaVar, bao baoVar, int i) {
        boolean z2;
        int i2;
        mf mfVar2;
        yka ykaVar2;
        bkp bkpVar2;
        String str2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1448730565);
        if (i3 == 0) {
            z2 = z;
            i2 = (true != baoVarD.G(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            mfVar2 = mfVar;
            i4 |= true != baoVarD.F(mfVar2) ? 128 : 256;
        } else {
            mfVar2 = mfVar;
        }
        if ((i & 3072) == 0) {
            i4 |= true != baoVarD.F(mgVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i5 = i4 | 24576;
        if ((196608 & i) == 0) {
            ykaVar2 = ykaVar;
            i5 |= true != baoVarD.H(ykaVar2) ? 65536 : 131072;
        } else {
            ykaVar2 = ykaVar;
        }
        if (baoVarD.L((74899 & i5) != 74898, i5 & 1)) {
            bkm bkmVar = bkp.g;
            pf pfVarD = pi.d(Boolean.valueOf(z2), "AnimatedVisibility", baoVarD, (i5 & 14) | ((i5 >> 9) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = lo.b;
                basVar.ae(objT);
            }
            int i6 = i5 << 3;
            e(pfVarD, (yjv) objT, bkmVar, mfVar2, mgVar, ykaVar2, baoVarD, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i5 & 458752));
            str2 = "AnimatedVisibility";
            bkpVar2 = bkmVar;
        } else {
            baoVarD.t();
            bkpVar2 = bkpVar;
            str2 = str;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ln(z, bkpVar2, mfVar, mgVar, str2, ykaVar, i);
        }
    }

    public static void i(xx xxVar, boolean z, bkp bkpVar, mf mfVar, mg mgVar, String str, yka ykaVar, bao baoVar, int i) {
        boolean z2;
        int i2;
        mf mfVar2;
        yka ykaVar2;
        bkp bkpVar2;
        String str2;
        int i3 = i & 48;
        bao baoVarD = baoVar.d(1799879339);
        if (i3 == 0) {
            z2 = z;
            i2 = (true != baoVarD.G(z2) ? 16 : 32) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            mfVar2 = mfVar;
            i4 |= true != baoVarD.F(mfVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            mfVar2 = mfVar;
        }
        if ((i & 24576) == 0) {
            i4 |= true != baoVarD.F(mgVar) ? 8192 : 16384;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            ykaVar2 = ykaVar;
            i5 |= true != baoVarD.H(ykaVar2) ? 524288 : 1048576;
        } else {
            ykaVar2 = ykaVar;
        }
        if (baoVarD.L((599185 & i5) != 599184, i5 & 1)) {
            bkm bkmVar = bkp.g;
            int i6 = i5 >> 3;
            pf pfVarD = pi.d(Boolean.valueOf(z2), "AnimatedVisibility", baoVarD, ((i5 >> 12) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i6 & 14));
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = lo.a;
                basVar.ae(objT);
            }
            e(pfVarD, (yjv) objT, bkmVar, mfVar2, mgVar, ykaVar2, baoVarD, (i5 & 57344) | (i5 & 896) | 48 | (i5 & 7168) | (i6 & 458752));
            str2 = "AnimatedVisibility";
            bkpVar2 = bkmVar;
        } else {
            baoVarD.t();
            bkpVar2 = bkpVar;
            str2 = str;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new lp(xxVar, z2, bkpVar2, mfVar, mgVar, str2, ykaVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(defpackage.pf r18, defpackage.bkp r19, defpackage.yjv r20, defpackage.bkd r21, defpackage.yjv r22, defpackage.ykb r23, defpackage.bao r24, int r25) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.j(pf, bkp, yjv, bkd, yjv, ykb, bao, int):void");
    }

    public static Object k(bte bteVar, yjz yjzVar, yih yihVar) {
        Object objP = bteVar.p(new ui(yihVar.getContext(), yjzVar, null), yihVar);
        return objP == yio.a ? objP : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object l(defpackage.btq r8, defpackage.bss r9, defpackage.yih r10) {
        /*
            boolean r0 = r10 instanceof defpackage.uh
            if (r0 == 0) goto L13
            r0 = r10
            uh r0 = (defpackage.uh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            uh r0 = new uh
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            bss r8 = r0.c
            btq r9 = r0.d
            defpackage.ybn.f(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.ybn.f(r10)
            bsr r10 = r8.o()
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            bsz r6 = (defpackage.bsz) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L77
        L51:
            r0.d = r8
            r0.c = r9
            r0.b = r4
            java.lang.Object r10 = r8.q(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            bsr r10 = (defpackage.bsr) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            bsz r6 = (defpackage.bsz) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.l(btq, bss, yih):java.lang.Object");
    }

    public static float n(cds cdsVar, int i) {
        return a.r(i, 2) ? cdsVar.e() * 0.0069444445f : cdsVar.e();
    }

    public static Object o(bte bteVar, yjv yjvVar, yjk yjkVar, yjk yjkVar2, yjz yjzVar, yih yihVar) {
        Object objP = p(bteVar, null, new age(yjvVar, 1), new kb(yjkVar, 15), yjkVar2, new gf(9), yjzVar, yihVar);
        return objP == yio.a ? objP : ygi.a;
    }

    public static Object p(bte bteVar, uv uvVar, yka ykaVar, yjv yjvVar, yjk yjkVar, yjk yjkVar2, yjz yjzVar, yih yihVar) {
        Object objK = k(bteVar, new ts(yjkVar2, new yle(), uvVar, ykaVar, yjzVar, yjkVar, yjvVar, null), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    public static boolean q(bsr bsrVar, long j) {
        Object obj;
        List list = bsrVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (a.s(((bsz) obj).a, j)) {
                break;
            }
            i++;
        }
        bsz bszVar = (bsz) obj;
        return bszVar == null || !bszVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (defpackage.bny.H(r6) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object r(defpackage.btq r12, long r13, defpackage.yih r15) {
        /*
            boolean r0 = r15 instanceof defpackage.to
            if (r0 == 0) goto L13
            r0 = r15
            to r0 = (defpackage.to) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            to r0 = new to
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yle r12 = r0.c
            btq r13 = r0.d
            defpackage.ybn.f(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.ybn.f(r15)
            bsr r15 = r12.o()
            boolean r15 = q(r15, r13)
            if (r15 == 0) goto L45
            return r4
        L45:
            yle r15 = new yle
            r15.<init>()
            r15.a = r13
        L4c:
            r0.d = r12
            r0.c = r15
            r0.b = r3
            java.lang.Object r13 = defpackage.bny.I(r12, r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            r11 = r15
            r15 = r13
            r13 = r11
        L5c:
            bsr r15 = (defpackage.bsr) r15
            java.util.List r14 = r15.a
            int r15 = r14.size()
            r2 = 0
            r5 = r2
        L66:
            if (r5 >= r15) goto L7d
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            bsz r7 = (defpackage.bsz) r7
            long r7 = r7.a
            long r9 = r13.a
            boolean r7 = defpackage.a.s(r7, r9)
            if (r7 == 0) goto L7a
            goto L7e
        L7a:
            int r5 = r5 + 1
            goto L66
        L7d:
            r6 = r4
        L7e:
            bsz r6 = (defpackage.bsz) r6
            if (r6 != 0) goto L84
            r6 = r4
            goto Lb0
        L84:
            boolean r15 = defpackage.bny.F(r6)
            if (r15 == 0) goto Laa
            int r15 = r14.size()
        L8e:
            if (r2 >= r15) goto L9f
            java.lang.Object r5 = r14.get(r2)
            r7 = r5
            bsz r7 = (defpackage.bsz) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L8e
        L9f:
            r5 = r4
        La0:
            bsz r5 = (defpackage.bsz) r5
            if (r5 != 0) goto La5
            goto Lb0
        La5:
            long r14 = r5.a
            r13.a = r14
            goto Lba
        Laa:
            boolean r14 = defpackage.bny.H(r6)
            if (r14 == 0) goto Lba
        Lb0:
            if (r6 == 0) goto Lb9
            boolean r12 = r6.c()
            if (r12 != 0) goto Lb9
            return r6
        Lb9:
            return r4
        Lba:
            r15 = r13
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.r(btq, long, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [ylf] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(defpackage.btq r9, long r10, defpackage.yih r12) {
        /*
            boolean r0 = r12 instanceof defpackage.tp
            if (r0 == 0) goto L13
            r0 = r12
            tp r0 = (defpackage.tp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            tp r0 = new tp
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ylb r9 = r0.e
            ylf r10 = r0.d
            bsz r11 = r0.c
            defpackage.ybn.f(r12)     // Catch: defpackage.bst -> La6
            goto L98
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.ybn.f(r12)
            bsr r12 = r9.o()
            boolean r12 = q(r12, r10)
            if (r12 == 0) goto L44
            return r4
        L44:
            bsr r12 = r9.o()
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            bsz r7 = (defpackage.bsz) r7
            long r7 = r7.a
            boolean r7 = defpackage.a.s(r7, r10)
            if (r7 == 0) goto L61
            goto L65
        L61:
            int r5 = r5 + 1
            goto L4f
        L64:
            r6 = r4
        L65:
            r11 = r6
            bsz r11 = (defpackage.bsz) r11
            if (r11 != 0) goto L6b
            return r4
        L6b:
            ylf r10 = new ylf
            r10.<init>()
            ylf r12 = new ylf
            r12.<init>()
            r12.a = r11
            cds r2 = r9.p()
            long r5 = r2.g()
            ylb r2 = new ylb     // Catch: defpackage.bst -> La6
            r2.<init>()     // Catch: defpackage.bst -> La6
            tq r7 = new tq     // Catch: defpackage.bst -> La6
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.bst -> La6
            r0.c = r11     // Catch: defpackage.bst -> La6
            r0.d = r10     // Catch: defpackage.bst -> La6
            r0.e = r2     // Catch: defpackage.bst -> La6
            r0.b = r3     // Catch: defpackage.bst -> La6
            java.lang.Object r9 = r9.r(r5, r7, r0)     // Catch: defpackage.bst -> La6
            if (r9 == r1) goto La5
            r9 = r2
        L98:
            boolean r9 = r9.a     // Catch: defpackage.bst -> La6
            if (r9 == 0) goto La4
            java.lang.Object r9 = r10.a     // Catch: defpackage.bst -> La6
            bsz r9 = (defpackage.bsz) r9     // Catch: defpackage.bst -> La6
            if (r9 == 0) goto La3
            return r9
        La3:
            return r11
        La4:
            return r4
        La5:
            return r1
        La6:
            java.lang.Object r9 = r10.a
            bsz r9 = (defpackage.bsz) r9
            if (r9 == 0) goto Lad
            r11 = r9
        Lad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.s(btq, long, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x014e -> B:59:0x0154). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(defpackage.btq r20, long r21, defpackage.yjz r23, defpackage.yih r24) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.t(btq, long, yjz, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [yjv] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object u(defpackage.btq r4, long r5, defpackage.yjv r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.tt
            if (r0 == 0) goto L13
            r0 = r8
            tt r0 = (defpackage.tt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tt r0 = new tt
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            btq r5 = r0.d
            defpackage.ybn.f(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.ybn.f(r8)
        L38:
            r0.d = r4
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            bsz r8 = (defpackage.bsz) r8
            if (r8 != 0) goto L4f
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L4f:
            boolean r5 = defpackage.bny.F(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5a:
            r7.a(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.u(btq, long, yjv, yih):java.lang.Object");
    }

    public static int v(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return Q(i2, i3, z);
        }
        boolean z2 = !z;
        return R(i, i2, i3, z2) ? P(i, i2, z) : R(i, i2, i3, z) ? P(i, i2, z2) : Q(i2, i3, z2);
    }

    public static void w(yjz yjzVar, yjz yjzVar2, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1302703572);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkp bkpVarV = wv.v(bkp.g, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new cni(1);
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarV);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar3 = bxt.d;
            beb.a(baoVarD, bvtVar, yjzVar3);
            yjz yjzVar4 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar4);
            yjz yjzVar5 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar5);
            }
            yjz yjzVar6 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar6);
            bkp bkpVarU = wv.u(bty.p("text"), 0.0f, 6.0f, 1);
            bkd bkdVar = bkb.a;
            bvt bvtVarA = xo.a(bkdVar, false);
            int iO2 = zy.o(baoVarD);
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarU);
            baoVarD.z();
            int i4 = i2;
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, yjzVar3);
            beb.a(baoVarD, bhuVarAi2, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO2))) {
                Integer numValueOf2 = Integer.valueOf(iO2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar6);
            yjzVar.a(baoVarD, Integer.valueOf(i4 & 14));
            baoVarD.o();
            bkp bkpVarP = bty.p("action");
            bvt bvtVarA2 = xo.a(bkdVar, false);
            int iO3 = zy.o(baoVarD);
            bhu bhuVarAi3 = basVar.ai();
            bkp bkpVarC3 = bdi.C(baoVarD, bkpVarP);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar3);
            beb.a(baoVarD, bhuVarAi3, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO3))) {
                Integer numValueOf3 = Integer.valueOf(iO3);
                basVar.ae(numValueOf3);
                baoVarD.i(numValueOf3, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC3, yjzVar6);
            yjzVar2.a(baoVarD, Integer.valueOf((i4 >> 3) & 14));
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(yjzVar, yjzVar2, i, 13);
        }
    }

    public static void x(yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(343813818);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = xn.d;
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            bkm bkmVar = bkp.g;
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkmVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar2 = bxt.d;
            beb.a(baoVarD, bvtVar, yjzVar2);
            yjz yjzVar3 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar3);
            yjz yjzVar4 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar4);
            }
            yjz yjzVar5 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar5);
            bkp bkpVarQ = wv.q(bkmVar, 16.0f, 6.0f);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iO2 = zy.o(baoVarD);
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarQ);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, yjzVar2);
            beb.a(baoVarD, bhuVarAi2, yjzVar3);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO2))) {
                Integer numValueOf2 = Integer.valueOf(iO2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar4);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar5);
            yjzVar.a(baoVarD, Integer.valueOf(i2 & 14));
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(yjzVar, i, 7);
        }
    }

    public static void y(final bkp bkpVar, final yjz yjzVar, final bol bolVar, final long j, final long j2, final float f, final yjz yjzVar2, bao baoVar, final int i) {
        bkp bkpVar2;
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-662779944);
        if (i3 == 0) {
            bkpVar2 = bkpVar;
            i2 = (true != baoVarD.F(bkpVar2) ? 2 : 4) | i;
        } else {
            bkpVar2 = bkpVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(false) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.E(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.E(j2) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != baoVarD.C(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 4194304 : 8388608;
        }
        if ((4793491 & i2) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            int i4 = i2 >> 6;
            baoVar2 = baoVarD;
            og.F(bkpVar2, bolVar, j, j2, f, bga.k(-1429068516, new acv(yjzVar, yjzVar2, 12, null), baoVarD), baoVar2, (i2 & 14) | 1572864 | (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 896) | (i4 & 7168) | ((i2 >> 3) & 458752), 16);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: apq
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar3 = bkpVar;
                    yjz yjzVar3 = yjzVar;
                    bol bolVar2 = bolVar;
                    long j3 = j;
                    long j4 = j2;
                    float f2 = f;
                    kv.y(bkpVar3, yjzVar3, bolVar2, j3, j4, f2, yjzVar2, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static void z(final apn apnVar, bkp bkpVar, bol bolVar, long j, long j2, long j3, float f, bao baoVar, final int i) {
        int i2;
        bkp bkpVar2;
        int i3;
        long jI;
        bol bolVar2;
        float f2;
        long j4;
        int i4;
        long j5;
        final long j6;
        bhq bhqVarK;
        bao baoVar2;
        final bkp bkpVar3;
        final bol bolVar3;
        final long j7;
        final long j8;
        final float f3;
        bao baoVarD = baoVar.d(258660814);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(apnVar) : baoVarD.H(apnVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 432;
        if ((i & 3072) == 0) {
            i5 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        int i6 = i5 | 12582912;
        if ((4793491 & i6) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            bolVar3 = bolVar;
            j7 = j;
            j8 = j2;
            j6 = j3;
            f3 = f;
            baoVar2 = baoVarD;
        } else {
            int i7 = (-4193281) & i6;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                aeh aehVar = C(baoVarD).a;
                long jG = B(baoVarD).g();
                long jM = bny.m(bny.k(bnq.d(jG), bnq.c(jG), bnq.b(jG), 0.8f, bnq.f(jG)), B(baoVarD).l());
                long jL = B(baoVarD).l();
                anp anpVarB = B(baoVarD);
                if (anpVarB.m()) {
                    long jH = anpVarB.h();
                    i3 = 12582912;
                    long jL2 = anpVarB.l();
                    jI = bny.m(bny.k(bnq.d(jL2), bnq.c(jL2), bnq.b(jL2), 0.6f, bnq.f(jL2)), jH);
                } else {
                    i3 = 12582912;
                    jI = anpVarB.i();
                }
                bolVar2 = aehVar;
                f2 = 6.0f;
                j4 = jL;
                i4 = i3;
                j5 = jM;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                bolVar2 = bolVar;
                j5 = j;
                j4 = j2;
                f2 = f;
                i4 = 12582912;
                jI = j3;
            }
            baoVarD.m();
            String strA = apnVar.a();
            if (strA != null) {
                baoVarD.x(593509092);
                long j9 = jI;
                arg argVar = new arg(j9, apnVar, strA, 1);
                j6 = j9;
                bhqVarK = bga.k(1843479216, argVar, baoVarD);
                ((bas) baoVarD).aa();
            } else {
                j6 = jI;
                baoVarD.x(593808056);
                ((bas) baoVarD).aa();
                bhqVarK = null;
            }
            baoVar2 = baoVarD;
            y(wv.p(bkpVar2, 12.0f), bhqVarK, bolVar2, j5, j4, f2, bga.k(-261845785, new aoq(apnVar, 4), baoVarD), baoVar2, (i6 & 896) | i4 | ((i7 >> 3) & 3670016));
            bkpVar3 = bkpVar2;
            bolVar3 = bolVar2;
            j7 = j5;
            j8 = j4;
            f3 = f2;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: app
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    apn apnVar2 = apnVar;
                    bkp bkpVar4 = bkpVar3;
                    bol bolVar4 = bolVar3;
                    long j10 = j7;
                    long j11 = j8;
                    long j12 = j6;
                    kv.z(apnVar2, bkpVar4, bolVar4, j10, j11, j12, f3, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public kv(byte[] bArr) {
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.IntrinsicHeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kff {
    public static final void a(SearchQueryPageActivity searchQueryPageActivity, kfh kfhVar, kej kejVar, bao baoVar, int i) {
        int i2;
        Object fzpVar;
        kfhVar.getClass();
        kejVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1627860288);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(searchQueryPageActivity) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(kfhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(kejVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            boolean zC = searchQueryPageActivity.v().c();
            ygi ygiVar = ygi.a;
            baoVarD.x(-1746271574);
            boolean zH = baoVarD.H(searchQueryPageActivity) | baoVarD.H(kfhVar) | baoVarD.H(context);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                fzpVar = new fzp(searchQueryPageActivity, kfhVar, context, (yih) null, 6);
                basVar.ae(fzpVar);
            } else {
                fzpVar = objT;
            }
            basVar.aa();
            bbn.f(ygiVar, (yjz) fzpVar, baoVarD);
            kuw kuwVar = searchQueryPageActivity.b;
            if (kuwVar == null) {
                yks.c("composeThemeProvider");
                kuwVar = null;
            }
            kuwVar.a(null, null, searchQueryPageActivity.v().c(), bga.k(-701953515, new kev(kfhVar, searchQueryPageActivity, zC, kejVar, 2), baoVarD), baoVarD, 35840, 3);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(searchQueryPageActivity, kfhVar, kejVar, i, 4);
        }
    }

    public static final void b(List list, yjv yjvVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(166108296);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.c, bkb.j, baoVarD, 0);
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
            keq.a.b(null, baoVarD, 0);
            zy.k(zi.b(bkp.g, 16.0f), baoVarD);
            kdw.f(list, bga.k(-42334404, new ro(yjvVar, 20), baoVarD), null, null, baoVarD, (i2 & 14) | 48);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) list, (Object) yjvVar, (Object) bkpVar, i, 5);
        }
    }

    public static final void c(yjv yjvVar, yjv yjvVar2, List list, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-829859072);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(list) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.c, bkb.j, baoVarD, 0);
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
            kez kezVar = kez.a;
            bkm bkmVar = bkp.g;
            kezVar.a(wv.u(bkmVar, 20.0f, 0.0f, 2), baoVarD, 6);
            zy.k(zi.b(bkmVar, 16.0f), baoVarD);
            kdw.c(list, bga.k(1717286994, new ker(yjvVar, yjvVar2, 3), baoVarD), null, baoVarD, ((i2 >> 6) & 14) | 48);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(yjvVar, yjvVar2, list, bkpVar, i, 15);
        }
    }

    public static final void d(List list, yjv yjvVar, bkp bkpVar, boolean z, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        list.getClass();
        yjvVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-498015269);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            bkpVar2 = bkpVar;
            i2 |= true != baoVarD.F(bkpVar2) ? 128 : 256;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.x(-1746271574);
            boolean zH = ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | baoVarD.H(list);
            boolean z2 = (i2 & 7168) == 2048;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            boolean z3 = z2 | zH;
            int i4 = 6;
            if (z3 || objT == ban.a) {
                objT = new abi(list, yjvVar, z, i4);
                basVar.ae(objT);
            }
            basVar.aa();
            d.n(bkpVar2, null, null, null, null, null, false, null, (yjv) objT, baoVarD, (i2 >> 6) & 14, 510);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(list, yjvVar, bkpVar, z, i, 2);
        }
    }

    public static final void e(yjz yjzVar, yjk yjkVar, bkp bkpVar, boolean z, yjz yjzVar2, bao baoVar, int i) {
        int i2;
        atw atwVarA;
        bkp bkpVar2;
        yjzVar.getClass();
        yjkVar.getClass();
        yjzVar2.getClass();
        bao baoVarD = baoVar.d(-1547120099);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.H(yjzVar2) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarF = hq.f(bkmVar.a(zi.c), wv.K(baoVarD).p, boh.a);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarF);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bkp bkpVarW = wv.w(bkmVar, 0.0f, -8.0f, 1);
            if (z) {
                baoVarD.x(-316781299);
                atwVarA = por.a(wv.K(baoVarD).F, bnq.f, baoVarD);
                basVar.aa();
            } else {
                baoVarD.x(-316598337);
                atwVarA = por.a(wv.K(baoVarD).p, wv.K(baoVarD).B, baoVarD);
                basVar.aa();
            }
            bhq bhqVarK = bga.k(-2096928445, new azg(yjzVar, 15), baoVarD);
            baoVarD.x(1849434622);
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new jxd(17);
                basVar.ae(objT);
            }
            basVar.aa();
            aun.b(bhqVarK, (yjv) objT, bkpVarW, null, atwVarA, null, bga.k(-1572691958, new kfa(yjkVar, z, yjzVar2, 0), baoVarD), baoVarD, 805306806);
            baoVarD.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kes(yjzVar, yjkVar, bkpVar2, z, yjzVar2, i, 3);
        }
    }

    public static final void f(yjk yjkVar, kiq kiqVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        kiqVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1401707445);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 16 : 32;
        }
        int i4 = 18;
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            ith ithVar = (ith) dad.i(kiqVar.d, baoVarD).a();
            if (ithVar == null) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new key(yjkVar, kiqVar, i, i4);
                    return;
                }
                return;
            }
            baoVarD.x(-1633490746);
            int i5 = i2 & 14;
            boolean zH = (i5 == 4) | baoVarD.H(ithVar);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new iyc(ithVar, yjkVar, (yih) null, 4);
                basVar.ae(objT);
            }
            basVar.aa();
            bbn.e(ithVar, yjkVar, (yjz) objT, baoVarD);
            khx.a.a(yjkVar, kiqVar, baoVarD, (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | i5 | 448);
        }
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new key(yjkVar, kiqVar, i, 19);
        }
    }

    public static final void g(yjk yjkVar, kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        kiqVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1102075144);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            ith ithVar = (ith) dad.i(kiqVar.d, baoVarD).a();
            if (ithVar == null || ithVar.o()) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new kbe((Object) yjkVar, (Object) kiqVar, bkpVar, i, 18);
                    return;
                }
                return;
            }
            bkp bkpVarA = bkpVar.a(zi.c);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
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
            i(yjkVar, xs.a.a(bkp.g, bkb.g), bga.k(7978117, new kgx(ithVar, 17), baoVarD), baoVarD, (i2 & 14) | 3072);
            baoVarD.o();
        }
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new kbe((Object) yjkVar, (Object) kiqVar, bkpVar, i, 19);
        }
    }

    public static final void h(xr xrVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-1473949388);
        if ((i & 48) == 0) {
            i2 = (true != baoVarD.F(null) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 145) == 144 && baoVarD.K()) {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(xrVar, bkpVar, i, 17, null);
        }
    }

    public static final void i(yjk yjkVar, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        yjk yjkVar2;
        int i2;
        bkp bkpVar2;
        bao baoVar2;
        yjzVar.getClass();
        bao baoVarD = baoVar.d(-1680012389);
        if ((i & 6) == 0) {
            yjkVar2 = yjkVar;
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            yjkVar2 = yjkVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            bkpVar2 = bkpVar;
            i2 |= true != baoVarD.F(bkpVar2) ? 16 : 32;
        } else {
            bkpVar2 = bkpVar;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            awq.d(yjkVar2, zi.b(wv.q(zi.a(bkpVar2, 1.0f), 12.0f, 8.0f), 80.0f), false, wv.M(baoVarD).f, wv.K(baoVarD).F, 0L, 0.0f, null, null, bga.k(-369172378, new kgx(yjzVar, 16), baoVarD), baoVar2, 996);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) yjkVar, bkpVar, (Object) yjzVar, i, 17);
        }
    }

    public static final void j(yjk yjkVar, boolean z, yjk yjkVar2, yjk yjkVar3, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjkVar.getClass();
        yjkVar2.getClass();
        yjkVar3.getClass();
        bao baoVarD = baoVar.d(-592859618);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjkVar3) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarA = zi.a(bkmVar, 1.0f).a(new IntrinsicHeightElement());
            xf xfVarE = xk.e(24.0f);
            bkh bkhVar = bkb.n;
            bvt bvtVarA = zf.a(xfVarE, bkhVar, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar4 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
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
            jys.f(yjkVar, z, null, baoVarD, i3 & R.styleable.AppCompatTheme_windowNoTitle);
            bvt bvtVarA2 = zf.a(xk.e(4.0f), bkhVar, baoVarD, 54);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkmVar);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
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
            jyv.d(yjkVar2, zh.a(bkmVar, 1.0f, true).a(zi.b), baoVarD, (i3 >> 6) & 14);
            kaf.h(yjkVar3, zh.a(bkmVar, 1.0f, true).a(zi.b), baoVarD, (i3 >> 9) & 14);
            baoVarD.o();
            baoVarD.o();
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kes(yjkVar, z, yjkVar2, yjkVar3, bkpVar2, i, 4);
        }
    }

    public static final void k(kdh kdhVar, yjk yjkVar, boolean z, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1685365415);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(kdhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 16 : 32;
        } else {
            yjkVar2 = yjkVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            rdd.T(yjkVar2, null, false, null, rdd.X(bnq.f, 0L, baoVarD, 14), null, bga.k(1955716814, new kfc(kdhVar, z, 0), baoVarD), baoVarD, ((i2 >> 3) & 14) | 100663296, 238);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly((Object) kdhVar, yjkVar, z, i, 2);
        }
    }

    public static int l(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 1;
        }
    }

    public static wje m(String str, long j) {
        vtw vtwVarM = wje.a.m();
        if (str != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wje wjeVar = (wje) vtwVarM.b;
            wjeVar.b |= 1;
            wjeVar.c = str;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wje wjeVar2 = (wje) vtwVarM.b;
        wjeVar2.b |= 2;
        wjeVar2.d = j;
        return (wje) vtwVarM.r();
    }

    public static vtw n(String str, long j) {
        vtw vtwVarM = wjm.a.m();
        wje wjeVarM = m(str, SystemClock.elapsedRealtime() - j);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wjm wjmVar = (wjm) vtwVarM.b;
        wjeVarM.getClass();
        wjmVar.j = wjeVarM;
        wjmVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        return vtwVarM;
    }

    public static void o(Activity activity, Class cls, lhg lhgVar) {
        q(activity, cls, "", lhgVar);
    }

    public static void p(View view, Class cls, lhg lhgVar) {
        r(view, cls, "", lhgVar);
    }

    public static void q(Activity activity, Class cls, String str, lhg lhgVar) {
        View viewFindViewById = activity.findViewById(android.R.id.content);
        viewFindViewById.getClass();
        r(viewFindViewById, cls, str, lhgVar);
    }

    public static void r(View view, Class cls, String str, lhg lhgVar) {
        krf.b();
        ko koVarW = w(view);
        if (koVarW == null) {
            koVarW = new ko();
            view.setTag(com.google.android.videos.R.id.ui_event_handlers, koVarW);
        }
        koVarW.put(cls, new kuw(str, lhgVar));
    }

    public static boolean s(View view, lhf lhfVar) {
        return t(view, "", lhfVar);
    }

    public static boolean t(View view, String str, lhf lhfVar) {
        AppCompatActivity appCompatActivity;
        View viewFindViewById;
        krf.b();
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = lhfVar.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        for (View viewV = view; viewV != null; viewV = v(viewV.getParent())) {
            if (y(viewV, lhfVar, arrayList, str)) {
                return true;
            }
        }
        if (view.getParent() == null) {
            krd.c("Trying to send event with an orphan view: ".concat(String.valueOf(lhfVar.getClass().getSimpleName())));
            return false;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                appCompatActivity = null;
                break;
            }
            if (context instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (appCompatActivity != null && (((viewFindViewById = appCompatActivity.findViewById(android.R.id.content)) != null && y(viewFindViewById, lhfVar, arrayList, str)) || x(appCompatActivity.getSupportFragmentManager().j(), lhfVar, arrayList, str))) {
            return true;
        }
        krd.c("Event is not handled: ".concat(String.valueOf(lhfVar.getClass().getSimpleName())));
        return false;
    }

    public static boolean u(Throwable th) {
        if (th instanceof krm) {
            krm krmVar = (krm) th;
            if (krmVar.a == 5) {
                xth xthVar = xtk.c(krmVar.getCause()).n;
                return xthVar == xth.UNAVAILABLE || xthVar == xth.DEADLINE_EXCEEDED || xthVar == xth.RESOURCE_EXHAUSTED || xthVar == xth.ABORTED || xthVar == xth.DATA_LOSS;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View v(ViewParent viewParent) {
        if (viewParent == 0) {
            return null;
        }
        return viewParent instanceof View ? (View) viewParent : v(viewParent.getParent());
    }

    private static ko w(View view) {
        return (ko) view.getTag(com.google.android.videos.R.id.ui_event_handlers);
    }

    private static boolean x(List list, lhf lhfVar, List list2, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bv bvVar = (bv) it.next();
            View view = bvVar.getView();
            if (view != null && y(view, lhfVar, list2, str)) {
                return true;
            }
            if (bvVar.isAdded() && x(bvVar.getChildFragmentManager().j(), lhfVar, list2, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, lhg] */
    private static boolean y(View view, lhf lhfVar, List list, String str) {
        ko koVarW = w(view);
        if (koVarW == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kuw kuwVar = (kuw) koVarW.get((Class) it.next());
            if (kuwVar != null && str.equals(kuwVar.a)) {
                kuwVar.b.a(lhfVar);
                return true;
            }
        }
        return false;
    }
}

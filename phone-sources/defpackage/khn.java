package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khn {
    public static final khn a = new khn();

    private khn() {
    }

    private static final long g(bao baoVar) {
        baoVar.x(-573505945);
        long j = wv.K(baoVar).s;
        long jK = bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.8f, bnq.f(j));
        ((bas) baoVar).aa();
        return jK;
    }

    public final void a(String str, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1272246190);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.F(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            rdd.p(str, null, g(baoVarD), 0L, cji.b, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).h, baoVar2, (i2 & 14) | 196608, 0, 65498);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(this, str, i, 16, null);
        }
    }

    public final void b(bao baoVar, int i) {
        int i2 = i & 1;
        bao baoVarD = baoVar.d(772310008);
        if (i2 == 0 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarD = zi.d(bkmVar, 7.0f);
            bvt bvtVarA = xo.a(bkb.a, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarD);
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
            xo.b(hq.f(zi.d(xs.a.a(bkmVar, bkb.e), 4.0f), g(baoVarD), aep.a), baoVarD, 0);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(this, i, 16);
        }
    }

    public final void c(bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-1132383726);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(null) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            aeh aehVar = wv.M(baoVarD).d;
            bkp bkpVarL = ht.l(bga.w(bkpVar.a(new AspectRatioElement(1.7777778f)), aehVar), 1.0f, wv.K(baoVarD).J, aehVar);
            baoVarD.x(2124907667);
            hv.g(ccf.y(R.drawable.media_placeholder, baoVarD, 0), null, bkpVarL, null, null, 0.0f, baoVarD, 48, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            ((bas) baoVarD).aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(this, bkpVar, i, 15);
        }
    }

    public final void d(boolean z, yjk yjkVar, boolean z2, bkp bkpVar, Integer num, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        chc chcVar;
        bao baoVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-551963022);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F("Title") ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            bkpVar2 = bkpVar;
            i2 |= true != baoVarD.F(bkpVar2) ? 8192 : 16384;
        } else {
            bkpVar2 = bkpVar;
        }
        if ((i & 196608) == 0) {
            i2 |= true != baoVarD.F(num) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F("Google Tv") ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bkp bkpVarA = zi.a(bkpVar2, 1.0f);
            bvt bvtVarA = zf.a(xk.f, bkb.m, baoVarD, 54);
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
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            int i3 = i2;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            bkp bkpVarA2 = zh.a(bkp.g, 1.0f, true);
            bvt bvtVarA2 = xu.a(xk.e(4.0f), bkb.j, baoVarD, 6);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
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
            baoVarD.x(-540181072);
            if (z2) {
                baoVarD.x(708226451);
                chcVar = wv.N(baoVarD).t;
                basVar.aa();
            } else {
                baoVarD.x(708294868);
                chcVar = wv.N(baoVarD).u;
                basVar.aa();
            }
            chc chcVar2 = chcVar;
            basVar.aa();
            baoVar2 = baoVarD;
            rdd.p("Title", null, wv.K(baoVarD).q, 0L, cji.b, 0L, null, 0L, 2, false, true != z2 ? 1 : 2, 0, null, chcVar2, baoVar2, (i3 & 14) | 196608, 48, 55258);
            int i4 = i3 >> 12;
            int i5 = (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072;
            khn khnVar = a;
            khnVar.e(null, num, baoVar2, (i4 & 896) | i5);
            baoVar2.o();
            zy.k(new SizeElement(12.0f, 0.0f, 12.0f, 0.0f, 10), baoVar2);
            int i6 = i3 >> 3;
            khnVar.f(z, yjkVar, null, baoVar2, (i6 & 14) | 3072 | (i6 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khl(this, z, yjkVar, z2, bkpVar, num, i, 0);
        }
    }

    public final void e(bkp bkpVar, Integer num, bao baoVar, int i) {
        bao baoVarD = baoVar.d(723260331);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(num) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F("Google Tv") ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            bvt bvtVarA = zf.a(xk.e(4.0f), bkb.n, baoVarD, 54);
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
            baoVarD.x(-1823709807);
            khn khnVar = a;
            khnVar.a(num.toString(), baoVarD, 48);
            khnVar.b(baoVarD, 6);
            khnVar.a("Google Tv", baoVarD, ((i2 >> 6) & 14) | 48);
            basVar.aa();
            baoVarD.o();
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) this, bkpVar2, (Object) num, i, 12);
        }
    }

    public final void f(boolean z, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-2079195817);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.G(z) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(-947381005);
            aeh aehVar = z ? aep.a : wv.M(baoVarD).c;
            ((bas) baoVarD).aa();
            rdd.C(yjkVar, bga.w(ht.l(zi.e(bkmVar, rdd.H(1)), 1.0f, wv.K(baoVarD).F, aehVar), aehVar), false, rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), null, aehVar, bga.k(1275196153, new khm(z, context, 0), baoVarD), baoVarD, ((i2 >> 3) & 14) | 1572864, 20);
            baoVarD = baoVarD;
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(this, z, yjkVar, bkpVar2, i, 8);
        }
    }
}

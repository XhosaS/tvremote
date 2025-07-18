package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaf {
    public static final void a(ksn ksnVar, qwo qwoVar) {
        if (qwoVar.a() != null) {
            if (qwoVar.a() == null) {
                return;
            }
            String str = ksnVar.a;
            rgj rgjVar = (rgj) qwoVar.a();
            if (yks.e(str, rgjVar != null ? rgjVar.c : null)) {
                return;
            }
        }
        ImmutableList<rgj> immutableListE = qwoVar.e();
        immutableListE.getClass();
        for (rgj rgjVar2 : immutableListE) {
            if (sij.L(rgjVar2.c, ksnVar.a)) {
                qwoVar.a.g(rgjVar2);
                return;
            }
        }
    }

    public static final kcf b(bdy bdyVar) {
        return (kcf) bdyVar.a();
    }

    public static final void c(kbm kbmVar, yjk yjkVar, yjk yjkVar2, bkp bkpVar, boolean z, bao baoVar, int i) {
        int i2;
        yjk yjkVar3;
        boolean z2;
        bao baoVar2;
        kbm kbmVar2 = kbmVar;
        kbmVar2.getClass();
        yjkVar.getClass();
        yjkVar2.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1908333231);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(kbmVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            yjkVar3 = yjkVar2;
            i2 |= true != baoVarD.H(yjkVar3) ? 128 : 256;
        } else {
            yjkVar3 = yjkVar2;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= true != baoVarD.G(z2) ? 8192 : 16384;
        } else {
            z2 = z;
        }
        int i4 = i2;
        if ((i4 & 8339) == 8338 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = kbmVar2.i;
                basVar.ae(objT);
            }
            basVar.aa();
            bdy bdyVarI = dad.i((yva) objT, baoVarD);
            baoVarD.x(1849434622);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                bci bciVar = new bci(true, bcz.c);
                basVar.ae(bciVar);
                objT2 = bciVar;
            }
            bcb bcbVar = (bcb) objT2;
            basVar.aa();
            wsu wsuVar = kbmVar2.e;
            bhq bhqVarK = bga.k(-1758582098, new kbu(kbmVar2, kbmVar2.g, yjkVar3, z2, bdyVarI, bcbVar, 0), baoVarD);
            bhq bhqVarK2 = bga.k(387984367, new azg(wsuVar, 12), baoVarD);
            kbmVar2 = kbmVar;
            bhq bhqVarK3 = bga.k(-1760416464, new awe((Object) wsuVar, (Object) kbmVar, (Object) bcbVar, bdyVarI, 2), baoVarD);
            bhq bhqVarK4 = bga.k(386150001, new awh(wsuVar, kbmVar2, 18, null), baoVarD);
            bkp bkpVarV = hu.v(bkp.g.a(zi.c), true, null);
            long j = b(bdyVarI).b;
            yy yyVar = knl.a;
            baoVar2 = baoVarD;
            jxl.D(bhqVarK, bhqVarK2, bhqVarK3, bhqVarK4, yjkVar, bkpVarV, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.2f, bnq.f(j)), baoVar2, ((i4 << 9) & 57344) | 200118);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kes(kbmVar2, yjkVar, yjkVar2, bkpVar, z, i, 1);
        }
    }

    public static final void d(wlx wlxVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(1974029077);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(wlxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            wv.i(zi.b(bkpVar, 20.0f), bkb.d, false, bga.k(702048511, new ro(wlxVar, 16), baoVarD), baoVarD, 3120, 4);
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(wlxVar, bkpVar2, i, 19, null);
        }
    }

    public static final void e(boolean z, yjk yjkVar, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        boolean z2;
        int i2;
        yjk yjkVar2;
        bao baoVar2;
        yjkVar.getClass();
        yjzVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1579147383);
        if (i3 == 0) {
            z2 = z;
            i2 = (true != baoVarD.G(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 16 : 32;
        } else {
            yjkVar2 = yjkVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            rdd.y(z2, yjkVar2, zi.q(bkpVar), 0L, null, null, null, 0L, 0.0f, bga.k(-722368338, new khb(yjzVar, 4), baoVarD), baoVar2, i2 & R.styleable.AppCompatTheme_windowNoTitle, 48);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwv(z, yjkVar, bkpVar, yjzVar, i, 7);
        }
    }

    public static final void f(boolean z, yjk yjkVar, yjk yjkVar2, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        bao baoVar2;
        yjkVar.getClass();
        yjkVar2.getClass();
        bao baoVarD = baoVar.d(165550586);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar2) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            if (!z) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new kbe((Object) yjkVar, (Object) yjkVar2, (Object) bkmVar, i, 7);
                    return;
                }
                return;
            }
            bkpVar2 = bkmVar;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            int i4 = i3 >> 3;
            baoVar2 = baoVarD;
            qtl.ab(yjkVar, bga.k(-85887822, new khi(yjkVar2, context, 1), baoVarD), bkpVar2, bga.k(-159472400, new khi(yjkVar, context, 0), baoVarD), khd.a, bga.k(-233056978, new kgx(context, 9), baoVarD), bga.k(1877634381, new kgx(context, 10), baoVarD), null, 0L, 0.0f, 0L, 0L, 0L, null, baoVar2, (i4 & 14) | 1797168 | (i4 & 896), 0, 16256);
        }
        bcr bcrVarM2 = baoVar2.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new jwv(z, yjkVar, yjkVar2, bkpVar2, i, 4);
        }
    }

    public static final void g(bkp bkpVar, yy yyVar, yka ykaVar, bao baoVar, int i, int i2) {
        int i3;
        ykaVar.getClass();
        int i4 = i2 & 1;
        bao baoVarD = baoVar.d(96204549);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(yyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (i4 != 0) {
                bkpVar = bkp.g;
            }
            if (i5 != 0) {
                yyVar = new za(26.0f, 26.0f, 26.0f, 26.0f);
            }
            bkp bkpVarA = zi.a(bkpVar, 1.0f).a(new AspectRatioElement(1.0f));
            long j = wv.K(baoVarD).I;
            aeh aehVar = aep.a;
            bkp bkpVarO = wv.o(ht.l(hq.f(bkpVarA, j, aehVar), 2.0f, wv.K(baoVarD).J, aehVar), yyVar);
            bvt bvtVarA = xo.a(bkb.a, false);
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
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            ykaVar.a(xs.a, baoVarD, Integer.valueOf(((i3 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            baoVarD.o();
        }
        bkp bkpVar2 = bkpVar;
        yy yyVar2 = yyVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(bkpVar2, yyVar2, ykaVar, i, i2, 6);
        }
    }

    public static final void h(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3;
        yjk yjkVar2 = yjkVar;
        int i4 = i & 6;
        bao baoVarD = baoVar.d(-1633633770);
        if (i4 == 0) {
            i2 = (true != baoVarD.H(yjkVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            i3 = 14;
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
            baoVarD.x(553831497);
            bdy bdyVarA = mu.a(zBooleanValue ? 32.0f : 40.0f, null, baoVarD, 14);
            float f = true != zBooleanValue ? 16.0f : 32.0f;
            bdy bdyVarA2 = mu.a(f, null, baoVarD, 14);
            bdy bdyVarA3 = mu.a(f, null, baoVarD, 14);
            bdy bdyVarA4 = mu.a(true != zBooleanValue ? 40.0f : 32.0f, null, baoVarD, 14);
            float f2 = ((cma) bdyVarA.a()).a;
            float f3 = ((cma) bdyVarA2.a()).a;
            float f4 = ((cma) bdyVarA3.a()).a;
            i3 = 14;
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
            rdd.B(yjkVar2, bga.w(ht.l(bkpVar, 1.0f, wv.K(baoVarD).J, aehVar), aehVar), false, aehVar, rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), kwVar, bga.k(2077980406, new kgx(context, 8), baoVarD), baoVarD, (i2 & 14) | 1769472, 4);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, i3);
        }
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lav lavVar = (lav) it.next();
            lar larVar = lavVar.c;
            if (larVar == null) {
                larVar = lar.a;
            }
            String str = larVar.b;
            kuf kufVar = kuf.a;
            arrayList.add(new kup(new ktn(str), lavVar.d, lavVar.e, lavVar.f));
        }
        return arrayList;
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return "MOVIE";
            case 2:
                return "SHOW";
            case 3:
                return "SEASON";
            case 4:
                return "EPISODE";
            case 5:
                return "BUNDLE";
            case 6:
                return "DISTRIBUTOR";
            case 7:
                return "CONTINUEWATCHINGFEED";
            case 8:
                return "MOVIE_PLAYBACK";
            case 9:
                return "SHOW_PLAYBACK";
            case 10:
                return "ANDROIDAPP";
            case 11:
                return "GUIDE_SETTINGS";
            case 12:
                return "FHR_BANNER_ITEM";
            case 13:
                return "MODEL_NOT_SET";
            default:
                return "null";
        }
    }

    public static int k(int i) {
        switch (i) {
            case 0:
                return 13;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
            default:
                return 0;
            case 12:
                return 11;
            case 13:
                return 12;
        }
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? "DUBBED" : "ORIGINAL" : "UNKNOWN";
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? "EPISODE" : "TRAILER" : "MOVIE";
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? "MOVIE_BUNDLE" : "SHOW" : "MOVIE";
    }
}

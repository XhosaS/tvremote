package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.TextureView;
import android.view.View;
import android.widget.Toast;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.play.movies.mobileux.screen.details.userfeedback.UserFeedbackView;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxl {
    public static final void A(final bkp bkpVar, final abw abwVar, final yy yyVar, float f, float f2, float f3, final yjv yjvVar, bao baoVar, final int i) {
        int i2;
        yjv yjvVar2;
        float f4;
        float f5;
        float f6;
        float f7;
        final float f8;
        final float f9;
        final float f10;
        yjvVar.getClass();
        bao baoVarD = baoVar.d(-1274618219);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(abwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(yyVar) ? 128 : 256;
        }
        int i3 = i2 | 224256;
        if ((1572864 & i) == 0) {
            yjvVar2 = yjvVar;
            i3 |= true != baoVarD.H(yjvVar2) ? 524288 : 1048576;
        } else {
            yjvVar2 = yjvVar;
        }
        if ((599187 & i3) == 599186 && baoVarD.K()) {
            baoVarD.t();
            f10 = f;
            f8 = f2;
            f9 = f3;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                float f11 = knq.a;
                f4 = knq.a;
                f5 = knq.c;
                f6 = knq.d;
            } else {
                baoVarD.t();
                f4 = f;
                f5 = f2;
                f6 = f3;
            }
            baoVarD.m();
            Configuration configuration = (Configuration) baoVarD.f(AndroidCompositionLocals_androidKt.a);
            gnh gnhVar = a.bY(baoVarD).a;
            float fB = yyVar.b(cmi.a);
            int i4 = configuration.orientation;
            baoVarD.x(-1633490746);
            boolean zD = baoVarD.D(i4);
            int i5 = gnhVar.a;
            boolean zD2 = zD | baoVarD.D(i5);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zD2 || objT == ban.a) {
                float f12 = fB + fB;
                if (configuration.orientation == 2 || i5 >= 600) {
                    float f13 = knq.a;
                    f7 = knq.e;
                } else {
                    f7 = 0.0f;
                }
                float f14 = (i5 - f12) - f7;
                int iJ = ykn.j((int) (f14 / f5), 1);
                int iJ2 = ykn.j((int) (f14 / f6), 1);
                if (iJ < iJ2) {
                    iJ = iJ2;
                }
                objT = Integer.valueOf(iJ);
                basVar.ae(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            basVar.aa();
            baoVarD.x(5004770);
            boolean zD3 = baoVarD.D(iIntValue);
            Object objT2 = basVar.T();
            if (zD3 || objT2 == ban.a) {
                objT2 = new bci(new cma(((iIntValue - 1) * f4) + (iIntValue * f6) + fB + fB), bcz.c);
                basVar.ae(objT2);
            }
            basVar.aa();
            int i6 = i3;
            d.l(new aar(iIntValue), bkpVar.a(new SizeElement(1 != (1 & 1) ? 0.0f : Float.NaN, 0.0f, (1 & 2) != 0 ? Float.NaN : ((cma) ((bcb) objT2).a()).a, 0.0f, 10)), abwVar, yyVar, xk.e(f4), xk.f(f4, bkb.k), null, false, null, yjvVar2, baoVarD, (i6 << 3) & 8064, (i6 >> 18) & 14, 912);
            f8 = f5;
            f9 = f6;
            f10 = f4;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: knr
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    abw abwVar2 = abwVar;
                    yy yyVar2 = yyVar;
                    float f15 = f10;
                    float f16 = f8;
                    float f17 = f9;
                    jxl.A(bkpVar2, abwVar2, yyVar2, f15, f16, f17, yjvVar, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void B(wls wlsVar, chc chcVar, long j, bkp bkpVar, int i, bao baoVar, int i2) {
        int i3;
        int i4;
        bao baoVar2;
        bkp bkpVar2;
        chcVar.getClass();
        bao baoVarD = baoVar.d(-822807426);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.F(wlsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(chcVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.E(j) ? 128 : 256;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 = i;
            i5 |= true != baoVarD.D(i4) ? 8192 : 16384;
        } else {
            i4 = i;
        }
        if ((196608 & i2) == 0) {
            i5 |= true != baoVarD.D(2) ? 65536 : 131072;
        }
        if ((74899 & i5) == 74898 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            int i6 = i5 & 896;
            int i7 = i5 >> 6;
            int i8 = 57344 & i5;
            int i9 = i5 >> 9;
            int i10 = i5;
            bkm bkmVar = bkp.g;
            boolean z = wlsVar.c;
            int i11 = (i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | i6;
            int i12 = (i9 & 896) | i8;
            if (z) {
                baoVarD.x(-877425071);
                String str = wlsVar.b;
                str.getClass();
                baoVar2 = baoVarD;
                axa.c(jyv.s(str, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.2f, bnq.f(j))), bkmVar, j, 0L, 0L, 0L, 2, false, i4, 0, null, null, chcVar, baoVar2, i11, i12 | ((i10 << 21) & 234881024), 241656);
                ((bas) baoVar2).aa();
            } else {
                baoVarD.x(-877057380);
                String str2 = wlsVar.b;
                str2.getClass();
                axa.b(str2, bkmVar, j, 0L, null, 0L, null, 0L, 2, false, i, 0, null, chcVar, baoVarD, i11, i12 | ((i10 << 18) & 29360128), 110584);
                baoVar2 = baoVarD;
                ((bas) baoVar2).aa();
            }
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new knp(wlsVar, chcVar, j, bkpVar2, i, i2, 0);
        }
    }

    public static final void C(final bkp bkpVar, long j, float f, nt ntVar, bao baoVar, final int i) {
        int i2;
        float f2;
        nt ntVar2;
        final float f3;
        final nt ntVar3;
        bao baoVarD = baoVar.d(-266944955);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            f3 = f;
            ntVar3 = ntVar;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                j = wv.K(baoVarD).r;
                nt ntVar4 = knn.a;
                f2 = 24.0f;
                ntVar2 = knn.a;
            } else {
                baoVarD.t();
                f2 = f;
                ntVar2 = ntVar;
            }
            baoVarD.m();
            ny nyVarD = og.d(baoVarD);
            nt ntVar5 = knn.a;
            xo.b(hq.f(bkpVar.a(zi.c), bny.k(bnq.d(j), bnq.c(j), bnq.b(j), ((Number) og.c(nyVarD, 0.5f, 0.2f, ntVar2, baoVarD, 4104).a()).floatValue(), bnq.f(j)), aep.a(f2)), baoVarD, 0);
            f3 = f2;
            ntVar3 = ntVar2;
        }
        final long j2 = j;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kno
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    long j3 = j2;
                    float f4 = f3;
                    jxl.C(bkpVar2, j3, f4, ntVar3, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void D(final yjz yjzVar, final yjz yjzVar2, final yjz yjzVar3, final yjz yjzVar4, final yjk yjkVar, final bkp bkpVar, final long j, bao baoVar, final int i) {
        yjz yjzVar5;
        int i2;
        bao baoVar2;
        yjzVar.getClass();
        yjzVar2.getClass();
        yjzVar3.getClass();
        yjzVar4.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1518049729);
        if (i3 == 0) {
            yjzVar5 = yjzVar;
            i2 = (true != baoVarD.H(yjzVar5) ? 2 : 4) | i;
        } else {
            yjzVar5 = yjzVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar4) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.E(j) ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            arh arhVarC = og.C(bnq.f, 0L, 0L, 0L, baoVar2, 14);
            yy yyVar = knl.a;
            int i4 = i2 >> 12;
            og.x(yjkVar, bkpVar, false, knl.d, arhVarC, null, ht.j(j), bga.k(-375570316, new ada(yjzVar5, yjzVar3, yjzVar4, yjzVar2, 6), baoVarD), baoVar2, (i4 & 14) | 100666368 | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 164);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: knm
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yjz yjzVar6 = yjzVar;
                    yjz yjzVar7 = yjzVar2;
                    yjz yjzVar8 = yjzVar3;
                    yjz yjzVar9 = yjzVar4;
                    yjk yjkVar2 = yjkVar;
                    bkp bkpVar2 = bkpVar;
                    jxl.D(yjzVar6, yjzVar7, yjzVar8, yjzVar9, yjkVar2, bkpVar2, j, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void E(mdw mdwVar, jyb jybVar, bcb bcbVar, by byVar, gi giVar, bcb bcbVar2, bao baoVar, int i) {
        int i2;
        bas basVar;
        bkm bkmVar;
        int i3;
        int i4;
        gi giVar2;
        bao baoVar2;
        bcbVar.getClass();
        giVar.getClass();
        bcbVar2.getClass();
        int i5 = i & 6;
        bao baoVarD = baoVar.d(-396654907);
        if (i5 == 0) {
            i2 = (true != baoVarD.H(mdwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(jybVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bcbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(byVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? baoVarD.F(giVar) : baoVarD.H(giVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.F(bcbVar2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar2 = bkp.g;
            bkp bkpVarA = zi.a(wv.p(bkmVar2, ccf.x(com.google.android.videos.R.dimen.content_restriction_padding, baoVarD)), 1.0f);
            bvt bvtVarA = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar2 = (bas) baoVarD;
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            baoVarD.x(1397731189);
            bkp bkpVarV = wv.v(zh.a(bkmVar2, 0.9f, true), 0.0f, 0.0f, ccf.x(com.google.android.videos.R.dimen.disclaimer_container_padding_end, baoVarD), 0.0f, 11);
            bvt bvtVarA2 = xu.a(xk.c, bkb.j, baoVarD, 0);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar2.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarV);
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar2.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            baoVarD.x(-668157864);
            if (mdwVar.p()) {
                basVar = basVar2;
                bkmVar = bkmVar2;
                i3 = 16384;
                i4 = 131072;
            } else {
                bkmVar = bkmVar2;
                i4 = 131072;
                basVar = basVar2;
                i3 = 16384;
                axa.b(ccf.w(com.google.android.videos.R.string.pref_content_filtering_title, baoVarD), wv.v(bkmVar2, 0.0f, 0.0f, 0.0f, ccf.x(com.google.android.videos.R.dimen.parental_controls_title_padding_bottom, baoVarD), 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).m, baoVarD, 0, 0, 131068);
                baoVarD = baoVarD;
            }
            basVar.aa();
            bao baoVar3 = baoVarD;
            boolean z = true;
            axa.b(ccf.w(true != mdwVar.p() ? com.google.android.videos.R.string.parental_controls_content_disclaimer : com.google.android.videos.R.string.parental_controls_kids_title, baoVarD), null, wv.K(baoVarD).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).k, baoVar3, 0, 0, 131066);
            baoVar3.o();
            if (mdwVar.p()) {
                basVar.aa();
                baoVar2 = baoVar3;
            } else {
                bkp bkpVarD = ccf.d(zh.a(bkmVar, 0.1f, true), "parental_controls_switch");
                boolean zBooleanValue = ((Boolean) bcbVar.a()).booleanValue();
                baoVar3.x(-1224400529);
                boolean zH = baoVar3.H(mdwVar) | ((458752 & i2) == i4) | ((i2 & 896) == 256) | baoVar3.H(jybVar) | baoVar3.H(byVar);
                if ((57344 & i2) != i3) {
                    if ((i2 & 32768) != 0) {
                        giVar2 = giVar;
                        if (!baoVar3.H(giVar2)) {
                        }
                    } else {
                        giVar2 = giVar;
                    }
                    z = false;
                } else {
                    giVar2 = giVar;
                }
                boolean z2 = zH | z;
                Object objT = basVar.T();
                if (z2 || objT == ban.a) {
                    jyh jyhVar = new jyh(mdwVar, bcbVar2, bcbVar, jybVar, byVar, giVar2, 0);
                    basVar.ae(jyhVar);
                    objT = jyhVar;
                }
                basVar.aa();
                awt.a(zBooleanValue, (yjv) objT, bkpVarD, false, null, baoVar3, 0);
                baoVar2 = baoVar3;
                basVar.aa();
            }
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khu(mdwVar, jybVar, bcbVar, byVar, giVar, bcbVar2, i, 1);
        }
    }

    public static final void F(bkp bkpVar, final fwv fwvVar, jyb jybVar, final mdw mdwVar, final List list, bao baoVar, int i) {
        int i2;
        bcb bcbVar;
        bcb bcbVar2;
        ha haVar;
        gt gtVar;
        ha haVar2;
        jyb jybVar2 = jybVar;
        bkpVar.getClass();
        fwvVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1941768867);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(fwvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(jybVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(mdwVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(list) ? 8192 : 16384;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bcp bcpVar = AndroidCompositionLocals_androidKt.b;
            final by byVarF = hju.F((Context) baoVarD.f(bcpVar));
            if (byVarF == null) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    bcrVarM.d = new sx(bkpVar, fwvVar, jybVar2, mdwVar, list, i, 5);
                    return;
                }
                return;
            }
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(Boolean.valueOf(mdwVar.o() || mdwVar.p()), bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar3 = (bcb) objT;
            basVar.aa();
            Object[] objArr = new Object[0];
            baoVarD.x(1849434622);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new gel(16);
                basVar.ae(objT2);
            }
            basVar.aa();
            bcb bcbVar4 = (bcb) bga.p(objArr, (yjk) objT2, baoVarD);
            Object[] objArr2 = new Object[0];
            baoVarD.x(1849434622);
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                objT3 = new gel(17);
                basVar.ae(objT3);
            }
            basVar.aa();
            bcb bcbVar5 = (bcb) bga.p(objArr2, (yjk) objT3, baoVarD);
            ha haVar3 = new ha();
            baoVarD.x(-1746271574);
            boolean zH = baoVarD.H(mdwVar) | baoVarD.H(jybVar2);
            Object objT4 = basVar.T();
            if (zH || objT4 == obj) {
                bcbVar = bcbVar4;
                bcbVar2 = bcbVar5;
                haVar = haVar3;
                ikc ikcVar = new ikc(mdwVar, jybVar2, bcbVar3, 9, (char[]) null);
                jybVar2 = jybVar2;
                bcbVar3 = bcbVar3;
                basVar.ae(ikcVar);
                objT4 = ikcVar;
            } else {
                bcbVar2 = bcbVar5;
                bcbVar = bcbVar4;
                haVar = haVar3;
            }
            basVar.aa();
            a.bR(haVar, baoVarD);
            bdy bdyVarBR = a.bR((yjv) objT4, baoVarD);
            Object[] objArr3 = new Object[0];
            Object objT5 = basVar.T();
            if (objT5 == obj) {
                objT5 = new gf(1);
                basVar.ae(objT5);
            }
            ha haVar4 = haVar;
            final bcb bcbVar6 = bcbVar;
            final bcb bcbVar7 = bcbVar3;
            String str = (String) bga.o(objArr3, null, (yjk) objT5, baoVarD, 3072, 6);
            gu guVar = (gu) baoVarD.f(gg.a);
            if (guVar == null) {
                baoVarD.x(1213380307);
                Object baseContext = (Context) baoVarD.f(bcpVar);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof gu) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                guVar = (gu) baseContext;
            } else {
                baoVarD.x(1213379439);
            }
            basVar.aa();
            if (guVar == null) {
                throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            }
            gt activityResultRegistry = guVar.getActivityResultRegistry();
            Object objT6 = basVar.T();
            if (objT6 == obj) {
                objT6 = new nxb();
                basVar.ae(objT6);
            }
            nxb nxbVar = (nxb) objT6;
            Object objT7 = basVar.T();
            if (objT7 == obj) {
                objT7 = new gi(nxbVar);
                basVar.ae(objT7);
            }
            final gi giVar = (gi) objT7;
            boolean zH2 = baoVarD.H(nxbVar) | baoVarD.H(activityResultRegistry) | baoVarD.F(str) | baoVarD.H(haVar4) | baoVarD.F(bdyVarBR);
            Object objT8 = basVar.T();
            if (zH2 || objT8 == obj) {
                objT8 = new up(nxbVar, activityResultRegistry, str, haVar4, bdyVarBR, 1);
                gtVar = activityResultRegistry;
                haVar2 = haVar4;
                basVar.ae(objT8);
            } else {
                gtVar = activityResultRegistry;
                haVar2 = haVar4;
            }
            yjv yjvVar = (yjv) objT8;
            boolean zF = baoVarD.F(gtVar) | baoVarD.F(str) | baoVarD.F(haVar2);
            Object objT9 = basVar.T();
            if (zF || objT9 == obj) {
                objT9 = new bbj(yjvVar);
                basVar.ae(objT9);
            }
            baoVarD.x(-1224400529);
            final bcb bcbVar8 = bcbVar2;
            boolean zH3 = baoVarD.H(mdwVar) | baoVarD.H(jybVar2) | baoVarD.H(byVarF) | baoVarD.H(giVar) | baoVarD.F(bcbVar8) | baoVarD.H(list) | baoVarD.H(fwvVar) | baoVarD.F(bcbVar6);
            Object objT10 = basVar.T();
            if (zH3 || objT10 == obj) {
                final jyb jybVar3 = jybVar2;
                yjv yjvVar2 = new yjv() { // from class: jyj
                    @Override // defpackage.yjv
                    public final Object a(Object obj2) {
                        aad aadVar = (aad) obj2;
                        aadVar.getClass();
                        aadVar.a.o(1, new aab(new pl(15), new bhq(-857469575, true, new aac(new bhq(-648821832, true, new jyl(mdwVar, jybVar3, bcbVar7, byVarF, giVar, bcbVar8, list, fwvVar, bcbVar6))))));
                        return ygi.a;
                    }
                };
                basVar.ae(yjvVar2);
                objT10 = yjvVar2;
            }
            basVar.aa();
            baoVarD = baoVarD;
            d.n(bkpVar, null, null, null, null, null, false, null, (yjv) objT10, baoVarD, i4 & 14, 510);
        }
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            bcrVarM2.d = new sx(bkpVar, fwvVar, jybVar, mdwVar, list, i, 6);
        }
    }

    public static final void G(mdw mdwVar, jyb jybVar, bcb bcbVar, boolean z) {
        jybVar.a = z;
        if (z) {
            return;
        }
        bcbVar.b(Boolean.valueOf(!((Boolean) bcbVar.a()).booleanValue()));
        mdwVar.n(((Boolean) bcbVar.a()).booleanValue());
    }

    public static final void H(jyb jybVar, List list, mdw mdwVar, bao baoVar, int i) {
        jyb jybVar2;
        int i2;
        bas basVar;
        bcb bcbVar;
        bao baoVar2;
        jybVar.getClass();
        list.getClass();
        mdwVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1796407263);
        if (i3 == 0) {
            jybVar2 = jybVar;
            i2 = (true != baoVarD.H(jybVar2) ? 2 : 4) | i;
        } else {
            jybVar2 = jybVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(mdwVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bcp bcpVar = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) baoVarD.f(bcpVar);
            Context context2 = (Context) baoVarD.f(bcpVar);
            Object[] objArrCopyOf = Arrays.copyOf(new fxo[0], 0);
            bij bijVar = new bij(new yjz() { // from class: fyi
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    Bundle bundleJ;
                    fwv fwvVar = (fwv) obj2;
                    fyr fyrVar = fwvVar.b;
                    ArrayList arrayList = new ArrayList();
                    Bundle bundleJ2 = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                    for (Map.Entry entry : fyrVar.n.c().entrySet()) {
                    }
                    if (arrayList.isEmpty()) {
                        bundleJ = null;
                    } else {
                        bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                        ghf.d(bundleJ2, "android-support-nav:controller:navigatorState:names", arrayList);
                        ghf.a(bundleJ, "android-support-nav:controller:navigatorState", bundleJ2);
                    }
                    ygx ygxVar = fyrVar.f;
                    if (!ygxVar.isEmpty()) {
                        if (bundleJ == null) {
                            bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ygxVar.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new dxc((fwr) it.next()).h());
                        }
                        ghf.b(bundleJ, "android-support-nav:controller:backStack", arrayList2);
                    }
                    Map map = fyrVar.h;
                    if (!map.isEmpty()) {
                        if (bundleJ == null) {
                            bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                        }
                        int[] iArr = new int[map.size()];
                        ArrayList arrayList3 = new ArrayList();
                        int i4 = 0;
                        for (Map.Entry entry2 : map.entrySet()) {
                            int iIntValue = ((Number) entry2.getKey()).intValue();
                            String str = (String) entry2.getValue();
                            int i5 = i4 + 1;
                            iArr[i4] = iIntValue;
                            if (str == null) {
                                str = "";
                            }
                            arrayList3.add(str);
                            i4 = i5;
                        }
                        bundleJ.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                        ghf.d(bundleJ, "android-support-nav:controller:backStackIds", arrayList3);
                    }
                    Map map2 = fyrVar.i;
                    if (!map2.isEmpty()) {
                        if (bundleJ == null) {
                            bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Map.Entry entry3 : map2.entrySet()) {
                            String str2 = (String) entry3.getKey();
                            ygx ygxVar2 = (ygx) entry3.getValue();
                            arrayList4.add(str2);
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<E> it2 = ygxVar2.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(((dxc) it2.next()).h());
                            }
                            ghf.b(bundleJ, "android-support-nav:controller:backStackStates:".concat(String.valueOf(str2)), arrayList5);
                        }
                        ghf.d(bundleJ, "android-support-nav:controller:backStackStates", arrayList4);
                    }
                    if (fwvVar.d) {
                        if (bundleJ == null) {
                            bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                        }
                        bundleJ.putBoolean("android-support-nav:controller:deepLinkHandled", fwvVar.d);
                    }
                    return bundleJ;
                }
            }, new bap(context2, 20));
            boolean zH = baoVarD.H(context2);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            if (zH || objT == ban.a) {
                objT = new ddd(context2, 14);
                basVar2.ae(objT);
            }
            fwv fwvVar = (fwv) bga.o(objArrCopyOf, bijVar, (yjk) objT, baoVarD, 0, 4);
            baoVarD.x(1849434622);
            Object objT2 = basVar2.T();
            Object obj = ban.a;
            if (objT2 == obj) {
                bci bciVar = new bci(context.getString(com.google.android.videos.R.string.content_restrictions_title), bcz.c);
                basVar2.ae(bciVar);
                objT2 = bciVar;
            }
            bcb bcbVar2 = (bcb) objT2;
            basVar2.aa();
            baoVarD.x(-1746271574);
            boolean zH2 = baoVarD.H(fwvVar) | baoVarD.H(context);
            Object objT3 = basVar2.T();
            if (zH2 || objT3 == obj) {
                basVar = basVar2;
                ixs ixsVar = new ixs(fwvVar, context, bcbVar2, (yih) null, 13);
                bcbVar = bcbVar2;
                basVar.ae(ixsVar);
                objT3 = ixsVar;
            } else {
                basVar = basVar2;
                bcbVar = bcbVar2;
            }
            basVar.aa();
            bbn.f(true, (yjz) objT3, baoVarD);
            baoVar2 = baoVarD;
            wv.C(null, bga.k(2070275995, new awh(fwvVar, bcbVar, 13, null), baoVarD), null, null, null, 0, 0L, 0L, null, bga.k(834295088, new ada(fwvVar, jybVar2, mdwVar, list, 4), baoVarD), baoVar2, 805306416, 509);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(jybVar, list, mdwVar, i, 20, (char[]) null);
        }
    }

    public static void I(final nau nauVar, UserFeedbackView userFeedbackView, lio lioVar, pkg pkgVar, final pjx pjxVar, final boolean z) {
        int i;
        liq liqVar;
        userFeedbackView.a(nauVar);
        int i2 = nauVar.b.d;
        pke pkeVar = (pke) pkgVar.b;
        pkeVar.b(i2 == 1 ? 109934 : 109936).b(userFeedbackView.findViewById(com.google.android.videos.R.id.thumb_up_button));
        if (i2 == 1) {
            liqVar = lip.a;
            i = 1;
        } else {
            i = i2;
            liqVar = lip.c;
        }
        final lif lifVar = new lif(liqVar, lioVar);
        lioVar.d(lifVar.b);
        final int i3 = 1;
        userFeedbackView.a.setOnClickListener(new View.OnClickListener() { // from class: naq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                if (i4 == 0) {
                    if (z) {
                        Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                        return;
                    }
                    lio lioVar2 = lifVar;
                    nau nauVar2 = nauVar;
                    pjxVar.a(pjw.b(), view);
                    kff.s(view, new nal(nauVar2.a, nauVar2.b, nauVar2.d.b, view, lioVar2));
                    return;
                }
                if (i4 == 1) {
                    if (z) {
                        Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                        return;
                    }
                    lio lioVar3 = lifVar;
                    nau nauVar3 = nauVar;
                    pjxVar.a(pjw.b(), view);
                    kff.s(view, new nam(nauVar3.a, nauVar3.b, nauVar3.d.a, view, lioVar3));
                    return;
                }
                if (z) {
                    Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                    return;
                }
                lio lioVar4 = lifVar;
                nau nauVar4 = nauVar;
                pjxVar.a(pjw.b(), view);
                kff.s(view, new nan(nauVar4.b.a, nauVar4.c, nauVar4.d.c, view, lioVar4));
            }
        });
        pkeVar.b(i == 2 ? 109933 : 109935).b(userFeedbackView.findViewById(com.google.android.videos.R.id.thumb_down_button));
        final lif lifVar2 = new lif(i == 2 ? lip.b : lip.d, lioVar);
        lioVar.d(lifVar2.b);
        final int i4 = 0;
        userFeedbackView.b.setOnClickListener(new View.OnClickListener() { // from class: naq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                if (i42 == 0) {
                    if (z) {
                        Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                        return;
                    }
                    lio lioVar2 = lifVar2;
                    nau nauVar2 = nauVar;
                    pjxVar.a(pjw.b(), view);
                    kff.s(view, new nal(nauVar2.a, nauVar2.b, nauVar2.d.b, view, lioVar2));
                    return;
                }
                if (i42 == 1) {
                    if (z) {
                        Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                        return;
                    }
                    lio lioVar3 = lifVar2;
                    nau nauVar3 = nauVar;
                    pjxVar.a(pjw.b(), view);
                    kff.s(view, new nam(nauVar3.a, nauVar3.b, nauVar3.d.a, view, lioVar3));
                    return;
                }
                if (z) {
                    Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                    return;
                }
                lio lioVar4 = lifVar2;
                nau nauVar4 = nauVar;
                pjxVar.a(pjw.b(), view);
                kff.s(view, new nan(nauVar4.b.a, nauVar4.c, nauVar4.d.c, view, lioVar4));
            }
        });
        boolean z2 = nauVar.c;
        pkeVar.b(true != z2 ? 109932 : 108217).b(userFeedbackView.findViewById(com.google.android.videos.R.id.watchlist_button));
        final lif lifVar3 = new lif(z2 ? lip.f : lip.e, lioVar);
        lioVar.d(lifVar3.b);
        final int i5 = 2;
        userFeedbackView.c.setOnClickListener(new View.OnClickListener() { // from class: naq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                if (i42 == 0) {
                    if (z) {
                        Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                        return;
                    }
                    lio lioVar2 = lifVar3;
                    nau nauVar2 = nauVar;
                    pjxVar.a(pjw.b(), view);
                    kff.s(view, new nal(nauVar2.a, nauVar2.b, nauVar2.d.b, view, lioVar2));
                    return;
                }
                if (i42 == 1) {
                    if (z) {
                        Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                        return;
                    }
                    lio lioVar3 = lifVar3;
                    nau nauVar3 = nauVar;
                    pjxVar.a(pjw.b(), view);
                    kff.s(view, new nam(nauVar3.a, nauVar3.b, nauVar3.d.a, view, lioVar3));
                    return;
                }
                if (z) {
                    Toast.makeText(view.getContext(), view.getContext().getString(com.google.android.videos.R.string.talkback_unavailable_icon), 0).show();
                    return;
                }
                lio lioVar4 = lifVar3;
                nau nauVar4 = nauVar;
                pjxVar.a(pjw.b(), view);
                kff.s(view, new nan(nauVar4.b.a, nauVar4.c, nauVar4.d.c, view, lioVar4));
            }
        });
    }

    public static naf J(kwz kwzVar, float f, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str3;
        ieg iegVar;
        ieg iegVar2;
        ieg iegVar3;
        ieg iegVar4;
        ieg iegVar5;
        ieg iegVar6;
        ieg iegVar7;
        Uri uri;
        nae naeVar = new nae();
        naeVar.a = "";
        naeVar.g(Uri.EMPTY);
        naeVar.f(1.0f);
        ieg iegVar8 = ieg.a;
        naeVar.n(iegVar8);
        naeVar.o(iegVar8);
        naeVar.a(iegVar8);
        naeVar.b(iegVar8);
        naeVar.p(iegVar8);
        naeVar.q(iegVar8);
        naeVar.m(iegVar8);
        naeVar.k();
        naeVar.d(false);
        naeVar.h(false);
        naeVar.i(false);
        naeVar.l(false);
        naeVar.c(false);
        naeVar.j(false);
        naeVar.e(false);
        naeVar.a = kwzVar.E();
        naeVar.g(((kvy) kwzVar).g());
        naeVar.f(f);
        naeVar.k();
        naeVar.c(z4);
        if (!sij.F(str)) {
            naeVar.n(ieg.f(str));
            naeVar.o(ieg.f(str2));
        }
        kwf kwfVar = (kwf) kwzVar;
        if (!sij.F(kwfVar.z())) {
            naeVar.a(ieg.f(kwfVar.z()));
        }
        if (!sij.F(kwfVar.D())) {
            naeVar.b(ieg.f(kwfVar.D()));
        }
        kxa kxaVar = (kxa) kwzVar;
        if (kxaVar.X()) {
            naeVar.p(ieg.f(Float.valueOf(kxaVar.a())));
            naeVar.q(ieg.f(kxaVar.p()));
        }
        kws kwsVar = (kws) kwzVar;
        if (kwsVar.W()) {
            naeVar.m(ieg.f(Float.valueOf(kwsVar.b())));
        }
        if (kwzVar instanceof kvj) {
            naeVar.d(true);
        }
        naeVar.h(z);
        naeVar.i(z2);
        naeVar.l(z3);
        naeVar.j(z5);
        naeVar.e(z6);
        if (naeVar.r == 511 && (str3 = naeVar.a) != null && (iegVar = naeVar.b) != null && (iegVar2 = naeVar.c) != null && (iegVar3 = naeVar.d) != null && (iegVar4 = naeVar.e) != null && (iegVar5 = naeVar.f) != null && (iegVar6 = naeVar.g) != null && (iegVar7 = naeVar.h) != null && (uri = naeVar.i) != null) {
            return new naf(str3, iegVar, iegVar2, iegVar3, iegVar4, iegVar5, iegVar6, iegVar7, uri, naeVar.j, naeVar.k, naeVar.l, naeVar.m, naeVar.n, naeVar.o, naeVar.p, naeVar.q);
        }
        StringBuilder sb = new StringBuilder();
        if (naeVar.a == null) {
            sb.append(" title");
        }
        if (naeVar.b == null) {
            sb.append(" subtitle");
        }
        if (naeVar.c == null) {
            sb.append(" subtitleContentDescription");
        }
        if (naeVar.d == null) {
            sb.append(" contentRating");
        }
        if (naeVar.e == null) {
            sb.append(" contentRatingId");
        }
        if (naeVar.f == null) {
            sb.append(" tomatoRating");
        }
        if (naeVar.g == null) {
            sb.append(" tomatometerRating");
        }
        if (naeVar.h == null) {
            sb.append(" starRating");
        }
        if ((1 & naeVar.r) == 0) {
            sb.append(" showDownloadIcon");
        }
        if (naeVar.i == null) {
            sb.append(" posterUrl");
        }
        if ((naeVar.r & 2) == 0) {
            sb.append(" posterAspectRatio");
        }
        if ((naeVar.r & 4) == 0) {
            sb.append(" isBundle");
        }
        if ((naeVar.r & 8) == 0) {
            sb.append(" show4KBadge");
        }
        if ((naeVar.r & 16) == 0) {
            sb.append(" showBrazilRating");
        }
        if ((naeVar.r & 32) == 0) {
            sb.append(" showSouthAfricaRating");
        }
        if ((naeVar.r & 64) == 0) {
            sb.append(" hasAudioDescriptions");
        }
        if ((naeVar.r & 128) == 0) {
            sb.append(" showDebugInfo");
        }
        if ((naeVar.r & 256) == 0) {
            sb.append(" isPelogEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static final void K(Map map, Resources resources) {
        map.put(Integer.valueOf(com.google.android.videos.R.layout.details_titlesection), new tid(resources.getInteger(com.google.android.videos.R.integer.details_title_row_span_with_userfeedback_text), resources.getInteger(com.google.android.videos.R.integer.details_section_row_span_default)));
    }

    public static iea L(iea ieaVar, iea ieaVar2, idf idfVar) {
        mzu mzuVar = new mzu(idfVar, ieaVar, 0);
        ids[] idsVarArr = {ieaVar, ieaVar2};
        krz krzVar = new krz(null);
        krzVar.a = idsVarArr;
        krzVar.d(mzuVar);
        return krzVar.a();
    }

    public static final void M(Map map, Resources resources) {
        map.put(Integer.valueOf(com.google.android.videos.R.layout.details_synopsis_section), new tid(resources.getInteger(com.google.android.videos.R.integer.details_grid_column_span_half_screen_on_large_device_with_userfeedback_text), resources.getInteger(com.google.android.videos.R.integer.details_synopsis_row_span)));
    }

    public static final void N(Map map, Resources resources) {
        map.put(Integer.valueOf(com.google.android.videos.R.layout.details_seasonpicker), new tid(resources.getInteger(com.google.android.videos.R.integer.details_grid_column_span_half_screen_on_large_device), resources.getInteger(com.google.android.videos.R.integer.details_section_row_span_default)));
    }

    public static ifc O(lio lioVar, pkg pkgVar) {
        iff iffVar = new iff();
        iffVar.f(com.google.android.videos.R.layout.details_moreinfo);
        iffVar.c = new mxj(lioVar, pkgVar, 2);
        iffVar.g(ksd.a());
        iffVar.d();
        return iffVar.c();
    }

    public static List P(Resources resources, boolean z, Collection collection, Iterable iterable, boolean z2, ktz ktzVar, boolean z3, ieg iegVar, boolean z4, ieg iegVar2, ieg iegVar3, boolean z5, ieg iegVar4, boolean z6, boolean z7, boolean z8, boolean z9, ieg iegVar5, ieg iegVar6, ieg iegVar7) throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kte kteVar = (kte) it.next();
            String str = kteVar.a;
            lga lgaVar = (lga) map.get(str);
            if (lgaVar == null) {
                lgaVar = new lga(str);
                map.put(str, lgaVar);
            }
            if (kteVar.b) {
                lgaVar.a = true;
            }
            if (kteVar.d == kzq.PRIMARY_DESCRIPTIVE) {
                lgaVar.b = true;
            }
        }
        ldo ldoVarD = kdw.D(resources);
        for (lga lgaVar2 : map.values()) {
            String str2 = (String) lgaVar2.c;
            Locale localeForLanguageTag = Locale.forLanguageTag(str2);
            boolean z10 = lgaVar2.a;
            boolean z11 = lgaVar2.b;
            ArrayList arrayList2 = new ArrayList();
            if (z10) {
                arrayList2.add(resources.getString(com.google.android.videos.R.string.details_audio_51));
            }
            if (z11) {
                arrayList2.add(resources.getString(com.google.android.videos.R.string.details_audio_description));
            }
            String displayName = Locale.forLanguageTag(str2).getDisplayName();
            if (!arrayList2.isEmpty()) {
                displayName = resources.getString(com.google.android.videos.R.string.audio_language, displayName, jwq.E(resources, com.google.android.videos.R.string.comma_item_joiner, arrayList2));
            }
            ldoVarD.b(displayName, localeForLanguageTag);
        }
        String strF = jwq.F(resources, false, ldoVarD.a());
        if (!TextUtils.isEmpty(strF)) {
            arrayList.add(R(hjs.e(resources.getString(com.google.android.videos.R.string.details_audio_languages), "number", Integer.valueOf(collection.size())), strF));
        }
        ArrayMap arrayMap = new ArrayMap();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            kua kuaVar = (kua) it2.next();
            String displayName2 = Locale.forLanguageTag(kuaVar.a).getDisplayName();
            kua kuaVar2 = (kua) arrayMap.get(displayName2);
            if (kuaVar.b == 3 || kuaVar2 == null || kuaVar2.b != 3) {
                arrayMap.put(displayName2, kuaVar);
            }
        }
        ldo ldoVarD2 = kdw.D(resources);
        for (kua kuaVar3 : arrayMap.values()) {
            Locale localeForLanguageTag2 = Locale.forLanguageTag(kuaVar3.a);
            String displayName3 = localeForLanguageTag2.getDisplayName();
            if (kuaVar3.b == 3) {
                displayName3 = resources.getString(com.google.android.videos.R.string.caption_language, displayName3);
            }
            ldoVarD2.b(displayName3, localeForLanguageTag2);
        }
        String strF2 = jwq.F(resources, false, ldoVarD2.a());
        if (!TextUtils.isEmpty(strF2)) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.subtitles_v2), strF2));
        }
        if (iegVar6.m()) {
            if (mnu.p(((kwf) iegVar6.g()).D())) {
                kwf kwfVar = (kwf) iegVar6.g();
                String string = resources.getString(((Integer) mnu.l(kwfVar.D()).g()).intValue());
                arrayList.add(S(resources.getString(com.google.android.videos.R.string.content_rating), kwfVar.D(), kwfVar.z() + " " + string));
            } else if (mnu.q(((kwf) iegVar6.g()).D())) {
                kwf kwfVar2 = (kwf) iegVar6.g();
                String string2 = resources.getString(((Integer) mnu.n(kwfVar2.D()).g()).intValue());
                arrayList.add(S(resources.getString(com.google.android.videos.R.string.content_rating), kwfVar2.D(), kwfVar2.z() + " " + string2));
            }
        }
        if (z2 && z) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.info_cards), resources.getString(com.google.android.videos.R.string.enabled)));
        }
        ieg iegVar8 = ktzVar.c;
        String string3 = "";
        if (iegVar8.m()) {
            kvo kvoVar = (kvo) iegVar8.g();
            ieg iegVar9 = kvoVar.b;
            if (iegVar9.m()) {
                int iOrdinal = ((xaw) iegVar9.g()).ordinal();
                if (iOrdinal == 0) {
                    int i = kvoVar.c;
                    int iB = ksi.b(i);
                    string3 = iB > 0 ? resources.getString(com.google.android.videos.R.string.rental_expire_policy_single_timer_days_description_no_title, Integer.valueOf(iB)) : resources.getString(com.google.android.videos.R.string.rental_expire_policy_single_timer_hours_description_no_title, Integer.valueOf(ksi.c(i)));
                } else if (iOrdinal == 1) {
                    int i2 = kvoVar.d;
                    string3 = ksi.b(i2) > 0 ? resources.getString(com.google.android.videos.R.string.rental_expire_policy_dual_timers_description_finish_days_no_title, Integer.valueOf(ksi.b(kvoVar.c)), Integer.valueOf(ksi.b(i2))) : resources.getString(com.google.android.videos.R.string.rental_expire_policy_dual_timers_description_finish_hours_no_title, Integer.valueOf(ksi.b(kvoVar.c)), Integer.valueOf(ksi.c(i2)));
                } else if (iOrdinal == 2) {
                    string3 = resources.getString(com.google.android.videos.R.string.rental_expire_fixed_timer_description_no_title, DateFormat.getDateTimeInstance().format(new Date(kvoVar.e)));
                }
            }
        }
        if (!z3 && !TextUtils.isEmpty(string3)) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_rental_expiration), string3));
        }
        if (iegVar.m()) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.section_family_library), (CharSequence) iegVar.g()));
        }
        if (z4) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_4k), resources.getString(com.google.android.videos.R.string.details_available)));
        }
        if (z6) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_hdr), resources.getString(com.google.android.videos.R.string.details_available)));
        }
        if (z8) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_dolby_vision), resources.getString(com.google.android.videos.R.string.details_available)));
        }
        if (z9) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_hdr10_plus), resources.getString(com.google.android.videos.R.string.details_available)));
        }
        if (z7 && iegVar5.m()) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_movies_anywhere_eligible), ksk.b(resources.getString(com.google.android.videos.R.string.details_movies_anywhere_eligible_message, iegVar5.g()))));
        }
        if (iegVar2.m()) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_where_to_play), ksk.b(resources.getString(com.google.android.videos.R.string.details_where_to_play_message, iegVar2.g()))));
        }
        if (iegVar7.m()) {
            String string4 = resources.getString(com.google.android.videos.R.string.details_tomatometer);
            nag nagVarA = myw.a();
            nagVarA.e(string4);
            nagVarA.f(iegVar7);
            arrayList.add(nagVarA.c());
        }
        if (iegVar3.m()) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_seller), (CharSequence) iegVar3.g()));
        }
        if (z5) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_vat_heading), resources.getString(com.google.android.videos.R.string.details_vat_description_included)));
        }
        if (iegVar4.m()) {
            arrayList.add(R(resources.getString(com.google.android.videos.R.string.details_refund_policy), ksk.b(resources.getString(com.google.android.videos.R.string.details_refund_policy_message, iegVar4.g()))));
        }
        return arrayList;
    }

    public static ieg Q(sei seiVar, boolean z, Resources resources) {
        if (seiVar.c()) {
            return ieg.f(resources.getString(z ? seiVar.b() ? com.google.android.videos.R.string.family_library_content_eligible : com.google.android.videos.R.string.family_library_content_not_eligible : com.google.android.videos.R.string.family_library_content_eligible_if_purchased));
        }
        return ieg.a;
    }

    private static myw R(String str, CharSequence charSequence) {
        nag nagVarA = myw.a();
        nagVarA.e(str);
        nagVarA.d(charSequence);
        return nagVarA.c();
    }

    private static myw S(String str, String str2, String str3) {
        nag nagVarA = myw.a();
        nagVarA.e(str);
        nagVarA.d(str3);
        nagVarA.a = str2;
        return nagVarA.c();
    }

    public static final void a(bcb bcbVar, Integer num) {
        bcbVar.b(num);
    }

    public static final void b(bkp bkpVar, String str, String str2, int i, boolean z, bao baoVar, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int i3;
        long jK;
        long jK2;
        long jK3;
        bao baoVar2;
        boolean z2 = z;
        bkpVar.getClass();
        str.getClass();
        str2.getClass();
        int i4 = i2 & 6;
        bao baoVarD = baoVar.d(-1962158167);
        if (i4 == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.F(str2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.D(i) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.G(z2) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            float fG = kv.G(0.74f, 0.6f, baoVarD);
            bvt bvtVarA = zf.a(xk.a, bkb.n, baoVarD, 48);
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
            bkm bkmVar = bkp.g;
            bkp bkpVarV = wv.v(bkmVar, 0.0f, 0.0f, ccf.x(com.google.android.videos.R.dimen.icon_padding_end, baoVarD), 0.0f, 11);
            bqh bqhVarY = ccf.y(i, baoVarD, (i3 >> 9) & 14);
            int i5 = i3;
            baoVarD.x(-2123519679);
            if (z) {
                jK = bnq.g;
            } else {
                long j = wv.K(baoVarD).s;
                jK = bny.k(bnq.d(j), bnq.c(j), bnq.b(j), fG, bnq.f(j));
            }
            basVar.aa();
            asg.a(bqhVarY, null, bkpVarV, jK, baoVarD, 48, 0);
            bvt bvtVarA2 = xu.a(xk.c, bkb.j, baoVarD, 0);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkmVar);
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
            chc chcVar = wv.N(baoVarD).m;
            baoVarD.x(954628415);
            if (z) {
                jK2 = bnq.g;
            } else {
                long j2 = wv.K(baoVarD).s;
                jK2 = bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), fG, bnq.f(j2));
            }
            basVar.aa();
            z2 = false;
            axa.b(str, null, jK2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, chcVar, baoVarD, (i5 >> 3) & 14, 0, 131066);
            chc chcVar2 = wv.N(baoVarD).k;
            if (z) {
                baoVarD.x(-471009841);
                jK3 = wv.K(baoVarD).s;
                basVar.aa();
                z2 = true;
            } else {
                baoVarD.x(-470936061);
                long j3 = wv.K(baoVarD).s;
                jK3 = bny.k(bnq.d(j3), bnq.c(j3), bnq.b(j3), fG, bnq.f(j3));
                basVar.aa();
            }
            baoVar2 = baoVarD;
            axa.b(str2, null, jK3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, chcVar2, baoVar2, (i5 >> 6) & 14, 0, 131066);
            baoVar2.o();
            baoVar2.o();
        }
        boolean z3 = z2;
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jyi(bkpVar, str, str2, i, z3, i2, 0);
        }
    }

    public static final void c(yjk yjkVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1117581199);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 14;
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(5004770);
            int i5 = i2 & 14;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i5 == 4 || objT == ban.a) {
                objT = new jwz(yjkVar, 12);
                basVar.ae(objT);
            }
            basVar.aa();
            cqv.y((yjk) objT, null, bga.k(-1103477560, new awh(yjkVar, context, 15, null), baoVarD), baoVarD, 384, 2);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(yjkVar, i, i4);
        }
    }

    public static final void d(yjk yjkVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1317924426);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 13;
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(-489972807);
            cfw cfwVar = new cfw((byte[]) null);
            String strW = ccf.w(com.google.android.videos.R.string.parental_controls_dialog_description_part_1, baoVarD);
            cfwVar.c(strW);
            che cheVar = new che();
            StringBuilder sb = cfwVar.a;
            cfv cfvVar = new cfv(cheVar, sb.length(), 0, null, 12);
            List list = cfwVar.b;
            list.add(cfvVar);
            List list2 = cfwVar.c;
            list2.add(cfvVar);
            int size = list.size() - 1;
            try {
                list2.add(new cfv(new cgs(0L, (cji) null, (cje) null, (cjf) null, (ciy) null, 0L, (cld) null, 0L, cll.b, 61439), strW.length(), strW.length() + 15, null, 8));
                cfv cfvVar2 = new cfv(new cgu(), sb.length(), 0, "g.co/yourfamily", 4);
                list.add(cfvVar2);
                list2.add(cfvVar2);
                list.size();
                cfwVar.c("g.co/yourfamily");
                cfwVar.e(size);
                cfwVar.c(ccf.w(com.google.android.videos.R.string.parental_controls_dialog_description_part_2, baoVarD));
                cfy cfyVarA = cfwVar.a();
                bas basVar = (bas) baoVarD;
                basVar.aa();
                baoVarD.x(5004770);
                int i5 = i2 & 14;
                Object objT = basVar.T();
                if (i5 == 4 || objT == ban.a) {
                    objT = new jwz(yjkVar, i4);
                    basVar.ae(objT);
                }
                basVar.aa();
                cqv.y((yjk) objT, null, bga.k(572638867, new ano(cfyVarA, context, yjkVar, 13), baoVarD), baoVarD, 384, 2);
            } catch (Throwable th) {
                cfwVar.e(size);
                throw th;
            }
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(yjkVar, i, i4);
        }
    }

    public static final void e(String str, fwv fwvVar, bao baoVar, int i) {
        int i2;
        str.getClass();
        fwvVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(269182704);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.F(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(fwvVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            bhq bhqVarK = bga.k(823727276, new azg(str, 10), baoVarD);
            bhq bhqVarK2 = bga.k(-1250505878, new awh(fwvVar, context, 14, null), baoVarD);
            arl arlVarK = wv.K(baoVarD);
            long j = arlVarK.b;
            long j2 = arlVarK.d;
            long j3 = arlVarK.a;
            aqw.b(bhqVarK, null, bhqVarK2, null, 0.0f, null, new axd(j, j2, j3, j3, j3, j3), baoVarD, 390);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(str, fwvVar, i, 17, null);
        }
    }

    public static final Boolean f(bcb bcbVar) {
        return (Boolean) bcbVar.a();
    }

    public static final yqe g(bcb bcbVar) {
        return (yqe) bcbVar.a();
    }

    public static final void h(bcb bcbVar, Boolean bool) {
        bcbVar.b(bool);
    }

    public static final void i(ovq ovqVar) {
        if (ovqVar.b) {
            ovqVar.d();
        }
    }

    public static final void j(ovq ovqVar, final kca kcaVar, final yjk yjkVar, bkp bkpVar, long j, boolean z, final yjv yjvVar, bao baoVar, final int i) {
        int i2;
        yjv yjvVar2;
        yow yowVar;
        Object kcdVar;
        bas basVar;
        bcb bcbVar;
        yow yowVar2;
        Object obj;
        bcb bcbVar2;
        final long j2;
        final bkp bkpVar2;
        final boolean z2;
        final ovq ovqVar2 = ovqVar;
        yjvVar.getClass();
        bao baoVarD = baoVar.d(-208486718);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(ovqVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(kcaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        int i3 = i2 | 224256;
        if ((1572864 & i) == 0) {
            yjvVar2 = yjvVar;
            i3 |= true != baoVarD.H(yjvVar2) ? 524288 : 1048576;
        } else {
            yjvVar2 = yjvVar;
        }
        int i4 = i3;
        if ((599187 & i4) == 599186 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            j2 = j;
            z2 = z;
        } else {
            bkm bkmVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                objT = new cvm(context).n();
                basVar2.ae(objT);
            }
            ExoPlayer exoPlayer = (ExoPlayer) objT;
            basVar2.aa();
            baoVarD.x(1849434622);
            Object objT2 = basVar2.T();
            if (objT2 == obj2) {
                objT2 = new TextureView(context);
                basVar2.ae(objT2);
            }
            TextureView textureView = (TextureView) objT2;
            basVar2.aa();
            baoVarD.x(1849434622);
            Object objT3 = basVar2.T();
            if (objT3 == obj2) {
                bci bciVar = new bci(null, bcz.c);
                basVar2.ae(bciVar);
                objT3 = bciVar;
            }
            bcb bcbVar3 = (bcb) objT3;
            basVar2.aa();
            Object objT4 = basVar2.T();
            if (objT4 == obj2) {
                objT4 = bbn.a(yim.a, baoVarD);
                basVar2.ae(objT4);
            }
            yow yowVar3 = (yow) objT4;
            baoVarD.x(1849434622);
            Object objT5 = basVar2.T();
            if (objT5 == obj2) {
                yowVar = yowVar3;
                bci bciVar2 = new bci(null, bcz.c);
                basVar2.ae(bciVar2);
                objT5 = bciVar2;
            } else {
                yowVar = yowVar3;
            }
            bcb bcbVar4 = (bcb) objT5;
            basVar2.aa();
            bkp bkpVarA = bkmVar.a(zi.c);
            baoVarD.x(-1633490746);
            boolean zH = baoVarD.H(exoPlayer) | baoVarD.H(textureView);
            Object objT6 = basVar2.T();
            if (zH || objT6 == obj2) {
                objT6 = new jzu(exoPlayer, textureView, 3);
                basVar2.ae(objT6);
            }
            basVar2.aa();
            cna.a((yjv) objT6, bkpVarA, null, baoVarD, 0);
            baoVarD.x(-1633490746);
            boolean zH2 = baoVarD.H(textureView) | baoVarD.H(exoPlayer);
            Object objT7 = basVar2.T();
            if (zH2 || objT7 == obj2) {
                objT7 = new jzu(exoPlayer, textureView, 4);
                basVar2.ae(objT7);
            }
            basVar2.aa();
            bbn.b(exoPlayer, textureView, (yjv) objT7, baoVarD);
            ygi ygiVar = ygi.a;
            baoVarD.x(-1224400529);
            boolean zH3 = baoVarD.H(ovqVar2) | baoVarD.H(context) | baoVarD.H(exoPlayer) | baoVarD.H(kcaVar);
            boolean z3 = (i4 & 458752) == 131072;
            Object objT8 = basVar2.T();
            if ((z3 || zH3) || objT8 == obj2) {
                basVar = basVar2;
                bcbVar = bcbVar3;
                yowVar2 = yowVar;
                obj = obj2;
                kcdVar = new kcd(ovqVar2, context, exoPlayer, kcaVar, bcbVar, (yih) null, 0);
                basVar.ae(kcdVar);
            } else {
                basVar = basVar2;
                bcbVar = bcbVar3;
                yowVar2 = yowVar;
                kcdVar = objT8;
                obj = obj2;
            }
            basVar.aa();
            bbn.f(ygiVar, (yjz) kcdVar, baoVarD);
            Boolean boolF = f(bcbVar);
            baoVarD.x(-1224400529);
            yow yowVar4 = yowVar2;
            boolean zH4 = ((3670016 & i4) == 1048576) | baoVarD.H(yowVar4) | ((57344 & i4) == 16384) | baoVarD.H(ovqVar2);
            boolean z4 = (i4 & 896) == 256;
            Object objT9 = basVar.T();
            if ((zH4 || z4) || objT9 == obj) {
                bcbVar2 = bcbVar4;
                kce kceVar = new kce(bcbVar, yjvVar2, yowVar4, ovqVar2, yjkVar, bcbVar2, null);
                ovqVar2 = ovqVar2;
                basVar.ae(kceVar);
                objT9 = kceVar;
            } else {
                bcbVar2 = bcbVar4;
            }
            basVar.aa();
            bbn.f(boolF, (yjz) objT9, baoVarD);
            Object objF = baoVarD.f(dxf.a);
            baoVarD.x(-1633490746);
            boolean zH5 = baoVarD.H(ovqVar2);
            Object objT10 = basVar.T();
            if (zH5 || objT10 == obj) {
                objT10 = new jzu(ovqVar2, bcbVar2, 5);
                basVar.ae(objT10);
            }
            basVar.aa();
            bbn.c(objF, (yjv) objT10, baoVarD);
            j2 = 10000;
            bkpVar2 = bkmVar;
            z2 = true;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kcb
                @Override // defpackage.yjz
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    ovq ovqVar3 = ovqVar2;
                    kca kcaVar2 = kcaVar;
                    yjk yjkVar2 = yjkVar;
                    bkp bkpVar3 = bkpVar2;
                    long j3 = j2;
                    boolean z5 = z2;
                    jxl.j(ovqVar3, kcaVar2, yjkVar2, bkpVar3, j3, z5, yjvVar, (bao) obj3, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void k(final kbv kbvVar, final boolean z, bkp bkpVar, final boolean z2, bao baoVar, final int i) {
        int i2;
        final bkp bkpVar2;
        xx xxVar;
        bas basVar;
        wls wlsVarT;
        bao baoVarD = baoVar.d(-938756306);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(kbvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i3 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            bkp bkpVarA = zi.a(bkpVar2, 1.0f);
            bkd bkdVar = bkb.a;
            bvt bvtVarA = xo.a(bkdVar, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar2 = (bas) baoVarD;
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            int i4 = i3;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            bkp bkpVarA2 = zi.a(bkpVar2, 1.0f);
            bvt bvtVarA2 = xu.a(xk.c, bkb.j, baoVarD, 0);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar2.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA2);
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar2.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            xx xxVar2 = xx.a;
            baoVarD.x(66232527);
            wls wlsVar = kbvVar.a;
            String str = wlsVar.b;
            str.getClass();
            if (str.length() <= 0 && !z) {
                xxVar = xxVar2;
            } else {
                long j = kbvVar.c;
                yy yyVar = kbw.a;
                bkp bkpVarO = wv.o(hq.f(bkpVar2, j, kbw.h), kbw.a);
                bvt bvtVarA3 = xo.a(bkdVar, false);
                int iK3 = a.k(zy.p(baoVarD));
                bhu bhuVarAi3 = basVar2.ai();
                bkp bkpVarC3 = bdi.C(baoVarD, bkpVarO);
                baoVarD.z();
                xxVar = xxVar2;
                if (basVar2.w) {
                    baoVarD.k(yjkVar);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA3, yjzVar);
                beb.a(baoVarD, bhuVarAi3, yjzVar2);
                if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK3))) {
                    Integer numValueOf3 = Integer.valueOf(iK3);
                    basVar2.ae(numValueOf3);
                    baoVarD.i(numValueOf3, yjzVar3);
                }
                beb.a(baoVarD, bkpVarC3, yjzVar4);
                if (z) {
                    String string = context.getString(com.google.android.videos.R.string.in_library);
                    string.getClass();
                    String upperCase = string.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    wlsVarT = ihz.T(upperCase);
                } else {
                    wlsVarT = wlsVar;
                }
                B(wlsVarT, wv.N(baoVarD).B, kbvVar.b, null, kbw.b, baoVarD, 196608);
                baoVarD.o();
            }
            basVar2.aa();
            yy yyVar2 = kbw.a;
            zy.k(zi.b(bkpVar2, 16.0f), baoVarD);
            baoVarD.x(66262690);
            String str2 = kbvVar.d;
            if (str2.length() > 0) {
                basVar = basVar2;
                axa.b(str2, null, kbvVar.e, 0L, null, 0L, null, 0L, 2, false, kbw.c, 0, null, wv.N(baoVarD).c, baoVarD, 0, 384, 110586);
                baoVarD = baoVarD;
            } else {
                basVar = basVar2;
            }
            basVar.aa();
            zy.k(zi.b(bkpVar2, 16.0f), baoVarD);
            baoVarD.x(66276704);
            wls wlsVar2 = kbvVar.f;
            String str3 = wlsVar2.b;
            str3.getClass();
            if (str3.length() > 0) {
                B(wlsVar2, wv.N(baoVarD).m, kbvVar.g, null, kbw.d, baoVarD, 196608);
            }
            basVar.aa();
            bao baoVar2 = baoVarD;
            kv.i(xxVar, z2, null, kbw.f, kbw.g, null, bga.k(2740226, new ro(kbvVar, 17), baoVarD), baoVar2, ((i4 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 1572870);
            baoVarD = baoVar2;
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kbx
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kbv kbvVar2 = kbvVar;
                    boolean z3 = z;
                    bkp bkpVar3 = bkpVar2;
                    jxl.k(kbvVar2, z3, bkpVar3, z2, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(wug wugVar, irc ircVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        char c;
        Object nzVar;
        yjz yjzVar;
        int i3;
        boolean z;
        yjk yjkVar;
        int i4;
        bas basVar;
        Object obj;
        yjz yjzVar2;
        bao baoVar3;
        wug wugVar2 = wugVar;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(341160876);
        if (i5 == 0) {
            i2 = (true != baoVarD.F(wugVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(ircVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                bci bciVar = new bci(null, bcz.c);
                basVar2.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar2.aa();
            long j = jxi.a;
            bvt bvtVarA = xu.a(xk.e(20.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            yjz yjzVar3 = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar3);
            yjz yjzVar4 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar4);
            yjz yjzVar5 = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar5);
            }
            yjz yjzVar6 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar6);
            baoVarD.x(-2047082959);
            int size = wugVar2.b.size();
            int i6 = 0;
            while (i6 < size) {
                wuf wufVar = (wuf) wugVar2.b.get(i6);
                bkm bkmVar = bkp.g;
                int i7 = size;
                bvt bvtVarA2 = xo.a(bkb.a, false);
                int iK2 = a.k(zy.p(baoVarD));
                bhu bhuVarAi2 = basVar2.ai();
                bkp bkpVarC2 = bdi.C(baoVarD, bkmVar);
                baoVarD.z();
                if (basVar2.w) {
                    baoVarD.k(yjkVar2);
                } else {
                    baoVarD.B();
                }
                beb.a(baoVarD, bvtVarA2, yjzVar3);
                beb.a(baoVarD, bhuVarAi2, yjzVar4);
                if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK2))) {
                    Integer numValueOf2 = Integer.valueOf(iK2);
                    basVar2.ae(numValueOf2);
                    baoVarD.i(numValueOf2, yjzVar5);
                }
                beb.a(baoVarD, bkpVarC2, yjzVar6);
                xs xsVar = xs.a;
                wufVar.getClass();
                baoVarD.x(1442915292);
                wls wlsVar = wufVar.c;
                if (wlsVar == null) {
                    wlsVar = wls.a;
                }
                String str = wlsVar.b;
                str.getClass();
                wls wlsVar2 = wufVar.d;
                if (wlsVar2 == null) {
                    wlsVar2 = wls.a;
                }
                String str2 = wlsVar2.b;
                str2.getClass();
                wls wlsVar3 = wufVar.e;
                if (wlsVar3 == null) {
                    wlsVar3 = wls.a;
                }
                String str3 = wlsVar3.b;
                yjz yjzVar7 = yjzVar6;
                wlx wlxVar = wufVar.g;
                if (wlxVar == null) {
                    wlxVar = wlx.a;
                }
                yjz yjzVar8 = yjzVar4;
                kpe kpeVar = new kpe(str, str2, str3, ((wlv) (wlxVar.b == 3 ? (wlw) wlxVar.c : wlw.a).b.get(0)).b, wv.K(baoVarD).q);
                basVar2.aa();
                baoVarD.x(-1633490746);
                boolean zD = baoVarD.D(i6);
                Object objT2 = basVar2.T();
                if (zD || objT2 == obj2) {
                    c = 2;
                    objT2 = new amt(i6, bcbVar, 2);
                    basVar2.ae(objT2);
                } else {
                    c = 2;
                }
                basVar2.aa();
                kph.c(kpeVar, (yjk) objT2, null, baoVarD, 0);
                baoVarD.x(-860992187);
                Integer num = (Integer) bcbVar.a();
                if (num != null && num.intValue() == i6) {
                    long j2 = jxi.a;
                    long j3 = jxi.b;
                    String string = context.getString(com.google.android.videos.R.string.top_story_tooltip_text);
                    string.getClass();
                    bkp bkpVarA = xsVar.a(bdi.x(bkmVar, 2.0f), bkb.c);
                    baoVarD.x(-1224400529);
                    boolean zF = baoVarD.F(wufVar) | baoVarD.H(ircVar) | baoVarD.H(context);
                    Object objT3 = basVar2.T();
                    if (zF || objT3 == obj2) {
                        yjzVar = yjzVar5;
                        i3 = i6;
                        z = false;
                        nzVar = new nz(wufVar, ircVar, context, bcbVar, 13);
                        basVar2.ae(nzVar);
                    } else {
                        i3 = i6;
                        nzVar = objT3;
                        z = false;
                        yjzVar = yjzVar5;
                    }
                    yjk yjkVar3 = (yjk) nzVar;
                    basVar2.aa();
                    yjkVar = yjkVar2;
                    i4 = i7;
                    basVar = basVar2;
                    obj = obj2;
                    yjzVar2 = yjzVar3;
                    baoVar3 = baoVarD;
                    kpn.a(yjkVar3, string, bkpVarA, j3, j2, null, baoVar3, 27648);
                } else {
                    i3 = i6;
                    baoVar3 = baoVarD;
                    basVar = basVar2;
                    obj = obj2;
                    yjzVar2 = yjzVar3;
                    yjkVar = yjkVar2;
                    i4 = i7;
                    yjzVar = yjzVar5;
                }
                basVar.aa();
                baoVar3.o();
                basVar2 = basVar;
                obj2 = obj;
                yjzVar3 = yjzVar2;
                yjkVar2 = yjkVar;
                size = i4;
                yjzVar5 = yjzVar;
                i6 = i3 + 1;
                baoVarD = baoVar3;
                yjzVar6 = yjzVar7;
                yjzVar4 = yjzVar8;
                wugVar2 = wugVar;
            }
            baoVar2 = baoVarD;
            basVar2.aa();
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv((vuc) wugVar, ircVar, bkpVar, i, 19);
        }
    }

    public static final void m(String str, long j, chc chcVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        chcVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1893902440);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(chcVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            axa.c(jyv.s(str, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.2f, bnq.f(j))), bkpVar, j, 0L, 0L, 0L, 0, false, 0, 0, null, null, chcVar, baoVar2, ((i2 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i2 << 3) & 896), (i2 << 18) & 234881024, 262136);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koq(str, j, chcVar, bkpVar, i, 1);
        }
    }

    public static final void n(final long j, final bkp bkpVar, boolean z, final float f, sj sjVar, final yjz yjzVar, bao baoVar, final int i) {
        long j2;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        bao baoVar2;
        sj sjVar2;
        bas basVar;
        final boolean z4;
        yjzVar.getClass();
        bao baoVarD = baoVar.d(1347133091);
        if ((i & 6) == 0) {
            j2 = j;
            i2 = (true != baoVarD.E(j2) ? 2 : 4) | i;
        } else {
            j2 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != baoVarD.C(f) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i4 |= true != baoVarD.G(true) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i4 |= true != baoVarD.F(sjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != baoVarD.H(yjzVar) ? 524288 : 1048576;
        }
        int i5 = i4;
        if ((i5 & 599187) == 599186 && baoVarD.K()) {
            baoVarD.t();
            z4 = z;
            sjVar2 = sjVar;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                z2 = true;
            } else {
                baoVarD.t();
                z2 = z;
            }
            baoVarD.m();
            float fCr = ((clx) baoVarD.f(ccq.d)).cr(f);
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj = ban.a;
            if (objT == obj) {
                i3 = 196608;
                bci bciVar = new bci(true, bcz.c);
                basVar2.ae(bciVar);
                objT = bciVar;
            } else {
                i3 = 196608;
            }
            bcb bcbVar = (bcb) objT;
            basVar2.aa();
            baoVarD.x(1849434622);
            Object objT2 = basVar2.T();
            if (objT2 == obj) {
                z3 = false;
                bci bciVar2 = new bci(false, bcz.c);
                basVar2.ae(bciVar2);
                objT2 = bciVar2;
            } else {
                z3 = false;
            }
            bcb bcbVar2 = (bcb) objT2;
            basVar2.aa();
            baoVarD.x(1849434622);
            Object objT3 = basVar2.T();
            if (objT3 == obj) {
                bci bciVar3 = new bci(Boolean.valueOf(z3), bcz.c);
                basVar2.ae(bciVar3);
                objT3 = bciVar3;
            }
            bcb bcbVar3 = (bcb) objT3;
            basVar2.aa();
            yld yldVar = new yld();
            boolean z5 = z2;
            wv.i(bkpVar.a(zi.c), null, false, bga.k(-2030873479, new kod(f, yldVar, j2, bcbVar2, bcbVar3, bcbVar, sjVar, z2, yjzVar), baoVarD), baoVarD, 3072, 6);
            baoVar2 = baoVarD;
            sjVar2 = sjVar;
            bbn.f(Integer.valueOf(sjVar.c()), new ixs(sjVar2, yldVar, bcbVar3, (yih) null, 15), baoVar2);
            baoVar2.x(-1224400529);
            boolean zC = (((((i5 & 458752) ^ i3) <= 131072 || !baoVar2.F(sjVar2)) && (i5 & i3) != 131072) ? z3 : true) | baoVar2.C(fCr);
            Object objT4 = basVar2.T();
            if (zC || objT4 == obj) {
                koe koeVar = new koe(sjVar2, fCr, bcbVar2, bcbVar, null);
                basVar = basVar2;
                basVar.ae(koeVar);
                objT4 = koeVar;
            } else {
                basVar = basVar2;
            }
            basVar.aa();
            bbn.f(sjVar2, (yjz) objT4, baoVar2);
            z4 = z5;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            final sj sjVar3 = sjVar2;
            bcrVarM.d = new yjz() { // from class: koc
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    long j3 = j;
                    bkp bkpVar2 = bkpVar;
                    boolean z6 = z4;
                    float f2 = f;
                    sj sjVar4 = sjVar3;
                    jxl.n(j3, bkpVar2, z6, f2, sjVar4, yjzVar, (bao) obj2, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final int o(bcb bcbVar) {
        return ((Number) bcbVar.a()).intValue();
    }

    public static final void p(yjk yjkVar, knv knvVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-331877856);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(knvVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(30, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            basVar.aa();
            ygi ygiVar = ygi.a;
            baoVarD.x(-1633490746);
            int i4 = i2 & 14;
            Object objT2 = basVar.T();
            if (i4 == 4 || objT2 == obj) {
                objT2 = new kbl(yjkVar, bcbVar, (yih) null, 11);
                basVar.ae(objT2);
            }
            basVar.aa();
            bbn.f(ygiVar, (yjz) objT2, baoVarD);
            baoVar2 = baoVarD;
            rdd.r(null, bga.k(-2019482701, new khi(knvVar, context, 7), baoVarD), null, wv.K(baoVarD).F, wv.K(baoVarD).q, 0L, 0L, bga.k(-640170053, new khi(context, bcbVar, 8, null), baoVarD), baoVar2, 805306416, 413);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(yjkVar, knvVar, i, 9);
        }
    }

    public static final void q(String str, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-122267980);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVar2 = baoVarD;
            rdd.r(null, null, null, wv.K(baoVarD).F, wv.K(baoVarD).q, 0L, 0L, bga.k(-921597831, new kie(str, 8), baoVarD), baoVar2, 805306368, 415);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kny(str, i, 0);
        }
    }

    public static final void r(yjk yjkVar, avq avqVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2128550588);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.H(yjkVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(avqVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            awc awcVar = avqVar.a;
            knx knxVar = awcVar instanceof knx ? (knx) awcVar : null;
            if (knxVar instanceof knu) {
                baoVarD.x(1132689929);
                String string = context.getString(com.google.android.videos.R.string.fmr_connecting_to_remote);
                string.getClass();
                q(string, baoVarD, 0);
                ((bas) baoVarD).aa();
            } else if (knxVar instanceof knv) {
                baoVarD.x(1132693432);
                p(yjkVar, (knv) knxVar, baoVarD, i2 & 14);
                ((bas) baoVarD).aa();
            } else if (knxVar instanceof knw) {
                baoVarD.x(1132696834);
                String string2 = context.getString(com.google.android.videos.R.string.fmr_sound_stopped);
                string2.getClass();
                q(string2, baoVarD, 0);
                ((bas) baoVarD).aa();
            } else {
                baoVarD.x(1132699442);
                rdd.s(avqVar, null, null, 0L, 0L, 0L, 0L, 0L, baoVarD, (i2 >> 3) & 14);
                ((bas) baoVarD).aa();
            }
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(yjkVar, avqVar, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(defpackage.yjk r19, defpackage.bkp r20, java.lang.String r21, defpackage.bao r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxl.s(yjk, bkp, java.lang.String, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(java.lang.String r28, defpackage.bkp r29, long r30, defpackage.bao r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxl.t(java.lang.String, bkp, long, bao, int, int):void");
    }

    public static final void u(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-147978856);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            jyv.q(bga.k(1067362674, new khi(bkpVar, yjzVar, 5, null), baoVarD), baoVarD, 6);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(bkpVar, (Object) yjzVar, i, 7);
        }
    }

    public static final void x(wls wlsVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(470282964);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(wlsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            u(bkpVar, bga.k(1232687292, new khi(wlsVar, yjkVar, 6, null), baoVarD), baoVarD, ((i3 >> 6) & 14) | 48);
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) wlsVar, (Object) yjkVar, bkpVar2, i, 14);
        }
    }

    public static final void y(wls wlsVar, wls wlsVar2, String str, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(726456407);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(wlsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(wlsVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            u(bkmVar, bga.k(1280837999, new awe(yjkVar, str, wlsVar, wlsVar2, 6), baoVarD), baoVarD, ((i3 >> 12) & 14) | 48);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(wlsVar, wlsVar2, str, yjkVar, bkpVar2, i, 10);
        }
    }

    public static final void z(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-2031643851);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            u(bkpVar, bga.k(-972309427, new kie(yjkVar, 7), baoVarD), baoVarD, ((i3 >> 3) & 14) | 48);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(yjkVar, bkpVar, i, 6);
        }
    }
}

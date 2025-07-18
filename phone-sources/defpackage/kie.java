package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kie implements yjz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kie(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Context context = null;
        switch (this.b) {
            case 0:
                bao baoVar = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                    baoVar.t();
                } else {
                    kfw.m((kiq) this.a, khp.a(baoVar), null, baoVar, 8, 4);
                }
                break;
            case 1:
                bao baoVar2 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar2.K()) {
                    baoVar2.t();
                } else {
                    kfw.s((kiq) this.a, true, null, baoVar2, 56);
                }
                break;
            case 2:
                bao baoVar3 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
                    baoVar3.t();
                } else {
                    String string = ((Context) this.a).getString(R.string.loading);
                    string.getClass();
                    czu.r(string, null, new due(new dul(bnq.c), new cmk(clw.w(4294967296L, 14.0f)), null, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor), 0, baoVar3, 0, 10);
                }
                break;
            case 3:
                bao baoVar4 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar4.K()) {
                    baoVar4.t();
                } else {
                    klm klmVar = (klm) this.a;
                    Context context2 = klmVar.f;
                    if (context2 == null) {
                        yks.c("context");
                    } else {
                        context = context2;
                    }
                    String string2 = context.getString(R.string.open_google_tv);
                    string2.getClass();
                    crn.w(string2, klmVar.f("openGoogleTvButton"), null, false, null, 0, baoVar4, 0);
                }
                break;
            case 4:
                bao baoVar5 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar5.K()) {
                    baoVar5.t();
                } else {
                    din dinVar = new din(R.drawable.ic_search_24dp);
                    Context context3 = ((klm) this.a).f;
                    if (context3 == null) {
                        yks.c("context");
                    } else {
                        context = context3;
                    }
                    cry.m(dinVar, context.getString(R.string.search_icon_content_description), cyg.m(), 0, baoVar5, 0, 24);
                }
                break;
            case 5:
                bao baoVar6 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar6.K()) {
                    baoVar6.t();
                } else {
                    din dinVar2 = new din(R.drawable.gtv_logo_text);
                    Context context4 = ((klm) this.a).f;
                    if (context4 == null) {
                        yks.c("context");
                    } else {
                        context = context4;
                    }
                    cry.m(dinVar2, context.getString(R.string.gtv_application_name), null, 0, baoVar6, 0, 28);
                }
                break;
            case 6:
                bao baoVar7 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar7.K()) {
                    baoVar7.t();
                } else {
                    din dinVar3 = new din(R.drawable.ic_remote);
                    Context context5 = ((klm) this.a).f;
                    if (context5 == null) {
                        yks.c("context");
                    } else {
                        context = context5;
                    }
                    cry.m(dinVar3, context.getString(R.string.companion_bar_remote_icon_content_description), cyg.m(), 0, baoVar7, 0, 24);
                }
                break;
            case 7:
                bao baoVar8 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar8.K()) {
                    baoVar8.t();
                } else {
                    String string3 = ((Context) baoVar8.f(AndroidCompositionLocals_androidKt.b)).getString(R.string.something_went_wrong_message);
                    string3.getClass();
                    jxl.t(string3, null, 0L, baoVar8, 0, 6);
                    jxl.s(this.a, null, null, baoVar8, 0, 6);
                }
                break;
            case 8:
                bao baoVar9 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar9.K()) {
                    baoVar9.t();
                } else {
                    rdd.p((String) this.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar9, 0, 0, 131070);
                }
                break;
            case 9:
                bao baoVar10 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar10.K()) {
                    baoVar10.t();
                } else {
                    kop kopVar = kop.a;
                    bkm bkmVar = bkp.g;
                    kopVar.b(ccf.d(bkmVar, "story_background_shape"), baoVar10, 54);
                    ?? r4 = this.a;
                    if (!r4.isEmpty()) {
                        kopVar.a((wlw) yfm.S(r4), ccf.d(bkmVar, "story_background_poster"), baoVar10, 432);
                    }
                }
                break;
            case 10:
                bao baoVar11 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar11.K()) {
                    baoVar11.t();
                } else {
                    kor korVar = kor.a;
                    korVar.b(null, baoVar11, 48);
                    ?? r3 = this.a;
                    if (!r3.isEmpty()) {
                        korVar.a((wlw) yfm.S(r3), null, baoVar11, 384);
                    }
                }
                break;
            case 11:
                bao baoVar12 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar12.K()) {
                    baoVar12.t();
                } else {
                    ?? r1 = this.a;
                    if (r1.isEmpty()) {
                        baoVar12.x(1145938710);
                        bkp bkpVarA = zi.a(bkp.g, 1.0f);
                        bvt bvtVarA = zf.a(xk.b, bkb.m, baoVar12, 6);
                        int iK = a.k(zy.p(baoVar12));
                        bhu bhuVarO = baoVar12.O();
                        bkp bkpVarC = bdi.C(baoVar12, bkpVarA);
                        yjk yjkVar = bxt.a;
                        baoVar12.c();
                        baoVar12.z();
                        if (baoVar12.J()) {
                            baoVar12.k(yjkVar);
                        } else {
                            baoVar12.B();
                        }
                        beb.a(baoVar12, bvtVarA, bxt.d);
                        beb.a(baoVar12, bhuVarO, bxt.c);
                        yjz yjzVar = bxt.e;
                        if (baoVar12.J() || !yks.e(baoVar12.g(), Integer.valueOf(iK))) {
                            Integer numValueOf = Integer.valueOf(iK);
                            baoVar12.A(numValueOf);
                            baoVar12.i(numValueOf, yjzVar);
                        }
                        beb.a(baoVar12, bkpVarC, bxt.b);
                        hv.g(ccf.y(R.drawable.background_shape_season_summary, baoVar12, 6), null, null, null, null, 0.0f, baoVar12, 48, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor);
                        baoVar12.o();
                        baoVar12.p();
                    } else {
                        baoVar12.x(1145659896);
                        knh.c((wlw) yfm.S(r1), bga.y(zi.a(bkp.g, 1.0f).a(new AspectRatioElement(0.6666667f)), 1.0f), null, baoVar12, 0, 12);
                        baoVar12.p();
                    }
                }
                break;
            case 12:
                bao baoVar13 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar13.K()) {
                    baoVar13.t();
                } else {
                    kos kosVar = kos.a;
                    bkm bkmVar2 = bkp.g;
                    kosVar.b(ccf.d(bkmVar2, "story_background_shape"), baoVar13, 54);
                    ?? r42 = this.a;
                    if (!r42.isEmpty()) {
                        kosVar.a((wlw) yfm.S(r42), ccf.d(bkmVar2, "story_background_poster"), baoVar13, 432);
                    }
                }
                break;
            case 13:
                bao baoVar14 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar14.K()) {
                    baoVar14.t();
                } else {
                    bqh bqhVarY = ccf.y(R.drawable.gs_close_vd_theme_24, baoVar14, 0);
                    String string4 = ((Context) this.a).getString(R.string.accessibility_close_button);
                    bkm bkmVar3 = bkp.g;
                    long j = kpb.a;
                    hv.g(bqhVarY, string4, zi.d(bkmVar3, kpb.e), null, null, 0.0f, baoVar14, 384, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                }
                break;
            case 14:
                bao baoVar15 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar15.K()) {
                    baoVar15.t();
                } else {
                    this.a.a(baoVar15, 0);
                }
                break;
            default:
                bao baoVar16 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar16.K()) {
                    baoVar16.t();
                } else {
                    ?? r2 = this.a;
                    if (r2 != 0) {
                        r2.a(baoVar16, 0);
                    }
                }
                break;
        }
        return ygi.a;
    }
}

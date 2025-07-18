package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.SizeElement;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khb implements yka {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public khb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, yjz] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = 4;
        Context context = null;
        int i2 = 1;
        int i3 = 0;
        switch (this.b) {
            case 0:
                bao baoVar = (bao) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ((zh) obj).getClass();
                if ((iIntValue & 17) == 16 && baoVar.K()) {
                    baoVar.t();
                } else {
                    rdd.z(ccf.y(R.drawable.gs_google_tv_remote_fill1_vd_theme_24, baoVar, 0), null, zi.d(bkp.g, 20.0f), 0L, baoVar, 432, 8);
                    float f = 8.0f;
                    zy.k(new SizeElement(f, 0.0f, f, 0.0f, 10), baoVar);
                    String string = ((Context) this.a).getString(R.string.virtual_remote_switch_to_navigation);
                    string.getClass();
                    rdd.p(string, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar).m, baoVar, 0, 0, 65534);
                }
                break;
            case 1:
                bao baoVar2 = (bao) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ((zh) obj).getClass();
                if ((iIntValue2 & 17) == 16 && baoVar2.K()) {
                    baoVar2.t();
                } else {
                    rdd.z(ccf.y(R.drawable.gs_keyboard_fill1_vd_theme_24, baoVar2, 0), null, zi.d(bkp.g, 20.0f), 0L, baoVar2, 432, 8);
                    float f2 = 8.0f;
                    zy.k(new SizeElement(f2, 0.0f, f2, 0.0f, 10), baoVar2);
                    String string2 = ((Context) this.a).getString(R.string.virtual_remote_switch_to_keyboard_layout);
                    string2.getClass();
                    rdd.p(string2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar2).m, baoVar2, 0, 0, 65534);
                }
                break;
            case 2:
                bao baoVar3 = (bao) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                ((zh) obj).getClass();
                if ((iIntValue3 & 17) == 16 && baoVar3.K()) {
                    baoVar3.t();
                } else {
                    String string3 = ((Context) this.a).getString(R.string.fmr_alert_dialog_positive);
                    string3.getClass();
                    rdd.p(string3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar3, 0, 0, 131070);
                }
                break;
            case 3:
                bao baoVar4 = (bao) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                ((zh) obj).getClass();
                if ((iIntValue4 & 17) == 16 && baoVar4.K()) {
                    baoVar4.t();
                } else {
                    String string4 = ((Context) this.a).getString(R.string.fmr_alert_dialog_negative);
                    string4.getClass();
                    rdd.p(string4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar4, 0, 0, 131070);
                }
                break;
            case 4:
                bao baoVar5 = (bao) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                ((xx) obj).getClass();
                if ((iIntValue5 & 17) == 16 && baoVar5.K()) {
                    baoVar5.t();
                } else {
                    this.a.a(baoVar5, 0);
                }
                break;
            case 5:
                bao baoVar6 = (bao) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                ((avn) obj).getClass();
                if ((iIntValue6 & 17) == 16 && baoVar6.K()) {
                    baoVar6.t();
                } else {
                    float f3 = 4.0f;
                    pov.a.b((kw) this.a, zi.b(new SizeElement(f3, 0.0f, f3, 0.0f, 10), 20.0f), kdw.l(baoVar6), 0L, baoVar6, 199686);
                }
                break;
            case 6:
                xr xrVar = (xr) obj;
                bao baoVar7 = (bao) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                xrVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true != baoVar7.F(xrVar) ? 2 : 4;
                }
                if ((iIntValue7 & 19) == 18 && baoVar7.K()) {
                    baoVar7.t();
                } else {
                    bkp bkpVarB = xrVar.b(bkp.g);
                    Object obj4 = this.a;
                    bvt bvtVarA = xo.a(bkb.a, false);
                    int iK = a.k(zy.p(baoVar7));
                    bhu bhuVarO = baoVar7.O();
                    bkp bkpVarC = bdi.C(baoVar7, bkpVarB);
                    yjk yjkVar = bxt.a;
                    baoVar7.c();
                    baoVar7.z();
                    if (baoVar7.J()) {
                        baoVar7.k(yjkVar);
                    } else {
                        baoVar7.B();
                    }
                    beb.a(baoVar7, bvtVarA, bxt.d);
                    beb.a(baoVar7, bhuVarO, bxt.c);
                    yjz yjzVar = bxt.e;
                    if (baoVar7.J() || !yks.e(baoVar7.g(), Integer.valueOf(iK))) {
                        Integer numValueOf = Integer.valueOf(iK);
                        baoVar7.A(numValueOf);
                        baoVar7.i(numValueOf, yjzVar);
                    }
                    beb.a(baoVar7, bkpVarC, bxt.b);
                    xs xsVar = xs.a;
                    khh khhVar = khh.a;
                    baoVar7.x(5004770);
                    boolean zH = baoVar7.H(obj4);
                    Object objG = baoVar7.g();
                    if (zH || objG == ban.a) {
                        objG = new kic(obj4, i2);
                        baoVar7.A(objG);
                    }
                    baoVar7.p();
                    khhVar.d(xsVar, (yjk) objG, null, baoVar7, 6, 2);
                    baoVar7.x(5004770);
                    boolean zH2 = baoVar7.H(obj4);
                    Object objG2 = baoVar7.g();
                    if (zH2 || objG2 == ban.a) {
                        objG2 = new kic(obj4, i3);
                        baoVar7.A(objG2);
                    }
                    baoVar7.p();
                    khhVar.a(xsVar, (yjk) objG2, null, baoVar7, 6, 2);
                    baoVar7.x(5004770);
                    boolean zH3 = baoVar7.H(obj4);
                    Object objG3 = baoVar7.g();
                    if (zH3 || objG3 == ban.a) {
                        objG3 = new kic(obj4, i);
                        baoVar7.A(objG3);
                    }
                    baoVar7.p();
                    khhVar.b(xsVar, (yjk) objG3, null, baoVar7, 6, 2);
                    baoVar7.x(5004770);
                    boolean zH4 = baoVar7.H(obj4);
                    Object objG4 = baoVar7.g();
                    if (zH4 || objG4 == ban.a) {
                        objG4 = new kic(obj4, 3);
                        baoVar7.A(objG4);
                    }
                    baoVar7.p();
                    khhVar.c(xsVar, (yjk) objG4, null, baoVar7, 6, 2);
                    baoVar7.x(5004770);
                    boolean zH5 = baoVar7.H(obj4);
                    Object objG5 = baoVar7.g();
                    if (zH5 || objG5 == ban.a) {
                        objG5 = new kic(obj4, i);
                        baoVar7.A(objG5);
                    }
                    baoVar7.p();
                    khhVar.e(xsVar, (yjk) objG5, null, baoVar7, 6);
                    baoVar7.o();
                }
                break;
            case 7:
                bao baoVar8 = (bao) obj2;
                ((Number) obj3).intValue();
                ((drs) obj).getClass();
                din dinVar = new din(R.drawable.ic_info_24dp);
                djf djfVar = djh.b;
                cry.m(dinVar, null, cyf.l(djfVar), 0, baoVar8, 48, 24);
                wli wliVar = (wli) this.a;
                wls wlsVar = wliVar.b;
                if (wlsVar == null) {
                    wlsVar = wls.a;
                }
                String str = wlsVar.b;
                str.getClass();
                czu.r(str, cyf.l(djfVar), new due(new dul(bnq.c), new cmk(clw.w(4294967296L, 28.0f)), new dtz(), 108), 0, baoVar8, 0, 8);
                wls wlsVar2 = wliVar.c;
                if (wlsVar2 == null) {
                    wlsVar2 = wls.a;
                }
                String str2 = wlsVar2.b;
                str2.getClass();
                czu.r(str2, cyf.l(djfVar), new due(new dul(bnq.b), new cmk(clw.w(4294967296L, 16.0f)), new dtz(), 108), 0, baoVar8, 0, 8);
                break;
            case 8:
                bao baoVar9 = (bao) obj2;
                ((Number) obj3).intValue();
                ((drs) obj).getClass();
                klm klmVar = (klm) this.a;
                Context context2 = klmVar.f;
                if (context2 == null) {
                    yks.c("context");
                    context2 = null;
                }
                String string5 = context2.getString(R.string.personalized_recommendations_prompt);
                string5.getClass();
                czu.r(string5, cyf.k(djh.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), new due(new dul(bnq.b), new cmk(clw.w(4294967296L, 14.0f)), new dtz(), 108), 0, baoVar9, 0, 8);
                Context context3 = klmVar.f;
                if (context3 == null) {
                    yks.c("context");
                } else {
                    context = context3;
                }
                String string6 = context.getString(R.string.sign_in);
                string6.getClass();
                crn.w(string6, klmVar.f("signInButton"), null, false, null, 0, baoVar9, 0);
                break;
            case 9:
                ((Number) obj3).intValue();
                ((cwr) obj).getClass();
                djh djhVarI = cyf.i(cyg.k(djh.b), 8.0f, 8.0f);
                long j = klm.b;
                ((klm) this.a).k(djhVarI, (bao) obj2, 0);
                break;
            case 10:
                bao baoVar10 = (bao) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                ((zh) obj).getClass();
                if ((iIntValue8 & 17) == 16 && baoVar10.K()) {
                    baoVar10.t();
                } else {
                    rdd.p((String) this.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVar10).m, baoVar10, 0, 0, 65534);
                }
                break;
            case 11:
                bao baoVar11 = (bao) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                ((zh) obj).getClass();
                if ((iIntValue9 & 17) == 16 && baoVar11.K()) {
                    baoVar11.t();
                } else {
                    String string7 = ((Context) this.a).getString(R.string.fmr_stop_sound);
                    string7.getClass();
                    rdd.p(string7, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar11, 0, 0, 131070);
                }
                break;
            case 12:
                bao baoVar12 = (bao) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                ((xx) obj).getClass();
                if ((iIntValue10 & 17) == 16 && baoVar12.K()) {
                    baoVar12.t();
                } else {
                    bkm bkmVar = bkp.g;
                    yy yyVar = koy.a;
                    bkp bkpVarO = wv.o(bkmVar, koy.a);
                    Object obj5 = this.a;
                    bvt bvtVarA2 = xu.a(xk.e(8.0f), bkb.j, baoVar12, 6);
                    int iK2 = a.k(zy.p(baoVar12));
                    bhu bhuVarO2 = baoVar12.O();
                    bkp bkpVarC2 = bdi.C(baoVar12, bkpVarO);
                    yjk yjkVar2 = bxt.a;
                    baoVar12.c();
                    baoVar12.z();
                    if (baoVar12.J()) {
                        baoVar12.k(yjkVar2);
                    } else {
                        baoVar12.B();
                    }
                    beb.a(baoVar12, bvtVarA2, bxt.d);
                    beb.a(baoVar12, bhuVarO2, bxt.c);
                    yjz yjzVar2 = bxt.e;
                    if (baoVar12.J() || !yks.e(baoVar12.g(), Integer.valueOf(iK2))) {
                        Integer numValueOf2 = Integer.valueOf(iK2);
                        baoVar12.A(numValueOf2);
                        baoVar12.i(numValueOf2, yjzVar2);
                    }
                    beb.a(baoVar12, bkpVarC2, bxt.b);
                    kox koxVar = (kox) obj5;
                    jys.j(null, koxVar, baoVar12, 0);
                    axa.b(koxVar.b, null, koxVar.d, 0L, null, 0L, null, 0L, 2, false, 3, 0, null, wv.N(baoVar12).k, baoVar12, 0, 24960, 110586);
                    baoVar12.o();
                }
                break;
            case 13:
                bao baoVar13 = (bao) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                ((xx) obj).getClass();
                if ((iIntValue11 & 17) == 16 && baoVar13.K()) {
                    baoVar13.t();
                } else {
                    kph.b((kpe) this.a, bdi.x(bkp.g, 1.0f), baoVar13, 48);
                }
                break;
            default:
                avn avnVar = (avn) obj;
                bao baoVar14 = (bao) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                avnVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true == ((iIntValue12 & 8) == 0 ? baoVar14.F(avnVar) : baoVar14.H(avnVar)) ? 4 : 2;
                }
                if ((iIntValue12 & 19) == 18 && baoVar14.K()) {
                    baoVar14.t();
                } else {
                    pov.a.a(avnVar, null, (auy) this.a, null, 0.0f, 0.0f, baoVar14, (iIntValue12 & 14) | 12582920);
                }
                break;
        }
        return ygi.a;
    }
}

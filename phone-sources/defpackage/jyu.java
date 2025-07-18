package defpackage;

import android.content.Context;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jyu implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jyu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yfo] */
    @Override // defpackage.yjk
    public final Object a() {
        ihi ihiVar;
        ino inoVar;
        Context context = null;
        jzs jzsVar = null;
        kuw kuwVar = null;
        jzs jzsVar2 = null;
        kuw kuwVar2 = null;
        switch (this.b) {
            case 0:
                return EntityPageActivity.m114$r8$lambda$H_KWcqdzIrPw2dTARdodj20xtM((EntityPageActivity) this.a);
            case 1:
                return EntityPageActivity.$r8$lambda$ZPWnm8MmALaWtAqMHeSP1EhlqRI((EntityPageActivity) this.a);
            case 2:
                dwi dwiVar = (dwi) this.a;
                String str = (String) dwiVar.b("entity_mid");
                if (str != null) {
                    vtw vtwVarM = wll.a.m();
                    vtwVarM.getClass();
                    wbb.t(str, vtwVarM);
                    return wbb.s(vtwVarM);
                }
                wll wllVar = wll.a;
                wllVar.getClass();
                vvj vvjVarAn = jbr.an(dwiVar, "entity_id", wllVar);
                vvjVarAn.getClass();
                return (wll) vvjVarAn;
            case 3:
                return a.al((dwi) this.a);
            case 4:
                Object objB = ((dwi) this.a).b("asset_id");
                ksy ksyVar = objB instanceof ksy ? (ksy) objB : null;
                if (ksyVar != null) {
                    return hju.t(ksyVar);
                }
                return null;
            case 5:
                jyw jywVar = (jyw) this.a;
                kuw kuwVar3 = jywVar.j;
                if (kuwVar3 == null) {
                    yks.c("entityPageModelFactory");
                    kuwVar3 = null;
                }
                wll wllVarB = jywVar.b();
                wni wniVarC = jywVar.c();
                wpd wpdVar = (wpd) jywVar.i.a();
                ihi ihiVar2 = jywVar.a;
                if (ihiVar2 == null) {
                    yks.c("umpLibraryV2FlagsManager");
                    ihiVar = null;
                } else {
                    ihiVar = ihiVar2;
                }
                ino inoVar2 = jywVar.b;
                if (inoVar2 == null) {
                    yks.c("mediaLibraryStore");
                    inoVar = null;
                } else {
                    inoVar = inoVar2;
                }
                Object objB2 = kuwVar3.a.b();
                Object obj = kuwVar3.b;
                wllVarB.getClass();
                wpdVar.getClass();
                ihiVar.getClass();
                inoVar.getClass();
                jzg jzgVar = new jzg((gag) objB2, wllVarB, wniVarC, wpdVar, ihiVar, inoVar);
                idr idrVar = jywVar.e;
                idrVar.getClass();
                jzgVar.f(jef.a, idrVar);
                idr idrVar2 = jywVar.f;
                idrVar2.getClass();
                jzgVar.f(jef.d, idrVar2);
                jzgVar.f(jef.l, jywVar.a());
                idr idrVar3 = jywVar.g;
                idrVar3.getClass();
                jzgVar.f(jef.k, idrVar3);
                vuc vucVar = jzgVar.d;
                if (vucVar != null) {
                    jzgVar.f(jef.f, vucVar);
                }
                return jzgVar;
            case 6:
                Context context2 = ((jyw) this.a).c;
                if (context2 == null) {
                    yks.c("context");
                } else {
                    context = context2;
                }
                return new idz(context);
            case 7:
                woi woiVar = woi.a;
                woiVar.getClass();
                vvj vvjVarAn2 = jbr.an((dwi) this.a, "sharing_info", woiVar);
                vvjVarAn2.getClass();
                return (woi) vvjVarAn2;
            case 8:
                wpd wpdVar2 = wpd.a;
                wpdVar2.getClass();
                vvj vvjVarAn3 = jbr.an((dwi) this.a, "entity_page_parameters", wpdVar2);
                vvjVarAn3.getClass();
                return (wpd) vvjVarAn3;
            case 9:
                wll wllVar2 = wll.a;
                wllVar2.getClass();
                vvj vvjVarAn4 = jbr.an((dwi) this.a, "entity_id", wllVar2);
                vvjVarAn4.getClass();
                return (wll) vvjVarAn4;
            case 10:
                jzd jzdVar = (jzd) this.a;
                kuw kuwVar4 = jzdVar.b;
                if (kuwVar4 == null) {
                    yks.c("entityMenuModelFactory");
                } else {
                    kuwVar2 = kuwVar4;
                }
                wll wllVarA = jzdVar.a();
                Object objB3 = kuwVar2.a.b();
                Object obj2 = kuwVar2.b;
                wllVarA.getClass();
                iom iomVar = (iom) objB3;
                jzs jzsVar3 = (jzs) iomVar.d.b();
                jzsVar3.getClass();
                irc ircVar = (irc) iomVar.c.b();
                ircVar.getClass();
                kw kwVar = (kw) iomVar.b.b();
                kwVar.getClass();
                isf isfVar = (isf) iomVar.a.b();
                isfVar.getClass();
                return new iym(jbr.ad(new jzf(jzsVar3, ircVar, kwVar, isfVar, wllVarA)), 0, 6);
            case 11:
                jzn jznVar = (jzn) this.a;
                jzs jzsVar4 = jznVar.c;
                if (jzsVar4 == null) {
                    yks.c("componentManager");
                } else {
                    jzsVar2 = jzsVar4;
                }
                return jzsVar2.b(jznVar.b);
            case 12:
                String str2 = (String) ((jzn) this.a).a.b("referrer");
                return str2 == null ? "" : str2;
            case 13:
                wly wlyVar = wly.a;
                wlyVar.getClass();
                jzp jzpVar = (jzp) this.a;
                wly wlyVar2 = (wly) jbr.an(jzpVar.a, "included_stream", wlyVar);
                kuw kuwVar5 = jzpVar.c;
                if (kuwVar5 == null) {
                    yks.c("genericStreamDialogModelFactory");
                } else {
                    kuwVar = kuwVar5;
                }
                Object objB4 = kuwVar.a.b();
                Object obj3 = kuwVar.b;
                wlyVar2.getClass();
                return new iym(jbr.ad(((isy) objB4).a(wlyVar2)), 1, 4);
            case 14:
                wmc wmcVar = wmc.a;
                wmcVar.getClass();
                vvj vvjVarAn5 = jbr.an(((jzp) this.a).a, "logging_info", wmcVar);
                vvjVarAn5.getClass();
                return (wmc) vvjVarAn5;
            case 15:
                wlf wlfVar = wlf.a;
                wlfVar.getClass();
                vvj vvjVarAn6 = jbr.an(((jzy) this.a).a, "destination", wlfVar);
                vvjVarAn6.getClass();
                return (wlf) vvjVarAn6;
            case 16:
                jzy jzyVar = (jzy) this.a;
                jzs jzsVar5 = jzyVar.b;
                if (jzsVar5 == null) {
                    yks.c("componentManager");
                } else {
                    jzsVar = jzsVar5;
                }
                wlf wlfVarB = jzyVar.b();
                wkx wkxVar = wlfVarB.c == 3 ? (wkx) wlfVarB.d : wkx.a;
                wkxVar.getClass();
                return jzsVar.b(wkxVar);
            case 17:
                return GtvHomePageActivity.m116$r8$lambda$5lNkpJZU4W0YRxjWSCw_ieFXWQ((GtvHomePageActivity) this.a);
            case 18:
                GtvHomePageActivity gtvHomePageActivity = (GtvHomePageActivity) this.a;
                return Float.valueOf(-gtvHomePageActivity.E().l());
            case 19:
                return GtvHomePageActivity.m118$r8$lambda$XA_qyIVnSobjiMbnL980itp_CA((GtvHomePageActivity) this.a);
            default:
                return a.al((dwi) this.a);
        }
    }
}

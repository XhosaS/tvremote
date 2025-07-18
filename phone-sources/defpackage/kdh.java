package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdh {
    public final Object a;

    public kdh(Object obj) {
        this.a = obj;
    }

    public static final kwx m(List list, String str) {
        kwx kwxVarQ = q(list, str, true);
        if (kwxVarQ != null) {
            return kwxVarQ;
        }
        Locale locale = Locale.getDefault();
        kwx kwxVarP = p(list, locale, true);
        if (str != null && kwxVarP != null) {
            krd.f("Forced subtitles not available in language " + str + ", falling back to locale " + String.valueOf(locale));
        }
        return kwxVarP;
    }

    private static final kwx p(List list, Locale locale, boolean z) {
        kwx kwxVar = null;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kwx kwxVar2 = (kwx) it.next();
            if (kwxVar2.isForced() == z && Locale.forLanguageTag(kwxVar2.languageCode()).getLanguage().equals(Locale.forLanguageTag(locale.getLanguage()).getLanguage())) {
                if (Locale.forLanguageTag(kwxVar2.languageCode()).getCountry().equals(Locale.forLanguageTag(locale.toLanguageTag()).getCountry())) {
                    return kwxVar2;
                }
                kwxVar = kwxVar2;
            }
        }
        return kwxVar;
    }

    private static final kwx q(List list, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return p(list, Locale.forLanguageTag(str), z);
    }

    public final wkg a() {
        wkg wkgVar = ((wtv) this.a).e;
        if (wkgVar == null) {
            wkgVar = wkg.a;
        }
        wkgVar.getClass();
        return wkgVar;
    }

    public final wls b() {
        wls wlsVar = ((wtv) this.a).d;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        wlsVar.getClass();
        return wlsVar;
    }

    public final wlx c() {
        wlx wlxVar = ((wtv) this.a).c;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        wlxVar.getClass();
        return wlxVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final kjy d() {
        return new kjy(this.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final kjv e() {
        return new kjv(this.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final kjv f() {
        return new kjv(this.a, null);
    }

    public final kjp g() {
        return new kjp();
    }

    public final kjh h() {
        return new kjh();
    }

    public final SQLiteDatabase i() {
        return ((lyy) this.a).c(false);
    }

    public final SQLiteDatabase j() {
        return ((lyy) this.a).c(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized idf k(Class cls) {
        idf idfVar;
        idfVar = (idf) this.a.get(cls);
        if (idfVar == null) {
            throw new IllegalArgumentException("AssetResource to Model doesn't exist");
        }
        return idfVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final kwx l(List list, boolean z, llw llwVar) {
        kwx kwxVarQ = null;
        if (!list.isEmpty()) {
            Bundle bundle = llwVar.a;
            if (bundle.containsKey("lang") && bundle.getString("lang").equals("")) {
                return null;
            }
            if (bundle.containsKey("lang") && !bundle.getString("lang").equals("")) {
                kwxVarQ = q(list, llwVar.b(), false);
            }
            if (kwxVarQ == null) {
                jzs jzsVar = (jzs) this.a;
                kwxVarQ = q(list, jzsVar.m(), false);
                if (jzsVar.m() != null) {
                    return kwxVarQ;
                }
            }
            if (kwxVarQ == null && !z && ((jzs) this.a).c.getBoolean(krh.SELECT_SUBTITLE_WHEN_NO_AUDIO_IN_DEVICE_LANGUAGE, true)) {
                return p(list, Locale.getDefault(), false);
            }
        }
        return kwxVarQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ieg n(vzg vzgVar) {
        lbm lbmVar;
        val valVar = vzgVar.b;
        if (valVar == null) {
            valVar = val.a;
        }
        if (!kgu.q(valVar, vak.MOVIE)) {
            val valVar2 = vzgVar.b;
            if (valVar2 == null) {
                valVar2 = val.a;
            }
            if (!kgu.q(valVar2, vak.TRAILER)) {
                return ieg.b(new RuntimeException("Expected movie asset id but got: ".concat(String.valueOf(String.valueOf(vzgVar)))));
            }
        }
        vzh vzhVar = vzgVar.c;
        if (vzhVar == null) {
            vzhVar = vzh.a;
        }
        wac wacVar = vzgVar.d;
        if (wacVar == null) {
            wacVar = wac.a;
        }
        vzz vzzVar = wacVar.b == 5 ? (vzz) wacVar.c : vzz.a;
        vam vamVar = vzgVar.e;
        if (vamVar == null) {
            vamVar = vam.a;
        }
        vzr vzrVar = vzgVar.f;
        if (vzrVar == null) {
            vzrVar = vzr.b;
        }
        wat watVar = vzgVar.g;
        if (watVar == null) {
            watVar = wat.a;
        }
        waf wafVar = watVar.b == 2 ? (waf) watVar.c : waf.a;
        wag wagVar = wafVar.b;
        if (wagVar == null) {
            wagVar = wag.a;
        }
        vun vunVar = vzgVar.h;
        ImmutableList immutableListP = kir.p(wagVar.g);
        vtw vtwVarM = lbl.a.m();
        val valVar3 = vzgVar.b;
        if (valVar3 == null) {
            valVar3 = val.a;
        }
        lbo lboVarL = lbk.l(valVar3.c);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        lbl lblVar = (lbl) vucVar;
        lboVarL.getClass();
        lblVar.c = lboVarL;
        int i = 1;
        lblVar.b |= 1;
        String str = vzhVar.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        str.getClass();
        ((lbl) vucVar2).d = str;
        String str2 = wagVar.b;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        lbl lblVar2 = (lbl) vtwVarM.b;
        str2.getClass();
        lblVar2.e = str2;
        vtwVarM.Q(krf.r(vzzVar.b));
        ksz kszVar = (ksz) this.a;
        lcr lcrVarP = lbk.p(kszVar.c(immutableListP));
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbl lblVar3 = (lbl) vtwVarM.b;
        lcrVarP.getClass();
        lblVar3.f = lcrVarP;
        lblVar3.b |= 2;
        lcr lcrVarP2 = lbk.p(kszVar.d(immutableListP));
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbl lblVar4 = (lbl) vtwVarM.b;
        lcrVarP2.getClass();
        lblVar4.g = lcrVarP2;
        int i2 = 4;
        lblVar4.b |= 4;
        vtl vtlVar = vzrVar.h;
        if (vtlVar == null) {
            vtlVar = vtl.a;
        }
        int i3 = (int) vtlVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).i = i3;
        lcv lcvVarT = krf.t(wagVar.h);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbl lblVar5 = (lbl) vtwVarM.b;
        lcvVarT.getClass();
        lblVar5.k = lcvVarT;
        lblVar5.b |= 8;
        vtwVarM.O(krf.B(vamVar));
        String str3 = wagVar.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        str3.getClass();
        ((lbl) vucVar3).h = str3;
        vtl vtlVar2 = vzrVar.i;
        if (vtlVar2 == null) {
            vtlVar2 = vtl.a;
        }
        int i4 = (int) vtlVar2.b;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).n = i4;
        vbn vbnVar = wagVar.d;
        if (vbnVar == null) {
            vbnVar = vbn.a;
        }
        int i5 = vbnVar.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).o = i5;
        lac lacVarS = krf.s(wagVar.e);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbl lblVar6 = (lbl) vtwVarM.b;
        lacVarS.getClass();
        lblVar6.p = lacVarS;
        lblVar6.b |= 16;
        boolean z = krf.z(vzrVar.f);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).q = z;
        boolean z2 = vzrVar.g.size() > 0;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar4 = vtwVarM.b;
        ((lbl) vucVar4).r = z2;
        boolean z3 = vzrVar.c;
        if (!vucVar4.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).s = z3;
        vun vunVar2 = wagVar.f;
        String str4 = (String) (vunVar2.isEmpty() ? trk.a : tst.i(((vaq) vunVar2.get(0)).b)).e("");
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar5 = vtwVarM.b;
        ((lbl) vucVar5).v = str4;
        int iBb = a.bb(vzrVar.d);
        if (iBb == 0) {
            iBb = 1;
        }
        if (!vucVar5.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).t = krf.A(iBb);
        vuj vujVar = vzrVar.e;
        vuk vukVar = vzr.a;
        boolean zY = krf.y(new vul(vujVar, vukVar));
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).I = zY;
        boolean zX = krf.x(new vul(vzrVar.e, vukVar));
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).J = zX;
        boolean zAnyMatch = Collection.EL.stream(new vul(vzrVar.e, vukVar)).anyMatch(new pbd(i));
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar6 = vtwVarM.b;
        ((lbl) vucVar6).u = zAnyMatch;
        boolean z4 = vzrVar.j;
        if (!vucVar6.A()) {
            vtwVarM.u();
        }
        ((lbl) vtwVarM.b).K = z4;
        vtwVarM.N(krf.u(wafVar.c, 4));
        vtwVarM.S(krf.u(wafVar.c, 6));
        vtwVarM.I(krf.u(wafVar.c, 3));
        vtwVarM.P(krf.u(wafVar.c, 5));
        vtwVarM.L(FluentIterable.from(vzzVar.c).filter(new lsp(6)).transform(new lpn(20)).toList());
        vtwVarM.K(krf.q(FluentIterable.from(vzzVar.d).transform(new lsq(i2)).toList()));
        vtwVarM.J(krf.v(vzrVar.f));
        vtwVarM.M(krf.w(vzrVar.g));
        vdp vdpVar = vamVar.d;
        if (vdpVar == null) {
            vdpVar = vdp.a;
        }
        boolean z5 = vdpVar.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar7 = vtwVarM.b;
        ((lbl) vucVar7).G = z5;
        vdp vdpVar2 = vamVar.d;
        if (vdpVar2 == null) {
            vdpVar2 = vdp.a;
        }
        String str5 = vdpVar2.b;
        if (!vucVar7.A()) {
            vtwVarM.u();
        }
        lbl lblVar7 = (lbl) vtwVarM.b;
        str5.getClass();
        lblVar7.F = str5;
        vtwVarM.R(krf.C(vamVar.c));
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                lbmVar = lbm.a;
                break;
            }
            vaj vajVar = (vaj) it.next();
            int i6 = vajVar.b;
            int iC = vef.c(i6);
            if (iC == 0) {
                throw null;
            }
            int i7 = iC - 1;
            if (i7 == 0) {
                vck vckVar = i6 == 2 ? (vck) vajVar.c : vck.a;
                vbr vbrVar = vajVar.d;
                if (vbrVar == null) {
                    vbrVar = vbr.a;
                }
                vwe vweVar = vbrVar.b;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                int iAK = a.aK(vckVar.b);
                if (iAK == 0) {
                    iAK = 1;
                }
                int i8 = iAK - 2;
                if (i8 == 1) {
                    vtw vtwVarM2 = lbm.a.m();
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    ((lbm) vtwVarM2.b).b = a.aI(3);
                    long j = vweVar.b;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    ((lbm) vtwVarM2.b).c = j;
                    lbmVar = (lbm) vtwVarM2.r();
                } else if (i8 == 2) {
                    vtw vtwVarM3 = lbm.a.m();
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    ((lbm) vtwVarM3.b).b = a.aI(4);
                    long j2 = vweVar.b;
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    ((lbm) vtwVarM3.b).c = j2;
                    lbmVar = (lbm) vtwVarM3.r();
                } else if (i8 == 3) {
                    vtw vtwVarM4 = lbm.a.m();
                    if (!vtwVarM4.b.A()) {
                        vtwVarM4.u();
                    }
                    ((lbm) vtwVarM4.b).b = a.aI(5);
                    long j3 = vweVar.b;
                    if (!vtwVarM4.b.A()) {
                        vtwVarM4.u();
                    }
                    ((lbm) vtwVarM4.b).c = j3;
                    lbmVar = (lbm) vtwVarM4.r();
                } else if (i8 != 4) {
                    lbmVar = lbm.a;
                } else {
                    vtw vtwVarM5 = lbm.a.m();
                    if (!vtwVarM5.b.A()) {
                        vtwVarM5.u();
                    }
                    ((lbm) vtwVarM5.b).b = a.aI(9);
                    long j4 = vweVar.b;
                    if (!vtwVarM5.b.A()) {
                        vtwVarM5.u();
                    }
                    ((lbm) vtwVarM5.b).c = j4;
                    lbmVar = (lbm) vtwVarM5.r();
                }
            } else if (i7 == 1) {
                vdc vdcVar = i6 == 3 ? (vdc) vajVar.c : vdc.a;
                vbr vbrVar2 = vajVar.d;
                if (vbrVar2 == null) {
                    vbrVar2 = vbr.a;
                }
                vwe vweVar2 = vbrVar2.b;
                if (vweVar2 == null) {
                    vweVar2 = vwe.a;
                }
                int iAs = a.as(vdcVar.b);
                if (iAs == 0) {
                    iAs = 1;
                }
                int i9 = iAs - 2;
                if (i9 == 1) {
                    vtw vtwVarM6 = lbm.a.m();
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    ((lbm) vtwVarM6.b).b = a.aI(6);
                    long j5 = vweVar2.b;
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    ((lbm) vtwVarM6.b).c = j5;
                    lbmVar = (lbm) vtwVarM6.r();
                } else if (i9 != 2) {
                    lbmVar = lbm.a;
                } else {
                    vtw vtwVarM7 = lbm.a.m();
                    if (!vtwVarM7.b.A()) {
                        vtwVarM7.u();
                    }
                    ((lbm) vtwVarM7.b).b = a.aI(7);
                    long j6 = vweVar2.b;
                    if (!vtwVarM7.b.A()) {
                        vtwVarM7.u();
                    }
                    ((lbm) vtwVarM7.b).c = j6;
                    lbmVar = (lbm) vtwVarM7.r();
                }
            } else if (i7 == 2) {
                vap vapVar = i6 == 4 ? (vap) vajVar.c : vap.a;
                vbr vbrVar3 = vajVar.d;
                if (vbrVar3 == null) {
                    vbrVar3 = vbr.a;
                }
                vwe vweVar3 = vbrVar3.b;
                if (vweVar3 == null) {
                    vweVar3 = vwe.a;
                }
                int iAX = a.aX(vapVar.b);
                if (iAX == 0) {
                    iAX = 1;
                }
                if (iAX - 2 != 1) {
                    lbmVar = lbm.a;
                } else {
                    vtw vtwVarM8 = lbm.a.m();
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    ((lbm) vtwVarM8.b).b = a.aI(8);
                    long j7 = vweVar3.b;
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    ((lbm) vtwVarM8.b).c = j7;
                    lbmVar = (lbm) vtwVarM8.r();
                }
            }
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lbl lblVar8 = (lbl) vtwVarM.b;
        lbmVar.getClass();
        lblVar8.C = lbmVar;
        lblVar8.b |= 32;
        return ieg.f((lbl) vtwVarM.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ieg o(vzg vzgVar, idf idfVar) {
        law lawVar;
        long epochSecond;
        int i;
        val valVar = vzgVar.b;
        if (valVar == null) {
            valVar = val.a;
        }
        if (!kgu.q(valVar, vak.EPISODE)) {
            val valVar2 = vzgVar.b;
            if (valVar2 == null) {
                valVar2 = val.a;
            }
            return ieg.b(new RuntimeException("Expected episode asset id but got: ".concat(String.valueOf(valVar2.c))));
        }
        wac wacVar = vzgVar.d;
        if (wacVar == null) {
            wacVar = wac.a;
        }
        vzy vzyVar = wacVar.b == 3 ? (vzy) wacVar.c : vzy.a;
        vam vamVar = vzgVar.e;
        if (vamVar == null) {
            vamVar = vam.a;
        }
        vzr vzrVar = vzgVar.f;
        if (vzrVar == null) {
            vzrVar = vzr.b;
        }
        wat watVar = vzgVar.g;
        if (watVar == null) {
            watVar = wat.a;
        }
        way wayVar = (watVar.b == 6 ? (wav) watVar.c : wav.a).b;
        if (wayVar == null) {
            wayVar = way.a;
        }
        val valVar3 = vzyVar.c;
        if (valVar3 == null) {
            valVar3 = val.a;
        }
        if (!kgu.q(valVar3, vak.SHOW)) {
            val valVar4 = vzyVar.c;
            if (valVar4 == null) {
                valVar4 = val.a;
            }
            return ieg.b(new RuntimeException("Expected episode has show id but got: ".concat(String.valueOf(valVar4.c))));
        }
        val valVar5 = vzyVar.b;
        if (valVar5 == null) {
            valVar5 = val.a;
        }
        if (!kgu.q(valVar5, vak.SEASON)) {
            val valVar6 = vzyVar.b;
            if (valVar6 == null) {
                valVar6 = val.a;
            }
            return ieg.b(new RuntimeException("Expected episode has season id but got: ".concat(String.valueOf(valVar6.c))));
        }
        vtw vtwVarM = lch.a.m();
        val valVar7 = vzyVar.c;
        if (valVar7 == null) {
            valVar7 = val.a;
        }
        String str = valVar7.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        lch lchVar = (lch) vtwVarM.b;
        str.getClass();
        lchVar.b = str;
        lch lchVar2 = (lch) vtwVarM.r();
        vtw vtwVarM2 = lce.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        lce lceVar = (lce) vucVar;
        lchVar2.getClass();
        lceVar.d = lchVar2;
        lceVar.b |= 1;
        val valVar8 = vzyVar.b;
        if (valVar8 == null) {
            valVar8 = val.a;
        }
        String str2 = valVar8.c;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        lce lceVar2 = (lce) vtwVarM2.b;
        str2.getClass();
        lceVar2.c = str2;
        lce lceVar3 = (lce) vtwVarM2.r();
        law lawVar2 = law.a;
        vtw vtwVarM3 = lawVar2.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar2 = vtwVarM3.b;
        law lawVar3 = (law) vucVar2;
        lceVar3.getClass();
        lawVar3.d = lceVar3;
        lawVar3.b |= 1;
        val valVar9 = vzgVar.b;
        if (valVar9 == null) {
            valVar9 = val.a;
        }
        String str3 = valVar9.c;
        if (!vucVar2.A()) {
            vtwVarM3.u();
        }
        law lawVar4 = (law) vtwVarM3.b;
        str3.getClass();
        lawVar4.c = str3;
        law lawVar5 = (law) vtwVarM3.r();
        val valVar10 = vzyVar.c;
        if (valVar10 == null) {
            valVar10 = val.a;
        }
        tst tstVar = (tst) idfVar.b(valVar10);
        if (!tstVar.g()) {
            val valVar11 = vzgVar.b;
            if (valVar11 == null) {
                valVar11 = val.a;
            }
            return ieg.b(new RuntimeException("Can't get show info for episode: ".concat(String.valueOf(valVar11.c))));
        }
        vzg vzgVar2 = (vzg) tstVar.c();
        wat watVar2 = vzgVar2.g;
        if (watVar2 == null) {
            watVar2 = wat.a;
        }
        way wayVar2 = (watVar2.b == 4 ? (wax) watVar2.c : wax.a).b;
        if (wayVar2 == null) {
            wayVar2 = way.a;
        }
        ksz kszVar = (ksz) this.a;
        lcr lcrVarP = lbk.p(kszVar.f(kir.p(wayVar2.g)));
        lcr lcrVarP2 = lbk.p(kszVar.e(kir.p(wayVar2.g)));
        String str4 = wayVar2.b;
        val valVar12 = vzyVar.b;
        if (valVar12 == null) {
            valVar12 = val.a;
        }
        tst tstVar2 = (tst) idfVar.b(valVar12);
        if (!tstVar2.g()) {
            val valVar13 = vzgVar.b;
            if (valVar13 == null) {
                valVar13 = val.a;
            }
            return ieg.b(new RuntimeException("Can't get season info for episode: ".concat(String.valueOf(valVar13.c))));
        }
        vzg vzgVar3 = (vzg) tstVar2.c();
        wat watVar3 = vzgVar3.g;
        if (watVar3 == null) {
            watVar3 = wat.a;
        }
        String str5 = (watVar3.b == 5 ? (waw) watVar3.c : waw.a).b;
        wac wacVar2 = vzgVar3.d;
        if (wacVar2 == null) {
            wacVar2 = wac.a;
        }
        String str6 = (wacVar2.b == 2 ? (waa) wacVar2.c : waa.a).c;
        wac wacVar3 = vzgVar3.d;
        if (wacVar3 == null) {
            wacVar3 = wac.a;
        }
        waa waaVar = wacVar3.b == 2 ? (waa) wacVar3.c : waa.a;
        vun vunVar = waaVar.e;
        val valVar14 = vzgVar.b;
        if (valVar14 == null) {
            valVar14 = val.a;
        }
        boolean zContains = vunVar.contains(valVar14);
        wac wacVar4 = vzgVar2.d;
        if (wacVar4 == null) {
            wacVar4 = wac.a;
        }
        vun vunVar2 = (wacVar4.b == 1 ? (wab) wacVar4.c : wab.a).b;
        val valVar15 = vzgVar3.b;
        if (valVar15 == null) {
            valVar15 = val.a;
        }
        int iIndexOf = vunVar2.indexOf(valVar15);
        vun vunVar3 = waaVar.d;
        val valVar16 = vzgVar.b;
        if (valVar16 == null) {
            valVar16 = val.a;
        }
        int iIndexOf2 = vunVar3.indexOf(valVar16);
        if (iIndexOf2 < 0) {
            vun vunVar4 = waaVar.e;
            val valVar17 = vzgVar.b;
            if (valVar17 == null) {
                valVar17 = val.a;
            }
            iIndexOf2 = vunVar4.indexOf(valVar17);
            if (iIndexOf2 >= 0) {
                iIndexOf2 += waaVar.d.size();
            }
        }
        if (iIndexOf2 < 0 || (i = iIndexOf2 + 1) >= waaVar.d.size()) {
            lawVar = lawVar2;
        } else {
            val valVar18 = (val) waaVar.d.get(i);
            vtw vtwVarM4 = lawVar2.m();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar3 = vtwVarM4.b;
            law lawVar6 = (law) vucVar3;
            lceVar3.getClass();
            lawVar6.d = lceVar3;
            lawVar6.b |= 1;
            String str7 = valVar18.c;
            if (!vucVar3.A()) {
                vtwVarM4.u();
            }
            law lawVar7 = (law) vtwVarM4.b;
            str7.getClass();
            lawVar7.c = str7;
            lawVar = (law) vtwVarM4.r();
        }
        ImmutableList immutableListP = kir.p(wayVar.g);
        int i2 = kszVar.a;
        lcr lcrVarP3 = lbk.p(ksz.a(immutableListP, kuu.TYPE_SCREEN_SHOT, i2, (int) (i2 / 1.7777778f), 0.0f));
        vtw vtwVarM5 = lau.a.m();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vuc vucVar4 = vtwVarM5.b;
        lau lauVar = (lau) vucVar4;
        lawVar5.getClass();
        lauVar.c = lawVar5;
        lauVar.b |= 1;
        String str8 = wayVar.b;
        if (!vucVar4.A()) {
            vtwVarM5.u();
        }
        vuc vucVar5 = vtwVarM5.b;
        str8.getClass();
        ((lau) vucVar5).d = str8;
        String str9 = wayVar.c;
        if (!vucVar5.A()) {
            vtwVarM5.u();
        }
        vuc vucVar6 = vtwVarM5.b;
        str9.getClass();
        ((lau) vucVar6).q = str9;
        String str10 = vzyVar.d;
        if (!vucVar6.A()) {
            vtwVarM5.u();
        }
        vuc vucVar7 = vtwVarM5.b;
        str10.getClass();
        ((lau) vucVar7).j = str10;
        if (!vucVar7.A()) {
            vtwVarM5.u();
        }
        vuc vucVar8 = vtwVarM5.b;
        ((lau) vucVar8).y = iIndexOf2;
        if (!vucVar8.A()) {
            vtwVarM5.u();
        }
        lau lauVar2 = (lau) vtwVarM5.b;
        lawVar.getClass();
        lauVar2.z = lawVar;
        lauVar2.b |= 32;
        vtl vtlVar = vzrVar.h;
        if (vtlVar == null) {
            vtlVar = vtl.a;
        }
        int i3 = (int) vtlVar.b;
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vuc vucVar9 = vtwVarM5.b;
        ((lau) vucVar9).h = i3;
        vtl vtlVar2 = vzrVar.i;
        if (vtlVar2 == null) {
            vtlVar2 = vtl.a;
        }
        int i4 = (int) vtlVar2.b;
        if (!vucVar9.A()) {
            vtwVarM5.u();
        }
        ((lau) vtwVarM5.b).i = i4;
        if (true == lcrVarP3.b.isEmpty()) {
            lcrVarP3 = lcrVarP;
        }
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        lau lauVar3 = (lau) vtwVarM5.b;
        lcrVarP3.getClass();
        lauVar3.g = lcrVarP3;
        lauVar3.b |= 8;
        vtwVarM5.G(krf.B(vamVar));
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        ((lau) vtwVarM5.b).r = zContains;
        vbn vbnVar = wayVar.d;
        if (vbnVar == null) {
            vbnVar = vbn.a;
        }
        int i5 = vbnVar.b;
        if (i5 != 0) {
            epochSecond = LocalDate.of(i5, sfy.X(vbnVar.c, 1, 12), sfy.X(vbnVar.d, 1, 31)).atStartOfDay(ZoneOffset.UTC).toInstant().getEpochSecond();
        } else if (vbnVar.c == 0 && vbnVar.d == 0) {
            epochSecond = 0;
        } else {
            i5 = 0;
            epochSecond = LocalDate.of(i5, sfy.X(vbnVar.c, 1, 12), sfy.X(vbnVar.d, 1, 31)).atStartOfDay(ZoneOffset.UTC).toInstant().getEpochSecond();
        }
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        ((lau) vtwVarM5.b).o = epochSecond;
        lac lacVarS = krf.s(wayVar.e);
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        lau lauVar4 = (lau) vtwVarM5.b;
        lacVarS.getClass();
        lauVar4.p = lacVarS;
        lauVar4.b |= 16;
        vtwVarM5.E(krf.v(vzrVar.f));
        vtwVarM5.F(krf.w(vzrVar.g));
        vdp vdpVar = vamVar.d;
        if (vdpVar == null) {
            vdpVar = vdp.a;
        }
        boolean z = vdpVar.c;
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vuc vucVar10 = vtwVarM5.b;
        ((lau) vucVar10).v = z;
        vdp vdpVar2 = vamVar.d;
        if (vdpVar2 == null) {
            vdpVar2 = vdp.a;
        }
        String str11 = vdpVar2.b;
        if (!vucVar10.A()) {
            vtwVarM5.u();
        }
        lau lauVar5 = (lau) vtwVarM5.b;
        str11.getClass();
        lauVar5.u = str11;
        vtwVarM5.H(krf.C(vamVar.c));
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        vuc vucVar11 = vtwVarM5.b;
        str4.getClass();
        ((lau) vucVar11).m = str4;
        if (!vucVar11.A()) {
            vtwVarM5.u();
        }
        vuc vucVar12 = vtwVarM5.b;
        lau lauVar6 = (lau) vucVar12;
        lcrVarP.getClass();
        lauVar6.e = lcrVarP;
        lauVar6.b |= 2;
        if (!vucVar12.A()) {
            vtwVarM5.u();
        }
        vuc vucVar13 = vtwVarM5.b;
        lau lauVar7 = (lau) vucVar13;
        lcrVarP2.getClass();
        lauVar7.f = lcrVarP2;
        lauVar7.b |= 4;
        if (!vucVar13.A()) {
            vtwVarM5.u();
        }
        vuc vucVar14 = vtwVarM5.b;
        str5.getClass();
        ((lau) vucVar14).l = str5;
        if (!vucVar14.A()) {
            vtwVarM5.u();
        }
        vuc vucVar15 = vtwVarM5.b;
        str6.getClass();
        ((lau) vucVar15).n = str6;
        if (!vucVar15.A()) {
            vtwVarM5.u();
        }
        ((lau) vtwVarM5.b).x = iIndexOf;
        return ieg.f((lau) vtwVarM5.r());
    }

    public kdh(List list) {
        this.a = list;
    }

    public kdh(jzs jzsVar) {
        jzsVar.getClass();
        this.a = jzsVar;
    }

    public kdh(wtv wtvVar) {
        wtvVar.getClass();
        this.a = wtvVar;
    }

    public kdh(yfo yfoVar, byte[] bArr, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kdh(yfo yfoVar, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kdh(lxk lxkVar, kta ktaVar) {
        ktaVar.getClass();
        final lxr lxrVar = new lxr(new ljt(ktaVar, 18), new ljt(ktaVar, 19));
        lxkVar.getClass();
        int i = 16;
        ljt ljtVar = new ljt(lxkVar, i);
        ktaVar.getClass();
        final lxu lxuVar = new lxu(ljtVar, new lxt(ktaVar, 0), new lxt(ktaVar, 2), new lxt(ktaVar, 3));
        ljt ljtVar2 = new ljt(lxkVar, i);
        ktaVar.getClass();
        final lxv lxvVar = new lxv(ljtVar2, new lxt(ktaVar, 4), new lxt(ktaVar, 5));
        ktaVar.getClass();
        final lqs lqsVar = new lqs(new lxt(ktaVar, 6), new lxt(ktaVar, 7), 6, null);
        ktaVar.getClass();
        final lxs lxsVar = new lxs(new ljt(ktaVar, 20), new lxt(ktaVar, 1));
        ArrayMap arrayMap = new ArrayMap();
        this.a = arrayMap;
        arrayMap.put(kvf.class, lxrVar);
        arrayMap.put(kuo.class, lxuVar);
        arrayMap.put(kwl.class, lxvVar);
        arrayMap.put(kwn.class, lqsVar);
        arrayMap.put(kvj.class, lxsVar);
        final kzj kzjVar = kzj.k;
        idf idfVar = new idf() { // from class: lxn
            @Override // defpackage.idf
            public final Object b(Object obj) {
                xax xaxVar = (xax) obj;
                ieg iegVar = (ieg) kzjVar.b(xaxVar);
                if (!iegVar.m()) {
                    return ieg.b;
                }
                int iOrdinal = ((xay) iegVar.g()).ordinal();
                if (iOrdinal == 5) {
                    return lxrVar.b(xaxVar);
                }
                if (iOrdinal == 17) {
                    return lxsVar.b(xaxVar);
                }
                switch (iOrdinal) {
                }
                return ieg.b;
            }
        };
        arrayMap.put(kum.class, idfVar);
        arrayMap.put(kst.class, idfVar);
    }

    public kdh(Context context, lie lieVar, lfn lfnVar) {
        this.a = new lyy(context, lieVar, lfnVar);
    }
}

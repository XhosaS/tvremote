package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oya implements oxp {
    private static final tvn a = tvn.n("GnpSdk");
    private final String b;
    private final Context c;
    private final xbw d;
    private final qei e;
    private final tst f;
    private final yfo g;
    private final xbw h;
    private final xbw i;
    private final rbi j;
    private final cb k;

    public oya(rbi rbiVar, String str, Context context, xbw xbwVar, qei qeiVar, tst tstVar, yfo yfoVar, xbw xbwVar2, xbw xbwVar3, cb cbVar) {
        rbiVar.getClass();
        str.getClass();
        xbwVar.getClass();
        qeiVar.getClass();
        yfoVar.getClass();
        xbwVar2.getClass();
        xbwVar3.getClass();
        this.j = rbiVar;
        this.b = str;
        this.c = context;
        this.d = xbwVar;
        this.e = qeiVar;
        this.f = tstVar;
        this.g = yfoVar;
        this.h = xbwVar2;
        this.i = xbwVar3;
        this.k = cbVar;
    }

    private final uxb s(oyd oydVar) {
        upq upqVarW = sij.W(uxb.c.m());
        uwi uwiVar = oydVar.c;
        uwm uwmVar = uwiVar.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        uwmVar.getClass();
        Object obj = upqVarW.b;
        int i = uwmVar.b;
        vtw vtwVar = (vtw) obj;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar = (uxb) vtwVar.b;
        uxbVar.d |= 1;
        uxbVar.f = i;
        DesugarCollections.unmodifiableList(uxbVar.e).getClass();
        vuj vujVar = uwmVar.c;
        vujVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uxb uxbVar2 = (uxb) vtwVar.b;
        vuj vujVar2 = uxbVar2.e;
        if (!vujVar2.c()) {
            uxbVar2.e = vuc.q(vujVar2);
        }
        vsf.h(vujVar, uxbVar2.e);
        uvv uvvVar = uwiVar.h;
        if (uvvVar == null) {
            uvvVar = uvv.a;
        }
        String str = uvvVar.c == 4 ? (String) uvvVar.d : "";
        str.getClass();
        if (str.length() > 0) {
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uxb uxbVar3 = (uxb) vtwVar.b;
            uxbVar3.d |= 8192;
            uxbVar3.r = str;
        }
        vko vkoVar = oydVar.f;
        if (vkoVar != null && vkoVar.e != 0) {
            String str2 = vkoVar.c;
            str2.getClass();
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            vuc vucVar = vtwVar.b;
            uxb uxbVar4 = (uxb) vucVar;
            uxbVar4.d |= 16;
            uxbVar4.h = str2;
            long j = vkoVar.e;
            if (!vucVar.A()) {
                vtwVar.u();
            }
            uxb uxbVar5 = (uxb) vtwVar.b;
            uxbVar5.d |= 32;
            uxbVar5.i = j;
            int iX = x();
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            vuc vucVar2 = vtwVar.b;
            uxb uxbVar6 = (uxb) vucVar2;
            uxbVar6.v = iX - 1;
            uxbVar6.d |= 262144;
            vsz vszVar = vkoVar.f;
            vszVar.getClass();
            if (!vucVar2.A()) {
                vtwVar.u();
            }
            uxb uxbVar7 = (uxb) vtwVar.b;
            uxbVar7.d |= 4;
            uxbVar7.g = vszVar;
        }
        String str3 = this.e.a;
        if (str3 != null && str3.length() != 0) {
            upqVarW.h(str3);
        }
        upqVarW.k(t(oydVar));
        return upqVarW.g();
    }

    private final vib t(oyd oydVar) {
        return u(oydVar.b, oydVar.g);
    }

    private final vib u(String str, String str2) {
        boolean z = false;
        if (str != null && str.length() != 0 && (xgm.a.get().a() || str2 == null || str2.length() == 0)) {
            z = true;
        }
        tst tstVar = this.f;
        vtw vtwVarM = vib.a.m();
        vtwVarM.getClass();
        ves.p(vtwVarM);
        qdl qdlVarB = ((qjv) ((ttd) tstVar).a).b(z);
        if (qdlVarB instanceof qdi) {
            ((tvk) ((tvk) a.g()).i(((qdi) qdlVarB).a())).s("Failed creating the delivery address log for this event, leaving it empty");
        }
        if (qdlVarB instanceof qdn) {
            ves.n((vhf) ((qdn) qdlVarB).a, vtwVarM);
        }
        if (str2 != null) {
            ves.o(str2, vtwVarM);
        }
        return ves.m(vtwVarM);
    }

    private final void v(oyd oydVar, uwp uwpVar, uwq uwqVar) {
        w(oydVar.b, uwpVar, uwqVar);
    }

    private final void w(String str, uwp uwpVar, uwq uwqVar) {
        Context context = this.c;
        String strA = oyb.a(context);
        if (strA == null) {
            strA = "";
        }
        vtw vtwVar = (vtw) uwqVar.a(5, null);
        vtwVar.x(uwqVar);
        upq upqVarX = sij.X(vtwVar);
        vtw vtwVar2 = (vtw) upqVarX.b;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        String str2 = this.b;
        vuc vucVar = vtwVar2.b;
        uwq uwqVar2 = (uwq) vucVar;
        uwqVar2.b |= 1;
        uwqVar2.c = str2;
        if (!vucVar.A()) {
            vtwVar2.u();
        }
        vuc vucVar2 = vtwVar2.b;
        uwq uwqVar3 = (uwq) vucVar2;
        uwqVar3.b |= 4;
        uwqVar3.d = 770518479;
        if (!vucVar2.A()) {
            vtwVar2.u();
        }
        uwq uwqVar4 = (uwq) vtwVar2.b;
        uwqVar4.b |= 8;
        uwqVar4.e = strA;
        uwq uwqVarM = upqVarX.m();
        int i = 0;
        ((snf) ((qoj) this.d.b()).t.get()).b(str2, qtl.v(str), uwpVar.name());
        nsy nsyVarH = ((nsz) this.j.g(str)).h(uwqVarM, osr.b(context, new uxc()));
        nsyVarH.i(uwpVar.bR);
        nsyVarH.c();
        tvn tvnVar = a;
        tvnVar.l().B("Logged %s for %s", uwpVar, str);
        tvnVar.getClass();
        tvnVar.l().v("Dumping proto %s", uwqVarM);
        String strAi = osk.ai(uwqVarM);
        int iCeil = (int) Math.ceil(strAi.length() / 3500.0d);
        while (i < iCeil) {
            int i2 = i * 3500;
            i++;
            String strSubstring = strAi.substring(i2, Math.min(i * 3500, strAi.length()));
            strSubstring.getClass();
            tvnVar.l().E("(%d/%d) %s", Integer.valueOf(i), Integer.valueOf(iCeil), strSubstring);
        }
    }

    private final int x() {
        int iOrdinal = ((qie) this.g).b().ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 5;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 6;
        }
        if (iOrdinal == 5) {
            return 7;
        }
        throw new yfu();
    }

    @Override // defpackage.oxp
    public final void a(oyd oydVar, boolean z, uvu uvuVar) {
        uvuVar.getClass();
        upq upqVarX = sij.X(uwq.a.m());
        vtw vtwVarM = uwr.a.m();
        vtwVarM.getClass();
        int iX = x();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uwr uwrVar = (uwr) vtwVarM.b;
        uwrVar.e = iX - 1;
        uwrVar.b |= 8;
        vtw vtwVarM2 = uws.a.m();
        vtwVarM2.getClass();
        sij.U(z ? uvt.ANDROID_PERMISSION_STATE_AUTHORIZED : uvt.ANDROID_PERMISSION_STATE_DENIED, vtwVarM2);
        sij.V(uvuVar, vtwVarM2);
        uws uwsVarT = sij.T(vtwVarM2);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uwr uwrVar2 = (uwr) vucVar;
        uwrVar2.c = uwsVarT;
        uwrVar2.b |= 2;
        vko vkoVar = oydVar.f;
        if (vkoVar != null) {
            String str = vkoVar.c;
            str.getClass();
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            uwr uwrVar3 = (uwr) vucVar2;
            uwrVar3.b |= 64;
            uwrVar3.h = str;
            long j = vkoVar.e;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            vuc vucVar3 = vtwVarM.b;
            uwr uwrVar4 = (uwr) vucVar3;
            uwrVar4.b |= 4;
            uwrVar4.d = j;
            vsz vszVar = vkoVar.f;
            vszVar.getClass();
            if (!vucVar3.A()) {
                vtwVarM.u();
            }
            uwr uwrVar5 = (uwr) vtwVarM.b;
            uwrVar5.b |= 128;
            uwrVar5.i = vszVar;
        }
        String str2 = this.e.a;
        if (str2 != null && str2.length() != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwr uwrVar6 = (uwr) vtwVarM.b;
            uwrVar6.b |= 32;
            uwrVar6.g = str2;
        }
        vib vibVarT = t(oydVar);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uwr uwrVar7 = (uwr) vtwVarM.b;
        uwrVar7.f = vibVarT;
        uwrVar7.b |= 16;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        uwr uwrVar8 = (uwr) vucVarR;
        vtw vtwVar = (vtw) upqVarX.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uwq uwqVar = (uwq) vtwVar.b;
        uwqVar.g = uwrVar8;
        uwqVar.b |= 16777216;
        v(oydVar, z ? uwp.USER_AUTHORIZED_PERMISSION : uwp.USER_DENIED_PERMISSION, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void b(Map map, List list, String str) {
        upq upqVarX = sij.X(uwq.a.m());
        vtw vtwVarM = uwo.a.m();
        vtwVarM.getClass();
        DesugarCollections.unmodifiableList(((uwo) vtwVarM.b).c).getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            vtw vtwVarM2 = uws.a.m();
            vtwVarM2.getClass();
            sij.V((uvu) entry.getKey(), vtwVarM2);
            sij.U((uvt) entry.getValue(), vtwVarM2);
            arrayList.add(sij.T(vtwVarM2));
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uwo uwoVar = (uwo) vtwVarM.b;
        vun vunVar = uwoVar.c;
        if (!vunVar.c()) {
            uwoVar.c = vuc.s(vunVar);
        }
        vsf.h(arrayList, uwoVar.c);
        if (str.length() > 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwo uwoVar2 = (uwo) vtwVarM.b;
            uwoVar2.b |= 16;
            uwoVar2.d = str;
        }
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        uwo uwoVar3 = (uwo) vucVarR;
        vtw vtwVar = (vtw) upqVarX.b;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uwq uwqVar = (uwq) vtwVar.b;
        uwqVar.f = uwoVar3;
        uwqVar.b |= 512;
        uwq uwqVarM = upqVarX.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w((String) it.next(), uwp.PERIODIC_APPLICATION_STATE, uwqVarM);
        }
        w(null, uwp.PERIODIC_APPLICATION_STATE, uwqVarM);
    }

    @Override // defpackage.oxp
    public final void c(oyd oydVar, List list) {
        uwt uwtVar;
        oydVar.getClass();
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        vtw vtwVar2 = (vtw) upqVarW.b;
        new vul(((uxb) vtwVar2.b).n, uxb.b);
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ozg ozgVar = (ozg) it.next();
            ozgVar.getClass();
            switch (ozgVar) {
                case UNKNOWN:
                    uwtVar = uwt.CONDITION_UNKNOWN;
                    break;
                case BATTERY:
                    uwtVar = uwt.CONDITION_BATTERY;
                    break;
                case INSTALLED_APPS:
                    uwtVar = uwt.CONDITION_INSTALLED_APP;
                    break;
                case NETWORK:
                    uwtVar = uwt.CONDITION_NETWORK;
                    break;
                case LANGUAGE:
                    uwtVar = uwt.CONDITION_LOCALE;
                    break;
                case TIME_CONSTRAINT:
                    uwtVar = uwt.CONDITION_TIME_CONSTRAINT;
                    break;
                case DISPLAY_WITHOUT_NEW_SYNC:
                    uwtVar = uwt.CONDITION_SYNC_REQUIRED;
                    break;
                case VALID_INTENT:
                    uwtVar = uwt.CONDITION_VALID_INTENT;
                    break;
                case DASHER_FILTER:
                    uwtVar = uwt.CONDITION_DASHER;
                    break;
                case MINOR_FILTER:
                    uwtVar = uwt.CONDITION_MINOR;
                    break;
                case AUTH_URL:
                    uwtVar = uwt.CONDITION_AUTH_URL;
                    break;
                default:
                    throw new yfu();
            }
            arrayList.add(uwtVar);
        }
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        uxb uxbVar = (uxb) vtwVar2.b;
        vuj vujVar = uxbVar.n;
        if (!vujVar.c()) {
            uxbVar.n = vuc.q(vujVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            uxbVar.n.g(((uwt) it2.next()).p);
        }
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_CONDITIONS_EVALUATED, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void d(oyd oydVar) {
        upq upqVarX = sij.X(uwq.a.m());
        upqVarX.n(s(oydVar));
        v(oydVar, uwp.PROMO_EXPIRED, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void e(oyd oydVar, vol volVar) {
        oydVar.getClass();
        volVar.getClass();
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        Object objConvert = oxr.b.convert(volVar);
        if (objConvert == null) {
            throw new IllegalStateException("Required value was null.");
        }
        upqVarW.j((uwx) objConvert);
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_NOT_SHOWN, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void f(oyd oydVar, oye oyeVar) {
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        oxq oxqVar = oxr.a;
        voh vohVarA = oyeVar.a();
        if (vohVarA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objConvert = oxqVar.convert(vohVarA);
        if (objConvert == null) {
            throw new IllegalStateException("Required value was null.");
        }
        upqVarW.i((uww) objConvert);
        upqVarW.j(uwx.PROMO_NOT_SHOWN_CONTROL_GROUP);
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_NOT_SHOWN, upqVarX.m());
        ((qoj) this.d.b()).j(this.b, "CONTROL_NOT_SEEN");
    }

    @Override // defpackage.oxp
    public final void g(oyd oydVar) {
        oydVar.getClass();
        upq upqVarX = sij.X(uwq.a.m());
        upqVarX.n(s(oydVar));
        v(oydVar, uwp.PROMO_NOT_SHOWN_DEVICE_CAPPED, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void h(oyd oydVar, pfq pfqVar) {
        uwx uwxVar;
        pfqVar.getClass();
        if (pfq.SUCCESS == pfqVar) {
            return;
        }
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        switch (pfqVar.ordinal()) {
            case 1:
                uwxVar = uwx.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                break;
            case 2:
                uwxVar = uwx.PROMO_NOT_SHOWN_INTERNAL_ERROR;
                break;
            case 3:
                uwxVar = uwx.PROMO_NOT_SHOWN_UNSUPPORTED_PROMO_UI;
                break;
            case 4:
                uwxVar = uwx.PROMO_NOT_SHOWN_UNSUPPORTED_CUSTOM_UI_TYPE;
                break;
            case 5:
                uwxVar = uwx.PROMO_NOT_SHOWN_THEME_NOT_FOUND;
                break;
            case 6:
                uwxVar = uwx.PROMO_NOT_SHOWN_APPLICATION_IN_BACKGROUND;
                break;
            case 7:
                uwxVar = uwx.PROMO_NOT_SHOWN_VIEW_NOT_IN_SCREEN;
                break;
            case 8:
                uwxVar = uwx.PROMO_NOT_SHOWN_VIEW_MOSTLY_HIDDEN;
                break;
            case 9:
                uwxVar = uwx.PROMO_NOT_SHOWN_MISSING_ASSETS;
                break;
            case 10:
                uwxVar = uwx.PROMO_NOT_SHOWN_INVALID_PROMOTION;
                break;
            case 11:
                uwxVar = uwx.PROMO_NOT_SHOWN_INVALID_CUSTOM_UI_PROTO;
                break;
            case 12:
                uwxVar = uwx.PROMO_NOT_SHOWN_PERMISSION_GRANTED;
                break;
            default:
                uwxVar = uwx.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                break;
        }
        upqVarW.j(uwxVar);
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_NOT_SHOWN, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void i(oyd oydVar) {
        upq upqVarX = sij.X(uwq.a.m());
        upqVarX.n(s(oydVar));
        v(oydVar, uwp.PROMO_SENT_FOR_RENDERING, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void j(oyd oydVar, oye oyeVar) {
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        oxq oxqVar = oxr.a;
        voh vohVarA = oyeVar.a();
        if (vohVarA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object objConvert = oxqVar.convert(vohVarA);
        if (objConvert == null) {
            throw new IllegalStateException("Required value was null.");
        }
        upqVarW.i((uww) objConvert);
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_SHOWN, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void k(oyd oydVar, boolean z, Set set) {
        set.getClass();
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        vtw vtwVar2 = (vtw) upqVarW.b;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        uxb uxbVar = (uxb) vtwVar2.b;
        uxbVar.d |= 256;
        uxbVar.l = z;
        if (z && !set.isEmpty()) {
            new vul(((uxb) vtwVar2.b).m, uxb.a);
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                uwz uwzVar = (uwz) oxr.d.convert((von) it.next());
                if (uwzVar != null) {
                    arrayList.add(uwzVar);
                }
            }
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            uxb uxbVar2 = (uxb) vtwVar2.b;
            vuj vujVar = uxbVar2.m;
            if (!vujVar.c()) {
                uxbVar2.m = vuc.q(vujVar);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                uxbVar2.m.g(((uwz) it2.next()).n);
            }
        }
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_TARGETING_EVALUATED, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void l(oyd oydVar, int i) {
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        vtw vtwVar2 = (vtw) upqVarW.b;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        uxb uxbVar = (uxb) vtwVar2.b;
        uxbVar.d |= 128;
        uxbVar.k = i;
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_TRIGGERED, upqVarX.m());
    }

    @Override // defpackage.oxp
    public final void m(oyd oydVar, voo vooVar) {
        vooVar.getClass();
        Object objConvert = oxr.c.convert(vooVar);
        if (objConvert == null) {
            throw new IllegalStateException("Required value was null.");
        }
        uxa uxaVar = (uxa) objConvert;
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        upqVarW.l(uxaVar);
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_USER_ACTION, upqVarX.m());
        ((qoj) this.d.b()).j(this.b, uxaVar.name());
    }

    @Override // defpackage.oxp
    public final void n(oyd oydVar) {
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        upqVarW.l(uxa.ACTION_DISMISS);
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_USER_DISMISSED, upqVarX.m());
        ((qoj) this.d.b()).j(this.b, "DISMISSED");
    }

    @Override // defpackage.oxp
    public final void o(oyd oydVar, int i) {
        upq upqVarX = sij.X(uwq.a.m());
        uxb uxbVarS = s(oydVar);
        vtw vtwVar = (vtw) uxbVarS.a(5, null);
        vtwVar.x(uxbVarS);
        upq upqVarW = sij.W(vtwVar);
        upqVarW.j(uwx.PROMO_NOT_SHOWN_CLIENT_BLOCK);
        int i2 = i + (-1) == 1 ? 2 : 1;
        vtw vtwVar2 = (vtw) upqVarW.b;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        uxb uxbVar = (uxb) vtwVar2.b;
        uxbVar.p = i2 - 1;
        uxbVar.d |= 1024;
        upqVarX.n(upqVarW.g());
        v(oydVar, uwp.PROMO_NOT_SHOWN, upqVarX.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0274  */
    @Override // defpackage.oxp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r15, int r16, boolean r17, java.lang.String r18, java.lang.String r19, java.util.List r20, defpackage.yih r21) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oya.p(java.lang.String, int, boolean, java.lang.String, java.lang.String, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.qpv r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.oxx
            if (r0 == 0) goto L13
            r0 = r6
            oxx r0 = (defpackage.oxx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oxx r0 = new oxx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            cb r6 = r4.k
            boolean r6 = r6.M()
            if (r6 == 0) goto L43
            xbw r6 = r4.i
            java.lang.Object r6 = r6.b()
            qnr r6 = (defpackage.qnr) r6
            goto L4b
        L43:
            xbw r6 = r4.h
            java.lang.Object r6 = r6.b()
            qnr r6 = (defpackage.qnr) r6
        L4b:
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto L81
        L56:
            qdl r6 = (defpackage.qdl) r6
            boolean r5 = r6 instanceof defpackage.qdn
            if (r5 == 0) goto L74
            qdn r6 = (defpackage.qdn) r6
            java.lang.Object r5 = r6.a
            qen r5 = (defpackage.qen) r5
            if (r5 != 0) goto L6e
            qdj r5 = new qdj
            java.lang.String r6 = "Account not in storage"
            r0 = 33
            r5.<init>(r6, r0)
            return r5
        L6e:
            qdn r6 = new qdn
            r6.<init>(r5)
            return r6
        L74:
            boolean r5 = r6 instanceof defpackage.qdi
            if (r5 == 0) goto L7b
            qdi r6 = (defpackage.qdi) r6
            return r6
        L7b:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oya.q(qpv, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.oxz
            if (r0 == 0) goto L13
            r0 = r5
            oxz r0 = (defpackage.oxz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oxz r0 = new oxz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            cb r5 = r4.k
            boolean r5 = r5.M()
            if (r5 == 0) goto L43
            xbw r5 = r4.i
            java.lang.Object r5 = r5.b()
            qnr r5 = (defpackage.qnr) r5
            goto L4b
        L43:
            xbw r5 = r4.h
            java.lang.Object r5 = r5.b()
            qnr r5 = (defpackage.qnr) r5
        L4b:
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto Lb0
        L56:
            qdl r5 = (defpackage.qdl) r5
            boolean r0 = r5 instanceof defpackage.qdn
            if (r0 == 0) goto La3
            qdn r5 = (defpackage.qdn) r5
            java.lang.Object r5 = r5.a
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yfm.z(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r5.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()
            qen r2 = (defpackage.qen) r2
            qpv r2 = r2.b()
            java.lang.String r2 = r2.a()
            r0.add(r2)
            goto L71
        L89:
            java.util.List r0 = defpackage.yfm.ab(r0)
            qdn r1 = new qdn
            int r5 = r5.size()
            int r0 = r0.size()
            if (r5 <= r0) goto L9a
            goto L9b
        L9a:
            r3 = 0
        L9b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r5)
            return r1
        La3:
            boolean r0 = r5 instanceof defpackage.qdi
            if (r0 == 0) goto Laa
            qdi r5 = (defpackage.qdi) r5
            return r5
        Laa:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oya.r(yih):java.lang.Object");
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgb implements pfn, pfp {
    public final yil d;
    public final xbw e;
    public final String f;
    public final oyi g;
    public final oxp h;
    public final pfs i;
    private final yfo k;
    public static final tvn a = tvn.n("GnpSdk");
    private static final Set j = new LinkedHashSet();
    public static final Map b = new LinkedHashMap();
    public static final Map c = new LinkedHashMap();

    public pgb(yil yilVar, xbw xbwVar, String str, oyi oyiVar, oxp oxpVar, pfs pfsVar, yfo yfoVar) {
        xbwVar.getClass();
        str.getClass();
        oyiVar.getClass();
        oxpVar.getClass();
        pfsVar.getClass();
        yfoVar.getClass();
        this.d = yilVar;
        this.e = xbwVar;
        this.f = str;
        this.g = oyiVar;
        this.h = oxpVar;
        this.i = pfsVar;
        this.k = yfoVar;
    }

    @Override // defpackage.pfn
    public final Object a(oyd oydVar, uxd uxdVar, yih yihVar) throws Throwable {
        Object objL = ykr.l(this.d, new fzp(uxdVar, this, oydVar, (yih) null, 8), yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    @Override // defpackage.pfn
    public final Object b(oyd oydVar, pfq pfqVar, yih yihVar) throws Throwable {
        Object objL = ykr.l(this.d, new pfo(oydVar, this, pfqVar, (yih) null, 2), yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    @Override // defpackage.pfp
    public final void c(oyd oydVar, uyv uyvVar, by byVar) {
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        String strV = osk.v(uwmVar);
        b.put(strV, uyvVar);
        c.put(strV, byVar);
        Set set = j;
        strV.getClass();
        set.add(strV);
    }

    @Override // defpackage.pfp
    public final void d(oyd oydVar) {
        uwm uwmVar = oydVar.c.c;
        if (uwmVar == null) {
            uwmVar = uwm.a;
        }
        String strV = osk.v(uwmVar);
        j.remove(strV);
        b.remove(strV);
        c.remove(strV);
    }

    @Override // defpackage.pfp
    public final boolean e() {
        Set set = j;
        set.getClass();
        return !set.isEmpty();
    }

    public final void f(oyd oydVar, pfq pfqVar) {
        if (((pir) this.k).b() == null) {
            ((tvk) a.g()).s("Can't report an impression to collaborator as no callback was provided");
            return;
        }
        tac tacVar = new tac((byte[]) null);
        uyr uyrVar = oydVar.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        uyrVar.getClass();
        tacVar.a = osk.z(uyrVar);
        pil pilVarE = tacVar.e();
        if (pfqVar == pfq.SUCCESS) {
            a.l().v("Reporting an impression to the collaborator's callback - %s", pilVarE);
        } else {
            a.l().v("Reporting rendering failure to the collaborator's callback - %s", pilVarE);
            pfqVar.toString();
        }
    }
}

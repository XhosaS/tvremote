package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwy {
    public final String c;
    public final String d;
    public boolean e;
    public final yft f;
    public boolean g;
    private final List l;
    private final yft m;
    private final yft n;
    private final yft o;
    private final yft p;
    private final yft q;
    private final yft r;
    private static final ynj h = new ynj("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final ynj a = new ynj("\\{(.+?)\\}");
    private static final ynj i = new ynj("http[s]?://");
    private static final ynj j = new ynj(".*");
    private static final ynj k = new ynj("([^/]*?|)");
    public static final ynj b = new ynj("^[^?#]+\\?([^#]*).*");

    public fwy(String str) {
        this.c = str;
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        this.m = new yga(new ddd(this, 7));
        this.n = new yga(new ddd(this, 8));
        this.o = ybn.g(3, new ddd(this, 9));
        this.p = ybn.g(3, new ddd(this, 10));
        this.q = ybn.g(3, new ddd(this, 11));
        this.f = ybn.g(3, new ddd(this, 12));
        this.r = new yga(new ddd(this, 13));
        StringBuilder sb = new StringBuilder("^");
        if (!h.b(str)) {
            sb.append(i.a());
        }
        aafi aafiVarG = ynj.g(new ynj("(\\?|#|$)"), str);
        if (aafiVarG != null) {
            boolean z = false;
            String strSubstring = str.substring(0, aafiVarG.a().a);
            strSubstring.getClass();
            h(strSubstring, arrayList, sb);
            if (!j.b(sb) && !k.b(sb)) {
                z = true;
            }
            this.g = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.d = i(sb.toString());
    }

    public static final void h(String str, List list, StringBuilder sb) {
        int i2 = 0;
        for (aafi aafiVarG = ynj.g(a, str); aafiVarG != null; aafiVarG = aafiVarG.e()) {
            yng yngVarB = ((ynh) aafiVarG.c).b(1);
            yngVarB.getClass();
            list.add(yngVarB.a);
            if (aafiVarG.a().a > i2) {
                String strSubstring = str.substring(i2, aafiVarG.a().a);
                strSubstring.getClass();
                sb.append(yks.h(strSubstring));
            }
            sb.append(k.a());
            i2 = aafiVarG.a().b + 1;
        }
        if (i2 < str.length()) {
            String strSubstring2 = str.substring(i2);
            strSubstring2.getClass();
            sb.append(yks.h(strSubstring2));
        }
    }

    public static final String i(String str) {
        return (ylh.K(str, "\\Q", false) && ylh.K(str, "\\E", false)) ? ylh.Y(str, ".*", "\\E.*\\Q") : ylh.K(str, "\\.\\*", false) ? ylh.Y(str, "\\.\\*", ".*") : str;
    }

    private final List k() {
        return (List) this.q.a();
    }

    private final Map l() {
        return (Map) this.o.a();
    }

    private static final void m(Bundle bundle, String str, String str2, fwq fwqVar) {
        if (fwqVar == null) {
            ghf.c(bundle, str, str2);
            return;
        }
        str.getClass();
        fxm fxmVar = fwqVar.a;
        fxmVar.d(bundle, str, fxmVar.b(str2));
    }

    public final int a(Uri uri) {
        if (uri == null) {
            return 0;
        }
        return yfm.ao(uri.getPathSegments(), fus.M(this.c).getPathSegments()).size();
    }

    public final Bundle b(Uri uri, Map map) {
        aafi aafiVarF;
        aafi aafiVarF2;
        ynj ynjVarE = e();
        if (ynjVarE == null || (aafiVarF = ynjVarE.f(uri.toString())) == null) {
            return null;
        }
        int i2 = 0;
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        if (!j(aafiVarF, bundleJ, map)) {
            return null;
        }
        if (g() && !f(uri, bundleJ, map)) {
            return null;
        }
        String fragment = uri.getFragment();
        ynj ynjVar = (ynj) this.r.a();
        if (ynjVar != null && (aafiVarF2 = ynjVar.f(String.valueOf(fragment))) != null) {
            List listK = k();
            ArrayList arrayList = new ArrayList(yfm.z(listK, 10));
            for (Object obj : listK) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    yfm.w();
                }
                String str = (String) obj;
                yng yngVarB = ((ynh) aafiVarF2.c).b(i3);
                String strL = yngVarB != null ? fus.L(yngVarB.a) : null;
                fwq fwqVar = (fwq) map.get(str);
                if (strL == null) {
                    strL = "";
                }
                try {
                    m(bundleJ, str, strL, fwqVar);
                    arrayList.add(ygi.a);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (fus.c(map, new bap(bundleJ, 17)).isEmpty()) {
            return bundleJ;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object] */
    public final List c() {
        Collection collectionValues = l().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            yfm.I(arrayList, ((ghc) it.next()).a);
        }
        return yfm.af(yfm.af(this.l, arrayList), k());
    }

    public final yfw d() {
        return (yfw) this.p.a();
    }

    public final ynj e() {
        return (ynj) this.m.a();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof fwy) && yks.e(this.c, ((fwy) obj).c) && yks.e(null, null) && yks.e(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Iterable, java.lang.Object] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : l().entrySet()) {
            String str = (String) entry.getKey();
            ghc ghcVar = (ghc) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.e && (query = uri.getQuery()) != null && !yks.e(query, uri.toString())) {
                queryParameters = yfm.p(query);
            }
            boolean z2 = false;
            Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
            ?? r9 = ghcVar.a;
            Iterator it = r9.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                fwq fwqVar = (fwq) map.get(str2);
                fxm fxmVar = fwqVar != null ? fwqVar.a : null;
                if (fxmVar instanceof fwf) {
                    boolean z3 = fwqVar.b;
                    fwf fwfVar = (fwf) fxmVar;
                    fwfVar.d(bundleJ, str2, fwfVar.a());
                }
            }
            for (String str3 : queryParameters) {
                Object obj = ghcVar.b;
                aafi aafiVarF = obj != null ? new ynj((String) obj).f(str3) : null;
                if (aafiVarF == null) {
                    return z2;
                }
                ArrayList arrayList = new ArrayList(yfm.z(r9, 10));
                ?? r14 = z2;
                for (Object obj2 : r9) {
                    int i2 = r14 + 1;
                    if (r14 < 0) {
                        yfm.w();
                    }
                    String str4 = (String) obj2;
                    yng yngVarB = ((ynh) aafiVarF.c).b(i2);
                    String str5 = yngVarB != null ? yngVarB.a : null;
                    fwq fwqVar2 = (fwq) map.get(str4);
                    try {
                        boolean zF = ggz.f(bundleJ, str4);
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (zF) {
                            if (ggz.f(bundleJ, str4)) {
                                if (fwqVar2 != null) {
                                    fxm fxmVar2 = fwqVar2.a;
                                    fxmVar2.f(bundleJ, str4);
                                    str4.getClass();
                                    if (!ggz.f(bundleJ, str4)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    fxmVar2.d(bundleJ, str4, fxmVar2.e(str5));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            m(bundleJ, str4, str5, fwqVar2);
                            objValueOf = ygi.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = ygi.a;
                    }
                    arrayList.add(objValueOf);
                    r14 = i2;
                    z2 = false;
                }
            }
            bundle.putAll(bundleJ);
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.n.a()).booleanValue();
    }

    public final int hashCode() {
        return this.c.hashCode() * 961;
    }

    public final boolean j(aafi aafiVar, Bundle bundle, Map map) {
        List list = this.l;
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                yfm.w();
            }
            String str = (String) obj;
            yng yngVarB = ((ynh) aafiVar.c).b(i3);
            String strL = yngVarB != null ? fus.L(yngVarB.a) : null;
            fwq fwqVar = (fwq) map.get(str);
            if (strL == null) {
                strL = "";
            }
            try {
                m(bundle, str, strL, fwqVar);
                arrayList.add(ygi.a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }
}

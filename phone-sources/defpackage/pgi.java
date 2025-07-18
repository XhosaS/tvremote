package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgi implements pft {
    private static final tvn g = tvn.n("GnpSdk");
    public final pfn a;
    public final yow b;
    public final pfs c;
    public final Map d;
    public final Map e;
    public final Set f;
    private final oxp h;

    public pgi(pfn pfnVar, yow yowVar, pfs pfsVar, oxp oxpVar) {
        pfnVar.getClass();
        pfsVar.getClass();
        oxpVar.getClass();
        this.a = pfnVar;
        this.b = yowVar;
        this.c = pfsVar;
        this.h = oxpVar;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashSet();
    }

    private final qdl b(oyd oydVar, List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uyw uywVar = (uyw) it.next();
                uyv uyvVarB = uyv.b(uywVar.c);
                if (uyvVarB == null) {
                    uyvVarB = uyv.UNSPECIFIED;
                }
                if (uyvVarB == uyv.LIGHT) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        uyw uywVar2 = (uyw) it2.next();
                        uyv uyvVarB2 = uyv.b(uywVar2.c);
                        if (uyvVarB2 == null) {
                            uyvVarB2 = uyv.UNSPECIFIED;
                        }
                        if (uyvVarB2 == uyv.DARK) {
                            return new qdn(new yfw(uywVar, uywVar2));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            c(oydVar, pfq.FAILED_THEME_NOT_FOUND);
            return new qdj(new pgf(), 30);
        }
    }

    private final void c(oyd oydVar, pfq pfqVar) {
        ykr.q(this.b, null, 0, new pfo(this, oydVar, pfqVar, (yih) null, 4), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af A[PHI: r11
  0x01af: PHI (r11v3 ??) = (r11v11 ??), (r11v4 ??) binds: [B:83:0x0197, B:90:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // defpackage.pft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Parcelable r24, int r25, defpackage.yih r26) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgi.a(android.os.Parcelable, int, yih):java.lang.Object");
    }
}

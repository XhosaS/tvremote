package android.support.v7.app;

import android.os.LocaleList;
import defpackage.ctn;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class LocaleOverlayHelper {
    private LocaleOverlayHelper() {
    }

    private static ctn combineLocales(ctn ctnVar, ctn ctnVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < ctnVar.a() + ctnVar2.a()) {
            Locale localeF = i < ctnVar.a() ? ctnVar.f(i) : ctnVar2.f(i - ctnVar.a());
            if (localeF != null) {
                linkedHashSet.add(localeF);
            }
            i++;
        }
        return ctn.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static ctn combineLocalesIfOverlayExists(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? ctn.a : combineLocales(ctn.d(localeList), ctn.d(localeList2));
    }

    static ctn combineLocalesIfOverlayExists(ctn ctnVar, ctn ctnVar2) {
        if (ctnVar != null && !ctnVar.g()) {
            return combineLocales(ctnVar, ctnVar2);
        }
        return ctn.a;
    }
}

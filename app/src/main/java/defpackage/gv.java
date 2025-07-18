package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
class gv {
    static ads a(Configuration configuration) {
        return ads.a(configuration.getLocales().toLanguageTags());
    }

    static void b(Configuration configuration, ads adsVar) {
        configuration.setLocales(LocaleList.forLanguageTags(adsVar.b.a.toLanguageTags()));
    }
}

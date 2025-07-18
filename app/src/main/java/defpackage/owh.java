package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owh implements aejg {
    public static List b(Optional optional) {
        afih afihVar = new afih();
        afib afibVar = afih.b;
        int i = afid.c;
        afia afiaVar = new afia("Accept-Language", afibVar);
        Locale locale = Locale.getDefault();
        Charset charset = pah.a;
        StringBuilder sb = new StringBuilder();
        sb.append(!TextUtils.isEmpty(locale.getCountry()) ? String.format(Locale.US, "%s-%s", locale.getLanguage(), locale.getCountry()) : locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(String.format(Locale.US, ", %s;q=0.8", locale.getLanguage()));
        }
        sb.append(", en;q=0.5");
        afihVar.e(afiaVar, sb.toString());
        List list = (List) agwl.a(optional, yyk.o(new ageq(afihVar)));
        list.getClass();
        return list;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}

package defpackage;

import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldo {
    public final Collator a;
    private final List b;
    private final Map c;

    public ldo() {
        throw null;
    }

    public final ImmutableList a() {
        int i;
        Map map = this.c;
        ArrayList arrayList = new ArrayList(map.values());
        Iterator it = map.values().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            nuh nuhVar = (nuh) it.next();
            nuhVar.a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            while (true) {
                List list = this.b;
                if (i < list.size()) {
                    Locale locale = (Locale) list.get(i);
                    Object obj = nuhVar.c;
                    Charset charset = ksg.a;
                    Locale locale2 = (Locale) obj;
                    if (locale2.getLanguage().equals(locale.getLanguage())) {
                        String country = locale2.getCountry();
                        String country2 = locale.getCountry();
                        if (country.isEmpty() || country2.isEmpty() || country.equals(country2)) {
                            String script = locale2.getScript();
                            String script2 = locale.getScript();
                            if (script.isEmpty() || script2.isEmpty() || script.equals(script2)) {
                                String variant = locale2.getVariant();
                                String variant2 = locale.getVariant();
                                if (variant.isEmpty() || variant2.isEmpty() || variant.equals(variant2)) {
                                    break;
                                }
                            }
                        }
                    }
                    i++;
                }
            }
            nuhVar.a = i;
        }
        Collections.sort(arrayList, new acs(this, 11, null));
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(arrayList.size());
        int size = arrayList.size();
        while (i < size) {
            builderBuilderWithExpectedSize.add((ImmutableList.Builder) ((nuh) arrayList.get(i)).b);
            i++;
        }
        return builderBuilderWithExpectedSize.build();
    }

    public final void b(String str, Locale locale) {
        this.c.put(str, new nuh(str, locale));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ldo) {
            ldo ldoVar = (ldo) obj;
            if (this.a.equals(ldoVar.a) && this.b.equals(ldoVar.b) && this.c.equals(ldoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Map map = this.c;
        List list = this.b;
        return "LocaleDisplayTextListSorter{collator=" + String.valueOf(this.a) + ", configurationLocaleList=" + String.valueOf(list) + ", listItemMap=" + String.valueOf(map) + "}";
    }

    public ldo(Collator collator, List list, Map map) {
        this.a = collator;
        this.b = list;
        this.c = map;
    }
}

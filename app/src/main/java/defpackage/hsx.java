package defpackage;

import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsx {
    public final SuggestionChipList a(String str) {
        if (str == null) {
            str = "";
        }
        return new SuggestionChipList(str, agrd.a, 41160);
    }

    public final SuggestionChipList b(xqo xqoVar, List list, String str) {
        xaq xaqVar;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xqq xqqVar : xqoVar.c) {
            String str2 = xqqVar.b;
            str2.getClass();
            String strC = ypx.c(str2);
            strC.getClass();
            if (!SuggestionChipList.b.contains(strC) && !linkedHashSet.contains(strC)) {
                xbg xbgVar = xqqVar.c;
                if (xbgVar == null) {
                    xbgVar = xbg.a;
                }
                if (xbgVar.b == 1) {
                    xbg xbgVar2 = xqqVar.c;
                    if (xbgVar2 == null) {
                        xbgVar2 = xbg.a;
                    }
                    xaqVar = xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a;
                    String str3 = xaqVar.c;
                    str3.getClass();
                    if (str3.length() > 0 && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (agvy.c(((gzs) it.next()).c, xaqVar.c)) {
                            }
                        }
                    }
                } else {
                    xaqVar = null;
                }
                String str4 = str == null ? "" : str;
                linkedHashSet.add(strC);
                String str5 = xqqVar.b;
                str5.getClass();
                arrayList.add(new SuggestionChipItem(str5, str4, xaqVar, 41160));
                if (arrayList.size() >= 6) {
                    break;
                }
            }
        }
        if (str == null) {
            str = "";
        }
        return new SuggestionChipList(str, arrayList, 41160);
    }

    public final SuggestionChipList c(List list) {
        list.getClass();
        agrx agrxVar = new agrx(10);
        agrxVar.addAll(list);
        return new SuggestionChipList("", agqq.a(agrxVar), 67495);
    }
}

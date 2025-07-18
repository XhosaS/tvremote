package defpackage;

import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixk {
    public final List a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new SuggestionChipItem(str, null, null, 67495));
        }
        return arrayList;
    }
}

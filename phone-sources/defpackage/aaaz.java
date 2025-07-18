package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaaz extends UrlResponseInfo.HeaderBlock {
    public final List a;
    public Map b;

    public aaaz(List list) {
        this.a = list;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final List<Map.Entry<String, String>> getAsList() {
        return this.a;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final Map<String, List<String>> getAsMap() {
        Map<String, List<String>> map = this.b;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : this.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        Map<String, List<String>> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(treeMap);
        this.b = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }
}

package j$.util;

import java.util.SortedMap;

/* renamed from: j$.util.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0162t extends C0109q implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;
    public final SortedMap e;

    public C0162t(SortedMap sortedMap) {
        super(sortedMap);
        this.e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return this.e.comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.e.firstKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C0162t(this.e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.e.lastKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C0162t(this.e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C0162t(this.e.tailMap(obj));
    }
}

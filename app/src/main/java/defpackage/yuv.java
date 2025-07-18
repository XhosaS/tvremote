package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yuv extends yuy implements NavigableSet {
    final /* synthetic */ yve b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuv(yve yveVar, NavigableMap navigableMap) {
        super(yveVar, navigableMap);
        this.b = yveVar;
    }

    @Override // defpackage.yuy
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.d);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.d)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new yuv(this.b, ((NavigableMap) ((SortedMap) this.d)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.d)).floorKey(obj);
    }

    @Override // defpackage.yuy, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.d)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.d)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return zar.g(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return zar.g(descendingIterator());
    }

    @Override // defpackage.yuy, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.yuy, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new yuv(this.b, ((NavigableMap) ((SortedMap) this.d)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new yuv(this.b, ((NavigableMap) ((SortedMap) this.d)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new yuv(this.b, ((NavigableMap) ((SortedMap) this.d)).tailMap(obj, z));
    }
}

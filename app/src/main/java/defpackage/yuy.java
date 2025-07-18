package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yuy extends yut implements SortedSet {
    final /* synthetic */ yve c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuy(yve yveVar, SortedMap sortedMap) {
        super(yveVar, sortedMap);
        this.c = yveVar;
    }

    public SortedMap a() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new yuy(this.c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new yuy(this.c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new yuy(this.c, a().tailMap(obj));
    }
}

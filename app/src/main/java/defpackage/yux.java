package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yux extends yuq implements SortedMap {
    SortedSet d;
    final /* synthetic */ yve e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yux(yve yveVar, SortedMap sortedMap) {
        super(yveVar, sortedMap);
        this.e = yveVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    @Override // defpackage.zbj
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public SortedSet e() {
        return new yuy(this.e, f());
    }

    @Override // defpackage.yuq, defpackage.zbj, java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetE = e();
        this.d = sortedSetE;
        return sortedSetE;
    }

    public SortedMap headMap(Object obj) {
        return new yux(this.e, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new yux(this.e, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new yux(this.e, f().tailMap(obj));
    }
}

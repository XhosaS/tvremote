package j$.util;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class r extends x {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.x, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}

package j$.util;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class u extends j$.time.format.n {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.SortedSet sortedSet, java.util.SortedSet sortedSet2) {
        super(sortedSet2, 21);
        this.f = sortedSet;
    }

    @Override // j$.time.format.n, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}

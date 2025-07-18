package j$.util;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0168z extends X {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168z(java.util.SortedSet sortedSet, java.util.SortedSet sortedSet2) {
        super(sortedSet2, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.X, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}

package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abxq extends AbstractSet {
    final /* synthetic */ abxr a;
    private final Set b;

    public abxq(abxr abxrVar, Set set) {
        this.a = abxrVar;
        this.b = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new abxp(this.a, this.b.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}

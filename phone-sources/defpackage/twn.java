package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twn extends AbstractSet {
    final /* synthetic */ twp a;

    public twn(twp twpVar) {
        this.a = twpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<tuy<?>> iterator() {
        return new twm(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}

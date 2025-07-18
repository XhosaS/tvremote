package defpackage;

import java.util.AbstractSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ysp extends AbstractSet {
    final /* synthetic */ yug a;

    public ysp(yug yugVar) {
        this.a = yugVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ztm.d(this.a.b());
    }
}

package defpackage;

import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zdb extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return Sets.g(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}

package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iad<E> extends LinkedHashSet<E> {
    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        boolean zRemove = remove(e);
        super.add(e);
        return !zRemove;
    }
}

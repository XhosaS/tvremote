package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ygu<E> extends AbstractSet<E> implements Set<E>, ylm {
    protected ygu() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}

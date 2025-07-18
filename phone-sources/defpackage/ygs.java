package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ygs<E> extends AbstractList<E> implements List<E>, ylk {
    protected ygs() {
    }

    public abstract int b();

    public abstract Object d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}

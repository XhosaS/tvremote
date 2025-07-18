package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgz<K, V> extends ygr<V> implements Collection<V>, ylj {
    private final bgw a;

    public bgz(bgw bgwVar) {
        this.a = bgwVar;
    }

    @Override // defpackage.ygr
    public final int a() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        bhd[] bhdVarArr = new bhd[8];
        for (int i = 0; i < 8; i++) {
            bhdVarArr[i] = new bhh();
        }
        return new bgx(this.a, bhdVarArr);
    }
}

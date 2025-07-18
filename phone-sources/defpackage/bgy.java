package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy<K, V> extends ygu<K> implements Set<K>, ylm {
    private final bgw a;

    public bgy(bgw bgwVar) {
        this.a = bgwVar;
    }

    @Override // defpackage.ygu
    public final int a() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        bhd[] bhdVarArr = new bhd[8];
        for (int i = 0; i < 8; i++) {
            bhdVarArr[i] = new bhf();
        }
        return new bgx(this.a, bhdVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        bgw bgwVar = this.a;
        if (!bgwVar.containsKey(obj)) {
            return false;
        }
        bgwVar.remove(obj);
        return true;
    }
}

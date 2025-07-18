package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class vsj<E> extends AbstractList<E> implements vun<E> {
    private boolean a;

    public vsj(boolean z) {
        this.a = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        eA();
        super.add(i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        eA();
        return super.addAll(i, collection);
    }

    @Override // defpackage.vun
    public final void b() {
        if (this.a) {
            this.a = false;
        }
    }

    @Override // defpackage.vun
    public final boolean c() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        eA();
        super.clear();
    }

    protected final void eA() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        eA();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        eA();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        eA();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        eA();
        return (E) super.set(i, e);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        eA();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        eA();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        eA();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}

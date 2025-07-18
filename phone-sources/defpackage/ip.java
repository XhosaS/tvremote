package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ip implements Collection {
    final /* synthetic */ ir a;

    public ip(ir irVar) {
        this.a = irVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new iq(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ir irVar = this.a;
        int iB = irVar.b(obj);
        if (iB < 0) {
            return false;
        }
        irVar.e(iB);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        ir irVar = this.a;
        int i = irVar.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(irVar.g(i2))) {
                irVar.e(i2);
                i--;
                i2--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        ir irVar = this.a;
        int i = irVar.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(irVar.g(i2))) {
                irVar.e(i2);
                i--;
                i2--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ir irVar = this.a;
        int i = irVar.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = irVar.g(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        for (int i = 0; i < size; i++) {
            tArr[i] = this.a.g(i);
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}

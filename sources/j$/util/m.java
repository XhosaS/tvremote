package j$.util;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class m extends p {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.g, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains(new k((Map.Entry) obj));
    }

    @Override // j$.util.g, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.p, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // j$.util.g, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        Collection.EL.a(this.a, new j(consumer, 0));
    }

    @Override // j$.util.g, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    @Override // j$.util.g, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return j$.nio.file.attribute.a.L(spliterator(), true);
    }

    @Override // j$.util.g, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new l(Collection.EL.c(this.a));
    }

    @Override // j$.util.g, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return j$.nio.file.attribute.a.L(spliterator(), false);
    }

    @Override // j$.util.g, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new k((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // j$.util.g, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new k((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }
}

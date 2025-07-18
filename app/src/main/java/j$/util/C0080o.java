package j$.util;

import j$.nio.file.C0044s;
import j$.util.Collection;
import j$.util.stream.Stream;
import j$.util.stream.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0080o extends r {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C0076k, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains(new C0079n((Map.Entry) obj));
    }

    @Override // j$.util.C0076k, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.r, java.util.Collection, java.util.Set
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

    @Override // j$.util.C0076k, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        Collection.EL.a(this.a, new C0044s(consumer, 2));
    }

    @Override // j$.util.C0076k, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0075j(this);
    }

    @Override // j$.util.C0076k, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return q0.a(spliterator(), true);
    }

    @Override // j$.util.C0076k, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final Spliterator spliterator() {
        return new j$.desugar.sun.nio.fs.h(2, Collection.EL.c(this.a));
    }

    @Override // j$.util.C0076k, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return q0.a(spliterator(), false);
    }

    @Override // j$.util.C0076k, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C0079n((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // j$.util.C0076k, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C0079n((Map.Entry) array[i]);
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

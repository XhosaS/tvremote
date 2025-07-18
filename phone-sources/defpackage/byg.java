package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byg implements List, j$.util.List, yli {
    public final kc b = new kc(16);
    public final ji c = new ji(16);
    public int a = -1;

    public final int a() {
        return this.b.b;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends bko> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jB = fh.B(Float.POSITIVE_INFINITY, false, false);
        int i = this.a + 1;
        int iQ = yfm.q(this);
        if (i <= iQ) {
            while (true) {
                ji jiVar = this.c;
                if (i < 0 || i >= jiVar.b) {
                    kv.c("Index must be between 0 and size");
                }
                long j = jiVar.a[i];
                if (bya.b(j, jB) < 0) {
                    jB = j;
                }
                if ((bya.a(jB) < 0.0f && bya.d(jB)) || i == iQ) {
                    break;
                }
                i++;
            }
        }
        return jB;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bko get(int i) {
        Object objC = this.b.c(i);
        objC.getClass();
        return (bko) objC;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a = -1;
        this.b.k();
        this.c.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        return (obj instanceof bko) && indexOf((bko) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((bko) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i >= i2) {
            return;
        }
        this.b.l(i, i2);
        ji jiVar = this.c;
        if (i < 0 || i > (i3 = jiVar.b) || i2 < 0 || i2 > i3) {
            kv.c("Index must be between 0 and size");
        }
        if (i2 < i) {
            kv.a("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = jiVar.b;
            if (i2 < i4) {
                long[] jArr = jiVar.a;
                yfm.bi(jArr, jArr, i, i2, i4);
            }
            jiVar.b -= i2 - i;
        }
    }

    public final boolean e(float f, boolean z) {
        if (this.a == yfm.q(this)) {
            return true;
        }
        return bya.b(b(), fh.B(f, z, false)) > 0;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof bko)) {
            return -1;
        }
        bko bkoVar = (bko) obj;
        int iQ = yfm.q(this);
        if (iQ < 0) {
            return -1;
        }
        int i = 0;
        while (!yks.e(this.b.c(i), bkoVar)) {
            if (i == iQ) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<bko> iterator() {
        return new bye(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof bko)) {
            return -1;
        }
        bko bkoVar = (bko) obj;
        for (int iQ = yfm.q(this); iQ >= 0; iQ--) {
            if (yks.e(this.b.c(iQ), bkoVar)) {
                return iQ;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<bko> listIterator() {
        return new bye(this, 0, 7);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator<bko> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super bko> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List<bko> subList(int i, int i2) {
        return new byf(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ykm.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends bko> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<bko> listIterator(int i) {
        return new bye(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) ykm.b(this, tArr);
    }
}

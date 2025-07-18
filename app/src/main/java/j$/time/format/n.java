package j$.time.format;

import j$.util.K;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public /* synthetic */ class n implements Consumer, Spliterator {
    public final int a;
    public long b;
    public int c;
    public final Object d;
    public Object e;

    public /* synthetic */ n(o oVar, v vVar, long j, int i, int i2) {
        this.d = oVar;
        this.e = vVar;
        this.b = j;
        this.a = i;
        this.c = i2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((o) this.d).c((v) this.e, this.b, this.a, this.c);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return this.a;
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        Collection collection = (Collection) this.d;
        if (((Iterator) this.e) != null) {
            return this.b;
        }
        this.e = collection.iterator();
        long size = collection.size();
        this.b = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        Collection collection = (Collection) this.d;
        consumer.getClass();
        Iterator it = (Iterator) this.e;
        if (it == null) {
            it = collection.iterator();
            this.e = it;
            this.b = collection.size();
        }
        j$.desugar.sun.nio.fs.g.v(it, consumer);
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (j$.desugar.sun.nio.fs.g.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return j$.desugar.sun.nio.fs.g.h(this);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.desugar.sun.nio.fs.g.j(this, i);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        Collection collection = (Collection) this.d;
        consumer.getClass();
        if (((Iterator) this.e) == null) {
            this.e = collection.iterator();
            this.b = collection.size();
        }
        if (!((Iterator) this.e).hasNext()) {
            return false;
        }
        consumer.accept(((Iterator) this.e).next());
        return true;
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        long size;
        Collection collection = (Collection) this.d;
        Iterator it = (Iterator) this.e;
        if (it == null) {
            it = collection.iterator();
            this.e = it;
            size = collection.size();
            this.b = size;
        } else {
            size = this.b;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.c + 1024;
        if (i > size) {
            i = (int) size;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.c = i2;
        long j = this.b;
        if (j != Long.MAX_VALUE) {
            this.b = j - i2;
        }
        return new K(objArr, 0, i2, this.a);
    }

    public n(Collection collection, int i) {
        this.d = collection;
        this.e = null;
        this.a = (i & 4096) == 0 ? i | 16448 : i;
    }

    public n(Iterator it) {
        this.d = null;
        this.e = it;
        this.b = Long.MAX_VALUE;
        this.a = 0;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jw<E> extends km<E> implements Set<E>, ylm {
    public final kk a;

    public jw(kk kkVar) {
        super(kkVar);
        this.a = kkVar;
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.a.j(e);
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        return this.a.k(collection);
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new jv(this, 0);
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.l(obj);
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        kk kkVar = this.a;
        int i = kkVar.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            kkVar.e(it.next());
        }
        return i != kkVar.d;
    }

    @Override // defpackage.km, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        collection.getClass();
        kk kkVar = this.a;
        Object[] objArr = kkVar.b;
        int i2 = kkVar.d;
        long[] jArr = kkVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!yfm.as(collection, objArr[i6])) {
                                kkVar.i(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != kkVar.d;
    }
}

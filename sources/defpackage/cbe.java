package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbe extends cae {
    public static final cbe c;
    final transient bzs d;

    static {
        int i = bzs.d;
        c = new cbe(cax.a, car.a);
    }

    public cbe(bzs bzsVar, Comparator comparator) {
        super(comparator);
        this.d = bzsVar;
    }

    final int A(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((cae) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int B(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((cae) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final cbe C(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return y(this.a);
        }
        bzs bzsVar = this.d;
        return new cbe(bzsVar.subList(i, i2), this.a);
    }

    @Override // defpackage.bzl
    public final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // defpackage.bzl
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.bzl
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.cae, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iB = B(obj, true);
        if (iB == size()) {
            return null;
        }
        return this.d.get(iB);
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof caq) {
            collection = ((caq) collection).a();
        }
        if (!bjz.d(((cae) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        cbj cbjVarListIterator = listIterator();
        Iterator it = collection.iterator();
        if (!cbjVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = cbjVarListIterator.next();
        while (true) {
            try {
                int iH = h(next2, next);
                if (iH >= 0) {
                    if (iH != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!cbjVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = cbjVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.cab, defpackage.bzl
    public final bzs d() {
        return this.d;
    }

    @Override // defpackage.cae, defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final cbj listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.cab, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!bjz.d(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            cbj cbjVarListIterator = listIterator();
            while (cbjVarListIterator.hasNext()) {
                Object next = cbjVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || h(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.cae, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.cae, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iA = A(obj, true) - 1;
        if (iA == -1) {
            return null;
        }
        return this.d.get(iA);
    }

    @Override // defpackage.bzl
    public final Object[] g() {
        return this.d.g();
    }

    @Override // defpackage.cae, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iB = B(obj, false);
        if (iB == size()) {
            return null;
        }
        return this.d.get(iB);
    }

    @Override // defpackage.cae, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.cae, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iA = A(obj, false) - 1;
        if (iA == -1) {
            return null;
        }
        return this.d.get(iA);
    }

    @Override // defpackage.cae
    public final cae r() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? y(comparatorReverseOrder) : new cbe(this.d.h(), comparatorReverseOrder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.cae
    public final cae t(Object obj, boolean z) {
        return C(0, A(obj, z));
    }

    @Override // defpackage.cae
    public final cae v(Object obj, boolean z, Object obj2, boolean z2) {
        return x(obj, z).t(obj2, z2);
    }

    @Override // defpackage.cae, defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.cae
    public final cae x(Object obj, boolean z) {
        return C(B(obj, z), size());
    }

    @Override // defpackage.cae, java.util.NavigableSet
    /* renamed from: z */
    public final cbj descendingIterator() {
        return this.d.h().iterator();
    }
}

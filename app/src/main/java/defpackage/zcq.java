package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcq extends yzw {
    public static final zcq d;
    public final transient yyk e;

    static {
        int i = yyk.e;
        d = new zcq(zcg.b, zbv.a);
    }

    public zcq(yyk yykVar, Comparator comparator) {
        super(comparator);
        this.e = yykVar;
    }

    @Override // defpackage.yzw, java.util.NavigableSet
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final zdl descendingIterator() {
        return this.e.a().listIterator(0);
    }

    final int C(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.e, obj, ((yzw) this).b);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int D(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.e, obj, ((yzw) this).b);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final zcq E(int i, int i2) {
        if (i == 0) {
            if (i2 == this.e.size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return A(this.b);
        }
        yyk yykVar = this.e;
        return new zcq(yykVar.subList(i, i2), this.b);
    }

    @Override // defpackage.yzw
    public final yzw a() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.b);
        return isEmpty() ? A(comparatorReverseOrder) : new zcq(this.e.a(), comparatorReverseOrder);
    }

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        return this.e.b(objArr, i);
    }

    @Override // defpackage.yzw, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        yyk yykVar = this.e;
        int iD = D(obj, true);
        if (iD == yykVar.size()) {
            return null;
        }
        return yykVar.get(iD);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.e, obj, this.b) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zbp) {
            collection = ((zbp) collection).i();
        }
        Comparator comparator = ((yzw) this).b;
        if (!zdf.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zdm zdmVarListIterator = this.e.listIterator(0);
        Iterator it = collection.iterator();
        if (!zdmVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zdmVarListIterator.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!zdmVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zdmVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.yxy
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.yxy
    public final int e() {
        return this.e.e();
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        yyk yykVar = this.e;
        if (yykVar.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zdf.a(this.b, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zdm zdmVarListIterator = yykVar.listIterator(0);
            while (zdmVarListIterator.hasNext()) {
                E next = zdmVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((yzw) this).b.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.yzq, defpackage.yxy
    public final yyk f() {
        return this.e;
    }

    @Override // defpackage.yzw, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.e.get(0);
    }

    @Override // defpackage.yzw, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iC = C(obj, true) - 1;
        if (iC == -1) {
            return null;
        }
        return this.e.get(iC);
    }

    @Override // defpackage.yzw, java.util.NavigableSet
    public final Object higher(Object obj) {
        yyk yykVar = this.e;
        int iD = D(obj, false);
        if (iD == yykVar.size()) {
            return null;
        }
        return yykVar.get(iD);
    }

    @Override // defpackage.yzw, defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // defpackage.yzw, defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return this.e.listIterator(0);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return this.e.l();
    }

    @Override // defpackage.yzw, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.e.get(r0.size() - 1);
    }

    @Override // defpackage.yzw, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iC = C(obj, false) - 1;
        if (iC == -1) {
            return null;
        }
        return this.e.get(iC);
    }

    @Override // defpackage.yxy
    public final Object[] m() {
        return this.e.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e.size();
    }

    @Override // defpackage.yzw
    public final yzw w(Object obj, boolean z) {
        return E(0, C(obj, z));
    }

    @Override // defpackage.yzw, defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.yzw
    public final yzw y(Object obj, boolean z, Object obj2, boolean z2) {
        return z(obj, z).w(obj2, z2);
    }

    @Override // defpackage.yzw
    public final yzw z(Object obj, boolean z) {
        return E(D(obj, z), this.e.size());
    }
}

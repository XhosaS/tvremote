package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfw<T> implements List<T>, ylk {
    private final /* synthetic */ int a;
    private final Object b;

    public bfw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        if (this.a == 0) {
            ((bfz) this.b).g(i, obj);
            return;
        }
        Object obj2 = this.b;
        if (i < 0 || i > ((kc) obj2).b) {
            ((kc) obj2).n(i);
        }
        kc kcVar = (kc) obj2;
        int i2 = kcVar.b + 1;
        Object[] objArr = kcVar.a;
        if (objArr.length < i2) {
            kcVar.m(i2, objArr);
        }
        Object[] objArr2 = kcVar.a;
        int i3 = kcVar.b;
        if (i != i3) {
            yfm.bj(objArr2, objArr2, i + 1, i, i3);
        }
        objArr2[i] = obj;
        kcVar.b++;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (this.a == 0) {
            bfz bfzVar = (bfz) this.b;
            return bfzVar.l(bfzVar.b, collection);
        }
        collection.getClass();
        kc kcVar = (kc) this.b;
        int i = kcVar.b;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            kcVar.p(it.next());
        }
        return i != kcVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.a != 0) {
            ((kc) this.b).k();
        } else {
            ((bfz) this.b).h();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a != 0 ? ((kc) this.b).e(obj) : ((bfz) this.b).m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (this.a == 0) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!((bfz) this.b).m(it.next())) {
                    return false;
                }
            }
            return true;
        }
        collection.getClass();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!((kc) this.b).e(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (this.a != 0) {
            kd.a(this, i);
            return ((kc) this.b).c(i);
        }
        bga.a(this, i);
        return ((bfz) this.b).a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a != 0 ? ((kc) this.b).a(obj) : ((bfz) this.b).a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a != 0 ? ((kc) this.b).f() : ((bfz) this.b).b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a != 0 ? new bfy(this, 0, 1, null) : new bfy(this, 0, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (this.a == 0) {
            bfz bfzVar = (bfz) this.b;
            Object[] objArr = bfzVar.a;
            for (int i = bfzVar.b - 1; i >= 0; i--) {
                if (yks.e(obj, objArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        Object obj2 = this.b;
        if (obj == null) {
            kc kcVar = (kc) obj2;
            Object[] objArr2 = kcVar.a;
            for (int i2 = kcVar.b - 1; i2 >= 0; i2--) {
                if (objArr2[i2] == null) {
                    return i2;
                }
            }
            return -1;
        }
        kc kcVar2 = (kc) obj2;
        Object[] objArr3 = kcVar2.a;
        for (int i3 = kcVar2.b - 1; i3 >= 0; i3--) {
            if (obj.equals(objArr3[i3])) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a != 0 ? new bfy(this, 0, 1, null) : new bfy(this, 0, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        if (this.a != 0) {
            kd.a(this, i);
            return ((kc) this.b).h(i);
        }
        bga.a(this, i);
        return ((bfz) this.b).d(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (this.a != 0) {
            collection.getClass();
            kc kcVar = (kc) this.b;
            int i = kcVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                kcVar.o(it.next());
            }
            return i != kcVar.b;
        }
        if (!collection.isEmpty()) {
            bfz bfzVar = (bfz) this.b;
            int i2 = bfzVar.b;
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                bfzVar.n(it2.next());
            }
            if (i2 != bfzVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        if (this.a == 0) {
            bfz bfzVar = (bfz) this.b;
            int i = bfzVar.b;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!collection.contains(bfzVar.a[i2])) {
                    bfzVar.d(i2);
                }
            }
            return i != bfzVar.b;
        }
        collection.getClass();
        kc kcVar = (kc) this.b;
        int i3 = kcVar.b;
        Object[] objArr = kcVar.a;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(objArr[i4])) {
                kcVar.h(i4);
            }
        }
        return i3 != kcVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (this.a != 0) {
            kd.a(this, i);
            return ((kc) this.b).i(i, obj);
        }
        bga.a(this, i);
        return ((bfz) this.b).e(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a != 0 ? ((kc) this.b).b : ((bfz) this.b).b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (this.a != 0) {
            kd.b(this, i, i2);
            return new bfx(this, i, i2, 1);
        }
        bga.b(this, i, i2);
        return new bfx(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.a != 0 ? ykm.a(this) : ykm.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.a != 0 ? new bfy(this, i, 1, null) : new bfy(this, i, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (this.a != 0) {
            objArr.getClass();
            return ykm.b(this, objArr);
        }
        return ykm.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (this.a != 0) {
            collection.getClass();
            Object obj = this.b;
            if (i < 0 || i > ((kc) obj).b) {
                ((kc) obj).n(i);
            }
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            kc kcVar = (kc) obj;
            int size = kcVar.b + collection.size();
            Object[] objArr = kcVar.a;
            if (objArr.length < size) {
                kcVar.m(size, objArr);
            }
            Object[] objArr2 = kcVar.a;
            if (i != kcVar.b) {
                yfm.bj(objArr2, objArr2, collection.size() + i, i, kcVar.b);
            }
            for (T t : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    yfm.w();
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            kcVar.b += collection.size();
            return true;
        }
        return ((bfz) this.b).l(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (this.a != 0) {
            return ((kc) this.b).o(obj);
        }
        return ((bfz) this.b).n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        if (this.a != 0) {
            ((kc) this.b).p(obj);
            return true;
        }
        ((bfz) this.b).o(obj);
        return true;
    }
}

package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjo<T> implements List<T>, ylk {
    public int a;
    private final bje b;
    private final int c;
    private int d;

    public bjo(bje bjeVar, int i, int i2) {
        this.b = bjeVar;
        this.c = i;
        this.d = bjf.a(bjeVar);
        this.a = i2 - i;
    }

    private final void b() {
        if (bjf.a(this.b) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        bje bjeVar = this.b;
        Object objB = bjeVar.b(this.c + i);
        this.a--;
        this.d = bjf.a(bjeVar);
        return objB;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        b();
        bje bjeVar = this.b;
        bjeVar.add(this.c + i, t);
        this.a++;
        this.d = bjf.a(bjeVar);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        b();
        bje bjeVar = this.b;
        boolean zAddAll = bjeVar.addAll(i + this.c, collection);
        if (zAddAll) {
            this.a += collection.size();
            this.d = bjf.a(bjeVar);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.a > 0) {
            b();
            bje bjeVar = this.b;
            int i = this.c;
            bjeVar.e(i, this.a + i);
            this.a = 0;
            this.d = bjf.a(bjeVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        b();
        bjf.c(i, this.a);
        return (T) this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        yhf it = ykn.r(i, this.a + i).iterator();
        while (((ymc) it).a) {
            int iA = it.a();
            if (yks.e(obj, this.b.get(iA))) {
                return iA - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.c;
        for (int i2 = (this.a + i) - 1; i2 >= i; i2--) {
            if (yks.e(obj, this.b.get(i2))) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        bje bjeVar = this.b;
        int iA = bjeVar.a();
        do {
            synchronized (bjf.a) {
                bjm bjmVar = bjeVar.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgl bglVarJ = bgfVar.j();
            bglVarJ.subList(i2, i3).retainAll(collection);
            bgf bgfVarC = bglVarJ.c();
            if (yks.e(bgfVarC, bgfVar)) {
                break;
            }
            bjm bjmVar2 = bjeVar.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, bjeVar, bitVarB), i, bgfVarC, true);
            }
            bjb.t(bitVarB, bjeVar);
        } while (!zD);
        int iA2 = iA - bjeVar.a();
        if (iA2 > 0) {
            this.d = bjf.a(this.b);
            this.a -= iA2;
        }
        return iA2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        bjf.c(i, this.a);
        b();
        bje bjeVar = this.b;
        T t2 = (T) bjeVar.set(i + this.c, t);
        this.d = bjf.a(bjeVar);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            bcm.a("fromIndex or toIndex are out of bounds");
        }
        b();
        bje bjeVar = this.b;
        int i3 = this.c;
        return new bjo(bjeVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ykm.a(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        b();
        yld yldVar = new yld();
        yldVar.a = i - 1;
        return new bjn(yldVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) ykm.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        b();
        int i = this.c + this.a;
        bje bjeVar = this.b;
        bjeVar.add(i, t);
        this.a++;
        this.d = bjf.a(bjeVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.a, collection);
    }
}

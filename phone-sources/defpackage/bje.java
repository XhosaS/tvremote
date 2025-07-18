package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bje<T> implements Parcelable, List<T>, RandomAccess, bjk, ylk {
    public static final Parcelable.Creator<bje<Object>> CREATOR = new bjd();
    public bjm a;

    public bje() {
        this(bgp.a);
    }

    public final int a() {
        return bjf.b(this).a.size();
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i2 = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarC = bgfVar.c(i, t);
            if (yks.e(bgfVarC, bgfVar)) {
                return;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i2, bgfVarC, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return bjf.e(this, new aps(i, collection, 4));
    }

    public final Object b(int i) {
        int i2;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        T t = get(i);
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i2 = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarH = bgfVar.h(i);
            if (yks.e(bgfVarH, bgfVar)) {
                break;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i2, bgfVarH, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
        return t;
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        bit bitVarB;
        bjm bjmVar = this.a;
        bjmVar.getClass();
        synchronized (bjb.b) {
            bitVarB = bjb.b();
            bjj bjjVar = (bjj) bjb.l(bjmVar, this, bitVarB);
            synchronized (bjf.a) {
                bjjVar.a = bgp.a;
                bjjVar.b++;
                bjjVar.c++;
            }
        }
        bjb.t(bitVarB, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return bjf.b(this).a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return bjf.b(this).a.containsAll(collection);
    }

    @Override // defpackage.bjk
    public final /* synthetic */ bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i3 = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgl bglVarJ = bgfVar.j();
            bglVarJ.subList(i, i2).clear();
            bgf bgfVarC = bglVarJ.c();
            if (yks.e(bgfVarC, bgfVar)) {
                return;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i3, bgfVarC, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.n = this.a;
        bjmVar.getClass();
        this.a = (bjj) bjmVar;
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) bjf.b(this).a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return bjf.b(this).a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return bjf.b(this).a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new yhn(this, 0, 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return bjf.b(this).a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new yhn(this, 0, 1);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) b(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarF = bgfVar.f(collection);
            if (yks.e(bgfVarF, bgfVar)) {
                return false;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i, bgfVarF, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return bjf.e(this, new bap(collection, 11));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        T t2 = get(i);
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i2 = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarI = bgfVar.i(i, t);
            if (yks.e(bgfVarI, bgfVar)) {
                break;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i2, bgfVarI, false);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            bcm.a("fromIndex or toIndex are out of bounds");
        }
        return new bjo(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ykm.a(this);
    }

    public final String toString() {
        bjm bjmVar = this.a;
        bjmVar.getClass();
        return "SnapshotStateList(value=" + ((bjj) bjb.e(bjmVar)).a + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bgf bgfVar = bjf.b(this).a;
        int size = bgfVar.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(bgfVar.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarD = bgfVar.d(collection);
            if (yks.e(bgfVarD, bgfVar)) {
                return false;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i, bgfVarD, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new yhn(this, i, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarE = bgfVar.e(obj);
            if (yks.e(bgfVarE, bgfVar)) {
                return false;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i, bgfVarE, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) ykm.b(this, tArr);
    }

    public bje(bgf bgfVar) {
        bit bitVarB = bjb.b();
        bjj bjjVar = new bjj(bitVarB.v(), bgfVar);
        if (!(bitVarB instanceof bim)) {
            bjjVar.n = new bjj(1L, bgfVar);
        }
        this.a = bjjVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        bgf bgfVar;
        bit bitVarB;
        boolean zD;
        do {
            synchronized (bjf.a) {
                bjm bjmVar = this.a;
                bjmVar.getClass();
                bjj bjjVar = (bjj) bjb.e(bjmVar);
                i = bjjVar.b;
                bgfVar = bjjVar.a;
            }
            bgfVar.getClass();
            bgf bgfVarB = bgfVar.b(t);
            if (yks.e(bgfVarB, bgfVar)) {
                return false;
            }
            bjm bjmVar2 = this.a;
            bjmVar2.getClass();
            synchronized (bjb.b) {
                bitVarB = bjb.b();
                zD = bjf.d((bjj) bjb.l(bjmVar2, this, bitVarB), i, bgfVarB, true);
            }
            bjb.t(bitVarB, this);
        } while (!zD);
        return true;
    }
}

package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yzw extends yzq implements NavigableSet, SortedSet, zde {
    private static final long serialVersionUID = 912559;
    final transient Comparator b;
    transient yzw c;

    public yzw(Comparator comparator) {
        this.b = comparator;
    }

    static zcq A(Comparator comparator) {
        if (zbv.a.equals(comparator)) {
            return zcq.d;
        }
        int i = yyk.e;
        return new zcq(zcg.b, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: B */
    public abstract zdl descendingIterator();

    public abstract yzw a();

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return zag.l(z(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.zde
    public final Comparator comparator() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        yzw yzwVar = this.c;
        if (yzwVar != null) {
            return yzwVar;
        }
        yzw yzwVarA = a();
        this.c = yzwVarA;
        yzwVarA.c = this;
        return yzwVarA;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return zar.e(w(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        return w(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return zag.l(z(obj, false));
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract zdl iterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return zar.e(w(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        return z(obj, true);
    }

    public abstract yzw w(Object obj, boolean z);

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return new yzv(this.b, toArray(yxy.a));
    }

    @Override // java.util.NavigableSet
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final yzw subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        yqw.A(this.b.compare(obj, obj2) <= 0);
        return y(obj, z, obj2, z2);
    }

    public abstract yzw y(Object obj, boolean z, Object obj2, boolean z2);

    public abstract yzw z(Object obj, boolean z);

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return w(obj, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return z(obj, z);
    }
}

package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cae extends cab implements NavigableSet, SortedSet, cbg {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient cae b;

    public cae(Comparator comparator) {
        this.a = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static cbe y(Comparator comparator) {
        if (car.a.equals(comparator)) {
            return cbe.c;
        }
        int i = bzs.d;
        return new cbe(cax.a, comparator);
    }

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
        return biu.m(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.cbg
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        cae caeVar = this.b;
        if (caeVar != null) {
            return caeVar;
        }
        cae caeVarR = r();
        this.b = caeVarR;
        caeVarR.b = this;
        return caeVarR;
    }

    @Override // defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract cbj listIterator();

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return biu.j(headSet(obj, true).descendingIterator());
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    final int h(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return biu.m(tailSet(obj, false));
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return biu.j(headSet(obj, false).descendingIterator());
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

    public abstract cae r();

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final cae headSet(Object obj, boolean z) {
        obj.getClass();
        return t(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract cae t(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final cae subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        bdq.e(this.a.compare(obj, obj2) <= 0);
        return v(obj, z, obj2, z2);
    }

    public abstract cae v(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final cae tailSet(Object obj, boolean z) {
        obj.getClass();
        return x(obj, z);
    }

    @Override // defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return new cad(this.a, toArray());
    }

    public abstract cae x(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public abstract cbj descendingIterator();
}

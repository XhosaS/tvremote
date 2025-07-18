package defpackage;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zax extends AbstractList {
    public final List a;

    public zax(List list) {
        list.getClass();
        this.a = list;
    }

    private final int a(int i) {
        int size = size();
        yqw.al(i, size);
        return (size - 1) - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int size = size();
        yqw.am(i, size);
        this.a.add(size - i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(a(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int size = size();
        yqw.am(i, size);
        return new zaw(this, this.a.listIterator(size - i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.a.remove(a(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(a(i), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        yqw.K(i, i2, size());
        int size = size();
        yqw.am(i2, size);
        int i3 = size - i2;
        int size2 = size();
        yqw.am(i, size2);
        return Lists.b(this.a.subList(i3, size2 - i));
    }
}

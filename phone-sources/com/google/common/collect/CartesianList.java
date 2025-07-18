package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import defpackage.sij;
import defpackage.udo;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {
    private final transient ImmutableList<List<E>> axes;
    private final transient int[] axesSizeProduct;

    public CartesianList(ImmutableList<List<E>> immutableList) {
        this.axes = immutableList;
        int[] iArr = new int[immutableList.size() + 1];
        iArr[immutableList.size()] = 1;
        try {
            int size = immutableList.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.axesSizeProduct = iArr;
                    return;
                }
                iArr[size] = udo.c(iArr[size + 1], immutableList.get(size).size());
            }
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    static <E> List<List<E>> create(List<? extends List<? extends E>> list) {
        ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
        Iterator<? extends List<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) it.next());
            if (immutableListCopyOf.isEmpty()) {
                return ImmutableList.of();
            }
            builder.add((ImmutableList.Builder) immutableListCopyOf);
        }
        return new CartesianList(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAxisIndexForProductIndex(int i, int i2) {
        return (i / this.axesSizeProduct[i2 + 1]) % this.axes.get(i2).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != this.axes.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.axes.get(i).contains(it.next())) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public ImmutableList<E> get(final int i) {
        sij.B(i, size());
        return new ImmutableList<E>(this) { // from class: com.google.common.collect.CartesianList.1
            final /* synthetic */ CartesianList this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.util.List
            public E get(int i2) {
                sij.B(i2, size());
                CartesianList cartesianList = this.this$0;
                return (E) ((List) cartesianList.axes.get(i2)).get(cartesianList.getAxisIndexForProductIndex(i, i2));
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.this$0.axes.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.axes.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.axes.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i += iIndexOf * this.axesSizeProduct[iNextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.axes.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = this.axes.get(iNextIndex).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i += iLastIndexOf * this.axesSizeProduct[iNextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.axesSizeProduct[0];
    }
}

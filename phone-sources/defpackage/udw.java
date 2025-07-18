package defpackage;

import com.google.common.collect.ForwardingList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udw<E> extends ForwardingList<E> {
    final List a;

    public udw(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // com.google.common.collect.ForwardingList, java.util.List
    public final void add(int i, E e) {
        e.getClass();
        this.a.add(i, e);
    }

    @Override // com.google.common.collect.ForwardingList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.a.addAll(i, sfy.ag(collection));
    }

    @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingList, java.util.List
    public final ListIterator<E> listIterator() {
        return new udx(this.a.listIterator());
    }

    @Override // com.google.common.collect.ForwardingList, java.util.List
    public final E set(int i, E e) {
        e.getClass();
        return (E) this.a.set(i, e);
    }

    @Override // com.google.common.collect.ForwardingList, java.util.List
    public final List<E> subList(int i, int i2) {
        return new udw(this.a.subList(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* synthetic */ Collection delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new udx(this.a.listIterator(i));
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        e.getClass();
        return this.a.add(e);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(sfy.ag(collection));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final List<E> delegate() {
        return this.a;
    }
}

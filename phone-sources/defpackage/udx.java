package defpackage;

import com.google.common.collect.ForwardingListIterator;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udx<E> extends ForwardingListIterator<E> {
    private final ListIterator a;

    public udx(ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // com.google.common.collect.ForwardingListIterator, java.util.ListIterator
    public final void add(E e) {
        e.getClass();
        this.a.add(e);
    }

    @Override // com.google.common.collect.ForwardingListIterator, com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingListIterator, java.util.ListIterator
    public final void set(E e) {
        e.getClass();
        this.a.set(e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingListIterator, com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public final /* synthetic */ Iterator delegate() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingListIterator, com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
    public final ListIterator<E> delegate() {
        return this.a;
    }
}

package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yvb extends yuz implements ListIterator {
    final /* synthetic */ yvc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb(yvc yvcVar) {
        super(yvcVar);
        this.d = yvcVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        yvc yvcVar = this.d;
        boolean zIsEmpty = yvcVar.isEmpty();
        a();
        ((ListIterator) this.a).add(obj);
        yvcVar.f.b++;
        if (zIsEmpty) {
            yvcVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb(yvc yvcVar, int i) {
        super(yvcVar, ((List) yvcVar.b).listIterator(i));
        this.d = yvcVar;
    }
}

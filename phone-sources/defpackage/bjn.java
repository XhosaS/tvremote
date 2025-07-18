package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjn implements ListIterator, yli {
    final /* synthetic */ yld a;
    final /* synthetic */ bjo b;

    public bjn(yld yldVar, bjo bjoVar) {
        this.a = yldVar;
        this.b = bjoVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        bjf.f();
        throw new yfs();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        yld yldVar = this.a;
        int i = yldVar.a + 1;
        bjo bjoVar = this.b;
        bjf.c(i, bjoVar.a);
        yldVar.a = i;
        return bjoVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        yld yldVar = this.a;
        bjo bjoVar = this.b;
        int i = yldVar.a;
        bjf.c(i, bjoVar.a);
        yldVar.a = i - 1;
        return bjoVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        bjf.f();
        throw new yfs();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        bjf.f();
        throw new yfs();
    }
}

package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yuz implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ yva c;

    public yuz(yva yvaVar, Iterator it) {
        this.c = yvaVar;
        this.b = yvaVar.b;
        this.a = it;
    }

    final void a() {
        yva yvaVar = this.c;
        yvaVar.b();
        if (yvaVar.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        yva yvaVar = this.c;
        yve yveVar = yvaVar.e;
        yveVar.b--;
        yvaVar.c();
    }

    public yuz(yva yvaVar) {
        this.c = yvaVar;
        this.b = yvaVar.b;
        Collection collection = yvaVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}

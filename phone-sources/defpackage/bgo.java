package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgo<E> extends bgh<E> {
    private final Object c;

    public bgo(Object obj, int i) {
        super(i, 1);
        this.c = obj;
    }

    @Override // defpackage.bgh, java.util.ListIterator, java.util.Iterator
    public final E next() {
        a();
        this.a++;
        return (E) this.c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        b();
        this.a--;
        return (E) this.c;
    }
}

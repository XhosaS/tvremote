package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuy implements Iterator {
    private Object a;
    private int b = -2;

    private final void a() {
        Integer numA;
        if (this.b == -2) {
            numA = lc.a();
        } else {
            this.a.getClass();
            numA = lc.a();
        }
        this.a = numA;
        this.b = numA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < 0) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        obj.getClass();
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ii.U();
    }
}

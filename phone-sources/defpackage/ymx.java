package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymx<T> extends ymy<T> implements Iterator<T>, yih, yli {
    public yih a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.cf(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.ymy
    public final Object a(Object obj, yih yihVar) {
        this.c = obj;
        this.b = 3;
        this.a = yihVar;
        return yio.a;
    }

    @Override // defpackage.ymy
    public final Object b(Iterator it, yih yihVar) {
        if (!it.hasNext()) {
            return ygi.a;
        }
        this.d = it;
        this.b = 2;
        this.a = yihVar;
        return yio.a;
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return yim.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            yih yihVar = this.a;
            yihVar.getClass();
            this.a = null;
            yihVar.resumeWith(ygi.a);
        }
    }

    @Override // java.util.Iterator
    public final T next() throws Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return (T) it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        T t = (T) this.c;
        this.c = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        ybn.f(obj);
        this.b = 4;
    }
}

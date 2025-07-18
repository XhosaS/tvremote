package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agxt extends agxu implements Iterator, agsw {
    public agsw a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.b(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.agxu
    public final Object a(Object obj, agsw agswVar) {
        this.c = obj;
        this.b = 3;
        this.a = agswVar;
        return agtg.a;
    }

    @Override // defpackage.agxu
    public final Object b(Iterator it, agsw agswVar) {
        if (!it.hasNext()) {
            return agpu.a;
        }
        this.d = it;
        this.b = 2;
        this.a = agswVar;
        return agtg.a;
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        agpl.b(obj);
        this.b = 4;
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return agtf.a;
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
            agsw agswVar = this.a;
            agswVar.getClass();
            this.a = null;
            agswVar.e(agpu.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
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
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

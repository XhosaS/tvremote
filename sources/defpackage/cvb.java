package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvb extends cvc implements Iterator, csv {
    public csv a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable e() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(b.e(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.cvc
    public final Object a(Object obj, csv csvVar) {
        this.c = obj;
        this.b = 3;
        this.a = csvVar;
        return ctc.a;
    }

    @Override // defpackage.csv
    public final cta b() {
        return ctb.a;
    }

    @Override // defpackage.csv
    public final void c(Object obj) throws Throwable {
        dnx.bf(obj);
        this.b = 4;
    }

    @Override // defpackage.cvc
    public final Object d(Iterator it, csv csvVar) {
        if (!it.hasNext()) {
            return cse.a;
        }
        this.d = it;
        this.b = 2;
        this.a = csvVar;
        return ctc.a;
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
                    throw e();
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
            csv csvVar = this.a;
            csvVar.getClass();
            this.a = null;
            csvVar.c(cse.a);
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
            throw e();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ii.U();
    }
}

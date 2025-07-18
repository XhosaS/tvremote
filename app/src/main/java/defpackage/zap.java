package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zap implements Iterator {
    private final Iterator a;
    private boolean b;
    private Object c;

    public zap(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public final Object a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        yqw.M(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}

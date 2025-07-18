package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxm implements Iterator {
    final /* synthetic */ agxn a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    public agxm(agxn agxnVar) {
        this.a = agxnVar;
        this.b = agxnVar.a.a();
    }

    private final void a() {
        int i;
        while (true) {
            Iterator it = this.b;
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            Object next = it.next();
            agxn agxnVar = this.a;
            if (((Boolean) agxnVar.c.a(next)).booleanValue() == agxnVar.b) {
                this.d = next;
                i = 1;
                break;
            }
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.d;
        this.d = null;
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

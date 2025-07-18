package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yna implements Iterator, yli {
    final /* synthetic */ Object a;
    private final Iterator b;
    private int c = -1;
    private Object d;
    private final /* synthetic */ int e;

    public yna(ymu ymuVar, int i) {
        this.e = i;
        this.a = ymuVar;
        this.b = ymuVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yjv] */
    private final void a() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((ynb) this.a).b.a(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    private final void b() {
        int i;
        while (true) {
            Iterator it = this.b;
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            Object next = it.next();
            ymu ymuVar = (ymu) this.a;
            if (((Boolean) ymuVar.c.a(next)).booleanValue() == ymuVar.b) {
                this.d = next;
                i = 1;
                break;
            }
        }
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e != 0) {
            if (this.c == -1) {
                b();
            }
            return this.c == 1;
        }
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e != 0) {
            if (this.c == -1) {
                b();
            }
            if (this.c == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.d;
            this.d = null;
            this.c = -1;
            return obj;
        }
        if (this.c == -1) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.d;
        this.d = null;
        this.c = -1;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.e == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ymw] */
    public yna(ynb ynbVar, int i) {
        this.e = i;
        this.a = ynbVar;
        this.b = ynbVar.a.a();
    }
}

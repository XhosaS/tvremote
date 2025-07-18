package j$.util;

import j$.nio.file.C0044s;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0075j implements Iterator, s {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C0075j(C0076k c0076k) {
        this.b = c0076k.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.s
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.desugar.sun.nio.fs.g.v(this.b, consumer);
                break;
            default:
                j$.desugar.sun.nio.fs.g.v(this.b, new C0044s(consumer, 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0079n((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0075j(C0080o c0080o) {
        this.b = c0080o.a.iterator();
    }
}

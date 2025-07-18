package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0103k implements Iterator, InterfaceC0164v {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C0103k(C0104l c0104l) {
        this.b = c0104l.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0164v
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.desugar.sun.nio.fs.g.v(this.b, consumer);
                break;
            default:
                j$.desugar.sun.nio.fs.g.v(this.b, new j$.nio.file.r(consumer, 2));
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
                return new C0107o((Map.Entry) this.b.next());
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

    public C0103k(C0108p c0108p) {
        this.b = c0108p.a.iterator();
    }
}

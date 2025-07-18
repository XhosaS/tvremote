package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class f implements Iterator, q {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public f(g gVar) {
        this.b = gVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.q
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.nio.file.attribute.a.z(this.b, consumer);
                break;
            default:
                j$.nio.file.attribute.a.z(this.b, new j(consumer, 0));
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
                return new k((Map.Entry) this.b.next());
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

    public f(m mVar) {
        this.b = mVar.a.iterator();
    }
}

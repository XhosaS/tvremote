package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0046u implements Iterable, j$.lang.a {
    public final Iterable a;

    public C0046u(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new C0044s(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return new j$.time.format.n(iterator());
    }
}

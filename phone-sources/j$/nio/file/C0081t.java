package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0081t implements Iterable, j$.lang.a {
    public final Iterable a;

    public C0081t(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new r(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }
}

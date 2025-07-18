package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0045t implements DirectoryStream, j$.lang.a {
    public final DirectoryStream a;

    public C0045t(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new C0044s(consumer, 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new v(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return new j$.time.format.n(iterator());
    }
}

package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0080s implements DirectoryStream, j$.lang.a {
    public final DirectoryStream a;

    public C0080s(DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new r(consumer, 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }
}

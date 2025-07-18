package java.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    public interface Filter<T> {
        /* renamed from: accept */
        boolean mo115accept(T t) throws IOException;
    }

    Iterator<T> iterator();
}

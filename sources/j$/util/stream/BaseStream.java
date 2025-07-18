package j$.util.stream;

import j$.util.stream.BaseStream;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    Iterator<T> iterator();
}

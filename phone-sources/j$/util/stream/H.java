package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public interface H {
    H a(int i);

    long count();

    void forEach(Consumer consumer);

    void m(Object[] objArr, int i);

    Object[] p(IntFunction intFunction);

    Spliterator spliterator();

    int t();
}

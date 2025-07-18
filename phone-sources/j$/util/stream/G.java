package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes4.dex */
public interface G extends H {
    @Override // j$.util.stream.H
    G a(int i);

    Object b();

    void h(int i, Object obj);

    void i(Object obj);

    Object newArray(int i);

    @Override // j$.util.stream.H
    Spliterator.OfPrimitive spliterator();
}

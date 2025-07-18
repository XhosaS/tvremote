package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class x extends j$.nio.file.attribute.a {
    @Override // j$.nio.file.attribute.a
    public final y H() {
        return new A();
    }

    @Override // j$.nio.file.attribute.a, j$.util.stream.N
    public final Object a(F f, Spliterator spliterator) {
        return K.SIZED.k(f.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(f, spliterator);
    }

    @Override // j$.nio.file.attribute.a, j$.util.stream.N
    public final Object d(F f, Spliterator spliterator) {
        return K.SIZED.k(f.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.d(f, spliterator);
    }

    @Override // j$.util.stream.N
    public final int f() {
        return K.o;
    }
}

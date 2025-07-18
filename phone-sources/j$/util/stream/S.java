package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public final class S extends I {
    @Override // j$.util.stream.H
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.H
    public final void m(Object[] objArr, int i) {
        objArr.getClass();
        H h = this.a;
        h.m(objArr, i);
        this.b.m(objArr, i + ((int) h.count()));
    }

    @Override // j$.util.stream.H
    public final Object[] p(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        m(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return new C0120e0(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}

package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public final class F extends G {
    public final Object[] h;

    public F(Spliterator spliterator, AbstractC0083a abstractC0083a, Object[] objArr) {
        super(spliterator, abstractC0083a, objArr.length);
        this.h = objArr;
    }

    @Override // j$.util.stream.G
    public final G a(Spliterator spliterator, long j, long j2) {
        return new F(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public F(F f, Spliterator spliterator, long j, long j2) {
        super(f, spliterator, j, j2, f.h.length);
        this.h = f.h;
    }
}

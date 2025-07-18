package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0136m0 extends AbstractC0138n0 {
    public final Object[] h;

    public C0136m0(Spliterator spliterator, AbstractC0111a abstractC0111a, Object[] objArr) {
        super(spliterator, abstractC0111a, objArr.length);
        this.h = objArr;
    }

    @Override // j$.util.stream.AbstractC0138n0
    public final AbstractC0138n0 a(Spliterator spliterator, long j, long j2) {
        return new C0136m0(this, spliterator, j, j2);
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

    public C0136m0(C0136m0 c0136m0, Spliterator spliterator, long j, long j2) {
        super(c0136m0, spliterator, j, j2, c0136m0.h.length);
        this.h = c0136m0.h;
    }
}

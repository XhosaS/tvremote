package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class q extends r {
    public final Object[] h;

    public q(Spliterator spliterator, F f, Object[] objArr) {
        super(spliterator, f, objArr.length);
        this.h = objArr;
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

    public q(q qVar, Spliterator spliterator, long j, long j2) {
        super(qVar, spliterator, j, j2, qVar.h.length);
        this.h = qVar.h;
    }
}

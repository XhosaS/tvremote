package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class j1 extends c1 {
    @Override // j$.util.stream.c1
    public final void d() {
        Y0 y0 = new Y0();
        this.h = y0;
        this.e = this.b.o(new j$.desugar.sun.nio.fs.h(17, y0));
        this.f = new j$.desugar.sun.nio.fs.h(18, this);
    }

    @Override // j$.util.stream.c1
    public final c1 e(Spliterator spliterator) {
        return new j1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        j$.nio.file.r rVar = new j$.nio.file.r(consumer, 3);
        this.b.n(this.d, rVar);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        Y0 y0 = (Y0) this.h;
        long j = this.g;
        if (y0.b != 0) {
            if (j >= y0.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= y0.b; i++) {
                long j2 = y0.c[i];
                Object[] objArr = y0.e[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= y0.a) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = y0.d[(int) j];
        consumer.accept(obj);
        return zA;
    }
}

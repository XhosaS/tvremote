package j$.util.stream;

import j$.nio.file.C0044s;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class p0 extends m0 {
    @Override // j$.util.stream.m0
    public final void d() {
        i0 i0Var = new i0();
        this.h = i0Var;
        this.e = this.b.m(new j$.desugar.sun.nio.fs.h(10, i0Var));
        this.f = new j$.desugar.sun.nio.fs.h(11, this);
    }

    @Override // j$.util.stream.m0
    public final m0 e(Spliterator spliterator) {
        return new p0(this.b, spliterator, this.a);
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
        C0044s c0044s = new C0044s(consumer, 4);
        this.b.l(this.d, c0044s);
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
        i0 i0Var = (i0) this.h;
        long j = this.g;
        if (i0Var.b != 0) {
            if (j >= i0Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= i0Var.b; i++) {
                long j2 = i0Var.c[i];
                Object[] objArr = i0Var.e[i];
                if (j < objArr.length + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= i0Var.a) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        obj = i0Var.d[(int) j];
        consumer.accept(obj);
        return zA;
    }
}

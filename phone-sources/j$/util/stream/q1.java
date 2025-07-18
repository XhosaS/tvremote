package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class q1 extends l1 implements Consumer {
    public Object b;
    public Y0 c;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                Y0 y0 = new Y0();
                this.c = y0;
                y0.accept(this.b);
                this.a++;
            }
            this.c.accept(obj);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }
}

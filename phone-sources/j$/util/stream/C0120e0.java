package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0120e0 extends AbstractC0122f0 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            H hA = AbstractC0122f0.a(arrayDequeB);
            if (hA == null) {
                this.a = null;
                return;
            }
            hA.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        H hA;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (hA = AbstractC0122f0.a(this.e)) != null) {
                Spliterator spliterator = hA.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }
}

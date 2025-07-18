package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0122f0 implements Spliterator {
    public H a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    public AbstractC0122f0(H h) {
        this.a = h;
    }

    public static H a(ArrayDeque arrayDeque) {
        while (true) {
            H h = (H) arrayDeque.pollFirst();
            if (h == null) {
                return null;
            }
            if (h.t() != 0) {
                for (int iT = h.t() - 1; iT >= 0; iT--) {
                    arrayDeque.addFirst(h.a(iT));
                }
            } else if (h.count() > 0) {
                return h;
            }
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iT = this.a.t();
        while (true) {
            iT--;
            if (iT < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iT));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        ArrayDeque arrayDequeB = b();
        this.e = arrayDequeB;
        H hA = a(arrayDequeB);
        if (hA != null) {
            this.d = hA.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.t(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        H h = this.a;
        if (h == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < h.t() - 1) {
            H h2 = this.a;
            int i = this.b;
            this.b = i + 1;
            return h2.a(i).spliterator();
        }
        H hA = this.a.a(this.b);
        this.a = hA;
        if (hA.t() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        H h3 = this.a;
        this.b = 1;
        return h3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfPrimitive) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) trySplit();
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public abstract class g0 implements j$.util.F {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ f0 f;

    public g0(f0 f0Var, int i, int i2, int i3, int i4) {
        this.f = f0Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = f0Var.e;
        this.e = objArr == null ? f0Var.d : objArr[i];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.c;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.F
    public final void forEachRemaining(Object obj) {
        f0 f0Var;
        obj.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                f0Var = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = f0Var.e[i];
                f0Var.q(obj2, i4, ((int[]) obj2).length, obj);
                i++;
                i4 = 0;
            }
            f0Var.q(this.a == i3 ? this.e : f0Var.e[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.desugar.sun.nio.fs.g.h(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.desugar.sun.nio.fs.g.j(this, i);
    }

    @Override // j$.util.F
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        ((IntConsumer) obj).accept(((int[]) obj2)[i3]);
        if (this.c == ((int[]) this.e).length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[] objArr = this.f.e;
            if (objArr != null && i4 <= i2) {
                this.e = objArr[i4];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.F trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            f0 f0Var = this.f;
            e0 e0Var = new e0(((e0) this).g, i, i3, i4, ((int[]) f0Var.e[i3]).length);
            this.a = i2;
            this.c = 0;
            this.e = f0Var.e[i2];
            return e0Var;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        Spliterator.OfInt ofIntSpliterator = Spliterators.spliterator((int[]) this.e, i5, i5 + i6, 1040);
        this.c += i6;
        return ofIntSpliterator;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.F, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }
}

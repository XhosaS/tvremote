package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class H implements Spliterator {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object[] e;
    public final /* synthetic */ I f;

    public H(I i, int i2, int i3, int i4, int i5) {
        this.f = i;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        Object[][] objArr = i.e;
        this.e = objArr == null ? i.d : objArr[i2];
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.n(this, 16384);
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

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        I i;
        consumer.getClass();
        int i2 = this.a;
        int i3 = this.d;
        int i4 = this.b;
        if (i2 < i4 || (i2 == i4 && this.c < i3)) {
            int i5 = this.c;
            while (true) {
                i = this.f;
                if (i2 >= i4) {
                    break;
                }
                Object[] objArr = i.e[i2];
                while (i5 < objArr.length) {
                    consumer.accept(objArr[i5]);
                    i5++;
                }
                i2++;
                i5 = 0;
            }
            Object[] objArr2 = this.a == i4 ? this.e : i.e[i4];
            while (i5 < i3) {
                consumer.accept(objArr2[i5]);
                i5++;
            }
            this.a = i4;
            this.c = i3;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.nio.file.attribute.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.e;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            I i5 = this.f;
            H h = new H(i5, i, i3, i4, i5.e[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = i5.e[i2];
            return h;
        }
        if (i != i2) {
            return null;
        }
        int i6 = this.c;
        int i7 = (this.d - i6) / 2;
        if (i7 == 0) {
            return null;
        }
        j$.util.t tVarA = Spliterators.a(this.e, i6, i6 + i7, 1040);
        this.c += i7;
        return tVarA;
    }
}

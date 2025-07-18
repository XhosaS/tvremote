package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public class f0 extends h0 implements IntConsumer {
    public f0() {
        this.d = new int[16];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        long length;
        int i2 = this.a;
        Object obj = this.d;
        if (i2 == ((int[]) obj).length) {
            if (this.e == null) {
                int[][] iArr = new int[8][];
                this.e = iArr;
                this.c = new long[8];
                iArr[0] = obj;
            }
            int i3 = this.b;
            int i4 = i3 + 1;
            Object[] objArr = this.e;
            if (i4 >= objArr.length || objArr[i4] == null) {
                if (i3 == 0) {
                    length = ((int[]) obj).length;
                } else {
                    length = ((int[]) objArr[i3]).length + this.c[i3];
                }
                r(length + 1);
            }
            this.a = 0;
            int i5 = this.b + 1;
            this.b = i5;
            this.d = this.e[i5];
        }
        int[] iArr2 = (int[]) this.d;
        int i6 = this.a;
        this.a = i6 + 1;
        iArr2[i6] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.desugar.sun.nio.fs.g.a(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            t((IntConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.e((e0) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j$.util.J(spliterator());
    }

    @Override // j$.util.stream.h0
    public final void q(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfInt spliterator() {
        return new e0(this, 0, this.b, 0, this.a);
    }
}

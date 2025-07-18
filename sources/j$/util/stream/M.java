package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class M implements Spliterator {
    public final boolean a;
    public final F b;
    public j$.time.format.s c;
    public Spliterator d;
    public G e;
    public j$.time.format.s f;
    public long g;
    public I h;
    public boolean i;

    public M(F f, j$.time.format.s sVar, boolean z) {
        this.b = f;
        this.c = sVar;
        this.d = null;
        this.a = z;
    }

    public final boolean a() {
        while (this.h.count() == 0) {
            if (this.e.c() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.n(this, 16384);
    }

    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.b.f;
        int i2 = i & ((~i) >> 1) & K.j & K.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
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
        this.b.g(new j$.util.j(consumer, 1), this.d);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.nio.file.attribute.a.n(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (K.SIZED.k(this.b.f)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final String toString() {
        return String.format("%s[%s]", M.class.getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zA;
        Object obj;
        consumer.getClass();
        I i = this.h;
        if (i != null) {
            long j = this.g + 1;
            this.g = j;
            zA = j < i.count();
            if (!zA) {
                this.g = 0L;
                this.h.clear();
                zA = a();
            }
        } else if (this.i) {
            zA = false;
        } else {
            c();
            I i2 = new I();
            this.h = i2;
            G gH = this.b.h(new j$.time.format.s(8, i2));
            this.e = gH;
            this.f = new j$.time.format.s(9, this);
            this.g = 0L;
            gH.b(this.d.getExactSizeIfKnown());
            zA = a();
        }
        if (!zA) {
            return zA;
        }
        I i3 = this.h;
        long j2 = this.g;
        if (i3.b != 0) {
            if (j2 >= i3.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            for (int i4 = 0; i4 <= i3.b; i4++) {
                long j3 = i3.c[i4];
                Object[] objArr = i3.e[i4];
                if (j2 < objArr.length + j3) {
                    obj = objArr[(int) (j2 - j3)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        if (j2 >= i3.a) {
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        obj = i3.d[(int) j2];
        consumer.accept(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        boolean z = this.a;
        if (!z || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new M(this.b, spliteratorTrySplit, z);
    }

    public M(F f, Spliterator spliterator, boolean z) {
        this.b = f;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}

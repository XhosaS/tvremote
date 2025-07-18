package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0126h0 extends C0124g0 implements C, J0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.C
    public final H build() {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.K0
    public final void d(long j) {
        long[] jArr = this.a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.K0
    public final void end() {
        int i = this.b;
        long[] jArr = this.a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void n(Long l) {
        AbstractC0153v0.i(this, l);
    }

    @Override // j$.util.stream.C0124g0
    public final String toString() {
        long[] jArr = this.a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.K0
    public final void accept(long j) {
        int i = this.b;
        long[] jArr = this.a;
        if (i < jArr.length) {
            this.b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }
}

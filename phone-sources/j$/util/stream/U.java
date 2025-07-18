package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final class U extends T implements C, H0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.C
    public final H build() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.K0
    public final void d(long j) {
        double[] dArr = this.a;
        if (j != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.K0
    public final void end() {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void r(Double d) {
        AbstractC0153v0.e(this, d);
    }

    @Override // j$.util.stream.T
    public final String toString() {
        double[] dArr = this.a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        r((Double) obj);
    }

    @Override // j$.util.stream.K0
    public final void accept(double d) {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            this.b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }
}

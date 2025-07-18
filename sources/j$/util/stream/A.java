package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class A extends z implements y {
    public long b;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.stream.z
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public final void b(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // j$.util.stream.y
    public final void e(y yVar) {
        this.b += ((A) yVar).b;
    }

    @Override // j$.util.stream.z, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.z, j$.util.stream.G
    public final /* synthetic */ void end() {
    }
}

package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class z implements G {
    public Object a;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.G
    public void b(long j) {
        ((G) this.a).b(j);
    }

    @Override // j$.util.stream.G
    public boolean c() {
        return ((G) this.a).c();
    }

    @Override // j$.util.stream.G
    public void end() {
        ((G) this.a).end();
    }

    public Object get() {
        return this.a;
    }
}

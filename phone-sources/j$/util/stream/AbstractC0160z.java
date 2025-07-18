package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0160z implements K0 {
    public boolean a;
    public boolean b;

    public AbstractC0160z(A a) {
        this.b = !a.b;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void d(long j) {
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.K0
    public final boolean g() {
        return this.a;
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }
}

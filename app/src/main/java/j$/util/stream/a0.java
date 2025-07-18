package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class a0 implements c0 {
    public final c0 a;

    public a0(c0 c0Var) {
        c0Var.getClass();
        this.a = c0Var;
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void accept(int i) {
        L.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c0
    public void d(long j) {
        this.a.d(j);
    }

    @Override // j$.util.stream.c0
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.c0
    public boolean g() {
        return this.a.g();
    }
}

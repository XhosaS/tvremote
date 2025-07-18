package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yya extends ypw implements Executor {
    public static final yya a = new yya();
    private static final yot b = yyg.a.g(wae.O("kotlinx.coroutines.io.parallelism", ykn.j(64, yxp.a), 0, 0, 12));

    private yya() {
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        b.a(yilVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(yim.a, runnable);
    }

    @Override // defpackage.yot
    public final void f(yil yilVar, Runnable runnable) {
        b.f(yilVar, runnable);
    }

    @Override // defpackage.yot
    public final yot g(int i) {
        return yyg.a.g(1);
    }

    @Override // defpackage.yot
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.ypw
    public final Executor e() {
        return this;
    }
}

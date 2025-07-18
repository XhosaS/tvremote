package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmy extends ahdb implements Executor {
    public static final ahbm a;

    static {
        new ahmy();
        ahbm ahlqVar = ahnf.a;
        int i = ahmi.a;
        if (i <= 64) {
            i = 64;
        }
        int iC = ahmj.c("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        ahlr.a(iC);
        if (iC < ahne.d) {
            ahlr.a(iC);
            ahlqVar = new ahlq(ahlqVar, iC);
        }
        a = ahlqVar;
    }

    private ahmy() {
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        a.a(agteVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a.a(agtf.a, runnable);
    }

    @Override // defpackage.ahbm
    public final void f(agte agteVar, Runnable runnable) {
        a.f(agteVar, runnable);
    }

    @Override // defpackage.ahbm
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.ahdb
    public final Executor e() {
        return this;
    }
}

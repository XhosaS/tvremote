package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vrc implements Runnable {
    public zvh a;
    public Executor b;

    public vrc(zvh zvhVar, Executor executor) {
        this.a = zvhVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}

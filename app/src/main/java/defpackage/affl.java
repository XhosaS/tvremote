package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class affl implements Runnable {
    final affj a;
    public final affp b;
    private final Executor c;

    public affl(Executor executor, affj affjVar, affp affpVar) {
        this.c = executor;
        this.a = affjVar;
        this.b = affpVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            affp.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}

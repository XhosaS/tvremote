package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwo {
    private static final zyc c = new zyc(zwo.class);
    public zwn a;
    public boolean b;

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        synchronized (this) {
            if (this.b) {
                b(runnable, executor);
            } else {
                this.a = new zwn(runnable, executor, this.a);
            }
        }
    }
}

package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhl implements uhp {
    public static final uhp a = new uhl(null);
    private static final uho c = new uho(uhl.class);
    public final Object b;

    public uhl(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.b;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.b;
    }
}

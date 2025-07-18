package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugv extends uhi {
    private final uhp a;

    public ugv(uhp uhpVar) {
        uhpVar.getClass();
        this.a = uhpVar;
    }

    @Override // defpackage.ufb, defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.ufb, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.ufb, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.ufb, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.ufb, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.ufb
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.ufb, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}

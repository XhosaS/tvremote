package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cij extends cit {
    private final cja a;

    public cij(cja cjaVar) {
        cjaVar.getClass();
        this.a = cjaVar;
    }

    @Override // defpackage.cgx, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.cgx, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.cgx, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.cgx, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.cgx, defpackage.cja
    public final void m(Runnable runnable, Executor executor) {
        this.a.m(runnable, executor);
    }

    @Override // defpackage.cgx
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.cgx, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}

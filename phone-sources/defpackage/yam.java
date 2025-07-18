package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yam implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new xtn(xtk.c(th).e("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}

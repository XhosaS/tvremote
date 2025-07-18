package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xya implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ xyr a;

    public xya(xyr xyrVar) {
        this.a = xyrVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = xyr.a;
        Level level = Level.SEVERE;
        xyr xyrVar = this.a;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(xyrVar.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (xyrVar.u) {
                return;
            }
            xyrVar.u = true;
            try {
                xyrVar.e(true);
                xyrVar.i(false);
            } finally {
                xyrVar.j(new xro(xrr.a(xtk.j.e("Panic! This is a bug!").d(th))));
                xyrVar.H.d(null);
                xyrVar.F.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                xyrVar.o.a(xqk.TRANSIENT_FAILURE);
            }
        } catch (Throwable th2) {
            xyr xyrVar2 = this.a;
            xyr.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(xyrVar2.h) + "] Uncaught exception while panicking", th2);
        }
    }
}

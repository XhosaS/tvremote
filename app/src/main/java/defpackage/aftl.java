package defpackage;

import io.grpc.Status;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aftl implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ afun a;

    public aftl(afun afunVar) {
        this.a = afunVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = afun.a;
        Level level = Level.SEVERE;
        afun afunVar = this.a;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(afunVar.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (afunVar.w) {
                return;
            }
            afunVar.w = true;
            try {
                afunVar.W.b(true);
                afunVar.k(false);
            } finally {
                afunVar.A.a(new afhd(afhg.a(Status.k.withDescription("Panic! This is a bug!").c(th))));
                afunVar.L.d(null);
                afunVar.J.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                afunVar.p.a(affe.TRANSIENT_FAILURE);
            }
        } catch (Throwable th2) {
            afun afunVar2 = this.a;
            afun.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(afunVar2.h) + "] Uncaught exception while panicking", th2);
        }
    }
}

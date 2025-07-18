package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affh implements Runnable {
    final /* synthetic */ affi a;

    public affh(affi affiVar) {
        this.a = affiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.j(new TimeoutException("context timed out"));
        } catch (Throwable th) {
            affp.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
        }
    }
}

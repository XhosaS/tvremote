package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsc {
    public static final String a = gpn.a("WorkerWrapper");

    public static final Object a(uhp uhpVar, gpm gpmVar, yih yihVar) {
        try {
            if (uhpVar.isDone()) {
                return b(uhpVar);
            }
            yof yofVar = new yof(wcq.S(yihVar), 1);
            yofVar.v();
            uhpVar.c(new gqz(uhpVar, (yoe) yofVar, 0), gpc.a);
            yofVar.b(new bbs(gpmVar, uhpVar, 3));
            return yofVar.i();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}

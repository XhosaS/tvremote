package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjn implements Runnable {
    cjp a;

    public cjn(cjp cjpVar) {
        this.a = cjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cja cjaVar;
        cjp cjpVar = this.a;
        if (cjpVar == null || (cjaVar = cjpVar.a) == null) {
            return;
        }
        this.a = null;
        if (cjaVar.isDone()) {
            cjpVar.e(cjaVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = cjpVar.b;
            cjpVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    cjpVar.d(new cjo(str));
                    throw th;
                }
            }
            cjpVar.d(new cjo(str + ": " + cjaVar.toString()));
        } finally {
            cjaVar.cancel(true);
        }
    }
}

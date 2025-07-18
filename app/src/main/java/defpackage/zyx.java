package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyx implements Runnable {
    zyz a;

    public zyx(zyz zyzVar) {
        this.a = zyzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zyd zydVar;
        zyz zyzVar = this.a;
        if (zyzVar == null || (zydVar = zyzVar.a) == null) {
            return;
        }
        this.a = null;
        if (zydVar.isDone()) {
            zyzVar.eZ(zydVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zyzVar.b;
            zyzVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zyzVar.q(new zyy(str));
                    throw th;
                }
            }
            zyzVar.q(new zyy(str + ": " + zydVar.toString()));
        } finally {
            zydVar.cancel(true);
        }
    }
}

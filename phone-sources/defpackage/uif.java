package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uif implements Runnable {
    uih a;

    public uif(uih uihVar) {
        this.a = uihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uhp uhpVar;
        uih uihVar = this.a;
        if (uihVar == null || (uhpVar = uihVar.a) == null) {
            return;
        }
        this.a = null;
        if (uhpVar.isDone()) {
            uihVar.ev(uhpVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = uihVar.b;
            uihVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    uihVar.e(new uig(str));
                    throw th;
                }
            }
            uihVar.e(new uig(str + ": " + uhpVar.toString()));
        } finally {
            uhpVar.cancel(true);
        }
    }
}

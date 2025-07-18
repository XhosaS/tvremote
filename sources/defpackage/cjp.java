package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjp extends cii {
    public cja a;
    public ScheduledFuture b;

    public cjp(cja cjaVar) {
        this.a = cjaVar;
    }

    @Override // defpackage.cgx
    protected final String a() {
        cja cjaVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (cjaVar == null) {
            return null;
        }
        String strI = b.i(cjaVar, "inputFuture=[", "]");
        if (scheduledFuture == null) {
            return strI;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strI;
        }
        return strI + ", remaining delay=[" + delay + " ms]";
    }

    @Override // defpackage.cgx
    protected final void b() {
        p(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}

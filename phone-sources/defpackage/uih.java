package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uih extends ugt {
    public uhp a;
    public ScheduledFuture b;

    public uih(uhp uhpVar) {
        uhpVar.getClass();
        this.a = uhpVar;
    }

    @Override // defpackage.ufb
    protected final void d() {
        p(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.ufb
    protected final String dw() {
        uhp uhpVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (uhpVar == null) {
            return null;
        }
        String strCh = a.ch(uhpVar, "inputFuture=[", "]");
        if (scheduledFuture == null) {
            return strCh;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strCh;
        }
        return strCh + ", remaining delay=[" + delay + " ms]";
    }
}

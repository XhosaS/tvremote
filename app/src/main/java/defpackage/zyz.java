package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyz extends zww {
    public zyd a;
    public ScheduledFuture b;

    public zyz(zyd zydVar) {
        zydVar.getClass();
        this.a = zydVar;
    }

    @Override // defpackage.zum
    protected final String a() {
        zyd zydVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (zydVar == null) {
            return null;
        }
        String strT = a.t(zydVar, "inputFuture=[", "]");
        if (scheduledFuture == null) {
            return strT;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strT;
        }
        return strT + ", remaining delay=[" + delay + " ms]";
    }

    @Override // defpackage.zum
    protected final void b() {
        n(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}

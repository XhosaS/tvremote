package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjf extends cil implements ScheduledFuture, cja {
    private final ScheduledFuture b;

    public cjf(cja cjaVar, ScheduledFuture scheduledFuture) {
        super(cjaVar);
        this.b = scheduledFuture;
    }

    @Override // defpackage.cik, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.a.cancel(z);
        if (zCancel) {
            this.b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }
}

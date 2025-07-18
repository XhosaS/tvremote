package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aakd extends xn implements ScheduledFuture {
    private final ScheduledFuture d;

    public aakd(aakc aakcVar) {
        this.d = aakcVar.a(new aakb(this));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.d.compareTo(delayed);
    }

    @Override // defpackage.xn
    protected final void e() {
        Object obj = this.value;
        boolean z = false;
        if ((obj instanceof xe) && ((xe) obj).c) {
            z = true;
        }
        this.d.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }
}

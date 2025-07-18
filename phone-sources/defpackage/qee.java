package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qee extends ugx implements uhr {
    public volatile uhr a;

    public qee(uhp uhpVar, uhr uhrVar) {
        super(uhpVar);
        this.a = uhrVar;
        uhpVar.c(new pqi(this, 8), ugk.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

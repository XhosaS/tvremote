package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axg {
    private static final axf g = new axf() { // from class: axd
        @Override // defpackage.axf
        public final void a(int i, String str) {
        }
    };
    public final cov a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile axf d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public axg(asq asqVar, cjd cjdVar, Executor executor, cov covVar) {
        this.a = covVar;
        this.b = executor;
        asqVar.a(new axe(this, cjdVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}

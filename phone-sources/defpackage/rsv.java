package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsv {
    private static final rsu g = new rsu() { // from class: rss
        @Override // defpackage.rsu
        public final void a(int i, String str) {
        }
    };
    public final xbw a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile rsu d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public rsv(rou rouVar, uht uhtVar, Executor executor, xbw xbwVar) {
        this.a = xbwVar;
        this.b = executor;
        rouVar.a(new rst(this, uhtVar));
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

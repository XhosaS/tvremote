package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzf {
    private static final qze g = new qze() { // from class: qyz
        @Override // defpackage.qze
        public final void a(int i, String str) {
        }
    };
    public final aehf a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile qze d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public qzf(qst qstVar, zyh zyhVar, Executor executor, aehf aehfVar) {
        this.a = aehfVar;
        this.b = executor;
        qstVar.c.a(new qzd(this, zyhVar));
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

package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvd implements Runnable {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ xvj f;

    public xvd(xvj xvjVar, xqp xqpVar, boolean z) {
        long jB;
        this.f = xvjVar;
        this.a = z;
        if (xqpVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = xqpVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    final xtk a() {
        long j = this.c;
        long jAbs = Math.abs(j) / TimeUnit.SECONDS.toNanos(1L);
        long jAbs2 = Math.abs(j) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        xvj xvjVar = this.f;
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) xvjVar.h.g(xqe.f)) == null ? 0.0d : r1.longValue() / xvj.b)));
        if (xvjVar.i != null) {
            xxi xxiVar = new xxi();
            xvjVar.i.g(xxiVar);
            sb.append(" ");
            sb.append(xxiVar);
        }
        return xtk.e.e(sb.toString());
    }

    final void b() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.i.h(a());
    }
}

package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnx implements Runnable, affj {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ afod f;

    public afnx(afod afodVar, afft afftVar, boolean z) {
        long jB;
        this.f = afodVar;
        this.a = z;
        if (afftVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = afftVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    @Override // defpackage.affj
    public final void a(affp affpVar) {
        if (this.b && this.a && (affpVar.c() instanceof TimeoutException)) {
            this.f.h.n(b());
        } else {
            this.f.h.n(affq.a(affpVar));
        }
    }

    final Status b() {
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
        afod afodVar = this.f;
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) afodVar.g.h(afev.f)) == null ? 0.0d : r1.longValue() / afod.a)));
        if (afodVar.h != null) {
            afry afryVar = new afry();
            afodVar.h.m(afryVar);
            sb.append(" ");
            sb.append(afryVar);
        }
        return Status.e.withDescription(sb.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.n(b());
    }
}

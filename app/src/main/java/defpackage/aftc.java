package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aftc {
    public final ScheduledExecutorService a;
    public final yrn b;
    public ScheduledFuture c;
    public ScheduledFuture d;
    public final Runnable e;
    public final Runnable f;
    public final long g;
    public final long h;
    public int i;
    public final aftb j;

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public aftc(aftb aftbVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        yrn yrnVar = new yrn();
        this.i = 1;
        this.e = new aftd(new afsy(this));
        this.f = new aftd(new afsz(this));
        this.j = aftbVar;
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
        this.b = yrnVar;
        this.g = j;
        this.h = j2;
        yrnVar.d();
        yrnVar.e();
    }

    public final synchronized void a() {
        yrn yrnVar = this.b;
        yrnVar.d();
        yrnVar.e();
        int i = this.i;
        if (i == 2) {
            this.i = 3;
            return;
        }
        if (i == 4 || i == 5) {
            ScheduledFuture scheduledFuture = this.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.i == 5) {
                this.i = 1;
                return;
            }
            this.i = 2;
            yqw.M(this.d == null, "There should be no outstanding pingFuture");
            this.d = this.a.schedule(this.f, this.g, TimeUnit.NANOSECONDS);
        }
    }

    public final synchronized void b() {
        int i = this.i;
        if (i == 1) {
            this.i = 2;
            if (this.d == null) {
                this.d = this.a.schedule(this.f, this.g - this.b.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.i = 4;
        }
    }

    public final synchronized void c() {
        int i = this.i;
        if (i != 2 && i != 3) {
            if (i == 4) {
                this.i = 5;
                return;
            }
            return;
        }
        this.i = 1;
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
        if (this.i != 6) {
            this.i = 6;
            ScheduledFuture scheduledFuture = this.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = this.d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.d = null;
            }
        }
    }
}

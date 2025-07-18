package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwq {
    public final long a;
    public final long b;
    public long c;
    public final Object d;

    public xwq(eai eaiVar, long j, long j2) {
        this.d = eaiVar;
        this.b = j;
        this.a = j2;
    }

    public final long a() {
        long j = this.c;
        double d = j;
        this.c = Math.min((long) (1.6d * d), this.b);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        a.H(d2 >= d3);
        return j + ((long) ((((Random) this.d).nextDouble() * (d2 - d3)) + d3));
    }

    public xwq() {
        this.d = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.a = nanos;
        this.b = TimeUnit.MINUTES.toNanos(2L);
        this.c = nanos;
    }
}

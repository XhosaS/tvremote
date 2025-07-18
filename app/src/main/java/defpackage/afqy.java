package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afqy {
    private final Random a = new Random();
    private final long b;
    private final long c;
    private long d;

    public afqy() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.b = nanos;
        this.c = TimeUnit.MINUTES.toNanos(2L);
        this.d = nanos;
    }

    public final long a() {
        long j = this.d;
        double d = j;
        this.d = Math.min((long) (1.6d * d), this.c);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        yqw.A(d2 >= d3);
        return j + ((long) ((this.a.nextDouble() * (d2 - d3)) + d3));
    }
}

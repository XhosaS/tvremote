package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaod {
    private static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long b = TimeUnit.MINUTES.toMillis(30);
    private long c;
    private int d;

    public aaod() {
        long j = aano.a;
        aaog.a();
        aano.c();
    }

    private final synchronized long c(int i) {
        if (i == 429 || (i >= 500 && i < 600)) {
            return (long) Math.min(Math.pow(2.0d, this.d) + ((long) (Math.random() * 1000.0d)), b);
        }
        return a;
    }

    private final synchronized void d() {
        this.d = 0;
    }

    public final synchronized void a(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            d();
            return;
        }
        this.d++;
        this.c = System.currentTimeMillis() + c(i);
    }

    public final synchronized boolean b() {
        if (this.d != 0) {
            if (System.currentTimeMillis() <= this.c) {
                return false;
            }
        }
        return true;
    }
}

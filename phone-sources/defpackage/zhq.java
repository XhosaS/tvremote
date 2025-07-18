package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zhq {
    public static final zhq j = new zhp();
    private boolean a;
    private long b;
    public long k;

    public boolean g() {
        return this.a;
    }

    public long h() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public zhq i() {
        this.k = 0L;
        return this;
    }

    public zhq j(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public zhq k(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.k = timeUnit.toNanos(j2);
        return this;
    }

    public void l() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public zhq m() {
        this.a = false;
        return this;
    }
}

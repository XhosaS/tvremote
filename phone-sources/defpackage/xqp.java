package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqp implements Comparable {
    public static final wbb c = new wbb();
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public volatile boolean b;
    private final wbb g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private xqp(wbb wbbVar, long j, long j2) {
        this.g = wbbVar;
        long jMin = Math.min(d, Math.max(e, j2));
        this.a = j + jMin;
        this.b = jMin <= 0;
    }

    public static xqp c(long j, TimeUnit timeUnit) {
        wbb wbbVar = c;
        timeUnit.getClass();
        return new xqp(wbbVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xqp xqpVar) {
        wbb wbbVar = this.g;
        wbb wbbVar2 = xqpVar.g;
        if (wbbVar == wbbVar2) {
            return Long.compare(this.a, xqpVar.a);
        }
        throw new AssertionError("Tickers (" + wbbVar.toString() + " and " + wbbVar2.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final long b(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.b && this.a - jNanoTime <= 0) {
            this.b = true;
        }
        return timeUnit.convert(this.a - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xqp)) {
            return false;
        }
        xqp xqpVar = (xqp) obj;
        return this.g == xqpVar.g && this.a == xqpVar.a;
    }

    public final int hashCode() {
        return Objects.hash(this.g, Long.valueOf(this.a));
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j = f;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jB) % j;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        wbb wbbVar = this.g;
        if (wbbVar != c) {
            sb.append(a.ch(wbbVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}

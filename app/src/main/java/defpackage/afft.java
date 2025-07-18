package defpackage;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afft implements Comparable {
    public static final affs a = new affr();
    private static final long d;
    private static final long e;
    private static final long f;
    public final affs b;
    public final long c;
    private volatile boolean g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    private afft(affs affsVar, long j, long j2) {
        this.b = affsVar;
        long jMin = Math.min(d, Math.max(e, j2));
        this.c = j + jMin;
        this.g = jMin <= 0;
    }

    public static afft c(long j, TimeUnit timeUnit, affs affsVar) {
        timeUnit.getClass();
        return new afft(affsVar, System.nanoTime(), timeUnit.toNanos(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(afft afftVar) {
        d(afftVar);
        return Long.compare(this.c, afftVar.c);
    }

    public final long b(TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        if (!this.g && this.c - jNanoTime <= 0) {
            this.g = true;
        }
        return timeUnit.convert(this.c - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public final void d(afft afftVar) {
        affs affsVar = this.b;
        affs affsVar2 = afftVar.b;
        if (affsVar == affsVar2) {
            return;
        }
        throw new AssertionError("Tickers (" + affsVar.toString() + " and " + affsVar2.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean e(afft afftVar) {
        d(afftVar);
        return this.c - afftVar.c < 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afft)) {
            return false;
        }
        afft afftVar = (afft) obj;
        return this.b == afftVar.b && this.c == afftVar.c;
    }

    public final boolean f() {
        if (!this.g) {
            if (this.c - System.nanoTime() > 0) {
                return false;
            }
            this.g = true;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Long.valueOf(this.c));
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
        affs affsVar = this.b;
        if (affsVar != a) {
            sb.append(a.t(affsVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}

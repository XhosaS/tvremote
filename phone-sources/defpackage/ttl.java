package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttl {
    public boolean a;
    private final tts b;
    private long c;
    private long d;

    public ttl() {
        this.b = tts.a;
    }

    public static ttl c(tts ttsVar) {
        ttl ttlVar = new ttl(ttsVar);
        ttlVar.e();
        return ttlVar;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(b(), TimeUnit.NANOSECONDS);
    }

    public final long b() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        sij.x(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void f() {
        long jA = this.b.a();
        sij.x(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jA - this.d;
    }

    public final String toString() {
        String str;
        long jB = b();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(jB, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(jB, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(jB, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(jB, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(jB, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(jB, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jB / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (ttk.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return a.cq(str, str2, " ");
    }

    public ttl(tts ttsVar) {
        ttsVar.getClass();
        this.b = ttsVar;
    }
}

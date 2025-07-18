package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byn {
    public boolean a;
    private final byu b;
    private long c;

    byn() {
        this.b = byu.a;
    }

    public static void c(byu byuVar) {
        new byn(byuVar).b();
    }

    public final long a() {
        if (this.a) {
            return this.b.a() - this.c;
        }
        return 0L;
    }

    public final void b() {
        bdq.k(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.c = this.b.a();
    }

    public final String toString() {
        String str;
        long jA = a();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(jA, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(jA, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(jA, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(jA, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(jA, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(jA, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jA / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (bym.a[timeUnit.ordinal()]) {
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
        return str2 + " " + str;
    }

    public byn(byu byuVar) {
        byuVar.getClass();
        this.b = byuVar;
    }
}

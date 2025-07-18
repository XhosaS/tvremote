package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uen {
    public static final /* synthetic */ int a = 0;
    private static final Duration b;
    private static final Duration c;

    static {
        Duration.ofSeconds(Long.MIN_VALUE);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        b = Duration.ofNanos(Long.MAX_VALUE);
        c = Duration.ofNanos(Long.MIN_VALUE);
        BigDecimal.valueOf(9.223372036854776E18d);
        BigDecimal.valueOf(-9.223372036854776E18d);
    }

    public static long a(Duration duration) {
        if (duration.compareTo(b) >= 0) {
            return Long.MAX_VALUE;
        }
        if (duration.compareTo(c) <= 0) {
            return Long.MIN_VALUE;
        }
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static void b(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}

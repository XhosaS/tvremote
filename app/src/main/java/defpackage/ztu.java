package defpackage;

import j$.time.Instant;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztu {
    public static final /* synthetic */ int a = 0;

    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    public static long a(Instant instant) {
        return instant.getEpochSecond() < -9223372036L ? ztc.a(ztc.b(instant.getEpochSecond() + 1, 1000000000L), instant.getNano() - 1000000000) : ztc.a(ztc.b(instant.getEpochSecond(), 1000000000L), instant.getNano());
    }

    public static Instant b(long j) {
        return Instant.ofEpochSecond(ztc.d(j, 1000000000L, RoundingMode.FLOOR), (int) zta.a(j, 1000000000L));
    }

    public static void c(long j) {
        Instant.ofEpochSecond(ztc.d(j, 1000000L, RoundingMode.FLOOR), ((int) zta.a(j, 1000000L)) * 1000);
    }
}

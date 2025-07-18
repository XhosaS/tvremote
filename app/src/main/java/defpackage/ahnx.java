package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnx {
    public static final Object a(Duration duration, agsw agswVar) {
        Object objB = ahce.b(duration.compareTo(Duration.ZERO) <= 0 ? 0L : duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) ? duration.toMillis() : Long.MAX_VALUE, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }
}

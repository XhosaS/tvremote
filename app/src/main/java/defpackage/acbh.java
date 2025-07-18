package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbh {
    public static abzy a(Instant instant) {
        return acbj.e(instant.getEpochSecond(), instant.getNano());
    }

    public static Duration b(abwf abwfVar) {
        return Duration.ofSeconds(acbg.d(abwfVar.b, abwfVar.c).b, r4.c);
    }

    public static Instant c(abzy abzyVar) {
        return Instant.ofEpochSecond(acbj.e(abzyVar.b, abzyVar.c).b, r4.c);
    }
}

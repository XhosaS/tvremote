package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gms {
    public static final boolean a(Duration... durationArr) {
        Duration duration = Duration.ZERO;
        duration.getClass();
        int i = 0;
        while (i < durationArr.length) {
            Duration duration2 = durationArr[i];
            if (duration2.compareTo(duration) <= 0) {
                return false;
            }
            i++;
            duration = duration2;
        }
        return true;
    }

    public static final boolean b(Instant... instantArr) {
        Instant instant = Instant.EPOCH;
        instant.getClass();
        int i = 0;
        while (i < instantArr.length) {
            Instant instant2 = instantArr[i];
            if (!instant2.isAfter(Instant.EPOCH) || instant2.isBefore(instant)) {
                return false;
            }
            i++;
            instant = instant2;
        }
        return true;
    }
}

package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xxj implements ybv {
    private final /* synthetic */ int b;

    public xxj(int i) {
        this.b = i;
    }

    @Override // defpackage.ybv
    public final long a() {
        if (this.b != 0) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        return sfy.as(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r0.getNano());
    }
}

package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zky extends zkz {
    public zky(Duration duration, double d, int i) {
        super(duration, d, i);
    }

    public final String toString() {
        yqq yqqVar = new yqq("exponentialBackoff");
        yqqVar.c("firstDelayMs", String.valueOf(this.b.toMillis()));
        yqqVar.c("multiplier", String.valueOf(this.c));
        yqqVar.c("tries", String.valueOf(this.a));
        return yqqVar.toString();
    }
}

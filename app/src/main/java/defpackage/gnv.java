package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnv {
    public Duration a = Duration.ZERO;
    public Duration b = Duration.ZERO;
    public Duration c = Duration.ZERO;
    public Duration d = Duration.ZERO;
    public Duration e = Duration.ZERO;
    public Duration f = Duration.ZERO;
    public Duration g = Duration.ZERO;
    public Duration h = Duration.ZERO;
    public Duration i = Duration.ZERO;
    public final mcw j;

    public gnv(mcw mcwVar) {
        this.j = mcwVar;
    }

    public final Duration a(Duration duration) {
        return Duration.ofNanos(this.j.a()).minus(Duration.ofMillis(SystemClock.uptimeMillis()).minus(duration));
    }

    public final void b(Intent intent) {
        if (yqs.a(this.b, Duration.ZERO)) {
            this.b = Duration.ofMillis(SystemClock.uptimeMillis());
            long longExtra = intent.getLongExtra("android.intent.extra.TIME", 0L);
            if (longExtra != 0) {
                this.a = Duration.ofMillis(longExtra);
            }
        }
    }
}

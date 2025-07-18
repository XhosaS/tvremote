package defpackage;

import android.app.job.JobInfo;
import android.os.Bundle;
import android.os.Handler;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feq {
    public static final JobInfo.Builder a(JobInfo.Builder builder, Duration duration) {
        duration.getClass();
        JobInfo.Builder minimumLatency = builder.setMinimumLatency(duration.toMillis());
        minimumLatency.getClass();
        return minimumLatency;
    }

    public static final Duration b(ThreadLocalRandom threadLocalRandom, Duration duration, Duration duration2) {
        threadLocalRandom.getClass();
        duration.getClass();
        duration2.getClass();
        Duration durationOfSeconds = Duration.ofSeconds(threadLocalRandom.nextLong(duration.toSeconds(), duration2.toSeconds()));
        durationOfSeconds.getClass();
        return durationOfSeconds;
    }

    public static final Instant c(Bundle bundle, String str, Instant instant) {
        bundle.getClass();
        instant.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(bundle.getLong(str, instant.toEpochMilli()));
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }

    public static final void d(Bundle bundle, String str, Instant instant) {
        instant.getClass();
        bundle.putLong(str, instant.toEpochMilli());
    }

    public static final boolean e(Handler handler, Duration duration, Runnable runnable) {
        handler.getClass();
        duration.getClass();
        runnable.getClass();
        return handler.postDelayed(runnable, duration.toMillis());
    }

    public static final Duration f(Bundle bundle, Duration duration) {
        bundle.getClass();
        duration.getClass();
        Duration durationOfNanos = Duration.ofNanos(bundle.getLong("StartupEventElapsedTimeKey", duration.toNanos()));
        durationOfNanos.getClass();
        return durationOfNanos;
    }

    public static final void g(Handler handler, int i, Duration duration) {
        handler.getClass();
        duration.getClass();
        handler.sendEmptyMessageDelayed(i, duration.toMillis());
    }
}

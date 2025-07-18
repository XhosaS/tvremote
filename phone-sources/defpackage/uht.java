package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface uht extends ScheduledExecutorService, uhs {
    uhr a(Runnable runnable, long j, TimeUnit timeUnit);

    uhr b(Callable callable, long j, TimeUnit timeUnit);

    uhr c(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    uhr d(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}

package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface cjd extends ScheduledExecutorService, cjc {
    cjf b(Runnable runnable, long j, TimeUnit timeUnit);

    cjf c(Callable callable, long j, TimeUnit timeUnit);

    cjf d(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}

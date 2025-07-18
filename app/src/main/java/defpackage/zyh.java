package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface zyh extends ScheduledExecutorService, zyg {
    zyf a(Runnable runnable, long j, TimeUnit timeUnit);

    zyf b(Callable callable, long j, TimeUnit timeUnit);

    zyf c(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    zyf d(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}

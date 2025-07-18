package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nen implements nem {
    private final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    @Override // defpackage.nem
    public final void a(long j, Runnable runnable) {
        this.b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}

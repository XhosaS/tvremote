package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjm implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ AtomicLong b;

    public cjm(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.a = threadFactory;
        this.b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        threadNewThread.getClass();
        threadNewThread.setName(dnx.bJ(Long.valueOf(this.b.getAndIncrement())));
        return threadNewThread;
    }
}

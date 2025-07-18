package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocz implements ThreadFactory {
    private final AtomicInteger b = new AtomicInteger();
    private final ThreadFactory c = Executors.defaultThreadFactory();
    private final String a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.c.newThread(new hx(runnable, 6));
        threadNewThread.setName(this.a + "[" + this.b.getAndIncrement() + "]");
        return threadNewThread;
    }
}

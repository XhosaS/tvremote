package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unl implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private final /* synthetic */ int b;

    public unl(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.b == 0) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.a.getAndIncrement());
        return thread;
    }

    public unl(int i) {
        this.b = i;
    }
}

package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocy implements ThreadFactory {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public ocy(int i) {
        this.a = i;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.a == 0) {
            Thread threadNewThread = this.c.newThread(new hx(runnable, 6));
            threadNewThread.setName((String) this.b);
            return threadNewThread;
        }
        Thread threadNewThread2 = this.b.newThread(runnable);
        threadNewThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) this.c).getAndIncrement());
        return threadNewThread2;
    }

    public ocy(String str, int i) {
        this.a = i;
        this.c = Executors.defaultThreadFactory();
        this.b = str;
    }
}

package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agna extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;

    public agna(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread agmzVar = this.c ? new agmz(runnable, str) : new Thread(runnable, str);
        agmzVar.setPriority(this.b);
        agmzVar.setDaemon(true);
        return agmzVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return "RxThreadFactory[" + this.a + "]";
    }

    public agna(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}

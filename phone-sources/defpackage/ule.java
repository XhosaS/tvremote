package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ule implements ThreadFactory {
    private static final ThreadFactory c = Executors.defaultThreadFactory();
    public final int a;
    public final StrictMode.ThreadPolicy b;
    private final AtomicLong d = new AtomicLong();
    private final String e;

    public ule(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.e = str;
        this.a = i;
        this.b = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = c.newThread(new ukm(this, runnable, 3));
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.e, Long.valueOf(this.d.getAndIncrement())));
        return threadNewThread;
    }
}

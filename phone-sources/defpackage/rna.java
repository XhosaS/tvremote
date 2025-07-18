package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rna implements ThreadFactory {
    public final int a;
    private final String b;
    private final /* synthetic */ int c;
    private final Object d;

    public rna(String str, int i, int i2) {
        this.c = i2;
        this.b = str;
        this.a = i;
        this.d = Executors.defaultThreadFactory();
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.c != 0) {
            Thread threadNewThread = this.d.newThread(new lik(this, runnable, 15));
            String name = threadNewThread.getName();
            int iIndexOf = name == null ? -1 : name.indexOf("-thread-");
            if (iIndexOf != -1) {
                threadNewThread.setName(this.b.concat(String.valueOf(name.substring(iIndexOf + 7))));
                return threadNewThread;
            }
            threadNewThread.setName(name == null ? this.b : this.b.concat(name));
            return threadNewThread;
        }
        Thread thread = new Thread(new rmz(this, runnable, 0), this.b + "-" + ((AtomicInteger) this.d).getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public rna(int i, int i2) {
        this.c = i2;
        this.d = new AtomicInteger(1);
        this.a = i;
        this.b = "Primes";
    }
}

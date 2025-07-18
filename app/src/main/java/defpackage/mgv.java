package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgv implements ThreadFactory {
    public final mgr a;
    private final ThreadFactory b;

    public mgv(ThreadFactory threadFactory, mgr mgrVar) {
        this.b = threadFactory;
        this.a = mgrVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return this.b.newThread(new Runnable() { // from class: mgu
            @Override // java.lang.Runnable
            public final void run() {
                long id = Thread.currentThread().getId();
                mgv mgvVar = this.a;
                mgvVar.a.d(id);
                try {
                    runnable.run();
                } finally {
                    mgvVar.a.c(id);
                }
            }
        });
    }
}

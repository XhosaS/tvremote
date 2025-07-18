package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qko {
    public boolean a = true;
    private final ScheduledExecutorService b;

    public qko(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
    }

    public final void a(final Runnable runnable) {
        if (this.a) {
            this.b.schedule(new Runnable() { // from class: qkn
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                    this.a = false;
                }
            }, 5L, TimeUnit.SECONDS).getClass();
        } else {
            runnable.run();
        }
    }
}

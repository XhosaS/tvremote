package defpackage;

import android.net.TrafficStats;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otj implements Executor {
    private final Executor a;

    public otj(Executor executor) {
        this.a = executor;
        Integer num = 0;
        num.getClass();
        Integer num2 = -1;
        num2.getClass();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.a.execute(wyo.h(new Runnable() { // from class: oti
            @Override // java.lang.Runnable
            public final void run() {
                TrafficStats.setThreadStatsTag(0);
                try {
                    runnable.run();
                } finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        }));
    }
}

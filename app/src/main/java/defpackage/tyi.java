package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyi {
    public final zyh a;
    private volatile long b;
    private volatile long c;

    public tyi(zyh zyhVar) {
        this.a = zyhVar;
    }

    public final synchronized void a(final Runnable runnable) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.b;
        if (j < this.c) {
            this.a.a(new Runnable() { // from class: tyh
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(runnable);
                }
            }, this.c - j, TimeUnit.MILLISECONDS);
            return;
        }
        runnable.run();
        this.b = jElapsedRealtime;
        if (j >= 5000) {
            this.c = 0L;
        }
        long j2 = this.c + 50;
        this.c = Math.min(3000L, j2 + j2);
    }
}

package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ypu implements Runnable {
    final /* synthetic */ zyu a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ zyh d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    public ypu(zyu zyuVar, Runnable runnable, AtomicReference atomicReference, zyh zyhVar, long j, long j2) {
        this.a = zyuVar;
        this.b = runnable;
        this.c = atomicReference;
        this.d = zyhVar;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zyu zyuVar = this.a;
            if (zyuVar.isDone()) {
                return;
            }
            this.b.run();
            zyu zyuVar2 = new zyu();
            this.c.set(zyuVar2);
            if (zyuVar.isDone()) {
                return;
            }
            zyh zyhVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zyuVar2.eZ(zyhVar.schedule(this, jElapsedRealtime < j ? (j + j2) - jElapsedRealtime : j2 - ((jElapsedRealtime - j) % j2), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.q(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}

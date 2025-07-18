package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mei extends zum implements Runnable, zyf {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ mek f;

    public mei(mek mekVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = mekVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long e() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - SystemClock.elapsedRealtime());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return mek.e(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            if (this.c) {
                mek mekVar = this.f;
                mekVar.a.postDelayed(this, e());
            } else {
                mek mekVar2 = this.f;
                mekVar2.a.postDelayed(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            q(th);
        }
    }
}

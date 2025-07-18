package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqk implements lpw {
    private final float a;
    private final long b;
    private final long c;
    private final float d;
    private final float e;
    private long f = 0;
    private long g = 0;

    static {
        new lqk(0L, 0L, 1.0f, 1.0f, 0L);
    }

    public lqk(long j, long j2, float f, float f2, long j3) {
        long j4;
        long j5;
        float f3 = f;
        long j6 = j3;
        if (j < 0) {
            krd.f(a.cs(j, "minDelayMs should >= 0 but was "));
            j4 = 0;
        } else {
            j4 = j;
        }
        if (j2 < j4) {
            krd.f(a.cv(j2, j4, "maxDelayMs should >= ", " but was "));
            j5 = j4;
        } else {
            j5 = j2;
        }
        float f4 = 1.0f;
        if (f3 < 1.0f) {
            krd.f("delayMultiplier should >= 1 but was " + f3);
            f3 = 1.0f;
        }
        if (f2 < 1.0f) {
            krd.f("recoverMultiplier should >= 1 but was " + f2);
        } else {
            f4 = f2;
        }
        if (j6 < 0) {
            krd.f(a.cs(j6, "effectiveDurationMs should >= 0 but was "));
            j6 = 0;
        }
        this.e = f4;
        this.a = j6;
        this.b = j4;
        this.c = j5;
        this.d = f3;
    }

    @Override // defpackage.lpw
    public final synchronized void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (j > 0) {
            if (j + this.a < jElapsedRealtime) {
                this.f = 0L;
            }
        }
        this.g = jElapsedRealtime;
        long j2 = this.f;
        if (j2 > 0) {
            krd.f(a.cp(j2, "Backing off for ", " ms"));
            Thread.sleep(this.f);
        }
    }

    @Override // defpackage.lpw
    public final synchronized void b() {
        long j = this.f;
        if (j == 0) {
            this.f = this.b;
            return;
        }
        this.f = Math.min((long) (j * this.d), this.c);
    }

    @Override // defpackage.lpw
    public final synchronized void c() {
        long j = (long) (this.f / this.e);
        this.f = j;
        if (j < this.b) {
            this.f = 0L;
        }
    }
}

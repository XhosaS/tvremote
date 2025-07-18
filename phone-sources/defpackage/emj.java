package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emj {
    private Exception a;
    private long b = -9223372036854775807L;
    private long c = -9223372036854775807L;

    public final void a() {
        this.a = null;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final void b(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == -9223372036854775807L && !emm.x()) {
            this.b = 200 + jElapsedRealtime;
        }
        long j = this.b;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.a;
        a();
        throw exc3;
    }

    public final boolean c() {
        return this.a != null && (emm.x() || SystemClock.elapsedRealtime() < this.c);
    }
}

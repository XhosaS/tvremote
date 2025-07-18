package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tle {
    public final tli a;
    public long b = SystemClock.elapsedRealtime();
    public final long c;

    public tle(tli tliVar, long j) {
        this.a = tliVar;
        this.c = Math.min(j * 1000, 30000L) + ((long) (new Random().nextDouble() * 15000.0d));
    }
}

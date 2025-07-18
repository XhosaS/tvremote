package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqf {
    public static final /* synthetic */ int a = 0;
    private static final double b = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * b;
    }
}

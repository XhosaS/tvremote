package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yps {
    public static final yrx a;

    static {
        yrx yprVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            yprVar = new ypq();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            yprVar = new ypr();
        }
        a = yprVar;
    }
}

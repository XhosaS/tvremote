package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxv {
    public static final byu a;

    static {
        byu bxuVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            bxuVar = new bxt();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            bxuVar = new bxu();
        }
        a = bxuVar;
    }
}

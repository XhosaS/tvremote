package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trj {
    public static final tts a;

    static {
        tts triVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            triVar = new trh();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            triVar = new tri();
        }
        a = triVar;
    }
}

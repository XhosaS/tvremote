package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class win {
    public static final long a(long j) {
        return Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - j));
    }

    public static final long b() {
        yqt yqtVarA = rax.a();
        if (yqtVarA.g()) {
            return ((Long) yqtVarA.c()).longValue();
        }
        int i = wil.f;
        return Process.getStartElapsedRealtime();
    }
}

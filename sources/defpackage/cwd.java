package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwd {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String strA = cvy.a("kotlinx.coroutines.scheduler.default.name");
        if (strA == null) {
            strA = "DefaultDispatcher";
        }
        a = strA;
        b = dnx.ar("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        c = dnx.as("kotlinx.coroutines.scheduler.core.pool.size", dnx.aA(cvy.a, 2), 1, 0, 8);
        d = dnx.as("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(dnx.ar("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
    }
}

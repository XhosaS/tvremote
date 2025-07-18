package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyf {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String strA = yxp.a("kotlinx.coroutines.scheduler.default.name");
        if (strA == null) {
            strA = "DefaultDispatcher";
        }
        a = strA;
        b = wae.M("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        c = wae.O("kotlinx.coroutines.scheduler.core.pool.size", ykn.j(yxp.a, 2), 1, 0, 8);
        d = wae.O("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(wae.M("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
    }
}

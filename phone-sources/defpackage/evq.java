package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evq {
    public static final /* synthetic */ int d = 0;
    private static final AtomicLong e = new AtomicLong();
    public final eey a;
    public final long b;
    public final long c;

    public evq(eey eeyVar, long j, long j2) {
        this.a = eeyVar;
        this.b = j;
        this.c = j2;
    }

    public static long a() {
        return e.getAndIncrement();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public evq(eey eeyVar, long j) {
        this(eeyVar, j, 0L);
        Uri uri = eeyVar.a;
        Map map = Collections.EMPTY_MAP;
    }
}

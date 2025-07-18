package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nob {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public nob(sew sewVar) {
        this.e = sewVar.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = jCurrentTimeMillis;
        this.b = jCurrentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}

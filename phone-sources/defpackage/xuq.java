package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xuq {
    public static final Logger a = Logger.getLogger(xuq.class.getName());
    public final String b;
    public final AtomicLong c;

    public xuq(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        sij.o(j > 0, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(j);
    }
}

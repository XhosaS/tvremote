package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afne {
    public static final Logger a = Logger.getLogger(afne.class.getName());
    public final String b;
    public final AtomicLong c;

    public afne() {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        this.b = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}

package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmx extends agfx {
    public static final agna b = new agna("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    final ThreadFactory c;

    public agmx() {
        throw null;
    }

    @Override // defpackage.agfx
    public final agfw a() {
        return new agmy(this.c);
    }

    public agmx(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}

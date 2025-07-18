package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utz implements utx {
    public static final xpx b = new xpx("com.google.frameworks.client.data.android.metrics.MutableMetricsContext", null);
    public final uqr c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(-1);

    public utz(uqr uqrVar) {
        new ConcurrentLinkedQueue();
        new ConcurrentLinkedQueue();
        this.c = uqrVar;
    }

    public final void a() {
        sij.x(!this.e.getAndSet(true), "Already recorded cache lookup.");
    }
}

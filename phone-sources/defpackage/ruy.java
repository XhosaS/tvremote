package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruy {
    public final rus b;
    public final AtomicInteger a = new AtomicInteger(0);
    public final Map c = new ConcurrentHashMap();
    private final ThreadLocal e = new rux(this);
    public final List d = new ArrayList();

    public ruy(String str) {
        this.b = new rus(str, Thread.currentThread().getId(), 2);
    }

    public final int a() {
        return this.a.get();
    }

    public final int b() {
        return this.a.incrementAndGet();
    }

    public final ArrayDeque c() {
        return (ArrayDeque) ((WeakReference) this.e.get()).get();
    }
}

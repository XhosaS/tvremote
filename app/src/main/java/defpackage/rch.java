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
public final class rch {
    public final rby b;
    public final AtomicInteger a = new AtomicInteger(0);
    public final Map c = new ConcurrentHashMap();
    private final ThreadLocal e = new rcg(this);
    public final List d = new ArrayList();

    public rch(String str) {
        this.b = new rby(str, Thread.currentThread().getId(), 2);
    }

    public final ArrayDeque a() {
        return (ArrayDeque) ((WeakReference) this.e.get()).get();
    }
}

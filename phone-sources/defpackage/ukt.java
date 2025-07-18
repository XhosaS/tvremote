package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ukt implements umr, umq {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public ukt(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set a() {
        throw null;
    }

    @Override // defpackage.umr
    public final void b(Class cls, zft zftVar) {
        c(cls, this.c, zftVar);
    }

    public final synchronized void c(Class cls, Executor executor, zft zftVar) {
        zftVar.getClass();
        executor.getClass();
        Map map = this.b;
        if (!map.containsKey(cls)) {
            map.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) map.get(cls)).put(zftVar, executor);
    }
}

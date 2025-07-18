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
class aaja implements aaln, aalm {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public aaja(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.aaln
    public final void a(Class cls, aall aallVar) {
        b(cls, this.c, aallVar);
    }

    @Override // defpackage.aaln
    public final synchronized void b(Class cls, Executor executor, aall aallVar) {
        if (aallVar == null || executor == null) {
            throw null;
        }
        Map map = this.b;
        if (!map.containsKey(cls)) {
            map.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) map.get(cls)).put(aallVar, executor);
    }

    public final synchronized Set c() {
        throw null;
    }
}

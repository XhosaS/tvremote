package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvj implements Serializable {
    public final ConcurrentHashMap a;

    public zvj(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public final long a(Object obj) {
        AtomicLong atomicLong = (AtomicLong) this.a.get(obj);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    public final long b() {
        Iterator it = this.a.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((AtomicLong) it.next()).get();
        }
        return j;
    }

    public final String toString() {
        return this.a.toString();
    }
}

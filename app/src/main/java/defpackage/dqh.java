package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dqh {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public dqh(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        dqg dqgVar = (dqg) this.a.get(obj);
        if (dqgVar == null) {
            return null;
        }
        return dqgVar.a;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int iA = a(obj2);
        long j = iA;
        long j2 = this.b;
        if (j >= j2) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        dqg dqgVar = (dqg) this.a.put(obj, obj2 == null ? null : new dqg(obj2, iA));
        if (dqgVar != null) {
            this.c -= dqgVar.b;
            Object obj3 = dqgVar.a;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        i(j2);
        if (dqgVar != null) {
            return dqgVar.a;
        }
        return null;
    }

    public final synchronized Object h(Object obj) {
        dqg dqgVar = (dqg) this.a.remove(obj);
        if (dqgVar == null) {
            return null;
        }
        this.c -= dqgVar.b;
        return dqgVar.a;
    }

    public final synchronized void i(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            dqg dqgVar = (dqg) entry.getValue();
            this.c -= dqgVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, dqgVar.a);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}

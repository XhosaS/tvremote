package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwl {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public hwl(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    public final void e() {
        j(0L);
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized Object g(Object obj) {
        zuw zuwVar = (zuw) this.a.get(obj);
        if (zuwVar == null) {
            return null;
        }
        return zuwVar.b;
    }

    public final synchronized Object h(Object obj, Object obj2) {
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
        zuw zuwVar = (zuw) this.a.put(obj, obj2 == null ? null : new zuw(obj2, iA));
        if (zuwVar != null) {
            this.c -= zuwVar.a;
            Object obj3 = zuwVar.b;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        j(j2);
        if (zuwVar != null) {
            return zuwVar.b;
        }
        return null;
    }

    public final synchronized Object i(Object obj) {
        zuw zuwVar = (zuw) this.a.remove(obj);
        if (zuwVar == null) {
            return null;
        }
        this.c -= zuwVar.a;
        return zuwVar.b;
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            zuw zuwVar = (zuw) entry.getValue();
            this.c -= zuwVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, zuwVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}

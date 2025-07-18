package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iac {
    public final long a;
    public final Map b = new ConcurrentHashMap(16, 0.75f, 16);
    public final Set c;
    public final Set d;
    public final boolean e;
    private final long f;
    private final long g;
    private final boolean h;
    private final boolean i;

    public iac(long j, long j2, long j3) {
        this.f = j;
        this.g = j2;
        this.a = j3;
        boolean z = j3 >= 0;
        this.e = z;
        boolean zT = ynm.t(j);
        this.h = zT;
        boolean zT2 = ynm.t(j2);
        this.i = zT2;
        new HashMap();
        this.c = (true != zT ? null : this) != null ? DesugarCollections.synchronizedSet(new iad()) : null;
        this.d = ((zT2 || z) ? this : null) != null ? DesugarCollections.synchronizedSet(new iad()) : null;
    }

    private final boolean e(iab iabVar, long j) {
        if (this.i) {
            long j2 = ynm.a;
            if (ynm.b(ylh.p(j - iabVar.c, yno.a), this.g) >= 0) {
                return true;
            }
        }
        if (this.h) {
            long j3 = ynm.a;
            if (ynm.b(ylh.p(j - iabVar.d, yno.a), this.f) >= 0) {
                return true;
            }
        }
        return false;
    }

    public final Object a(Object obj) {
        obj.getClass();
        Map map = this.b;
        long jNanoTime = System.nanoTime();
        iab iabVar = (iab) map.get(obj);
        if (iabVar == null) {
            return null;
        }
        if (e(iabVar, jNanoTime)) {
            c(jNanoTime);
            return null;
        }
        if (this.i) {
            iabVar.c = jNanoTime;
        }
        Set set = this.d;
        if (set != null) {
            set.add(iabVar);
        }
        return iabVar.b;
    }

    public final void b() {
        Set set = this.c;
        Set set2 = this.d;
        for (Set set3 : yfm.aW(new Set[]{set, set2})) {
            int size = set3.size();
            Map map = this.b;
            if (size < map.size()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    iab iabVar = (iab) ((Map.Entry) it.next()).getValue();
                    if (!set3.contains(iabVar)) {
                        it.remove();
                        if (yks.e(set3, set)) {
                            if (set2 != null) {
                                set2.remove(iabVar);
                            }
                        } else if (set != null) {
                            set.remove(iabVar);
                        }
                    }
                }
            }
        }
    }

    public final void c(long j) {
        List<Set> listAW = yfm.aW(new Set[]{this.h ? this.c : null, this.i ? this.d : null});
        if (!listAW.isEmpty()) {
            b();
        }
        for (Set set : listAW) {
            synchronized (set) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    iab iabVar = (iab) it.next();
                    if (e(iabVar, j)) {
                        this.b.remove(iabVar.a);
                        it.remove();
                    }
                }
            }
        }
    }

    public final void d(iab iabVar, long j) {
        if (this.i) {
            iabVar.c = j;
        }
        if (this.h) {
            iabVar.d = j;
        }
        Set set = this.d;
        if (set != null) {
            set.add(iabVar);
        }
        Set set2 = this.c;
        if (set2 != null) {
            set2.add(iabVar);
        }
    }
}

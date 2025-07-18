package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtz {
    private Map a;
    private Map b;

    public final synchronized dtx a(Object obj) {
        Map map = this.a;
        if (map != null && map.containsKey(obj)) {
            return (dtx) this.a.get(obj);
        }
        return null;
    }

    public final synchronized void b() {
        Map map = this.a;
        if (map != null) {
            map.clear();
        }
        Map map2 = this.b;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void c(dtx dtxVar) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new HashMap();
            }
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.a.put(dtxVar.d, dtxVar);
            dug dugVar = dtxVar.e;
            if (dugVar != null) {
                SparseArray sparseArray = (SparseArray) this.b.get(dugVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(dtxVar.c, dtxVar);
                this.b.put(dugVar, sparseArray);
            }
        }
    }

    public final synchronized dtx d(dug dugVar) {
        SparseArray sparseArray;
        Map map = this.b;
        if (map != null && (sparseArray = (SparseArray) map.get(dugVar)) != null) {
            return (dtx) sparseArray.get(1839493254);
        }
        return null;
    }
}

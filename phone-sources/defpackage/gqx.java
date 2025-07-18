package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqx implements gqw {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.gqw
    public final List a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.a;
        for (Map.Entry entry : map.entrySet()) {
            if (yks.e(((gun) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            map.remove((gun) it.next());
        }
        return yfm.al(linkedHashMap.values());
    }

    @Override // defpackage.gqw
    public final boolean b(gun gunVar) {
        return this.a.containsKey(gunVar);
    }

    @Override // defpackage.gqw
    public final cb c(gun gunVar) {
        return (cb) this.a.remove(gunVar);
    }

    @Override // defpackage.gqw
    public final cb d(gun gunVar) {
        Map map = this.a;
        Object cbVar = map.get(gunVar);
        if (cbVar == null) {
            cbVar = new cb(gunVar);
            map.put(gunVar, cbVar);
        }
        return (cb) cbVar;
    }

    @Override // defpackage.gqw
    public final /* synthetic */ cb e(guw guwVar) {
        return fki.ba(this, guwVar);
    }
}

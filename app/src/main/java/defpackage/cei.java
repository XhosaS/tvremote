package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cei implements ceh {
    private final Map b = new LinkedHashMap();

    @Override // defpackage.ceh
    public final cee a(ckp ckpVar) {
        return (cee) this.b.remove(ckpVar);
    }

    @Override // defpackage.ceh
    public final cee b(ckp ckpVar) {
        Map map = this.b;
        Object ceeVar = map.get(ckpVar);
        if (ceeVar == null) {
            ceeVar = new cee(ckpVar);
            map.put(ckpVar, ceeVar);
        }
        return (cee) ceeVar;
    }

    @Override // defpackage.ceh
    public final /* synthetic */ cee c(cld cldVar) {
        return cef.a(this, cldVar);
    }

    @Override // defpackage.ceh
    public final List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.b;
        for (Map.Entry entry : map.entrySet()) {
            if (agvy.c(((ckp) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            map.remove((ckp) it.next());
        }
        return agqq.x(linkedHashMap.values());
    }

    @Override // defpackage.ceh
    public final boolean e(ckp ckpVar) {
        return this.b.containsKey(ckpVar);
    }
}

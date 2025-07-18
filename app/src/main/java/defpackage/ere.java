package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ere {
    final Map a = new HashMap();
    final erq b = new erq();

    public ere() {
        b(new erc());
        b(new erf());
        b(new erg());
        b(new erj());
        b(new ero());
        b(new erp());
        b(new err());
    }

    public final eqw a(epp eppVar, eqw eqwVar) {
        epq.l(eppVar);
        if (!(eqwVar instanceof eqx)) {
            return eqwVar;
        }
        eqx eqxVar = (eqx) eqwVar;
        ArrayList arrayList = eqxVar.b;
        String str = eqxVar.a;
        Map map = this.a;
        return (map.containsKey(str) ? (erd) map.get(str) : this.b).a(str, eppVar, arrayList);
    }

    final void b(erd erdVar) {
        Iterator it = erdVar.a.iterator();
        while (it.hasNext()) {
            this.a.put(Integer.valueOf(((ers) it.next()).ap).toString(), erdVar);
        }
    }
}

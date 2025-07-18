package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqd extends eqp {
    final Map a;
    private final eps b;

    public eqd(eps epsVar) {
        super("require");
        this.a = new HashMap();
        this.b = epsVar;
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        eqw eqwVar;
        epq.g("require", 1, list);
        String strI = eppVar.b.a(eppVar, (eqw) list.get(0)).i();
        Map map = this.a;
        if (map.containsKey(strI)) {
            return (eqw) map.get(strI);
        }
        Map map2 = this.b.a;
        if (map2.containsKey(strI)) {
            try {
                eqwVar = (eqw) ((Callable) map2.get(strI)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strI)));
            }
        } else {
            eqwVar = eqw.f;
        }
        if (eqwVar instanceof eqp) {
            this.a.put(strI, (eqp) eqwVar);
        }
        return eqwVar;
    }
}

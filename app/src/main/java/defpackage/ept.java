package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ept extends eqp {
    private final eqi a;

    public ept(eqi eqiVar) {
        super("internal.eventLogger");
        this.a = eqiVar;
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        epq.g(this.d, 3, list);
        eqw eqwVar = (eqw) list.get(0);
        ere ereVar = eppVar.b;
        String strI = ereVar.a(eppVar, eqwVar).i();
        long jA = (long) epq.a(ereVar.a(eppVar, (eqw) list.get(1)).h().doubleValue());
        eqw eqwVarA = ereVar.a(eppVar, (eqw) list.get(2));
        Map mapF = eqwVarA instanceof eqt ? epq.f((eqt) eqwVarA) : new HashMap();
        eqi eqiVar = this.a;
        HashMap map = new HashMap();
        for (String str : mapF.keySet()) {
            map.put(str, eqh.c(str, eqiVar.a.b(str), mapF.get(str)));
        }
        eqiVar.c.add(new eqh(strI, jA, map));
        return eqw.f;
    }
}

package defpackage;

import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqc extends eqp {
    private final eqg a;

    public eqc(eqg eqgVar) {
        super("internal.registerCallback");
        this.a = eqgVar;
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        TreeMap treeMap;
        epq.g(this.d, 3, list);
        eqw eqwVar = (eqw) list.get(0);
        ere ereVar = eppVar.b;
        ereVar.a(eppVar, eqwVar).i();
        eqw eqwVarA = ereVar.a(eppVar, (eqw) list.get(1));
        if (!(eqwVarA instanceof eqv)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(2));
        if (!(eqwVarA2 instanceof eqt)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        eqt eqtVar = (eqt) eqwVarA2;
        if (!eqtVar.s("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String strI = eqtVar.f("type").i();
        int iB = eqtVar.s("priority") ? epq.b(eqtVar.f("priority").h().doubleValue()) : 1000;
        eqg eqgVar = this.a;
        eqv eqvVar = (eqv) eqwVarA;
        if ("create".equals(strI)) {
            treeMap = eqgVar.b;
        } else {
            if (!"edit".equals(strI)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strI)));
            }
            treeMap = eqgVar.a;
        }
        if (treeMap.containsKey(Integer.valueOf(iB))) {
            iB = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(iB), eqvVar);
        return eqw.f;
    }
}

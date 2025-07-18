package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erj extends erd {
    protected erj() {
        this.a.add(ers.AND);
        this.a.add(ers.NOT);
        this.a.add(ers.OR);
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        ers ersVar = ers.ADD;
        int iOrdinal = epq.d(str).ordinal();
        if (iOrdinal == 1) {
            epq.g(ers.AND.name(), 2, list);
            eqw eqwVar = (eqw) list.get(0);
            ere ereVar = eppVar.b;
            eqw eqwVarA = ereVar.a(eppVar, eqwVar);
            return eqwVarA.g().booleanValue() ? ereVar.a(eppVar, (eqw) list.get(1)) : eqwVarA;
        }
        if (iOrdinal == 47) {
            epq.g(ers.NOT.name(), 1, list);
            return new eqm(Boolean.valueOf(!eppVar.b.a(eppVar, (eqw) list.get(0)).g().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        epq.g(ers.OR.name(), 2, list);
        eqw eqwVar2 = (eqw) list.get(0);
        ere ereVar2 = eppVar.b;
        eqw eqwVarA2 = ereVar2.a(eppVar, eqwVar2);
        return !eqwVarA2.g().booleanValue() ? ereVar2.a(eppVar, (eqw) list.get(1)) : eqwVarA2;
    }
}

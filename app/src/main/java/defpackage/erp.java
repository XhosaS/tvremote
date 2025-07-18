package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erp extends erd {
    protected erp() {
        this.a.add(ers.ADD);
        this.a.add(ers.DIVIDE);
        this.a.add(ers.MODULUS);
        this.a.add(ers.MULTIPLY);
        this.a.add(ers.NEGATE);
        this.a.add(ers.POST_DECREMENT);
        this.a.add(ers.POST_INCREMENT);
        this.a.add(ers.PRE_DECREMENT);
        this.a.add(ers.PRE_INCREMENT);
        this.a.add(ers.SUBTRACT);
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        ers ersVar = ers.ADD;
        int iOrdinal = epq.d(str).ordinal();
        if (iOrdinal == 0) {
            epq.g(ers.ADD.name(), 2, list);
            eqw eqwVar = (eqw) list.get(0);
            ere ereVar = eppVar.b;
            eqw eqwVarA = ereVar.a(eppVar, eqwVar);
            eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(1));
            if (!(eqwVarA instanceof eqs) && !(eqwVarA instanceof era) && !(eqwVarA2 instanceof eqs) && !(eqwVarA2 instanceof era)) {
                return new eqo(Double.valueOf(eqwVarA.h().doubleValue() + eqwVarA2.h().doubleValue()));
            }
            return new era(String.valueOf(eqwVarA.i()).concat(String.valueOf(eqwVarA2.i())));
        }
        if (iOrdinal == 21) {
            epq.g(ers.DIVIDE.name(), 2, list);
            eqw eqwVar2 = (eqw) list.get(0);
            ere ereVar2 = eppVar.b;
            return new eqo(Double.valueOf(ereVar2.a(eppVar, eqwVar2).h().doubleValue() / ereVar2.a(eppVar, (eqw) list.get(1)).h().doubleValue()));
        }
        if (iOrdinal == 59) {
            epq.g(ers.SUBTRACT.name(), 2, list);
            eqw eqwVar3 = (eqw) list.get(0);
            ere ereVar3 = eppVar.b;
            return new eqo(Double.valueOf(ereVar3.a(eppVar, eqwVar3).h().doubleValue() + new eqo(Double.valueOf(-ereVar3.a(eppVar, (eqw) list.get(1)).h().doubleValue())).a.doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            epq.g(str, 2, list);
            eqw eqwVar4 = (eqw) list.get(0);
            ere ereVar4 = eppVar.b;
            eqw eqwVarA3 = ereVar4.a(eppVar, eqwVar4);
            ereVar4.a(eppVar, (eqw) list.get(1));
            return eqwVarA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            epq.g(str, 1, list);
            return eppVar.b.a(eppVar, (eqw) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                epq.g(ers.MODULUS.name(), 2, list);
                eqw eqwVar5 = (eqw) list.get(0);
                ere ereVar5 = eppVar.b;
                return new eqo(Double.valueOf(ereVar5.a(eppVar, eqwVar5).h().doubleValue() % ereVar5.a(eppVar, (eqw) list.get(1)).h().doubleValue()));
            case 45:
                epq.g(ers.MULTIPLY.name(), 2, list);
                eqw eqwVar6 = (eqw) list.get(0);
                ere ereVar6 = eppVar.b;
                return new eqo(Double.valueOf(ereVar6.a(eppVar, eqwVar6).h().doubleValue() * ereVar6.a(eppVar, (eqw) list.get(1)).h().doubleValue()));
            case 46:
                epq.g(ers.NEGATE.name(), 1, list);
                return new eqo(Double.valueOf(-eppVar.b.a(eppVar, (eqw) list.get(0)).h().doubleValue()));
            default:
                return super.b(str);
        }
    }
}

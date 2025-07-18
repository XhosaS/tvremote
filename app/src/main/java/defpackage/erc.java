package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erc extends erd {
    public erc() {
        this.a.add(ers.BITWISE_AND);
        this.a.add(ers.BITWISE_LEFT_SHIFT);
        this.a.add(ers.BITWISE_NOT);
        this.a.add(ers.BITWISE_OR);
        this.a.add(ers.BITWISE_RIGHT_SHIFT);
        this.a.add(ers.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(ers.BITWISE_XOR);
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        ers ersVar = ers.ADD;
        switch (epq.d(str).ordinal()) {
            case 4:
                epq.g(ers.BITWISE_AND.name(), 2, list);
                eqw eqwVar = (eqw) list.get(0);
                ere ereVar = eppVar.b;
                return new eqo(Double.valueOf(epq.b(ereVar.a(eppVar, eqwVar).h().doubleValue()) & epq.b(ereVar.a(eppVar, (eqw) list.get(1)).h().doubleValue())));
            case 5:
                epq.g(ers.BITWISE_LEFT_SHIFT.name(), 2, list);
                eqw eqwVar2 = (eqw) list.get(0);
                ere ereVar2 = eppVar.b;
                return new eqo(Double.valueOf(epq.b(ereVar2.a(eppVar, eqwVar2).h().doubleValue()) << ((int) (epq.c(ereVar2.a(eppVar, (eqw) list.get(1)).h().doubleValue()) & 31))));
            case 6:
                epq.g(ers.BITWISE_NOT.name(), 1, list);
                return new eqo(Double.valueOf(~epq.b(eppVar.b.a(eppVar, (eqw) list.get(0)).h().doubleValue())));
            case 7:
                epq.g(ers.BITWISE_OR.name(), 2, list);
                eqw eqwVar3 = (eqw) list.get(0);
                ere ereVar3 = eppVar.b;
                return new eqo(Double.valueOf(epq.b(ereVar3.a(eppVar, eqwVar3).h().doubleValue()) | epq.b(ereVar3.a(eppVar, (eqw) list.get(1)).h().doubleValue())));
            case 8:
                epq.g(ers.BITWISE_RIGHT_SHIFT.name(), 2, list);
                eqw eqwVar4 = (eqw) list.get(0);
                ere ereVar4 = eppVar.b;
                return new eqo(Double.valueOf(epq.b(ereVar4.a(eppVar, eqwVar4).h().doubleValue()) >> ((int) (epq.c(ereVar4.a(eppVar, (eqw) list.get(1)).h().doubleValue()) & 31))));
            case 9:
                epq.g(ers.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                eqw eqwVar5 = (eqw) list.get(0);
                ere ereVar5 = eppVar.b;
                return new eqo(Double.valueOf(epq.c(ereVar5.a(eppVar, eqwVar5).h().doubleValue()) >>> ((int) (epq.c(ereVar5.a(eppVar, (eqw) list.get(1)).h().doubleValue()) & 31))));
            case 10:
                epq.g(ers.BITWISE_XOR.name(), 2, list);
                eqw eqwVar6 = (eqw) list.get(0);
                ere ereVar6 = eppVar.b;
                return new eqo(Double.valueOf(epq.b(ereVar6.a(eppVar, eqwVar6).h().doubleValue()) ^ epq.b(ereVar6.a(eppVar, (eqw) list.get(1)).h().doubleValue())));
            default:
                return super.b(str);
        }
    }
}

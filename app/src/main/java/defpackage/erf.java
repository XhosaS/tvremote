package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erf extends erd {
    public erf() {
        this.a.add(ers.EQUALS);
        this.a.add(ers.GREATER_THAN);
        this.a.add(ers.GREATER_THAN_EQUALS);
        this.a.add(ers.IDENTITY_EQUALS);
        this.a.add(ers.IDENTITY_NOT_EQUALS);
        this.a.add(ers.LESS_THAN);
        this.a.add(ers.LESS_THAN_EQUALS);
        this.a.add(ers.NOT_EQUALS);
    }

    private static boolean c(eqw eqwVar, eqw eqwVar2) {
        if (eqwVar.getClass().equals(eqwVar2.getClass())) {
            if ((eqwVar instanceof erb) || (eqwVar instanceof equ)) {
                return true;
            }
            return eqwVar instanceof eqo ? (Double.isNaN(eqwVar.h().doubleValue()) || Double.isNaN(eqwVar2.h().doubleValue()) || eqwVar.h().doubleValue() != eqwVar2.h().doubleValue()) ? false : true : eqwVar instanceof era ? eqwVar.i().equals(eqwVar2.i()) : eqwVar instanceof eqm ? eqwVar.g().equals(eqwVar2.g()) : eqwVar == eqwVar2;
        }
        if (((eqwVar instanceof erb) || (eqwVar instanceof equ)) && ((eqwVar2 instanceof erb) || (eqwVar2 instanceof equ))) {
            return true;
        }
        boolean z = eqwVar instanceof eqo;
        if (z && (eqwVar2 instanceof era)) {
            return c(eqwVar, new eqo(eqwVar2.h()));
        }
        boolean z2 = eqwVar instanceof era;
        if (z2 && (eqwVar2 instanceof eqo)) {
            return c(new eqo(eqwVar.h()), eqwVar2);
        }
        if (eqwVar instanceof eqm) {
            return c(new eqo(eqwVar.h()), eqwVar2);
        }
        if (eqwVar2 instanceof eqm) {
            return c(eqwVar, new eqo(eqwVar2.h()));
        }
        if ((z2 || z) && (eqwVar2 instanceof eqs)) {
            return c(eqwVar, new era(eqwVar2.i()));
        }
        if ((eqwVar instanceof eqs) && ((eqwVar2 instanceof era) || (eqwVar2 instanceof eqo))) {
            return c(new era(eqwVar.i()), eqwVar2);
        }
        return false;
    }

    private static boolean d(eqw eqwVar, eqw eqwVar2) {
        if (eqwVar instanceof eqs) {
            eqwVar = new era(eqwVar.i());
        }
        if (eqwVar2 instanceof eqs) {
            eqwVar2 = new era(eqwVar2.i());
        }
        if ((eqwVar instanceof era) && (eqwVar2 instanceof era)) {
            return eqwVar.i().compareTo(eqwVar2.i()) < 0;
        }
        double dDoubleValue = eqwVar.h().doubleValue();
        double dDoubleValue2 = eqwVar2.h().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(eqw eqwVar, eqw eqwVar2) {
        if (eqwVar instanceof eqs) {
            eqwVar = new era(eqwVar.i());
        }
        if (eqwVar2 instanceof eqs) {
            eqwVar2 = new era(eqwVar2.i());
        }
        return (((eqwVar instanceof era) && (eqwVar2 instanceof era)) || !(Double.isNaN(eqwVar.h().doubleValue()) || Double.isNaN(eqwVar2.h().doubleValue()))) && !d(eqwVar2, eqwVar);
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        boolean zC;
        boolean zC2;
        epq.g(epq.d(str).name(), 2, list);
        eqw eqwVar = (eqw) list.get(0);
        ere ereVar = eppVar.b;
        eqw eqwVarA = ereVar.a(eppVar, eqwVar);
        eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(1));
        int iOrdinal = epq.d(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zC2 = c(eqwVarA, eqwVarA2);
            } else if (iOrdinal == 42) {
                zC = d(eqwVarA, eqwVarA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zC = d(eqwVarA2, eqwVarA);
                        break;
                    case 38:
                        zC = e(eqwVarA2, eqwVarA);
                        break;
                    case 39:
                        zC = epq.k(eqwVarA, eqwVarA2);
                        break;
                    case 40:
                        zC2 = epq.k(eqwVarA, eqwVarA2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zC = e(eqwVarA, eqwVarA2);
            }
            zC = !zC2;
        } else {
            zC = c(eqwVarA, eqwVarA2);
        }
        return zC ? eqw.k : eqw.l;
    }
}

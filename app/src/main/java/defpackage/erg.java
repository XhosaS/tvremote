package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erg extends erd {
    protected erg() {
        this.a.add(ers.APPLY);
        this.a.add(ers.BLOCK);
        this.a.add(ers.BREAK);
        this.a.add(ers.CASE);
        this.a.add(ers.DEFAULT);
        this.a.add(ers.CONTINUE);
        this.a.add(ers.DEFINE_FUNCTION);
        this.a.add(ers.FN);
        this.a.add(ers.IF);
        this.a.add(ers.QUOTE);
        this.a.add(ers.RETURN);
        this.a.add(ers.SWITCH);
        this.a.add(ers.TERNARY);
    }

    private static eqw c(epp eppVar, List list) {
        epq.h(ers.FN.name(), 2, list);
        eqw eqwVar = (eqw) list.get(0);
        ere ereVar = eppVar.b;
        eqw eqwVarA = ereVar.a(eppVar, eqwVar);
        eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(1));
        if (!(eqwVarA2 instanceof eql)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", eqwVarA2.getClass().getCanonicalName()));
        }
        List listM = ((eql) eqwVarA2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new eqv(eqwVarA.i(), listM, arrayList, eppVar);
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        ers ersVar = ers.ADD;
        int iOrdinal = epq.d(str).ordinal();
        if (iOrdinal == 2) {
            epq.g(ers.APPLY.name(), 3, list);
            eqw eqwVar = (eqw) list.get(0);
            ere ereVar = eppVar.b;
            eqw eqwVarA = ereVar.a(eppVar, eqwVar);
            String strI = ereVar.a(eppVar, (eqw) list.get(1)).i();
            eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(2));
            if (!(eqwVarA2 instanceof eql)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", eqwVarA2.getClass().getCanonicalName()));
            }
            if (strI.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return eqwVarA.cK(strI, eppVar, ((eql) eqwVarA2).m());
        }
        if (iOrdinal == 15) {
            epq.g(ers.BREAK.name(), 0, list);
            return eqw.h;
        }
        if (iOrdinal == 25) {
            return c(eppVar, list);
        }
        if (iOrdinal == 41) {
            epq.h(ers.IF.name(), 2, list);
            eqw eqwVar2 = (eqw) list.get(0);
            ere ereVar2 = eppVar.b;
            eqw eqwVarA3 = ereVar2.a(eppVar, eqwVar2);
            eqw eqwVarA4 = ereVar2.a(eppVar, (eqw) list.get(1));
            eqw eqwVarA5 = list.size() > 2 ? ereVar2.a(eppVar, (eqw) list.get(2)) : null;
            eqw eqwVar3 = eqw.f;
            eqw eqwVarB = eqwVarA3.g().booleanValue() ? eppVar.b((eql) eqwVarA4) : eqwVarA5 != null ? eppVar.b((eql) eqwVarA5) : eqwVar3;
            return true != (eqwVarB instanceof eqn) ? eqwVar3 : eqwVarB;
        }
        if (iOrdinal == 54) {
            return new eql(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return eqw.j;
            }
            epq.g(ers.RETURN.name(), 1, list);
            return new eqn("return", eppVar.b.a(eppVar, (eqw) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                epq.h(ers.DEFINE_FUNCTION.name(), 2, list);
                eqw eqwVarC = c(eppVar, list);
                String str2 = ((eqp) eqwVarC).d;
                if (str2 == null) {
                    eppVar.f("", eqwVarC);
                    return eqwVarC;
                }
                eppVar.f(str2, eqwVarC);
                return eqwVarC;
            }
            if (iOrdinal == 60) {
                epq.g(ers.SWITCH.name(), 3, list);
                eqw eqwVar4 = (eqw) list.get(0);
                ere ereVar3 = eppVar.b;
                eqw eqwVarA6 = ereVar3.a(eppVar, eqwVar4);
                eqw eqwVarA7 = ereVar3.a(eppVar, (eqw) list.get(1));
                eqw eqwVarA8 = ereVar3.a(eppVar, (eqw) list.get(2));
                if (!(eqwVarA7 instanceof eql)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(eqwVarA8 instanceof eql)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                eql eqlVar = (eql) eqwVarA7;
                eql eqlVar2 = (eql) eqwVarA8;
                boolean z = false;
                for (int i = 0; i < eqlVar.c(); i++) {
                    if (z || eqwVarA6.equals(ereVar3.a(eppVar, eqlVar.e(i)))) {
                        eqw eqwVarA9 = ereVar3.a(eppVar, eqlVar2.e(i));
                        if (eqwVarA9 instanceof eqn) {
                            return ((eqn) eqwVarA9).b.equals("break") ? eqw.f : eqwVarA9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (eqlVar.c() + 1 == eqlVar2.c()) {
                    eqw eqwVarA10 = ereVar3.a(eppVar, eqlVar2.e(eqlVar.c()));
                    if (eqwVarA10 instanceof eqn) {
                        String str3 = ((eqn) eqwVarA10).b;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return eqwVarA10;
                        }
                    }
                }
                return eqw.f;
            }
            if (iOrdinal == 61) {
                epq.g(ers.TERNARY.name(), 3, list);
                eqw eqwVar5 = (eqw) list.get(0);
                ere ereVar4 = eppVar.b;
                return ereVar4.a(eppVar, eqwVar5).g().booleanValue() ? ereVar4.a(eppVar, (eqw) list.get(1)) : ereVar4.a(eppVar, (eqw) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return eppVar.a().b(new eql(list));
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    epq.g(ers.BREAK.name(), 0, list);
                    return eqw.i;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return eqw.f;
        }
        eqw eqwVarA11 = eppVar.b.a(eppVar, (eqw) list.get(0));
        return eqwVarA11 instanceof eql ? eppVar.b((eql) eqwVarA11) : eqw.f;
    }
}

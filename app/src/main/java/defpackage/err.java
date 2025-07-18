package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class err extends erd {
    protected err() {
        this.a.add(ers.ASSIGN);
        this.a.add(ers.CONST);
        this.a.add(ers.CREATE_ARRAY);
        this.a.add(ers.CREATE_OBJECT);
        this.a.add(ers.EXPRESSION_LIST);
        this.a.add(ers.GET);
        this.a.add(ers.GET_INDEX);
        this.a.add(ers.GET_PROPERTY);
        this.a.add(ers.NULL);
        this.a.add(ers.SET_PROPERTY);
        this.a.add(ers.TYPEOF);
        this.a.add(ers.UNDEFINED);
        this.a.add(ers.VAR);
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        String str2;
        ers ersVar = ers.ADD;
        int iOrdinal = epq.d(str).ordinal();
        int i = 0;
        if (iOrdinal == 3) {
            epq.g(ers.ASSIGN.name(), 2, list);
            eqw eqwVar = (eqw) list.get(0);
            ere ereVar = eppVar.b;
            eqw eqwVarA = ereVar.a(eppVar, eqwVar);
            if (!(eqwVarA instanceof era)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", eqwVarA.getClass().getCanonicalName()));
            }
            if (!eppVar.g(eqwVarA.i())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", eqwVarA.i()));
            }
            eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(1));
            eppVar.f(eqwVarA.i(), eqwVarA2);
            return eqwVarA2;
        }
        if (iOrdinal == 14) {
            epq.h(ers.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                eqw eqwVar2 = (eqw) list.get(i2);
                ere ereVar2 = eppVar.b;
                eqw eqwVarA3 = ereVar2.a(eppVar, eqwVar2);
                if (!(eqwVarA3 instanceof era)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", eqwVarA3.getClass().getCanonicalName()));
                }
                eppVar.e(eqwVarA3.i(), ereVar2.a(eppVar, (eqw) list.get(i2 + 1)));
            }
            return eqw.f;
        }
        if (iOrdinal == 24) {
            epq.h(ers.EXPRESSION_LIST.name(), 1, list);
            eqw eqwVarA4 = eqw.f;
            while (i < list.size()) {
                eqwVarA4 = eppVar.b.a(eppVar, (eqw) list.get(i));
                if (eqwVarA4 instanceof eqn) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return eqwVarA4;
        }
        if (iOrdinal == 33) {
            epq.g(ers.GET.name(), 1, list);
            eqw eqwVarA5 = eppVar.b.a(eppVar, (eqw) list.get(0));
            if (eqwVarA5 instanceof era) {
                return eppVar.c(eqwVarA5.i());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", eqwVarA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            epq.g(ers.NULL.name(), 0, list);
            return eqw.g;
        }
        if (iOrdinal == 58) {
            epq.g(ers.SET_PROPERTY.name(), 3, list);
            eqw eqwVar3 = (eqw) list.get(0);
            ere ereVar3 = eppVar.b;
            eqw eqwVarA6 = ereVar3.a(eppVar, eqwVar3);
            eqw eqwVarA7 = ereVar3.a(eppVar, (eqw) list.get(1));
            eqw eqwVarA8 = ereVar3.a(eppVar, (eqw) list.get(2));
            if (eqwVarA6 == eqw.f || eqwVarA6 == eqw.g) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", eqwVarA7.i(), eqwVarA6.i()));
            }
            if ((eqwVarA6 instanceof eql) && (eqwVarA7 instanceof eqo)) {
                ((eql) eqwVarA6).p(eqwVarA7.h().intValue(), eqwVarA8);
                return eqwVarA8;
            }
            if (!(eqwVarA6 instanceof eqs)) {
                return eqwVarA8;
            }
            ((eqs) eqwVarA6).q(eqwVarA7.i(), eqwVarA8);
            return eqwVarA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new eql();
            }
            eql eqlVar = new eql();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eqw eqwVarA9 = eppVar.b.a(eppVar, (eqw) it.next());
                if (eqwVarA9 instanceof eqn) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                eqlVar.p(i, eqwVarA9);
                i++;
            }
            return eqlVar;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new eqt();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            eqt eqtVar = new eqt();
            while (i < list.size() - 1) {
                eqw eqwVar4 = (eqw) list.get(i);
                ere ereVar4 = eppVar.b;
                eqw eqwVarA10 = ereVar4.a(eppVar, eqwVar4);
                eqw eqwVarA11 = ereVar4.a(eppVar, (eqw) list.get(i + 1));
                if ((eqwVarA10 instanceof eqn) || (eqwVarA11 instanceof eqn)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                eqtVar.q(eqwVarA10.i(), eqwVarA11);
                i += 2;
            }
            return eqtVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            epq.g(ers.GET_PROPERTY.name(), 2, list);
            eqw eqwVar5 = (eqw) list.get(0);
            ere ereVar5 = eppVar.b;
            eqw eqwVarA12 = ereVar5.a(eppVar, eqwVar5);
            eqw eqwVarA13 = ereVar5.a(eppVar, (eqw) list.get(1));
            if ((eqwVarA12 instanceof eql) && epq.j(eqwVarA13)) {
                return ((eql) eqwVarA12).e(eqwVarA13.h().intValue());
            }
            if (eqwVarA12 instanceof eqs) {
                return ((eqs) eqwVarA12).f(eqwVarA13.i());
            }
            if (eqwVarA12 instanceof era) {
                if ("length".equals(eqwVarA13.i())) {
                    return new eqo(Double.valueOf(eqwVarA12.i().length()));
                }
                if (epq.j(eqwVarA13) && eqwVarA13.h().doubleValue() < eqwVarA12.i().length()) {
                    return new era(String.valueOf(eqwVarA12.i().charAt(eqwVarA13.h().intValue())));
                }
            }
            return eqw.f;
        }
        switch (iOrdinal) {
            case 62:
                epq.g(ers.TYPEOF.name(), 1, list);
                eqw eqwVarA14 = eppVar.b.a(eppVar, (eqw) list.get(0));
                if (eqwVarA14 instanceof erb) {
                    str2 = "undefined";
                } else if (eqwVarA14 instanceof eqm) {
                    str2 = "boolean";
                } else if (eqwVarA14 instanceof eqo) {
                    str2 = "number";
                } else if (eqwVarA14 instanceof era) {
                    str2 = "string";
                } else if (eqwVarA14 instanceof eqv) {
                    str2 = "function";
                } else {
                    if ((eqwVarA14 instanceof eqx) || (eqwVarA14 instanceof eqn)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", eqwVarA14));
                    }
                    str2 = "object";
                }
                return new era(str2);
            case 63:
                epq.g(ers.UNDEFINED.name(), 0, list);
                return eqw.f;
            case 64:
                epq.h(ers.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    eqw eqwVarA15 = eppVar.b.a(eppVar, (eqw) it2.next());
                    if (!(eqwVarA15 instanceof era)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", eqwVarA15.getClass().getCanonicalName()));
                    }
                    eppVar.d(eqwVarA15.i(), eqw.f);
                }
                return eqw.f;
            default:
                return super.b(str);
        }
    }
}

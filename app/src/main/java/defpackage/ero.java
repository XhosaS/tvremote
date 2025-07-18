package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ero extends erd {
    protected ero() {
        this.a.add(ers.FOR_IN);
        this.a.add(ers.FOR_IN_CONST);
        this.a.add(ers.FOR_IN_LET);
        this.a.add(ers.FOR_LET);
        this.a.add(ers.FOR_OF);
        this.a.add(ers.FOR_OF_CONST);
        this.a.add(ers.FOR_OF_LET);
        this.a.add(ers.WHILE);
    }

    private static eqw c(erm ermVar, Iterator it, eqw eqwVar) {
        if (it != null) {
            while (it.hasNext()) {
                eqw eqwVarB = ermVar.a((eqw) it.next()).b((eql) eqwVar);
                if (eqwVarB instanceof eqn) {
                    eqn eqnVar = (eqn) eqwVarB;
                    String str = eqnVar.b;
                    if ("break".equals(str)) {
                        return eqw.f;
                    }
                    if ("return".equals(str)) {
                        return eqnVar;
                    }
                }
            }
        }
        return eqw.f;
    }

    private static eqw d(erm ermVar, eqw eqwVar, eqw eqwVar2) {
        return c(ermVar, eqwVar.l(), eqwVar2);
    }

    private static eqw e(erm ermVar, eqw eqwVar, eqw eqwVar2) {
        if (eqwVar instanceof Iterable) {
            return c(ermVar, ((Iterable) eqwVar).iterator(), eqwVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // defpackage.erd
    public final eqw a(String str, epp eppVar, List list) {
        ers ersVar = ers.ADD;
        int iOrdinal = epq.d(str).ordinal();
        if (iOrdinal == 65) {
            epq.g(ers.WHILE.name(), 4, list);
            eqw eqwVar = (eqw) list.get(0);
            eqw eqwVar2 = (eqw) list.get(1);
            eqw eqwVar3 = (eqw) list.get(2);
            eqw eqwVar4 = (eqw) list.get(3);
            ere ereVar = eppVar.b;
            eqw eqwVarA = ereVar.a(eppVar, eqwVar4);
            if (ereVar.a(eppVar, eqwVar3).g().booleanValue()) {
                eqw eqwVarB = eppVar.b((eql) eqwVarA);
                if (eqwVarB instanceof eqn) {
                    eqn eqnVar = (eqn) eqwVarB;
                    String str2 = eqnVar.b;
                    if ("break".equals(str2)) {
                        return eqw.f;
                    }
                    if ("return".equals(str2)) {
                        return eqnVar;
                    }
                }
            }
            while (ereVar.a(eppVar, eqwVar).g().booleanValue()) {
                eqw eqwVarB2 = eppVar.b((eql) eqwVarA);
                if (eqwVarB2 instanceof eqn) {
                    eqn eqnVar2 = (eqn) eqwVarB2;
                    String str3 = eqnVar2.b;
                    if ("break".equals(str3)) {
                        return eqw.f;
                    }
                    if ("return".equals(str3)) {
                        return eqnVar2;
                    }
                }
                ereVar.a(eppVar, eqwVar2);
            }
            return eqw.f;
        }
        switch (iOrdinal) {
            case 26:
                epq.g(ers.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof era)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String strI = ((eqw) list.get(0)).i();
                eqw eqwVar5 = (eqw) list.get(1);
                ere ereVar2 = eppVar.b;
                return d(new ern(eppVar, strI), ereVar2.a(eppVar, eqwVar5), ereVar2.a(eppVar, (eqw) list.get(2)));
            case 27:
                epq.g(ers.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof era)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                String strI2 = ((eqw) list.get(0)).i();
                eqw eqwVar6 = (eqw) list.get(1);
                ere ereVar3 = eppVar.b;
                return d(new erk(eppVar, strI2), ereVar3.a(eppVar, eqwVar6), ereVar3.a(eppVar, (eqw) list.get(2)));
            case 28:
                epq.g(ers.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof era)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String strI3 = ((eqw) list.get(0)).i();
                eqw eqwVar7 = (eqw) list.get(1);
                ere ereVar4 = eppVar.b;
                return d(new erl(eppVar, strI3), ereVar4.a(eppVar, eqwVar7), ereVar4.a(eppVar, (eqw) list.get(2)));
            case 29:
                epq.g(ers.FOR_LET.name(), 4, list);
                eqw eqwVar8 = (eqw) list.get(0);
                ere ereVar5 = eppVar.b;
                eqw eqwVarA2 = ereVar5.a(eppVar, eqwVar8);
                if (!(eqwVarA2 instanceof eql)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                eql eqlVar = (eql) eqwVarA2;
                eqw eqwVar9 = (eqw) list.get(1);
                eqw eqwVar10 = (eqw) list.get(2);
                eqw eqwVarA3 = ereVar5.a(eppVar, (eqw) list.get(3));
                epp eppVarA = eppVar.a();
                for (int i = 0; i < eqlVar.c(); i++) {
                    String strI4 = eqlVar.e(i).i();
                    eppVarA.f(strI4, eppVar.c(strI4));
                }
                while (ereVar5.a(eppVar, eqwVar9).g().booleanValue()) {
                    eqw eqwVarB3 = eppVar.b((eql) eqwVarA3);
                    if (eqwVarB3 instanceof eqn) {
                        eqn eqnVar3 = (eqn) eqwVarB3;
                        String str4 = eqnVar3.b;
                        if ("break".equals(str4)) {
                            return eqw.f;
                        }
                        if ("return".equals(str4)) {
                            return eqnVar3;
                        }
                    }
                    epp eppVarA2 = eppVar.a();
                    for (int i2 = 0; i2 < eqlVar.c(); i2++) {
                        String strI5 = eqlVar.e(i2).i();
                        eppVarA2.f(strI5, eppVarA.c(strI5));
                    }
                    eppVarA2.b.a(eppVarA2, eqwVar10);
                    eppVarA = eppVarA2;
                }
                return eqw.f;
            case 30:
                epq.g(ers.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof era)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                String strI6 = ((eqw) list.get(0)).i();
                eqw eqwVar11 = (eqw) list.get(1);
                ere ereVar6 = eppVar.b;
                return e(new ern(eppVar, strI6), ereVar6.a(eppVar, eqwVar11), ereVar6.a(eppVar, (eqw) list.get(2)));
            case 31:
                epq.g(ers.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof era)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                String strI7 = ((eqw) list.get(0)).i();
                eqw eqwVar12 = (eqw) list.get(1);
                ere ereVar7 = eppVar.b;
                return e(new erk(eppVar, strI7), ereVar7.a(eppVar, eqwVar12), ereVar7.a(eppVar, (eqw) list.get(2)));
            case 32:
                epq.g(ers.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof era)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                String strI8 = ((eqw) list.get(0)).i();
                eqw eqwVar13 = (eqw) list.get(1);
                ere ereVar8 = eppVar.b;
                return e(new erl(eppVar, strI8), ereVar8.a(eppVar, eqwVar13), ereVar8.a(eppVar, (eqw) list.get(2)));
            default:
                return super.b(str);
        }
    }
}

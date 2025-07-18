package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahal {
    public static final Object a(agte agteVar, agvb agvbVar, agsw agswVar) throws Throwable {
        Object objB;
        agte agteVarFr = agswVar.fr();
        agte agteVarA = ahbj.a(agteVarFr, agteVar);
        ahdp.e(agteVarA);
        if (agteVarA == agteVarFr) {
            ahmc ahmcVar = new ahmc(agteVarA, agswVar);
            objB = ahmv.a(ahmcVar, true, ahmcVar, agvbVar);
        } else {
            agsx agsxVar = agsy.b;
            if (agvy.c(agteVarA.get(agsxVar), agteVarFr.get(agsxVar))) {
                aher aherVar = new aher(agteVarA, agswVar);
                agte agteVar2 = ((ahab) aherVar).a;
                Object objB2 = ahmn.b(agteVar2, null);
                try {
                    Object objA = ahmv.a(aherVar, true, aherVar, agvbVar);
                    ahmn.c(agteVar2, objB2);
                    objB = objA;
                } catch (Throwable th) {
                    ahmn.c(agteVar2, objB2);
                    throw th;
                }
            } else {
                ahch ahchVar = new ahch(agteVarA, agswVar);
                ahmu.b(agvbVar, ahchVar, ahchVar);
                agzw agzwVar = ahchVar.b;
                while (true) {
                    int i = agzwVar.c;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = ahdw.b(ahchVar.d.a);
                        if (objB instanceof ahbc) {
                            throw ((ahbc) objB).b;
                        }
                    } else if (agzwVar.a(0, 1)) {
                        objB = agtg.a;
                        break;
                    }
                }
            }
        }
        if (objB == agtg.a) {
            agswVar.getClass();
        }
        return objB;
    }

    public static final ahcb b(ahbt ahbtVar, agte agteVar, int i, agvb agvbVar) {
        boolean zC = ahbv.c(i);
        agte agteVarB = ahbj.b(ahbtVar, agteVar);
        ahcc ahdxVar = zC ? new ahdx(agteVarB, agvbVar) : new ahcc(agteVarB, true);
        ahbv.b(i, agvbVar, ahdxVar, ahdxVar);
        return ahdxVar;
    }

    public static final ahdl c(ahbt ahbtVar, agte agteVar, int i, agvb agvbVar) {
        boolean zC = ahbv.c(i);
        agte agteVarB = ahbj.b(ahbtVar, agteVar);
        ahab ahdyVar = zC ? new ahdy(agteVarB, agvbVar) : new ahei(agteVarB, true);
        ahbv.b(i, agvbVar, ahdyVar, ahdyVar);
        return ahdyVar;
    }

    public static /* synthetic */ ahcb d(ahbt ahbtVar, agte agteVar, int i, agvb agvbVar, int i2) {
        if ((i2 & 1) != 0) {
            agteVar = agtf.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return b(ahbtVar, agteVar, i, agvbVar);
    }

    public static /* synthetic */ ahdl e(ahbt ahbtVar, agte agteVar, int i, agvb agvbVar, int i2) {
        if ((i2 & 1) != 0) {
            agteVar = agtf.a;
        }
        return c(ahbtVar, agteVar, i | (((i2 & 2) != 0 ? 0 : 1) ^ 1), agvbVar);
    }
}

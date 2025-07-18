package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbj {
    public static final agte a(agte agteVar, agte agteVar2) {
        return !e(agteVar2) ? agteVar.plus(agteVar2) : d(agteVar, agteVar2, false);
    }

    public static final agte b(ahbt ahbtVar, agte agteVar) {
        agte agteVarD = d(ahbtVar.fs(), agteVar, true);
        agte agteVarPlus = ahbx.a ? agteVarD.plus(new ahbq(ahbx.c.incrementAndGet())) : agteVarD;
        ahbm ahbmVar = ahcl.a;
        return (agteVarD == ahbmVar || agteVarD.get(agsy.b) != null) ? agteVarPlus : agteVarPlus.plus(ahbmVar);
    }

    public static final aher c(agsw agswVar, agte agteVar, Object obj) {
        aher aherVar = null;
        if (!(agswVar instanceof agtr)) {
            return null;
        }
        if (agteVar.get(ahes.a) != null) {
            agtr agtrVarFt = (agtr) agswVar;
            while (true) {
                if ((agtrVarFt instanceof ahch) || (agtrVarFt = agtrVarFt.ft()) == null) {
                    break;
                }
                if (agtrVarFt instanceof aher) {
                    aherVar = (aher) agtrVarFt;
                    break;
                }
            }
            if (aherVar != null) {
                aherVar.Q(agteVar, obj);
            }
        }
        return aherVar;
    }

    private static final agte d(agte agteVar, agte agteVar2, final boolean z) {
        boolean zE = e(agteVar);
        boolean zE2 = e(agteVar2);
        if (!zE && !zE2) {
            return agteVar.plus(agteVar2);
        }
        final agwh agwhVar = new agwh();
        agwhVar.a = agteVar2;
        agtf agtfVar = agtf.a;
        agte agteVar3 = (agte) agteVar.fold(agtfVar, new agvb() { // from class: ahbh
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                agte agteVar4 = (agte) obj;
                agtc agtcVar = (agtc) obj2;
                if (!(agtcVar instanceof wzc)) {
                    return agteVar4.plus(agtcVar);
                }
                agwh agwhVar2 = agwhVar;
                agtc agtcVar2 = ((agte) agwhVar2.a).get(agtcVar.getKey());
                if (agtcVar2 == null) {
                    return agteVar4.plus(z ? ((wzc) agtcVar).c() : (wzc) agtcVar);
                }
                agwhVar2.a = ((agte) agwhVar2.a).minusKey(agtcVar.getKey());
                wzc wzcVar = (wzc) agtcVar;
                wzc wzcVar2 = (wzc) agtcVar2.get(wzc.a);
                boolean z2 = wzcVar2 != null ? wzcVar2.b : false;
                wwn wwnVar = wzcVar.c;
                boolean z3 = true;
                if (!z2 && !wum.a) {
                    z3 = false;
                }
                return agteVar4.plus(new wzc(wwnVar, z3, false));
            }
        });
        if (zE2) {
            agwhVar.a = ((agte) agwhVar.a).fold(agtfVar, new agvb() { // from class: ahbi
                @Override // defpackage.agvb
                public final Object a(Object obj, Object obj2) {
                    agte agteVar4 = (agte) obj;
                    agtc agtcVar = (agtc) obj2;
                    return agtcVar instanceof wzc ? agteVar4.plus(((wzc) agtcVar).c()) : agteVar4.plus(agtcVar);
                }
            });
        }
        return agteVar3.plus((agte) agwhVar.a);
    }

    private static final boolean e(agte agteVar) {
        return ((Boolean) agteVar.fold(false, new agvb() { // from class: ahbg
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                agtc agtcVar = (agtc) obj2;
                boolean z = true;
                if (!((Boolean) obj).booleanValue() && !(agtcVar instanceof wzc)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agta {
    public static agte a(agte agteVar, agte agteVar2) {
        agteVar2.getClass();
        return agteVar2 == agtf.a ? agteVar : (agte) agteVar2.fold(agteVar, new agvb() { // from class: agsz
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                agte agteVar3 = (agte) obj;
                agtc agtcVar = (agtc) obj2;
                agteVar3.getClass();
                agtcVar.getClass();
                agte agteVarMinusKey = agteVar3.minusKey(agtcVar.getKey());
                agtf agtfVar = agtf.a;
                if (agteVarMinusKey == agtfVar) {
                    return agtcVar;
                }
                agsx agsxVar = agsy.b;
                agsy agsyVar = (agsy) agteVarMinusKey.get(agsxVar);
                if (agsyVar == null) {
                    return new agsv(agteVarMinusKey, agtcVar);
                }
                agte agteVarMinusKey2 = agteVarMinusKey.minusKey(agsxVar);
                return agteVarMinusKey2 == agtfVar ? new agsv(agtcVar, agsyVar) : new agsv(new agsv(agteVarMinusKey2, agtcVar), agsyVar);
            }
        });
    }
}

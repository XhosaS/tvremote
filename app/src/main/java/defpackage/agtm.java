package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agtm {
    public static final Object a(agvb agvbVar, Object obj, agsw agswVar) {
        agvbVar.getClass();
        agte agteVarFr = agswVar.fr();
        Object agtkVar = agteVarFr == agtf.a ? new agtk(agswVar) : new agtl(agswVar, agteVarFr);
        agwk.b(agvbVar, 2);
        return agvbVar.a(obj, agtkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final agsw b(agvb agvbVar, Object obj, agsw agswVar) {
        if (agvbVar instanceof agto) {
            return ((agto) agvbVar).c(obj, agswVar);
        }
        agte agteVarFr = agswVar.fr();
        return agteVarFr == agtf.a ? new agti(agswVar, agvbVar, obj) : new agtj(agswVar, agteVarFr, agvbVar, obj);
    }

    public static final agsw c(agsw agswVar) {
        agswVar.getClass();
        agtq agtqVar = agswVar instanceof agtq ? (agtq) agswVar : null;
        if (agtqVar != null && (agswVar = agtqVar.F) == null) {
            agsy agsyVar = (agsy) agtqVar.fr().get(agsy.b);
            agswVar = agsyVar != null ? agsyVar.fp(agtqVar) : agtqVar;
            agtqVar.F = agswVar;
        }
        return agswVar;
    }
}

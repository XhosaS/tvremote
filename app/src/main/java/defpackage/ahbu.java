package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbu {
    public static final Object a(agvb agvbVar, agsw agswVar) {
        ahmc ahmcVar = new ahmc(agswVar.fr(), agswVar);
        Object objA = ahmv.a(ahmcVar, true, ahmcVar, agvbVar);
        if (objA == agtg.a) {
            agswVar.getClass();
        }
        return objA;
    }

    public static final ahbt b(agte agteVar) {
        if (agteVar.get(ahdl.c) == null) {
            agteVar = agteVar.plus(new ahdn(null));
        }
        return new ahky(agteVar);
    }

    public static final void c(ahbt ahbtVar) {
        ahdp.e(ahbtVar.fs());
    }

    public static final boolean d(ahbt ahbtVar) {
        ahdl ahdlVar = (ahdl) ahbtVar.fs().get(ahdl.c);
        if (ahdlVar != null) {
            return ahdlVar.t();
        }
        return true;
    }
}

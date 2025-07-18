package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbv {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNDISPATCHED" : "ATOMIC" : "LAZY" : "DEFAULT";
    }

    public static void b(int i, agvb agvbVar, Object obj, agsw agswVar) {
        Object objA;
        int i2 = i - 1;
        if (i2 == 0) {
            ahmu.b(agvbVar, obj, agswVar);
            return;
        }
        if (i2 == 2) {
            agth.c(agth.b(agvbVar, obj, agswVar)).e(agpu.a);
            return;
        }
        if (i2 != 3) {
            return;
        }
        try {
            agte agteVarFr = agswVar.fr();
            Object objB = ahmn.b(agteVarFr, null);
            try {
                if (agvbVar instanceof agto) {
                    agwk.b(agvbVar, 2);
                    objA = agvbVar.a(obj, agswVar);
                } else {
                    objA = agth.a(agvbVar, obj, agswVar);
                }
                if (objA != agtg.a) {
                    agswVar.e(objA);
                }
            } finally {
                ahmn.c(agteVarFr, objB);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ahcg) {
                th = ((ahcg) th).a;
            }
            agswVar.e(agpl.a(th));
        }
    }

    public static boolean c(int i) {
        return i == 2;
    }
}

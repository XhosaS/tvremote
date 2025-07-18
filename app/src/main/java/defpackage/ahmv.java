package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmv {
    public static final Object a(ahmc ahmcVar, boolean z, Object obj, agvb agvbVar) {
        Object ahbcVar;
        Object objB;
        try {
            if (agvbVar instanceof agto) {
                agwk.b(agvbVar, 2);
                ahbcVar = agvbVar.a(obj, ahmcVar);
            } else {
                ahbcVar = agth.a(agvbVar, obj, ahmcVar);
            }
        } catch (ahcg e) {
            Throwable th = e.a;
            ahmcVar.N(new ahbc(th, false));
            agsw agswVar = ahmcVar.e;
            if (ahbx.b && (agswVar instanceof agtr)) {
                throw ahmf.a(th, (agtr) agswVar);
            }
            throw th;
        } catch (Throwable th2) {
            ahbcVar = new ahbc(th2, false);
        }
        agtg agtgVar = agtg.a;
        if (ahbcVar == agtgVar || (objB = ahmcVar.B(ahbcVar)) == ahdw.b) {
            return agtgVar;
        }
        ahmcVar.P();
        if (!(objB instanceof ahbc)) {
            return ahdw.b(objB);
        }
        if (!z) {
            Throwable th3 = ((ahbc) objB).b;
            if ((th3 instanceof ahem) && ((ahem) th3).a == ahmcVar) {
                if (!(ahbcVar instanceof ahbc)) {
                    return ahbcVar;
                }
                Throwable th4 = ((ahbc) ahbcVar).b;
                agsw agswVar2 = ahmcVar.e;
                if (ahbx.b && (agswVar2 instanceof agtr)) {
                    throw ahmf.a(th4, (agtr) agswVar2);
                }
                throw th4;
            }
        }
        Throwable th5 = ((ahbc) objB).b;
        agsw agswVar3 = ahmcVar.e;
        if (ahbx.b && (agswVar3 instanceof agtr)) {
            throw ahmf.a(th5, (agtr) agswVar3);
        }
        throw th5;
    }
}

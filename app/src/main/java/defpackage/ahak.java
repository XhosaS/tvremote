package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahak {
    public static final Object a(agte agteVar, agvb agvbVar) throws Throwable {
        ahcr ahcrVarA;
        agte agteVarB;
        long jK;
        Thread threadCurrentThread = Thread.currentThread();
        agsy agsyVar = (agsy) agteVar.get(agsy.b);
        if (agsyVar == null) {
            ahcrVarA = ahel.a.a();
            agteVarB = ahbj.b(ahde.a, agteVar.plus(ahcrVarA));
        } else {
            if (agsyVar instanceof ahcr) {
            }
            ahel ahelVar = ahel.a;
            ahcrVarA = (ahcr) ahel.b.get();
            agteVarB = ahbj.b(ahde.a, agteVar);
        }
        ahai ahaiVar = new ahai(agteVarB, threadCurrentThread, ahcrVarA);
        ahbv.b(1, agvbVar, ahaiVar, ahaiVar);
        ahcr ahcrVar = ahaiVar.b;
        if (ahcrVar != null) {
            ahcrVar.n(false);
        }
        while (true) {
            if (ahcrVar != null) {
                try {
                    jK = ahcrVar.k();
                } catch (Throwable th) {
                    ahcr ahcrVar2 = ahaiVar.b;
                    if (ahcrVar2 != null) {
                        ahcrVar2.l(false);
                    }
                    throw th;
                }
            } else {
                jK = Long.MAX_VALUE;
            }
            if (ahaiVar.v()) {
                break;
            }
            LockSupport.parkNanos(ahaiVar, jK);
            if (Thread.interrupted()) {
                ahaiVar.K(new InterruptedException());
            }
        }
        ahcr ahcrVar3 = ahaiVar.b;
        if (ahcrVar3 != null) {
            ahcrVar3.l(false);
        }
        Object objB = ahdw.b(ahaiVar.d.a);
        ahbc ahbcVar = objB instanceof ahbc ? (ahbc) objB : null;
        if (ahbcVar == null) {
            return objB;
        }
        throw ahbcVar.b;
    }
}

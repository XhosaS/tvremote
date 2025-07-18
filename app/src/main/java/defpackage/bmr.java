package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bmr {
    public static final Object a(bmn bmnVar, agux aguxVar, agsw agswVar) {
        return (bmnVar.r() && bmnVar.t() && bmnVar.s()) ? aguxVar.a(agswVar) : agswVar.fr().get(bms.a) == null ? aguxVar.a(agswVar) : b(bmnVar, aguxVar, agswVar);
    }

    public static final Object b(bmn bmnVar, agux aguxVar, agsw agswVar) {
        bmq bmqVar = new bmq(aguxVar, null);
        bnc bncVar = (bnc) agswVar.fr().get(bnc.a);
        agsy agsyVar = bncVar != null ? bncVar.b : null;
        return agsyVar != null ? ahal.a(agsyVar, bmqVar, agswVar) : c(bmnVar, bmqVar, agswVar);
    }

    private static final Object c(bmn bmnVar, agvb agvbVar, agsw agswVar) {
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        try {
            Executor executor = bmnVar.d;
            if (executor == null) {
                agvy.b("internalTransactionExecutor");
                executor = null;
            }
            executor.execute(new bmp(aharVar, bmnVar, agvbVar));
        } catch (RejectedExecutionException e) {
            aharVar.k(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objM = aharVar.m();
        if (objM == agtg.a) {
            agswVar.getClass();
        }
        return objM;
    }
}

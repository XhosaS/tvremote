package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agen {
    public static final afel a;
    private static final Logger b = Logger.getLogger(agen.class.getName());

    static {
        if (!yqv.c(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new afel("internal-stub-type", null);
    }

    private agen() {
    }

    public static zyd a(afeq afeqVar, Object obj) {
        agei ageiVar = new agei(afeqVar);
        b(afeqVar, obj, new agem(ageiVar));
        return ageiVar;
    }

    public static void b(afeq afeqVar, Object obj, agej agejVar) {
        c(afeqVar, agejVar);
        try {
            afeqVar.e(obj);
            afeqVar.c();
        } catch (Error | RuntimeException e) {
            throw d(afeqVar, e);
        }
    }

    public static void c(afeq afeqVar, agej agejVar) {
        afeqVar.a(agejVar, new afih());
        agejVar.e();
    }

    private static RuntimeException d(afeq afeqVar, Throwable th) {
        try {
            afeqVar.b(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }
}

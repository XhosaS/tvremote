package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afkd extends affo {
    private static final Logger b = Logger.getLogger(afkd.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.affo
    public final affp a() {
        affp affpVar = (affp) a.get();
        return affpVar == null ? affp.d : affpVar;
    }

    @Override // defpackage.affo
    public final affp b(affp affpVar) {
        affp affpVarA = a();
        a.set(affpVar);
        return affpVarA;
    }

    @Override // defpackage.affo
    public final void c(affp affpVar, affp affpVar2) {
        if (a() != affpVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (affpVar2 != affp.d) {
            a.set(affpVar2);
        } else {
            a.set(null);
        }
    }
}

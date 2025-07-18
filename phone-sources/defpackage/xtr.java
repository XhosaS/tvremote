package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xtr extends xqn {
    private static final Logger b = Logger.getLogger(xtr.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.xqn
    public final xqo a() {
        xqo xqoVar = (xqo) a.get();
        return xqoVar == null ? xqo.b : xqoVar;
    }

    @Override // defpackage.xqn
    public final xqo b(xqo xqoVar) {
        xqo xqoVarA = a();
        a.set(xqoVar);
        return xqoVarA;
    }

    @Override // defpackage.xqn
    public final void c(xqo xqoVar, xqo xqoVar2) {
        if (a() != xqoVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (xqoVar2 != xqo.b) {
            a.set(xqoVar2);
        } else {
            a.set(null);
        }
    }
}

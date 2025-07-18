package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yez {
    static final boolean a;
    static final xpx b;
    private static final Logger c = Logger.getLogger(yez.class.getName());

    static {
        boolean z = false;
        if (!sij.F(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z = true;
        }
        a = z;
        b = new xpx("internal-stub-type", null);
    }

    private yez() {
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(defpackage.xpz r3, defpackage.xsq r4, defpackage.xpy r5, java.lang.Object r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yez.a(xpz, xsq, xpy, java.lang.Object):java.lang.Object");
    }

    private static RuntimeException b(xqb xqbVar, Throwable th) {
        try {
            xqbVar.c(null, th);
        } catch (Error | RuntimeException e) {
            c.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void c(xqb xqbVar, Object obj, yew yewVar) {
        xqbVar.a(yewVar, new xsm());
        yewVar.a.a.e(2);
        try {
            xqbVar.f(obj);
            xqbVar.d();
        } catch (Error | RuntimeException e) {
            throw b(xqbVar, e);
        }
    }
}

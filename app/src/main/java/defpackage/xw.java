package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xw {
    public static final Object a(zyd zydVar, agsw agswVar) throws Throwable {
        try {
            if (zydVar.isDone()) {
                return xn.b(zydVar);
            }
            ahar aharVar = new ahar(agth.c(agswVar), 1);
            aharVar.z();
            zydVar.d(new xy(zydVar, aharVar), xu.a);
            aharVar.a(new xv(zydVar));
            return aharVar.m();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}

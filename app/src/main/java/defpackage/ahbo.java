package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbo {
    public static final Throwable a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        agox.a(runtimeException, th);
        return runtimeException;
    }

    public static final void b(agte agteVar, Throwable th) {
        if (th instanceof ahcg) {
            th = ((ahcg) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) agteVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(agteVar, th);
            } else {
                ahla.a(agteVar, th);
            }
        } catch (Throwable th2) {
            ahla.a(agteVar, a(th, th2));
        }
    }
}

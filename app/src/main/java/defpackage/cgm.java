package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgm {
    public static final String a = cbx.d("WorkerWrapper");

    public static final Object a(zyd zydVar, cbv cbvVar, agsw agswVar) throws Throwable {
        try {
            if (zydVar.isDone()) {
                return b(zydVar);
            }
            ahar aharVar = new ahar(agth.c(agswVar), 1);
            aharVar.z();
            zydVar.d(new cek(zydVar, aharVar), cbe.a);
            aharVar.a(new cgl(cbvVar, zydVar));
            return aharVar.m();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}

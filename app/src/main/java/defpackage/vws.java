package defpackage;

import java.lang.Thread;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vws extends agsq implements CoroutineExceptionHandler {
    public static final vws a = new vws();

    private vws() {
        super(CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(agte agteVar, Throwable th) {
        agteVar.getClass();
        th.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
        uncaughtExceptionHandler.getClass();
        uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
    }
}
